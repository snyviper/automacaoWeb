# automacaoWeb

## AssertJ - SoftAssertions

Os Soft Assertions em AssertJ possuem 3 etapas. As etapas e suas sintaxes s�o:
- Importar, declarar e instanciar:
```java
import org.assertj.core.api.SoftAssertions;

public class BaseClass {
    protected static SoftAssertions softly;
    softly = new SoftAssertions();
}
```

- Fazer as asser��es: Asser��es de igualdade  
Para asser��es de igualdade entre ints e strings, usa-se
```java
softly.assertThat(actual).isEqualTo(expected);
```
- Fazer as asser��es: Asser��es de aproxima��o  
Para asser��es de igualdade entre pontos flutuantes, � recomendado o uso da asser��o com um delta, da forma
```java
import org.assertj.core.data.Offset;

public class FuncionalidadeClass extends BaseClass {
    softly.assertThat(actual).isCloseTo(expected, Offset.offset(delta));
}
```
_Note que Offset.offset() � uma **fun��o**, e delta � uma **vari�vel**_

- Fazer as asser��es: Mensagens de erro personalizadas
```java
softly.assertThat(actual)
                .withFailMessage("Custom message: " + customMessage + "\nExpected: " + expected + "\nActual: " + actual)
                .isEqualTo(expected);
```
_Note que withFailMessage vem **antes** de .isEqualTo_

- Chamar o resultado
```java
@After(value = "@web")
public void afterWeb() {
    webDriver.quit();
    softly.assertAll();
}
```

� poss�vel chamar o assertAll antes de fechar o navegador, e at� mesmo fora do @After, mas o programa n�o fechar� o navegador se for constatado algum erro em alguma das assertThat.