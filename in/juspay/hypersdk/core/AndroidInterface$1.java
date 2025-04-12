/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 */
package in.juspay.hypersdk.core;

import android.animation.Animator;
import in.juspay.hypersdk.core.AndroidInterface;
import in.juspay.hypersdk.core.DynamicUI;

class AndroidInterface$1
implements Animator.AnimatorListener {
    final /* synthetic */ AndroidInterface this$0;
    final /* synthetic */ String val$animId;
    final /* synthetic */ String val$callbackName;

    public AndroidInterface$1(AndroidInterface androidInterface, String string2, String string3) {
        this.this$0 = androidInterface;
        this.val$callbackName = string2;
        this.val$animId = string3;
    }

    public void onAnimationCancel(Animator animator2) {
    }

    public void onAnimationEnd(Animator object) {
        boolean bl2;
        object = this.val$callbackName;
        if (object != null && !(bl2 = ((String)object).isEmpty())) {
            object = AndroidInterface.access$000(this.this$0);
            CharSequence charSequence = new StringBuilder("window.callUICallback('");
            String string2 = this.val$callbackName;
            charSequence.append(string2);
            charSequence.append("', '");
            string2 = this.val$animId;
            String string3 = "');";
            charSequence = h30_0.a(charSequence, string2, string3);
            ((DynamicUI)object).addJsToWebView((String)charSequence);
        }
    }

    public void onAnimationRepeat(Animator animator2) {
    }

    public void onAnimationStart(Animator animator2) {
    }
}

