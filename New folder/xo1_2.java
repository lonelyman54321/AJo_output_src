/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xo1
 */
public final class xo1_2
implements wW0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ xo1_2(Object object) {
        this.a = object;
    }

    public void a(Bundle bundle, String object) {
        int n3;
        lq2_1 lq2_12 = (lq2_1)this.a;
        Intrinsics.checkNotNullParameter(lq2_12, "this$0");
        Intrinsics.checkNotNullParameter(object, "requestKey");
        String string2 = "resultBundle";
        Intrinsics.checkNotNullParameter(bundle, string2);
        int n4 = ((String)object).hashCode();
        int n7 = 731097229;
        if (n4 == n7 && (n3 = ((String)object).equals(string2 = "permission_result")) != 0) {
            object = "result";
            int n8 = bundle.getInt((String)object);
            if (n8 == (n3 = 100)) {
                lq2_12.getClass();
                bundle = new Intent();
                bundle.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a().getPackageName();
                string2 = "package";
                n7 = 0;
                object = Uri.fromParts((String)string2, (String)object, null);
                bundle.setData((Uri)object);
                object = lq2_12.h;
                if (object != null) {
                    ((I3)object).a(bundle);
                }
            } else {
                lq2_12.h();
            }
        } else {
            lq2_12.h();
        }
    }
}

