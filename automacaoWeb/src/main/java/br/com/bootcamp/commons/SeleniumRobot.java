package br.com.bootcamp.commons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.bootcamp.settings.BaseTest;

public class SeleniumRobot extends BaseTest {

	/**
	 * Clicar em um botao através de JavaScriptExecutor
	 * 
	 * @param elemento Insira o elemento que você deseja clicar
	 */
	public void clicaBotaoJS(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].click();", elemento);
	}

	/**
	 * Marcar um checkbox através de JavaScriptExecutor
	 * 
	 * @param id Insira o id do elemento que você quer marcar
	 * 
	 */
	public void selecionaCheckBox(String id) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("document.getElementById('" + id + "');");
	}

	/**
	 * Retorna o valor de texto que existe no elemento
	 * 
	 * @param elemento Insira o elemento que você deseja capturar
	 * @return Retorna o valor de texto do elemento
	 */
	public String pegarValorTexto(WebElement elemento) {
		return elemento.getText();
	}

	/**
	 * Valida se o texto atual é igual ao texto esperado
	 * 
	 * @param atual    Insira o valor do texto atual
	 * @param esperado Insira o valor do texto esperado
	 * @return Retorna verdadeiro ou falso
	 */
	public boolean validaTexto(String atual, String esperado) {
		return atual.equals(esperado);
	}

	/**
	 * Realiza o Scroll da página até encontrar o elemento. (Obs. Elemento precisa
	 * existir na página)
	 * 
	 * @param elemento Insira o elemento
	 * @return Retorna verdadeiro ou falso
	 */
	public void scrollAteOElemento(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	/**
	 * Realiza o Scroll da página até o final da página
	 * 
	 * @param elemento Insira o elemento
	 */
	public void scrollAteFimDaPagina(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Realiza o Scroll da página até o inicio da página
	 * 
	 * @param elemento Insira o elemento
	 */
	public void scrollAteInicioDaPagina(WebElement elemento) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	}

	/**
	 * Espera o elemento estar clicavel na tela
	 * 
	 * @param elemento
	 */
	public void esperaElementoSerClicavel(WebElement elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	/**
	 * Seleciona um item na lista através do Text que está visível
	 * 
	 * @param elemento Elemento pai da Lista de seleção
	 * @param texto    Texto no qual o comando deve clicar
	 */
	public void selecionaItemLista(WebElement elemento, String texto) {
		Select lista = new Select(elemento);
		lista.selectByVisibleText(texto);
	}

	/**
	 * Seleciona um item atráves do Index
	 * 
	 * @param elemento Elemento pai da Lista de seleção
	 * @param index    Posição do elemento na lista
	 */
	public void selecionaItemLista(WebElement elemento, int index) {
		Select lista = new Select(elemento);
		lista.selectByIndex(index);
	}

	/**
	 * Seleciona um item na lista através do Valor
	 * 
	 * @param elemento Elemento pai da Lista de seleção (id da tag select)
	 * @param valor    atributo value da tag option
	 */
	public void selecionaItemListaPorValor(WebElement elemento, String valor) {
		Select lista = new Select(elemento);
		lista.selectByValue(valor);
	}
	
	/**
	 * Insere um texto no campo através de JavascriptExecutor
	 * @param elemento Insira um elemento onde você deseja preencher no campo
	 * @param valor Insira o valor que você deseja preencher no campo
	 */
	public void insereTextoNoElementoJS(WebElement elemento, String valor) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].value='" + valor + "';", elemento);
	}

}
