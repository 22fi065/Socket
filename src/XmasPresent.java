import java.io.Serializable;

public class XmasPresent implements Serializable {

    int suuji1, Suuji2;
    String Enzanshi;

    public String getEnzanshi() {
        return Enzanshi;
    }

    public void setEnzanshi(String present) {
        this.Enzanshi = present;
    }

    public int getSuuji2() {
        return Suuji2;
    }

    public void setSuuji2(int present) {
        this.Suuji2 = present;
    }

    public int getContent() {
        return suuji1;
    }

    public void setContent(int present) {
        this.suuji1 = present;
    }

}