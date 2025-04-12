/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

public final class PerspectiveTransform {
    private final float a11;
    private final float a12;
    private final float a13;
    private final float a21;
    private final float a22;
    private final float a23;
    private final float a31;
    private final float a32;
    private final float a33;

    private PerspectiveTransform(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, float f16) {
        this.a11 = f5;
        this.a12 = f8;
        this.a13 = f14;
        this.a21 = f6;
        this.a22 = f11;
        this.a23 = f15;
        this.a31 = f7;
        this.a32 = f12;
        this.a33 = f16;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f22, float f23, float f24) {
        PerspectiveTransform perspectiveTransform = PerspectiveTransform.quadrilateralToSquare(f5, f6, f7, f8, f11, f12, f14, f15);
        return PerspectiveTransform.squareToQuadrilateral(f16, f17, f18, f19, f20, f22, f23, f24).times(perspectiveTransform);
    }

    public static PerspectiveTransform quadrilateralToSquare(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15) {
        return PerspectiveTransform.squareToQuadrilateral(f5, f6, f7, f8, f11, f12, f14, f15).buildAdjoint();
    }

    public static PerspectiveTransform squareToQuadrilateral(float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15) {
        float f16;
        float f17 = f5 - f7 + f11 - f14;
        float f18 = f6 - f8 + f12 - f15;
        boolean bl2 = false;
        float f19 = 0.0f;
        float f20 = f17 - 0.0f;
        Object object = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        if (object == false && !(bl2 = (f16 = f18 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1))) {
            f18 = f7 - f5;
            f19 = f11 - f7;
            float f22 = f8 - f6;
            float f23 = f12 - f8;
            float f24 = f5;
            float f25 = f6;
            PerspectiveTransform perspectiveTransform = new PerspectiveTransform(f18, f19, f5, f22, f23, f6, 0.0f, 0.0f, 1.0f);
            return perspectiveTransform;
        }
        f19 = f7 - f11;
        float f26 = f14 - f11;
        float f27 = f8 - f12;
        float f28 = f15 - f12;
        float f29 = f19 * f28;
        float f30 = f26 * f27;
        f29 -= f30;
        f30 = qy_1.a(f26, f18, f28 *= f17, f29);
        float f31 = qy_1.a(f17, f27, f19 *= f18, f29);
        f17 = f7 - f5;
        f18 = f30 * f7 + f17;
        f17 = f14 - f5;
        f19 = f31 * f14 + f17;
        f17 = f8 - f6;
        f27 = f30 * f8 + f17;
        f17 = f15 - f6;
        f28 = f31 * f15 + f17;
        f26 = f5;
        f29 = f6;
        PerspectiveTransform perspectiveTransform = new PerspectiveTransform(f18, f19, f5, f27, f28, f6, f30, f31, 1.0f);
        return perspectiveTransform;
    }

    public PerspectiveTransform buildAdjoint() {
        float f5 = this.a22;
        float f6 = this.a33;
        float f7 = f5 * f6;
        float f8 = this.a23;
        float f11 = this.a32;
        float f12 = f8 * f11;
        f7 -= f12;
        f12 = this.a31;
        float f14 = f8 * f12;
        float f15 = this.a21;
        float f16 = f15 * f6;
        f14 -= f16;
        f16 = f15 * f11;
        float f17 = f5 * f12;
        f16 -= f17;
        f17 = this.a13;
        float f18 = f17 * f11;
        float f19 = this.a12;
        float f20 = f19 * f6;
        f18 -= f20;
        f20 = this.a11;
        float f22 = f17 * f12;
        f22 = (f6 *= f20) - f22;
        float f23 = (f12 *= f19) - (f11 *= f20);
        f6 = f19 * f8;
        f11 = f17 * f5;
        float f24 = f6 - f11;
        f17 *= f15;
        f17 -= (f8 *= f20);
        f19 *= f15;
        f19 = (f20 *= f5) - f19;
        f6 = f7;
        f7 = f14;
        f8 = f16;
        f11 = f18;
        f12 = f22;
        f14 = f23;
        f15 = f24;
        f16 = f17;
        f17 = f19;
        PerspectiveTransform perspectiveTransform = new PerspectiveTransform(f6, f7, f8, f18, f22, f23, f24, f16, f19);
        return perspectiveTransform;
    }

