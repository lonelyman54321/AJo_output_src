/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RW1
 */
public final class rw1_0
implements Runnable {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ rw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ex1_0)object).I;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

