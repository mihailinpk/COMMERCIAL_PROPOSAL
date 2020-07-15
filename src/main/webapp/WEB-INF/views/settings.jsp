<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
    <input type="hidden" id="DoorPriceView" name="DoorPriceView"/>
    <table class="table_price" align="center" width="100%">
        <caption>Цены за 1 шт.</caption>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Реечное стандарт</legend>
                    <%--<p>Новая: <input type="number" min="0" max="150000" name="priceleafreech" /> руб.</p>--%>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafreech"/> руб.</p>
                    <p><div id="priceleafreechtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafreechnonstandartheigth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartheigthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafreechnonstandartwidth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafreechnonstandartheigthwidth" /> руб.</p>
                    <p><div id="priceleafreechnonstandartheigthwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafsot" /> руб.</p>
                    <p><div id="priceleafsottext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafsotnonstandartheigth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartheigthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafsotnonstandartwidth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartwidthtext"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceleafsotnonstandartheigthwidth" /> руб.</p>
                    <p><div id="priceleafsotnonstandartheigthwidthtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoorframe" /> руб.</p>
                    <p><div id="pricedoorframetext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки н/ст</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoorframenonstandart" /> руб.</p>
                    <p><div id="pricedoorframenonstandarttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сборка</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceassmbl" /> руб.</p>
                    <p><div id="priceassmbltext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Отверстие под стекло</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricehole" /> руб.</p>
                    <p><div id="priceholetext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Врезка фурнитуры</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="priceinsert" /> руб.</p>
                    <p><div id="priceinserttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Ручка-защелка ЗЩ 2-01</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricezch201" /> руб.</p>
                    <p><div id="pricezch201text"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Замок ЗВ 4</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricezv4" /> руб.</p>
                    <p><div id="pricezv4text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Покрытие грунтовкой</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricepaintgrunt" /> руб.</p>
                    <p><div id="pricepaintgrunttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Окраска н/э цвет RAL</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricepaintral" /> руб.</p>
                    <p><div id="pricepaintraltext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoortrim60mm" /> руб.</p>
                    <p><div id="pricedoortrim60mmtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoortrim60mmnonstandart" /> руб.</p>
                    <p><div id="pricedoortrim60mmnonstandarttext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoortrim90mm" /> руб.</p>
                    <p><div id="pricedoortrim90mmtext"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="pricedoortrim90mmnonstandart" /> руб.</p>
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
                    <p>Новая: <input type="number" min="0" max="150000" id="surchgennum10" /> руб.</p>
                    <p><div id="surchgennum10text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 11 до 20 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="surchgennumfr11to20" /> руб.</p>
                    <p><div id="surchgennumfr11to20text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 21 до 50 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="surchgennumfr21to50" /> руб.</p>
                    <p><div id="surchgennumfr21to50text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 51 до 100 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="surchgennumfr51to100" /> руб.</p>
                    <p><div id="surchgennumfr51to100text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 101 до 1000 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" id="surchgennumgr101to1000" /> руб.</p>
                    <p><div id="surchgennumgr101to1000text"/></p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 1000 шт.</legend>
                    <p>Новая: <input type="number" id="surchgennum1000" min="0" max="150000" id="surchgennum1000" /> руб.</p>
                    <p><div id="surchgennum1000text"/></p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="6" align="center">
                <input type="submit" class="button" value="Применить новые настройки" onclick="sendStringJson()">
            </td>
        </tr>
    </table>
    <a href="index" class="button">На главную страницу</a>
