/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from od3
 */
public final class od3_2 {
    public static String a = "";

    public static final String a() {
        int n3 = s20.a;
        if (n3 != 0) {
            return ld3_2.STORE_AJIOGRAM.getStoreId();
        }
        Object object = a;
        n3 = ((String)object).length();
        if (n3 > 0) {
            return a;
        }
        n3 = (int)(og1_1.c() ? 1 : 0);
        if (n3 != 0) {
            return ld3_2.STORE_LUXE.getStoreId();
        }
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        object = new jo_2((Context)aJIOApplication);
        object = ((jo_2)object).k();
        if (object == null) {
            object = ld3_2.STORE_AJIO.getStoreId();
        }
        return object;
    }

    public static boolean b() {
        boolean bl2;
        ld3_2 ld3_22;
        String string2;
        String string3;
        String string4 = a;
        int n3 = string4.length();
        if (n3 == 0) {
            string4 = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(string4, string3 = ld3_22.getStoreId()))) {
            bl2 = false;
            string4 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean c() {
        String string2 = a;
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = od3_2.a();
        }
        String string3 = ld3_2.STORE_LUXE.getStoreId();
        return Intrinsics.areEqual(string2, string3);
    }

    public static final void d() {
        a = "";
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)object);
        object = ld3_2.STORE_AJIO.getStoreId();
        jo_22.E((String)object);
    }
}

