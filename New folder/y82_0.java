/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.Set;

/*
 * Renamed from y82
 */
public final class y82_0 {
    public static final y82_0 a;
    public static final Set b;

    static {
        y82_0 y82_02;
        a = y82_02 = new y82_0();
        b = p03_0.f("fb_mobile_purchase", "StartTrial", "Subscribe");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean a() {
        boolean bl2;
        Throwable throwable3;
        boolean bl3;
        Class<y82_0> clazz;
        block11: {
            block8: {
                Throwable throwable22;
                Object object;
                block10: {
                    Boolean bl4;
                    block9: {
                        boolean bl5;
                        clazz = y82_0.class;
                        boolean bl6 = td0.b(clazz);
                        bl3 = false;
                        if (bl6) {
                            return false;
                        }
                        try {
                            object = FacebookSdk.a();
                            bl6 = FacebookSdk.g(object);
                            if (bl6) return bl3;
                            bl6 = lz3_0.y();
                            if (bl6) return bl3;
                            object = li2_0.a;
                            object = li2_0.class;
                            bl5 = td0.b(object);
                            if (bl5) break block8;
                        }
                        catch (Throwable throwable3) {}
                        try {
                            bl4 = li2_0.b;
                            if (bl4 != null) break block9;
                            bl4 = FacebookSdk.a();
                            li2_0 li2_02 = li2_0.a;
                            if ((bl4 = li2_02.a((Context)bl4)) != null) {
                                bl5 = true;
                            } else {
                                bl5 = false;
                                bl4 = null;
                            }
                            li2_0.b = bl4 = Boolean.valueOf(bl5);
                        }
                        catch (Throwable throwable22) {
                            break block10;
                        }
                    }
                    if ((bl4 = li2_0.b) == null) break block8;
                    bl2 = bl4;
                    break block11;
                }
                td0.a(object, throwable22);
            }
            bl2 = false;
            clazz = null;
        }
        if (!bl2) return bl3;
        return true;
        td0.a(clazz, throwable3);
        return false;
    }
}

