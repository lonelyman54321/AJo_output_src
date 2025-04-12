/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout$g;

public final class MotionLayout$e {
    public float a;
    public float b;
    public int c;
    public int d;
    public final /* synthetic */ MotionLayout e;

    public MotionLayout$e(MotionLayout motionLayout) {
        int n3;
        float f5;
        this.e = motionLayout;
        this.a = f5 = 0.0f / 0.0f;
        this.b = f5;
        this.c = n3 = -1;
        this.d = n3;
    }

    public final void a() {
        float f5;
        int n3;
        int n4 = this.c;
        MotionLayout motionLayout = this.e;
        int n7 = -1;
        if (n4 != n7 || (n3 = this.d) != n7) {
            if (n4 == n7) {
                n4 = this.d;
                n3 = (int)(motionLayout.isAttachedToWindow() ? 1 : 0);
                if (n3 == 0) {
                    MotionLayout$e motionLayout$e = motionLayout.u0;
                    if (motionLayout$e == null) {
                        motionLayout.u0 = motionLayout$e = new MotionLayout$e(motionLayout);
                    }
                    motionLayout$e = motionLayout.u0;
                    motionLayout$e.d = n4;
                } else {
                    motionLayout.t(n4);
                }
            } else {
                n3 = this.d;
                if (n3 == n7) {
                    motionLayout.setState(n4, n7, n7);
                } else {
                    motionLayout.setTransition(n4, n3);
                }
            }
            MotionLayout$g motionLayout$g = MotionLayout$g.SETUP;
            motionLayout.setState(motionLayout$g);
        }
        if ((n4 = (int)(Float.isNaN(f5 = this.b) ? 1 : 0)) != 0) {
            f5 = this.a;
            n4 = (int)(Float.isNaN(f5) ? 1 : 0);
            if (n4 != 0) {
                return;
            }
            f5 = this.a;
            motionLayout.setProgress(f5);
            return;
        }
        f5 = this.a;
        float f6 = this.b;
        motionLayout.setProgress(f5, f6);
        this.a = f5 = 0.0f / 0.0f;
        this.b = f5;
        this.c = n7;
        this.d = n7;
    }
}

