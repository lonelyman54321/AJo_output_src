/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.landingpage.widgets.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.home.landingpage.widgets.view.ComponentRecyclerView;

public final class ComponentRecyclerView$a
extends RecyclerView$s {
    public final /* synthetic */ ComponentRecyclerView a;

    public ComponentRecyclerView$a(ComponentRecyclerView componentRecyclerView) {
        this.a = componentRecyclerView;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        super.onScrollStateChanged(recyclerView, n3);
        int n4 = 2;
        int n7 = 1;
        ComponentRecyclerView componentRecyclerView = this.a;
        if (n3 == n4) {
            componentRecyclerView.j = n7;
        } else if (n3 == n7) {
            componentRecyclerView.j = n7;
        } else {
            n4 = 0;
            recyclerView = null;
            componentRecyclerView.j = false;
        }
    }
}

