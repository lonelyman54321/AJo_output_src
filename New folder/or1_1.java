/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from or1
 */
public final class or1_1 {
    public static final long a(int n3) {
        if (n3 > 0) {
            return n3;
        }
        String string2 = "The span value should be higher than 0".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

