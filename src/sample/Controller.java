package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public TextField textbox;

    public List<Reference<int[]>> list = new ArrayList<>();

    public void doSomething(ActionEvent actionEvent) {
        String text = textbox.getText();
        System.out.println(text);
        int value = Integer.parseInt(text);
        int[] array = new int[value];
        Reference<int[]> reference = new WeakReference<>(array);
        list.add(reference);
    }
}
