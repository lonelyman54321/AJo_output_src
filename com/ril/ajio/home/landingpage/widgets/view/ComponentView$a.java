/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.landingpage.widgets.view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.home.landingpage.widgets.view.ComponentView;

public final class ComponentView$a
extends RecyclerView$s {
    public final /* synthetic */ ComponentView a;

    public ComponentView$a(ComponentView componentView) {
        this.a = componentView;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        super.onScrollStateChanged(recyclerView, n3);
        int n4 = 2;
        int n7 = 1;
        ComponentView componentView = this.a;
        if (n3 == n4) {
            componentView.f = n7;
        } else if (n3 == n7) {
            componentView.f = n7;
        } else {
            n4 = 0;
            recyclerView = null;
            componentView.f = false;
        }
    }
}

