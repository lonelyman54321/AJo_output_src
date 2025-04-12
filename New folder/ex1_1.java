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
import in.juspay.hypersdk.analytics.LogSessioniser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ex1
 */
public final class ex1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (ij2_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                LinearLayout linearLayout = ((ij2_2)object).g;
                LinearLayout linearLayout2 = null;
                String string2 = "parentLayout";
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    linearLayout = null;
                }
                Object object2 = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_action_popup;
                object2 = hv3_0.K(n7);
                int n8 = R$string.select_size;
                String string3 = hv3_0.K(n8);
                Object[] objectArray = new Object[n3];
                objectArray[0] = string3;
                string3 = "format(...)";
                zw_0.a(objectArray, n3, (String)object2, string3, linearLayout);
                LinearLayout linearLayout3 = ((ij2_2)object).g;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    linearLayout2 = linearLayout3;
                }
                ai0_2.a((View)linearLayout2);
                return;
            }
            case 0: 
        }
        LogSessioniser.f((LogSessioniser)object);
    }
}

