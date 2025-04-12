/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.h$c;

public final class xD3
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CD3 a;
    public final /* synthetic */ View b;

    public /* synthetic */ xD3(CD3 cD3, View view) {
        this.a = cD3;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View)((h$c)this.a).a.d.getParent()).invalidate();
    }
}

