/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nH$a
 */
public final class nh$a_0 {
    public static boolean a(long l2) {
        long l3 = System.currentTimeMillis();
        long l4 = (l2 -= l3) - (l3 = 5000L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }
}

