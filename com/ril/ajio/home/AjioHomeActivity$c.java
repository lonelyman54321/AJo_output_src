/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.home;

import android.content.Context;
import android.view.animation.Animation;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioHomeActivity$c
implements Animation.AnimationListener {
    public final /* synthetic */ AjioHomeActivity a;

    public AjioHomeActivity$c(AjioHomeActivity ajioHomeActivity) {
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
            object2 = ((BaseActivity)object).s0;
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
            Object object2 = ((BaseActivity)object).r0;
            if (object2 != null) {
                int n3 = 8;
                object2.setVisibility(n3);
                object2 = ((BaseActivity)object).t0;
                if (object2 != null) {
                    object2.setVisibility(n3);
                }
            }
            ((AjioHomeActivity)object).Z0.a();
            od3_2.a = "";
            AJIOApplication.Companion.getClass();
            Object object3 = AJIOApplication$a.a();
            object2 = new jo_2((Context)object3);
            object3 = ld3_2.STORE_LUXE.getStoreId();
            ((jo_2)object2).E((String)object3);
            boolean bl3 = true;
            og1_1.g(bl3, false);
            og1_1.g(bl3, bl3);
            ((AjioHomeActivity)object).h3(false, false);
        }
    }
}

