package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 한글 깨짐 방지 -- 항상 위쪽에 써주는게 좋다
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		// 출력
		PrintWriter out = response.getWriter();		
		// 날짜
		Date now = new Date();
		
		// formatter
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 dd일");
		out.print(sdf.format(now));
		
	}
}
