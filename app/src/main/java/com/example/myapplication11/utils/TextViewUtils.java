package com.example.myapplication11.utils;

import android.widget.TextView;

public class TextViewUtils {

    /**
     * 文本的赋值
     * @param word
     * @param txt
     */
    public static void setTextView(String word, TextView txt){
        if(word != null && !word.isEmpty() && txt != null){
            txt.setText(word);
        }
    }

}
