/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashSet;

/*
 * Renamed from iM1
 */
public final class im1_0 {
    public static final HashSet a;
    public static String b;

    static {
        HashSet hashSet;
        a = hashSet = new HashSet();
        b = "media3.common";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string2) {
        Class<im1_0> clazz = im1_0.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Serializable serializable = a;
                        boolean bl2 = ((HashSet)serializable).add(string2);
                        if (!bl2) break block4;
                        serializable = new StringBuilder();
                        String string3 = b;
                        ((StringBuilder)serializable).append(string3);
                        string3 = ", ";
                        ((StringBuilder)serializable).append(string3);
                        ((StringBuilder)serializable).append(string2);
                        b = string2 = ((StringBuilder)serializable).toString();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

