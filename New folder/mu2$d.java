/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

public final class mu2$d
extends AnimatorListenerAdapter {
    public final /* synthetic */ PlayerControlView a;
    public final /* synthetic */ mu2 b;

    public mu2$d(mu2 mu22, PlayerControlView playerControlView) {
        this.b = mu22;
        this.a = playerControlView;
    }

    public final void onAnimationEnd(Animator object) {
        mu2 mu22 = this.b;
        mu22.i(2);
        boolean bl2 = mu22.B;
        if (bl2) {
            object = this.a;
            bu2 bu22 = mu22.s;
            object.post((Runnable)bu22);
            bl2 = false;
            object = null;
            mu22.B = false;
        }
    }

    public final void onAnimationStart(Animator animator2) {
        this.b.i(3);
    }
}

