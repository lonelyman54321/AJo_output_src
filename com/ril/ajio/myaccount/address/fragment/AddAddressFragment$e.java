/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.myaccount.address.fragment;

import android.app.Activity;
import android.view.animation.Animation;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

public final class AddAddressFragment$e
implements Animation.AnimationListener {
    public final /* synthetic */ AddAddressFragment a;

    public AddAddressFragment$e(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void onAnimationEnd(Animation object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        Activity activity = object.u;
        if (activity != null) {
            Intrinsics.checkNotNull(activity);
            int n3 = activity.isFinishing();
            if (n3 == 0 && (object = object.j) != null) {
                n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

