package pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openqa.selenium.support.ui.Quotes;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("source")
    private String source;
    @JsonProperty("quotes")
    private CurrencyQuotes quotes;

    public Employee() {
    }

    public Employee(boolean success, long timestamp, String source, CurrencyQuotes quotes) {
        this.success = success;
        this.timestamp = timestamp;
        this.source = source;
        this.quotes = quotes;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CurrencyQuotes getQuotes() {
        return quotes;
    }

    public void setQuotes(CurrencyQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "success=" + success +
                ", timestamp=" + timestamp +
                ", source='" + source + '\'' +
                ", quotes=" + quotes +
                '}';
    }
}
