<%-- 
    Document   : products
    Created on : Apr 10, 2024, 1:58:05 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<h1 class="text-center text-info mt-1">QUẢN TRỊ SẢN PHẨM</h1>

<c:url value="/products" var="action"/>
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <div class="form-floating mt-3 mb-3">
        <form:input type="text" class="form-control" path="name" id="name" placeholder="Tên sản phẩm" name="name"/> 
        <!--path la ten cot trong pojo-->
        <label for="name">Tên sản phẩm</label>
    </div>
    <div class="form-floating mt-3 mb-3">
        <form:input type="text" class="form-control" path="price" id="price" placeholder="Giá sản phẩm" name="price"/> 
        <!--path la ten cot trong pojo-->
        <label for="price">Giá sản phẩm</label>
    </div>
    <div class="form-floating">
        <form:select class="form-select" id="category" name="category" path="categoryId">
            <c:forEach items="${categories}" var="c">            
                <option id="${c.id}">${c.name}</option>
            </c:forEach>
        </form:select>
        <label for="sel1" class="form-label">Select list (select one):</label>
    </div>
        <div class="form-floating mt-3 mb-3">
            <form:input type="file" accept=".png, .jpg" class="form-control" path="price" id="file" name="file"/> 
            <label for="file">Ảnh sản phẩm</label>
        </div>
        <div>
            <button type="submit" class="btn btn-info">Thêm sản phẩm</button>
        </div>
</form:form>
