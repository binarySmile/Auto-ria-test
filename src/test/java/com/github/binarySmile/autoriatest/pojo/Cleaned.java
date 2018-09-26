package com.github.binarySmile.autoriatest.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cleaned {

    @JsonProperty("countpage")
    private int countpage;

    @JsonProperty("city")
    private List <Object> city;

    @JsonProperty("bodystyle")
    private List <String> bodystyle;

    @JsonProperty("currencies_arr")
    private List <Object> currenciesArr;

    @JsonProperty("mm_marka_filtr")
    private List <Object> mmMarkaFiltr;

    @JsonProperty("gear_id")
    private List <String> gearId;

    @JsonProperty("auto_options")
    private List <Object> autoOptions;

    @JsonProperty("m_state")
    private List <Object> mState;

    @JsonProperty("category_id")
    private String categoryId;

    @JsonProperty("m_city")
    private List <Object> mCity;

    @JsonProperty("marka")
    private List <Object> marka;

    @JsonProperty("po_yers")
    private List <String> poYers;

    @JsonProperty("model")
    private List <Object> model;

    @JsonProperty("currency")
    private int currency;

    @JsonProperty("gearbox")
    private List <Object> gearbox;

    @JsonProperty("state")
    private List <Object> state;

    @JsonProperty("event")
    private String event;

    @JsonProperty("body_id")
    private List <Object> bodyId;

    @JsonProperty("hide_black_list")
    private List <Object> hideBlackList;

    @JsonProperty("mm_marka")
    private List <Object> mmMarka;

    @JsonProperty("custom")
    private int custom;

    @JsonProperty("brandOrigin")
    private List <Object> brandOrigin;

    @JsonProperty("s_yers")
    private List <String> sYers;

    @JsonProperty("lang_id")
    private int langId;

    @JsonProperty("mm_model_filtr")
    private List <Object> mmModelFiltr;

    @JsonProperty("model_id")
    private List <String> modelId;

    @JsonProperty("bodyStyleId")
    private List <Object> bodyStyleId;

    @JsonProperty("mm_country_exeption")
    private List <Object> mmCountryExeption;

    @JsonProperty("target")
    private String target;

    @JsonProperty("marka_id")
    private List <String> markaId;

    @JsonProperty("matched_country")
    private int matchedCountry;

    @JsonProperty("raceFrom")
    private String raceFrom;

    @JsonProperty("exchange_filter")
    private List <Object> exchangeFilter;

    @JsonProperty("mm_country")
    private List <Object> mmCountry;

    @JsonProperty("excludeMM")
    private List <Object> excludeMM;

    @JsonProperty("mm_model")
    private List <Object> mmModel;

    public int getCountpage() {
        return countpage;
    }

    public List <Object> getCity() {
        return city;
    }

    public List <String> getBodystyle() {
        return bodystyle;
    }

    public List <Object> getCurrenciesArr() {
        return currenciesArr;
    }

    public List <Object> getMmMarkaFiltr() {
        return mmMarkaFiltr;
    }

    public List <String> getGearId() {
        return gearId;
    }

    public List <Object> getAutoOptions() {
        return autoOptions;
    }

    public List <Object> getMState() {
        return mState;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public List <Object> getMCity() {
        return mCity;
    }

    public List <Object> getMarka() {
        return marka;
    }

    public List <String> getPoYers() {
        return poYers;
    }

    public List <Object> getModel() {
        return model;
    }

    public int getCurrency() {
        return currency;
    }

    public List <Object> getGearbox() {
        return gearbox;
    }

    public List <Object> getState() {
        return state;
    }

    public String getEvent() {
        return event;
    }

    public List <Object> getBodyId() {
        return bodyId;
    }

    public List <Object> getHideBlackList() {
        return hideBlackList;
    }

    public List <Object> getMmMarka() {
        return mmMarka;
    }

    public int getCustom() {
        return custom;
    }

    public List <Object> getBrandOrigin() {
        return brandOrigin;
    }

    public List <String> getSYers() {
        return sYers;
    }

    public int getLangId() {
        return langId;
    }

    public List <Object> getMmModelFiltr() {
        return mmModelFiltr;
    }

    public List <String> getModelId() {
        return modelId;
    }

    public List <Object> getBodyStyleId() {
        return bodyStyleId;
    }

    public List <Object> getMmCountryExeption() {
        return mmCountryExeption;
    }

    public String getTarget() {
        return target;
    }

    public List <String> getMarkaId() {
        return markaId;
    }

    public int getMatchedCountry() {
        return matchedCountry;
    }

    public String getRaceFrom() {
        return raceFrom;
    }

    public List <Object> getExchangeFilter() {
        return exchangeFilter;
    }

    public List <Object> getMmCountry() {
        return mmCountry;
    }

    public List <Object> getExcludeMM() {
        return excludeMM;
    }

    public List <Object> getMmModel() {
        return mmModel;
    }

    @Override
    public String toString() {
        return
                "Cleaned{" +
                        "countpage = '" + countpage + '\'' +
                        ",city = '" + city + '\'' +
                        ",bodystyle = '" + bodystyle + '\'' +
                        ",currencies_arr = '" + currenciesArr + '\'' +
                        ",mm_marka_filtr = '" + mmMarkaFiltr + '\'' +
                        ",gear_id = '" + gearId + '\'' +
                        ",auto_options = '" + autoOptions + '\'' +
                        ",m_state = '" + mState + '\'' +
                        ",category_id = '" + categoryId + '\'' +
                        ",m_city = '" + mCity + '\'' +
                        ",marka = '" + marka + '\'' +
                        ",po_yers = '" + poYers + '\'' +
                        ",model = '" + model + '\'' +
                        ",currency = '" + currency + '\'' +
                        ",gearbox = '" + gearbox + '\'' +
                        ",state = '" + state + '\'' +
                        ",event = '" + event + '\'' +
                        ",body_id = '" + bodyId + '\'' +
                        ",hide_black_list = '" + hideBlackList + '\'' +
                        ",mm_marka = '" + mmMarka + '\'' +
                        ",custom = '" + custom + '\'' +
                        ",brandOrigin = '" + brandOrigin + '\'' +
                        ",s_yers = '" + sYers + '\'' +
                        ",lang_id = '" + langId + '\'' +
                        ",mm_model_filtr = '" + mmModelFiltr + '\'' +
                        ",model_id = '" + modelId + '\'' +
                        ",bodyStyleId = '" + bodyStyleId + '\'' +
                        ",mm_country_exeption = '" + mmCountryExeption + '\'' +
                        ",target = '" + target + '\'' +
                        ",marka_id = '" + markaId + '\'' +
                        ",matched_country = '" + matchedCountry + '\'' +
                        ",raceFrom = '" + raceFrom + '\'' +
                        ",exchange_filter = '" + exchangeFilter + '\'' +
                        ",mm_country = '" + mmCountry + '\'' +
                        ",excludeMM = '" + excludeMM + '\'' +
                        ",mm_model = '" + mmModel + '\'' +
                        "}";
    }
}