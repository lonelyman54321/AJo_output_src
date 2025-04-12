/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package com.ril.ajio.customviews.widgets;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;

public abstract class HeaderRecyclerViewAdapter
extends RecyclerView$f {
    private static final int TYPE_ADAPTEE_OFFSET = 2;
    public static final int TYPE_FOOTER = -2147483647;
    public static final int TYPE_HEADER = Integer.MIN_VALUE;

    public abstract int getBasicItemCount();

    public abstract int getBasicItemType(int var1);

    public int getItemCount() {
        int n3 = this.getBasicItemCount();
        boolean bl2 = this.useHeader();
        if (bl2) {
            ++n3;
        }
        if (bl2 = this.useFooter()) {
            ++n3;
        }
        return n3;
    }

    public int getItemViewType(int n3) {
        int n4;
        if (n3 == 0 && (n4 = this.useHeader()) != 0) {
            return -1 << -1;
        }
        n4 = this.useHeader();
        int n7 = -2147483647;
        if (n4 != 0 && n3 > (n4 = this.getBasicItemCount()) && (n4 = (int)(this.useFooter() ? 1 : 0)) != 0) {
            return n7;
        }
        n4 = (int)(this.useHeader() ? 1 : 0);
        if (n4 == 0 && n3 >= (n4 = this.getBasicItemCount()) && (n3 = (int)(this.useFooter() ? 1 : 0)) != 0) {
            return n7;
        }
        return 2;
    }

    public abstract void onBindBasicItemView(RecyclerView$B var1, int var2);

    public abstract void onBindFooterView(RecyclerView$B var1, int var2);

    public abstract void onBindHeaderView(RecyclerView$B var1, int var2);

    public void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        int n7;
        if (n3 == 0 && (n7 = recyclerView$B.getItemViewType()) == (n4 = -1 << -1)) {
            this.onBindHeaderView(recyclerView$B, n3);
        } else {
            n7 = (int)(this.useHeader() ? 1 : 0);
            n4 = -2147483647;
            if (n7 != 0 && n3 > (n7 = this.getBasicItemCount()) && (n7 = recyclerView$B.getItemViewType()) == n4) {
                this.onBindFooterView(recyclerView$B, n3);
            } else {
                n7 = (int)(this.useHeader() ? 1 : 0);
                if (n7 == 0 && n3 >= (n7 = this.getBasicItemCount()) && (n7 = recyclerView$B.getItemViewType()) == n4) {
                    this.onBindFooterView(recyclerView$B, n3);
                } else {
                    n7 = (int)(this.useHeader() ? 1 : 0);
                    this.onBindBasicItemView(recyclerView$B, n3 -= n7);
                }
            }
        }
    }

    public abstract RecyclerView$B onCreateBasicItemViewHolder(ViewGroup var1, int var2);

    public abstract RecyclerView$B onCreateFooterViewHolder(ViewGroup var1, int var2);

    public abstract RecyclerView$B onCreateHeaderViewHolder(ViewGroup var1, int var2);

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        int n4 = -1 << -1;
        if (n3 == n4) {
            return this.onCreateHeaderViewHolder(viewGroup, n3);
        }
        n4 = -2147483647;
        if (n3 == n4) {
            return this.onCreateFooterViewHolder(viewGroup, n3);
        }
        return this.onCreateBasicItemViewHolder(viewGroup, n3 += -2);
    }

    public abstract boolean useFooter();

    public abstract boolean useHeader();
}

