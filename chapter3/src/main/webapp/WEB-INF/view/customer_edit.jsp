<%--
  Created by IntelliJ IDEA.
  User: qingzhong
  Date: 16/4/5
  Time: 下午2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>客户管理 - 编辑客户</title>
</head>
<body>

<h1>编辑客户界面</h1>

<form id="customer_form">
    <input type="hidden" name="id" value="${customer.id}">
    <table>
        <tr>
            <td>客户名称：</td>
            <td>
                <input type="text" name="name" value="${customer.name}">
            </td>
        </tr>
        <tr>
            <td>联系人：</td>
            <td>
                <input type="text" name="contact" value="${customer.contact}">
            </td>
        </tr>
        <tr>
            <td>电话号码：</td>
            <td>
                <input type="text" name="telephone" value="${customer.telephone}">
            </td>
        </tr>
        <tr>
            <td>邮箱地址：</td>
            <td>
                <input type="text" name="email" value="${customer.email}">
            </td>
        </tr>
    </table>
    <button type="submit">保存</button>
</form>

<script src="${BASE}/asset/lib/jquery/jquery.min.js"></script>
<script src="${BASE}/asset/lib/jquery-form/jquery.form.min.js"></script>
<script>
    $(function() {
        $('#customer_form').ajaxForm({
            type: 'put',
            url: '${BASE}/customer_edit',
            success: function(data) {
                if (data) {
                    location.href = '${BASE}/customer';
                }
            }
        });
    });
</script>

</body>
</html>
