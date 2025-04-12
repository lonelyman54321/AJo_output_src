/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;

public class Constraints$LayoutParams
extends ConstraintLayout$LayoutParams {
    public final float A0;
    public final float B0;
    public final float C0;
    public final float D0;
    public final float r0;
    public final boolean s0;
    public final float t0;
    public final float u0;
    public final float v0;
    public final float w0;
    public final float x0;
    public final float y0;
    public final float z0;

    public Constraints$LayoutParams() {
        float f5;
        int n3 = -2;
        super(n3, n3);
        this.r0 = f5 = 1.0f;
        this.s0 = false;
        this.t0 = 0.0f;
        this.u0 = 0.0f;
        this.v0 = 0.0f;
        this.w0 = 0.0f;
        this.x0 = f5;
        this.y0 = f5;
        this.z0 = 0.0f;
        this.A0 = 0.0f;
        this.B0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = 0.0f;
    }

    public Constraints$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        int n3 = 1065353216;
        this.r0 = f5 = 1.0f;
        this.s0 = false;
        int n4 = 0;
        float f6 = 0.0f;
        this.t0 = 0.0f;
        this.u0 = 0.0f;
        this.v0 = 0.0f;
        this.w0 = 0.0f;
        this.x0 = f5;
        this.y0 = f5;
        this.z0 = 0.0f;
        this.A0 = 0.0f;
        this.B0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = 0.0f;
        int[] nArray = R$styleable.ConstraintSet;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        int n7 = context.getIndexCount();
        for (int i3 = 0; i3 < n7; ++i3) {
            n3 = context.getIndex(i3);
            if (n3 == (n4 = R$styleable.ConstraintSet_android_alpha)) {
                f6 = this.r0;
                this.r0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_elevation;
            if (n3 == n4) {
                f6 = this.t0;
                this.t0 = f5 = context.getFloat(n3, f6);
                n3 = 1;
                f5 = Float.MIN_VALUE;
                this.s0 = n3;
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_rotationX;
            if (n3 == n4) {
                f6 = this.v0;
                this.v0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_rotationY;
            if (n3 == n4) {
                f6 = this.w0;
                this.w0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_rotation;
            if (n3 == n4) {
                f6 = this.u0;
                this.u0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_scaleX;
            if (n3 == n4) {
                f6 = this.x0;
                this.x0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_scaleY;
            if (n3 == n4) {
                f6 = this.y0;
                this.y0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_transformPivotX;
            if (n3 == n4) {
                f6 = this.z0;
                this.z0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_transformPivotY;
            if (n3 == n4) {
                f6 = this.A0;
                this.A0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_translationX;
            if (n3 == n4) {
                f6 = this.B0;
                this.B0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_translationY;
            if (n3 == n4) {
                f6 = this.C0;
                this.C0 = f5 = context.getFloat(n3, f6);
                continue;
            }
            n4 = R$styleable.ConstraintSet_android_translationZ;
            if (n3 != n4) continue;
            f6 = this.D0;
            this.D0 = f5 = context.getFloat(n3, f6);
        }
        context.recycle();
    }
}

