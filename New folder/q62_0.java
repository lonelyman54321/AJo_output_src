/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.AFe1ySDK;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Q62
 */
public final class q62_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q62_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        ConstraintLayout constraintLayout;
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                ((AFe1ySDK)object).AFAdRevenueData();
                return;
            }
            case 0: 
        }
        object = (R62)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ConstraintLayout constraintLayout2 = ((R62)object).a;
        if (constraintLayout2 != null) {
            Object object2 = StringCompanionObject.INSTANCE;
            int n7 = R$string.acc_action_popup;
            object2 = hv3_0.K(n7);
            Object[] objectArray = new Object[n3];
            objectArray[0] = "";
            String string2 = "format(...)";
            an_1.a(objectArray, n3, (String)object2, string2, constraintLayout2);
        }
        if ((constraintLayout = ((R62)object).a) != null) {
            ai0_2.a((View)constraintLayout);
        }
    }
}

