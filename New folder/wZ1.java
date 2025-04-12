/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

public final class wZ1
implements Runnable {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ wZ1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((bz1_2)object).y0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
            object = null;
        }
        if ((object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

