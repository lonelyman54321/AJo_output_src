/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P63
 */
public final class p63_0
implements Animator.AnimatorListener {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;

    public p63_0(O63 o63, int n3, CharSequence charSequence) {
        this.a = o63;
        this.b = n3;
        this.c = charSequence;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        TextView textView = object.q;
        Intrinsics.checkNotNull(textView);
        int n3 = this.b;
        Object object2 = new int[]{n3};
        textView = ObjectAnimator.ofInt((Object)textView, (String)"width", (int[])object2);
        textView.setDuration(500L);
        object2 = new DecelerateInterpolator;
        object2();
        textView.setInterpolator((TimeInterpolator)object2);
        textView.start();
        Intrinsics.checkNotNull(textView);
        object2 = new Q63;
        CharSequence charSequence = this.c;
        object2((O63)object, charSequence);
        textView.addListener((Animator.AnimatorListener)object2);
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

