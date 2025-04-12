/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

public final class P5
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ P5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (mz2_0)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((mz2_0)object).c;
                if (object != null) {
                    string2 = null;
                    if ((object = ((RecyclerView)object).findViewHolderForLayoutPosition(0)) != null && (object = ((RecyclerView$B)object).itemView) != null) {
                        ai0_2.a((View)object);
                    }
                }
                return;
            }
            case 1: {
                yT1 yT12 = (yT1)this.b;
                Intrinsics.checkNotNullParameter(yT12, "$bottomNavigationController");
                String string3 = "explore-brands";
                Intrinsics.checkNotNullParameter(string3, "route");
                Intrinsics.checkNotNullParameter(yT12, "bottomNavigationController");
                oj0_2 oj0_22 = new oj0_2(yT12, 0);
                yT12.o(string3, oj0_22);
                return;
            }
            case 0: 
        }
        AppBarLayout appBarLayout = (AppBarLayout)this.b;
        if (appBarLayout != null) {
            ai0_2.a((View)appBarLayout);
        }
    }
}

