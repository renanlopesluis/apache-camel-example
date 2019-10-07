package com.apachecamelexample.enums;

import java.util.Arrays;
import java.util.Optional;

public enum IntegratorTypeEnum {
	ALL_FILES_INTEGRATOR(1), 
	SPECIFIC_FILE_NAME_INTEGRATOR(2),
	SPECIFIC_FILE_BODY_INTEGRATOR(3),
	FILE_READ_INTEGRATOR(4),
	MULTI_FILE_READ_INTEGRATOR(5);

	private Integer code;

	private IntegratorTypeEnum(Integer code) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	}

	public static Optional<IntegratorTypeEnum> getByCode(Integer code) {
		return Arrays.stream(values()).filter(x -> x.getCode().equals(code)).findFirst();
	}
}

	