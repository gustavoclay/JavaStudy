<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Contas</title>
<script src="resources/js/jquery.js"></script>
<script type="text/javascript">
	function alertaSucesso(dadosDaResposta) {
		alert("Conta paga com sucesso!");
	}

	function pagaAgora(id) {
		$.get("pagarConta?id=" + id, alertaSucesso);
	}
</script>


</head>
<body>

	<table>
		<tr>
			<th>Código</th>
			<th>Descrição</th>
			<th>Valor</th>
			<th>Tipo</th>
			<th>Paga?</th>
			<th>Data do Pagamento</th>

		</tr>

		<c:forEach items="${todasContas}" var="conta">
			<tr>
				<td>${conta.id}</td>
				<td>${conta.descricao}</td>
				<td>${conta.valor}</td>
				<td>${conta.tipo}</td>
				<td><c:if test="${conta.paga eq false}">
				Não paga
				</c:if> <c:if test="${conta.paga eq true}">
				Paga
				</c:if></td>
				<td><fmt:formatDate value="${conta.dataPagamento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td>
					<a href="removeConta?id=${conta.id}">Deletar</a>
					<c:if test="${conta.paga eq true}">
						<a href="#" onClick="pagaAgora(${conta.id})">Pagar</a>
					</c:if>
				</td>


			</tr>
		</c:forEach>
	</table>

</body>
</html>