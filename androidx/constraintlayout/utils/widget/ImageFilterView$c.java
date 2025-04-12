/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.widget.ImageView
 */
package androidx.constraintlayout.utils.widget;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

public final class ImageFilterView$c {
    public final float[] a;
    public final ColorMatrix b;
    public final ColorMatrix c;
    public float d;
    public float e;
    public float f;
    public float g;

    public ImageFilterView$c() {
        float f5;
        Object object = new float[20];
        this.a = object;
        object = new ColorMatrix;
        this.b = (ColorMatrix)object;
        object = new ColorMatrix;
        super();
        this.c = (ColorMatrix)object;
        this.d = f5 = 1.0f;
        this.e = f5;
        this.f = f5;
        this.g = f5;
    }

    public final void a(ImageView imageView) {
        ColorMatrix colorMatrix;
        float f5;
        ColorMatrixColorFilter colorMatrixColorFilter;
        Object object;
        float f6;
        float f7;
        int n3;
        ImageFilterView$c imageFilterView$c = this;
        ColorMatrix colorMatrix2 = this.b;
        colorMatrix2.reset();
        float f8 = this.e;
        int n4 = 13;
        float f11 = 1.8E-44f;
        int n7 = 12;
        float f12 = 1.7E-44f;
        int n8 = 11;
        float f14 = 1.5E-44f;
        int n10 = 10;
        float f15 = 1.4E-44f;
        int n14 = 9;
        float f16 = 1.3E-44f;
        int n15 = 8;
        float f17 = 1.1E-44f;
        int n16 = 7;
        float f18 = 9.8E-45f;
        int n17 = 6;
        float f19 = 8.4E-45f;
        int n18 = 5;
        float f20 = 7.0E-45f;
        int n19 = 4;
        int n20 = 3;
        int n21 = 2;
        float[] fArray = this.a;
        int n22 = 1;
        float f22 = 1.0f;
        float f23 = f8 == f22 ? 0 : (f8 > f22 ? 1 : -1);
        if (f23 != false) {
            float f24 = f22 - f8;
            float f25 = 0.2999f * f24;
            n3 = 1058424226;
            f7 = 0.587f * f24;
            fArray[0] = f6 = f25 + f8;
            fArray[n22] = f7;
            fArray[n21] = f24 *= 0.114f;
            fArray[n20] = 0.0f;
            fArray[n19] = 0.0f;
            fArray[n18] = f25;
            fArray[n17] = f6 = f7 + f8;
            fArray[n16] = f24;
            fArray[n15] = 0.0f;
            fArray[n14] = 0.0f;
            fArray[n10] = f25;
            fArray[n8] = f7;
            fArray[n7] = f24 += f8;
            fArray[n4] = 0.0f;
            fArray[14] = 0.0f;
            fArray[15] = 0.0f;
            fArray[16] = 0.0f;
            fArray[17] = 0.0f;
            fArray[18] = f22;
            fArray[19] = 0.0f;
            colorMatrix2.set(fArray);
            object = 1;
            f8 = Float.MIN_VALUE;
        } else {
            object = 0;
            f8 = 0.0f;
            colorMatrixColorFilter = null;
        }
        f11 = imageFilterView$c.f;
        ColorMatrix colorMatrix3 = imageFilterView$c.c;
        n3 = (int)(f11 == f22 ? 0 : (f11 > f22 ? 1 : -1));
        if (n3 != 0) {
            colorMatrix3.setScale(f11, f11, f11, f22);
            colorMatrix2.postConcat(colorMatrix3);
            object = 1;
            f8 = Float.MIN_VALUE;
        }
        if ((n3 = (int)((f5 = (f11 = imageFilterView$c.g) - f22) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) != 0) {
            ColorMatrix colorMatrix4;
            double d2;
            float f26 = f11 - 0.0f;
            object = f26 == 0.0f ? 0 : (f26 < 0.0f ? -1 : 1);
            if (object <= 0) {
                n4 = 1008981770;
                f11 = 0.01f;
            }
            object = 1167867904;
            f8 = 5000.0f / f11 / 100.0f;
            n4 = 1126243996;
            f11 = 161.11957f;
            n3 = 1120334093;
            f7 = 99.4708f;
            f6 = 66.0f;
            f22 = 255.0f;
            Object object2 = f8 == f6 ? 0 : (f8 > f6 ? 1 : -1);
            if (object2 > 0) {
                object2 = 1114636288;
                float f27 = 60.0f;
                f14 = f8 - f27;
                double d5 = f14;
                d2 = Math.pow(d5, -0.13320475816726685);
                f17 = (float)d2;
                n16 = 1134877040;
                f18 = 329.69873f;
                f17 *= f18;
                double d7 = 0.07551485300064087;
                d5 = Math.pow(d5, d7);
                f15 = (float)d5;
                n14 = 1133514659;
                f16 = 288.12216f;
                f15 *= f16;
            } else {
                double d9 = Math.log(f8);
                f15 = (float)d9 * f7 - f11;
                n15 = 1132396544;
                f17 = 255.0f;
            }
            n14 = 1134069180;
            f16 = 305.0448f;
            n17 = 1124762762;
            f19 = 138.51773f;
            n18 = (int)(f8 == f6 ? 0 : (f8 < f6 ? -1 : 1));
            if (n18 < 0) {
                f20 = 19.0f;
                float f28 = f8 - f20;
                n18 = (int)(f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1));
                if (n18 > 0) {
                    n18 = 1092616192;
                    f20 = 10.0f;
                    colorMatrix4 = colorMatrix3;
                    double d12 = Math.log(f8 -= f20);
                    f8 = (float)d12 * f19 - f16;
                } else {
                    colorMatrix4 = colorMatrix3;
                    object = 0;
                    f8 = 0.0f;
                    colorMatrixColorFilter = null;
                }
            } else {
                colorMatrix4 = colorMatrix3;
                object = 1132396544;
                f8 = 255.0f;
            }
            f11 = Math.max(f17, 0.0f);
            f11 = Math.min(f22, f11);
            f12 = Math.max(f15, 0.0f);
            f12 = Math.min(f22, f12);
            f8 = Math.max(f8, 0.0f);
            f8 = Math.min(f22, f8);
            double d13 = Math.log(50.0f);
            f14 = (float)d13 * f7 - 161.11957f;
            n10 = 0x42200000;
            d2 = Math.log(40.0f);
            f15 = (float)d2 * f19 - f16;
            f16 = Math.max(f22, 0.0f);
            f16 = Math.min(f22, f16);
            f14 = Math.max(f14, 0.0f);
            f14 = Math.min(f22, f14);
            f15 = Math.max(f15, 0.0f);
            f22 = Math.min(f22, f15);
            f12 /= f14;
            f8 /= f22;
            fArray[0] = f11 /= f16;
            fArray[n22] = 0.0f;
            fArray[n21] = 0.0f;
            fArray[n20] = 0.0f;
            fArray[n19] = 0.0f;
            fArray[5] = 0.0f;
            fArray[6] = f12;
            fArray[7] = 0.0f;
            fArray[8] = 0.0f;
            fArray[9] = 0.0f;
            fArray[10] = 0.0f;
            fArray[11] = 0.0f;
            fArray[12] = f8;
            fArray[13] = 0.0f;
            fArray[14] = 0.0f;
            fArray[15] = 0.0f;
            fArray[16] = 0.0f;
            fArray[17] = 0.0f;
            fArray[18] = f22 = 1.0f;
            fArray[19] = 0.0f;
            colorMatrix = colorMatrix4;
            colorMatrix4.set(fArray);
            colorMatrix2.postConcat(colorMatrix4);
            object = 1;
            f8 = Float.MIN_VALUE;
        } else {
            colorMatrix = colorMatrix3;
        }
        f12 = imageFilterView$c.d;
        n10 = (int)(f12 == f22 ? 0 : (f12 > f22 ? 1 : -1));
        if (n10 != 0) {
            fArray[0] = f12;
            fArray[n22] = 0.0f;
            fArray[n21] = 0.0f;
            fArray[n20] = 0.0f;
            fArray[n19] = 0.0f;
            fArray[5] = 0.0f;
            fArray[6] = f12;
            fArray[7] = 0.0f;
            fArray[8] = 0.0f;
            fArray[9] = 0.0f;
            fArray[10] = 0.0f;
            fArray[11] = 0.0f;
            fArray[12] = f12;
            fArray[13] = 0.0f;
            fArray[14] = 0.0f;
            fArray[15] = 0.0f;
            fArray[16] = 0.0f;
            fArray[17] = 0.0f;
            fArray[18] = f22 = 1.0f;
            object = 19;
            f8 = 2.7E-44f;
            fArray[object] = 0.0f;
            colorMatrix.set(fArray);
            colorMatrix2.postConcat(colorMatrix);
        } else {
            n22 = object;
        }
        if (n22 != 0) {
            colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix2);
            colorMatrix2 = imageView;
            imageView.setColorFilter((ColorFilter)colorMatrixColorFilter);
        } else {
            colorMatrix2 = imageView;
            imageView.clearColorFilter();
        }
    }
}

