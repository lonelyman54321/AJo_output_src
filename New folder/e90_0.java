/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/*
 * Renamed from E90
 */
public final class e90_0 {
    public static final Collection a;

    static {
        c90_0[] c90_0Array;
        String string2;
        int n3;
        Object object;
        try {
            object = new xh_2();
            n3 = 1;
        }
        catch (Throwable throwable) {
            string2 = throwable.getMessage();
            c90_0Array = new ServiceConfigurationError(string2, throwable);
            throw c90_0Array;
        }
        c90_0Array = new c90_0[n3];
        string2 = null;
        c90_0Array[0] = object;
        object = Arrays.asList(c90_0Array);
        a = kz2_1.l(ez2_1.b(object.iterator()));
    }
}

