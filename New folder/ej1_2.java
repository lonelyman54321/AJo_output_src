/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ej1
 */
public final class ej1_2
implements Runnable {
    public final /* synthetic */ fj1_2 a;

    public /* synthetic */ ej1_2(fj1_2 fj1_22) {
        this.a = fj1_22;
    }

    public final void run() {
        int n3 = 1;
        fj1_2 fj1_22 = this.a;
        Intrinsics.checkNotNullParameter(fj1_22, "this$0");
        LinearLayout linearLayout = fj1_22.a;
        LinearLayout linearLayout2 = null;
        String string2 = "parentLyt";
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            linearLayout = null;
        }
        Object object = StringCompanionObject.INSTANCE;
        int n4 = R$string.acc_info_popup;
        object = hv3_0.K(n4);
        int n7 = R$string.loyalty_pts;
        String string3 = hv3_0.K(n7);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string3;
        string3 = "format(...)";
        zw_0.a(objectArray, n3, (String)object, string3, linearLayout);
        LinearLayout linearLayout3 = fj1_22.a;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            linearLayout2 = linearLayout3;
        }
        ai0_2.a((View)linearLayout2);
    }
}

