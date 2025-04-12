/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

class SwipeDismissBehavior$SettleRunnable
implements Runnable {
    private final boolean dismiss;
    final /* synthetic */ SwipeDismissBehavior this$0;
    private final View view;

    public SwipeDismissBehavior$SettleRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean bl2) {
        this.this$0 = swipeDismissBehavior;
        this.view = view;
        this.dismiss = bl2;
    }

    public void run() {
        boolean bl2;
        Object object = this.this$0.viewDragHelper;
        if (object != null && (bl2 = ((ViewDragHelper)object).h())) {
            object = this.view;
            WeakHashMap weakHashMap = ViewCompat.a;
            object.postOnAnimation((Runnable)this);
        } else {
            bl2 = this.dismiss;
            if (bl2 && (object = this.this$0.listener) != null) {
                View view = this.view;
                object.onDismiss(view);
            }
        }
    }
}

