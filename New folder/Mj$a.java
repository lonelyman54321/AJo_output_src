/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable2$AnimationCallback
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public final class Mj$a
extends Animatable2.AnimationCallback {
    public final /* synthetic */ Mj a;

    public Mj$a(Mj mj) {
        this.a = mj;
    }

    public final void onAnimationEnd(Drawable drawable2) {
        this.a.onAnimationEnd(drawable2);
    }

    public final void onAnimationStart(Drawable drawable2) {
        this.a.onAnimationStart(drawable2);
    }
}

