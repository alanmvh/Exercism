import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    Map<Integer, String> dialingCodesMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodesMap;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodesMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!(this.dialingCodesMap.containsKey(code) | this.dialingCodesMap.containsValue(country))){
            this.dialingCodesMap.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry : this.dialingCodesMap.entrySet()){
            if(entry.getValue().equals(country)){
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer, String> entry: this.dialingCodesMap.entrySet()){
            if(entry.getValue().equals(country)){
                this.dialingCodesMap.remove(entry.getKey(), country);
                this.dialingCodesMap.put(code, country);
            }
        }
    }
}
