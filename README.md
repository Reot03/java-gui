<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적</title>
</head>
<body>

<%
int score[][] = {
    {86,79,65,98,60},
    {45,67,58,87,83},
    {79,83,89,67,98},
    {97,99,98,83,88},
    {67,54,72,54,52}
};

double[] avg = new double[5];
String[] grades = new String[5];

// 평균 + 학점 계산
for (int i = 0; i < score.length; i++) {
    int sum = 0;

    for (int j = 0; j < score[i].length; j++) {
        sum += score[i][j];
    }

    avg[i] = sum / 5.0;

    if (avg[i] >= 90) grades[i] = "A";
    else if (avg[i] >= 80) grades[i] = "B";
    else if (avg[i] >= 70) grades[i] = "C";
    else if (avg[i] >= 60) grades[i] = "D";
    else grades[i] = "F";
}
%>

<h3>4. 학생별 평균 구하기</h3>

<%
for (int i = 0; i < avg.length; i++) {
%>
    학생<%= i+1 %>의 평균 : <%= avg[i] %><br>
<%
}
%>

<h3>5. 학생별 학점 출력하기</h3>

<%
for (int i = 0; i < grades.length; i++) {
%>
    학생<%= i+1 %>의 학점 : <%= grades[i] %><br>
<%
}
%>

</body>
</html>
