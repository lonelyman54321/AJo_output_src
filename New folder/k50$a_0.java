/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.conscrypt.Conscrypt
 *  org.conscrypt.Conscrypt$Version
 */
import org.conscrypt.Conscrypt;

/*
 * Renamed from k50$a
 */
public final class k50$a_0 {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        int n3 = version.major();
        int n4 = 2;
        int n7 = 1;
        if (n3 != n4) {
            int n8 = version.major();
            if (n8 <= n4) {
                n7 = 0;
            }
            return n7 != 0;
        }
        n3 = version.minor();
        if (n3 != n7) {
            int n10 = version.minor();
            if (n10 <= n7) {
                n7 = 0;
            }
            return n7 != 0;
        }
        int n14 = version.patch();
        if (n14 < 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public static boolean b() {
        return k50_0.d;
    }
}

