/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AutoCompleteTextView
 */
package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

public final class SearchView$i {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int n3) {
        searchView$SearchAutoComplete.setInputMethodMode(n3);
    }
}

