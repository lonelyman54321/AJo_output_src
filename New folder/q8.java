/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class q8
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ q8(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onSharedPreferenceChanged(SharedPreferences object, String object2) {
        Object object3 = q9_0.Companion;
        object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        yn3$a yn3$a = yn3_0.a;
        Object object4 = new Object[]{};
        String string2 = "DEEPLINK_LISTENER Deep link changed";
        yn3$a.a(string2, (Object[])object4);
        object4 = "deeplink";
        boolean bl2 = Intrinsics.areEqual(object4, object2);
        if (bl2) {
            object = object.getString((String)object2, "");
            object2 = kp1_0.c("DEEPLINK_LISTENER Deep link retrieved: ", (String)object);
            object4 = new Object[]{};
            yn3$a.a((String)object2, (Object[])object4);
            if (object == null) {
                object2 = "The deep link retrieval failed";
            } else {
                object3.getClass();
                int n3 = ((String)object).length();
                object2 = n3 == 0 ? "Deep link empty" : object;
            }
            bl2 = ((q9_0)object3).qb();
            if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                object4 = kj0_1.g();
                object3 = ((Fragment)object3).requireActivity();
                ((kj0_1)object4).w((Activity)object3, (String)object);
            }
            object = "DEEPLINK ".concat((String)object2);
            object2 = new Object[]{};
            yn3$a.a((String)object, object2);
        }
    }
}

