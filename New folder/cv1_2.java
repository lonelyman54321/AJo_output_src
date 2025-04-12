/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CV1
 */
public final class cv1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cv1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                InterstitialActivity.b((InterstitialActivity)this.b, view);
                return;
            }
            case 0: 
        }
        iv1_2 iv1_22 = (iv1_2)this.b;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        view = iv1_22.c;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("couponBox");
            n3 = 0;
            view = null;
        }
        view.getText().clear();
        view = iv1_22.d;
        String string2 = "couponValidationAlert";
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            view = null;
        }
        if ((n3 = view.getVisibility()) == 0) {
            view = iv1_22.d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                view2 = view;
            }
            n3 = 8;
            view2.setVisibility(n3);
        }
    }
}

