/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.home;

import android.view.animation.Animation;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.listener.TabSelectedListener;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioHomeActivity$b
implements Animation.AnimationListener {
    public final /* synthetic */ AjioHomeActivity a;

    public AjioHomeActivity$b(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final void onAnimationEnd(Animation object) {
        Object object2 = "animation";
        Intrinsics.checkNotNullParameter(object, object2);
        object = this.a;
        boolean bl2 = object.isFinishing();
        if (!bl2) {
            boolean bl3;
            ((AjioHomeActivity)object).l3();
            object2 = ((BaseActivity)object).r0;
            if (object2 != null && !(bl3 = ((AjioHomeActivity)object).q1)) {
                bl3 = false;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = ((BaseActivity)object).t0) != null) {
                    object2.setVisibility(0);
                }
            }
            ((AjioHomeActivity)object).updateCartWishCount();
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        boolean bl2 = object.isFinishing();
        if (!bl2) {
            bl2 = false;
            string2 = null;
            ((AjioHomeActivity)object).o3(0);
            Object object2 = ((BaseActivity)object).s0;
            if (object2 != null) {
                int n3 = 8;
                object2.setVisibility(n3);
                object2 = ((BaseActivity)object).t0;
                if (object2 != null) {
                    object2.setVisibility(n3);
                }
            }
            object2 = ((AjioHomeActivity)object).a1;
            ((TabSelectedListener)object2).a();
            og1_1.g(false, false);
            od3_2.d();
            boolean bl3 = true;
            og1_1.g(false, bl3);
            ((AjioHomeActivity)object).h3(false, false);
        }
    }
}

