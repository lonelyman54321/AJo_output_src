/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 */
package androidx.fragment.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.ListFragment;

public final class ListFragment$a
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ListFragment a;

    public ListFragment$a(ListFragment listFragment) {
        this.a = listFragment;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n3, long l2) {
        adapterView = (ListView)adapterView;
        this.a.getClass();
    }
}

