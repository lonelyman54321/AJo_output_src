/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;

class SwipeDismissBehavior$2
implements E2 {
    final /* synthetic */ SwipeDismissBehavior this$0;

    public SwipeDismissBehavior$2(SwipeDismissBehavior swipeDismissBehavior) {
        this.this$0 = swipeDismissBehavior;
    }

    /*
     * WARNING - void declaration
     */
    public boolean perform(View view, E2$a object) {
        object = this.this$0;
        boolean n3 = ((SwipeDismissBehavior)object).canSwipeDismissView(view);
        boolean bl2 = false;
        if (n3) {
            void var3_8;
            int n4;
            object = ViewCompat.a;
            int n7 = view.getLayoutDirection();
            if (n7 == (n4 = 1)) {
                bl2 = true;
            }
            object = this.this$0;
            int n8 = ((SwipeDismissBehavior)object).swipeDirection;
            if (n8 == 0 && bl2 || n8 == n4 && !bl2) {
                int n10 = -view.getWidth();
            } else {
                int n14 = view.getWidth();
            }
            ViewCompat.l((int)var3_8, view);
            boolean bl3 = false;
            view.setAlpha(0.0f);
            object = this.this$0.listener;
            if (object != null) {
                object.onDismiss(view);
            }
            return n4 != 0;
        }
        return false;
    }
}

