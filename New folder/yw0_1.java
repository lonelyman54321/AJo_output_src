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
import com.ril.ajio.payment.fragment.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Yw0
 */
public final class yw0_1
implements Runnable {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ b b;

    public /* synthetic */ yw0_1(LinearLayout linearLayout, b b2) {
        this.a = linearLayout;
        this.b = b2;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_info_popup;
            object2 = hv3_0.K(n4);
            float f5 = ((b)object).a;
            object = qz2_0.u(f5);
            object = kp1_0.c("You Earned ", (String)object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "format(...)";
            zw_0.a(objectArray, n3, (String)object2, (String)object, linearLayout);
        }
        if (linearLayout != null) {
            ai0_2.a((View)linearLayout);
        }
    }
}

