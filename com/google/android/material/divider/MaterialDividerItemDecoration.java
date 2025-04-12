/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 */
package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

public class MaterialDividerItemDecoration
extends RecyclerView$n {
    private static final int DEF_STYLE_RES = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    static {
        DEF_STYLE_RES = R$style.Widget_MaterialComponents_MaterialDivider;
    }

    public MaterialDividerItemDecoration(Context context, int n3) {
        this(context, null, n3);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int n3) {
        int n4 = R$attr.materialDividerStyle;
        this(context, attributeSet, n4, n3);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int n3, int n4) {
        Rect rect;
        this.tempRect = rect = new Rect();
        int[] nArray = R$styleable.MaterialDivider;
        int n7 = DEF_STYLE_RES;
        int[] nArray2 = new int[]{};
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n7, nArray2);
        n3 = R$styleable.MaterialDivider_dividerColor;
        this.color = n3 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3).getDefaultColor();
        n3 = R$styleable.MaterialDivider_dividerThickness;
        context = context.getResources();
        int n8 = R$dimen.material_divider_thickness;
        int n10 = context.getDimensionPixelSize(n8);
        this.thickness = n10 = attributeSet.getDimensionPixelSize(n3, n10);
        n10 = R$styleable.MaterialDivider_dividerInsetStart;
        this.insetStart = n10 = attributeSet.getDimensionPixelOffset(n10, 0);
        n10 = R$styleable.MaterialDivider_dividerInsetEnd;
        this.insetEnd = n10 = attributeSet.getDimensionPixelOffset(n10, 0);
        n10 = R$styleable.MaterialDivider_lastItemDecorated;
        n10 = (int)(attributeSet.getBoolean(n10, true) ? 1 : 0);
        this.lastItemDecorated = n10;
        attributeSet.recycle();
        this.dividerDrawable = context;
        n10 = this.color;
        this.setDividerColor(n10);
        this.setOrientation(n4);
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int n3;
        int n4;
        int n7;
        int n8;
        canvas.save();
        int n10 = recyclerView.getClipToPadding();
        int n14 = 0;
        if (n10 != 0) {
            n10 = recyclerView.getPaddingTop();
            n8 = recyclerView.getHeight();
            n7 = recyclerView.getPaddingBottom();
            n8 -= n7;
            n7 = recyclerView.getPaddingLeft();
            n4 = recyclerView.getWidth();
            n3 = recyclerView.getPaddingRight();
            canvas.clipRect(n7, n10, n4 -= n3, n8);
        } else {
            n8 = recyclerView.getHeight();
            n10 = 0;
        }
        n7 = this.insetStart;
        n10 += n7;
        n7 = this.insetEnd;
        n8 -= n7;
        n7 = (int)(ViewUtils.isLayoutRtl((View)recyclerView) ? 1 : 0);
        n4 = recyclerView.getChildCount();
        while (n14 < n4) {
            View view = recyclerView.getChildAt(n14);
            int n15 = this.shouldDrawDivider(recyclerView, view);
            if (n15 != 0) {
                int n16;
                RecyclerView$o recyclerView$o = recyclerView.getLayoutManager();
                Rect rect = this.tempRect;
                recyclerView$o.getDecoratedBoundsWithMargins(view, rect);
                float f5 = view.getTranslationX();
                n15 = Math.round(f5);
                if (n7 != 0) {
                    rect = this.tempRect;
                    n16 = rect.left + n15;
                    n15 = this.thickness + n16;
                } else {
                    rect = this.tempRect;
                    n16 = rect.right;
                    n15 += n16;
                    n16 = this.thickness;
                    n16 = n15 - n16;
                }
                Drawable drawable2 = this.dividerDrawable;
                drawable2.setBounds(n16, n10, n15, n8);
                float f6 = view.getAlpha();
                n15 = 1132396544;
                f5 = 255.0f;
                n3 = Math.round(f6 *= f5);
                recyclerView$o = this.dividerDrawable;
                recyclerView$o.setAlpha(n3);
                view = this.dividerDrawable;
                view.draw(canvas);
            }
            ++n14;
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int n3;
        int n4;
        int n7;
        int n8;
        canvas.save();
        int n10 = recyclerView.getClipToPadding();
        int n14 = 0;
        if (n10 != 0) {
            n10 = recyclerView.getPaddingLeft();
            n8 = recyclerView.getWidth();
            n7 = recyclerView.getPaddingRight();
            n8 -= n7;
            n7 = recyclerView.getPaddingTop();
            n4 = recyclerView.getHeight();
            n3 = recyclerView.getPaddingBottom();
            canvas.clipRect(n10, n7, n8, n4 -= n3);
        } else {
            n8 = recyclerView.getWidth();
            n10 = 0;
        }
        n7 = ViewUtils.isLayoutRtl((View)recyclerView);
        n4 = n7 != 0 ? this.insetEnd : this.insetStart;
        n10 += n4;
        n7 = n7 != 0 ? this.insetStart : this.insetEnd;
        n8 -= n7;
        n7 = recyclerView.getChildCount();
        while (n14 < n7) {
            View view = recyclerView.getChildAt(n14);
            n3 = (int)(this.shouldDrawDivider(recyclerView, view) ? 1 : 0);
            if (n3 != 0) {
                RecyclerView$o recyclerView$o = recyclerView.getLayoutManager();
                Rect rect = this.tempRect;
                recyclerView$o.getDecoratedBoundsWithMargins(view, rect);
                n3 = this.tempRect.bottom;
                float f5 = view.getTranslationY();
                int n15 = Math.round(f5) + n3;
                n3 = this.thickness;
                n3 = n15 - n3;
                Drawable drawable2 = this.dividerDrawable;
                drawable2.setBounds(n10, n3, n8, n15);
                float f6 = view.getAlpha();
                n3 = 1132396544;
                float f7 = 255.0f;
                n4 = Math.round(f6 *= f7);
                recyclerView$o = this.dividerDrawable;
                recyclerView$o.setAlpha(n4);
                view = this.dividerDrawable;
                view.draw(canvas);
            }
            ++n14;
        }
        canvas.restore();
    }

    private boolean shouldDrawDivider(RecyclerView object, View view) {
        boolean bl2;
        int n3;
        int n4 = ((RecyclerView)object).getChildAdapterPosition(view);
        object = ((RecyclerView)object).getAdapter();
        boolean bl3 = false;
        int n7 = 1;
        n3 = object != null && n4 == (n3 = ((RecyclerView$f)object).getItemCount() - n7) ? 1 : 0;
        int n8 = -1;
        if (n4 != n8 && (n3 == 0 || (n3 = (int)(this.lastItemDecorated ? 1 : 0)) != 0) && (bl2 = this.shouldDrawDivider(n4, (RecyclerView$f)object))) {
            bl3 = true;
        }
        return bl3;
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3 = 0;
        rect.set(0, 0, 0, 0);
        int n4 = this.shouldDrawDivider(recyclerView, view);
        if (n4 != 0) {
            n4 = this.orientation;
            n3 = 1;
            if (n4 == n3) {
                rect.bottom = n4 = this.thickness;
            } else {
                n4 = (int)(ViewUtils.isLayoutRtl((View)recyclerView) ? 1 : 0);
                if (n4 != 0) {
                    rect.left = n4 = this.thickness;
                } else {
                    rect.right = n4 = this.thickness;
                }
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        object = recyclerView.getLayoutManager();
        if (object == null) {
            return;
        }
        int n3 = this.orientation;
        int n4 = 1;
        if (n3 == n4) {
            this.drawForVerticalOrientation(canvas, recyclerView);
        } else {
            this.drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(int n3) {
        Drawable drawable2;
        this.color = n3;
        this.dividerDrawable = drawable2 = ut0_0.h(this.dividerDrawable);
        drawable2.setTint(n3);
    }

    public void setDividerColorResource(Context context, int n3) {
        int n4 = t70.getColor(context, n3);
        this.setDividerColor(n4);
    }

    public void setDividerInsetEnd(int n3) {
        this.insetEnd = n3;
    }

    public void setDividerInsetEndResource(Context context, int n3) {
        int n4 = context.getResources().getDimensionPixelOffset(n3);
        this.setDividerInsetEnd(n4);
    }

    public void setDividerInsetStart(int n3) {
        this.insetStart = n3;
    }

    public void setDividerInsetStartResource(Context context, int n3) {
        int n4 = context.getResources().getDimensionPixelOffset(n3);
        this.setDividerInsetStart(n4);
    }

    public void setDividerThickness(int n3) {
        this.thickness = n3;
    }

    public void setDividerThicknessResource(Context context, int n3) {
        int n4 = context.getResources().getDimensionPixelSize(n3);
        this.setDividerThickness(n4);
    }

    public void setLastItemDecorated(boolean bl2) {
        this.lastItemDecorated = bl2;
    }

    public void setOrientation(int n3) {
        int n4;
        if (n3 != 0 && n3 != (n4 = 1)) {
            String string2 = Gj0.b(n3, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.orientation = n3;
    }

    public boolean shouldDrawDivider(int n3, RecyclerView$f recyclerView$f) {
        return true;
    }
}

