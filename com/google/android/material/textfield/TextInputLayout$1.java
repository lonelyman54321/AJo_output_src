/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.TextInputLayout;

class TextInputLayout$1
implements TextWatcher {
    int previousLineCount;
    final /* synthetic */ TextInputLayout this$0;
    final /* synthetic */ EditText val$editText;

    public TextInputLayout$1(TextInputLayout textInputLayout, EditText editText) {
        int n3;
        this.this$0 = textInputLayout;
        this.val$editText = editText;
        this.previousLineCount = n3 = editText.getLineCount();
    }

    public void afterTextChanged(Editable editable) {
        int n3;
        int n4;
        TextInputLayout textInputLayout = this.this$0;
        int n7 = TextInputLayout.access$000(textInputLayout) ^ 1;
        textInputLayout.updateLabelState(n7 != 0);
        textInputLayout = this.this$0;
        n7 = textInputLayout.counterEnabled;
        if (n7 != 0) {
            textInputLayout.updateCounter(editable);
        }
        if ((n4 = TextInputLayout.access$100(textInputLayout = this.this$0)) != 0) {
            textInputLayout = this.this$0;
            TextInputLayout.access$200(textInputLayout, editable);
        }
        if ((n3 = (editable = this.val$editText).getLineCount()) != (n4 = this.previousLineCount)) {
            if (n3 < n4) {
                textInputLayout = this.val$editText;
                Object object = ViewCompat.a;
                n4 = textInputLayout.getMinimumHeight();
                object = this.this$0;
                n7 = ((TextInputLayout)((Object)object)).originalEditTextMinimumHeight;
                if (n4 != n7) {
                    textInputLayout = this.val$editText;
                    textInputLayout.setMinimumHeight(n7);
                }
            }
            this.previousLineCount = n3;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

