/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GH2
 */
public final class gh2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gh2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View gn1_2Array) {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.d((InterstitialActivity)object, (View)gn1_2Array);
                return;
            }
            case 0: 
        }
        gn1_2Array = ih2_2.q;
        object = (ih2_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

