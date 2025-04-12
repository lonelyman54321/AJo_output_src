/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qU1
 */
public final class qu1_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final int a(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        double d2 = object >= 0 ? Math.ceil(f5) : Math.floor(f5);
        f5 = (float)d2;
        return (int)f5 * -1;
    }
}

