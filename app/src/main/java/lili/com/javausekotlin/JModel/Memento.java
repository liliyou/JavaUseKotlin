package lili.com.javausekotlin.JModel;

/**
 * Created by xuyating on 2017/5/18.
 */

public class Memento {

    public Memento(String state) {
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
