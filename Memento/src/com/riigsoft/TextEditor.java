package com.riigsoft;

public class TextEditor {
    private String content;

    public TextEditorState createState() {
        return new TextEditorState(this.content);
    }

    void restoreState(TextEditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
