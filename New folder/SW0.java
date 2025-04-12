/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.Matrix
 */
import android.opengl.Matrix;

public final class SW0 {
    public final float[] a;
    public final float[] b;
    public final Dn3 c;
    public boolean d;

    public SW0() {
        int n3 = 16;
        float[] fArray = new float[n3];
        this.a = fArray;
        Object object = new float[n3];
        this.b = object;
        object = new Dn3;
        this.c = object;
    }

    public static void a(float[] fArray, float[] fArray2) {
        float f5;
        Matrix.setIdentityM((float[])fArray, (int)0);
        int n3 = 10;
        float f6 = fArray2[n3];
        f6 *= f6;
        int n4 = 8;
        float f7 = fArray2[n4];
        f6 = (float)Math.sqrt(f7 * f7 + f6);
        fArray[0] = f7 = fArray2[n3] / f6;
        float f8 = fArray2[n4];
        fArray[2] = f5 = f8 / f6;
        fArray[n4] = f8 = -f8 / f6;
        fArray[n3] = f7;
    }
}

