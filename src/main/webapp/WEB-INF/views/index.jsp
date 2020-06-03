<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Главный экран</title>
    <style type="text/css">
        a.button {
            color: #fff;
            text-decoration: none;
            font-size: 20px;
            user-select: none;
            background: #F79361;
            padding: .3em 0.5em;
            outline: none;
            margin: 10px 2px 0px;
            float: right;
        }
        a.button:hover { background: rgb(232,95,76); }
        a.button:active { background: rgb(152,15,0); }
    </style>
    <style type="text/css">
        .table_price {
            border-collapse: collapse;
            border-left: 3px solid #F79361;
            border-right: 3px solid #F79361;
            border-bottom: 3px solid #F79361;
            font-family: "Lucida Grande", sans-serif;
            margin: 0px 0px 0px;
        }
        .table_price caption {
            background: #F79361;
            border-top-left-radius: 10px;
            border-top-right-radius: 10px;
            padding: 10px;
            box-shadow: 0 2px  4px 0 rgba(0,0,0,.3);
            color: white;
            font-family: "Roboto Slab",serif;
            font-style: normal;
            font-size: 26px;
            text-align: center;
            margin: 0px 0px 0px;
        }
        .table_price td, .table_price th {
            padding: 9px;
        }
        .table_price th {
            text-align: left;
            font-size: 14px;
        }
        .table_price tr:nth-child(2n) {
            background: #E5E5E5;
        }
        .table_price td:last-of-type {
            text-align: center;
        }
        .table_price a {
            color: #fff;
            text-decoration: none;
            user-select: none;
            background: #F79361;
            padding: .3em 0.5em;
            outline: none;
        }
        .table_price a:hover { background: rgb(232,95,76);
        }
        a:active {
            background: rgb(152,15,0);
        }
    </style>
    <script type="text/javascript">
        function postToUrl(path, params, method) {

            method = method || "post";
            var form = document.createElement("form");
            form.setAttribute("method", method);
            form.setAttribute("action", path);
            for(var key in params) {
                var hiddenField = document.createElement("input");
                hiddenField.setAttribute("type", "hidden");
                hiddenField.setAttribute("name", key);
                hiddenField.setAttribute("value", params[key]);

                form.appendChild(hiddenField);
            }
            document.body.appendChild(form);
            form.submit();

        }
    </script>
</head>
<body>
<table class="table_price" align="center" width="100%">
    <caption>Коммерческое предложение по дверным блокам</caption>
    <tr>
        <th>ШИРИНА ПОЛОТНА, мм</th>
        <th>ВЫСОТА ПОЛОТНА, мм</th>
        <th>ТИП</th>
        <th>ОТКРЫВАНИЕ</th>
        <th>ПОРОГ</th>
        <th>СБОРКА</th>
        <th>ЗАПОЛНЕНИЕ</th>
        <th>ОТВЕРСТИЕ П/С</th>
        <th>ФУРНИТУРА</th>
        <th>ОКРАСКА</th>
        <th>НАЛИЧНИК</th>
        <th>ДВУПОЛЬНЫЙ</th>
        <th>КОЛИЧЕСТВО, шт.</th>
        <th>СТОИМОСТЬ, руб</th>
        <th></th>
    </tr>
    <c:forEach var="doorposition" items="${listCurrentCommercialProposal}">
        <tr>
            <td>${doorposition.sizeWidth}</td>
            <td>${doorposition.sizeHeigth}</td>
            <td>${doorposition.type}</td>
            <td>${doorposition.open}</td>
            <td>${doorposition.doorStep}</td>
            <td>${doorposition.assmbl}</td>
            <td>${doorposition.fill}</td>
            <td>${doorposition.hole}</td>
            <td>${doorposition.fitt}</td>
            <td>${doorposition.paint}</td>
            <td>${doorposition.doorTrim}</td>
            <td>${doorposition.twoDoorLeafs}</td>
            <td>${doorposition.sum}</td>
            <td>${doorposition.totalPrice}</td>
            <td><a href="#" onclick="postToUrl('delete/', {'id':'${doorposition.id}'}, 'POST');">Удалить</a></td>
        </tr>
    </c:forEach>
    <tr>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th>Общие:</th>
        <th>${totalNumberOfDoors}</th>
        <th>${generalDoorPrice}</th>
        <th></th>
    </tr>
</table>
<a href="settings" class="button">На экран настроек</a>
<a href="addposition" class="button">Добавить позицию</a>
</body>
</html>