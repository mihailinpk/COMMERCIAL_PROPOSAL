<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Добавить позицию</title>
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
<body>
    <form action="/COMMERCIAL_PROPOSAL_war_exploded/adding" method="GET">
        <table class="table_price" align="center" width="100%">
            <caption>Добавить новую позицию в коммерческое предложение</caption>
            <tr>
                <td>
                    <fieldset align="center">
                        <legend>Ширина:</legend>
                        <input type="number" min="400" max="1500" value="400" name="width" /> мм
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Высота:</legend>
                        <input type="number" min="600" max="2500" value="600" name="height" /> мм
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Тип</legend>
                        ДГ <input type="radio" name="type" value="opt1" checked>
                        ДН <input type="radio" name="type" value="opt2">
                        ДО <input type="radio" name="type" value="opt3">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Открывание</legend>
                        Правое <input type="radio" name="open" value="opt1" checked>
                        Левое <input type="radio" name="open" value="opt2">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Порог</legend>
                        Есть <input type="radio" name="doorstep" value="opt1" checked>
                        Нет <input type="radio" name="doorstep" value="opt2">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Сборка</legend>
                        Есть <input type="radio" name="assembl" value="opt1" checked>
                        Нет <input type="radio" name="assembl" value="opt2">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Заполнение</legend>
                        Сотовое <input type="radio" name="fill" value="opt1" checked>
                        Реечное <input type="radio" name="fill" value="opt2">
                    </fieldset>
                </td>
            </tr>
            <tr>
                <td>
                    <fieldset align="center">
                        <legend>Отверстие п/с</legend>
                        Нет <input type="radio" name="hole" value="opt1" checked>
                        Есть <input type="radio" name="hole" value="opt2">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Фурнитура</legend>
                        Нет <input type="radio" name="fitt" value="opt1" checked>
                        ЗЩ 2-01 <input type="radio" name="fitt" value="opt2">
                        ЗВ 4-0-03 <input type="radio" name="fitt" value="opt3">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Окраска</legend>
                        Нет <input type="radio" name="paint" value="opt1" checked>
                        Грунтовка <input type="radio" name="paint" value="opt2">
                        НЭ цвет RAL <input type="radio" name="paint" value="opt3">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Наличник</legend>
                        Нет <input type="radio" name="doortrim" value="opt1" checked>
                        60мм <input type="radio" name="doortrim" value="opt2">
                        90мм <input type="radio" name="doortrim" value="opt3">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Двупольный</legend>
                        Нет <input type="radio" name="twodoorleafs" value="opt1" checked>
                        Полуторный <input type="radio" name="twodoorleafs" value="opt2">
                        Равнопольный <input type="radio" name="twodoorleafs" value="opt3">
                    </fieldset>
                </td>
                <td>
                    <fieldset align="center">
                        <legend>Количество ДБ в позиции:</legend>
                        <input type="number" min="1" value="1" name="sumpos" /> шт
                    </fieldset>
                </td>
                <td align="center">
                    <input type="submit" class="button" value="Добавить в КП">
                </td>
            </tr>
        </table>
        <a href="index" class="button">На главную страницу</a>
    </form>
</body>
</html>