/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.task.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.HashMap;

public final class xV
implements ao_0 {
    public static final xV$a Companion;

    static {
        xV$a xV$a;
        Companion = xV$a = new Object();
    }

    public final void a() {
        block15: {
            AJIOApplication.Companion.getClass();
            Object object = AJIOApplication$a.a();
            com.clevertap.android.sdk.a.g((Context)object);
            int n3 = vl1_2.c();
            if (n3 != 0) {
                object = a$a.DEBUG;
                com.clevertap.android.sdk.a.c = n3 = ((a$a)((Object)object)).intValue();
            }
            com.clevertap.android.sdk.a.f = object = new Object();
            n3 = Build.VERSION.SDK_INT;
            int n4 = 24;
            if (n3 >= n4) {
                Object object2;
                int n7;
                int n8;
                Object object3;
                object = AJIOApplication$a.a();
                Object object4 = com.clevertap.android.sdk.a.g((Context)object);
                if (object4 == null && (object3 = com.clevertap.android.sdk.a.e) != null && (n8 = (int)(((HashMap)object3).isEmpty() ? 1 : 0)) == 0) {
                    object3 = com.clevertap.android.sdk.a.e.keySet().iterator();
                    while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        object4 = (String)object3.next();
                        object2 = com.clevertap.android.sdk.a.e;
                        if ((object4 = (com.clevertap.android.sdk.a)((HashMap)object2).get(object4)) == null) continue;
                    }
                }
                if (object4 == null) {
                    b.j();
                } else {
                    n8 = Build.VERSION.SDK_INT;
                    n7 = 26;
                    if (n8 < n7) break block15;
                    object3 = ((com.clevertap.android.sdk.a)object4).b;
                    object3 = ((H80)object3).a;
                    object3 = jh_1.a((CleverTapInstanceConfig)object3);
                    object3 = ((kh_1)object3).b();
                    object2 = "createNotificationChannel";
                    rv_0 rv_02 = new rv_0((AJIOApplication)object, (com.clevertap.android.sdk.a)object4);
                    try {
                        ((a)object3).c((String)object2, rv_02);
                    }
                    catch (Throwable throwable) {
                        object = ((com.clevertap.android.sdk.a)object4).f();
                        ((com.clevertap.android.sdk.a)object4).b();
                        object.getClass();
                        b.m();
                    }
                }
            }
        }
    }
}

