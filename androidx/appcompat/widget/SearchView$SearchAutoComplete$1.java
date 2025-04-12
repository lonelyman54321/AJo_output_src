/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
package androidx.appcompat.widget;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

class SearchView$SearchAutoComplete$1
implements Runnable {
    public final /* synthetic */ SearchView$SearchAutoComplete a;

    public SearchView$SearchAutoComplete$1(SearchView$SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    public final void run() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.a;
        boolean bl2 = searchView$SearchAutoComplete.c;
        if (bl2) {
            InputMethodManager inputMethodManager = (InputMethodManager)searchView$SearchAutoComplete.getContext().getSystemService("input_method");
            inputMethodManager.showSoftInput((View)searchView$SearchAutoComplete, 0);
            searchView$SearchAutoComplete.c = false;
        }
    }
}

