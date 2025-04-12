/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater
extends Hn {
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        MaterialAutoCompleteTextView materialAutoCompleteTextView = new MaterialAutoCompleteTextView(context, attributeSet);
        return materialAutoCompleteTextView;
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        MaterialButton materialButton = new MaterialButton(context, attributeSet);
        return materialButton;
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        MaterialCheckBox materialCheckBox = new MaterialCheckBox(context, attributeSet);
        return materialCheckBox;
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        MaterialRadioButton materialRadioButton = new MaterialRadioButton(context, attributeSet);
        return materialRadioButton;
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        MaterialTextView materialTextView = new MaterialTextView(context, attributeSet);
        return materialTextView;
    }
}

