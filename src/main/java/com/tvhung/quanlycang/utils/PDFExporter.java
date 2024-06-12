package com.tvhung.quanlycang.utils;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.tvhung.quanlycang.dto.DonHangDto;

public class PDFExporter {
	private List<DonHangDto> listDonHang;

	public PDFExporter(List<DonHangDto> listDonHang) {
		this.listDonHang = listDonHang;
	}

	private void writeTableHeader(PdfPTable table) throws DocumentException, IOException {
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);
		Font font = FontFactory.getFont(FontFactory.defaultEncoding);
		font.setColor(Color.WHITE);
		cell.setPhrase(new Paragraph("Mã đơn hàng", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Ngày tạo", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Tên người nhận", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("SDT người nhận", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Địa chỉ giao hàng", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Trọng lượng", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Thể tích", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Mô tả", font));
		table.addCell(cell);
		cell.setPhrase(new Paragraph("Trạng thái", font));
		table.addCell(cell);
	}

	private void writeTableData(PdfPTable table) {
		for (DonHangDto donHang : listDonHang) {
			table.addCell(String.valueOf(donHang.getId()));
			table.addCell(String.valueOf(donHang.getNgayTao()));
			table.addCell(donHang.getTenNguoiNhan());
			table.addCell(donHang.getSdtNguoiNhan());
			table.addCell(donHang.getDiaChiNguoiNhan());
			table.addCell(String.valueOf(donHang.getTrongLuong()));
			table.addCell(String.valueOf(donHang.getTheTich()));
			table.addCell(donHang.getMoTa());
			switch (donHang.getTrangThai()) {
			case 0:
				table.addCell("Chờ xử lý");
				break;
			case 1:
				table.addCell("Đã duyệt");
				break;
			case 2:
				table.addCell("Đang giao");
				break;
			case 3:
				table.addCell("Đã hoàn thành");
				break;
			}
		}
	}

	public void export(HttpServletResponse response) throws DocumentException, IOException {
		Document document = new Document(PageSize.A3.rotate());
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();
		Font font = FontFactory.getFont(FontFactory.defaultEncoding);
		font.setSize(18);
		font.setColor(Color.BLUE);
		Paragraph p = new Paragraph("Danh sách đơn hàng", font);
		p.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(p);
		PdfPTable table = new PdfPTable(9);
		table.setWidthPercentage(100f);
//		table.setWidths(new float[] { 1.5f, 3.5f, 3.0f, 3.0f, 1.5f });
		table.setSpacingBefore(10);
		writeTableHeader(table);
		writeTableData(table);
		document.add(table);
		document.close();
	}
}
