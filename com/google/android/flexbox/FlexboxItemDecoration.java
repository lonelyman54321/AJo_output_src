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
package com.google.android.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;

public class FlexboxItemDecoration
extends RecyclerView$n {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    private static final int[] LIST_DIVIDER_ATTRS = new int[]{16843284};
    public static final int VERTICAL = 2;
    private Drawable mDrawable;
    private int mOrientation;

    public FlexboxItemDecoration(Context context) {
        Object object = LIST_DIVIDER_ATTRS;
        context = context.obtainStyledAttributes(object);
        object = context.getDrawable(0);
        this.mDrawable = (Drawable)object;
        context.recycle();
        this.setOrientation(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void drawHorizontalDecorations(Canvas canvas, RecyclerView recyclerView) {
        boolean bl2 = this.needsHorizontalDecoration();
        if (!bl2) {
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager)recyclerView.getLayoutManager();
        int n3 = flexboxLayoutManager.getFlexDirection();
        int n4 = recyclerView.getLeft();
        int n7 = recyclerView.getPaddingLeft();
        n4 -= n7;
        n7 = recyclerView.getRight();
        int n8 = recyclerView.getPaddingRight() + n7;
        n7 = recyclerView.getChildCount();
        int n10 = 0;
        while (true) {
            int n14;
            int n15;
            int n16;
            int n17;
            RecyclerView$LayoutParams recyclerView$LayoutParams;
            View view;
            block7: {
                int n18;
                block8: {
                    int n19;
                    block5: {
                        Drawable drawable2;
                        block6: {
                            if (n10 >= n7) {
                                return;
                            }
                            view = recyclerView.getChildAt(n10);
                            recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
                            n17 = 3;
                            if (n3 == n17) {
                                n17 = view.getBottom();
                                n16 = recyclerView$LayoutParams.bottomMargin;
                                n17 += n16;
                                Drawable drawable3 = this.mDrawable;
                                n16 = drawable3.getIntrinsicHeight() + n17;
                            } else {
                                n17 = view.getTop();
                                n16 = recyclerView$LayoutParams.topMargin;
                                n16 = n17 - n16;
                                Drawable drawable4 = this.mDrawable;
                                n17 = drawable4.getIntrinsicHeight();
                                n17 = n16 - n17;
                            }
                            n15 = flexboxLayoutManager.isMainAxisDirectionHorizontal();
                            if (n15 == 0) break block5;
                            n15 = flexboxLayoutManager.isLayoutRtl();
                            if (n15 == 0) break block6;
                            n15 = view.getRight();
                            n19 = recyclerView$LayoutParams.rightMargin;
                            n15 += n19;
                            drawable2 = this.mDrawable;
                            n19 = drawable2.getIntrinsicWidth() + n15;
                            n15 = Math.min(n19, n8);
                            n14 = view.getLeft();
                            n18 = recyclerView$LayoutParams.leftMargin;
                            n14 -= n18;
                            break block7;
                        }
                        n15 = view.getLeft();
                        n19 = recyclerView$LayoutParams.leftMargin;
                        n15 -= n19;
                        drawable2 = this.mDrawable;
                        n19 = drawable2.getIntrinsicWidth();
                        n15 = Math.max(n15 - n19, n4);
                        n14 = view.getRight();
                        n18 = recyclerView$LayoutParams.rightMargin;
                        break block8;
                    }
                    n15 = view.getLeft();
                    n19 = recyclerView$LayoutParams.leftMargin;
                    n15 -= n19;
                    n14 = view.getRight();
                    n18 = recyclerView$LayoutParams.rightMargin;
                }
                int n20 = n15;
                n15 = n14 += n18;
                n14 = n20;
            }
            recyclerView$LayoutParams = this.mDrawable;
            recyclerView$LayoutParams.setBounds(n14, n17, n15, n16);
            view = this.mDrawable;
            view.draw(canvas);
            ++n10;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void drawVerticalDecorations(Canvas var1_1, RecyclerView var2_2) {
        var3_3 = this.needsVerticalDecoration();
        if (!var3_3) {
            return;
        }
        var4_4 = (FlexboxLayoutManager)var2_2.getLayoutManager();
        var5_5 = var2_2.getTop();
        var6_6 = var2_2.getPaddingTop();
        var5_5 -= var6_6;
        var6_6 = var2_2.getBottom();
        var7_7 = var2_2.getPaddingBottom() + var6_6;
        var6_6 = var2_2.getChildCount();
        var8_8 = var4_4.getFlexDirection();
        for (var9_9 = 0; var9_9 < var6_6; ++var9_9) {
            var10_10 = var2_2.getChildAt(var9_9);
            var11_11 = (RecyclerView$LayoutParams)var10_10.getLayoutParams();
            var12_12 = var4_4.isLayoutRtl();
            if (var12_12 != 0) {
                var12_12 = var10_10.getRight();
                var13_13 = var11_11.rightMargin;
                var12_12 += var13_13;
                var14_14 = this.mDrawable;
                var13_13 = var14_14.getIntrinsicWidth() + var12_12;
            } else {
                var12_12 = var10_10.getLeft();
                var13_13 = var11_11.leftMargin;
                var13_13 = var12_12 - var13_13;
                var15_15 = this.mDrawable;
                var12_12 = var15_15.getIntrinsicWidth();
                var12_12 = var13_13 - var12_12;
            }
            var16_16 = var4_4.isMainAxisDirectionHorizontal();
            if (var16_16 != 0) {
                var16_16 = var10_10.getTop();
                var17_17 = var11_11.topMargin;
                var16_16 -= var17_17;
                var18_18 = var10_10.getBottom();
                var19_19 = var11_11.bottomMargin;
lbl36:
                // 2 sources

                while (true) {
                    var18_18 += var19_19;
                    break;
                }
            } else {
                var16_16 = 3;
                if (var8_8 == var16_16) {
                    var16_16 = var10_10.getBottom();
                    var17_17 = var11_11.bottomMargin;
                    var16_16 += var17_17;
                    var20_20 = this.mDrawable;
                    var17_17 = var20_20.getIntrinsicHeight() + var16_16;
                    var16_16 = Math.min(var17_17, var7_7);
                    var18_18 = var10_10.getTop();
                    var19_19 = var11_11.topMargin;
                    var21_21 = var16_16;
                    var16_16 = var18_18 -= var19_19;
                    var18_18 = var21_21;
                } else {
                    var16_16 = var10_10.getTop();
                    var17_17 = var11_11.topMargin;
                    var16_16 -= var17_17;
                    var20_20 = this.mDrawable;
                    var17_17 = var20_20.getIntrinsicHeight();
                    var16_16 = Math.max(var16_16 - var17_17, var5_5);
                    var18_18 = var10_10.getBottom();
                    var19_19 = var11_11.bottomMargin;
                    ** continue;
                }
            }
            var11_11 = this.mDrawable;
            var11_11.setBounds(var12_12, var16_16, var13_13, var18_18);
            var10_10 = this.mDrawable;
            var10_10.draw(var1_1);
        }
    }

    private boolean isFirstItemInLine(int n3, List object, FlexboxLayoutManager object2) {
        int n4;
        List list;
        int n7 = ((FlexboxLayoutManager)object2).getPositionToFlexLineIndex(n3);
        int n8 = -1;
        int n10 = 1;
        if (n7 != n8 && n7 < (n8 = (list = ((FlexboxLayoutManager)object2).getFlexLinesInternal()).size())) {
            object2 = (FlexLine)((FlexboxLayoutManager)object2).getFlexLinesInternal().get(n7);
            n4 = ((FlexLine)object2).mFirstIndex;
            if (n4 == n3) {
                return n10 != 0;
            }
        }
        if (n3 == 0) {
            return n10 != 0;
        }
        n4 = object.size();
        n7 = 0;
        if (n4 == 0) {
            return false;
        }
        object = (FlexLine)on_2.d(n10, (List)object);
        int n14 = ((FlexLine)object).mLastIndex;
        if (n14 != (n3 -= n10)) {
            n10 = 0;
        }
        return n10 != 0;
    }

    private boolean needsHorizontalDecoration() {
        int n3 = this.mOrientation;
        int n4 = 1;
        if ((n3 &= n4) <= 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    private boolean needsVerticalDecoration() {
        int n3 = this.mOrientation & 2;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    private void setOffsetAlongCrossAxis(Rect rect, int n3, FlexboxLayoutManager flexboxLayoutManager, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return;
        }
        if ((n3 = flexboxLayoutManager.getPositionToFlexLineIndex(n3)) == 0) {
            return;
        }
        n3 = (int)(flexboxLayoutManager.isMainAxisDirectionHorizontal() ? 1 : 0);
        n4 = 0;
        list = null;
        if (n3 != 0) {
            n3 = (int)(this.needsHorizontalDecoration() ? 1 : 0);
            if (n3 == 0) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            Drawable drawable2 = this.mDrawable;
            rect.top = n3 = drawable2.getIntrinsicHeight();
            rect.bottom = 0;
        } else {
            n3 = (int)(this.needsVerticalDecoration() ? 1 : 0);
            if (n3 == 0) {
                return;
            }
            n3 = (int)(flexboxLayoutManager.isLayoutRtl() ? 1 : 0);
            if (n3 != 0) {
                Drawable drawable3 = this.mDrawable;
                rect.right = n3 = drawable3.getIntrinsicWidth();
                rect.left = 0;
            } else {
                Drawable drawable4 = this.mDrawable;
                rect.left = n3 = drawable4.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void setOffsetAlongMainAxis(Rect rect, int n3, FlexboxLayoutManager flexboxLayoutManager, List list, int n4) {
        if ((n3 = (int)(this.isFirstItemInLine(n3, list, flexboxLayoutManager) ? 1 : 0)) != 0) {
            return;
        }
        n3 = (int)(flexboxLayoutManager.isMainAxisDirectionHorizontal() ? 1 : 0);
        list = null;
        if (n3 != 0) {
            n3 = (int)(this.needsVerticalDecoration() ? 1 : 0);
            if (n3 == 0) {
                rect.left = 0;
                rect.right = 0;
                return;
            }
            n3 = (int)(flexboxLayoutManager.isLayoutRtl() ? 1 : 0);
            if (n3 != 0) {
                Drawable drawable2 = this.mDrawable;
                rect.right = n3 = drawable2.getIntrinsicWidth();
                rect.left = 0;
            } else {
                Drawable drawable3 = this.mDrawable;
                rect.left = n3 = drawable3.getIntrinsicWidth();
                rect.right = 0;
            }
        } else {
            n3 = (int)(this.needsHorizontalDecoration() ? 1 : 0);
            if (n3 == 0) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            n3 = 3;
            if (n4 == n3) {
                Drawable drawable4 = this.mDrawable;
                rect.bottom = n3 = drawable4.getIntrinsicHeight();
                rect.top = 0;
            } else {
                Drawable drawable5 = this.mDrawable;
                rect.top = n3 = drawable5.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y object2) {
        int n3 = ((RecyclerView)object).getChildAdapterPosition(view);
        if (n3 == 0) {
            return;
        }
        boolean bl2 = this.needsHorizontalDecoration();
        if (!bl2 && !(bl2 = this.needsVerticalDecoration())) {
            rect.set(0, 0, 0, 0);
            return;
        }
        object = (FlexboxLayoutManager)((RecyclerView)object).getLayoutManager();
        object2 = ((FlexboxLayoutManager)object).getFlexLines();
        int n4 = ((FlexboxLayoutManager)object).getFlexDirection();
        this.setOffsetAlongMainAxis(rect, n3, (FlexboxLayoutManager)object, (List)object2, n4);
        this.setOffsetAlongCrossAxis(rect, n3, (FlexboxLayoutManager)object, (List)object2);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        this.drawHorizontalDecorations(canvas, recyclerView);
        this.drawVerticalDecorations(canvas, recyclerView);
    }

    public void setDrawable(Drawable object) {
        if (object != null) {
            this.mDrawable = object;
            return;
        }
        object = new IllegalArgumentException("Drawable cannot be null.");
        throw object;
    }

    public void setOrientation(int n3) {
        this.mOrientation = n3;
    }
}

