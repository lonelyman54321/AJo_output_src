/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;

/*
 * Renamed from Nm
 */
public final class nm_0
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ MaterialShapeDrawable b;

    public /* synthetic */ nm_0(AppBarLayout appBarLayout, MaterialShapeDrawable materialShapeDrawable) {
        this.a = appBarLayout;
        this.b = materialShapeDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout appBarLayout = this.a;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        AppBarLayout.a(appBarLayout, materialShapeDrawable, valueAnimator);
    }
}

