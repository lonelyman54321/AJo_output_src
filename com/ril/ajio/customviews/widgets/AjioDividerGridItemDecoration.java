/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ril.ajio.R$drawable;

public class AjioDividerGridItemDecoration
extends RecyclerView$n {
    private static final int[] ATTRS = new int[]{16843284};
    private Drawable mDivider;

    public AjioDividerGridItemDecoration(Context context) {
        Object object = ATTRS;
        object = context.obtainStyledAttributes(object);
        int n3 = R$drawable.divider;
        context = t70.getDrawable(context, n3);
        this.mDivider = context;
        object.recycle();
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int n3 = recyclerView.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = recyclerView.getChildAt(i3);
            RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
            int n4 = view.getLeft();
            int n7 = recyclerView$LayoutParams.leftMargin;
            n4 -= n7;
            n7 = view.getRight();
            int n8 = recyclerView$LayoutParams.rightMargin;
            n7 += n8;
            Drawable drawable2 = this.mDivider;
            n8 = drawable2.getIntrinsicWidth() + n7;
            int n10 = view.getBottom();
            int n14 = recyclerView$LayoutParams.bottomMargin;
            n10 += n14;
            recyclerView$LayoutParams = this.mDivider;
            n14 = recyclerView$LayoutParams.getIntrinsicHeight() + n10;
            Drawable drawable3 = this.mDivider;
            drawable3.setBounds(n4, n10, n8, n14);
            view = this.mDivider;
            view.draw(canvas);
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int n3 = recyclerView.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = recyclerView.getChildAt(i3);
            RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
            int n4 = view.getTop();
            int n7 = recyclerView$LayoutParams.topMargin;
            n4 -= n7;
            n7 = view.getBottom();
            int n8 = recyclerView$LayoutParams.bottomMargin;
            n7 += n8;
            int n10 = view.getRight();
            int n14 = recyclerView$LayoutParams.rightMargin;
            n10 += n14;
            recyclerView$LayoutParams = this.mDivider;
            n14 = recyclerView$LayoutParams.getIntrinsicWidth() + n10;
            Drawable drawable2 = this.mDivider;
            drawable2.setBounds(n10, n4, n14, n7);
            view = this.mDivider;
            view.draw(canvas);
        }
    }

    private int getSpanCount(RecyclerView object) {
        int n3;
        boolean bl2 = (object = ((RecyclerView)object).getLayoutManager()) instanceof GridLayoutManager;
        if (bl2) {
            object = (GridLayoutManager)object;
            n3 = ((GridLayoutManager)object).getSpanCount();
        } else {
            bl2 = object instanceof StaggeredGridLayoutManager;
            if (bl2) {
                object = (StaggeredGridLayoutManager)object;
                n3 = ((StaggeredGridLayoutManager)object).a;
            } else {
                n3 = -1;
            }
        }
        return n3;
    }

    private boolean isLastColum(RecyclerView object, int n3, int n4, int n7) {
        object = ((RecyclerView)object).getLayoutManager();
        boolean bl2 = object instanceof GridLayoutManager;
        boolean bl3 = false;
        int n8 = 1;
        if (bl2) {
            if ((n3 = (n3 + n8) % n4) == 0) {
                bl3 = true;
            }
            return bl3;
        }
        bl2 = object instanceof StaggeredGridLayoutManager;
        if (bl2) {
            object = (StaggeredGridLayoutManager)object;
            int n10 = ((StaggeredGridLayoutManager)object).e;
            if (n10 == n8) {
                if ((n3 = (n3 + n8) % n4) == 0) {
                    bl3 = true;
                }
                return bl3;
            }
            if (n3 >= (n7 -= (n10 = n7 % n4))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    private boolean isLastRaw(RecyclerView object, int n3, int n4, int n7) {
        object = ((RecyclerView)object).getLayoutManager();
        boolean bl2 = object instanceof GridLayoutManager;
        boolean bl3 = false;
        int n8 = 1;
        if (bl2) {
            if ((n3 += n4) >= n7) {
                bl3 = true;
            }
            return bl3;
        }
        bl2 = object instanceof StaggeredGridLayoutManager;
        if (bl2) {
            object = (StaggeredGridLayoutManager)object;
            int n10 = ((StaggeredGridLayoutManager)object).e;
            if (n10 == n8) {
                if ((n3 += n4) >= n7) {
                    bl3 = true;
                }
                return bl3;
            }
            if ((n3 = (n3 + n8) % n4) == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        super.getItemOffsets(rect, view, recyclerView, recyclerView$y);
        int n3 = recyclerView.getChildAdapterPosition(view);
        int n4 = this.getSpanCount(recyclerView);
        RecyclerView$f recyclerView$f = recyclerView.getAdapter();
        int n7 = recyclerView$f.getItemCount();
        boolean bl2 = this.isLastRaw(recyclerView, n3, n4, n7);
        if (bl2) {
            if ((n3 = (int)(this.isLastColum(recyclerView, n3, n4, n7) ? 1 : 0)) != 0) {
                rect.set(0, 0, 0, 0);
            } else {
                view = this.mDivider;
                n3 = view.getIntrinsicWidth();
                rect.set(0, 0, n3, 0);
            }
        } else if ((n3 = (int)(this.isLastColum(recyclerView, n3, n4, n7) ? 1 : 0)) != 0) {
            view = this.mDivider;
            n3 = view.getIntrinsicHeight();
            int n8 = -5;
            rect.set(0, n8, 0, n3);
        } else {
            view = this.mDivider;
            n3 = view.getIntrinsicWidth();
            recyclerView = this.mDivider;
            int n10 = recyclerView.getIntrinsicHeight();
            rect.set(0, 0, n3, n10);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        this.drawHorizontal(canvas, recyclerView);
        this.drawVertical(canvas, recyclerView);
    }
}

