/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

public final class SearchView$g
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView a;

    public SearchView$g(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n3, long l2) {
        this.a.h(n3);
    }
}

