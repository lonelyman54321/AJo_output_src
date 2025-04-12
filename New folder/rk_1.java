/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RK
 */
public final class rk_1
implements View.OnClickListener {
    public final /* synthetic */ sk_2 a;

    public /* synthetic */ rk_1(sk_2 sk_22) {
        this.a = sk_22;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
        String string2 = "buttonTap";
        String string3 = "Cancel";
        String string4 = "upi cancellation halfcard interactions";
        String string5 = "upi_cancellation_halfcard_interactions";
        String string6 = "upi_cancellation_halfcard_screen";
        oT.b(string4, string2, string3, string5, string6);
        object = ((sk_2)object).a;
        if (object != null) {
            object.H6();
        }
    }
}

