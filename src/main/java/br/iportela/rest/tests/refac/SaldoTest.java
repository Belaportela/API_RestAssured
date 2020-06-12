package br.iportela.rest.tests.refac;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import br.iportela.rest.core.BaseTest;
import br.iportela.rest.tests.Utils.BarrigaUtils;


public class SaldoTest extends BaseTest {

	@Test
	public void deveCalcularSaldoContas() {	
		Integer CONTA_ID = BarrigaUtils.getIdContapPeloNome("Conta para saldo"); 
		
		given()
		.when()
			.get("/saldo")
		.then()
			.statusCode(200)
			.body("find{it.conta_id == "+CONTA_ID+"}.saldo", is("534.00"));
		
	}
	

}
