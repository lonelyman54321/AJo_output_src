/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from wz
 */
public final class wz_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        String string2 = "this$0";
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (s)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((s)object).t();
                return;
            }
            case 1: {
                object = (nz1_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = ((nz1_2)object).a;
                n4 = 0;
                LinearLayout linearLayout = null;
                String string3 = "parentLyt";
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    string2 = null;
                }
                Object object2 = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_alert_popup;
                object2 = hv3_0.K(n7);
                Object[] objectArray = new Object[n3];
                objectArray[0] = "";
                String string4 = "format(...)";
                zw_0.a(objectArray, n3, (String)object2, string4, (LinearLayout)string2);
                LinearLayout linearLayout2 = ((nz1_2)object).a;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    linearLayout = linearLayout2;
                }
                ai0_2.a((View)linearLayout);
                return;
            }
            case 0: 
        }
        BottomAppBar.a((View)object);
    }
}

