package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_insert")
public class InsertQuiz02 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// request params
		String siteName = request.getParameter("siteName");
		String siteAddress = request.getParameter("siteAddress");
		
		// db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// insert 쿼리 수행
		String insertQuery  = "insert into `bookmark`"
				+ "(`name`, `url`)"
				+ "values"
				+ "('" + siteName + "', '" + siteAddress + "')";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db 연결 해제
		ms.disconnect();
		
		// 목록 화면 이동 Redirect
		response.sendRedirect("/lesson03/quiz02.jsp");
	}
}
