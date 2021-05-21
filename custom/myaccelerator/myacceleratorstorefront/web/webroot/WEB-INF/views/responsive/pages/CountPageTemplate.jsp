<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">

    <cms:pageSlot position="orderCount" var="feature">
        <cms:component component="${feature}" />
    </cms:pageSlot>

	<cms:pageSlot position="userCount" var="feature">
        	<cms:component component="${feature}" />
    </cms:pageSlot>

</template:page>
