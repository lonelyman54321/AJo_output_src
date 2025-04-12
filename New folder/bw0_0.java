/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Paint
 */
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/*
 * Renamed from bw0
 */
public final class bw0_0 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public int d = 0;
    public float[] e;

    public bw0_0(bw0_0 bw0_02) {
        int n3;
        float f5;
        this.a = f5 = bw0_02.a;
        this.b = f5 = bw0_02.b;
        this.c = f5 = bw0_02.c;
        this.d = n3 = bw0_02.d;
        this.e = null;
    }

    public final void a(Paint paint, int n3) {
        int n4 = Color.alpha((int)this.d);
        n3 = mp1_0.c(n3);
        float f5 = n4;
        int n7 = 1132396544;
        float f6 = 255.0f;
        f5 /= f6;
        float f7 = n3;
        if ((n3 = (int)(f5 = f5 * f7 / f6 * f6)) > 0) {
            n4 = Color.red((int)this.d);
            n7 = Color.green((int)this.d);
            int n8 = Color.blue((int)this.d);
            n3 = Color.argb((int)n3, (int)n4, (int)n7, (int)n8);
            f5 = this.a;
            n7 = 1;
            f5 = Math.max(f5, Float.MIN_VALUE);
            f6 = this.b;
            float f8 = this.c;
            paint.setShadowLayer(f5, f6, f8, n3);
        } else {
            paint.clearShadowLayer();
        }
    }

    public final void b(int n3) {
        int n4 = Color.alpha((int)this.d);
        n3 = Math.round((float)(mp1_0.c(n3) * n4) / 255.0f);
        n4 = Color.red((int)this.d);
        int n7 = Color.green((int)this.d);
        int n8 = Color.blue((int)this.d);
        this.d = n3 = Color.argb((int)n3, (int)n4, (int)n7, (int)n8);
    }

    public final void c(Matrix matrix) {
        float f5;
        float f6;
        float f7;
        float[] fArray = this.e;
        if (fArray == null) {
            int n3 = 2;
            f7 = 2.8E-45f;
            this.e = fArray = new float[n3];
        }
        fArray = this.e;
        fArray[0] = f6 = this.b;
        f6 = this.c;
        int n4 = 1;
        fArray[n4] = f6;
        matrix.mapVectors(fArray);
        fArray = this.e;
        this.b = f6 = fArray[0];
        this.c = f7 = fArray[n4];
        f7 = this.a;
        this.a = f5 = matrix.mapRadius(f7);
    }
}

