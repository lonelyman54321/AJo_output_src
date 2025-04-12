/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.fleek.stories.customview;

import android.view.animation.Animation;
import com.ril.ajio.fleek.stories.customview.PausableProgressBar;
import kotlin.jvm.internal.Intrinsics;

public final class PausableProgressBar$c
implements Animation.AnimationListener {
    public final /* synthetic */ PausableProgressBar a;

    public PausableProgressBar$c(PausableProgressBar pausableProgressBar) {
        this.a = pausableProgressBar;
    }

    public final void onAnimationEnd(Animation object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        ((PausableProgressBar)((Object)object)).f = false;
        object = ((PausableProgressBar)((Object)object)).e;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.b();
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        boolean bl2 = ((PausableProgressBar)((Object)object)).f;
        if (bl2) {
            return;
        }
        ((PausableProgressBar)((Object)object)).f = bl2 = true;
        string2 = ((PausableProgressBar)((Object)object)).a;
        Intrinsics.checkNotNull(string2);
        string2.setVisibility(0);
        object = ((PausableProgressBar)((Object)object)).e;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.a();
        }
    }
}

