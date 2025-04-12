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

public final class mu2$a
extends AnimatorListenerAdapter {
    public final /* synthetic */ mu2 a;

    public mu2$a(mu2 mu22) {
        this.a = mu22;
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        View view = object.b;
        int n3 = 4;
        if (view != null) {
            view.setVisibility(n3);
        }
        if ((view = object.c) != null) {
            view.setVisibility(n3);
        }
        if ((object = object.e) != null) {
            object.setVisibility(n3);
        }
    }

    public final void onAnimationStart(Animator object) {
        boolean bl2;
        object = this.a;
        View view = object.j;
        int n3 = view instanceof DefaultTimeBar;
        if (n3 != 0 && !(bl2 = object.A)) {
            view = (DefaultTimeBar)view;
            object = view.E;
            n3 = object.isStarted();
            if (n3 != 0) {
                object.cancel();
            }
            float f5 = view.F;
            n3 = 2;
            float[] fArray = new float[n3];
            fArray[0] = f5;
            f5 = 0.0f;
            view = null;
            int n4 = 1;
            fArray[n4] = 0.0f;
            object.setFloatValues(fArray);
            long l2 = 250L;
            object.setDuration(l2);
            object.start();
        }
    }
}

