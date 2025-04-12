/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class rx1 {
    public static final nx1 a;

    static {
        nx1 nx12;
        a = nx12 = new Object();
    }

    public static void a() {
        a.getClass();
    }

    public static void b(String string2) {
        a.getClass();
        HashSet hashSet = nx1.a;
        boolean bl2 = hashSet.contains(string2);
        if (!bl2) {
            hashSet.add(string2);
        }
    }

    public static void c(String string2, Throwable serializable) {
        a.getClass();
        serializable = nx1.a;
        boolean bl2 = ((HashSet)serializable).contains(string2);
        if (!bl2) {
            ((HashSet)serializable).add(string2);
        }
    }
}

