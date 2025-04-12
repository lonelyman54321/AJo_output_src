/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.y;

public final class y$a
extends RecyclerView$s {
    public boolean a = false;
    public final /* synthetic */ y b;

    public y$a(y y5) {
        this.b = y5;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        boolean bl2;
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0 && (bl2 = this.a)) {
            bl2 = false;
            this.a = false;
            object = this.b;
            ((y)object).snapToTargetExistingView();
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        if (n3 != 0 || n4 != 0) {
            boolean bl2;
            this.a = bl2 = true;
        }
    }
}