</body>
</html>
<script type="text/javascript">
    function sendStringJson() {
        var priceleafreech = document.getElementById("priceleafreech").value;
        var priceleafreechnonstandartheigth = document.getElementById("priceleafreechnonstandartheigth").value;
        var priceleafreechnonstandartwidth = document.getElementById("priceleafreechnonstandartwidth").value;
        var priceleafreechnonstandartheigthwidth = document.getElementById("priceleafreechnonstandartheigthwidth").value;
        var priceleafsot = document.getElementById("priceleafsot").value;
        var priceleafsotnonstandartheigth = document.getElementById("priceleafsotnonstandartheigth").value;
        var priceleafsotnonstandartwidth = document.getElementById("priceleafsotnonstandartwidth").value;
        var priceleafsotnonstandartheigthwidth = document.getElementById("priceleafsotnonstandartheigthwidth").value;
        var pricedoorframe = document.getElementById("pricedoorframe").value;
        var pricedoorframenonstandart = document.getElementById("pricedoorframenonstandart").value;
        var priceassmbl = document.getElementById("priceassmbl").value;
        var pricehole = document.getElementById("pricehole").value;
        var priceinsert = document.getElementById("priceinsert").value;
        var pricezch201 = document.getElementById("pricezch201").value;
        var pricezv4 = document.getElementById("pricezv4").value;
        var pricepaintgrunt = document.getElementById("pricepaintgrunt").value;
        var pricepaintral = document.getElementById("pricepaintral").value;
        var pricedoortrim60mm = document.getElementById("pricedoortrim60mm").value;
        var pricedoortrim60mmnonstandart = document.getElementById("pricedoortrim60mmnonstandart").value;
        var pricedoortrim90mm = document.getElementById("pricedoortrim90mm").value;
        var pricedoortrim90mmnonstandart = document.getElementById("pricedoortrim90mmnonstandart").value;
        var surchgennum10 = document.getElementById("surchgennum10").value;
        var surchgennumfr11to20 = document.getElementById("surchgennumfr11to20").value;
        var surchgennumfr21to50 = document.getElementById("surchgennumfr21to50").value;
        var surchgennumfr51to100 = document.getElementById("surchgennumfr51to100").value;
        var surchgennumgr101to1000 = document.getElementById("surchgennumgr101to1000").value;
        var surchgennum1000 = document.getElementById("surchgennum1000").value;
        var jsonObject = {
            "id":"0",
            "priceLeafReech": priceleafreech,
            "priceLeafReechNonStandartHeigth": priceleafreechnonstandartheigth,
            "priceLeafReechNonStandartWidth": priceleafreechnonstandartwidth,
            "priceLeafReechNonStandartHeigthWidth": priceleafreechnonstandartheigthwidth,
            "priceLeafSot": priceleafsot,
            "priceLeafSotNonStandartHeigth": priceleafsotnonstandartheigth,
            "priceLeafSotNonStandartWidth": priceleafsotnonstandartwidth,
            "priceLeafSotNonStandartHeigthWidth": priceleafsotnonstandartheigthwidth,
            "priceDoorFrame": pricedoorframe,
            "priceDoorFrameNonStandart": pricedoorframenonstandart,
            "priceAssmbl": priceassmbl,
            "priceHole": pricehole,
            "priceInsert": priceinsert,
            "priceZch201": pricezch201,
            "priceZV4": pricezv4,
            "pricePaintGrunt": pricepaintgrunt,
            "pricePaintRAl": pricepaintral,
            "priceDoorTrim60mm": pricedoortrim60mm,
            "priceDoorTrim60mmNonStandart": pricedoortrim60mmnonstandart,
            "priceDoorTrim90mm": pricedoortrim90mm,
            "priceDoorTrim90mmNonStandart": pricedoortrim90mmnonstandart,
            "surchGenNum10": surchgennum10,
            "surchGenNumFr11to20": surchgennumfr11to20,
            "surchGenNumFr21to50": surchgennumfr21to50,
            "surchGenNumFr51to100": surchgennumfr51to100,
            "surchGenNumFr101to1000": surchgennumgr101to1000,
            "surchGenNum1000": surchgennum1000
        }
        var jsonString = JSON.stringify(jsonObject);
        fetch('/COMMERCIAL_PROPOSAL_war_exploded/setsettings', {
            method: 'post',
            headers: {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json'
            },
            body: jsonString
        });
    }

    function parseStringJson() {
        jsonobj = JSON.parse(JSON.stringify(${jsonDoorPriceFromServer}));
        document.getElementById("priceleafreech").value = Number(jsonobj.priceLeafReech);
        document.getElementById("priceleafreechtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReech + ' руб.';
        document.getElementById("priceleafreechnonstandartheigth").value = Number(jsonobj.priceLeafReechNonStandartHeigth);
        document.getElementById("priceleafreechnonstandartheigthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartHeigth + ' руб.';
        document.getElementById("priceleafreechnonstandartwidth").value = Number(jsonobj.priceLeafReechNonStandartWidth);
        document.getElementById("priceleafreechnonstandartwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartWidth + ' руб.';
        document.getElementById("priceleafreechnonstandartheigthwidth").value = Number(jsonobj.priceLeafReechNonStandartHeigthWidth);
        document.getElementById("priceleafreechnonstandartheigthwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafReechNonStandartHeigthWidth + ' руб.';
        document.getElementById("priceleafsot").value = Number(jsonobj.priceLeafSot);
        document.getElementById("priceleafsottext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSot + ' руб.';
        document.getElementById("priceleafsotnonstandartheigth").value = Number(jsonobj.priceLeafSotNonStandartHeigth);
        document.getElementById("priceleafsotnonstandartheigthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartHeigth + ' руб.';
        document.getElementById("priceleafsotnonstandartwidth").value = Number(jsonobj.priceLeafSotNonStandartWidth);
        document.getElementById("priceleafsotnonstandartwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartWidth + ' руб.';
        document.getElementById("priceleafsotnonstandartheigthwidth").value = Number(jsonobj.priceLeafSotNonStandartHeigthWidth);
        document.getElementById("priceleafsotnonstandartheigthwidthtext").innerHTML = 'Текущая: ' + jsonobj.priceLeafSotNonStandartHeigthWidth + ' руб.';
        document.getElementById("pricedoorframe").value = Number(jsonobj.priceDoorFrame);
        document.getElementById("pricedoorframetext").innerHTML = 'Текущая: ' + jsonobj.priceDoorFrame + ' руб.';
        document.getElementById("pricedoorframenonstandart").value = Number(jsonobj.priceDoorFrameNonStandart);
        document.getElementById("pricedoorframenonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorFrameNonStandart + ' руб.';
        document.getElementById("priceassmbl").value = Number(jsonobj.priceAssmbl);
        document.getElementById("priceassmbltext").innerHTML = 'Текущая: ' + jsonobj.priceAssmbl + ' руб.';
        document.getElementById("pricehole").value = Number(jsonobj.priceHole);
        document.getElementById("priceholetext").innerHTML = 'Текущая: ' + jsonobj.priceHole + ' руб.';
        document.getElementById("priceinsert").value = Number(jsonobj.priceInsert);
        document.getElementById("priceinserttext").innerHTML = 'Текущая: ' + jsonobj.priceInsert + ' руб.';
        document.getElementById("pricezch201").value = Number(jsonobj.priceZch201);
        document.getElementById("pricezch201text").innerHTML = 'Текущая: ' + jsonobj.priceZch201 + ' руб.';
        document.getElementById("pricezv4").value = Number(jsonobj.priceZV4);
        document.getElementById("pricezv4text").innerHTML = 'Текущая: ' + jsonobj.priceZV4 + ' руб.';
        document.getElementById("pricepaintgrunt").value = Number(jsonobj.pricePaintGrunt);
        document.getElementById("pricepaintgrunttext").innerHTML = 'Текущая: ' + jsonobj.pricePaintGrunt + ' руб.';
        document.getElementById("pricepaintral").value = Number(jsonobj.pricePaintRAl);
        document.getElementById("pricepaintraltext").innerHTML = 'Текущая: ' + jsonobj.pricePaintRAl + ' руб.';
        document.getElementById("pricedoortrim60mm").value = Number(jsonobj.priceDoorTrim60mm);
        document.getElementById("pricedoortrim60mmtext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim60mm + ' руб.';
        document.getElementById("pricedoortrim60mmnonstandart").value = Number(jsonobj.priceDoorTrim60mmNonStandart);
        document.getElementById("pricedoortrim60mmnonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim60mmNonStandart + ' руб.';
        document.getElementById("pricedoortrim90mm").value = Number(jsonobj.priceDoorTrim90mm);
        document.getElementById("pricedoortrim90mmtext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim90mm + ' руб.';
        document.getElementById("pricedoortrim90mmnonstandart").value = Number(jsonobj.priceDoorTrim90mmNonStandart);
        document.getElementById("pricedoortrim90mmnonstandarttext").innerHTML = 'Текущая: ' + jsonobj.priceDoorTrim90mmNonStandart + ' руб.';
        document.getElementById("surchgennum10").value = Number(jsonobj.surchGenNum10);
        document.getElementById("surchgennum10text").innerHTML = 'Текущая: ' + jsonobj.surchGenNum10 + ' руб.';
        document.getElementById("surchgennumfr11to20").value = Number(jsonobj.surchGenNumFr11to20);
        document.getElementById("surchgennumfr11to20text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr11to20 + ' руб.';
        document.getElementById("surchgennumfr21to50").value = Number(jsonobj.surchGenNumFr21to50);
        document.getElementById("surchgennumfr21to50text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr21to50 + ' руб.';
        document.getElementById("surchgennumfr51to100").value = Number(jsonobj.surchGenNumFr51to100);
        document.getElementById("surchgennumfr51to100text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr51to100 + ' руб.';
        document.getElementById("surchgennumgr101to1000").value = Number(jsonobj.surchGenNumFr101to1000);
        document.getElementById("surchgennumgr101to1000text").innerHTML = 'Текущая: ' + jsonobj.surchGenNumFr101to1000 + ' руб.';
        document.getElementById("surchgennum1000").value = Number(jsonobj.surchGenNum1000);
        document.getElementById("surchgennum1000text").innerHTML = 'Текущая: ' + jsonobj.surchGenNum1000 + ' руб.';
    }
</script>