package com.riigsoft;

public class Main {
    public static void main(String[] args) {
        var editor = new TextEditor();
        var history = new TextEditorHistory();

        editor.setContent("a");
        history.save(editor.createState());

        editor.setContent("b");
        history.save(editor.createState());

        editor.setContent("c");

        editor.restoreState(history.undo());

        System.out.println(editor.getContent());
    }
}
