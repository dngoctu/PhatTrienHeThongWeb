<%-- 
    Document   : index
    Created on : Mar 27, 2024, 1:11:45 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1 class="text-center text-info mt-1"> DANH MỤC SẢN PHẨM</h1>
<a href="<c:url value="/products" />" class="btn btn-success mb-1">Thêm sản phẩm</a>
<table class="table table-striped">
    <tr>
        <td></td>
        <td>ID</td>
        <td>Tên sản phẩm</td>
        <td>Giá sản phẩm</td>
        <td></td>
    </tr>                
    <c:forEach items="${products}" var="p">
        <tr>
            <td>                            
                <img class="rounded img-fluid" width="200" src="${p.image}" alt="${p.name}">
            </td>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price} VNĐ.</td>
            <td>
                <button class="btn btn-danger">Xóa</button>
                <a href="#" class="btn btn-info">Cập nhật</a>
            </td>
        </tr>
    </c:forEach>

</table>
