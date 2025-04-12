/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class UW {
    public static final UW a;
    public static ce1_0 b;

    static {
        UW uW;
        a = uW = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final ce1_0 a(Context object) {
        Object object2 = b;
        if (object2 != null) return object2;
        UW uW = a;
        synchronized (uW) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        object2 = b;
                        if (object2 == null) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return object2;
                }
                object2 = object.getApplicationContext();
                boolean bl2 = object2 instanceof de1_0;
                object2 = bl2 ? (de1_0)object2 : null;
                if (object2 != null) {
                    object = object2.a();
                } else {
                    object2 = new ce1$a((Context)object);
                    object = ((ce1$a)object2).a();
                }
                b = object;
                return object;
            }
            throw throwable2;
        }
    }
}

