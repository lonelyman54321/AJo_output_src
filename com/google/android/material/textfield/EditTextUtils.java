/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.widget.EditText;

class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(EditText editText) {
        int n3 = editText.getInputType();
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            editText = null;
        }
        return n3 != 0;
    }
}

