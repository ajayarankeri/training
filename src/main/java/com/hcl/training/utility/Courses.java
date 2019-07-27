package com.hcl.training.utility;

public enum Courses {
	JAVA("java"), ANGULAR("angular"), SPRINGCLOUD("springcloud"), AWS("aws");
	private String value;
	private Courses(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getValue() {
		return this.value;
	}
}
