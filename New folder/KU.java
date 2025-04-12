/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.widget.ImageView
 */
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

public final class KU
extends ImageView {
    public Animation.AnimationListener a;

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            Animation animation = this.getAnimation();
            animationListener.onAnimationEnd(animation);
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            Animation animation = this.getAnimation();
            animationListener.onAnimationStart(animation);
        }
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
    }

    public final void setBackgroundColor(int n3) {
        Drawable drawable2 = this.getBackground();
        boolean bl2 = drawable2 instanceof ShapeDrawable;
        if (bl2) {
            drawable2 = ((ShapeDrawable)this.getBackground()).getPaint();
            drawable2.setColor(n3);
        }
    }
}

