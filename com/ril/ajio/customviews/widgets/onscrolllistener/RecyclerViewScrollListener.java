/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.customviews.widgets.onscrolllistener;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;

public abstract class RecyclerViewScrollListener
extends RecyclerView$s {
    public static String TAG = "RecyclerViewScrollListener";
    private RecyclerView$o layoutManager;
    private boolean loading = false;

    public RecyclerView$o getLayoutManager() {
        return this.layoutManager;
    }

    public abstract boolean isLastPage();

    public boolean isLoading() {
        return this.loading;
    }

    public abstract void onLoadMore();

    public void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        super.onScrolled(recyclerView, n3, n4);
        if (n3 == 0 && n4 == 0) {
            return;
        }
        RecyclerView$o recyclerView$o = recyclerView.getLayoutManager();
        int n7 = recyclerView.getChildCount();
        n4 = recyclerView$o.getItemCount();
        boolean bl2 = recyclerView$o instanceof LinearLayoutManager;
        if (bl2) {
            recyclerView$o = (LinearLayoutManager)recyclerView$o;
            n3 = ((LinearLayoutManager)recyclerView$o).findFirstVisibleItemPosition();
        } else {
            n3 = 0;
            recyclerView$o = null;
        }
        bl2 = this.loading;
        if (!bl2 && (n4 -= n7) <= (n3 += 11)) {
            this.onLoadMore();
        }
    }

    public void setLayoutManager(RecyclerView$o recyclerView$o) {
        this.layoutManager = recyclerView$o;
    }

    public void setLoadingSate(boolean bl2) {
        this.loading = bl2;
    }
}

