<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Настройки</title>
</head>
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
<body>
<form action="/COMMERCIAL_PROPOSAL_war_exploded/setsettings" method="GET">
    <table class="table_price" align="center" width="100%">
        <caption>Цены за 1 шт.</caption>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Реечное стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafReech}" name="priceleafreech" /> руб.</p>
                    <p>Текущая: ${priceLeafReech} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafReechNstHeigth}" name="priceleafreechnstheigth" /> руб.</p>
                    <p>Текущая: ${priceLeafReechNstHeigth} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafReechNstWidth}" name="priceleafreechnstwidth" /> руб.</p>
                    <p>Текущая: ${priceLeafReechNstWidth} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Реечное н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafReechNstHghtWdth}" name="priceleafreechnsthghtwdth" /> руб.</p>
                    <p>Текущая: ${priceLeafReechNstHghtWdth} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafSot}" name="priceleafsot" /> руб.</p>
                    <p>Текущая: ${priceLeafSot} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafSotNstHeigth}" name="priceleafsotnstheigth" /> руб.</p>
                    <p>Текущая: ${priceLeafSotNstHeigth} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafSotNstWidth}" name="priceleafsotnstwidth" /> руб.</p>
                    <p>Текущая: ${priceLeafSotNstWidth} руб.</p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Сотовое н/ст по ширине и высоте</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceLeafSotNstHghtWdth}" name="priceleafsotnsthghtwdth" /> руб.</p>
                    <p>Текущая: ${priceLeafSotNstHghtWdth} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки стандарт</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorFrame}" name="pricedoorframe" /> руб.</p>
                    <p>Текущая: ${priceDoorFrame} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка коробки н/ст</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorFrameNst}" name="pricedoorframenst" /> руб.</p>
                    <p>Текущая: ${priceDoorFrameNst} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Сборка</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceAssmbl}" name="priceassmbl" /> руб.</p>
                    <p>Текущая: ${priceAssmbl} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Отверстие под стекло</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceHole}" name="pricehole" /> руб.</p>
                    <p>Текущая: ${priceHole} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Врезка фурнитуры</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceInsert}" name="priceinsert" /> руб.</p>
                    <p>Текущая: ${priceInsert} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Ручка-защелка ЗЩ 2-01</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceZch201}" name="pricezch201" /> руб.</p>
                    <p>Текущая: ${priceZch201} руб.</p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset align="center">
                    <legend>Замок ЗВ 4</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceZV4}" name="pricezv4" /> руб.</p>
                    <p>Текущая: ${priceZV4} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Покрытие грунтовкой</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${pricePaintGrunt}" name="pricepaintgrunt" /> руб.</p>
                    <p>Текущая: ${pricePaintGrunt} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Окраска н/э цвет RAL</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${pricePaintRAl}" name="pricepaintral" /> руб.</p>
                    <p>Текущая: ${pricePaintRAl} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorTrim60mm}" name="pricedoortrim60mm" /> руб.</p>
                    <p>Текущая: ${priceDoorTrim60mm} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 60мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorTrim60mmNst}" name="pricedoortrim60mmnst" /> руб.</p>
                    <p>Текущая: ${priceDoorTrim60mmNst} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника стандарт 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorTrim90mm}" name="pricedoortrim90mm" /> руб.</p>
                    <p>Текущая: ${priceDoorTrim90mm} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Палка наличника н/ст 90мм</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${priceDoorTrim90mmNst}" name="pricedoortrim90mmnst" /> руб.</p>
                    <p>Текущая: ${priceDoorTrim90mmNst} руб.</p>
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
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNum10}" name="surchgennum10" /> руб.</p>
                    <p>Текущая: ${surchGenNum10} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 11 до 20 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNumFr11to20}" name="surchgennumfr11to20" /> руб.</p>
                    <p>Текущая: ${surchGenNumFr11to20} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 21 до 50 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNumFr21to50}" name="surchgennumfr21to50" /> руб.</p>
                    <p>Текущая: ${surchGenNumFr21to50} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 51 до 100 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNumFr51to100}" name="surchgennumfr51to100" /> руб.</p>
                    <p>Текущая: ${surchGenNumFr51to100} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 101 до 1000 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNumFr101to1000}" name="surchgennumgr101to1000" /> руб.</p>
                    <p>Текущая: ${surchGenNumFr101to1000} руб.</p>
                </fieldset>
            </td>
            <td>
                <fieldset align="center">
                    <legend>Общее количество от 1000 шт.</legend>
                    <p>Новая: <input type="number" min="0" max="150000" value="${surchGenNum1000}" name="surchgennum1000" /> руб.</p>
                    <p>Текущая: ${surchGenNum1000} руб.</p>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="6" align="center">
                <input type="submit" class="button" value="Применить новые настройки">
            </td>
        </tr>
    </table>
    <a href="index" class="button">На главную страницу</a>
</form>
</body>
</html>
