package com.hcl.training.utility;

public enum Proficiency {

	NOVICE("novice"), BEGINER("beginer"), COMPTENT("comptent"), PROFICIENT("proficient");
	private String value;
	private Proficiency(String value) {
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
