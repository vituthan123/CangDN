package com.tvhung.quanlycang.model;

public class Pair<T, U> {
	private T left;
	private U right;

	public Pair() {
		super();
	}

	public Pair(T left, U right) {
		super();
		this.left = left;
		this.right = right;
	}

	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public U getRight() {
		return right;
	}

	public void setRight(U right) {
		this.right = right;
	}
}
