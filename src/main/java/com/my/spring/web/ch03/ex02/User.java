package com.my.spring.web.ch03.ex02;
//DB 통신용, file의 이름을 주고 받는다.
import lombok.Data;

@Data
public class User {
	private String userName;
	private int age;
	private String faceFilename;
}
