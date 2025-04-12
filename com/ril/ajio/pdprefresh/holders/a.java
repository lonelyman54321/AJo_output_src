/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.pdprefresh.holders;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.widget.RelativeLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.pdprefresh.holders.HeroImageHolder$startExpandAnimation$1$1;

public final class a
implements Animator.AnimatorListener {
    public final /* synthetic */ M41 a;

    public a(M41 m41) {
        this.a = m41;
    }

    public final void onAnimationCancel(Animator animator2) {
    }

    public final void onAnimationEnd(Animator object) {
        String string2;
        Object object2;
        object = this.a;
        RelativeLayout relativeLayout = object.m;
        if (relativeLayout != null) {
            object2 = null;
            relativeLayout.setVisibility(0);
        }
        object2 = Looper.getMainLooper();
        relativeLayout = new Handler(object2);
        object2 = new HeroImageHolder$startExpandAnimation$1$1((M41)object);
        object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("pdp_to_bag_conversation_json");
        boolean bl2 = object.has(string2 = "pdp_animation_offset_value_sec");
        int n3 = bl2 && (bl2 = object.has(string2)) ? object.getInt(string2) : 2;
        long l2 = (long)n3 * 1000L;
        relativeLayout.postDelayed((Runnable)object2, l2);
    }

    public final void onAnimationRepeat(Animator animator2) {
    }

    public final void onAnimationStart(Animator animator2) {
    }
}

