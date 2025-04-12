/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from KP1
 */
public final class kp1_0
implements kJ0$a {
    public static LP1 a(LP1 lP1, LP1 lP12) {
        LP1 lP13 = LP1$a.b;
        if (lP12 != lP13) {
            lP13 = new xZ(lP1, lP12);
            lP1 = lP13;
        }
        return lP1;
    }

    public static String c(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean bl2) {
        Throwable throwable2;
        Class<lg1_0> clazz;
        block4: {
            if (!bl2) return;
            clazz = lg1_0.a;
            clazz = lg1_0.class;
            boolean bl3 = td0.b(clazz);
            if (bl3) {
                return;
            }
            try {
                bl3 = ct.d();
                if (!bl3) {
                    kg1_1.g();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            AtomicBoolean atomicBoolean = lg1_0.e;
            boolean bl4 = true;
            atomicBoolean.set(bl4);
            lg1_0.d();
            return;
        }
        td0.a(clazz, throwable2);
    }
}

