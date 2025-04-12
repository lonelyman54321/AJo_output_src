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
 * Renamed from oG1
 */
public final class og1_1 {
    public static boolean a;

    public static final void a(boolean bl2) {
        og1_1.g(bl2, false);
    }

    public static final boolean b() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "cart_swicthToAjio";
        boolean bl2 = ((ao0_0)object).a(string2);
        boolean bl3 = og1_1.f();
        if (bl3 && !bl2) {
            return a;
        }
        return false;
    }

    public static final boolean c() {
        boolean bl2 = og1_1.f();
        if (bl2) {
            return a;
        }
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        jo_22.putPreference("LUXE_FLOW", false);
        return false;
    }

    public static final boolean d() {
        boolean bl2 = og1_1.f();
        if (bl2) {
            String string2;
            String string3 = od3_2.a();
            bl2 = Intrinsics.areEqual(string3, string2 = ld3_2.STORE_LUXE.getStoreId());
            if (bl2) {
                a = bl2 = true;
            } else {
                string3 = od3_2.a();
                bl2 = Intrinsics.areEqual(string3, string2 = ld3_2.STORE_AJIOGRAM.getStoreId());
                if (bl2 || (bl2 = Intrinsics.areEqual(string3 = od3_2.a(), string2 = ld3_2.STORE_AJIO.getStoreId()))) {
                    a = false;
                }
            }
            return a;
        }
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        jo_22.putPreference("LUXE_FLOW", false);
        return false;
    }

    public static final boolean e(String object) {
        Object object2 = "storeId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = og1_1.f();
        if (bl2) {
            object2 = ld3_2.STORE_LUXE.getStoreId();
            bl2 = Intrinsics.areEqual(object, object2);
            if (bl2) {
                boolean bl3;
                a = bl3 = true;
            } else {
                boolean bl4;
                object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
                bl2 = Intrinsics.areEqual(object, object2);
                if (bl2 || (bl4 = Intrinsics.areEqual(object, object2 = ld3_2.STORE_AJIO.getStoreId()))) {
                    a = false;
                }
            }
            return a;
        }
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        object = new jo_2((Context)object2);
        ((sw_0)object).putPreference("LUXE_FLOW", false);
        return false;
    }

    public static final boolean f() {
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("luxe_enable");
    }

    public static final void g(boolean bl2, boolean bl3) {
        a = bl2;
        if (bl3) {
            AJIOApplication.Companion.getClass();
            Object object = AJIOApplication$a.a();
            Object object2 = new jo_2((Context)object);
            object = "LUXE_FLOW";
            ((sw_0)object2).putPreference((String)object, bl2);
            if (bl2) {
                Object object3 = "";
                Intrinsics.checkNotNullParameter(object3, "<set-?>");
                od3_2.a = object3;
                object2 = AJIOApplication$a.a();
                object3 = new jo_2((Context)object2);
                object2 = ld3_2.STORE_LUXE.getStoreId();
                ((jo_2)object3).E((String)object2);
            }
        }
    }
}

