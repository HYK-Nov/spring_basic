<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>${title} </title>
        </head>

        <body>
            <h1>${title}</h1>
            <form action="http://localhost:8080/chap03/foodorder" method="POST">
                주문자명: <input type="text" name="ordName"><br />
                주문테이블번호: <input type="number" name="ordNum"><br />
                주문할 음식: <input type="text" name="ordFood"><br />
                <input type="submit" value="ENTER">
            </form>
        </body>

        </html>