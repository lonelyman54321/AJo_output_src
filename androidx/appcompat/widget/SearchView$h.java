/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class SearchView$h
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ SearchView a;

    public SearchView$h(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int n3, long l2) {
        this.a.i(n3);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

