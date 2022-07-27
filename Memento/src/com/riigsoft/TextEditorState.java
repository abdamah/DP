package com.riigsoft;

public record TextEditorState(String content) {

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "TextEditorHistory{" +
                "content='" + content + '\'' +
                '}';
    }
}
