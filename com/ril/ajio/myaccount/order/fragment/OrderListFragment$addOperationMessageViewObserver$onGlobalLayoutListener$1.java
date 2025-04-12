/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.ril.ajio.myaccount.order.fragment;

import android.view.ViewTreeObserver;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.fragment.b;
import kotlin.jvm.internal.Intrinsics;

public final class OrderListFragment$addOperationMessageViewObserver$onGlobalLayoutListener$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ b a;

    public OrderListFragment$addOperationMessageViewObserver$onGlobalLayoutListener$1(b b2) {
        this.a = b2;
    }

    public final void onGlobalLayout() {
        int n3;
        b b2 = this.a;
        AjioTextView ajioTextView = b2.u;
        AjioTextView ajioTextView2 = null;
        String string2 = "topMsgExpand";
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioTextView = null;
        }
        ajioTextView.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        ajioTextView = b2.u;
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioTextView = null;
        }
        if ((n3 = ajioTextView.getLineCount()) > 0) {
            ajioTextView = b2.u;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioTextView2 = ajioTextView;
            }
            n3 = ajioTextView2.getLineCount();
        } else {
            n3 = b2.U;
        }
        b2.U = n3;
        b2.Ta();
    }
}

