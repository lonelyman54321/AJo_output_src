/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.view.View
 *  android.widget.TextView
 */
import android.animation.Animator;
import android.view.View;
import android.widget.TextView;

public final class S63
implements Animator.AnimatorListener {
    public final /* synthetic */ O63 a;
    public final /* synthetic */ CharSequence b;

    public S63(O63 o63, CharSequence charSequence) {
        this.a = o63;
        this.b = charSequence;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        object = this.a;
        TextView textView = object.q;
        CharSequence charSequence = this.b;
        if (textView != null) {
            String string2 = String.valueOf(charSequence);
            textView.setContentDescription((CharSequence)string2);
        }
        if ((textView = object.q) != null) {
            ai0_2.a((View)textView);
        }
        if ((object = object.q) != null) {
            object.setText(charSequence);
        }
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

