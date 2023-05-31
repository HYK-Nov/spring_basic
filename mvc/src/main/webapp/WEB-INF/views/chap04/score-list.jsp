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
                <h1>전체 학생 성적 목록</h1>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">학번</th>
                            <th scope="col">이름</th>
                            <th scope="col">국어</th>
                            <th scope="col">영어</th>
                            <th scope="col">수학</th>
                            <th scope="col">총점</th>
                            <th scope="col">평균</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="score" items="${scoreList}">
                            <tr onclick="location.href='/score/detail?studentNumber=${score.studentNumber}'">
                                <th scope="row">${score.studentNumber}</th>
                                <td>${score.name}</td>
                                <td>${score.korScore}</td>
                                <td>${score.engScore}</td>
                                <td>${score.mathScore}</td>
                                <td>${score.korScore+score.engScore+score.mathScore}</td>
                                <td>${(score.korScore+score.engScore+score.mathScore)/3}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table><!-- 성적 table 종료 -->
                <hr>
                <h1>성적 등록 폼</h1>
                <!-- /score/regitster <- 맨 앞 /의 의미: 기본 서버 주소(http://localhost:8080/)
                위와 같이 적을 경우 인식주소: http://localhost:8080/score/register -->
                <form action="/score/register" method="POST">
                    <div class="mb-3">
                        <label for="user-name" class="form-label">유저 이름</label>
                        <input type="text" class="form-control" id="user-name" name="name">
                    </div>
                    <div class="mb-3">
                        <label for="user-kor" class="form-label">국어 성적</label>
                        <input type="number" class="form-control" id="user-kor" name="korScore" min="0">
                    </div>
                    <div class="mb-3">
                        <label for="user-eng" class="form-label">영어 성적</label>
                        <input type="number" class="form-control" id="user-eng" name="engScore" min="0">
                    </div>
                    <div class="mb-3">
                        <label for="user-math" class="form-label">수학 성적</label>
                        <input type="number" class="form-control" id="user-math" name="mathScore" min="0">
                    </div>
                    <button type="submit" class="btn btn-primary">등록</button>
                </form>
            </div>
        </body>

        </html>