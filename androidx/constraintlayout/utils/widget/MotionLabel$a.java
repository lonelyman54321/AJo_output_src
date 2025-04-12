/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

public final class MotionLabel$a
extends ViewOutlineProvider {
    public final /* synthetic */ MotionLabel a;

    public MotionLabel$a(MotionLabel motionLabel) {
        this.a = motionLabel;
    }

    public final void getOutline(View view, Outline outline) {
        view = this.a;
        int n3 = view.getWidth();
        int n4 = view.getHeight();
        float f5 = Math.min(n3, n4);
        float f6 = view.f;
        float f7 = f5 * f6 / 2.0f;
        outline.setRoundRect(0, 0, n3, n4, f7);
    }
}

