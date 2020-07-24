package br.com.bootcamp.commons;

import br.com.bootcamp.settings.BaseTest;
import org.assertj.core.data.Offset;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class SeleniumRobot extends BaseTest {

	/**
	 * Faz um soft assert de uma string pelo AssertJ
	 * @param expected Insira o texto esperado
	 * @param actual Insira o texto real
	 * @param funcionalidade Insira o nome da funcionalidade
	 * @param attribute Insira o nome da variável a qual deseja fazer a asserção do texto
	 */
	public static void softAssertString(String expected, String actual, String funcionalidade, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> Text of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isEqualTo(expected);
	}
	/**
	 * Faz um soft assert de uma string pelo AssertJ
	 * @param expected Insira o texto esperado
	 * @param actual Insira o texto real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param scope Insira o escopo dentro da funcionalidade a qual o atributo pertence
	 * @param attribute Insira o nome da variável a qual deseja fazer a asserção do texto
	 */
	public static void softAssertString(String expected, String actual, String funcionalidade, String scope, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> " + scope + " -> Text of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isEqualTo(expected);
	}

	/**
	 * Faz um soft assert de um int pelo AssertJ
	 * @param expected Insira o valor esperado
	 * @param actual Insira o valor real
	 * @param funcionalidade Insira o nome da funcionalidade
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do valor
	 */
	public static void softAssertInt(int expected, int actual, String funcionalidade, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> Value of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isEqualTo(expected);
	}
	/**
	 * Faz um soft assert de um int pelo AssertJ
	 * @param expected Insira o texto esperado
	 * @param actual Insira o texto real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param scope Insira o escopo dentro da funcionalidade a qual o atributo pertence
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do valor
	 */
	public static void softAssertInt(int expected, int actual, String funcionalidade, String scope, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> " + scope + " -> Value of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isEqualTo(expected);
	}

	/**
	 * Faz um soft assert de um preço float pelo AssertJ
	 * @param expected Insira o preço esperado
	 * @param actual Insira o preço real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do preço
	 */
	public static void softAssertPrice(float expected, float actual, String funcionalidade, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> Price of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaFloat));
	}
	/**
	 * Faz um soft assert de um preço float pelo AssertJ
	 * @param expected Insira o preço esperado
	 * @param actual Insira o preço real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param scope Insira o escopo dentro da funcionalidade a qual o atributo pertence
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do preço
	 */
	public static void softAssertPrice(float expected, float actual, String funcionalidade, String scope, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> " + scope + " -> Price of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaFloat));
	}

	/**
	 * Faz um soft assert de um float pelo AssertJ
	 * @param expected Insira o valor esperado
	 * @param actual Insira o valor real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param attribute Insira o nome do atributo a qual deseja fazer a asserção do valor
	 */
	public static void softAssertFloat(float expected, float actual, String funcionalidade, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> Value of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaFloat));
	}
	/**
	 * Faz um soft assert de um float pelo AssertJ
	 * @param expected Insira o valor esperado
	 * @param actual Insira o valor real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param scope Insira o escopo dentro da funcionalidade a qual o atributo pertence
	 * @param attribute Insira o nome do atributo a qual deseja fazer a asserção do valor
	 */
	public static void softAssertFloat(float expected, float actual, String funcionalidade, String scope, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> " + scope + " -> Value of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaFloat));
	}

	/**
	 * Faz um soft assert de um double pelo AssertJ
	 * @param expected Insira o valor esperado
	 * @param actual Insira o valor real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do valor
	 */
	public static void softAssertDouble(double expected, double actual, String funcionalidade, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> Value of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaDouble));
	}
	/**
	 * Faz um soft assert de um double pelo AssertJ
	 * @param expected Insira o valor esperado
	 * @param actual Insira o valor real
	 * @param funcionalidade Insira o nome da funcionalidade usada
	 * @param scope Insira o escopo dentro da funcionalidade a qual o atributo pertence
	 * @param attribute Insira o nome do atributo o qual deseja fazer a asserção do valor
	 */
	public static void softAssertDouble(double expected, double actual, String funcionalidade, String scope, String attribute){
		softly.assertThat(actual)
				.withFailMessage(funcionalidade + " -> " + scope + " -> Price of " + attribute +
						"\nExpected: " + expected + "\nActual: " + actual)
				.isCloseTo(expected, Offset.offset(deltaDouble));
	}

	/**
	 * Clicar em um botão através de JavaScriptExecutor
	 * @param elemento Insira o elemento que você deseja clicar.
	 */
	public static void clicaBotaoJS(WebElement elemento){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void clicaBotaoPorTexto(String texto){
		webDriver.findElement(By.xpath("//*[text()='"+texto+"']")).click();
	}

	/**
	 * Insere um texto no campo através de JavaScriptExecutor
	 * @param elemento Insira o elemento onde você deseja preencher no campo
	 * @param valor Insira o valor que você deseja preencher no campo
	 */
	public static void insireTextoNoElementoJS(WebElement elemento, String valor){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].value='"+valor+"';", elemento);
	}
	/**
	 * Marcar um checkbox através de JavaScriptExecutor
	 * @param id Insira o id do elemento que você quer marcar
	 */
	public static void selecionaCheckBoxJS(String id){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("document.getElementById('"+ id +"').checked=true;");
	}

	/**
	 * Valida se o texto atual é igual ao texto esperado
	 * @param atual Insira o valor do texto atual
	 * @param esperado Insira o valor do texto esperado
	 * @return Retorna verdadeiro ou falso
	 */
	public static void validaTexto(String atual, String esperado){
		Assert.assertEquals(esperado, atual);
	}

	/**
	 * Realiza o Scroll da página até encontrar o elemento.(Obs: Elemento precisa existir na página)
	 * @param elemento
	 */
	public static void scrollAteOElementoJS(WebElement elemento){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].scrollIntoView();", elemento);
	}

	/**
	 * Realiza Scroll ate o fim da página
	 */
	public static void scrollAteFimDaPaginaJS(){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * Realiza Scroll ate o topo da página
	 */
	public static void scrollAteTopoDaPaginaJS(){
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	}

	/**
	 * Seleciona um item na lista através do Texto que está visivel na lista
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param textoVisivel Texto no qual o comando deve clicar
	 */
	public static void selecionaItemLista(WebElement elemento, String textoVisivel){
		Select lista = new Select(elemento);
		lista.selectByVisibleText(textoVisivel);
	}

	/**
	 * Seleciona um item na lista através do Index
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param index Posição do elemento na lista
	 */
	public static void selecionaItemLista(WebElement elemento, int index){
		Select lista = new Select(elemento);
		lista.selectByIndex(index);
	}

	/**
	 * Seleciona um item na lista através do Valor
	 * @param elemento Elemento pai da Lista de seleção(id da tag select)
	 * @param value Atributo value da tag option
	 */
	public static void selecionaItemListaPorValor(WebElement elemento, String value){
		Select lista = new Select(elemento);
		lista.selectByValue(value);
	}

	/**
	 * Força sleep
	 * @param milliseconds Tempo em milisegundos para ficar em sleep
	 */
	public static void forceSleep(int milliseconds){
		//try { Thread.sleep(milliseconds); } catch (InterruptedException ex) {}
		Actions action = new Actions(webDriver);
		action.pause(milliseconds);
	}

	public static void hoverMouseOver(WebElement element){
		Actions action = new Actions(webDriver);
		action.moveToElement(element).build().perform();
	}
}
