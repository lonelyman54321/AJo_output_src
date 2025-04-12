/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LH
 */
public final class lh_1 {
    public final cc1_1 a;

    public lh_1() {
        fj0_1 fj0_12;
        this.a = fj0_12;
    }

    public final boolean a(Context context, RemoteMessage object) {
        boolean bl2;
        ((fj0_1)this.a).getClass();
        Bundle bundle = fj0_1.a((RemoteMessage)object);
        if (bundle != null) {
            Intrinsics.checkNotNullParameter(bundle, "messageBundle");
            String string2 = "message";
            Intrinsics.checkNotNullParameter(object, string2);
            int n3 = ((RemoteMessage)object).getOriginalPriority();
            int n4 = ((RemoteMessage)object).getPriority();
            if (n3 != n4) {
                int n7 = ((RemoteMessage)object).getPriority();
                object = n7 != 0 ? (n7 != (n3 = 1) ? (n7 != (n3 = 2) ? "" : "normal") : "high") : "fcm_unknown";
                string2 = "wzrk_pn_prt";
                bundle.putString(string2, (String)object);
            }
            object = YB2$a.a;
            string2 = XB2$a.FCM.toString();
            bl2 = ((yb2_0)object).b(context, string2, bundle);
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }
}

