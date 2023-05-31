<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <!-- CSS only -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
                crossorigin="anonymous">
        </head>

        <body>
            <div class="container">
                <h1>성적 조회</h1>
                <table class="table table-bordered">
                    <tr>
                        <th class="table-light">학번</th>
                        <td>${score.studentNumber}</td>
                        <th class="table-light">이름</th>
                        <td>${score.name}</td>
                    </tr>
                    <tr class="table-light">
                        <th colspan="2">교과목명</th>
                        <th colspan="2">성적</th>
                    </tr>
                    <tr>
                        <td colspan="2">국어</td>
                        <td colspan="2">${score.korScore}</td>
                    </tr>
                    <tr>
                        <td colspan="2">영어</td>
                        <td colspan="2">${score.engScore}</td>
                    </tr>
                    <tr>
                        <td colspan="2">수학</td>
                        <td colspan="2">${score.mathScore}</td>
                    </tr>
                    <tr>
                        <th class="table-light">총합</th>
                        <td>${score.korScore+score.engScore+score.mathScore}</td>
                        <th class="table-light">평균</th>
                        <td>${(score.korScore+score.engScore+score.mathScore)/3}</td>
                    </tr>
                </table>
                <div class="position-relative">
                    <div class="position-absolute top-0 start-0">
                        <button type="button" class="btn btn-outline-secondary"
                            onclick="location.href='/score/list'">돌아가기</button>
                    </div>
                    <div class="position-absolute top-0 end-0">
                        <form action="/score/remove?studentNumber=${score.studentNumber}" method="POST">
                            <button type="submit" class="btn btn-outline-danger">삭제</button>
                        </form>
                    </div>
                </div>
        </body>

        </html>