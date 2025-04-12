/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView;

class SearchView$2
implements Runnable {
    public final /* synthetic */ SearchView a;

    public SearchView$2(SearchView searchView) {
        this.a = searchView;
    }

    public final void run() {
        gf0_0 gf0_02 = this.a.A;
        boolean bl2 = gf0_02 instanceof pg3_1;
        if (bl2) {
            bl2 = false;
            gf0_02.c(null);
        }
    }
}

