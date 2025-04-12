/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.view.View
 */
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.ril.ajio.R$color;

public final class Ac$a
implements Animator.AnimatorListener {
    public final /* synthetic */ Ac a;
    public final /* synthetic */ View b;

    public Ac$a(Ac ac2, View view) {
        this.a = ac2;
        this.b = view;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a.b;
        Context context = this.b.getContext();
        int n3 = R$color.white;
        int n4 = t70.getColor(context, n3);
        object.setBackgroundColor(n4);
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

