/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.FrameLayout
 */
package androidx.viewpager2.adapter;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.viewpager2.adapter.a;

public final class a$a
implements n {
    public final /* synthetic */ iw0_0 a;
    public final /* synthetic */ a b;

    public a$a(a a2, iw0_0 iw0_02) {
        this.b = a2;
        this.a = iw0_02;
    }

    public final void k(mu1_1 object, i$a object2) {
        object2 = this.b;
        FragmentManager fragmentManager = ((a)object2).b;
        boolean bl2 = fragmentManager.S();
        if (bl2) {
            return;
        }
        object.getLifecycle().c(this);
        object = this.a;
        fragmentManager = (FrameLayout)((RecyclerView$B)object).itemView;
        bl2 = fragmentManager.isAttachedToWindow();
        if (bl2) {
            ((a)object2).l((iw0_0)object);
        }
    }
}

