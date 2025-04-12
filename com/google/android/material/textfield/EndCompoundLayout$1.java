/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 */
package com.google.android.material.textfield;

import android.text.Editable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.EndCompoundLayout;

class EndCompoundLayout$1
extends TextWatcherAdapter {
    final /* synthetic */ EndCompoundLayout this$0;

    public EndCompoundLayout$1(EndCompoundLayout endCompoundLayout) {
        this.this$0 = endCompoundLayout;
    }

    public void afterTextChanged(Editable editable) {
        this.this$0.getEndIconDelegate().afterEditTextChanged(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        this.this$0.getEndIconDelegate().beforeEditTextChanged(charSequence, n3, n4, n7);
    }
}

