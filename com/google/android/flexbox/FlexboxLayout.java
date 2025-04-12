/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.flexbox.FlexContainer;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxHelper;
import com.google.android.flexbox.FlexboxHelper$FlexLinesResult;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlexboxLayout
extends ViewGroup
implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List mFlexLines;
    private FlexboxHelper$FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        this.mMaxLine = n4 = -1;
        Object object = new FlexboxHelper(this);
        this.mFlexboxHelper = object;
        object = new ArrayList();
        this.mFlexLines = object;
        this.mFlexLinesResult = object = new FlexboxHelper$FlexLinesResult();
        object = R$styleable.FlexboxLayout;
        context = context.obtainStyledAttributes(attributeSet, (int[])object, n3, 0);
        int n7 = R$styleable.FlexboxLayout_flexDirection;
        this.mFlexDirection = n7 = context.getInt(n7, 0);
        n7 = R$styleable.FlexboxLayout_flexWrap;
        this.mFlexWrap = n7 = context.getInt(n7, 0);
        n7 = R$styleable.FlexboxLayout_justifyContent;
        this.mJustifyContent = n7 = context.getInt(n7, 0);
        n7 = R$styleable.FlexboxLayout_alignItems;
        this.mAlignItems = n7 = context.getInt(n7, 0);
        n7 = R$styleable.FlexboxLayout_alignContent;
        this.mAlignContent = n7 = context.getInt(n7, 0);
        n7 = R$styleable.FlexboxLayout_maxLine;
        this.mMaxLine = n7 = context.getInt(n7, n4);
        n7 = R$styleable.FlexboxLayout_dividerDrawable;
        attributeSet = context.getDrawable(n7);
        if (attributeSet != null) {
            this.setDividerDrawableHorizontal((Drawable)attributeSet);
            this.setDividerDrawableVertical((Drawable)attributeSet);
        }
        if ((attributeSet = context.getDrawable(n7 = R$styleable.FlexboxLayout_dividerDrawableHorizontal)) != null) {
            this.setDividerDrawableHorizontal((Drawable)attributeSet);
        }
        if ((attributeSet = context.getDrawable(n7 = R$styleable.FlexboxLayout_dividerDrawableVertical)) != null) {
            this.setDividerDrawableVertical((Drawable)attributeSet);
        }
        n7 = R$styleable.FlexboxLayout_showDivider;
        if ((n7 = context.getInt(n7, 0)) != 0) {
            this.mShowDividerVertical = n7;
            this.mShowDividerHorizontal = n7;
        }
        n7 = R$styleable.FlexboxLayout_showDividerVertical;
        if ((n7 = context.getInt(n7, 0)) != 0) {
            this.mShowDividerVertical = n7;
        }
        n7 = R$styleable.FlexboxLayout_showDividerHorizontal;
        if ((n7 = context.getInt(n7, 0)) != 0) {
            this.mShowDividerHorizontal = n7;
        }
        context.recycle();
    }

    private boolean allFlexLinesAreDummyBefore(int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            int n4 = flexLine.getItemCountNotGone();
            if (n4 <= 0) continue;
            return false;
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int n3, int n4) {
        boolean bl2 = true;
        for (int i3 = 1; i3 <= n4; ++i3) {
            int n7;
            int n8 = n3 - i3;
            View view = this.getReorderedChildAt(n8);
            if (view == null || (n8 = view.getVisibility()) == (n7 = 8)) continue;
            return false;
        }
        return bl2;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean bl2, boolean bl3) {
        int n3 = this.getPaddingLeft();
        int n4 = this.getPaddingRight();
        int n7 = this.getWidth() - n4 - n3;
        n4 = 0;
        n7 = Math.max(0, n7);
        List list = this.mFlexLines;
        int n8 = list.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            int n10;
            int n14;
            int n15;
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            for (n15 = 0; n15 < (n14 = flexLine.mItemCount); ++n15) {
                int n16;
                int n17;
                int n18;
                n14 = flexLine.mFirstIndex + n15;
                View view = this.getReorderedChildAt(n14);
                if (view == null || (n18 = view.getVisibility()) == (n17 = 8)) continue;
                FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)view.getLayoutParams();
                if ((n14 = (int)(this.hasDividerBeforeChildAtAlongMainAxis(n14, n15) ? 1 : 0)) != 0) {
                    if (bl2) {
                        n14 = view.getRight();
                        n17 = flexboxLayout$LayoutParams.rightMargin;
                        n14 += n17;
                    } else {
                        n14 = view.getLeft();
                        n17 = flexboxLayout$LayoutParams.leftMargin;
                        n14 -= n17;
                        n17 = this.mDividerVerticalWidth;
                        n14 -= n17;
                    }
                    n17 = flexLine.mTop;
                    int n19 = flexLine.mCrossSize;
                    this.drawVerticalDivider(canvas, n14, n17, n19);
                }
                if (n15 != (n14 = flexLine.mItemCount + -1) || (n14 = this.mShowDividerVertical & 4) <= 0) continue;
                if (bl2) {
                    n14 = view.getLeft();
                    n16 = flexboxLayout$LayoutParams.leftMargin;
                    n14 -= n16;
                    n16 = this.mDividerVerticalWidth;
                    n14 -= n16;
                } else {
                    n14 = view.getRight();
                    n16 = flexboxLayout$LayoutParams.rightMargin;
                    n14 += n16;
                }
                n16 = flexLine.mTop;
                n18 = flexLine.mCrossSize;
                this.drawVerticalDivider(canvas, n14, n16, n18);
            }
            n15 = (int)(this.hasDividerBeforeFlexLine(i3) ? 1 : 0);
            if (n15 != 0) {
                if (bl3) {
                    n15 = flexLine.mBottom;
                } else {
                    n15 = flexLine.mTop;
                    n14 = this.mDividerHorizontalHeight;
                    n15 -= n14;
                }
                this.drawHorizontalDivider(canvas, n3, n15, n7);
            }
            if ((n15 = (int)(this.hasEndDividerAfterFlexLine(i3) ? 1 : 0)) == 0 || (n15 = this.mShowDividerHorizontal & 4) <= 0) continue;
            if (bl3) {
                n10 = flexLine.mTop;
                n15 = this.mDividerHorizontalHeight;
                n10 -= n15;
            } else {
                n10 = flexLine.mBottom;
            }
            this.drawHorizontalDivider(canvas, n3, n10, n7);
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean bl2, boolean bl3) {
        int n3 = this.getPaddingTop();
        int n4 = this.getPaddingBottom();
        int n7 = this.getHeight() - n4 - n3;
        n4 = 0;
        n7 = Math.max(0, n7);
        List list = this.mFlexLines;
        int n8 = list.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            int n10;
            int n14;
            int n15;
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(i3);
            for (n15 = 0; n15 < (n14 = flexLine.mItemCount); ++n15) {
                int n16;
                int n17;
                int n18;
                n14 = flexLine.mFirstIndex + n15;
                View view = this.getReorderedChildAt(n14);
                if (view == null || (n18 = view.getVisibility()) == (n17 = 8)) continue;
                FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)view.getLayoutParams();
                if ((n14 = (int)(this.hasDividerBeforeChildAtAlongMainAxis(n14, n15) ? 1 : 0)) != 0) {
                    if (bl3) {
                        n14 = view.getBottom();
                        n17 = flexboxLayout$LayoutParams.bottomMargin;
                        n14 += n17;
                    } else {
                        n14 = view.getTop();
                        n17 = flexboxLayout$LayoutParams.topMargin;
                        n14 -= n17;
                        n17 = this.mDividerHorizontalHeight;
                        n14 -= n17;
                    }
                    n17 = flexLine.mLeft;
                    int n19 = flexLine.mCrossSize;
                    this.drawHorizontalDivider(canvas, n17, n14, n19);
                }
                if (n15 != (n14 = flexLine.mItemCount + -1) || (n14 = this.mShowDividerHorizontal & 4) <= 0) continue;
                if (bl3) {
                    n14 = view.getTop();
                    n16 = flexboxLayout$LayoutParams.topMargin;
                    n14 -= n16;
                    n16 = this.mDividerHorizontalHeight;
                    n14 -= n16;
                } else {
                    n14 = view.getBottom();
                    n16 = flexboxLayout$LayoutParams.bottomMargin;
                    n14 += n16;
                }
                n16 = flexLine.mLeft;
                n18 = flexLine.mCrossSize;
                this.drawHorizontalDivider(canvas, n16, n14, n18);
            }
            n15 = (int)(this.hasDividerBeforeFlexLine(i3) ? 1 : 0);
            if (n15 != 0) {
                if (bl2) {
                    n15 = flexLine.mRight;
                } else {
                    n15 = flexLine.mLeft;
                    n14 = this.mDividerVerticalWidth;
                    n15 -= n14;
                }
                this.drawVerticalDivider(canvas, n15, n3, n7);
            }
            if ((n15 = (int)(this.hasEndDividerAfterFlexLine(i3) ? 1 : 0)) == 0 || (n15 = this.mShowDividerVertical & 4) <= 0) continue;
            if (bl2) {
                n10 = flexLine.mLeft;
                n15 = this.mDividerVerticalWidth;
                n10 -= n15;
            } else {
                n10 = flexLine.mRight;
            }
            this.drawVerticalDivider(canvas, n10, n3, n7);
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int n3, int n4, int n7) {
        Drawable drawable2 = this.mDividerDrawableHorizontal;
        if (drawable2 == null) {
            return;
        }
        int n8 = this.mDividerHorizontalHeight + n4;
        drawable2.setBounds(n3, n4, n7 += n3, n8);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int n3, int n4, int n7) {
        Drawable drawable2 = this.mDividerDrawableVertical;
        if (drawable2 == null) {
            return;
        }
        int n8 = this.mDividerVerticalWidth + n3;
        drawable2.setBounds(n3, n4, n8, n7 += n4);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int n3, int n4) {
        n3 = (int)(this.allViewsAreGoneBefore(n3, n4) ? 1 : 0);
        n4 = 0;
        int n7 = 1;
        if (n3 != 0) {
            n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.mShowDividerVertical & n7;
                if (n3 != 0) {
                    n4 = 1;
                }
                return n4 != 0;
            }
            n3 = this.mShowDividerHorizontal & n7;
            if (n3 != 0) {
                n4 = 1;
            }
            return n4 != 0;
        }
        n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
        if (n3 != 0) {
            n3 = this.mShowDividerVertical & 2;
            if (n3 != 0) {
                n4 = 1;
            }
            return n4 != 0;
        }
        n3 = this.mShowDividerHorizontal & 2;
        if (n3 != 0) {
            n4 = 1;
        }
        return n4 != 0;
    }

    private boolean hasDividerBeforeFlexLine(int n3) {
        List list;
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 < (n4 = (list = this.mFlexLines).size())) {
            n3 = (int)(this.allFlexLinesAreDummyBefore(n3) ? 1 : 0);
            n4 = 1;
            if (n3 != 0) {
                n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
                if (n3 != 0) {
                    n3 = this.mShowDividerHorizontal & n4;
                    if (n3 != 0) {
                        bl2 = true;
                    }
                    return bl2;
                }
                n3 = this.mShowDividerVertical & n4;
                if (n3 != 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.mShowDividerHorizontal & 2;
                if (n3 != 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = this.mShowDividerVertical & 2;
            if (n3 != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private boolean hasEndDividerAfterFlexLine(int n3) {
        List list;
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 < (n4 = (list = this.mFlexLines).size())) {
            Object object;
            int n7;
            n4 = 1;
            n3 += n4;
            while (n3 < (n7 = (object = this.mFlexLines).size())) {
                object = (FlexLine)this.mFlexLines.get(n3);
                n7 = ((FlexLine)object).getItemCountNotGone();
                if (n7 > 0) {
                    return false;
                }
                ++n3;
            }
            n3 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
            if (n3 != 0) {
                n3 = this.mShowDividerHorizontal & 4;
                if (n3 != 0) {
                    bl2 = true;
                }
                return bl2;
            }
            n3 = this.mShowDividerVertical & 4;
            if (n3 != 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void layoutHorizontal(boolean bl2, int n3, int n4, int n7, int n8) {
        FlexboxLayout flexboxLayout = this;
        int n10 = this.getPaddingLeft();
        int n14 = this.getPaddingRight();
        int n15 = n8 - n4;
        int n16 = n7 - n3;
        int n17 = this.getPaddingBottom();
        n15 -= n17;
        n17 = this.getPaddingTop();
        List list = this.mFlexLines;
        int n18 = list.size();
        int n19 = 0;
        while (true) {
            int n20;
            Object object;
            float f5;
            Object object2;
            float f6;
            float f7;
            int n21;
            int n22;
            ViewGroup.LayoutParams layoutParams;
            float f8;
            int n24;
            float f11;
            int n25;
            int n26;
            int n27;
            FlexLine flexLine;
            block25: {
                block30: {
                    block27: {
                        int n28;
                        block28: {
                            block29: {
                                if (n19 >= n18) {
                                    return;
                                }
                                flexLine = (FlexLine)flexboxLayout.mFlexLines.get(n19);
                                n27 = flexboxLayout.hasDividerBeforeFlexLine(n19);
                                if (n27 != 0) {
                                    n27 = flexboxLayout.mDividerHorizontalHeight;
                                    n15 -= n27;
                                    n17 += n27;
                                }
                                n27 = flexboxLayout.mJustifyContent;
                                n26 = 4;
                                n25 = 2;
                                f11 = 2.8E-45f;
                                n24 = 0;
                                f8 = 0.0f;
                                layoutParams = null;
                                n22 = 1;
                                if (n27 == 0) break block27;
                                if (n27 == n22) break block28;
                                n21 = 0x40000000;
                                f7 = 2.0f;
                                if (n27 == n25) break block29;
                                n28 = 3;
                                f6 = 4.2E-45f;
                                if (n27 != n28) {
                                    if (n27 != n26) {
                                        n28 = 5;
                                        f6 = 7.0E-45f;
                                        if (n27 != n28) {
                                            StringBuilder stringBuilder = new StringBuilder("Invalid justifyContent is set: ");
                                            n15 = flexboxLayout.mJustifyContent;
                                            stringBuilder.append(n15);
                                            String string2 = stringBuilder.toString();
                                            object2 = new IllegalStateException(string2);
                                            throw object2;
                                        }
                                        n28 = flexLine.getItemCountNotGone();
                                        if (n28 != 0) {
                                            n27 = flexLine.mMainSize;
                                            n27 = n16 - n27;
                                            f5 = n27;
                                            f6 = ++n28;
                                            f5 /= f6;
                                        } else {
                                            n27 = 0;
                                            f5 = 0.0f;
                                            object = null;
                                        }
                                        f6 = (float)n10 + f5;
                                        n21 = n16 - n14;
                                        f7 = (float)n21 - f5;
                                        break block25;
                                    } else {
                                        n28 = flexLine.getItemCountNotGone();
                                        if (n28 != 0) {
                                            n27 = flexLine.mMainSize;
                                            n27 = n16 - n27;
                                            f5 = n27;
                                            f6 = n28;
                                            f5 /= f6;
                                        } else {
                                            n27 = 0;
                                            f5 = 0.0f;
                                            object = null;
                                        }
                                        f6 = n10;
                                        f7 = f5 / f7;
                                        f6 += f7;
                                        n25 = n16 - n14;
                                        f11 = n25;
                                        f7 = f11 - f7;
                                    }
                                    break block25;
                                } else {
                                    f6 = n10;
                                    n27 = flexLine.getItemCountNotGone();
                                    if (n27 != n22) {
                                        f5 = n27 += -1;
                                    } else {
                                        n27 = 1065353216;
                                        f5 = 1.0f;
                                    }
                                    n21 = flexLine.mMainSize;
                                    f5 = (float)(n16 - n21) / f5;
                                    n21 = n16 - n14;
                                    f7 = n21;
                                }
                                break block25;
                            }
                            f6 = n10;
                            n27 = flexLine.mMainSize;
                            f11 = (float)(n16 - n27) / f7;
                            f6 += f11;
                            n25 = n16 - n14;
                            f11 = n25;
                            n27 = n16 - n27;
                            f5 = (float)n27 / f7;
                            f7 = f11 - f5;
                            break block30;
                        }
                        n28 = flexLine.mMainSize;
                        n27 = n16 - n28 + n14;
                        f5 = n27;
                        f7 = n28 -= n10;
                        f6 = f5;
                        break block30;
                    }
                    f6 = n10;
                    n27 = n16 - n14;
                    f7 = n27;
                }
                n27 = 0;
                f5 = 0.0f;
                object = null;
            }
            float f12 = Math.max(f5, 0.0f);
            n25 = 0;
            f11 = 0.0f;
            while (n25 < (n27 = flexLine.mItemCount)) {
                int n29;
                block32: {
                    int n30;
                    int n32;
                    float f14;
                    int n34;
                    FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
                    int n35;
                    int n36;
                    View view;
                    block35: {
                        block34: {
                            block33: {
                                block31: {
                                    n27 = flexLine.mFirstIndex + n25;
                                    view = flexboxLayout.getReorderedChildAt(n27);
                                    if (view != null && (n24 = view.getVisibility()) != (n26 = 8)) break block31;
                                    n20 = n10;
                                    n29 = n25;
                                    n36 = 2;
                                    n35 = 4;
                                    break block32;
                                }
                                ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
                                flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)layoutParams;
                                f8 = flexboxLayout$LayoutParams.leftMargin;
                                f6 += f8;
                                n24 = flexboxLayout$LayoutParams.rightMargin;
                                f8 = n24;
                                f7 -= f8;
                                if ((n27 = (int)(flexboxLayout.hasDividerBeforeChildAtAlongMainAxis(n27, n25) ? 1 : 0)) != 0) {
                                    n27 = flexboxLayout.mDividerVerticalWidth;
                                    f8 = n27;
                                    f6 += f8;
                                    n34 = n27;
                                    f14 = f7 -= f8;
                                } else {
                                    f14 = f7;
                                    n34 = 0;
                                }
                                n27 = flexLine.mItemCount - n22;
                                if (n25 != n27) break block33;
                                n27 = flexboxLayout.mShowDividerVertical;
                                n32 = 4;
                                if ((n27 &= 4) <= 0) break block34;
                                n30 = n27 = flexboxLayout.mDividerVerticalWidth;
                                break block35;
                            }
                            n32 = 4;
                        }
                        n30 = 0;
                    }
                    n27 = flexboxLayout.mFlexWrap;
                    n21 = 2;
                    f7 = 2.8E-45f;
                    if (n27 == n21) {
                        if (bl2) {
                            object = flexboxLayout.mFlexboxHelper;
                            n24 = Math.round(f14);
                            n36 = view.getMeasuredWidth();
                            n36 = n24 - n36;
                            n24 = view.getMeasuredHeight();
                            n35 = n15 - n24;
                            int n37 = Math.round(f14);
                            layoutParams = view;
                            n22 = n36;
                            n29 = n25;
                            n36 = 2;
                            n25 = n35;
                            n20 = n10;
                            object2 = flexboxLayout$LayoutParams;
                            n35 = 4;
                            n26 = n37;
                            n32 = n15;
                            ((FlexboxHelper)object).layoutSingleChildHorizontal(view, flexLine, n22, n25, n37, n15);
                        } else {
                            n20 = n10;
                            n29 = n25;
                            object2 = flexboxLayout$LayoutParams;
                            n36 = 2;
                            n35 = 4;
                            object = flexboxLayout.mFlexboxHelper;
                            n22 = Math.round(f6);
                            n24 = view.getMeasuredHeight();
                            n25 = n15 - n24;
                            n24 = Math.round(f6);
                            n21 = view.getMeasuredWidth();
                            n26 = n21 + n24;
                            layoutParams = view;
                            n32 = n15;
                            ((FlexboxHelper)object).layoutSingleChildHorizontal(view, flexLine, n22, n25, n26, n15);
                        }
                    } else {
                        n20 = n10;
                        n29 = n25;
                        object2 = flexboxLayout$LayoutParams;
                        n36 = 2;
                        n35 = 4;
                        if (bl2) {
                            object = flexboxLayout.mFlexboxHelper;
                            n24 = Math.round(f14);
                            n21 = view.getMeasuredWidth();
                            n22 = n24 - n21;
                            n26 = Math.round(f14);
                            n24 = view.getMeasuredHeight();
                            n32 = n24 + n17;
                            layoutParams = view;
                            n25 = n17;
                            ((FlexboxHelper)object).layoutSingleChildHorizontal(view, flexLine, n22, n17, n26, n32);
                        } else {
                            object = flexboxLayout.mFlexboxHelper;
                            n22 = Math.round(f6);
                            n24 = Math.round(f6);
                            n21 = view.getMeasuredWidth();
                            n26 = n21 + n24;
                            n24 = view.getMeasuredHeight();
                            n32 = n24 + n17;
                            layoutParams = view;
                            n25 = n17;
                            ((FlexboxHelper)object).layoutSingleChildHorizontal(view, flexLine, n22, n17, n26, n32);
                        }
                    }
                    f5 = (float)view.getMeasuredWidth() + f12;
                    n24 = ((ViewGroup.MarginLayoutParams)object2).rightMargin;
                    f8 = n24;
                    f6 += (f5 += f8);
                    n27 = view.getMeasuredWidth();
                    f5 = (float)n27 + f12;
                    n10 = ((ViewGroup.MarginLayoutParams)object2).leftMargin;
                    float f15 = n10;
                    f14 -= (f5 += f15);
                    if (bl2) {
                        n22 = 0;
                        n26 = 0;
                        Object var38_40 = null;
                        object = flexLine;
                        layoutParams = view;
                        n21 = n30;
                        n25 = n34;
                        flexLine.updatePositionFromView(view, n30, 0, n34, 0);
                    } else {
                        n22 = 0;
                        n26 = 0;
                        Object var38_41 = null;
                        object = flexLine;
                        layoutParams = view;
                        n21 = n34;
                        n25 = n30;
                        flexLine.updatePositionFromView(view, n34, 0, n30, 0);
                    }
                    f7 = f14;
                }
                n25 = n29 + 1;
                n10 = n20;
                n22 = 1;
                n26 = 4;
            }
            n20 = n10;
            n10 = flexLine.mCrossSize;
            n17 += n10;
            n15 -= n10;
            ++n19;
            n10 = n20;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void layoutVertical(boolean bl2, boolean bl3, int n3, int n4, int n7, int n8) {
        FlexboxLayout flexboxLayout = this;
        int n10 = this.getPaddingTop();
        int n14 = this.getPaddingBottom();
        int n15 = this.getPaddingRight();
        int n16 = this.getPaddingLeft();
        int n17 = n7 - n3;
        int n18 = n8 - n4;
        n17 -= n15;
        List list = this.mFlexLines;
        n15 = list.size();
        int n19 = 0;
        while (true) {
            float f5;
            int n20;
            float f6;
            float f7;
            int n21;
            float f8;
            int n22;
            float f11;
            int n24;
            float f12;
            int n25;
            int n26;
            int n27;
            FlexLine flexLine;
            block25: {
                block30: {
                    block31: {
                        block27: {
                            block28: {
                                block29: {
                                    if (n19 >= n15) {
                                        return;
                                    }
                                    flexLine = (FlexLine)flexboxLayout.mFlexLines.get(n19);
                                    n27 = flexboxLayout.hasDividerBeforeFlexLine(n19);
                                    if (n27 != 0) {
                                        n27 = flexboxLayout.mDividerVerticalWidth;
                                        n16 += n27;
                                        n17 -= n27;
                                    }
                                    n27 = flexboxLayout.mJustifyContent;
                                    n26 = 4;
                                    n25 = 0;
                                    f12 = 0.0f;
                                    n24 = 1;
                                    f11 = Float.MIN_VALUE;
                                    if (n27 == 0) break block27;
                                    if (n27 == n24) break block28;
                                    n22 = 2;
                                    f8 = 2.8E-45f;
                                    n21 = 0x40000000;
                                    f7 = 2.0f;
                                    if (n27 == n22) break block29;
                                    n22 = 3;
                                    f8 = 4.2E-45f;
                                    if (n27 != n22) {
                                        if (n27 != n26) {
                                            n22 = 5;
                                            f8 = 7.0E-45f;
                                            if (n27 != n22) {
                                                StringBuilder stringBuilder = new StringBuilder("Invalid justifyContent is set: ");
                                                n15 = flexboxLayout.mJustifyContent;
                                                stringBuilder.append(n15);
                                                String string2 = stringBuilder.toString();
                                                IllegalStateException illegalStateException = new IllegalStateException(string2);
                                                throw illegalStateException;
                                            }
                                            n27 = flexLine.getItemCountNotGone();
                                            if (n27 != 0) {
                                                n22 = flexLine.mMainSize;
                                                n22 = n18 - n22;
                                                f8 = n22;
                                                f6 = ++n27;
                                                f8 /= f6;
                                            } else {
                                                n22 = 0;
                                                f8 = 0.0f;
                                            }
                                            f6 = (float)n10 + f8;
                                            n21 = n18 - n14;
                                            f7 = (float)n21 - f8;
                                            break block25;
                                        } else {
                                            n27 = flexLine.getItemCountNotGone();
                                            if (n27 != 0) {
                                                n22 = flexLine.mMainSize;
                                                n22 = n18 - n22;
                                                f8 = n22;
                                                f6 = n27;
                                                f8 /= f6;
                                            } else {
                                                n22 = 0;
                                                f8 = 0.0f;
                                            }
                                            f6 = n10;
                                            f7 = f8 / f7;
                                            f6 += f7;
                                            n20 = n18 - n14;
                                            f5 = n20;
                                            f7 = f5 - f7;
                                        }
                                        break block25;
                                    } else {
                                        f6 = n10;
                                        n20 = flexLine.getItemCountNotGone();
                                        if (n20 != n24) {
                                            f5 = n20 += -1;
                                        } else {
                                            n20 = 1065353216;
                                            f5 = 1.0f;
                                        }
                                        n22 = flexLine.mMainSize;
                                        n22 = n18 - n22;
                                        f8 = (float)n22 / f5;
                                        n20 = n18 - n14;
                                        f7 = n20;
                                    }
                                    break block25;
                                }
                                f5 = n10;
                                n27 = flexLine.mMainSize;
                                f8 = (float)(n18 - n27) / f7;
                                f5 += f8;
                                n22 = n18 - n14;
                                f8 = n22;
                                n27 = n18 - n27;
                                f6 = (float)n27 / f7;
                                f7 = f8 - f6;
                                f6 = f5;
                                break block30;
                            }
                            n20 = flexLine.mMainSize;
                            n27 = n18 - n20 + n14;
                            f6 = n27;
                            n20 -= n10;
                            break block31;
                        }
                        f6 = n10;
                        n20 = n18 - n14;
                    }
                    f7 = n20;
                }
                n22 = 0;
                f8 = 0.0f;
            }
            f5 = Math.max(f8, 0.0f);
            n22 = 0;
            f8 = 0.0f;
            while (n22 < (n25 = flexLine.mItemCount)) {
                int n28;
                block34: {
                    void var46_45;
                    int n29;
                    Object object;
                    int n30;
                    float f14;
                    int n32;
                    float f15;
                    int n34;
                    float f16;
                    FlexboxLayout$LayoutParams flexboxLayout$LayoutParams;
                    ViewGroup.LayoutParams layoutParams;
                    View view;
                    block37: {
                        block36: {
                            block35: {
                                block33: {
                                    block32: {
                                        n25 = flexLine.mFirstIndex + n22;
                                        view = flexboxLayout.getReorderedChildAt(n25);
                                        if (view == null) break block32;
                                        n26 = view.getVisibility();
                                        n24 = 8;
                                        f11 = 1.1E-44f;
                                        if (n26 != n24) break block33;
                                    }
                                    n28 = n22;
                                    break block34;
                                }
                                ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
                                flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)layoutParams;
                                f11 = flexboxLayout$LayoutParams.topMargin;
                                f6 += f11;
                                n24 = flexboxLayout$LayoutParams.bottomMargin;
                                f11 = n24;
                                f7 -= f11;
                                if ((n25 = (int)(flexboxLayout.hasDividerBeforeChildAtAlongMainAxis(n25, n22) ? 1 : 0)) != 0) {
                                    n25 = flexboxLayout.mDividerHorizontalHeight;
                                    f11 = n25;
                                    f16 = f6 += f11;
                                    n34 = n25;
                                    f15 = f7 -= f11;
                                } else {
                                    f16 = f6;
                                    f15 = f7;
                                    n34 = 0;
                                }
                                n27 = flexLine.mItemCount;
                                n24 = 1;
                                f11 = Float.MIN_VALUE;
                                if (n22 != (n27 -= n24)) break block35;
                                n27 = flexboxLayout.mShowDividerHorizontal;
                                n32 = 4;
                                f14 = 5.6E-45f;
                                if ((n27 &= 4) <= 0) break block36;
                                n30 = n27 = flexboxLayout.mDividerHorizontalHeight;
                                break block37;
                            }
                            n32 = 4;
                            f14 = 5.6E-45f;
                        }
                        n30 = 0;
                    }
                    if (bl2) {
                        if (bl3) {
                            object = flexboxLayout.mFlexboxHelper;
                            n25 = view.getMeasuredWidth();
                            n29 = n17 - n25;
                            n25 = Math.round(f15);
                            n21 = view.getMeasuredHeight();
                            int n35 = n25 - n21;
                            int n36 = Math.round(f15);
                            n21 = 1;
                            f7 = Float.MIN_VALUE;
                            n28 = n22;
                            n24 = n29;
                            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams2 = flexboxLayout$LayoutParams;
                            n26 = n35;
                            n32 = n17;
                            n29 = n36;
                            ((FlexboxHelper)object).layoutSingleChildVertical(view, flexLine, n21 != 0, n24, n35, n17, n36);
                        } else {
                            n28 = n22;
                            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams3 = flexboxLayout$LayoutParams;
                            object = flexboxLayout.mFlexboxHelper;
                            n25 = view.getMeasuredWidth();
                            n24 = n17 - n25;
                            n26 = Math.round(f16);
                            n25 = Math.round(f16);
                            n22 = view.getMeasuredHeight();
                            n29 = n22 + n25;
                            n21 = 1;
                            f7 = Float.MIN_VALUE;
                            n32 = n17;
                            ((FlexboxHelper)object).layoutSingleChildVertical(view, flexLine, n21 != 0, n24, n26, n17, n29);
                        }
                    } else {
                        n28 = n22;
                        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams4 = flexboxLayout$LayoutParams;
                        if (bl3) {
                            object = flexboxLayout.mFlexboxHelper;
                            n25 = Math.round(f15);
                            n22 = view.getMeasuredHeight();
                            n26 = n25 - n22;
                            n25 = view.getMeasuredWidth();
                            n32 = n25 + n16;
                            n29 = Math.round(f15);
                            n21 = 0;
                            f7 = 0.0f;
                            n24 = n16;
                            ((FlexboxHelper)object).layoutSingleChildVertical(view, flexLine, false, n16, n26, n32, n29);
                        } else {
                            object = flexboxLayout.mFlexboxHelper;
                            n26 = Math.round(f16);
                            n32 = view.getMeasuredWidth() + n16;
                            n25 = Math.round(f16);
                            n22 = view.getMeasuredHeight();
                            n29 = n22 + n25;
                            n21 = 0;
                            f7 = 0.0f;
                            n24 = n16;
                            ((FlexboxHelper)object).layoutSingleChildVertical(view, flexLine, false, n16, n26, n32, n29);
                        }
                    }
                    f6 = (float)view.getMeasuredHeight() + f5;
                    layoutParams = var46_45;
                    f12 = var46_45.bottomMargin;
                    f14 = f6 + f12 + f16;
                    n27 = view.getMeasuredHeight();
                    f6 = (float)n27 + f5;
                    n25 = var46_45.topMargin;
                    f12 = n25;
                    f15 -= (f6 += f12);
                    if (bl3) {
                        n22 = 0;
                        f8 = 0.0f;
                        n24 = 0;
                        f11 = 0.0f;
                        layoutParams = null;
                        object = flexLine;
                        n21 = n30;
                        n26 = n34;
                        flexLine.updatePositionFromView(view, 0, n30, 0, n34);
                    } else {
                        n22 = 0;
                        f8 = 0.0f;
                        n24 = 0;
                        f11 = 0.0f;
                        layoutParams = null;
                        object = flexLine;
                        n21 = n34;
                        n26 = n30;
                        flexLine.updatePositionFromView(view, 0, n34, 0, n30);
                    }
                    f6 = f14;
                    f7 = f15;
                }
                n22 = n28 + 1;
                n24 = 1;
                f11 = Float.MIN_VALUE;
                n26 = 4;
            }
            n20 = flexLine.mCrossSize;
            n16 += n20;
            n17 -= n20;
            ++n19;
        }
    }

    private void measureHorizontal(int n3, int n4) {
        int n7;
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        Iterator iterator = this.mFlexboxHelper;
        Object object = this.mFlexLinesResult;
        ((FlexboxHelper)((Object)iterator)).calculateHorizontalFlexLines((FlexboxHelper$FlexLinesResult)object, n3, n4);
        iterator = this.mFlexLinesResult.mFlexLines;
        this.mFlexLines = iterator;
        iterator = this.mFlexboxHelper;
        ((FlexboxHelper)((Object)iterator)).determineMainSize(n3, n4);
        int n8 = this.mAlignItems;
        int n10 = 3;
        if (n8 == n10) {
            iterator = this.mFlexLines.iterator();
            while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                int n14;
                object = (FlexLine)iterator.next();
                n7 = -1 << -1;
                for (int i3 = 0; i3 < (n14 = ((FlexLine)object).mItemCount); ++i3) {
                    int n15;
                    int n16;
                    n14 = ((FlexLine)object).mFirstIndex + i3;
                    View view = this.getReorderedChildAt(n14);
                    if (view == null || (n16 = view.getVisibility()) == (n15 = 8)) continue;
                    FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = (FlexboxLayout$LayoutParams)view.getLayoutParams();
                    n15 = this.mFlexWrap;
                    int n17 = 2;
                    if (n15 != n17) {
                        n15 = ((FlexLine)object).mMaxBaseline;
                        n17 = view.getBaseline();
                        n15 -= n17;
                        n17 = flexboxLayout$LayoutParams.topMargin;
                        n15 = Math.max(n15, n17);
                        n14 = view.getMeasuredHeight() + n15;
                        n16 = flexboxLayout$LayoutParams.bottomMargin;
                        n7 = Math.max(n7, n14 += n16);
                        continue;
                    }
                    n15 = ((FlexLine)object).mMaxBaseline;
                    n17 = view.getMeasuredHeight();
                    n15 -= n17;
                    n17 = view.getBaseline() + n15;
                    n15 = flexboxLayout$LayoutParams.bottomMargin;
                    n15 = Math.max(n17, n15);
                    n14 = view.getMeasuredHeight();
                    n16 = flexboxLayout$LayoutParams.topMargin;
                    n14 = n14 + n16 + n15;
                    n7 = Math.max(n7, n14);
                }
                ((FlexLine)object).mCrossSize = n7;
            }
        }
        iterator = this.mFlexboxHelper;
        n10 = this.getPaddingTop();
        n7 = this.getPaddingBottom() + n10;
        ((FlexboxHelper)((Object)iterator)).determineCrossSize(n3, n4, n7);
        this.mFlexboxHelper.stretchViews();
        n8 = this.mFlexDirection;
        n10 = this.mFlexLinesResult.mChildState;
        this.setMeasuredDimensionForFlex(n8, n3, n4, n10);
    }

    private void measureVertical(int n3, int n4) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        Object object = this.mFlexboxHelper;
        FlexboxHelper$FlexLinesResult flexboxHelper$FlexLinesResult = this.mFlexLinesResult;
        ((FlexboxHelper)object).calculateVerticalFlexLines(flexboxHelper$FlexLinesResult, n3, n4);
        this.mFlexLines = object = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(n3, n4);
        object = this.mFlexboxHelper;
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingRight() + n7;
        ((FlexboxHelper)object).determineCrossSize(n3, n4, n8);
        this.mFlexboxHelper.stretchViews();
        int n10 = this.mFlexDirection;
        n7 = this.mFlexLinesResult.mChildState;
        this.setMeasuredDimensionForFlex(n10, n3, n4, n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setMeasuredDimensionForFlex(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15 = View.MeasureSpec.getMode((int)n4);
        int n16 = View.MeasureSpec.getSize((int)n4);
        int n17 = View.MeasureSpec.getMode((int)n7);
        int n18 = View.MeasureSpec.getSize((int)n7);
        if (n3 != 0 && n3 != (n14 = 1)) {
            n14 = 2;
            if (n3 != n14 && n3 != (n14 = 3)) {
                String string2 = hj0_0.a(n3, "Invalid flex direction: ");
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            n3 = this.getLargestMainSize();
            n14 = this.getSumOfCrossSize();
            n10 = this.getPaddingLeft() + n14;
            n14 = this.getPaddingRight() + n10;
        } else {
            n3 = this.getSumOfCrossSize();
            n14 = this.getPaddingTop() + n3;
            n3 = this.getPaddingBottom() + n14;
            n14 = this.getLargestMainSize();
        }
        n10 = 0x1000000;
        int n19 = 0x40000000;
        int n20 = -1 << -1;
        if (n15 != n20) {
            if (n15 != 0) {
                if (n15 != n19) {
                    String string3 = hj0_0.a(n15, "Unknown width mode is set: ");
                    IllegalStateException illegalStateException = new IllegalStateException(string3);
                    throw illegalStateException;
                }
                if (n16 < n14) {
                    n8 = View.combineMeasuredStates((int)n8, (int)n10);
                }
                n4 = View.resolveSizeAndState((int)n16, (int)n4, (int)n8);
            } else {
                n4 = View.resolveSizeAndState((int)n14, (int)n4, (int)n8);
            }
        } else {
            if (n16 < n14) {
                n8 = View.combineMeasuredStates((int)n8, (int)n10);
            } else {
                n16 = n14;
            }
            n4 = View.resolveSizeAndState((int)n16, (int)n4, (int)n8);
        }
        n15 = 256;
        if (n17 != n20) {
            if (n17 != 0) {
                if (n17 != n19) {
                    String string4 = hj0_0.a(n17, "Unknown height mode is set: ");
                    IllegalStateException illegalStateException = new IllegalStateException(string4);
                    throw illegalStateException;
                }
                if (n18 < n3) {
                    n8 = View.combineMeasuredStates((int)n8, (int)n15);
                }
                n3 = View.resolveSizeAndState((int)n18, (int)n7, (int)n8);
            } else {
                n3 = View.resolveSizeAndState((int)n3, (int)n7, (int)n8);
            }
        } else {
            if (n18 < n3) {
                n8 = View.combineMeasuredStates((int)n8, (int)n15);
            } else {
                n18 = n3;
            }
            n3 = View.resolveSizeAndState((int)n18, (int)n7, (int)n8);
        }
        this.setMeasuredDimension(n4, n3);
    }

    private void setWillNotDrawFlag() {
        Drawable drawable2 = this.mDividerDrawableHorizontal;
        if (drawable2 == null && (drawable2 = this.mDividerDrawableVertical) == null) {
            boolean bl2 = true;
            this.setWillNotDraw(bl2);
        } else {
            boolean bl3 = false;
            drawable2 = null;
            this.setWillNotDraw(false);
        }
    }

    public void addView(View view, int n3, ViewGroup.LayoutParams layoutParams) {
        Object object = this.mOrderCache;
        if (object == null) {
            int n4 = this.getChildCount();
            this.mOrderCache = object = new SparseIntArray(n4);
        }
        object = this.mFlexboxHelper;
        SparseIntArray sparseIntArray = this.mOrderCache;
        object = object.createReorderedIndices(view, n3, layoutParams, sparseIntArray);
        this.mReorderedIndices = (int[])object;
        super.addView(view, n3, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FlexboxLayout$LayoutParams;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        boolean bl2 = object instanceof FlexboxLayout$LayoutParams;
        if (bl2) {
            object = (FlexboxLayout$LayoutParams)object;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams((FlexboxLayout$LayoutParams)object);
            return flexboxLayout$LayoutParams;
        }
        bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            object = (ViewGroup.MarginLayoutParams)object;
            FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams((ViewGroup.MarginLayoutParams)object);
            return flexboxLayout$LayoutParams;
        }
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams((ViewGroup.LayoutParams)object);
        return flexboxLayout$LayoutParams;
    }

    public FlexboxLayout$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(context, attributeSet);
        return flexboxLayout$LayoutParams;
    }

    public int getAlignContent() {
        return this.mAlignContent;
    }

    public int getAlignItems() {
        return this.mAlignItems;
    }

    public int getChildHeightMeasureSpec(int n3, int n4, int n7) {
        return ViewGroup.getChildMeasureSpec((int)n3, (int)n4, (int)n7);
    }

    public int getChildWidthMeasureSpec(int n3, int n4, int n7) {
        return ViewGroup.getChildMeasureSpec((int)n3, (int)n4, (int)n7);
    }

    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getDecorationLengthMainAxis(View view, int n3, int n4) {
        int n7 = this.isMainAxisDirectionHorizontal();
        int n8 = 0;
        if (n7 != 0) {
            n7 = this.hasDividerBeforeChildAtAlongMainAxis(n3, n4);
            if (n7 != 0) {
                n8 = this.mDividerVerticalWidth;
            }
            if ((n7 = this.mShowDividerVertical & 4) <= 0) return n8;
            n7 = this.mDividerVerticalWidth;
            return n8 += n7;
        } else {
            n7 = this.hasDividerBeforeChildAtAlongMainAxis(n3, n4);
            if (n7 != 0) {
                n8 = this.mDividerHorizontalHeight;
            }
            if ((n7 = this.mShowDividerHorizontal & 4) <= 0) return n8;
            n7 = this.mDividerHorizontalHeight;
        }
        return n8 += n7;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    public View getFlexItemAt(int n3) {
        return this.getChildAt(n3);
    }

    public int getFlexItemCount() {
        return this.getChildCount();
    }

    public List getFlexLines() {
        boolean bl2;
        int n3 = this.mFlexLines.size();
        ArrayList<FlexLine> arrayList = new ArrayList<FlexLine>(n3);
        Iterator iterator = this.mFlexLines.iterator();
        while (bl2 = iterator.hasNext()) {
            FlexLine flexLine = (FlexLine)iterator.next();
            int n4 = flexLine.getItemCountNotGone();
            if (n4 == 0) continue;
            arrayList.add(flexLine);
        }
        return arrayList;
    }

    public List getFlexLinesInternal() {
        return this.mFlexLines;
    }

    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    public int getLargestMainSize() {
        int n3;
        Iterator iterator = this.mFlexLines.iterator();
        int n4 = -1 << -1;
        while ((n3 = iterator.hasNext()) != 0) {
            FlexLine flexLine = (FlexLine)iterator.next();
            n3 = flexLine.mMainSize;
            n4 = Math.max(n4, n3);
        }
        return n4;
    }

    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int n3) {
        int[] nArray;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (nArray = this.mReorderedIndices).length)) {
            n3 = nArray[n3];
            return this.getChildAt(n3);
        }
        return null;
    }

    public View getReorderedFlexItemAt(int n3) {
        return this.getReorderedChildAt(n3);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getSumOfCrossSize() {
        List list = this.mFlexLines;
        int n3 = list.size();
        int n4 = 0;
        int n7 = 0;
        while (n4 < n3) {
            FlexLine flexLine = (FlexLine)this.mFlexLines.get(n4);
            int n8 = this.hasDividerBeforeFlexLine(n4);
            if (n8 != 0) {
                n8 = this.isMainAxisDirectionHorizontal();
                n8 = n8 != 0 ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
                n7 += n8;
            }
            if ((n8 = this.hasEndDividerAfterFlexLine(n4)) != 0) {
                n8 = (int)(this.isMainAxisDirectionHorizontal() ? 1 : 0);
                n8 = n8 != 0 ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
                n7 += n8;
            }
            int n10 = flexLine.mCrossSize;
            n7 += n10;
            ++n4;
        }
        return n7;
    }

    public boolean isMainAxisDirectionHorizontal() {
        int n3 = this.mFlexDirection;
        int n4 = 1;
        if (n3 != 0 && n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public void onDraw(Canvas canvas) {
        int n3 = 1;
        Object object = this.mDividerDrawableVertical;
        if (object == null && (object = this.mDividerDrawableHorizontal) == null) {
            return;
        }
        int n4 = this.mShowDividerHorizontal;
        if (!n4 && !(n4 = this.mShowDividerVertical)) {
            return;
        }
        object = ViewCompat.a;
        n4 = this.getLayoutDirection();
        int n7 = this.mFlexDirection;
        int n8 = 2;
        boolean bl2 = false;
        if (n7) {
            if (n7 != n3) {
                if (n7 != n8) {
                    int n10 = 3;
                    if (n7 == n10) {
                        if (n4 == n3) {
                            bl2 = true;
                        }
                        if ((n4 = this.mFlexWrap) == n8) {
                            bl2 ^= n3;
                        }
                        this.drawDividersVertical(canvas, bl2, n3 != 0);
                    }
                } else {
                    if (n4 == n3) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    n7 = this.mFlexWrap;
                    if (n7 == n8) {
                        n4 ^= n3;
                    }
                    this.drawDividersVertical(canvas, n4 != 0, false);
                }
            } else {
                if (n4 != n3) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                n7 = this.mFlexWrap;
                if (n7 != n8) {
                    n3 = 0;
                }
                this.drawDividersHorizontal(canvas, n4 != 0, n3 != 0);
            }
        } else {
            if (n4 == n3) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            n7 = this.mFlexWrap;
            if (n7 != n8) {
                n3 = 0;
            }
            this.drawDividersHorizontal(canvas, n4 != 0, n3 != 0);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        void var8_22;
        int n10 = 1;
        Object object = ViewCompat.a;
        int n14 = this.getLayoutDirection();
        int n15 = this.mFlexDirection;
        int n16 = 0;
        if (n15) {
            void var8_19;
            if (n15 != n10) {
                void var8_16;
                int n17;
                int n18 = 2;
                if (n15 != n18) {
                    void var8_12;
                    int n19;
                    int n20 = 3;
                    if (n15 != n20) {
                        object = new StringBuilder("Invalid flex direction is set: ");
                        n15 = this.mFlexDirection;
                        ((StringBuilder)object).append(n15);
                        object = ((StringBuilder)object).toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    if (n14 == n10) {
                        n16 = 1;
                    }
                    if ((n19 = this.mFlexWrap) == n18) {
                        int n21 = n10 ^= n16;
                    } else {
                        int n22 = n16;
                    }
                    n15 = 1;
                    FlexboxLayout flexboxLayout = this;
                    n16 = n3;
                    int n24 = n4;
                    int n25 = n7;
                    this.layoutVertical((boolean)var8_12, n15 != 0, n3, n4, n7, n8);
                    return;
                }
                if (n14 == n10) {
                    n16 = 1;
                }
                if ((n17 = this.mFlexWrap) == n18) {
                    int n26 = n10 ^= n16;
                } else {
                    int n27 = n16;
                }
                n15 = 0;
                FlexboxLayout flexboxLayout = this;
                n16 = n3;
                int n28 = n4;
                int n29 = n7;
                this.layoutVertical((boolean)var8_16, false, n3, n4, n7, n8);
                return;
            }
            if (n14 != n10) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                object = null;
            }
            FlexboxLayout flexboxLayout = this;
            n15 = n3;
            n16 = n4;
            int n30 = n7;
            int n32 = n8;
            this.layoutHorizontal((boolean)var8_19, n3, n4, n7, n8);
            return;
        }
        if (n14 == n10) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            object = null;
        }
        FlexboxLayout flexboxLayout = this;
        n15 = n3;
        n16 = n4;
        int n34 = n7;
        int n35 = n8;
        this.layoutHorizontal((boolean)var8_22, n3, n4, n7, n8);
    }

    public void onMeasure(int n3, int n4) {
        SparseIntArray sparseIntArray;
        int n7;
        int n8;
        Object object = this.mOrderCache;
        if (object == null) {
            n8 = this.getChildCount();
            this.mOrderCache = object = new SparseIntArray(n8);
        }
        if ((n7 = (object = this.mFlexboxHelper).isOrderChangedFromLastMeasurement(sparseIntArray = this.mOrderCache)) != 0) {
            object = this.mFlexboxHelper;
            sparseIntArray = this.mOrderCache;
            object = object.createReorderedIndices(sparseIntArray);
            this.mReorderedIndices = (int[])object;
        }
        if ((n7 = this.mFlexDirection) != 0 && n7 != (n8 = 1)) {
            n8 = 2;
            if (n7 != n8 && n7 != (n8 = 3)) {
                CharSequence charSequence = new StringBuilder("Invalid value for the flex direction is set: ");
                n7 = this.mFlexDirection;
                charSequence.append(n7);
                charSequence = charSequence.toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                throw illegalStateException;
            }
            this.measureVertical(n3, n4);
        } else {
            this.measureHorizontal(n3, n4);
        }
    }

    public void onNewFlexItemAdded(View view, int n3, int n4, FlexLine flexLine) {
        int n7 = this.hasDividerBeforeChildAtAlongMainAxis(n3, n4);
        if (n7 != 0) {
            n7 = this.isMainAxisDirectionHorizontal();
            if (n7 != 0) {
                n7 = flexLine.mMainSize;
                n3 = this.mDividerVerticalWidth;
                flexLine.mMainSize = n7 += n3;
                flexLine.mDividerLengthInMainSize = n7 = flexLine.mDividerLengthInMainSize + n3;
            } else {
                n7 = flexLine.mMainSize;
                n3 = this.mDividerHorizontalHeight;
                flexLine.mMainSize = n7 += n3;
                flexLine.mDividerLengthInMainSize = n7 = flexLine.mDividerLengthInMainSize + n3;
            }
        }
    }

    public void onNewFlexLineAdded(FlexLine flexLine) {
        int n3 = this.isMainAxisDirectionHorizontal();
        if (n3 != 0) {
            n3 = this.mShowDividerVertical & 4;
            if (n3 > 0) {
                n3 = flexLine.mMainSize;
                int n4 = this.mDividerVerticalWidth;
                flexLine.mMainSize = n3 += n4;
                flexLine.mDividerLengthInMainSize = n3 = flexLine.mDividerLengthInMainSize + n4;
            }
        } else {
            n3 = this.mShowDividerHorizontal & 4;
            if (n3 > 0) {
                n3 = flexLine.mMainSize;
                int n7 = this.mDividerHorizontalHeight;
                flexLine.mMainSize = n3 += n7;
                flexLine.mDividerLengthInMainSize = n3 = flexLine.mDividerLengthInMainSize + n7;
            }
        }
    }

    public void setAlignContent(int n3) {
        int n4 = this.mAlignContent;
        if (n4 != n3) {
            this.mAlignContent = n3;
            this.requestLayout();
        }
    }

    public void setAlignItems(int n3) {
        int n4 = this.mAlignItems;
        if (n4 != n3) {
            this.mAlignItems = n3;
            this.requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable2) {
        this.setDividerDrawableHorizontal(drawable2);
        this.setDividerDrawableVertical(drawable2);
    }

    public void setDividerDrawableHorizontal(Drawable drawable2) {
        Drawable drawable3 = this.mDividerDrawableHorizontal;
        if (drawable2 == drawable3) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable2;
        if (drawable2 != null) {
            int n3;
            this.mDividerHorizontalHeight = n3 = drawable2.getIntrinsicHeight();
        } else {
            boolean bl2 = false;
            drawable2 = null;
            this.mDividerHorizontalHeight = 0;
        }
        this.setWillNotDrawFlag();
        this.requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable2) {
        Drawable drawable3 = this.mDividerDrawableVertical;
        if (drawable2 == drawable3) {
            return;
        }
        this.mDividerDrawableVertical = drawable2;
        if (drawable2 != null) {
            int n3;
            this.mDividerVerticalWidth = n3 = drawable2.getIntrinsicWidth();
        } else {
            boolean bl2 = false;
            drawable2 = null;
            this.mDividerVerticalWidth = 0;
        }
        this.setWillNotDrawFlag();
        this.requestLayout();
    }

    public void setFlexDirection(int n3) {
        int n4 = this.mFlexDirection;
        if (n4 != n3) {
            this.mFlexDirection = n3;
            this.requestLayout();
        }
    }

    public void setFlexLines(List list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int n3) {
        int n4 = this.mFlexWrap;
        if (n4 != n3) {
            this.mFlexWrap = n3;
            this.requestLayout();
        }
    }

    public void setJustifyContent(int n3) {
        int n4 = this.mJustifyContent;
        if (n4 != n3) {
            this.mJustifyContent = n3;
            this.requestLayout();
        }
    }

    public void setMaxLine(int n3) {
        int n4 = this.mMaxLine;
        if (n4 != n3) {
            this.mMaxLine = n3;
            this.requestLayout();
        }
    }

    public void setShowDivider(int n3) {
        this.setShowDividerVertical(n3);
        this.setShowDividerHorizontal(n3);
    }

    public void setShowDividerHorizontal(int n3) {
        int n4 = this.mShowDividerHorizontal;
        if (n3 != n4) {
            this.mShowDividerHorizontal = n3;
            this.requestLayout();
        }
    }

    public void setShowDividerVertical(int n3) {
        int n4 = this.mShowDividerVertical;
        if (n3 != n4) {
            this.mShowDividerVertical = n3;
            this.requestLayout();
        }
    }

    public void updateViewCache(int n3, View view) {
    }
}

