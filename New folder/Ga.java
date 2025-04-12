/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

public final class Ga
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ga(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (NewProductDetailsFragment)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object, string2);
                boolean bl2 = og1_1.c();
                if (bl2) {
                    object = ((NewProductDetailsFragment)object).y0;
                    if (object != null) {
                        ai0_2.a((View)object);
                    }
                } else if ((object = ((NewProductDetailsFragment)object).kb().getToolbar()) != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 1: {
                AppStartTrace.d((AppStartTrace)this.b);
                return;
            }
            case 0: 
        }
        Object object = (ia_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CustomToolbarViewMerger customToolbarViewMerger = ((ia_0)object).o1;
        if (customToolbarViewMerger != null) {
            object = customToolbarViewMerger.getToolbar();
            if (object != null) {
                ai0_2.a((View)object);
            }
        } else {
            object = ((ia_0)object).q1;
            if (object != null && (object = ((pr2_2)object).e) != null) {
                ai0_2.a((View)object);
            }
        }
    }
}

