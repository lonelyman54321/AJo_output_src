/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.ril.ajio.analytics.handler;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public abstract class ImpressionTrackableAdapter
extends RecyclerView$f {
    public static final int $stable = 8;
    private final ViewTreeObserver.OnScrollChangedListener globalOnScrollChangedListener;
    private IntRange oldRange;
    private RecyclerView recyclerView;

    public ImpressionTrackableAdapter() {
        Object object = new ff1_1(this);
        this.globalOnScrollChangedListener = object;
        IntRange.e.getClass();
        this.oldRange = object = IntRange.f;
    }

    private final void checkImpression() {
        int n3;
        int n4;
        Object object = this.recyclerView;
        if (object != null && (n4 = this.isRecyclerViewFullyVisible((RecyclerView)object)) == (n3 = 1)) {
            object = this.recyclerView;
            int n7 = 0;
            Iterator iterator = null;
            if (object != null) {
                object = ((RecyclerView)object).getLayoutManager();
            } else {
                n4 = 0;
                object = null;
            }
            boolean bl2 = object instanceof LinearLayoutManager;
            if (bl2) {
                iterator = object;
                iterator = (LinearLayoutManager)object;
            }
            if (iterator == null) {
                return;
            }
            n4 = ((LinearLayoutManager)((Object)iterator)).findFirstCompletelyVisibleItemPosition();
            n7 = ((LinearLayoutManager)((Object)iterator)).findLastCompletelyVisibleItemPosition();
            IntRange intRange = new c(n4, n7, n3);
            object = this.oldRange;
            object = CollectionsKt.V(intRange, (Iterable)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Number number = (Number)object.next();
                n3 = number.intValue();
                this.onImpressionItem(n3);
            }
            this.oldRange = intRange;
            return;
        }
        IntRange.e.getClass();
        object = IntRange.f;
        this.oldRange = object;
    }

    public static /* synthetic */ void g(ImpressionTrackableAdapter impressionTrackableAdapter) {
        ImpressionTrackableAdapter.globalOnScrollChangedListener$lambda$0(impressionTrackableAdapter);
    }

    private static final void globalOnScrollChangedListener$lambda$0(ImpressionTrackableAdapter impressionTrackableAdapter) {
        Intrinsics.checkNotNullParameter(impressionTrackableAdapter, "this$0");
        impressionTrackableAdapter.checkImpression();
    }

    private final boolean isRecyclerViewFullyVisible(RecyclerView recyclerView) {
        int n3 = recyclerView.isAttachedToWindow();
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        Rect rect = new Rect();
        int n4 = recyclerView.getGlobalVisibleRect(rect);
        if (n4 == 0) {
            return false;
        }
        n4 = rect.bottom;
        n3 = rect.top;
        double d2 = n4 -= n3;
        double d5 = recyclerView.getHeight();
        double d7 = 0.5;
        double d9 = d2 - (d5 *= d7);
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object >= 0) {
            bl2 = true;
        }
        return bl2;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
        recyclerView = recyclerView.getViewTreeObserver();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.globalOnScrollChangedListener;
        recyclerView.addOnScrollChangedListener(onScrollChangedListener);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
        recyclerView = recyclerView.getViewTreeObserver();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.globalOnScrollChangedListener;
        recyclerView.removeOnScrollChangedListener(onScrollChangedListener);
    }

    public abstract void onImpressionItem(int var1);
}

