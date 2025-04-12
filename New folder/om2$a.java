/*
 * Decompiled with CFR 0.152.
 */
public final class om2$a
implements om2$b {
    public final boolean a(int n3, float[] fArray) {
        boolean bl2;
        block2: {
            block3: {
                float f5;
                float f6;
                n3 = 2;
                float f7 = fArray[n3];
                float f8 = 0.95f;
                bl2 = false;
                Object object = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
                if (object >= 0) break block2;
                object = 1028443341;
                f8 = 0.05f;
                float f11 = f7 - f8;
                n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
                if (n3 <= 0) break block2;
                f7 = fArray[0];
                f8 = 10.0f;
                int n4 = 1;
                object = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1);
                if (object < 0) break block3;
                object = 1108606976;
                f8 = 37.0f;
                float f12 = f7 - f8;
                n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (n3 <= 0 && (n3 = (int)((f6 = (f7 = fArray[n4]) - (f5 = 0.82f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) <= 0) break block2;
            }
            bl2 = true;
        }
        return bl2;
    }
}

