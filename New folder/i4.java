/*
 * Decompiled with CFR 0.152.
 */
public abstract class i4 {
    public static final i4$a b;
    public final float[] a;

    static {
        i4$a i4$a;
        float[] fArray;
        float[] fArray2 = fArray = new float[9];
        float[] fArray3 = fArray;
        fArray2[0] = 0.8951f;
        fArray3[1] = -0.7502f;
        fArray2[2] = 0.0389f;
        fArray3[3] = 0.2664f;
        fArray2[4] = 1.7135f;
        fArray3[5] = -0.0685f;
        fArray2[6] = -0.1614f;
        fArray3[7] = 0.0367f;
        fArray3[8] = 1.0296f;
        b = i4$a = new i4(fArray);
    }

    public i4(float[] fArray) {
        this.a = fArray;
    }
}

