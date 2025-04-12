/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable2$AnimationCallback
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public abstract class Mj {
    Animatable2.AnimationCallback mPlatformCallback;

    public Animatable2.AnimationCallback getPlatformCallback() {
        Animatable2.AnimationCallback animationCallback = this.mPlatformCallback;
        if (animationCallback == null) {
            this.mPlatformCallback = animationCallback = new Mj$a(this);
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable2) {
    }

    public void onAnimationStart(Drawable drawable2) {
    }
}

