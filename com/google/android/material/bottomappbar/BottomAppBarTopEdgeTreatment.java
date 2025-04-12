/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment
extends EdgeTreatment
implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f5, float f6, float f7) {
        this.fabMargin = f5;
        this.roundedCornerRadius = f6;
        this.setCradleVerticalOffset(f7);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        float f8;
        float f11;
        boolean bl2;
        float f12;
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = this;
        float f14 = f5;
        float f15 = f7;
        ShapePath shapePath2 = shapePath;
        float f16 = this.fabDiameter;
        float f17 = f16 - 0.0f;
        Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (object == false) {
            shapePath.lineTo(f5, 0.0f);
            return;
        }
        float f18 = this.fabMargin;
        float f19 = 2.0f;
        float f20 = (f18 * f19 + f16) / f19;
        f18 = this.roundedCornerRadius;
        float f22 = f7 * f18;
        f18 = this.horizontalOffset;
        float f23 = f6 + f18;
        f18 = this.cradleVerticalOffset * f7;
        float f24 = 1.0f;
        float f25 = (f18 = xu0_1.a(f24, f7, f20, f18)) / f20;
        float f26 = f25 - f24;
        Object object2 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
        if (object2 >= 0) {
            shapePath.lineTo(f5, 0.0f);
            return;
        }
        f24 = this.fabCornerSize;
        float f27 = f24 * f7;
        f15 = -1.0f;
        float f28 = f24 - f15;
        Object object3 = f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
        if (object3 != false && (object3 = (f12 = (f15 = Math.abs(f24 = f24 * f19 - f16)) - (f16 = 0.1f)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) >= 0) {
            object3 = false;
            f15 = 0.0f;
            bl2 = false;
            f11 = 0.0f;
        } else {
            object3 = true;
            f15 = Float.MIN_VALUE;
            bl2 = true;
            f11 = Float.MIN_VALUE;
        }
        if (!bl2) {
            object3 = 1071644672;
            f15 = 1.75f;
            f8 = 0.0f;
        } else {
            f8 = f18;
            object3 = false;
            f15 = 0.0f;
        }
        f16 = f20 + f22;
        f16 *= f16;
        f18 = f8 + f22;
        f24 = f18 * f18;
        double d2 = Math.sqrt(f16 - f24);
        f16 = (float)d2;
        f24 = f23 - f16;
        float f29 = f23 + f16;
        double d5 = Math.toDegrees(Math.atan(f16 / f18));
        float f30 = (float)d5;
        float f31 = 90.0f - f30 + f15;
        shapePath2.lineTo(f24, 0.0f);
        f16 = f24 - f22;
        f24 += f22;
        float f34 = f22 * f19;
        float f35 = 270.0f;
        object = false;
        f18 = 0.0f;
        f25 = f34;
        float f36 = f30;
        shapePath.addArc(f16, 0.0f, f24, f34, f35, f30);
        object3 = 0x43340000;
        f15 = 180.0f;
        if (bl2) {
            f16 = f23 - f20;
            f18 = -f20 - f8;
            f24 = f23 + f20;
            f25 = f20 - f8;
            f35 = f15 - f31;
            f30 = (f31 *= f19) - f15;
            shapePath.addArc(f16, f18, f24, f25, f35, f30);
        } else {
            f16 = bottomAppBarTopEdgeTreatment.fabMargin;
            f11 = f27 * f19;
            f18 = f16 + f11;
            f24 = f23 - f20;
            f25 = -(f27 + f16);
            f35 = f24 + f18;
            f30 = f16 + f27;
            f8 = f15 - f31;
            float f37 = (f31 * f19 - f15) / f19;
            f16 = f24;
            f18 = f25;
            f24 = f35;
            f25 = f30;
            f35 = f8;
            f30 = f37;
            shapePath.addArc(f16, f18, f24, f25, f8, f37);
            f24 = f23 + f20;
            f15 = bottomAppBarTopEdgeTreatment.fabMargin;
            f16 = f15 / f19 + f27;
            f16 = f24 - f16;
            shapePath2.lineTo(f16, f15 += f27);
            f15 = bottomAppBarTopEdgeTreatment.fabMargin;
            f16 = f24 - (f11 += f15);
            f18 = -(f27 + f15);
            f25 = f15 + f27;
            object3 = -1028390912;
            f15 = -90.0f;
            f30 = f31 + f15;
            f35 = 90.0f;
            shapePath.addArc(f16, f18, f24, f25, f35, f30);
        }
        f16 = f29 - f22;
        f24 = f29 + f22;
        f35 = 270.0f - f36;
        f25 = f34;
        f30 = f36;
        shapePath.addArc(f16, 0.0f, f24, f34, f35, f36);
        shapePath2.lineTo(f14, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.cradleVerticalOffset = f5;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cradleVerticalOffset must be positive.");
        throw illegalArgumentException;
    }

    public void setFabCornerSize(float f5) {
        this.fabCornerSize = f5;
    }

    public void setFabCradleMargin(float f5) {
        this.fabMargin = f5;
    }

    public void setFabCradleRoundedCornerRadius(float f5) {
        this.roundedCornerRadius = f5;
    }

    public void setFabDiameter(float f5) {
        this.fabDiameter = f5;
    }

    public void setHorizontalOffset(float f5) {
        this.horizontalOffset = f5;
    }
}

