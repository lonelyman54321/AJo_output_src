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

public final class vW
implements Runnable {
    public final /* synthetic */ aw_1 a;

    public /* synthetic */ vW(aw_1 aw_12) {
        this.a = aw_12;
    }

    public final void run() {
        LinearLayout linearLayout;
        int n3 = 1;
        aw_1 aw_12 = this.a;
        Intrinsics.checkNotNullParameter(aw_12, "this$0");
        LinearLayout linearLayout2 = aw_12.a;
        if (linearLayout2 != null) {
            Object object = StringCompanionObject.INSTANCE;
            int n4 = R$string.acc_action_popup;
            object = hv3_0.K(n4);
            int n7 = R$string.select_size;
            String string2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            string2 = "format(...)";
            zw_0.a(objectArray, n3, (String)object, string2, linearLayout2);
        }
        if ((linearLayout = aw_12.a) != null) {
            ai0_2.a((View)linearLayout);
        }
    }
}

