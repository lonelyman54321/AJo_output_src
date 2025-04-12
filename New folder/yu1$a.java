/*
 * Decompiled with CFR 0.152.
 */
public final class yu1$a {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        yu1$a.a(0.0f);
        float f5 = 0.5f;
        yu1$a.a(f5);
        a = f5;
        f5 = -1.0f;
        yu1$a.a(f5);
        b = f5;
        f5 = 1.0f;
        yu1$a.a(f5);
        c = f5;
    }

    public static void a(float f5) {
        String string2;
        block3: {
            block2: {
                float f6;
                float f7 = 0.0f;
                string2 = null;
                float f8 = 0.0f - f5;
                Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object <= 0 && (object = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) break block2;
                object = -1082130432;
                f7 = -1.0f;
                float f11 = f5 - f7;
                Object object2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (object2 != false) break block3;
            }
            return;
        }
        string2 = "topRatio should be in [0..1] range or -1".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

