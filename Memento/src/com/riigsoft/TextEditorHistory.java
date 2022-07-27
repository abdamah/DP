package com.riigsoft;

import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {
    private List<TextEditorState> states = new ArrayList<>();

    public void save(TextEditorState state) {
        states.add(state);
    }

    public TextEditorState undo() {

        return states.get(states.size() - 1);
    }
}
