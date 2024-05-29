<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz01</title>
</head>
<body>

	<%! // 1번
		public int sum(int end) {
			int sum = 0;
			for (int i = 0; i <= end; i++) {
				sum += i;
			}
			return sum;
		}	
	%>
	<h2>
	1부터 50까지의 합은 <%= sum(50) %>입니다.
	</h2>

	<% // 2번
		int[] scores = {81, 90, 100, 95, 80};
		double average = 0;
		for (int i = 0; i < scores.length; i++) {
			average += scores[i];
		}
		average = (double)average / scores.length;
	%>
	<h2>
	평균 점수는 <%= average %> 입니다
	</h2>
	
	<% // 3번
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int count = 0;
		Iterator<String> iter = scoreList.iterator();
		while (iter.hasNext()) {
			String score = iter.next();
			if (score.equals("O")) {
				count += 10;
			}
		}
	%>
	<h2>
	채점 결과는 <%= count%>점입니다
	</h2>
	
	<% // 4번
		String birthDay = "20010820";
		int birth = Integer.parseInt(birthDay.substring(0, 4));
		int age = 2024 - birth;
	%>
	<h2>
	<%= Integer.parseInt(birthDay)%>의 나이는 <%= age%>세입니다
	</h2>
	
</body>
</html>