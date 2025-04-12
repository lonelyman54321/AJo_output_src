/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;

/*
 * Renamed from Vu0
 */
public final class vu0_2
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DrawerLayout a;

    public /* synthetic */ vu0_2(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DrawerLayoutUtils.a(this.a, valueAnimator);
    }
}

