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
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public class Group
extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public final void g(ConstraintLayout constraintLayout) {
        this.f(constraintLayout);
    }

    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.e = false;
    }

    public final void n() {
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)this.getLayoutParams();
        constraintLayout$LayoutParams.q0.W(0);
        constraintLayout$LayoutParams.q0.R(0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e();
    }

    public void setElevation(float f5) {
        super.setElevation(f5);
        this.e();
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        this.e();
    }
}

