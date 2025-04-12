/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class Yo1 {
    public static final Hq a;
    public static volatile QU1 b;
    public static volatile NU1 c;
    public static final pv0_0 d;

    static {
        pv0_0 pv0_02;
        a = Hq.AUTOMATIC;
        d = pv0_02 = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static NU1 a(Context context) {
        context = context.getApplicationContext();
        NU1 nU1 = c;
        if (nU1 != null) return nU1;
        Class<NU1> clazz = NU1.class;
        synchronized (clazz) {
            try {
                nU1 = c;
                if (nU1 != null) return nU1;
                xo1_2 xo1_22 = new xo1_2(context);
                c = nU1 = new NU1(xo1_22);
                return nU1;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

