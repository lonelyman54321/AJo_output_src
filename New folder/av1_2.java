/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AV1
 */
public final class av1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ av1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.a((InterstitialActivity)this.b);
                return;
            }
            case 0: 
        }
        Object object = (iv1_2)this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((iv1_2)object).q;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

