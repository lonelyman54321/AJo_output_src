/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

public final class eX1$c
extends RecyclerView$s {
    public final /* synthetic */ ex1_0 a;

    public eX1$c(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        n3 = (int)(og1_1.c() ? 1 : 0);
        if (n3 == 0) {
            ex1_0 ex1_02 = this.a;
            int n4 = ex1_02.O;
            if (n4 != 0) {
                int n7;
                object = ((RecyclerView)object).getLayoutManager();
                string2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager";
                Intrinsics.checkNotNull(object, string2);
                object = (LinearLayoutManager)object;
                ex1_02.N = n7 = ((LinearLayoutManager)object).findLastVisibleItemPosition();
                n7 = ex1_02.cb(17);
                n4 = ex1_02.N;
                if (n4 == n7) {
                    object = ex1_02.L;
                    if (object != null) {
                        ai0_2.i((View)object);
                    }
                } else {
                    object = ex1_02.L;
                    if (object != null) {
                        ai0_2.B((View)object);
                    }
                }
            }
        }
    }
}

