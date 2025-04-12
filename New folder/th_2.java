/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.fragment.a;
import in.juspay.hypernfc.NfcActivity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from tH
 */
public final class th_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ th_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.c;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (NfcActivity)object2;
                object = (ImageView)object;
                NfcActivity.p2((NfcActivity)object2, (ImageView)object);
                return;
            }
            case 1: {
                object2 = (CrashlyticsCore)object2;
                object = (Map)object;
                CrashlyticsCore.h((CrashlyticsCore)object2, (Map)object);
                return;
            }
            case 0: 
        }
        object = (a)object;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object2 = (LinearLayout)object2;
        if (object2 != null) {
            object3 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_action_popup;
            object3 = hv3_0.K(n4);
            object = ((a)object).c;
            object = object != null ? object.getText() : null;
            object = String.valueOf(object);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "format(...)";
            zw_0.a(objectArray, n3, (String)object3, (String)object, (LinearLayout)object2);
        }
        if (object2 != null) {
            ai0_2.a((View)object2);
        }
    }
}

