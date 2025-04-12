/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

public final class ZX1
implements Runnable {
    public final /* synthetic */ oy1_1 a;

    public /* synthetic */ ZX1(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CustomToolbarViewMerger customToolbarViewMerger = ((oy1_1)object).H;
        if (customToolbarViewMerger == null) {
            object = ((oy1_1)object).R;
            if (object != null && (object = ((pr2_2)object).e) != null) {
                ai0_2.a((View)object);
            }
        } else {
            object = customToolbarViewMerger.getToolbar();
            if (object != null) {
                ai0_2.a((View)object);
            }
        }
    }
}

