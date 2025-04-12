/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;

public final class Oo$a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a() {
        boolean bl2 = og1_1.c();
        if (bl2) return false;
        Object object = z40_0.Companion;
        long l2 = 3444L;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "current_versioncode";
        long l3 = ((ao0_0)object).h(string2);
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 >= 0) return false;
        return true;
    }
}

