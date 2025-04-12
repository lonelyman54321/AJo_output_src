/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewConfiguration
 */
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.view.PaymentActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from In2
 */
public final class in2_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ in2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = "this$0";
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (b33_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Handler handler = ((b33_0)object2).H;
                object = ((b33_0)object2).G;
                long l2 = ((b33_0)object2).f;
                long l3 = ViewConfiguration.getTapTimeout();
                handler.postDelayed((Runnable)object, l2 -= l3);
                return;
            }
            case 1: {
                object2 = (ConstraintLayout)((Object)object2);
                if (object2 != null) {
                    object = StringCompanionObject.INSTANCE;
                    int n7 = R$string.acc_action_popup;
                    object = hv3_0.K(n7);
                    n4 = R$string.image_upload_guidelines;
                    String string2 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    an_1.a(objectArray, n3, (String)object, string2, (ConstraintLayout)((Object)object2));
                }
                if (object2 != null) {
                    ai0_2.a((View)object2);
                }
                return;
            }
            case 0: 
        }
        n3 = PaymentActivity.I0;
        object2 = (PaymentActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        AppBarLayout appBarLayout = ((PaymentActivity)object2).X;
        if (appBarLayout != null) {
            ai0_2.a((View)appBarLayout);
        }
    }
}

