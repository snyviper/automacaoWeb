# automacaoWeb

## AssertJ - SoftAssertions

Os Soft Assertions em AssertJ possuem 3 etapas. As etapas e suas sintaxes são:
- Importar, declarar e instanciar:
```java
import org.assertj.core.api.SoftAssertions;

public class BaseClass {
    protected static SoftAssertions softly;
    softly = new SoftAssertions();
}
```

- Fazer as asserções: Asserções de igualdade  
Para asserções de igualdade entre ints e strings, usa-se
```java
softly.assertThat(actual).isEqualTo(expected);
```
- Fazer as asserções: Asserções de aproximação  
Para asserções de igualdade entre pontos flutuantes, é recomendado o uso da asserção com um delta, da forma
```java
import org.assertj.core.data.Offset;

public class FuncionalidadeClass extends BaseClass {
    softly.assertThat(actual).isCloseTo(expected, Offset.offset(delta));
}
```
_Note que Offset.offset() é uma **função**, e delta é uma **variável**_

- Fazer as asserções: Mensagens de erro personalizadas
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

É possível chamar o assertAll antes de fechar o navegador, e até mesmo fora do @After, mas o programa não fechará o navegador se for constatado algum erro em alguma das assertThat.