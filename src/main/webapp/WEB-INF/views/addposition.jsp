<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
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
            input.button {
                color: #fff;
                text-decoration: none;
                font-size: 20px;
                user-select: none;
                background: #F79361;
                padding: .3em 0.5em;
                outline: none;
                margin: 10px 2px 0px;
                float: bottom;
            }
            input.button:hover { background: rgb(232,95,76); }
            input.button:active { background: rgb(152,15,0); }

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
</head>
<script type="text/javascript">
    function sendStringJson() {
        var width = document.getElementById("width").value;
        var height = document.getElementById("height").value;
        var type = document.querySelector('input[name="type"]:checked').value;
        var open = document.querySelector('input[name="open"]:checked').value;
        var doorstep = document.querySelector('input[name="doorstep"]:checked').value;
        var assembl = document.querySelector('input[name="assembl"]:checked').value;
        var fill = document.querySelector('input[name="fill"]:checked').value;
        var hole = document.querySelector('input[name="hole"]:checked').value;
        var fitt = document.querySelector('input[name="fitt"]:checked').value;
        var paint = document.querySelector('input[name="paint"]:checked').value;
        var doortrim = document.querySelector('input[name="doortrim"]:checked').value;
        var twodoorleafs = document.querySelector('input[name="twodoorleafs"]:checked').value;
        var sumpos = document.getElementById("sumpos").value;
        var jsonObject = {
            "id":"0",
            "sizeWidth": width,
            "sizeHeigth": height,
            "type": type,
            "open": open,
            "doorStep": doorstep,
            "assembl": assembl,
            "fill": fill,
            "hole": hole,
            "fitt": fitt,
            "paint": paint,
            "doorTrim": doortrim,
            "twoDoorLeafs": twodoorleafs,
            "sum": sumpos,
            "totalPrice": "0"
        }
        var jsonString = JSON.stringify(jsonObject);
        fetch('/COMMERCIAL_PROPOSAL_war_exploded/adding', {
            method: 'post',
            headers: {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json'
            },
            body: jsonString
        }).then(function(response) {
            if (response.ok) {
                document.location.href = "index";
            }
        }).catch(function(error) {
            alert(error);
        });
    }
</script>
<body>
    <table class="table_price" align="center" width="100%">
        <caption>Добавить новую позицию в коммерческое предложение</caption>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Ширина:</legend>
                    <input type="number" min="400" max="1500" value="400" id="width" /> мм
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Высота:</legend>
                    <input type="number" min="600" max="2500" value="600" id="height" /> мм
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Тип</legend>
                    ДГ <input type="radio" name="type" value="DG" checked>
                    ДН <input type="radio" name="type" value="DN">
                    ДО <input type="radio" name="type" value="DO">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Открывание</legend>
                    Правое <input type="radio" name="open" value="RIGHT" checked>
                    Левое <input type="radio" name="open" value="LEFT">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Порог</legend>
                    Есть <input type="radio" name="doorstep" value="YES" checked>
                    Нет <input type="radio" name="doorstep" value="NO">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сборка</legend>
                    Есть <input type="radio" name="assembl" value="YES" checked>
                    Нет <input type="radio" name="assembl" value="NO">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Заполнение</legend>
                    Сотовое <input type="radio" name="fill" value="CELL" checked>
                    Реечное <input type="radio" name="fill" value="BLOCK">
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Отверстие п/с</legend>
                    Нет <input type="radio" name="hole" value="NO" checked>
                    Есть <input type="radio" name="hole" value="YES">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Фурнитура</legend>
                    Нет <input type="radio" name="fitt" value="NO" checked>
                    ЗЩ 2-01 <input type="radio" name="fitt" value="Z_SH_2_01">
                    ЗВ 4-3-03 <input type="radio" name="fitt" value="Z_V_4_3_03">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Окраска</legend>
                    Нет <input type="radio" name="paint" value="NO" checked>
                    Грунтовка <input type="radio" name="paint" value="GRUNT">
                    НЭ цвет RAL <input type="radio" name="paint" value="RAL">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Наличник</legend>
                    Нет <input type="radio" name="doortrim" value="NO" checked>
                    60мм <input type="radio" name="doortrim" value="d60_MM">
                    90мм <input type="radio" name="doortrim" value="d90_MM">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Двупольный</legend>
                    Нет <input type="radio" name="twodoorleafs" value="NO" checked>
                    Полуторный <input type="radio" name="twodoorleafs" value="ONE_AND_A_HALF">
                    Равнопольный <input type="radio" name="twodoorleafs" value="EQUALS">
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Количество ДБ в позиции:</legend>
                    <input type="number" min="1" value="1" id="sumpos" /> шт
                </fieldset>
            </td>
            <td align="center">
                <input type="submit" class="button" value="Добавить в КП" onclick="sendStringJson()">
            </td>
        </tr>
    </table>
    <a href="index" class="button">На главную страницу</a>
</body>
</html>