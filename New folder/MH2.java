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

public final class MH2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ MH2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View gn1_2Array) {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.f((InterstitialActivity)object, (View)gn1_2Array);
                return;
            }
            case 0: 
        }
        gn1_2Array = oh2_2.h;
        object = (oh2_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

