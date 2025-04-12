/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AjioTouchInterceptRecyclerView
extends RecyclerView {
    public static final int $stable = 8;
    private final Handler handler;
    private Function1 mTouchListener;
    private final Runnable runnable;

    public AjioTouchInterceptRecyclerView(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super((Context)object);
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.handler = object;
        super(this, 0);
        this.runnable = object;
    }

    public AjioTouchInterceptRecyclerView(Context object, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(object, "context");
        super((Context)object, attributeSet);
        attributeSet = Looper.getMainLooper();
        super((Looper)attributeSet);
        this.handler = object;
        super(this, 0);
        this.runnable = object;
    }

    public AjioTouchInterceptRecyclerView(Context object, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(object, "context");
        super((Context)object, attributeSet, n3);
        attributeSet = Looper.getMainLooper();
        super((Looper)attributeSet);
        this.handler = object;
        super(this, 0);
        this.runnable = object;
    }

    public static /* synthetic */ void a(AjioTouchInterceptRecyclerView ajioTouchInterceptRecyclerView) {
        AjioTouchInterceptRecyclerView.runnable$lambda$0(ajioTouchInterceptRecyclerView);
    }

    private final void handleTouchEvent() {
        this.handler.removeCallbacksAndMessages(null);
        Handler handler = this.handler;
        Runnable runnable2 = this.runnable;
        handler.postDelayed(runnable2, 2000L);
    }

    private static final void runnable$lambda$0(AjioTouchInterceptRecyclerView object) {
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((AjioTouchInterceptRecyclerView)object).mTouchListener;
        if (object != null) {
            int n3 = 1;
            object2 = n3;
            object.invoke(object2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean onInterceptTouchEvent(MotionEvent object) {
        Object object2 = "event";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int bl2 = this.getScrollState();
        int n3 = 2;
        int n4 = 1;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        boolean bl5 = super.onInterceptTouchEvent((MotionEvent)object);
        int n7 = object.getActionMasked();
        if (n7 == 0) {
            void var3_6;
            if (var3_6 != false) {
                boolean bl6;
                object2 = this.getParent();
                object2.requestDisallowInterceptTouchEvent(false);
                this.handleTouchEvent();
                boolean bl7 = this.canScrollVertically(-1);
                if (!bl7 || !(bl6 = this.canScrollVertically(n4))) {
                    this.stopScroll();
                    return false;
                }
            }
        } else {
            this.handleTouchEvent();
        }
        if ((object2 = this.mTouchListener) != null) {
            int n8 = object.getAction();
            object = n8;
            object2.invoke(object);
        }
        return bl5;
    }

    public final void setCustomTouchListener(Function1 function1) {
        this.mTouchListener = function1;
    }
}

