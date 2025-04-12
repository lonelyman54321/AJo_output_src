/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ListView
 */
package androidx.fragment.app;

import android.view.View;
import android.widget.ListView;
import androidx.fragment.app.ListFragment;

class ListFragment$1
implements Runnable {
    public final /* synthetic */ ListFragment a;

    public ListFragment$1(ListFragment listFragment) {
        this.a = listFragment;
    }

    public final void run() {
        ListView listView = this.a.e;
        listView.focusableViewAvailable((View)listView);
    }
}

