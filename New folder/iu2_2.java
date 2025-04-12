/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 */
import android.animation.Animator;
import com.google.android.material.animation.AnimatableView$Listener;

/*
 * Renamed from IU2
 */
public final class iu2_2
implements AnimatableView$Listener {
    public final /* synthetic */ Animator a;

    public /* synthetic */ iu2_2(Animator animator2) {
        this.a = animator2;
    }

    public final void onAnimationEnd() {
        this.a.start();
    }
}

