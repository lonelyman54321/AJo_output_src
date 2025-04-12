/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.res.ColorStateList
 */
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;

/*
 * Renamed from Mm
 */
public final class mm_0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ ColorStateList b;
    public final /* synthetic */ ColorStateList c;
    public final /* synthetic */ MaterialShapeDrawable d;
    public final /* synthetic */ Integer e;

    public /* synthetic */ mm_0(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer n3) {
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.d = materialShapeDrawable;
        this.e = n3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialShapeDrawable materialShapeDrawable = this.d;
        Integer n3 = this.e;
        AppBarLayout appBarLayout = this.a;
        ColorStateList colorStateList = this.b;
        ColorStateList colorStateList2 = this.c;
        AppBarLayout.b(appBarLayout, colorStateList, colorStateList2, materialShapeDrawable, n3, valueAnimator);
    }
}

