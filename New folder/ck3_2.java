/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cK3
 */
public final class ck3_2
extends AnimatorListenerAdapter {
    public final /* synthetic */ HaptikWebView a;

    public ck3_2(HaptikWebView haptikWebView) {
        this.a = haptikWebView;
    }

    public final void onAnimationEnd(Animator animator2) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(animator2, string2);
        animator2 = this.a.Y;
        if (animator2 != null) {
            animator2.setVisibility(8);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loader");
        throw null;
    }
}

