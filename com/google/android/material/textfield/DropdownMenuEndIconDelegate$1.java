/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

class DropdownMenuEndIconDelegate$1
extends AnimatorListenerAdapter {
    final /* synthetic */ DropdownMenuEndIconDelegate this$0;

    public DropdownMenuEndIconDelegate$1(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.this$0 = dropdownMenuEndIconDelegate;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.refreshIconState();
        DropdownMenuEndIconDelegate.access$000(this.this$0).start();
    }
}

