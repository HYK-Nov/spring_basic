<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>catform</title>
        </head>

        <body>
            <h1>고양이 정보 등록하기</h1>
            <!-- 경로는 애매하면 전체 경로를 집어넣음 -->
            <form action="http://localhost:8080/chap01/cat" method="POST">
                고양이 이름: <input type="text" name="name"><br />
                고양이 나이: <input type="number" name="age"><br />
                고양이 품종: <input type="text" name="kind"><br />
                <input type="submit" value="제출">
            </form>
        </body>

        </html>