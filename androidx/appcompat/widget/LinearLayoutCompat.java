/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.LinearLayout$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import androidx.core.view.ViewCompat;

public class LinearLayoutCompat
extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        float f5;
        int n4;
        int n7;
        boolean bl2;
        this.mBaselineAligned = bl2 = true;
        this.mBaselineAlignedChildIndex = n7 = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = n4 = 0x800033;
        Object object = R$styleable.LinearLayoutCompat;
        object = Tn3.f(context, attributeSet, (int[])object, n3, 0);
        int[] nArray = R$styleable.LinearLayoutCompat;
        TypedArray typedArray = ((Tn3)object).b;
        ViewCompat.r((View)this, context, nArray, attributeSet, typedArray, n3, 0);
        int n8 = R$styleable.LinearLayoutCompat_android_orientation;
        attributeSet = ((Tn3)object).b;
        n8 = attributeSet.getInt(n8, n7);
        if (n8 >= 0) {
            this.setOrientation(n8);
        }
        n8 = R$styleable.LinearLayoutCompat_android_gravity;
        if ((n8 = attributeSet.getInt(n8, n7)) >= 0) {
            this.setGravity(n8);
        }
        n8 = R$styleable.LinearLayoutCompat_android_baselineAligned;
        if ((n8 = (int)(attributeSet.getBoolean(n8, bl2) ? 1 : 0)) == 0) {
            this.setBaselineAligned(n8 != 0);
        }
        n8 = R$styleable.LinearLayoutCompat_android_weightSum;
        this.mWeightSum = f5 = attributeSet.getFloat(n8, -1.0f);
        n8 = R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex;
        this.mBaselineAlignedChildIndex = n8 = attributeSet.getInt(n8, n7);
        n8 = R$styleable.LinearLayoutCompat_measureWithLargestChild;
        n8 = (int)(attributeSet.getBoolean(n8, false) ? 1 : 0);
        this.mUseLargestChild = n8;
        n8 = R$styleable.LinearLayoutCompat_divider;
        context = ((Tn3)object).b(n8);
        this.setDividerDrawable((Drawable)context);
        n8 = R$styleable.LinearLayoutCompat_showDividers;
        this.mShowDividers = n8 = attributeSet.getInt(n8, 0);
        n8 = R$styleable.LinearLayoutCompat_dividerPadding;
        this.mDividerPadding = n8 = attributeSet.getDimensionPixelSize(n8, 0);
        ((Tn3)object).g();
    }

    private void forceUniformHeight(int n3, int n4) {
        int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n8;
            View view = this.getVirtualChildAt(i3);
            int n10 = view.getVisibility();
            if (n10 == (n8 = 8)) continue;
            Object object2 = object = view.getLayoutParams();
            object2 = (LinearLayoutCompat$LayoutParams)((Object)object);
            n10 = object2.height;
            n8 = -1;
            if (n10 != n8) continue;
            int n14 = object2.width;
            object2.width = n10 = view.getMeasuredWidth();
            object = this;
            n8 = n4;
            this.measureChildWithMargins(view, n4, 0, n7, 0);
            object2.width = n14;
        }
    }

    private void forceUniformWidth(int n3, int n4) {
        int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n8;
            View view = this.getVirtualChildAt(i3);
            int n10 = view.getVisibility();
            if (n10 == (n8 = 8)) continue;
            Object object2 = object = view.getLayoutParams();
            object2 = (LinearLayoutCompat$LayoutParams)((Object)object);
            n10 = object2.width;
            n8 = -1;
            if (n10 != n8) continue;
            int n14 = object2.height;
            object2.height = n10 = view.getMeasuredHeight();
            object = this;
            n8 = n7;
            this.measureChildWithMargins(view, n7, 0, n4, 0);
            object2.height = n14;
        }
    }

    private void setChildFrame(View view, int n3, int n4, int n7, int n8) {
        view.layout(n3, n4, n7 += n3, n8 += n4);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayoutCompat$LayoutParams;
    }

    /*
     * Unable to fully structure code
     */
    public void drawDividersHorizontal(Canvas var1_1) {
        block8: {
            block7: {
                var2_2 = 1;
                var3_3 = this.getVirtualChildCount();
                var4_4 = dE3.a;
                var4_4 = this.getLayoutDirection();
                var4_4 = var4_4 == var2_2 ? 1 : 0;
                for (var5_5 = 0; var5_5 < var3_3; var5_5 += var2_2) {
                    var6_6 = this.getVirtualChildAt(var5_5);
                    if (var6_6 == null || (var7_7 = var6_6.getVisibility()) == (var8_8 = 8) || (var7_7 = (int)this.hasDividerBeforeChildAt(var5_5)) == 0) continue;
                    var9_9 = (LinearLayoutCompat$LayoutParams)var6_6.getLayoutParams();
                    if (var4_4 != 0) {
                        var10_10 = var6_6.getRight();
                        var7_7 = var9_9.rightMargin;
                        var10_10 += var7_7;
                    } else {
                        var10_10 = var6_6.getLeft();
                        var7_7 = var9_9.leftMargin;
                        var10_10 -= var7_7;
                        var7_7 = this.mDividerWidth;
                        var10_10 -= var7_7;
                    }
                    this.drawVerticalDivider(var1_1, var10_10);
                }
                var5_5 = (int)this.hasDividerBeforeChildAt(var3_3);
                if (var5_5 == 0) break block8;
                var11_11 = this.getVirtualChildAt(var3_3 -= var2_2);
                if (var11_11 != null) ** GOTO lbl36
                if (var4_4 != 0) {
                    var2_2 = this.getPaddingLeft();
                } else {
                    var2_2 = this.getWidth();
                    var3_3 = this.getPaddingRight();
                    var2_2 -= var3_3;
                    var3_3 = this.mDividerWidth;
lbl33:
                    // 2 sources

                    while (true) {
                        var2_2 -= var3_3;
                        break block7;
                        break;
                    }
lbl36:
                    // 1 sources

                    var12_12 = (LinearLayoutCompat$LayoutParams)var11_11.getLayoutParams();
                    if (var4_4 != 0) {
                        var2_2 = var11_11.getLeft();
                        var3_3 = var12_12.leftMargin;
                        var2_2 -= var3_3;
                        var3_3 = this.mDividerWidth;
                        ** continue;
                    }
                    var2_2 = var11_11.getRight();
                    var3_3 = var12_12.rightMargin;
                    var2_2 += var3_3;
                }
            }
            this.drawVerticalDivider(var1_1, var2_2);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int n3;
        int n4 = this.getVirtualChildCount();
        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = null;
        for (n3 = 0; n3 < n4; ++n3) {
            int n7;
            int n8;
            View view = this.getVirtualChildAt(n3);
            if (view == null || (n8 = view.getVisibility()) == (n7 = 8) || (n8 = (int)(this.hasDividerBeforeChildAt(n3) ? 1 : 0)) == 0) continue;
            LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams2 = (LinearLayoutCompat$LayoutParams)view.getLayoutParams();
            int n10 = view.getTop();
            n8 = linearLayoutCompat$LayoutParams2.topMargin;
            n10 -= n8;
            n8 = this.mDividerHeight;
            this.drawHorizontalDivider(canvas, n10 -= n8);
        }
        n3 = (int)(this.hasDividerBeforeChildAt(n4) ? 1 : 0);
        if (n3 != 0) {
            View view = this.getVirtualChildAt(n4 += -1);
            if (view == null) {
                n4 = this.getHeight();
                n3 = this.getPaddingBottom();
                n4 -= n3;
                n3 = this.mDividerHeight;
                n4 -= n3;
            } else {
                linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)view.getLayoutParams();
                n4 = view.getBottom();
                n3 = linearLayoutCompat$LayoutParams.bottomMargin;
                n4 += n3;
            }
            this.drawHorizontalDivider(canvas, n4);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int n3) {
        Drawable drawable2 = this.mDivider;
        int n4 = this.getPaddingLeft();
        int n7 = this.mDividerPadding;
        n4 += n7;
        n7 = this.getWidth();
        int n8 = this.getPaddingRight();
        n7 -= n8;
        n8 = this.mDividerPadding;
        n7 -= n8;
        n8 = this.mDividerHeight + n3;
        drawable2.setBounds(n4, n3, n7, n8);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int n3) {
        Drawable drawable2 = this.mDivider;
        int n4 = this.getPaddingTop();
        int n7 = this.mDividerPadding;
        n4 += n7;
        n7 = this.mDividerWidth + n3;
        int n8 = this.getHeight();
        int n10 = this.getPaddingBottom();
        n8 -= n10;
        n10 = this.mDividerPadding;
        drawable2.setBounds(n3, n4, n7, n8 -= n10);
        this.mDivider.draw(canvas);
    }

    public LinearLayoutCompat$LayoutParams generateDefaultLayoutParams() {
        int n3 = this.mOrientation;
        int n4 = -2;
        if (n3 == 0) {
            LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayout.LayoutParams(n4, n4);
            return linearLayoutCompat$LayoutParams;
        }
        int n7 = 1;
        if (n3 == n7) {
            LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayout.LayoutParams(-1, n4);
            return linearLayoutCompat$LayoutParams;
        }
        return null;
    }

    public LinearLayoutCompat$LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = this.getContext();
        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayoutCompat$LayoutParams(context, attributeSet);
        return linearLayoutCompat$LayoutParams;
    }

    public LinearLayoutCompat$LayoutParams generateLayoutParams(ViewGroup.LayoutParams object) {
        boolean bl2 = object instanceof LinearLayoutCompat$LayoutParams;
        if (bl2) {
            object = (LinearLayoutCompat$LayoutParams)((Object)object);
            LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)object);
            return linearLayoutCompat$LayoutParams;
        }
        bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            object = (ViewGroup.MarginLayoutParams)object;
            LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)object);
            return linearLayoutCompat$LayoutParams;
        }
        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = new LinearLayout.LayoutParams(object);
        return linearLayoutCompat$LayoutParams;
    }

    public int getBaseline() {
        int n3;
        int n4 = this.mBaselineAlignedChildIndex;
        if (n4 < 0) {
            return super.getBaseline();
        }
        n4 = this.getChildCount();
        if (n4 > (n3 = this.mBaselineAlignedChildIndex)) {
            int n7;
            Object object = this.getChildAt(n3);
            if ((n3 = object.getBaseline()) == (n7 = -1)) {
                n4 = this.mBaselineAlignedChildIndex;
                if (n4 == 0) {
                    return n7;
                }
                object = new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                throw object;
            }
            n7 = this.mBaselineChildTop;
            int n8 = this.mOrientation;
            int n10 = 1;
            if (n8 == n10 && (n8 = this.mGravity & 0x70) != (n10 = 48)) {
                n10 = 16;
                if (n8 != n10) {
                    n10 = 80;
                    if (n8 == n10) {
                        n7 = this.getBottom();
                        n8 = this.getTop();
                        n7 -= n8;
                        n8 = this.getPaddingBottom();
                        n7 -= n8;
                        n8 = this.mTotalLength;
                        n7 -= n8;
                    }
                } else {
                    n8 = this.getBottom();
                    n10 = this.getTop();
                    n8 -= n10;
                    n10 = this.getPaddingTop();
                    n8 -= n10;
                    n10 = this.getPaddingBottom();
                    n8 -= n10;
                    n10 = this.mTotalLength;
                    n8 = (n8 - n10) / 2;
                    n7 += n8;
                }
            }
            n4 = ((LinearLayoutCompat$LayoutParams)object.getLayoutParams()).topMargin;
            return n7 + n4 + n3;
        }
        RuntimeException runtimeException = new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        throw runtimeException;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int n3) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int n3) {
        return this.getChildAt(n3);
    }

    public int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int n3) {
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == 0) {
            n3 = this.mShowDividers & n4;
            if (n3 != 0) {
                bl2 = true;
            }
            return bl2;
        }
        int n7 = this.getChildCount();
        if (n3 == n7) {
            n3 = this.mShowDividers & 4;
            if (n3 != 0) {
                bl2 = true;
            }
            return bl2;
        }
        n7 = this.mShowDividers & 2;
        if (n7 != 0) {
            n3 -= n4;
            while (n3 >= 0) {
                int n8;
                View view = this.getChildAt(n3);
                n7 = view.getVisibility();
                if (n7 != (n8 = 8)) {
                    bl2 = true;
                    break;
                }
                n3 += -1;
            }
        }
        return bl2;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void layoutHorizontal(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        LinearLayoutCompat linearLayoutCompat = this;
        int n16 = 1;
        int n17 = dE3.a;
        n17 = this.getLayoutDirection();
        int n18 = 0;
        View view = null;
        if (n17 == n16) {
            n17 = 1;
        } else {
            n17 = 0;
            Object var10_10 = null;
        }
        int n19 = this.getPaddingTop();
        int n20 = n8 - n4;
        int n21 = this.getPaddingBottom();
        int n22 = n20 - n21;
        n21 = this.getPaddingBottom();
        int n24 = (n20 -= n19) - n21;
        int n25 = this.getVirtualChildCount();
        n20 = linearLayoutCompat.mGravity;
        n21 = 0x800007 & n20;
        int n26 = n20 & 0x70;
        boolean bl2 = linearLayoutCompat.mBaselineAligned;
        int[] nArray = linearLayoutCompat.mMaxAscent;
        int[] nArray2 = linearLayoutCompat.mMaxDescent;
        n20 = this.getLayoutDirection();
        n20 = Gravity.getAbsoluteGravity((int)n21, (int)n20);
        int n27 = 2;
        if (n20 != n16) {
            n21 = 5;
            if (n20 != n21) {
                n20 = this.getPaddingLeft();
            } else {
                n20 = this.getPaddingLeft() + n7 - n3;
                n21 = linearLayoutCompat.mTotalLength;
                n20 -= n21;
            }
        } else {
            n20 = this.getPaddingLeft();
            n21 = n7 - n3;
            n15 = linearLayoutCompat.mTotalLength;
            n21 = (n21 - n15) / 2;
            n20 += n21;
        }
        int n28 = -1;
        if (n17 != 0) {
            n14 = n17 = n25 + -1;
            n10 = -1;
        } else {
            n14 = 0;
            n10 = 1;
        }
        n15 = 0;
        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams = null;
        while (true) {
            int n29;
            block18: {
                block23: {
                    block19: {
                        int n30;
                        LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams2;
                        int n32;
                        block22: {
                            block20: {
                                block21: {
                                    block17: {
                                        if (n15 >= n25) {
                                            return;
                                        }
                                        n17 = n10 * n15;
                                        n21 = n17 + n14;
                                        view = linearLayoutCompat.getVirtualChildAt(n21);
                                        if (view != null) break block17;
                                        n20 = linearLayoutCompat.measureNullChild(n21) + n20;
                                        n29 = n19;
                                        n8 = n25;
                                        n17 = 1;
                                        break block18;
                                    }
                                    n17 = view.getVisibility();
                                    if (n17 == (n16 = 8)) break block19;
                                    n16 = view.getMeasuredWidth();
                                    n32 = view.getMeasuredHeight();
                                    linearLayoutCompat$LayoutParams2 = (LinearLayoutCompat$LayoutParams)view.getLayoutParams();
                                    n3 = n15;
                                    n15 = bl2 && (n15 = linearLayoutCompat$LayoutParams2.height) != n28 ? view.getBaseline() : -1;
                                    n28 = linearLayoutCompat$LayoutParams2.gravity;
                                    if (n28 < 0) {
                                        n28 = n26;
                                    }
                                    n8 = n25;
                                    n25 = 16;
                                    if ((n28 &= 0x70) == n25) break block20;
                                    n25 = 48;
                                    if (n28 == n25) break block21;
                                    n25 = 80;
                                    if (n28 != n25) {
                                        n28 = n19;
                                        n25 = -1;
                                        break block22;
                                    } else {
                                        n28 = n22 - n32;
                                        n25 = linearLayoutCompat$LayoutParams2.bottomMargin;
                                        n28 -= n25;
                                        n25 = -1;
                                        if (n15 != n25) {
                                            n30 = view.getMeasuredHeight() - n15;
                                            n15 = nArray2[n27] - n30;
                                            n28 -= n15;
                                        }
                                    }
                                    break block22;
                                }
                                n25 = -1;
                                n28 = linearLayoutCompat$LayoutParams2.topMargin + n19;
                                if (n15 != n25) {
                                    int n34 = 1;
                                    n28 = n30 = nArray[n34] - n15 + n28;
                                }
                                break block22;
                            }
                            n25 = -1;
                            n15 = (n24 - n32) / 2 + n19;
                            n28 = linearLayoutCompat$LayoutParams2.topMargin;
                            n15 += n28;
                            n28 = linearLayoutCompat$LayoutParams2.bottomMargin;
                            n15 -= n28;
                            n28 = n15;
                        }
                        n15 = (int)(linearLayoutCompat.hasDividerBeforeChildAt(n21) ? 1 : 0);
                        if (n15 != 0) {
                            n15 = linearLayoutCompat.mDividerWidth;
                            n20 += n15;
                        }
                        n15 = linearLayoutCompat$LayoutParams2.leftMargin;
                        n30 = n20 + n15;
                        n20 = linearLayoutCompat.getLocationOffset(view) + n30;
                        linearLayoutCompat$LayoutParams = linearLayoutCompat$LayoutParams2;
                        LinearLayoutCompat linearLayoutCompat2 = this;
                        n25 = n21;
                        n21 = n28;
                        n15 = n16;
                        n29 = n19;
                        n28 = n32;
                        this.setChildFrame(view, n20, n21, n16, n32);
                        n17 = linearLayoutCompat$LayoutParams.rightMargin;
                        View view2 = view;
                        n18 = linearLayoutCompat.getNextLocationOffset(view) + (n16 += n17) + n30;
                        n17 = linearLayoutCompat.getChildrenSkipCount(view, n25);
                        n15 = n17 + n3;
                        n20 = n18;
                        break block23;
                    }
                    n29 = n19;
                    n8 = n25;
                }
                n17 = 1;
            }
            n15 += n17;
            n25 = n8;
            n19 = n29;
            n28 = -1;
            n16 = 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void layoutVertical(int n3, int n4, int n7, int n8) {
        LinearLayoutCompat linearLayoutCompat = this;
        int n10 = this.getPaddingLeft();
        int n14 = n7 - n3;
        int n15 = this.getPaddingRight();
        int n16 = n14 - n15;
        n15 = this.getPaddingRight();
        int n17 = (n14 -= n10) - n15;
        int n18 = this.getVirtualChildCount();
        n14 = this.mGravity;
        n15 = n14 & 0x70;
        int n19 = 0x800007;
        int n20 = n14 & n19;
        n14 = 16;
        if (n15 != n14) {
            n14 = 80;
            if (n15 != n14) {
                n14 = this.getPaddingTop();
            } else {
                n14 = this.getPaddingTop() + n8 - n4;
                n15 = this.mTotalLength;
                n14 -= n15;
            }
        } else {
            n14 = this.getPaddingTop();
            n15 = n8 - n4;
            n19 = this.mTotalLength;
            n15 = (n15 - n19) / 2;
            n14 += n15;
        }
        n15 = 0;
        ViewGroup.LayoutParams layoutParams = null;
        int n21 = 0;
        while (true) {
            block10: {
                LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams;
                int n22;
                int n24;
                View view;
                block13: {
                    block14: {
                        block11: {
                            block12: {
                                int n25;
                                block9: {
                                    if (n21 >= n18) {
                                        return;
                                    }
                                    view = linearLayoutCompat.getVirtualChildAt(n21);
                                    n25 = 1;
                                    if (view != null) break block9;
                                    n14 = n15 = linearLayoutCompat.measureNullChild(n21) + n14;
                                    break block10;
                                }
                                n15 = view.getVisibility();
                                if (n15 == (n19 = 8)) break block10;
                                n24 = view.getMeasuredWidth();
                                n22 = view.getMeasuredHeight();
                                ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
                                linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)layoutParams;
                                n15 = linearLayoutCompat$LayoutParams.gravity;
                                if (n15 < 0) {
                                    n15 = n20;
                                }
                                if ((n15 = Gravity.getAbsoluteGravity((int)n15, (int)(n19 = this.getLayoutDirection())) & 7) == n25) break block11;
                                n19 = 5;
                                if (n15 == n19) break block12;
                                n15 = linearLayoutCompat$LayoutParams.leftMargin + n10;
                                break block13;
                            }
                            n15 = n16 - n24;
                            n19 = linearLayoutCompat$LayoutParams.rightMargin;
                            break block14;
                        }
                        n15 = (n17 - n24) / 2 + n10;
                        n19 = linearLayoutCompat$LayoutParams.leftMargin;
                        n15 += n19;
                        n19 = linearLayoutCompat$LayoutParams.rightMargin;
                    }
                    n15 -= n19;
                }
                n19 = n15;
                n15 = (int)(linearLayoutCompat.hasDividerBeforeChildAt(n21) ? 1 : 0);
                if (n15 != 0) {
                    n15 = linearLayoutCompat.mDividerHeight;
                    n14 += n15;
                }
                n15 = linearLayoutCompat$LayoutParams.topMargin;
                int n26 = n14 + n15;
                int n27 = linearLayoutCompat.getLocationOffset(view) + n26;
                layoutParams = view;
                this.setChildFrame(view, n19, n27, n24, n22);
                n14 = linearLayoutCompat$LayoutParams.bottomMargin;
                n22 += n14;
                n14 = linearLayoutCompat.getNextLocationOffset(view) + n22 + n26;
                n15 = linearLayoutCompat.getChildrenSkipCount(view, n21);
                n21 += n15;
            }
            n15 = 1;
            n21 += n15;
        }
    }

    public void measureChildBeforeLayout(View view, int n3, int n4, int n7, int n8, int n10) {
        this.measureChildWithMargins(view, n4, n7, n8, n10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void measureHorizontal(int var1_1, int var2_2) {
        block77: {
            block76: {
                block64: {
                    block63: {
                        block57: {
                            var3_3 = this;
                            var4_4 = var1_1;
                            var5_5 = var2_2;
                            var6_6 = 0;
                            var7_7 /* !! */  = null;
                            this.mTotalLength = 0;
                            var8_8 = this.getVirtualChildCount();
                            var9_9 = View.MeasureSpec.getMode((int)var1_1);
                            var10_10 = View.MeasureSpec.getMode((int)var2_2);
                            var11_11 /* !! */  = this.mMaxAscent;
                            var12_12 = 4;
                            if (var11_11 /* !! */  == null || (var11_11 /* !! */  = this.mMaxDescent) == null) {
                                var3_3.mMaxAscent = var11_11 /* !! */  = new int[var12_12];
                                var11_11 /* !! */  = new int[var12_12];
                                var3_3.mMaxDescent = var11_11 /* !! */ ;
                            }
                            var13_13 = var3_3.mMaxAscent;
                            var14_14 /* !! */  = var3_3.mMaxDescent;
                            var15_15 = 3;
                            var16_16 = -1;
                            var17_17 = 0.0f / 0.0f;
                            var13_13[var15_15] = var16_16;
                            var18_18 = 2;
                            var13_13[var18_18] = var16_16;
                            var19_19 = 1;
                            var13_13[var19_19] = var16_16;
                            var13_13[0] = var16_16;
                            var14_14 /* !! */ [var15_15] = var16_16;
                            var14_14 /* !! */ [var18_18] = var16_16;
                            var14_14 /* !! */ [var19_19] = var16_16;
                            var14_14 /* !! */ [0] = var16_16;
                            var20_20 = var3_3.mBaselineAligned;
                            var21_21 = var3_3.mUseLargestChild;
                            var22_22 = 0x40000000;
                            var23_23 = 2.0f;
                            var24_24 = var9_9 == var22_22;
                            var25_25 = 0;
                            var26_26 = 0.0f;
                            var11_11 /* !! */  = null;
                            var27_27 = 0;
                            var28_28 /* !! */  = null;
                            var12_12 = 0;
                            var29_29 = null;
                            var30_30 = 0;
                            var31_31 = 0;
                            var32_32 = 0;
                            var33_33 = 0.0f;
                            var34_34 = 0;
                            var35_35 = 0;
                            var36_36 = 1;
                            var37_37 = false;
                            while (true) {
                                block56: {
                                    block61: {
                                        block60: {
                                            block58: {
                                                block59: {
                                                    var38_38 = var14_14 /* !! */ ;
                                                    var16_16 = 8;
                                                    var17_17 = 1.1E-44f;
                                                    if (var27_27 >= var8_8) break;
                                                    var14_14 /* !! */  = (int[])var3_3.getVirtualChildAt(var27_27);
                                                    if (var14_14 /* !! */  == null) {
                                                        var16_16 = var3_3.mTotalLength;
                                                        var3_3.mTotalLength = var39_39 = var3_3.measureNullChild(var27_27) + var16_16;
lbl60:
                                                        // 2 sources

                                                        while (true) {
                                                            var22_22 = var27_27;
                                                            var40_40 = var21_21;
                                                            var41_41 = var20_20;
                                                            var27_27 = 0x40000000;
                                                            break block56;
                                                            break;
                                                        }
                                                    }
                                                    var6_6 = var14_14 /* !! */ .getVisibility();
                                                    if (var6_6 == var16_16) {
                                                        var16_16 = var3_3.getChildrenSkipCount((View)var14_14 /* !! */ , var27_27);
                                                        var27_27 += var16_16;
                                                        ** continue;
                                                    }
                                                    var16_16 = (int)var3_3.hasDividerBeforeChildAt(var27_27);
                                                    if (var16_16 != 0) {
                                                        var16_16 = var3_3.mTotalLength;
                                                        var6_6 = var3_3.mDividerWidth;
                                                        var3_3.mTotalLength = var16_16 += var6_6;
                                                    }
                                                    var7_7 /* !! */  = var42_42 /* !! */  = var14_14 /* !! */ .getLayoutParams();
                                                    var7_7 /* !! */  = (LinearLayoutCompat$LayoutParams)var42_42 /* !! */ ;
                                                    var17_17 = var7_7 /* !! */ .weight;
                                                    var43_43 = var26_26 + var17_17;
                                                    if (var9_9 != var22_22 || (var25_25 = var7_7 /* !! */ .width) != 0 || (var25_25 = (int)((cfr_temp_0 = var17_17 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) <= 0) break block58;
                                                    if (var24_24) {
                                                        var25_25 = var3_3.mTotalLength;
                                                        var16_16 = var7_7 /* !! */ .leftMargin;
                                                        var22_22 = var7_7 /* !! */ .rightMargin;
                                                        var3_3.mTotalLength = var16_16 = var16_16 + var22_22 + var25_25;
                                                    } else {
                                                        var25_25 = var3_3.mTotalLength;
                                                        var22_22 = var7_7 /* !! */ .leftMargin + var25_25;
                                                        var16_16 = var7_7 /* !! */ .rightMargin;
                                                        var3_3.mTotalLength = var25_25 = Math.max(var25_25, var22_22 += var16_16);
                                                    }
                                                    if (var20_20 == 0) break block59;
                                                    var25_25 = 0;
                                                    var26_26 = 0.0f;
                                                    var11_11 /* !! */  = null;
                                                    var22_22 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                                                    var14_14 /* !! */ .measure(var22_22, var22_22);
                                                    var44_44 = var27_27;
                                                    var40_40 = var21_21;
                                                    var41_41 = var20_20;
                                                    var45_45 /* !! */  = var14_14 /* !! */ ;
                                                    var46_46 = -2;
                                                    break block60;
                                                }
                                                var44_44 = var27_27;
                                                var40_40 = var21_21;
                                                var41_41 = var20_20;
                                                var45_45 /* !! */  = var14_14 /* !! */ ;
                                                var27_27 = 0x40000000;
                                                var34_34 = 1;
                                                var46_46 = -2;
                                                break block61;
                                            }
                                            var25_25 = var7_7 /* !! */ .width;
                                            if (var25_25 == 0 && (var25_25 = (int)((cfr_temp_1 = var17_17 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                                                var16_16 = -2;
                                                var17_17 = 0.0f / 0.0f;
                                                var7_7 /* !! */ .width = var16_16;
                                                var22_22 = 0;
                                                var23_23 = 0.0f;
                                                var47_47 = null;
                                            } else {
                                                var16_16 = -2;
                                                var17_17 = 0.0f / 0.0f;
                                                var22_22 = -1 << -1;
                                                var23_23 = -0.0f;
                                            }
                                            var25_25 = (int)((cfr_temp_2 = var43_43 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                            var46_46 = var25_25 == 0 ? (var25_25 = var3_3.mTotalLength) : 0;
                                            var11_11 /* !! */  = (int[])this;
                                            var44_44 = var27_27;
                                            var28_28 /* !! */  = var14_14 /* !! */ ;
                                            var48_48 = var22_22;
                                            var22_22 = var27_27;
                                            var40_40 = var21_21;
                                            var21_21 = var1_1;
                                            var41_41 = var20_20;
                                            var20_20 = var46_46;
                                            var46_46 = -2;
                                            var16_16 = var2_2;
                                            var49_49 /* !! */  = var14_14 /* !! */ ;
                                            var5_5 = -1 << -1;
                                            var39_39 = 0;
                                            var14_14 /* !! */  = null;
                                            this.measureChildBeforeLayout((View)var28_28 /* !! */ , var27_27, var1_1, var20_20, var2_2, 0);
                                            var25_25 = var48_48;
                                            var26_26 = var23_23;
                                            if (var48_48 != var5_5) {
                                                var7_7 /* !! */ .width = var48_48;
                                            }
                                            var25_25 = var49_49 /* !! */ .getMeasuredWidth();
                                            if (var24_24) {
                                                var27_27 = var3_3.mTotalLength;
                                                var22_22 = var7_7 /* !! */ .leftMargin + var25_25;
                                                var21_21 = var7_7 /* !! */ .rightMargin;
                                                var45_45 /* !! */  = var49_49 /* !! */ ;
                                                var3_3.mTotalLength = var20_20 = var3_3.getNextLocationOffset((View)var49_49 /* !! */ ) + (var22_22 += var21_21) + var27_27;
                                            } else {
                                                var45_45 /* !! */  = var49_49 /* !! */ ;
                                                var27_27 = var3_3.mTotalLength;
                                                var22_22 = var27_27 + var25_25;
                                                var20_20 = var7_7 /* !! */ .leftMargin;
                                                var22_22 += var20_20;
                                                var20_20 = var7_7 /* !! */ .rightMargin;
                                                var22_22 += var20_20;
                                                var20_20 = var3_3.getNextLocationOffset((View)var49_49 /* !! */ ) + var22_22;
                                                var3_3.mTotalLength = var27_27 = Math.max(var27_27, var20_20);
                                            }
                                            if (var40_40 != 0) {
                                                var12_12 = Math.max(var25_25, var12_12);
                                            }
                                        }
                                        var27_27 = 0x40000000;
                                    }
                                    if (var10_10 == var27_27) ** GOTO lbl-1000
                                    var25_25 = var7_7 /* !! */ .height;
                                    var22_22 = -1;
                                    var23_23 = 0.0f / 0.0f;
                                    if (var25_25 == var22_22) {
                                        var25_25 = 1;
                                        var26_26 = 1.4E-45f;
                                        var37_37 = true;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var25_25 = 0;
                                        var26_26 = 0.0f;
                                        var11_11 /* !! */  = null;
                                    }
                                    var22_22 = var7_7 /* !! */ .topMargin;
                                    var20_20 = var7_7 /* !! */ .bottomMargin;
                                    var22_22 += var20_20;
                                    var20_20 = var45_45 /* !! */ .getMeasuredHeight() + var22_22;
                                    var16_16 = var45_45 /* !! */ .getMeasuredState();
                                    var39_39 = var35_35;
                                    var35_35 = View.combineMeasuredStates((int)var35_35, (int)var16_16);
                                    if (var41_41 != 0 && (var16_16 = var45_45 /* !! */ .getBaseline()) != (var39_39 = -1)) {
                                        var39_39 = var7_7 /* !! */ .gravity;
                                        if (var39_39 < 0) {
                                            var39_39 = var3_3.mGravity;
                                        }
                                        var39_39 = ((var39_39 & 112) >> 4 & -2) >> 1;
                                        var13_13[var39_39] = var5_5 = Math.max(var13_13[var39_39], var16_16);
                                        var5_5 = var38_38[var39_39];
                                        var16_16 = var20_20 - var16_16;
                                        var38_38[var39_39] = var16_16 = Math.max(var5_5, var16_16);
                                    }
                                    var16_16 = var30_30;
                                    var30_30 = Math.max(var30_30, var20_20);
                                    var36_36 = var36_36 != 0 && (var16_16 = var7_7 /* !! */ .height) == (var39_39 = -1) ? 1 : 0;
                                    var17_17 = var7_7 /* !! */ .weight;
                                    cfr_temp_3 = var17_17 - 0.0f;
                                    var16_16 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                                    if (var16_16 > 0) {
                                        if (var25_25 != 0) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var22_22 = var20_20;
                                        ** continue;
                                        var6_6 = var32_32;
                                        var32_32 = Math.max(var32_32, var22_22);
lbl212:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var6_6 = var32_32;
                                    if (var25_25 != 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var22_22 = var20_20;
                                    ** continue;
                                    var20_20 = var31_31;
                                    var31_31 = Math.max(var31_31, var22_22);
                                    var32_32 = var6_6;
                                    ** continue;
                                    var6_6 = var44_44;
                                    var22_22 = var25_25 = var3_3.getChildrenSkipCount((View)var45_45 /* !! */ , var44_44) + var44_44;
                                    var26_26 = var43_43;
                                }
                                var5_5 = var2_2;
                                var27_27 = ++var22_22;
                                var14_14 /* !! */  = var38_38;
                                var21_21 = var40_40;
                                var20_20 = var41_41;
                                var22_22 = 0x40000000;
                                var23_23 = 2.0f;
                                var16_16 = -1;
                                var17_17 = 0.0f / 0.0f;
                                var6_6 = 0;
                                var7_7 /* !! */  = null;
                            }
                            var40_40 = var21_21;
                            var41_41 = var20_20;
                            var22_22 = var30_30;
                            var20_20 = var31_31;
                            var6_6 = var32_32;
                            var39_39 = var35_35;
                            var27_27 = 0x40000000;
                            var5_5 = -1 << -1;
                            var46_46 = -2;
                            var21_21 = var3_3.mTotalLength;
                            if (var21_21 > 0 && (var21_21 = (int)var3_3.hasDividerBeforeChildAt(var8_8)) != 0) {
                                var21_21 = var3_3.mTotalLength;
                                var27_27 = var3_3.mDividerWidth;
                                var3_3.mTotalLength = var21_21 += var27_27;
                            }
                            var27_27 = var13_13[var19_19];
                            var21_21 = -1;
                            var50_50 = 0.0f / 0.0f;
                            if (var27_27 != var21_21) ** GOTO lbl-1000
                            var30_30 = 0;
                            var16_16 = var13_13[0];
                            if (var16_16 == var21_21 && (var16_16 = var13_13[var18_18]) == var21_21 && (var16_16 = var13_13[var15_15]) == var21_21) {
                                var27_27 = var22_22;
                                var30_30 = var39_39;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var21_21 = var13_13[var15_15];
                                var5_5 = var13_13[0];
                                var16_16 = var13_13[var18_18];
                                var27_27 = Math.max(var27_27, var16_16);
                                var27_27 = Math.max(var5_5, var27_27);
                                var27_27 = Math.max(var21_21, var27_27);
                                var21_21 = var38_38[var15_15];
                                var17_17 = 0.0f;
                                var42_42 /* !! */  = null;
                                var5_5 = var38_38[0];
                                var16_16 = var38_38[var19_19];
                                var30_30 = var39_39;
                                var39_39 = var38_38[var18_18];
                                var16_16 = Math.max(var16_16, var39_39);
                                var16_16 = Math.max(var5_5, var16_16);
                                var21_21 = Math.max(var21_21, var16_16) + var27_27;
                                var27_27 = Math.max(var22_22, var21_21);
                            }
                            if (var40_40 == 0) ** GOTO lbl-1000
                            var22_22 = -1 << -1;
                            var23_23 = -0.0f;
                            if (var9_9 == var22_22 || var9_9 == 0) {
                                var22_22 = 0;
                                var23_23 = 0.0f;
                                var47_47 = null;
                            } else lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    break block57;
                                    break;
                                }
                            }
                            var3_3.mTotalLength = 0;
                            var22_22 = 0;
                            var23_23 = 0.0f;
                            var47_47 = null;
                            while (true) {
                                block62: {
                                    if (var22_22 >= var8_8) ** continue;
                                    var45_45 /* !! */  = (int[])var3_3.getVirtualChildAt(var22_22);
                                    if (var45_45 /* !! */  != null) break block62;
                                    var21_21 = var3_3.mTotalLength;
                                    var3_3.mTotalLength = var16_16 = var3_3.measureNullChild(var22_22) + var21_21;
                                    ** GOTO lbl307
                                }
                                var16_16 = var45_45 /* !! */ .getVisibility();
                                if (var16_16 == (var39_39 = 8)) {
                                    var21_21 = var3_3.getChildrenSkipCount((View)var45_45 /* !! */ , var22_22);
                                    var22_22 += var21_21;
lbl307:
                                    // 3 sources

                                    while (true) {
                                        var32_32 = var27_27;
                                        break;
                                    }
                                } else {
                                    var42_42 /* !! */  = (LinearLayoutCompat$LayoutParams)var45_45 /* !! */ .getLayoutParams();
                                    if (var24_24) {
                                        var39_39 = var3_3.mTotalLength;
                                        var5_5 = var42_42 /* !! */ .leftMargin + var12_12;
                                        var16_16 = var42_42 /* !! */ .rightMargin;
                                        var3_3.mTotalLength = var21_21 = var3_3.getNextLocationOffset((View)var45_45 /* !! */ ) + (var5_5 += var16_16) + var39_39;
                                        ** continue;
                                    }
                                    var39_39 = var3_3.mTotalLength;
                                    var5_5 = var39_39 + var12_12;
                                    var32_32 = var27_27;
                                    var27_27 = var42_42 /* !! */ .leftMargin;
                                    var5_5 += var27_27;
                                    var27_27 = var42_42 /* !! */ .rightMargin;
                                    var5_5 += var27_27;
                                    var27_27 = var3_3.getNextLocationOffset((View)var45_45 /* !! */ ) + var5_5;
                                    var3_3.mTotalLength = var27_27 = Math.max(var39_39, var27_27);
                                }
                                ++var22_22;
                                var27_27 = var32_32;
                            }
                        }
                        var32_32 = var27_27;
                        var27_27 = var3_3.mTotalLength;
                        var22_22 = this.getPaddingLeft();
                        var3_3.mTotalLength = var21_21 = this.getPaddingRight() + var22_22 + var27_27;
                        var27_27 = this.getSuggestedMinimumWidth();
                        var27_27 = Math.max(var21_21, var27_27);
                        var47_47 = null;
                        var27_27 = View.resolveSizeAndState((int)var27_27, (int)var4_4, (int)0);
                        var23_23 = 2.3509886E-38f;
                        var22_22 = 0xFFFFFF & var27_27;
                        var21_21 = var3_3.mTotalLength;
                        if (var34_34 != 0 || (var22_22 -= var21_21) != 0 && (var16_16 = (int)((cfr_temp_4 = var26_26 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) > 0) break block63;
                        var25_25 = Math.max(var20_20, var6_6);
                        if (var40_40 != 0) {
                            var22_22 = 0x40000000;
                            var23_23 = 2.0f;
                            if (var9_9 != var22_22) {
                                var7_7 /* !! */  = null;
                                for (var6_6 = 0; var6_6 < var8_8; ++var6_6) {
                                    var47_47 = var3_3.getVirtualChildAt(var6_6);
                                    if (var47_47 == null) continue;
                                    var20_20 = var47_47.getVisibility();
                                    var16_16 = 8;
                                    var17_17 = 1.1E-44f;
                                    if (var20_20 == var16_16) continue;
                                    var51_51 = (LinearLayoutCompat$LayoutParams)var47_47.getLayoutParams();
                                    var52_52 = var51_51.weight;
                                    cfr_temp_5 = var52_52 - 0.0f;
                                    var20_20 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                                    if (var20_20 <= 0) continue;
                                    var20_20 = 0x40000000;
                                    var52_52 = 2.0f;
                                    var16_16 = View.MeasureSpec.makeMeasureSpec((int)var12_12, (int)var20_20);
                                    var39_39 = View.MeasureSpec.makeMeasureSpec((int)var47_47.getMeasuredHeight(), (int)var20_20);
                                    var47_47.measure(var16_16, var39_39);
                                }
                            }
                        }
                        var22_22 = var2_2;
                        var35_35 = var8_8;
                        var5_5 = var30_30;
                        break block64;
                    }
                    var17_17 = var3_3.mWeightSum;
                    cfr_temp_6 = var17_17 - 0.0f;
                    var39_39 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                    if (var39_39 > 0) {
                        var26_26 = var17_17;
                    }
                    var16_16 = -1;
                    var17_17 = 0.0f / 0.0f;
                    var13_13[var15_15] = var16_16;
                    var13_13[var18_18] = var16_16;
                    var13_13[var19_19] = var16_16;
                    var14_14 /* !! */  = null;
                    var13_13[0] = var16_16;
                    var38_38[var15_15] = var16_16;
                    var38_38[var18_18] = var16_16;
                    var38_38[var19_19] = var16_16;
                    var38_38[0] = var16_16;
                    var3_3.mTotalLength = 0;
                    var39_39 = var20_20;
                    var5_5 = var30_30;
                    var20_20 = -1;
                    var52_53 = 0.0f / 0.0f;
                    var7_7 /* !! */  = null;
                    for (var6_6 = 0; var6_6 < var8_8; ++var6_6) {
                        block67: {
                            block75: {
                                block74: {
                                    block73: {
                                        block72: {
                                            block68: {
                                                block71: {
                                                    block70: {
                                                        block69: {
                                                            block66: {
                                                                block65: {
                                                                    var29_29 = var3_3.getVirtualChildAt(var6_6);
                                                                    if (var29_29 == null) break block65;
                                                                    var16_16 = var29_29.getVisibility();
                                                                    var21_21 = 8;
                                                                    var50_50 = 1.1E-44f;
                                                                    if (var16_16 != var21_21) break block66;
                                                                }
                                                                var21_21 = var22_22;
                                                                var35_35 = var8_8;
                                                                var22_22 = var2_2;
                                                                break block67;
                                                            }
                                                            var42_42 /* !! */  = (LinearLayoutCompat$LayoutParams)var29_29.getLayoutParams();
                                                            var50_50 = var42_42 /* !! */ .weight;
                                                            cfr_temp_7 = var50_50 - 0.0f;
                                                            var32_32 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
                                                            if (var32_32 <= 0) break block68;
                                                            var53_54 = (float)var22_22 * var50_50 / var26_26;
                                                            var4_4 = (int)var53_54;
                                                            var26_26 -= var50_50;
                                                            var22_22 -= var4_4;
                                                            var21_21 = this.getPaddingTop();
                                                            var32_32 = this.getPaddingBottom() + var21_21;
                                                            var21_21 = var42_42 /* !! */ .topMargin;
                                                            var32_32 += var21_21;
                                                            var21_21 = var42_42 /* !! */ .bottomMargin;
                                                            var21_21 = var32_32 + var21_21;
                                                            var33_33 = var26_26;
                                                            var25_25 = var42_42 /* !! */ .height;
                                                            var34_34 = var22_22;
                                                            var35_35 = var8_8;
                                                            var8_8 = -1;
                                                            var22_22 = var2_2;
                                                            var25_25 = ViewGroup.getChildMeasureSpec((int)var2_2, (int)var21_21, (int)var25_25);
                                                            var21_21 = var42_42 /* !! */ .width;
                                                            if (var21_21 != 0) break block69;
                                                            var21_21 = 0x40000000;
                                                            var50_50 = 2.0f;
                                                            if (var9_9 != var21_21) break block70;
                                                            if (var4_4 <= 0) {
                                                                var4_4 = 0;
                                                                var53_54 = 0.0f;
                                                            }
                                                            var4_4 = View.MeasureSpec.makeMeasureSpec((int)var4_4, (int)var21_21);
                                                            var29_29.measure(var4_4, var25_25);
                                                            break block71;
                                                        }
                                                        var21_21 = 0x40000000;
                                                        var50_50 = 2.0f;
                                                    }
                                                    if ((var4_4 = (var54_55 = var29_29.getMeasuredWidth()) + var4_4) < 0) {
                                                        var4_4 = 0;
                                                        var53_54 = 0.0f;
                                                    }
                                                    var4_4 = View.MeasureSpec.makeMeasureSpec((int)var4_4, (int)var21_21);
                                                    var29_29.measure(var4_4, var25_25);
                                                }
                                                var25_25 = var29_29.getMeasuredState();
                                                var50_50 = -1.7014118E38f;
                                                var5_5 = View.combineMeasuredStates((int)var5_5, (int)(var25_25 &= -16777216));
                                                var26_26 = var33_33;
                                                var21_21 = var34_34;
                                                break block72;
                                            }
                                            var21_21 = var22_22;
                                            var35_35 = var8_8;
                                            var8_8 = -1;
                                            var22_22 = var2_2;
                                        }
                                        if (var24_24) {
                                            var4_4 = var3_3.mTotalLength;
                                            var32_32 = var29_29.getMeasuredWidth();
                                            var8_8 = var42_42 /* !! */ .leftMargin;
                                            var32_32 += var8_8;
                                            var8_8 = var42_42 /* !! */ .rightMargin;
                                            var32_32 += var8_8;
                                            var3_3.mTotalLength = var8_8 = var3_3.getNextLocationOffset(var29_29) + var32_32 + var4_4;
                                            var33_33 = var26_26;
lbl470:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var4_4 = var3_3.mTotalLength;
                                        var8_8 = var29_29.getMeasuredWidth() + var4_4;
                                        var33_33 = var26_26;
                                        var25_25 = var42_42 /* !! */ .leftMargin;
                                        var8_8 += var25_25;
                                        var25_25 = var42_42 /* !! */ .rightMargin;
                                        var8_8 += var25_25;
                                        var25_25 = var3_3.getNextLocationOffset(var29_29) + var8_8;
                                        var3_3.mTotalLength = var25_25 = Math.max(var4_4, var25_25);
                                        ** continue;
                                        var25_25 = 0x40000000;
                                        var26_26 = 2.0f;
                                        if (var10_10 == var25_25) ** GOTO lbl-1000
                                        var25_25 = var42_42 /* !! */ .height;
                                        var4_4 = -1;
                                        var53_54 = 0.0f / 0.0f;
                                        if (var25_25 == var4_4) {
                                            var25_25 = 1;
                                            var26_26 = 1.4E-45f;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var25_25 = 0;
                                            var26_26 = 0.0f;
                                            var11_11 /* !! */  = null;
                                        }
                                        var4_4 = var42_42 /* !! */ .topMargin;
                                        var8_8 = var42_42 /* !! */ .bottomMargin;
                                        var4_4 += var8_8;
                                        var8_8 = var29_29.getMeasuredHeight() + var4_4;
                                        var20_20 = Math.max(var20_20, var8_8);
                                        if (var25_25 == 0) {
                                            var4_4 = var8_8;
                                        }
                                        var25_25 = Math.max(var39_39, var4_4);
                                        if (var36_36 == 0) break block73;
                                        var39_39 = var42_42 /* !! */ .height;
                                        var4_4 = -1;
                                        var53_54 = 0.0f / 0.0f;
                                        if (var39_39 != var4_4) break block74;
                                        var39_39 = 1;
                                        break block75;
                                    }
                                    var4_4 = -1;
                                    var53_54 = 0.0f / 0.0f;
                                }
                                var39_39 = 0;
                                var14_14 /* !! */  = null;
                            }
                            if (var41_41 != 0 && (var12_12 = var29_29.getBaseline()) != var4_4) {
                                var16_16 = var42_42 /* !! */ .gravity;
                                if (var16_16 < 0) {
                                    var16_16 = var3_3.mGravity;
                                }
                                var16_16 &= 112;
                                var53_54 = 5.6E-45f;
                                var16_16 = (var16_16 >> 4 & -2) >> 1;
                                var13_13[var16_16] = var4_4 = Math.max(var13_13[var16_16], var12_12);
                                var4_4 = var38_38[var16_16];
                                var38_38[var16_16] = var4_4 = Math.max(var4_4, var8_8 -= var12_12);
                            }
                            var36_36 = var39_39;
                            var39_39 = var25_25;
                            var26_26 = var33_33;
                        }
                        var4_4 = var1_1;
                        var22_22 = var21_21;
                        var8_8 = var35_35;
                        var16_16 = -1;
                        var17_17 = 0.0f / 0.0f;
                    }
                    var22_22 = var2_2;
                    var35_35 = var8_8;
                    var25_25 = var3_3.mTotalLength;
                    var21_21 = this.getPaddingLeft();
                    var3_3.mTotalLength = var16_16 = this.getPaddingRight() + var21_21 + var25_25;
                    var25_25 = var13_13[var19_19];
                    var21_21 = -1;
                    var50_50 = 0.0f / 0.0f;
                    if (var25_25 != var21_21) ** GOTO lbl-1000
                    var16_16 = 0;
                    var17_17 = 0.0f;
                    var42_42 /* !! */  = null;
                    var4_4 = var13_13[0];
                    if (var4_4 == var21_21 && (var16_16 = var13_13[var18_18]) == var21_21 && (var16_16 = var13_13[var15_15]) == var21_21) {
                        var25_25 = var20_20;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var21_21 = var13_13[var15_15];
                        var17_17 = 0.0f;
                        var42_42 /* !! */  = null;
                        var4_4 = var13_13[0];
                        var6_6 = var13_13[var18_18];
                        var25_25 = Math.max(var25_25, var6_6);
                        var25_25 = Math.max(var4_4, var25_25);
                        var25_25 = Math.max(var21_21, var25_25);
                        var21_21 = var38_38[var15_15];
                        var16_16 = var38_38[0];
                        var4_4 = var38_38[var19_19];
                        var6_6 = var38_38[var18_18];
                        var4_4 = Math.max(var4_4, var6_6);
                        var16_16 = Math.max(var16_16, var4_4);
                        var21_21 = Math.max(var21_21, var16_16) + var25_25;
                        var25_25 = Math.max(var20_20, var21_21);
                    }
                    var32_32 = var25_25;
                    var25_25 = var39_39;
                }
                if (var36_36 != 0) break block76;
                var21_21 = 0x40000000;
                var50_50 = 2.0f;
                if (var10_10 != var21_21) break block77;
            }
            var25_25 = var32_32;
        }
        var21_21 = this.getPaddingTop();
        var20_20 = this.getPaddingBottom() + var21_21 + var25_25;
        var25_25 = this.getSuggestedMinimumHeight();
        var25_25 = Math.max(var20_20, var25_25);
        var50_50 = -1.7014118E38f;
        var21_21 = -16777216 & var5_5;
        var27_27 |= var21_21;
        var21_21 = var5_5 << 16;
        var25_25 = View.resolveSizeAndState((int)var25_25, (int)var22_22, (int)var21_21);
        var3_3.setMeasuredDimension(var27_27, var25_25);
        if (var37_37) {
            var25_25 = var1_1;
            var27_27 = var35_35;
            var3_3.forceUniformHeight(var35_35, var1_1);
        }
    }

    public int measureNullChild(int n3) {
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void measureVertical(int var1_1, int var2_2) {
        block42: {
            block41: {
                var3_3 = this;
                var4_4 = var1_1;
                var5_5 = var2_2;
                var6_6 = 0;
                var7_7 = 0.0f;
                var8_8 /* !! */  = null;
                this.mTotalLength = 0;
                var9_9 = this.getVirtualChildCount();
                var10_10 = View.MeasureSpec.getMode((int)var1_1);
                var11_11 = View.MeasureSpec.getMode((int)var2_2);
                var12_12 = this.mBaselineAlignedChildIndex;
                var13_13 = this.mUseLargestChild;
                var14_14 = 0;
                var15_15 = 0.0f;
                var16_16 /* !! */  = null;
                var17_17 = 0;
                var18_18 = 0.0f;
                var19_19 = null;
                var20_20 = 0;
                var21_21 = 0.0f;
                var22_22 = 0;
                var23_23 = null;
                var24_24 = 0;
                var25_25 = null;
                var26_26 = 0;
                var27_27 = 0;
                var28_28 = null;
                var29_29 /* !! */  = 0;
                var30_30 = 0.0f;
                var31_31 = 1;
                var32_32 = false;
                while (true) {
                    block39: {
                        block40: {
                            block38: {
                                var6_6 = 8;
                                var7_7 = 1.1E-44f;
                                var33_33 = var24_24;
                                if (var27_27 >= var9_9) break;
                                var25_25 = var3_3.getVirtualChildAt(var27_27);
                                if (var25_25 != null) break block38;
                                var24_24 = var3_3.mTotalLength;
                                var3_3.mTotalLength = var6_6 = var3_3.measureNullChild(var27_27) + var24_24;
                                var34_34 = var11_11;
                                var24_24 = var33_33;
                                var33_33 = var9_9;
                                break block39;
                            }
                            var34_34 = var17_17;
                            var17_17 = var25_25.getVisibility();
                            if (var17_17 != var6_6) break block40;
                            var17_17 = var3_3.getChildrenSkipCount(var25_25, var27_27);
                            var27_27 += var17_17;
                            var17_17 = var34_34;
                            var33_33 = var9_9;
                            var34_34 = var11_11;
                            break block39;
                        }
                        var17_17 = (int)var3_3.hasDividerBeforeChildAt(var27_27);
                        if (var17_17 != 0) {
                            var17_17 = var3_3.mTotalLength;
                            var6_6 = var3_3.mDividerHeight;
                            var3_3.mTotalLength = var17_17 += var6_6;
                        }
                        var8_8 /* !! */  = var19_19 = var25_25.getLayoutParams();
                        var8_8 /* !! */  = (LinearLayoutCompat$LayoutParams)var19_19;
                        var18_18 = var8_8 /* !! */ .weight;
                        var35_35 = var15_15 + var18_18;
                        var14_14 = 0x40000000;
                        var15_15 = 2.0f;
                        if (var11_11 == var14_14 && (var14_14 = var8_8 /* !! */ .height) == 0 && (var14_14 = (int)((cfr_temp_0 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) > 0) {
                            var14_14 = var3_3.mTotalLength;
                            var17_17 = var8_8 /* !! */ .topMargin + var14_14;
                            var36_36 = var20_20;
                            var20_20 = var8_8 /* !! */ .bottomMargin;
                            var3_3.mTotalLength = var14_14 = Math.max(var14_14, var17_17 += var20_20);
                            var14_14 = var22_22;
                            var23_23 = var25_25;
                            var37_37 = var26_26;
                            var4_4 = var34_34;
                            var38_38 = var36_36;
                            var29_29 /* !! */  = 1;
                            var30_30 = 1.4E-45f;
                            var34_34 = var11_11;
                            var11_11 = var33_33;
                            var33_33 = var9_9;
                            var9_9 = var27_27;
                        } else {
                            var36_36 = var20_20;
                            var14_14 = var8_8 /* !! */ .height;
                            if (var14_14 == 0 && (var14_14 = (int)((cfr_temp_1 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > 0) {
                                var14_14 = -2;
                                var15_15 = 0.0f / 0.0f;
                                var8_8 /* !! */ .height = var14_14;
                                var20_20 = 0;
                                var21_21 = 0.0f;
                            } else {
                                var20_20 = -1 << -1;
                                var21_21 = -0.0f;
                            }
                            var14_14 = (int)((cfr_temp_2 = var35_35 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                            var39_39 = var14_14 == 0 ? (var14_14 = var3_3.mTotalLength) : 0;
                            var40_40 = 0x40000000;
                            var16_16 /* !! */  = this;
                            var4_4 = var34_34;
                            var19_19 = var25_25;
                            var41_41 = var20_20;
                            var38_38 = var36_36;
                            var20_20 = var27_27;
                            var5_5 = var22_22;
                            var22_22 = var1_1;
                            var42_42 = var25_25;
                            var34_34 = var11_11;
                            var11_11 = var33_33;
                            var33_33 = var9_9;
                            var24_24 = 0;
                            var25_25 = null;
                            var37_37 = var26_26;
                            var26_26 = var2_2;
                            var9_9 = var27_27;
                            var27_27 = var39_39;
                            this.measureChildBeforeLayout((View)var19_19, var20_20, var1_1, 0, var2_2, var39_39);
                            var17_17 = var41_41;
                            var18_18 = var21_21;
                            var14_14 = -1 << -1;
                            var15_15 = -0.0f;
                            if (var41_41 != var14_14) {
                                var8_8 /* !! */ .height = var41_41;
                            }
                            var14_14 = var42_42.getMeasuredHeight();
                            var17_17 = var3_3.mTotalLength;
                            var20_20 = var17_17 + var14_14;
                            var22_22 = var8_8 /* !! */ .topMargin;
                            var20_20 += var22_22;
                            var22_22 = var8_8 /* !! */ .bottomMargin;
                            var23_23 = var42_42;
                            var24_24 = var3_3.getNextLocationOffset(var42_42) + (var20_20 += var22_22);
                            var3_3.mTotalLength = var17_17 = Math.max(var17_17, var24_24);
                            var14_14 = var13_13 != 0 ? Math.max(var14_14, var5_5) : var5_5;
                        }
                        if (var12_12 >= 0 && var12_12 == (var27_27 = var9_9 + 1)) {
                            var3_3.mBaselineChildTop = var17_17 = var3_3.mTotalLength;
                        }
                        if (var9_9 < var12_12 && (var17_17 = (int)((cfr_temp_3 = (var18_18 = var8_8 /* !! */ .weight) - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) > 0) {
                            var16_16 /* !! */  = new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                            throw var16_16 /* !! */ ;
                        }
                        var17_17 = 0x40000000;
                        var18_18 = 2.0f;
                        if (var10_10 == var17_17) ** GOTO lbl-1000
                        var17_17 = var8_8 /* !! */ .width;
                        var20_20 = -1;
                        var21_21 = 0.0f / 0.0f;
                        if (var17_17 == var20_20) {
                            var17_17 = 1;
                            var18_18 = 1.4E-45f;
                            var32_32 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var17_17 = 0;
                            var18_18 = 0.0f;
                            var19_19 = null;
                        }
                        var20_20 = var8_8 /* !! */ .leftMargin;
                        var24_24 = var8_8 /* !! */ .rightMargin;
                        var20_20 += var24_24;
                        var24_24 = var23_23.getMeasuredWidth() + var20_20;
                        var26_26 = var38_38;
                        var26_26 = Math.max(var38_38, var24_24);
                        var27_27 = var23_23.getMeasuredState();
                        var27_27 = View.combineMeasuredStates((int)var4_4, (int)var27_27);
                        if (var31_31 == 0) ** GOTO lbl-1000
                        var4_4 = var8_8 /* !! */ .width;
                        var5_5 = -1;
                        var43_43 = 0.0f / 0.0f;
                        if (var4_4 == var5_5) {
                            var31_31 = 1;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var31_31 = 0;
                        }
                        var44_44 = var8_8 /* !! */ .weight;
                        cfr_temp_4 = var44_44 - 0.0f;
                        var4_4 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                        if (var4_4 > 0) {
                            if (var17_17 == 0) {
                                var20_20 = var24_24;
                            }
                            var24_24 = Math.max(var11_11, var20_20);
                        } else {
                            if (var17_17 != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var20_20 = var24_24;
                            ** continue;
                            var17_17 = var37_37;
                            var37_37 = var17_17 = Math.max(var37_37, var20_20);
                            var24_24 = var11_11;
                        }
                        var17_17 = var3_3.getChildrenSkipCount(var23_23, var9_9) + var9_9;
                        var22_22 = var14_14;
                        var20_20 = var26_26;
                        var15_15 = var35_35;
                        var26_26 = var37_37;
                        var45_45 = var27_27;
                        var27_27 = var17_17;
                        var17_17 = var45_45;
                    }
                    ++var27_27;
                    var4_4 = var1_1;
                    var5_5 = var2_2;
                    var9_9 = var33_33;
                    var11_11 = var34_34;
                }
                var4_4 = var17_17;
                var5_5 = var22_22;
                var17_17 = var26_26;
                var34_34 = var11_11;
                var11_11 = var24_24;
                var26_26 = var20_20;
                var33_33 = var9_9;
                var20_20 = var3_3.mTotalLength;
                if (var20_20 > 0) {
                    var20_20 = var9_9;
                    var22_22 = (int)var3_3.hasDividerBeforeChildAt(var9_9);
                    if (var22_22 != 0) {
                        var22_22 = var3_3.mTotalLength;
                        var24_24 = var3_3.mDividerHeight;
                        var3_3.mTotalLength = var22_22 += var24_24;
                    }
                } else {
                    var20_20 = var9_9;
                }
                var22_22 = var34_34;
                if (var13_13 != 0 && (var34_34 == (var24_24 = -1 << -1) || var34_34 == 0)) {
                    var3_3.mTotalLength = 0;
                    var25_25 = null;
                    for (var24_24 = 0; var24_24 < var20_20; ++var24_24) {
                        var28_28 = var3_3.getVirtualChildAt(var24_24);
                        if (var28_28 == null) {
                            var27_27 = var3_3.mTotalLength;
                            var3_3.mTotalLength = var9_9 = var3_3.measureNullChild(var24_24) + var27_27;
                        } else {
                            var9_9 = var28_28.getVisibility();
                            if (var9_9 == var6_6) {
                                var27_27 = var3_3.getChildrenSkipCount(var28_28, var24_24);
                                var24_24 += var27_27;
                            } else {
                                var46_46 = (LinearLayoutCompat$LayoutParams)var28_28.getLayoutParams();
                                var12_12 = var3_3.mTotalLength;
                                var47_47 = var12_12 + var5_5;
                                var6_6 = var46_46.topMargin;
                                var47_47 += var6_6;
                                var6_6 = var46_46.bottomMargin;
                                var27_27 = var3_3.getNextLocationOffset(var28_28) + (var47_47 += var6_6);
                                var3_3.mTotalLength = var27_27 = Math.max(var12_12, var27_27);
                            }
                        }
                        var6_6 = 8;
                        var7_7 = 1.1E-44f;
                    }
                }
                var24_24 = var3_3.mTotalLength;
                var27_27 = this.getPaddingTop();
                var3_3.mTotalLength = var6_6 = this.getPaddingBottom() + var27_27 + var24_24;
                var24_24 = this.getSuggestedMinimumHeight();
                var24_24 = Math.max(var6_6, var24_24);
                var27_27 = var2_2;
                var6_6 = var5_5;
                var48_48 = null;
                var24_24 = View.resolveSizeAndState((int)var24_24, (int)var2_2, (int)0);
                var43_43 = 2.3509886E-38f;
                var5_5 = 0xFFFFFF & var24_24;
                var9_9 = var3_3.mTotalLength;
                var5_5 -= var9_9;
                if (var29_29 /* !! */  != 0 || var5_5 != 0 && (var9_9 = (int)((cfr_temp_5 = var15_15 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) > 0) break block41;
                var14_14 = Math.max(var17_17, var11_11);
                if (var13_13 != 0) {
                    var17_17 = 0x40000000;
                    var18_18 = 2.0f;
                    if (var22_22 != var17_17) {
                        var18_18 = 0.0f;
                        var19_19 = null;
                        for (var17_17 = 0; var17_17 < var20_20; ++var17_17) {
                            var23_23 = var3_3.getVirtualChildAt(var17_17);
                            if (var23_23 == null || (var5_5 = var23_23.getVisibility()) == (var9_9 = 8)) continue;
                            var48_48 = (LinearLayoutCompat$LayoutParams)var23_23.getLayoutParams();
                            var43_43 = var48_48.weight;
                            cfr_temp_6 = var43_43 - 0.0f;
                            var5_5 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                            if (var5_5 <= 0) continue;
                            var5_5 = var23_23.getMeasuredWidth();
                            var9_9 = 0x40000000;
                            var5_5 = View.MeasureSpec.makeMeasureSpec((int)var5_5, (int)var9_9);
                            var11_11 = View.MeasureSpec.makeMeasureSpec((int)var6_6, (int)var9_9);
                            var23_23.measure(var5_5, var11_11);
                        }
                    }
                }
                var9_9 = var1_1;
                var17_17 = var4_4;
                break block42;
            }
            var7_7 = var3_3.mWeightSum;
            cfr_temp_7 = var7_7 - 0.0f;
            var9_9 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
            if (var9_9 > 0) {
                var15_15 = var7_7;
            }
            var6_6 = 0;
            var7_7 = 0.0f;
            var8_8 /* !! */  = null;
            var3_3.mTotalLength = 0;
            var9_9 = var5_5;
            var5_5 = var17_17;
            var17_17 = var4_4;
            var44_44 = 0.0f;
            for (var4_4 = 0; var4_4 < var20_20; ++var4_4) {
                block44: {
                    block52: {
                        block51: {
                            block50: {
                                block49: {
                                    block45: {
                                        block48: {
                                            block47: {
                                                block46: {
                                                    block43: {
                                                        var49_49 = var3_3.getVirtualChildAt(var4_4);
                                                        var12_12 = var49_49.getVisibility();
                                                        var13_13 = 8;
                                                        var50_50 = 1.1E-44f;
                                                        if (var12_12 != var13_13) break block43;
                                                        var47_47 = var9_9;
                                                        var9_9 = var1_1;
                                                        break block44;
                                                    }
                                                    var51_51 = (LinearLayoutCompat$LayoutParams)var49_49.getLayoutParams();
                                                    var7_7 = var51_51.weight;
                                                    cfr_temp_8 = var7_7 - 0.0f;
                                                    var29_29 /* !! */  = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1));
                                                    if (var29_29 /* !! */  <= 0) break block45;
                                                    var50_50 = (float)var9_9 * var7_7 / var15_15;
                                                    var13_13 = (int)var50_50;
                                                    var15_15 -= var7_7;
                                                    var9_9 -= var13_13;
                                                    var6_6 = this.getPaddingLeft();
                                                    var29_29 /* !! */  = this.getPaddingRight() + var6_6;
                                                    var6_6 = var51_51.leftMargin;
                                                    var29_29 /* !! */  += var6_6;
                                                    var6_6 = var51_51.rightMargin;
                                                    var6_6 = var29_29 /* !! */  + var6_6;
                                                    var30_30 = var15_15;
                                                    var14_14 = var51_51.width;
                                                    var47_47 = var9_9;
                                                    var9_9 = var1_1;
                                                    var14_14 = ViewGroup.getChildMeasureSpec((int)var1_1, (int)var6_6, (int)var14_14);
                                                    var6_6 = var51_51.height;
                                                    if (var6_6 != 0) break block46;
                                                    var6_6 = 0x40000000;
                                                    var7_7 = 2.0f;
                                                    if (var22_22 != var6_6) break block47;
                                                    if (var13_13 <= 0) {
                                                        var13_13 = 0;
                                                        var50_50 = 0.0f;
                                                    }
                                                    var13_13 = View.MeasureSpec.makeMeasureSpec((int)var13_13, (int)var6_6);
                                                    var49_49.measure(var14_14, var13_13);
                                                    break block48;
                                                }
                                                var6_6 = 0x40000000;
                                                var7_7 = 2.0f;
                                            }
                                            if ((var13_13 = (var40_40 = var49_49.getMeasuredHeight()) + var13_13) < 0) {
                                                var13_13 = 0;
                                                var50_50 = 0.0f;
                                            }
                                            var13_13 = View.MeasureSpec.makeMeasureSpec((int)var13_13, (int)var6_6);
                                            var49_49.measure(var14_14, var13_13);
                                        }
                                        var14_14 = var49_49.getMeasuredState() & -256;
                                        var17_17 = View.combineMeasuredStates((int)var17_17, (int)var14_14);
                                        var15_15 = var30_30;
                                        break block49;
                                    }
                                    var6_6 = var9_9;
                                    var9_9 = var1_1;
                                    var47_47 = var6_6;
                                }
                                var6_6 = var51_51.leftMargin;
                                var13_13 = var51_51.rightMargin;
                                var6_6 += var13_13;
                                var13_13 = var49_49.getMeasuredWidth() + var6_6;
                                var26_26 = Math.max(var26_26, var13_13);
                                var30_30 = var15_15;
                                var14_14 = 0x40000000;
                                var15_15 = 2.0f;
                                if (var10_10 == var14_14) break block50;
                                var14_14 = var51_51.width;
                                var40_40 = var17_17;
                                var17_17 = -1;
                                var18_18 = 0.0f / 0.0f;
                                if (var14_14 != var17_17) break block51;
                                break block52;
                            }
                            var40_40 = var17_17;
                            var17_17 = -1;
                            var18_18 = 0.0f / 0.0f;
                        }
                        var6_6 = var13_13;
                    }
                    var14_14 = Math.max(var5_5, var6_6);
                    if (var31_31 != 0 && (var5_5 = var51_51.width) == var17_17) {
                        var5_5 = 1;
                        var43_43 = 1.4E-45f;
                    } else {
                        var5_5 = 0;
                        var43_43 = 0.0f;
                        var48_48 = null;
                    }
                    var6_6 = var3_3.mTotalLength;
                    var13_13 = var49_49.getMeasuredHeight() + var6_6;
                    var17_17 = var51_51.topMargin;
                    var13_13 += var17_17;
                    var17_17 = var51_51.bottomMargin;
                    var13_13 += var17_17;
                    var17_17 = var3_3.getNextLocationOffset(var49_49) + var13_13;
                    var3_3.mTotalLength = var17_17 = Math.max(var6_6, var17_17);
                    var31_31 = var5_5;
                    var17_17 = var40_40;
                    var5_5 = var14_14;
                    var15_15 = var30_30;
                }
                var9_9 = var47_47;
                var6_6 = 0;
                var7_7 = 0.0f;
                var8_8 /* !! */  = null;
            }
            var9_9 = var1_1;
            var14_14 = var3_3.mTotalLength;
            var22_22 = this.getPaddingTop();
            var3_3.mTotalLength = var4_4 = this.getPaddingBottom() + var22_22 + var14_14;
            var14_14 = var5_5;
        }
        if (var31_31 != 0 || var10_10 == (var22_22 = 0x40000000)) {
            var14_14 = var26_26;
        }
        var22_22 = this.getPaddingLeft();
        var26_26 = this.getPaddingRight() + var22_22 + var14_14;
        var14_14 = this.getSuggestedMinimumWidth();
        var14_14 = View.resolveSizeAndState((int)Math.max(var26_26, var14_14), (int)var9_9, (int)var17_17);
        var3_3.setMeasuredDimension(var14_14, var24_24);
        if (var32_32) {
            var3_3.forceUniformWidth(var20_20, var27_27);
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable2 = this.mDivider;
        if (drawable2 == null) {
            return;
        }
        int n3 = this.mOrientation;
        int n4 = 1;
        if (n3 == n4) {
            this.drawDividersVertical(canvas);
        } else {
            this.drawDividersHorizontal(canvas);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)ACCESSIBILITY_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)ACCESSIBILITY_CLASS_NAME);
    }

    /*
     * WARNING - void declaration
     */
    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        void var5_6;
        void var4_5;
        void var3_4;
        void var2_3;
        int n10 = this.mOrientation;
        int n14 = 1;
        if (n10 == n14) {
            this.layoutVertical((int)var2_3, (int)var3_4, (int)var4_5, (int)var5_6);
        } else {
            this.layoutHorizontal((int)var2_3, (int)var3_4, (int)var4_5, (int)var5_6);
        }
    }

    public void onMeasure(int n3, int n4) {
        int n7 = this.mOrientation;
        int n8 = 1;
        if (n7 == n8) {
            this.measureVertical(n3, n4);
        } else {
            this.measureHorizontal(n3, n4);
        }
    }

    public void setBaselineAligned(boolean bl2) {
        this.mBaselineAligned = bl2;
    }

    public void setBaselineAlignedChildIndex(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.getChildCount())) {
            this.mBaselineAlignedChildIndex = n3;
            return;
        }
        CharSequence charSequence = new StringBuilder("base aligned child index out of range (0, ");
        int n7 = this.getChildCount();
        charSequence.append(n7);
        charSequence.append(")");
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public void setDividerDrawable(Drawable drawable2) {
        Drawable drawable3 = this.mDivider;
        if (drawable2 == drawable3) {
            return;
        }
        this.mDivider = drawable2;
        boolean bl2 = false;
        drawable3 = null;
        if (drawable2 != null) {
            int n3;
            this.mDividerWidth = n3 = drawable2.getIntrinsicWidth();
            this.mDividerHeight = n3 = drawable2.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        if (drawable2 == null) {
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
        this.requestLayout();
    }

    public void setDividerPadding(int n3) {
        this.mDividerPadding = n3;
    }

    public void setGravity(int n3) {
        int n4 = this.mGravity;
        if (n4 != n3) {
            n4 = 0x800007 & n3;
            if (n4 == 0) {
                n4 = 0x800003;
                n3 |= n4;
            }
            if ((n4 = n3 & 0x70) == 0) {
                n3 |= 0x30;
            }
            this.mGravity = n3;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int n3) {
        int n4 = 0x800007;
        int n7 = this.mGravity;
        if ((n4 &= n7) != (n3 &= n4)) {
            n4 = 0xFF7FFFF8 & n7;
            this.mGravity = n3 |= n4;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean bl2) {
        this.mUseLargestChild = bl2;
    }

    public void setOrientation(int n3) {
        int n4 = this.mOrientation;
        if (n4 != n3) {
            this.mOrientation = n3;
            this.requestLayout();
        }
    }

    public void setShowDividers(int n3) {
        int n4 = this.mShowDividers;
        if (n3 != n4) {
            this.requestLayout();
        }
        this.mShowDividers = n3;
    }

    public void setVerticalGravity(int n3) {
        int n4 = this.mGravity;
        int n7 = n4 & 0x70;
        if (n7 != (n3 &= 0x70)) {
            this.mGravity = n3 |= (n4 &= 0xFFFFFF8F);
            this.requestLayout();
        }
    }

    public void setWeightSum(float f5) {
        this.mWeightSum = f5 = Math.max(0.0f, f5);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

