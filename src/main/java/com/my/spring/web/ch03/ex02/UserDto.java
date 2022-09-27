package com.my.spring.web.ch03.ex02;
// Client 통신용, file의 바이너리 정보를 주고 받는다.
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserDto {
	private String userName;
	private int age;
	private MultipartFile face;
}
