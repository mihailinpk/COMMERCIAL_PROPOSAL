<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Настройки</title>
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
        .table_price_two {
            border-collapse: collapse;
            border-left: 3px solid #F79361;
            border-right: 3px solid #F79361;
            border-bottom: 3px solid #F79361;
            font-family: "Lucida Grande", sans-serif;
            margin: 0px 0px 0px;
        }
        .table_price_two caption {
            background: #F79361;
            border-top-left-radius: 0px;
            border-top-right-radius: 0px;
            padding: 10px;
            box-shadow: 0 2px  4px 0 rgba(0,0,0,.3);
            color: white;
            font-family: "Roboto Slab",serif;
            font-style: normal;
            font-size: 26px;
            text-align: center;
            margin: 0px 0px 0px;
        }
        .table_price_two td, .table_price th {
            padding: 9px;
        }
        .table_price_two th {
            text-align: left;
            font-size: 14px;
        }
        .table_price_two td:last-of-type {
            text-align: center;
        }
        .table_price_two a {
            color: #fff;
            text-decoration: none;
            user-select: none;
            background: #F79361;
            padding: .3em 0.5em;
            outline: none;
        }
        .table_price_two a:hover { background: rgb(232,95,76);
        }
        a:active {
            background: rgb(152,15,0);
        }
    </style>
</head>
<body onload="parseStringJson()">
<form name="setSettingsForm" action="/COMMERCIAL_PROPOSAL_war_exploded/setsettings" method="POST">
    <input type="hidden" id="jsondoorpricetoserver" name="jsondoorpricetoserver"/>
    <table class="table_price" align="center" width="100%">
        <caption>Цены за 1 шт.</caption>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Реечное стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafreech" /> руб.</p>
                    <p><div id="priceleafreechtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafreechnonstandartheigth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartheigthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafreechnonstandartwidth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafreechnonstandartheigthwidth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartheigthwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafsot" /> руб.</p>
                    <p><div id="priceleafsottext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafsotnonstandartheigth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartheigthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafsotnonstandartwidth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartwidthtext"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceleafsotnonstandartheigthwidth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartheigthwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoorframe" /> руб.</p>
                    <p><div id="pricedoorframetext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки н/ст</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoorframenonstandart" /> руб.</p>
                    <p><div id="pricedoorframenonstandarttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сборка</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceassmbl" /> руб.</p>
                    <p><div id="priceassmbltext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Отверстие под стекло</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricehole" /> руб.</p>
                    <p><div id="priceholetext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Врезка фурнитуры</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="priceinsert" /> руб.</p>
                    <p><div id="priceinserttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Ручка-защелка ЗЩ 2-01</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricezch201" /> руб.</p>
                    <p><div id="pricezch201text"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Замок ЗВ 4</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricezv4" /> руб.</p>
                    <p><div id="pricezv4text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Покрытие грунтовкой</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricepaintgrunt" /> руб.</p>
                    <p><div id="pricepaintgrunttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Окраска н/э цвет RAL</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricepaintral" /> руб.</p>
                    <p><div id="pricepaintraltext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoortrim60mm" /> руб.</p>
                    <p><div id="pricedoortrim60mmtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoortrim60mmnonstandart" /> руб.</p>
                    <p><div id="pricedoortrim60mmnonstandarttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoortrim90mm" /> руб.</p>
                    <p><div id="pricedoortrim90mmtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="pricedoortrim90mmnonstandart" /> руб.</p>
                    <p><div id="pricedoortrim90mmnonstandarttext"/></p>
                </fieldset>
            </td>
        </tr>
    </table>
    <table class="table_price_two" align="center" width="100%">
        <caption>Надбавка за общее количество дверных блоков</caption>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Общее количество до 10 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennum10" /> руб.</p>
                    <p><div id="surchgennum10text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 11 до 20 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennumfr11to20" /> руб.</p>
                    <p><div id="surchgennumfr11to20text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 21 до 50 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennumfr21to50" /> руб.</p>
                    <p><div id="surchgennumfr21to50text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 51 до 100 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennumfr51to100" /> руб.</p>
                    <p><div id="surchgennumfr51to100text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 101 до 1000 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennumgr101to1000" /> руб.</p>
                    <p><div id="surchgennumgr101to1000text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 1000 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" name="surchgennum1000" /> руб.</p>
                    <p><div id="surchgennum1000text"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="6" align="center">
                <input type="submit" class="button" value="Применить новые настройки" onclick="createStringJson()">
            </td>
        </tr>
    </table>
    <a href="index" class="button">На главную страницу</a>
