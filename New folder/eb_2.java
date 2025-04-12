/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/*
 * Renamed from Eb
 */
public final class eb_2 {
    public static ma_2 a;
    public static CTASettings b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;
    public static Bundle f;

    static {
        Bundle bundle;
        c = bundle = new HashMap();
        d = bundle = new HashMap();
        e = bundle = new HashMap();
        f = bundle = new Bundle();
    }

    public static String a(long l2) {
        Object object = StringCompanionObject.INSTANCE;
        object = TimeUnit.MILLISECONDS;
        long l3 = ((TimeUnit)((Object)object)).toMinutes(l2);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l4 = 1L;
        long l7 = timeUnit.toMinutes(l4);
        Long l8 = l3 % l7;
        l2 = ((TimeUnit)((Object)object)).toSeconds(l2);
        long l12 = TimeUnit.MINUTES.toSeconds(l4);
        Long l14 = l2 % l12;
        int n3 = 2;
        object = new Object[n3];
        object[0] = l8;
        object[1] = l14;
        return xh2_0.a((Object[])object, n3, "%d:%02d", "format(...)");
    }

    public static yr0_1 b() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("fleek_video_config");
        return (yr0_1)Z90.a(yr0_1.class, (String)object);
    }

    public static JSONObject c() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.d("video_support_flags");
    }

    public static boolean d(Long l2) {
        long l3;
        long l4 = l2 != null ? l2 : l3;
        long l7 = l4 - (l3 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            object = 1;
        } else {
            object = 0;
            l2 = null;
        }
        return (boolean)object;
    }

    public static boolean e(String string2) {
        String string3;
        boolean bl2;
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0 && (bl2 = Intrinsics.areEqual(string2, string3 = "VIDEO"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static Boolean f() {
        Object object;
        boolean bl2 = og1_1.c();
        boolean bl3 = false;
        if (bl2) {
            String string2;
            object = eb_2.c();
            bl2 = object.has(string2 = "enableCMSVideoForLuxeStore");
            if (bl2) {
                object = eb_2.c();
                bl3 = object.getBoolean(string2);
            }
            object = bl3;
        } else {
            String string3;
            object = eb_2.c();
            bl2 = object.has(string3 = "enableCMSVideoForAjioStore");
            if (bl2) {
                object = eb_2.c();
                bl3 = object.getBoolean(string3);
            }
            object = bl3;
        }
        return object;
    }

    public static Boolean g() {
        Object object;
        boolean bl2 = og1_1.c();
        boolean bl3 = false;
        if (bl2) {
            String string2;
            object = eb_2.c();
            bl2 = object.has(string2 = "enableSTLVideoForLuxeStore");
            if (bl2) {
                object = eb_2.c();
                bl3 = object.getBoolean(string2);
            }
            object = bl3;
        } else {
            String string3;
            object = eb_2.c();
            bl2 = object.has(string3 = "enableSTLVideoForAjioStore");
            if (bl2) {
                object = eb_2.c();
                bl3 = object.getBoolean(string3);
            }
            object = bl3;
        }
        return object;
    }
}

