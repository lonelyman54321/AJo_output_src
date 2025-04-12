/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.DefaultExecutor;

/*
 * Renamed from Hl0
 */
public final class hl0_2 {
    public static final ao0_1 a;

    static {
        boolean bl2;
        Object object = "kotlinx.coroutines.main.delay";
        int n3 = ih3_2.a;
        try {
            object = System.getProperty((String)object);
        }
        catch (SecurityException securityException) {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            bl2 = Boolean.parseBoolean((String)object);
        } else {
            bl2 = false;
            object = null;
        }
        if (!bl2) {
            object = DefaultExecutor.i;
        } else {
            object = ir0_2.a;
            object = bg1_1.a;
            object.getClass();
            n3 = object instanceof ao0_1;
            object = n3 == 0 ? DefaultExecutor.i : (ao0_1)object;
        }
        a = object;
    }
}

