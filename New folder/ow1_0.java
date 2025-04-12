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
 * Renamed from OW1
 */
public final class ow1_0
implements Runnable {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ ow1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((ex1_0)object).I;
        if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
            ai0_2.a((View)object2);
        }
        if ((object = ((ex1_0)object).J) != null) {
            ai0_2.a((View)object);
        }
    }
}

