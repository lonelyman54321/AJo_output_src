/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nl
 */
public final class nl_1 {
    public static boolean a(ol_1 ol_12, long l2) {
        long l3 = ol_12.e();
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            object = 1;
        } else {
            object = 0;
            ol_12 = null;
        }
        return (boolean)object;
    }
}

