/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable;
import androidx.appcompat.widget.DropDownListView$a;
import androidx.appcompat.widget.DropDownListView$b;
import androidx.appcompat.widget.DropDownListView$c;
import androidx.appcompat.widget.DropDownListView$d;
import androidx.appcompat.widget.DropDownListView$e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DropDownListView
extends ListView {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public DropDownListView$d g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public kv1 k;
    public DropDownListView$ResolveHoverRunnable l;

    public DropDownListView(Context context, boolean bl2) {
        int n3 = R$attr.dropDownListViewStyle;
        super(context, null, n3);
        super();
        this.a = context;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.i = bl2;
        this.setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean bl2) {
        DropDownListView$d dropDownListView$d = this.g;
        if (dropDownListView$d != null) {
            dropDownListView$d.a = bl2;
        }
    }

    public int a(int n3, int n4) {
        int n7 = this.getListPaddingTop();
        int n8 = this.getListPaddingBottom();
        int n10 = this.getDividerHeight();
        Drawable drawable2 = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        if (listAdapter == null) {
            return n7 + n8;
        }
        n7 += n8;
        n8 = 0;
        if (n10 <= 0 || drawable2 == null) {
            n10 = 0;
        }
        int n14 = listAdapter.getCount();
        View view = null;
        int n15 = 0;
        for (int i3 = 0; i3 < n14; ++i3) {
            ViewGroup.LayoutParams layoutParams;
            int n16 = listAdapter.getItemViewType(i3);
            if (n16 != n15) {
                view = null;
                n15 = n16;
            }
            if ((layoutParams = (view = listAdapter.getView(i3, view, (ViewGroup)this)).getLayoutParams()) == null) {
                layoutParams = this.generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if ((n16 = layoutParams.height) > 0) {
                int n17 = 0x40000000;
                n16 = View.MeasureSpec.makeMeasureSpec((int)n16, (int)n17);
            } else {
                n16 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            }
            view.measure(n3, n16);
            view.forceLayout();
            if (i3 > 0) {
                n7 += n10;
            }
            if ((n7 += (n16 = view.getMeasuredHeight())) < n4) continue;
            return n4;
        }
        return n7;
    }

    /*
     * Unable to fully structure code
     */
    public boolean b(MotionEvent var1_1, int var2_2) {
        block36: {
            block39: {
                block37: {
                    block38: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_5 = var1_1.getActionMasked();
                        var6_6 = 1;
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var9_9 = null;
                        if (var5_5 != var6_6) {
                            var10_10 = 2;
                            if (var5_5 != var10_10) {
                                var10_10 = 3;
                                if (var5_5 != var10_10) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var10_10 = 1;
                                        break block36;
                                        break;
                                    }
                                }
lbl16:
                                // 3 sources

                                while (true) {
                                    var10_10 = 0;
                                    var11_12 = null;
                                    break block36;
                                    break;
                                }
                            }
                            var10_10 = 1;
                        } else {
                            var10_10 = 0;
                            var11_12 = null;
                        }
                        var12_11 = var1_1.findPointerIndex(var2_2);
                        ** while (var12_11 < 0)
lbl26:
                        // 1 sources

                        var13_13 = var4_4.getX(var12_11);
                        var14_14 = (int)var13_13;
                        var15_15 = var4_4.getY(var12_11);
                        var12_11 = (int)var15_15;
                        var16_16 = var3_3.pointToPosition(var14_14, var12_11);
                        var17_17 = -1;
                        var18_18 = 0.0f / 0.0f;
                        if (var16_16 != var17_17) break block38;
                        var7_7 = 1;
                        var8_8 = 1.4E-45f;
                        break block36;
                    }
                    var10_10 = this.getFirstVisiblePosition();
                    var10_10 = var16_16 - var10_10;
                    var11_12 = var3_3.getChildAt(var10_10);
                    var13_13 = var14_14;
                    var15_15 = var12_11;
                    var3_3.j = var6_6;
                    var19_19 = Build.VERSION.SDK_INT;
                    DropDownListView$a.a((View)var3_3, var13_13, var15_15);
                    var20_20 = this.isPressed();
                    if (var20_20 == 0) {
                        var3_3.setPressed((boolean)var6_6);
                    }
                    this.layoutChildren();
                    var20_20 = var3_3.f;
                    if (var20_20 != var17_17 && (var22_22 = var3_3.getChildAt(var20_20 -= (var21_21 = this.getFirstVisiblePosition()))) != null && var22_22 != var11_12 && (var21_21 = (int)var22_22.isPressed()) != 0) {
                        var22_22.setPressed(false);
                    }
                    var3_3.f = var16_16;
                    var23_23 = var11_12.getLeft();
                    var23_23 = var13_13 - var23_23;
                    var21_21 = var11_12.getTop();
                    var24_24 = var21_21;
                    var24_24 = var15_15 - var24_24;
                    DropDownListView$a.a(var11_12, var23_23, var24_24);
                    var20_20 = (int)var11_12.isPressed();
                    if (var20_20 == 0) {
                        var11_12.setPressed((boolean)var6_6);
                    }
                    if ((var22_22 = this.getSelector()) != null && var16_16 != var17_17) {
                        var21_21 = 1;
                        var24_24 = 1.4E-45f;
                    } else {
                        var21_21 = 0;
                        var24_24 = 0.0f;
                    }
                    if (var21_21 != 0) {
                        var22_22.setVisible(false, false);
                    }
                    var25_25 = var11_12.getLeft();
                    var26_26 = var11_12.getTop();
                    var27_27 = var11_12.getRight();
                    var7_7 = var11_12.getBottom();
                    var28_28 = var3_3.a;
                    var28_28.set(var25_25, var26_26, var27_27, var7_7);
                    var7_7 = var28_28.left;
                    var25_25 = var3_3.b;
                    var28_28.left = var7_7 -= var25_25;
                    var7_7 = var28_28.top;
                    var25_25 = var3_3.c;
                    var28_28.top = var7_7 -= var25_25;
                    var7_7 = var28_28.right;
                    var25_25 = var3_3.d;
                    var28_28.right = var7_7 += var25_25;
                    var7_7 = var28_28.bottom;
                    var25_25 = var3_3.e;
                    var28_28.bottom = var7_7 += var25_25;
                    var7_7 = 33;
                    var8_8 = 4.6E-44f;
                    if (var19_19 >= var7_7) {
                        var19_19 = (int)DropDownListView$c.a((AbsListView)this);
                    } else {
                        var29_29 = DropDownListView$e.a;
                        if (var29_29 != null) {
                            try {
                                var19_19 = (int)var29_29.getBoolean((Object)var3_3);
                                break block37;
                            }
                            catch (IllegalAccessException v0) {}
                        }
                        var19_19 = 0;
                        var29_29 = null;
                    }
                }
                var25_25 = (int)var11_12.isEnabled();
                if (var25_25 == var19_19) break block39;
                var19_19 ^= var6_6;
                var25_25 = Build.VERSION.SDK_INT;
                if (var25_25 >= var7_7) {
                    DropDownListView$c.b((AbsListView)var3_3, (boolean)var19_19);
lbl110:
                    // 3 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var9_9 = DropDownListView$e.a;
                if (var9_9 == null) ** GOTO lbl110
                try {
                    var29_29 = (boolean)var19_19;
                }
                catch (IllegalAccessException v1) {}
                var9_9.set((Object)var3_3, var29_29);
                ** while (true)
                var7_7 = -1;
                var8_8 = 0.0f / 0.0f;
                if (var16_16 != var7_7) {
                    this.refreshDrawableState();
                }
            }
            if (var21_21 != 0) {
                var8_8 = var28_28.exactCenterX();
                var18_18 = var28_28.exactCenterY();
                var19_19 = this.getVisibility();
                if (!var19_19) {
                    var19_19 = 1;
lbl132:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var19_19 = 0;
                var29_29 = null;
                ** continue;
                var21_21 = 0;
                var24_24 = 0.0f;
                var22_22.setVisible((boolean)var19_19, false);
                var22_22.setHotspot(var8_8, var18_18);
            }
            if ((var9_9 = this.getSelector()) != null) {
                var17_17 = -1;
                var18_18 = 0.0f / 0.0f;
                if (var16_16 != var17_17) {
                    var9_9.setHotspot(var13_13, var15_15);
                }
            }
            var7_7 = 0;
            var8_8 = 0.0f;
            var9_9 = null;
            var3_3.setSelectorEnabled(false);
            this.refreshDrawableState();
            if (var5_5 == var6_6) {
                var30_30 = var3_3.getItemIdAtPosition(var16_16);
                var3_3.performItemClick(var11_12, var16_16, var30_30);
            }
            var7_7 = 0;
            var8_8 = 0.0f;
            var9_9 = null;
            ** while (true)
        }
        if (var10_10 == 0 || var7_7 != 0) {
            var5_5 = 0;
            var32_31 = null;
            var3_3.j = false;
            var3_3.setPressed(false);
            this.drawableStateChanged();
            var7_7 = var3_3.f;
            var12_11 = this.getFirstVisiblePosition();
            var9_9 = var3_3.getChildAt(var7_7 -= var12_11);
            if (var9_9 != null) {
                var9_9.setPressed(false);
            }
        }
        if (var10_10 != 0) {
            var32_31 = var3_3.k;
            if (var32_31 == null) {
                var3_3.k = var32_31 = new kv1(var3_3);
            }
            var32_31 = var3_3.k;
            var7_7 = var32_31.p;
            var32_31.p = var6_6;
            var32_31.onTouch((View)var3_3, (MotionEvent)var4_4);
        } else {
            var4_4 = var3_3.k;
            if (var4_4 != null) {
                var5_5 = var4_4.p;
                if (var5_5 != 0) {
                    var4_4.d();
                }
                var5_5 = 0;
                var32_31 = null;
                var4_4.p = false;
            }
        }
        return (boolean)var10_10;
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable2;
        Rect rect = this.a;
        boolean bl2 = rect.isEmpty();
        if (!bl2 && (drawable2 = this.getSelector()) != null) {
            drawable2.setBounds(rect);
            drawable2.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        boolean bl2;
        DropDownListView$ResolveHoverRunnable dropDownListView$ResolveHoverRunnable = this.l;
        if (dropDownListView$ResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        boolean bl3 = true;
        this.setSelectorEnabled(bl3);
        dropDownListView$ResolveHoverRunnable = this.getSelector();
        if (dropDownListView$ResolveHoverRunnable != null && (bl2 = this.j) && (bl2 = this.isPressed())) {
            int[] nArray = this.getDrawableState();
            dropDownListView$ResolveHoverRunnable.setState(nArray);
        }
    }

    public boolean hasFocus() {
        boolean bl2 = this.i;
        bl2 = bl2 || (bl2 = super.hasFocus());
        return bl2;
    }

    public boolean hasWindowFocus() {
        boolean bl2 = this.i;
        bl2 = bl2 || (bl2 = super.hasWindowFocus());
        return bl2;
    }

    public boolean isFocused() {
        boolean bl2 = this.i;
        bl2 = bl2 || (bl2 = super.isFocused());
        return bl2;
    }

    public boolean isInTouchMode() {
        boolean bl2 = this.i;
        bl2 = bl2 && (bl2 = this.h) || (bl2 = super.isInTouchMode());
        return bl2;
    }

    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent object) {
        DropDownListView$ResolveHoverRunnable dropDownListView$ResolveHoverRunnable;
        int n3;
        int n4 = 1;
        int n7 = 0;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 26;
        float f5 = 3.6E-44f;
        if (n8 < n10) {
            return super.onHoverEvent(object);
        }
        n10 = object.getActionMasked();
        if (n10 == (n3 = 10) && (dropDownListView$ResolveHoverRunnable = this.l) == null) {
            this.l = dropDownListView$ResolveHoverRunnable = new DropDownListView$ResolveHoverRunnable(this);
            this.post(dropDownListView$ResolveHoverRunnable);
        }
        n3 = (int)(super.onHoverEvent(object) ? 1 : 0);
        int n14 = 9;
        int n15 = -1;
        if (n10 != n14 && n10 != (n14 = 7)) {
            this.setSelection(n15);
        } else {
            f5 = object.getX();
            n10 = (int)f5;
            float f6 = object.getY();
            int n16 = (int)f6;
            if ((n16 = this.pointToPosition(n10, n16)) != n15 && n16 != (n10 = this.getSelectedItemPosition())) {
                Object[] objectArray;
                n10 = this.getFirstVisiblePosition();
                Object object2 = this.getChildAt(n10 = n16 - n10);
                n14 = (int)(object2.isEnabled() ? 1 : 0);
                if (n14 != 0) {
                    this.requestFocus();
                    n14 = 30;
                    if (n8 >= n14 && (n8 = (int)(DropDownListView$b.d ? 1 : 0)) != 0) {
                        Method method = DropDownListView$b.a;
                        Object[] objectArray2 = Integer.valueOf(n16);
                        Integer n17 = n15;
                        Integer n18 = n15;
                        int n19 = 5;
                        Object[] objectArray3 = new Object[n19];
                        objectArray3[0] = objectArray2;
                        objectArray3[n4] = object2;
                        object2 = Boolean.FALSE;
                        n14 = 2;
                        objectArray3[n14] = object2;
                        n10 = 3;
                        f5 = 4.2E-45f;
                        objectArray3[n10] = n17;
                        n10 = 4;
                        f5 = 5.6E-45f;
                        objectArray3[n10] = n18;
                        method.invoke((Object)this, objectArray3);
                        method = DropDownListView$b.b;
                        object2 = n16;
                        objectArray2 = new Object[n4];
                        objectArray2[0] = object2;
                        method.invoke((Object)this, objectArray2);
                        method = DropDownListView$b.c;
                        object = n16;
                        objectArray = new Object[n4];
                        objectArray[0] = (int)object;
                        try {
                            method.invoke((Object)this, objectArray);
                        }
                        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
                    } else {
                        n4 = object2.getTop();
                        n7 = this.getTop();
                        this.setSelectionFromTop(n16, n4 -= n7);
                    }
                }
                if ((object = this.getSelector()) != null && (n4 = this.j) != 0 && (n4 = (int)(this.isPressed() ? 1 : 0)) != 0) {
                    objectArray = this.getDrawableState();
                    object.setState(objectArray);
                }
            }
        }
        return n3 != 0;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            float f5 = motionEvent.getX();
            n3 = (int)f5;
            float f6 = motionEvent.getY();
            int n4 = (int)f6;
            this.f = n3 = this.pointToPosition(n3, n4);
        }
        DropDownListView$ResolveHoverRunnable dropDownListView$ResolveHoverRunnable = this.l;
        if (dropDownListView$ResolveHoverRunnable != null) {
            DropDownListView dropDownListView = dropDownListView$ResolveHoverRunnable.a;
            dropDownListView.l = null;
            dropDownListView.removeCallbacks(dropDownListView$ResolveHoverRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean bl2) {
        this.h = bl2;
    }

    public void setSelector(Drawable drawable2) {
        int n3;
        DropDownListView$d dropDownListView$d;
        if (drawable2 != null) {
            boolean bl2;
            dropDownListView$d = new wu0_0(drawable2);
            dropDownListView$d.a = bl2 = true;
        } else {
            dropDownListView$d = null;
        }
        this.g = dropDownListView$d;
        super.setSelector((Drawable)dropDownListView$d);
        dropDownListView$d = new Rect();
        if (drawable2 != null) {
            drawable2.getPadding((Rect)dropDownListView$d);
        }
        this.b = n3 = ((Rect)dropDownListView$d).left;
        this.c = n3 = ((Rect)dropDownListView$d).top;
        this.d = n3 = ((Rect)dropDownListView$d).right;
        this.e = n3 = ((Rect)dropDownListView$d).bottom;
    }
}

