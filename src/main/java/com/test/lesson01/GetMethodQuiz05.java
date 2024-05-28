package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz05")
public class GetMethodQuiz05 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		// request params(파라미터)
		int num = Integer.valueOf(request.getParameter("number"));
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>구구단 결과</title></head><body>");
		out.print("<ul>");
		for(int i = 1; i <= 9; i++) {
			out.println("<li>" + num + " x " + i + " = " + (num * i) + "</li>");
		}
		out.print("</ul></body></html>");
	}

}
