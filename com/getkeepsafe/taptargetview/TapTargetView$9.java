/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.getkeepsafe.taptargetview;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$9$1;

class TapTargetView$9
implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ TapTargetView this$0;
    final /* synthetic */ ViewGroup val$boundingParent;
    final /* synthetic */ Context val$context;
    final /* synthetic */ boolean val$layoutNoLimits;
    final /* synthetic */ TapTarget val$target;

    public TapTargetView$9(TapTargetView tapTargetView, TapTarget tapTarget, ViewGroup viewGroup, Context context, boolean bl2) {
        this.this$0 = tapTargetView;
        this.val$target = tapTarget;
        this.val$boundingParent = viewGroup;
        this.val$context = context;
        this.val$layoutNoLimits = bl2;
    }

    public void onGlobalLayout() {
        Object object = this.this$0;
        boolean bl2 = TapTargetView.access$200(object);
        if (bl2) {
            return;
        }
        this.this$0.updateTextLayouts();
        object = this.val$target;
        TapTargetView$9$1 tapTargetView$9$1 = new TapTargetView$9$1(this);
        ((TapTarget)object).onReady(tapTargetView$9$1);
    }
}

