package com.github.binarySmile.autoriatest.tests;

import com.github.binarySmile.autoriatest.pojo.All;
import com.github.binarySmile.autoriatest.pojo.SearchResponse;
import com.github.binarySmile.autoriatest.utils.Util;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class SearchForCarsByParamTest extends Util {

    private final String base_URL = "https://developers.ria.com";
    private final String search_with_key_user = "/auto/search?api_key=zumI4mddWyZWCUiEHNjl7xMH3sArlj9lBQ137Ce0";

    @Test
    public void testMazda() {
        Response response =
                given().
                        param("category_id", "1").
                        param("bodystyle[0]", "3").
                        param("marka_id[0]", "47").
                        param("model_id[0]", "393").
                        param("s_yers[0]", "2017").
                        param("po_yers[0]", "2017").
                        param("gearbox[1]", "2").
                        param("raceFrom", "1").
                        when().
                        get(base_URL + search_with_key_user).
                        thenReturn();
        response.then().statusCode(200).and().time(lessThan(1500L));
        SearchResponse res = response.as(SearchResponse.class, ObjectMapperType.JACKSON_2);
        All all = res.getResult().getAdditional().getSearchParams().getAll();
        Assert.assertEquals(1, getIntegerValue(all.getCategoryId()));
        Assert.assertEquals(3, getIntegerList(all.getBodystyle()));
        Assert.assertEquals(47, getIntegerList(all.getMarkaId()));
        Assert.assertEquals(393, getIntegerList(all.getModelId()));
        Assert.assertEquals(2017, getIntegerList(all.getSYers()));
        Assert.assertEquals(2017, getIntegerList(all.getPoYers()));
        Assert.assertEquals(2, getCastom(all.getGearbox()));
        Assert.assertEquals(1, getIntegerValue(all.getRaceFrom()));

    }

    @Test
    public void testToyota() {
        Response response =
                given().
                        param("category_id", "1").
                        param("bodystyle[0]", "3").
                        param("marka_id", "79").
                        param("model_id[0]", "698").
                        param("s_yers[0]", "2017").
                        param("po_yers[0]", "2017").
                        param("gearbox[0]", "1").
                        param("raceFrom", "1").
                        when().
                        get(base_URL + search_with_key_user).
                        thenReturn();
        response.then().statusCode(200).and().time(lessThan(1500L));
        SearchResponse res = response.as(SearchResponse.class, ObjectMapperType.JACKSON_2);
        All all = res.getResult().getAdditional().getSearchParams().getAll();
        Assert.assertEquals(1, getIntegerValue(all.getCategoryId()));
        Assert.assertEquals(3, getIntegerList(all.getBodystyle()));
        Assert.assertEquals(79, getIntegerList(all.getMarkaId()));
        Assert.assertEquals(698, getIntegerList(all.getModelId()));
        Assert.assertEquals(2017, getIntegerList(all.getSYers()));
        Assert.assertEquals(2017, getIntegerList(all.getPoYers()));
        Assert.assertEquals(1, getCastom(all.getGearbox()));
        Assert.assertEquals(1, getIntegerValue(all.getRaceFrom()));
    }

    @Test
    public void testHonda() {
        Response response =
                given().
                        param("category_id", "1").
                        param("bodystyle[0]", "3").
                        param("marka_id", "28").
                        param("model_id[0]", "265").
                        param("s_yers[0]", "2017").
                        param("po_yers[0]", "2017").
                        param("gearbox[0]", "1").
                        param("raceFrom", "1").
                        when().
                        get(base_URL + search_with_key_user).
                        thenReturn();
        response.then().statusCode(200).and().time(lessThan(1800L));
        SearchResponse res = response.as(SearchResponse.class, ObjectMapperType.JACKSON_2);
        All all = res.getResult().getAdditional().getSearchParams().getAll();
        Assert.assertEquals(1, getIntegerValue(all.getCategoryId()));
        Assert.assertEquals(3, getIntegerList(all.getBodystyle()));
        Assert.assertEquals(28, getIntegerList(all.getMarkaId()));
        Assert.assertEquals(265, getIntegerList(all.getModelId()));
        Assert.assertEquals(2017, getIntegerList(all.getSYers()));
        Assert.assertEquals(2017, getIntegerList(all.getPoYers()));
        Assert.assertEquals(1, getCastom(all.getGearbox()));
        Assert.assertEquals(1, getIntegerValue(all.getRaceFrom()));
    }
}
