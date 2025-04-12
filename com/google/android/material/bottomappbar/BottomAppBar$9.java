/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

class BottomAppBar$9
extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar this$0;

    public BottomAppBar$9(BottomAppBar bottomAppBar) {
        this.this$0 = bottomAppBar;
    }

    public void onAnimationStart(Animator object) {
        Object object2 = this.this$0.fabAnimationListener;
        object2.onAnimationStart((Animator)object);
        object = BottomAppBar.access$2300(this.this$0);
        if (object != null) {
            object2 = this.this$0;
            float f5 = BottomAppBar.access$2400((BottomAppBar)object2);
            ((FloatingActionButton)object).setTranslationX(f5);
        }
    }
}

