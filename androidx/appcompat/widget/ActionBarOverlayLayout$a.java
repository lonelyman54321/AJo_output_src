/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class ActionBarOverlayLayout$a
extends AnimatorListenerAdapter {
    public final /* synthetic */ ActionBarOverlayLayout a;

    public ActionBarOverlayLayout$a(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.w = null;
        actionBarOverlayLayout.j = false;
    }

    public final void onAnimationEnd(Animator animator2) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.w = null;
        actionBarOverlayLayout.j = false;
    }
}

