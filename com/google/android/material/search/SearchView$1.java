/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.ImageButton
 */
package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.google.android.material.search.SearchView;

class SearchView$1
implements TextWatcher {
    final /* synthetic */ SearchView this$0;

    public SearchView$1(SearchView searchView) {
        this.this$0 = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        ImageButton imageButton = this.this$0.clearButton;
        int n8 = charSequence.length();
        if (n8 > 0) {
            n8 = 0;
            charSequence = null;
        } else {
            n8 = 8;
        }
        imageButton.setVisibility(n8);
    }
}