    public PerspectiveTransform times(PerspectiveTransform perspectiveTransform) {
        float f5 = this.a11;
        float f6 = perspectiveTransform.a11;
        float f7 = f5 * f6;
        float f8 = this.a21;
        float f11 = perspectiveTransform.a12;
        float f12 = f8 * f11 + f7;
        f7 = this.a31;
        float f14 = perspectiveTransform.a13;
        float f15 = f7 * f14;
        f12 += f15;
        f15 = perspectiveTransform.a21;
        float f16 = f5 * f15;
        float f17 = perspectiveTransform.a22;
        float f18 = f8 * f17 + f16;
        f16 = perspectiveTransform.a23;
        float f19 = f7 * f16;
        f18 += f19;
        f19 = perspectiveTransform.a31;
        float f20 = perspectiveTransform.a32;
        f8 = f8 * f20 + (f5 *= f19);
        float f22 = perspectiveTransform.a33;
        f7 = f7 * f22 + f8;
        f5 = this.a12;
        f8 = f5 * f6;
        float f23 = f7;
        f7 = this.a22;
        float f24 = f7 * f11 + f8;
        f8 = this.a32;
        f24 = f8 * f14 + f24;
        float f25 = f5 * f15;
        float f26 = f7 * f17 + f25;
        f25 = f8 * f16 + f26;
        f7 = f7 * f20 + (f5 *= f19);
        f26 = f8 * f22 + f7;
        f5 = this.a13;
        f7 = this.a23;
        f11 = f11 * f7 + (f6 *= f5);
        f6 = this.a33;
        f14 = f14 * f6 + f11;
        f17 = f17 * f7 + (f15 *= f5);
        f15 = f16 * f6 + f17;
        f7 = f7 * f20 + (f5 *= f19);
        f16 = f6 * f22 + f7;
        f5 = f12;
        f6 = f18;
        f7 = f23;
        f8 = f24;
        f11 = f25;
        f12 = f26;
        PerspectiveTransform perspectiveTransform2 = new PerspectiveTransform(f5, f18, f23, f24, f25, f26, f14, f15, f16);
        return perspectiveTransform2;
    }

    public void transformPoints(float[] fArray) {
        float[] fArray2 = fArray;
        int n3 = fArray.length;
        float f5 = this.a11;
        float f6 = this.a12;
        float f7 = this.a13;
        float f8 = this.a21;
        float f11 = this.a22;
        float f12 = this.a23;
        float f14 = this.a31;
        float f15 = this.a32;
        float f16 = this.a33;
        for (int i3 = 0; i3 < n3; i3 += 2) {
            float f17;
            float f18 = fArray2[i3];
            int n4 = i3 + 1;
            float f19 = fArray2[n4];
            float f20 = f7 * f18;
            float f22 = f12 * f19 + f20 + f16;
            f20 = f5 * f18;
            fArray2[i3] = f17 = (f8 * f19 + f20 + f14) / f22;
            fArray2[n4] = f19 = (f19 * f11 + (f18 *= f6) + f15) / f22;
        }
    }

    public void transformPoints(float[] fArray, float[] fArray2) {
        int n3 = fArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5 = fArray[i3];
            float f6 = fArray2[i3];
            float f7 = this.a13 * f5;
            float f8 = this.a23 * f6 + f7;
            f7 = this.a33;
            f8 += f7;
            f7 = this.a11 * f5;
            float f11 = this.a21 * f6 + f7;
            f7 = this.a31;
            fArray[i3] = f11 = (f11 + f7) / f8;
            f7 = this.a12 * f5;
            f5 = this.a22 * f6 + f7;
            f6 = this.a32;
            fArray2[i3] = f5 = (f5 + f6) / f8;
        }
    }
}

