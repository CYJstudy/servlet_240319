package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// response header setting
		response.setContentType("text/html");
		
		// request params
		String name = request.getParameter("name");
		String Introduce = request.getParameter("Introduce");
		
		// 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head>입사지원서<title></title></head><body>");
		out.print(name + "님 지원이 완료되었습니다.<br>");
		out.print("<p><h4>지원 내용</h4></p>");
		out.print(Introduce);
		out.print("</body></html>");
	}
}








