/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xQ0
 */
public final class xq0_1
extends zj0_0 {
    public final void b(Bundle bundle, String string2, String string3, boolean bl2) {
        String string4 = string2;
        String string5 = string3;
        Intrinsics.checkNotNullParameter(string2, "deepLinkUrl");
        Activity activity = this.a;
        boolean bl3 = activity instanceof AjioHomeActivity;
        Bundle bundle2 = null;
        activity = bl3 ? (AjioHomeActivity)activity : null;
        if (activity != null) {
            boolean bl4;
            boolean bl5;
            String string6;
            boolean bl6;
            String string7;
            boolean bl7;
            String string8;
            boolean bl8;
            String string9;
            boolean bl9;
            Object object;
            boolean bl10;
            Object object2;
            bl3 = activity.s1;
            boolean bl11 = activity.u1;
            int n3 = bl2 ^ true;
            Object object3 = od3_2.a;
            int n4 = ((String)object3).length();
            if (n4 > 0) {
                object3 = od3_2.a;
            } else {
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                object3 = new jo_2((Context)object2);
                object3 = ((jo_2)object3).k();
                if (object3 == null) {
                    object3 = ld3_2.STORE_AJIO.getStoreId();
                }
            }
            object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
            n4 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
            n4 = (n4 != 0 || (n4 = (int)(activity.t1 ? 1 : 0)) != 0) && (n4 = (int)(activity.v1 ? 1 : 0)) == 0 ? 1 : n3;
            Fragment fragment = activity.T0;
            Object object4 = fq0_2.Companion;
            object2 = "ajiogram.ajio.com";
            boolean bl12 = Intrinsics.areEqual(string4, object2);
            if (bl12 || (bl10 = Intrinsics.areEqual(string4, object = "http://ajiogram.ajio.com")) || (bl9 = Intrinsics.areEqual(string4, string9 = "https://ajiogram.ajio.com")) || (bl8 = Intrinsics.areEqual(string4, string8 = "https://ajiogram.ajio.com/")) || (bl7 = Intrinsics.areEqual(string4, string7 = "https://www.ajiogram.ajio.com")) || (bl6 = Intrinsics.areEqual(string4, string6 = "http://ajiogram.ajio.com/")) || string5 != null && ((bl5 = Intrinsics.areEqual(string5, object2)) || (bl5 = Intrinsics.areEqual(string5, object)) || (bl5 = Intrinsics.areEqual(string5, string9)) || (bl5 = Intrinsics.areEqual(string5, string8)) || (bl5 = Intrinsics.areEqual(string5, string7)) || (bl4 = Intrinsics.areEqual(string5, string6)))) {
                string4 = null;
            }
            bl4 = activity.t1;
            object4.getClass();
            object4 = new fq0_2();
            bundle2 = new Bundle();
            bundle2.putString("deep-link-url", string4);
            object2 = bundle;
            bundle2.putBundle("deep-link-extra-bundle", bundle);
            bundle2.putBoolean("deep-link-should-show-coachmark", bl3);
            bundle2.putBoolean("should_open_home", bl11);
            bundle2.putBoolean("is_via_internal_deeplink", bl4);
            ((Fragment)object4).setArguments(bundle2);
            object2 = fq0_2.J;
            object = Boolean.FALSE;
            activity.Q1(fragment, (Fragment)object4, n4 != 0, (String)object2, (Boolean)object);
            string4 = null;
            activity.u1 = false;
            activity.t1 = false;
            activity.v1 = false;
        }
    }
}

