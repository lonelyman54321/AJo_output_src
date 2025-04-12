/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class u43
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SideSheetBehavior a;
    public final /* synthetic */ ViewGroup.MarginLayoutParams b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ u43(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int n3, View view) {
        this.a = sideSheetBehavior;
        this.b = marginLayoutParams;
        this.c = n3;
        this.d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int n3 = this.c;
        View view = this.d;
        SideSheetBehavior sideSheetBehavior = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.b;
        SideSheetBehavior.c(sideSheetBehavior, marginLayoutParams, n3, view, valueAnimator);
    }
}

