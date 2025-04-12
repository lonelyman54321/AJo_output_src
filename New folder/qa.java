/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

public final class qa
implements Runnable {
    public final /* synthetic */ ia_0 a;

    public /* synthetic */ qa(ia_0 ia_02) {
        this.a = ia_02;
    }

    public final void run() {
        Object object = this.a;
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

