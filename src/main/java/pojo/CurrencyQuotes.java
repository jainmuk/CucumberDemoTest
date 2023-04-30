package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyQuotes {


    @JsonProperty("GBPINR")
    private float gbpINR;

    public CurrencyQuotes() {
    }

    public CurrencyQuotes(float gbpINR) {
        this.gbpINR = gbpINR;
    }

    public float getGbpINR() {
        return gbpINR;
    }

    public void setGbpINR(float gbpINR) {
        this.gbpINR = gbpINR;
    }

    @Override
    public String toString() {
        return "CurrencyQuotes{" +
                "gbpINR=" + gbpINR +
                '}';
    }
}
