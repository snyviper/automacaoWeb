package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRobot extends BaseTest {

	/**
	 * Clicar em um botão através de JavaScriptExecutor
	 * @param elemento Insira o elemento que você deseja clicar.
	 */
	public void clicaBotaoJS(WebElement elemento){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public void clicaBotaoPorTexto(String texto){
		webDriver.findElement(By.xpath("//*[text()='"+texto+"']")).click();
	}

	/**
	 * Insere um texto no campo através de JavaScriptExecutor
	 * @param elemento Insira o elemento onde você deseja preencher no campo
	 * @param valor Insira o valor que você deseja preencher no campo
	 */
	public void insireTextoNoElementoJS(WebElement elemento, String valor){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].value='"+valor+"';", elemento);
	}
	/**
	 * Marcar um checkbox através de JavaScriptExecutor
	 * @param id Insira o id do elemento que você quer marcar
	 */
	public void selecionaCheckBoxJS(String id){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("document.getElementById('"+ id +"').checked=true;");
	}

	/**
	 * Retorna o valor de texto que existe no elemento
	 * @param elemento Insira o elemento que você deseja capturar o texto
	 * @return Retorna o valor de texto do elemento
	 */
	public String pegarValorTexto(WebElement elemento){
		return elemento.getText();
	}

	/**
	 * Valida se o texto atual é igual ao texto esperado
	 * @param atual Insira o valor do texto atual
	 * @param esperado Insira o valor do texto esperado
	 * @return Retorna verdadeiro ou falso
	 */
	public void validaTexto(String atual, String esperado){
		Assert.assertEquals(esperado, atual);
	}

	/**
	 * Realiza o Scroll da página até encontrar o elemento.(Obs: Elemento precisa existir na página)
	 * @param elemento
	 */
	public void scrollAteOElementoJS(WebElement elemento){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	/**
	 * Realiza Scroll ate o fim da página
	 */
	public void scrollAteFimDaPaginaJS(){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Realiza Scroll ate o topo da página
	 */
	public void scrollAteTopoDaPaginaJS(){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	}

	/**
	 * Espera o elemento estar clicavel na tela
	 * @param elemento
	 */
	public void esperaElementoSerClicavel(WebElement elemento){
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	/**
	 * Seleciona um item na lista através do Texto que está visivel na lista
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param textoVisivel Texto no qual o comando deve clicar
	 */
	public void selecionaItemLista(WebElement elemento, String textoVisivel){
		Select lista = new Select(elemento);
		lista.selectByVisibleText(textoVisivel);
	}

	/**
	 * Seleciona um item na lista através do Index
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param index Posição do elemento na lista
	 */
	public void selecionaItemLista(WebElement elemento, int index){
		Select lista = new Select(elemento);
		lista.selectByIndex(index);
	}

	/**
	 * Seleciona um item na lista através do Valor
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param value Atributo value da tag option
	 */
	public void selecionaItemListaPorValor(WebElement elemento, String value){
		Select lista = new Select(elemento);
		lista.selectByValue(value);
	}

	/**
	 * Força sleep
	 * @param milliseconds Tempo em milisegundos para ficar em sleep
	 */
	public void forceSleep(int milliseconds){
		try { Thread.sleep(milliseconds); } catch (InterruptedException ex) {}
	}
}
