package lili.com.javausekotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lili.com.javausekotlin.KotlinModel.Caretaker;
import lili.com.javausekotlin.KotlinModel.Originator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useMementoPatten();
    }
    private void useMementoPatten()
    {
        Originator originator=new Originator();
        originator.setState("ON");
        originator.printState();

        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("OFF");
        originator.printState();

        originator.setMemento(caretaker.getMemento());
        originator.printState();
    }
}
