package com.tyss.rb.response;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class AppResponse {
	private String message;
	private Integer status;
	private Boolean error;
	private Object data;

}
