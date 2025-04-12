/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
package in.juspay.hypersdk.mystique;

import android.animation.Animator;
import in.juspay.hypersdk.mystique.AnimationHolder;
import in.juspay.hypersdk.mystique.AnimationHolder$CallbackHolder;
import in.juspay.hypersdk.mystique.AnimationHolder$InlineAnimation;

class AnimationHolder$InlineAnimation$1
implements Animator.AnimatorListener {
    final /* synthetic */ AnimationHolder$InlineAnimation this$1;
    final /* synthetic */ AnimationHolder$CallbackHolder val$holder;

    public AnimationHolder$InlineAnimation$1(AnimationHolder$InlineAnimation inlineAnimation, AnimationHolder$CallbackHolder animationHolder$CallbackHolder) {
        this.this$1 = inlineAnimation;
        this.val$holder = animationHolder$CallbackHolder;
    }

    public void onAnimationCancel(Animator animator2) {
    }

    public void onAnimationEnd(Animator animator2) {
        Object object = this.val$holder.getOnEnd();
        if (object != null) {
            object = AnimationHolder.access$200(this.this$1.this$0);
            CharSequence charSequence = new StringBuilder("window.callUICallback('");
            String string2 = this.val$holder.getOnEnd();
            charSequence.append(string2);
            charSequence.append("','");
            string2 = this.this$1.getTag();
            charSequence.append(string2);
            string2 = "');";
            charSequence.append(string2);
            charSequence = charSequence.toString();
            object.addJsToWebView((String)charSequence);
        }
        animator2.removeListener((Animator.AnimatorListener)this);
    }

    public void onAnimationRepeat(Animator animator2) {
    }

    public void onAnimationStart(Animator object) {
        object = this.val$holder.getOnStart();
        if (object != null) {
            object = AnimationHolder.access$200(this.this$1.this$0);
            CharSequence charSequence = new StringBuilder("window.callUICallback('");
            String string2 = this.val$holder.getOnStart();
            charSequence.append(string2);
            charSequence.append("','");
            string2 = this.this$1.getTag();
            charSequence.append(string2);
            string2 = "');";
            charSequence.append(string2);
            charSequence = charSequence.toString();
            object.addJsToWebView((String)charSequence);
        }
    }
}

