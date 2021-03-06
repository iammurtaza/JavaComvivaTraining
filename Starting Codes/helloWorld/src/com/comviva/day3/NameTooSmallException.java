package com.comviva.day3;

public class NameTooSmallException extends Exception{
	private String msg;
	public NameTooSmallException(){
		this.msg = "Name is too small, please check";
	}
	public NameTooSmallException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
	@Override
	public String toString() {
		return ":::::: " + msg + " ::::::";
	}
	
}