</form>
</body>
</html>
<script type="text/javascript">
    function createStringJson() {
        var priceleafreech = document.forms["setSettingsForm"]["priceleafreech"].value;
        var priceleafreechnonstandartheigth = document.forms["setSettingsForm"]["priceleafreechnonstandartheigth"].value;
        var priceleafreechnonstandartwidth = document.forms["setSettingsForm"]["priceleafreechnonstandartwidth"].value;
        var priceleafreechnonstandartheigthwidth = document.forms["setSettingsForm"]["priceleafreechnonstandartheigthwidth"].value;
        var priceleafsot = document.forms["setSettingsForm"]["priceleafsot"].value;
        var priceleafsotnonstandartheigth = document.forms["setSettingsForm"]["priceleafsotnonstandartheigth"].value;
        var priceleafsotnonstandartwidth = document.forms["setSettingsForm"]["priceleafsotnonstandartwidth"].value;
        var priceleafsotnonstandartheigthwidth = document.forms["setSettingsForm"]["priceleafsotnonstandartheigthwidth"].value;
        var pricedoorframe = document.forms["setSettingsForm"]["pricedoorframe"].value;
        var pricedoorframenonstandart = document.forms["setSettingsForm"]["pricedoorframenonstandart"].value;
        var priceassmbl = document.forms["setSettingsForm"]["priceassmbl"].value;
        var pricehole = document.forms["setSettingsForm"]["pricehole"].value;
        var priceinsert = document.forms["setSettingsForm"]["priceinsert"].value;
        var pricezch201 = document.forms["setSettingsForm"]["pricezch201"].value;
        var pricezv4 = document.forms["setSettingsForm"]["pricezv4"].value;
        var pricepaintgrunt = document.forms["setSettingsForm"]["pricepaintgrunt"].value;
        var pricepaintral = document.forms["setSettingsForm"]["pricepaintral"].value;
        var pricedoortrim60mm = document.forms["setSettingsForm"]["pricedoortrim60mm"].value;
        var pricedoortrim60mmnonstandart = document.forms["setSettingsForm"]["pricedoortrim60mmnonstandart"].value;
        var pricedoortrim90mm = document.forms["setSettingsForm"]["pricedoortrim90mm"].value;
        var pricedoortrim90mmnonstandart = document.forms["setSettingsForm"]["pricedoortrim90mmnonstandart"].value;
        var surchgennum10 = document.forms["setSettingsForm"]["surchgennum10"].value;
        var surchgennumfr11to20 = document.forms["setSettingsForm"]["surchgennumfr11to20"].value;
        var surchgennumfr21to50 = document.forms["setSettingsForm"]["surchgennumfr21to50"].value;
        var surchgennumfr51to100 = document.forms["setSettingsForm"]["surchgennumfr51to100"].value;
        var surchgennumgr101to1000 = document.forms["setSettingsForm"]["surchgennumgr101to1000"].value;
        var surchgennum1000 = document.forms["setSettingsForm"]["surchgennum1000"].value;
        var jsonObject = {
            "priceleafreech": priceleafreech,
            "priceleafreechnonstandartheigth": priceleafreechnonstandartheigth,
            "priceleafreechnonstandartwidth": priceleafreechnonstandartwidth,
            "priceleafreechnonstandartheigthwidth": priceleafreechnonstandartheigthwidth,
            "priceleafsot": priceleafsot,
            "priceleafsotnonstandartheigth": priceleafsotnonstandartheigth,
            "priceleafsotnonstandartwidth": priceleafsotnonstandartwidth,
            "priceleafsotnonstandartheigthwidth": priceleafsotnonstandartheigthwidth,
            "pricedoorframe": pricedoorframe,
            "pricedoorframenonstandart": pricedoorframenonstandart,
            "priceassmbl": priceassmbl,
            "pricehole": pricehole,
            "priceinsert": priceinsert,
            "pricezch201": pricezch201,
            "pricezv4": pricezv4,
            "pricepaintgrunt": pricepaintgrunt,
            "pricepaintral": pricepaintral,
            "pricedoortrim60mm": pricedoortrim60mm,
            "pricedoortrim60mmnonstandart": pricedoortrim60mmnonstandart,
            "pricedoortrim90mm": pricedoortrim90mm,
            "pricedoortrim90mmnonstandart": pricedoortrim90mmnonstandart,
            "surchgennum10": surchgennum10,
            "surchgennumfr11to20": surchgennumfr11to20,
            "surchgennumfr21to50": surchgennumfr21to50,
            "surchgennumfr51to100": surchgennumfr51to100,
            "surchgennumgr101to1000": surchgennumgr101to1000,
            "surchgennum1000": surchgennum1000
        }
        var jsonString = JSON.stringify(jsonObject);
        document.getElementById('jsondoorpricetoserver').value = jsonString;
    }
    function parseStringJson() {
        jsonobj = JSON.parse(JSON.stringify(${jsonDoorPriceFromServer}));
        document.forms["setSettingsForm"]["priceleafreech"].value = jsonobj.priceLeafReech;
        document.getElementById("priceleafreechtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReech + ' руб.';
        document.forms["setSettingsForm"]["priceleafreechnonstandartheigth"].value = jsonobj.priceLeafReechNonStandartHeigth;
        document.getElementById("priceleafreechnonstandartheigthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartHeigth + ' руб.';
        document.forms["setSettingsForm"]["priceleafreechnonstandartwidth"].value = jsonobj.priceLeafReechNonStandartWidth;
        document.getElementById("priceleafreechnonstandartwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartWidth + ' руб.';
        document.forms["setSettingsForm"]["priceleafreechnonstandartheigthwidth"].value = jsonobj.priceLeafReechNonStandartHeigthWidth;
        document.getElementById("priceleafreechnonstandartheigthwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartHeigthWidth + ' руб.';
        document.forms["setSettingsForm"]["priceleafsot"].value = jsonobj.priceLeafSot;
        document.getElementById("priceleafsottext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSot + ' руб.';
        document.forms["setSettingsForm"]["priceleafsotnonstandartheigth"].value = jsonobj.priceLeafSotNonStandartHeigth;
        document.getElementById("priceleafsotnonstandartheigthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartHeigth + ' руб.';
        document.forms["setSettingsForm"]["priceleafsotnonstandartwidth"].value = jsonobj.priceLeafSotNonStandartWidth;
        document.getElementById("priceleafsotnonstandartwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartWidth + ' руб.';
        document.forms["setSettingsForm"]["priceleafsotnonstandartheigthwidth"].value = jsonobj.priceLeafSotNonStandartHeigthWidth;
        document.getElementById("priceleafsotnonstandartheigthwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartHeigthWidth + ' руб.';
        document.forms["setSettingsForm"]["pricedoorframe"].value = jsonobj.priceDoorFrame;
        document.getElementById("pricedoorframetext").innerHTML = 'Текущая: ' + jsonobj.priceDoorFrame + ' руб.';
        document.forms["setSettingsForm"]["pricedoorframenonstandart"].value = jsonobj.priceDoorFrameNonStandart;
        document.getElementById("pricedoorframenonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorFrameNonStandart + ' руб.';
        document.forms["setSettingsForm"]["priceassmbl"].value = jsonobj.priceAssmbl;
        document.getElementById("priceassmbltext").innerHTML = 'Текущая: ' + jsonobj.priceAssmbl + ' руб.';
        document.forms["setSettingsForm"]["pricehole"].value = jsonobj.priceHole;
        document.getElementById("priceholetext").innerHTML = 'Текущая: ' + jsonobj.priceHole + ' руб.';
        document.forms["setSettingsForm"]["priceinsert"].value = jsonobj.priceInsert;
        document.getElementById("priceinserttext").innerHTML = 'Текущая: ' + jsonobj.priceInsert + ' руб.';
        document.forms["setSettingsForm"]["pricezch201"].value = jsonobj.priceZch201;
        document.getElementById("pricezch201text").innerHTML = 'Текущая: ' + jsonobj.priceZch201 + ' руб.';
        document.forms["setSettingsForm"]["pricezv4"].value = jsonobj.priceZV4;
        document.getElementById("pricezv4text").innerHTML = 'Текущая: ' + jsonobj.priceZV4 + ' руб.';
        document.forms["setSettingsForm"]["pricepaintgrunt"].value = jsonobj.pricePaintGrunt;
        document.getElementById("pricepaintgrunttext").innerHTML = 'Текущая: ' + jsonobj.pricePaintGrunt + ' руб.';
        document.forms["setSettingsForm"]["pricepaintral"].value = jsonobj.pricePaintRAl;
        document.getElementById("pricepaintraltext").innerHTML = 'Текущая: ' + jsonobj.pricePaintRAl + ' руб.';
        document.forms["setSettingsForm"]["pricedoortrim60mm"].value = jsonobj.priceDoorTrim60mm;
        document.getElementById("pricedoortrim60mmtext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim60mm + ' руб.';
        document.forms["setSettingsForm"]["pricedoortrim60mmnonstandart"].value = jsonobj.priceDoorTrim60mmNonStandart;
        document.getElementById("pricedoortrim60mmnonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim60mmNonStandart + ' руб.';
        document.forms["setSettingsForm"]["pricedoortrim90mm"].value = jsonobj.priceDoorTrim90mm;
        document.getElementById("pricedoortrim90mmtext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim90mm + ' руб.';
        document.forms["setSettingsForm"]["pricedoortrim90mmnonstandart"].value = jsonobj.priceDoorTrim90mmNonStandart;
        document.getElementById("pricedoortrim90mmnonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim90mmNonStandart + ' руб.';
        document.forms["setSettingsForm"]["surchgennum10"].value = jsonobj.surchGenNum10;
        document.getElementById("surchgennum10text").innerHTML = 'Текущая: ' + jsonobj.surchGenNum10 + ' руб.';
        document.forms["setSettingsForm"]["surchgennumfr11to20"].value = jsonobj.surchGenNumFr11to20;
        document.getElementById("surchgennumfr11to20text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr11to20 + ' руб.';
        document.forms["setSettingsForm"]["surchgennumfr21to50"].value = jsonobj.surchGenNumFr21to50;
        document.getElementById("surchgennumfr21to50text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr21to50 + ' руб.';
        document.forms["setSettingsForm"]["surchgennumfr51to100"].value = jsonobj.surchGenNumFr51to100;
        document.getElementById("surchgennumfr51to100text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr51to100 + ' руб.';
        document.forms["setSettingsForm"]["surchgennumgr101to1000"].value = jsonobj.surchGenNumFr101to1000;
        document.getElementById("surchgennumgr101to1000text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr101to1000 + ' руб.';
        document.forms["setSettingsForm"]["surchgennum1000"].value = jsonobj.surchGenNum1000;
        document.getElementById("surchgennum1000text").innerHTML = 'Текущая: ' + jsonobj.surchGenNum1000 + ' руб.';
    }
</script>