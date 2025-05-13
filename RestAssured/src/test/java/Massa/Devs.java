package Massa;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Devs {
	
	public  String  Teste(String date) {
	RequestSpecification request = RestAssured
	.given()
	.multiPart("acao", "gerar_pessoa")
	.multiPart("pontuacao", "N")
	.multiPart("sexo", "H")
	.multiPart("idade", "0")
	.multiPart("txt_qtde", "1");
	
	Response response = request.post("https://www.4devs.com.br/ferramentas_online.php");
	  return date = response.body().jsonPath().getString(date);
	  
	 
	}
	private  String nome = Teste("[0].nome");
	private  String senha = Teste("[0].senha");
	private  String idade = Teste("[0].telefone");
	private  String data_nasc = Teste("[0].data_nasc");
	private  String altura = Teste("[0].altura");
	private  String peso = Teste("[0].peso");
	private  String tipo_sanguineo = Teste("[0].tipo_sanguineo");
	private  String cor = Teste("[0].cor");


	public String getSenha() {
		return senha;
	}

	public String getIdade() {
		return idade;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public String getAltura() {
		return altura;
	}

	public String getPeso() {
		return peso;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public String getCor() {
		return cor;
	}

	public String getNome() {
		return nome;
	}



}
