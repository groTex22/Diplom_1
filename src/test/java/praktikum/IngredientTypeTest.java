package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

/*Проверяем класс IngredientType, что есть нужные нам типы
SAUCE и FILLING, и больше ничего лишнего*/
public class IngredientTypeTest {
    IngredientType ingredientType;

    @Test
    public void IngredientTypeCountTest() {
        //Проверим, что всего два значения в IngredientType
        Assert.assertEquals(2, ingredientType.values().length);
        //Проверим, что есть нужные нам значения, а иначе ошибка
        Assert.assertThat(ingredientType.SAUCE, is(notNullValue()));
        Assert.assertThat(ingredientType.FILLING, is(notNullValue()));
        /*Assert.assertEquals("SAUCE", ingredientTypeArray[0].toString());
        Assert.assertEquals("FILLING", ingredientTypeArray[1].toString());*/
    }

}