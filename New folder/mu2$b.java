/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.media3.ui.DefaultTimeBar;

public final class mu2$b
extends AnimatorListenerAdapter {
    public final /* synthetic */ mu2 a;

    public mu2$b(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationStart(Animator animator2) {
        boolean bl2;
        float[] fArray;
        int n3;
        float f5 = 0.0f;
        mu2 mu22 = this.a;
        View view = mu22.b;
        if (view != null) {
            view.setVisibility(0);
        }
        if ((view = mu22.c) != null) {
            view.setVisibility(0);
        }
        if ((view = mu22.e) != null) {
            n3 = mu22.A;
            if (n3 != 0) {
                n3 = 0;
                fArray = null;
            } else {
                n3 = 4;
            }
            view.setVisibility(n3);
        }
        if ((n3 = (view = mu22.j) instanceof DefaultTimeBar) != 0 && !(bl2 = mu22.A)) {
            view = (DefaultTimeBar)view;
            mu22 = view.E;
            n3 = (int)(mu22.isStarted() ? 1 : 0);
            if (n3 != 0) {
                mu22.cancel();
            }
            view.G = false;
            float f6 = view.F;
            n3 = 2;
            fArray = new float[n3];
            fArray[0] = f6;
            f5 = 1.0f;
            int n4 = 1;
            f6 = Float.MIN_VALUE;
            fArray[n4] = f5;
            mu22.setFloatValues(fArray);
            long l2 = 250L;
            mu22.setDuration(l2);
            mu22.start();
        }
    }
}

