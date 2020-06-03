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
<body>
    <form name="addingform" action="/COMMERCIAL_PROPOSAL_war_exploded/adding" method="POST">
        <input type="hidden" id="jsondoorposition" name="jsondoorposition">
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
                        <input type="number" min="1" value="1" name="sumpos" /> шт
                    </fieldset>
                </td>
                <td align="center">
                    <input type="submit" class="button" value="Добавить в КП" onclick="createStringJson()">
                </td>
            </tr>
        </table>
        <a href="index" class="button">На главную страницу</a>
    </form>
</body>
</html>
<script type="text/javascript">
    function createStringJson() {

        var width = document.forms["addingform"]["width"].value;
        var height = document.forms["addingform"]["height"].value;
        var type = document.forms["addingform"]["type"].value;
        var open = document.forms["addingform"]["open"].value;
        var doorstep = document.forms["addingform"]["doorstep"].value;
        var assembl = document.forms["addingform"]["assembl"].value;
        var fill = document.forms["addingform"]["fill"].value;
        var hole = document.forms["addingform"]["hole"].value;
        var fitt = document.forms["addingform"]["fitt"].value;
        var paint = document.forms["addingform"]["paint"].value;
        var doortrim = document.forms["addingform"]["doortrim"].value;
        var twodoorleafs = document.forms["addingform"]["twodoorleafs"].value;
        var sumpos = document.forms["addingform"]["sumpos"].value;

        var jsonObject = {
            "width": width,
            "height": height,
            "type": type,
            "open": open,
            "doorstep": doorstep,
            "assembl": assembl,
            "fill": fill,
            "hole": hole,
            "fitt": fitt,
            "paint": paint,
            "doortrim": doortrim,
            "twodoorleafs": twodoorleafs,
            "sumpos": sumpos
        }

        var jsonString = JSON.stringify(jsonObject);

        document.getElementById('jsondoorposition').value = jsonString;

    }
</script>