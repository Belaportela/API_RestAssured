package br.iportela.rest.tests.Utils;

import io.restassured.RestAssured;

public class BarrigaUtils {
	
	public static Integer getIdContapPeloNome(String nome) {
		return RestAssured.get("/contas?nome="+nome).then().extract().path("id[0]");
	}
	
	public static Integer getIdMovPeloNome(String desc) {
		return RestAssured.get("/transacoes?descricao="+desc).then().extract().path("id[0]");
	}
	


}
