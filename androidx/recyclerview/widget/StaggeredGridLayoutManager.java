/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$o$c;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$1;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$b;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class StaggeredGridLayoutManager
extends RecyclerView$o
implements RecyclerView$x$b {
    public int a;
    public StaggeredGridLayoutManager$b[] b;
    public final t c;
    public final t d;
    public final int e;
    public int f;
    public final n g;
    public boolean h;
    public boolean i;
    public BitSet j;
    public int k;
    public int l;
    public final StaggeredGridLayoutManager$LazySpanLookup m;
    public final int n;
    public boolean o;
    public boolean p;
    public StaggeredGridLayoutManager$SavedState q;
    public int r;
    public final Rect s;
    public final StaggeredGridLayoutManager$a t;
    public boolean u;
    public final boolean v;
    public int[] w;
    public final Runnable x;

    public StaggeredGridLayoutManager() {
        Object object;
        Object object2;
        int n3;
        this.a = n3 = -1;
        this.h = false;
        this.i = false;
        this.k = n3;
        this.l = -1 << -1;
        this.m = object2;
        this.n = n3 = 2;
        this.s = object = new Rect();
        super(this);
        this.t = object;
        this.u = false;
        int n4 = 1;
        this.v = n4;
        super(this);
        this.x = object;
        this.e = n4;
        this.setSpanCount(n3);
        this.g = object2 = new n();
        n3 = this.e;
        this.c = object2 = androidx.recyclerview.widget.t.a(this, n3);
        n3 = this.e;
        this.d = object2 = androidx.recyclerview.widget.t.a(this, n4 -= n3);
    }

    public StaggeredGridLayoutManager(Context object, AttributeSet object2, int n3, int n4) {
        Object object3;
        int n7;
        this.a = n7 = -1;
        this.h = false;
        this.i = false;
        this.k = n7;
        this.l = -1 << -1;
        this.m = object3;
        this.n = 2;
        super();
        this.s = object3;
        this.t = object3 = new StaggeredGridLayoutManager$a(this);
        this.u = false;
        n7 = 1;
        this.v = n7;
        StaggeredGridLayoutManager$1 staggeredGridLayoutManager$1 = new StaggeredGridLayoutManager$1(this);
        this.x = staggeredGridLayoutManager$1;
        object = RecyclerView$o.getProperties(object, object2, n3, n4);
        int n8 = object.a;
        if (n8 != 0 && n8 != n7) {
            super("invalid orientation.");
            throw object;
        }
        n3 = 0;
        this.assertNotInLayoutOrScroll(null);
        n4 = this.e;
        if (n8 != n4) {
            t t3;
            this.e = n8;
            object2 = this.c;
            this.c = t3 = this.d;
            this.d = object2;
            this.requestLayout();
        }
        n8 = object.b;
        this.setSpanCount(n8);
        int n10 = object.c;
        this.assertNotInLayoutOrScroll(null);
        object2 = this.q;
        if (object2 != null && (n3 = (int)(object2.h ? 1 : 0)) != n10) {
            object2.h = n10;
        }
        this.h = n10;
        this.requestLayout();
        super();
        this.g = object;
        n10 = this.e;
        object = androidx.recyclerview.widget.t.a(this, n10);
        this.c = object;
        n10 = this.e;
        object = androidx.recyclerview.widget.t.a(this, n7 -= n10);
        this.d = object;
    }

    public static int y(int n3, int n4, int n7) {
        int n8;
        if (n4 == 0 && n7 == 0) {
            return n3;
        }
        int n10 = View.MeasureSpec.getMode((int)n3);
        if (n10 != (n8 = -1 << -1) && n10 != (n8 = 0x40000000)) {
            return n3;
        }
        n3 = View.MeasureSpec.getSize((int)n3) - n4 - n7;
        return View.MeasureSpec.makeMeasureSpec((int)Math.max(0, n3), (int)n10);
    }

    public final int a(int n3) {
        int n4 = this.getChildCount();
        int n7 = -1;
        if (n4 == 0) {
            n3 = (int)(this.i ? 1 : 0);
            if (n3 != 0) {
                n7 = 1;
            }
            return n7;
        }
        n4 = this.h();
        if ((n3 = n3 < n4 ? 1 : 0) == (n4 = (int)(this.i ? 1 : 0))) {
            n7 = 1;
        }
        return n7;
    }

    public final void assertNotInLayoutOrScroll(String string2) {
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = this.q;
        if (staggeredGridLayoutManager$SavedState == null) {
            super.assertNotInLayoutOrScroll(string2);
        }
    }

    public final boolean b() {
        int n3 = this.getChildCount();
        int n4 = 0;
        if (n3 != 0 && (n3 = this.n) != 0 && (n3 = (int)(this.isAttachedToWindow() ? 1 : 0)) != 0) {
            View view;
            int n7;
            n3 = (int)(this.i ? 1 : 0);
            if (n3 != 0) {
                n3 = this.i();
                n7 = this.h();
            } else {
                n3 = this.h();
                n7 = this.i();
            }
            StaggeredGridLayoutManager$LazySpanLookup staggeredGridLayoutManager$LazySpanLookup = this.m;
            int n8 = 1;
            if (n3 == 0 && (view = this.m()) != null) {
                staggeredGridLayoutManager$LazySpanLookup.b();
                this.requestSimpleAnimationsInNextLayout();
                this.requestLayout();
                return n8 != 0;
            }
            int n10 = this.u;
            if (n10 == 0) {
                return false;
            }
            n10 = this.i;
            n10 = n10 != 0 ? -1 : 1;
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = staggeredGridLayoutManager$LazySpanLookup.e(n3, n7 += n8, n10);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem == null) {
                this.u = false;
                staggeredGridLayoutManager$LazySpanLookup.d(n7);
                return false;
            }
            n4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = staggeredGridLayoutManager$LazySpanLookup.e(n3, n4, n10 *= -1);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 == null) {
                n3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
                staggeredGridLayoutManager$LazySpanLookup.d(n3);
            } else {
                n3 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a + n8;
                staggeredGridLayoutManager$LazySpanLookup.d(n3);
            }
            this.requestSimpleAnimationsInNextLayout();
            this.requestLayout();
            return n8 != 0;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int c(RecyclerView$u var1_1, n var2_2, RecyclerView$y var3_3) {
        var4_4 = this;
        var5_5 = var1_1;
        var6_6 = var2_2;
        var7_7 = this.j;
        var8_8 = this.a;
        var9_9 = 0;
        var10_10 = null;
        var11_11 = 1;
        var7_7.set(0, var8_8, (boolean)var11_11);
        var12_12 = this.g;
        var13_13 = var12_12.i;
        if (var13_13 != 0) {
            var13_13 = var2_2.e;
            var14_14 = var13_13 == var11_11 ? -1 >>> 1 : -1 << -1;
        } else {
            var13_13 = var2_2.e;
            if (var13_13 == var11_11) {
                var13_13 = var2_2.g;
                var8_8 = var2_2.b;
                var13_13 += var8_8;
lbl21:
                // 2 sources

                while (true) {
                    var14_14 = var13_13;
                    break;
                }
            } else {
                var13_13 = var2_2.f;
                var8_8 = var2_2.b;
                var13_13 -= var8_8;
                ** continue;
            }
        }
        var13_13 = var6_6.e;
        var4_4.v(var13_13, var14_14);
        var13_13 = (int)var4_4.i;
        if (var13_13 != 0) {
            var7_7 = var4_4.c;
            var13_13 = var7_7.g();
lbl34:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var7_7 = var4_4.c;
        var13_13 = var7_7.k();
        ** while (true)
        var15_15 = var13_13;
        var13_13 = 0;
        var7_7 = null;
        while (true) {
            block73: {
                if ((var8_8 = var6_6.c) >= 0 && var8_8 < (var16_16 = var3_3.b())) {
                    var8_8 = 1;
                } else {
                    var8_8 = 0;
                    var17_17 = null;
                }
                var16_16 = -1;
                if (var8_8 == 0 || (var8_8 = (int)var12_12.i) == 0 && (var8_8 = (int)(var17_17 = var4_4.j).isEmpty()) != 0) break;
                var13_13 = var6_6.c;
                var20_20 = 0x7FFFFFFFFFFFFFFFL;
                var22_21 /* !! */  = var5_5.m((int)var13_13, (long)var20_20).itemView;
                var13_13 = var6_6.c;
                var8_8 = var6_6.d;
                var6_6.c = var13_13 += var8_8;
                var23_22 = var7_7 = var22_21 /* !! */ .getLayoutParams();
                var23_22 = (StaggeredGridLayoutManager$LayoutParams)var7_7;
                var13_13 = var23_22.getViewLayoutPosition();
                var17_17 = var4_4.m;
                var19_19 /* !! */  = var17_17.a;
                var18_18 = var19_19 /* !! */  != null && var13_13 < (var24_23 = var19_19 /* !! */ .length) ? var19_19 /* !! */ [var13_13] : -1;
                var24_23 = var18_18 == var16_16 ? 1 : 0;
                if (var24_23 != 0) {
                    var18_18 = (int)var23_22.b;
                    if (var18_18 != 0) {
                        var19_19 /* !! */  = (int[])var4_4.b[0];
                    } else {
                        var18_18 = var6_6.e;
                        if ((var18_18 = (int)var4_4.p(var18_18)) != 0) {
                            var18_18 = var4_4.a - var11_11;
                            var25_24 = -1;
                            var26_25 = -1;
                        } else {
                            var25_24 = var4_4.a;
                            var18_18 = 0;
                            var19_19 /* !! */  = null;
                            var26_25 = 1;
                        }
                        var16_16 = var6_6.e;
                        var27_26 = null;
                        if (var16_16 == var11_11) {
                            var28_27 = var4_4.c;
                            var16_16 = var28_27.k();
                            var9_9 = -1 >>> 1;
                            while (var18_18 != var25_24) {
                                var29_28 = var4_4.b[var18_18];
                                var30_29 = var29_28.h(var16_16);
                                if (var30_29 < var9_9) {
                                    var9_9 = var30_29;
                                    var27_26 = var29_28;
                                }
                                var18_18 += var26_25;
                                var5_5 = var1_1;
                                var11_11 = 1;
                            }
                            while (true) {
                                var19_19 /* !! */  = var27_26;
                                break;
                            }
                        } else {
                            var28_27 = var4_4.c;
                            var16_16 = var28_27.g();
                            var30_29 = -1 << -1;
                            while (true) {
                                if (var18_18 == var25_24) ** continue;
                                var10_10 = var4_4.b[var18_18];
                                var11_11 = var10_10.j(var16_16);
                                if (var11_11 > var30_29) {
                                    var27_26 = var10_10;
                                    var30_29 = var11_11;
                                }
                                var18_18 += var26_25;
                            }
                        }
                    }
                    var17_17.c(var13_13);
                    var28_27 = var17_17.a;
                    var30_29 = var19_19 /* !! */ .e;
                    var28_27[var13_13] = (StaggeredGridLayoutManager$b)var30_29;
lbl113:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var28_27 = var4_4.b;
                var19_19 /* !! */  = (int[])var28_27[var18_18];
                ** continue;
                var5_5 = var19_19 /* !! */ ;
                var23_22.a = var19_19 /* !! */ ;
                var16_16 = var6_6.e;
                var18_18 = 1;
                if (var16_16 == var18_18) {
                    var4_4.addView(var22_21 /* !! */ );
                } else {
                    var16_16 = 0;
                    var28_27 = null;
                    var4_4.addView(var22_21 /* !! */ , 0);
                }
                var16_16 = (int)var23_22.b;
                if (var16_16 != 0) {
                    var16_16 = var4_4.e;
                    if (var16_16 == var18_18) {
                        var16_16 = var4_4.r;
                        var9_9 = this.getHeight();
                        var11_11 = this.getHeightMode();
                        var25_24 = this.getPaddingTop();
                        var25_24 = this.getPaddingBottom() + var25_24;
                        var26_25 = var14_14;
                        var14_14 = var23_22.height;
                        var9_9 = RecyclerView$o.getChildMeasureSpec(var9_9, var11_11, var25_24, var14_14, (boolean)var18_18);
                        var4_4.n(var22_21 /* !! */ , var16_16, var9_9);
                    } else {
                        var26_25 = var14_14;
                        var16_16 = this.getWidth();
                        var9_9 = this.getWidthMode();
                        var11_11 = this.getPaddingLeft();
                        var25_24 = this.getPaddingRight() + var11_11;
                        var11_11 = var23_22.width;
                        var16_16 = RecyclerView$o.getChildMeasureSpec(var16_16, var9_9, var25_24, var11_11, (boolean)var18_18);
                        var9_9 = var4_4.r;
                        var4_4.n(var22_21 /* !! */ , var16_16, var9_9);
                    }
                } else {
                    var26_25 = var14_14;
                    var16_16 = var4_4.e;
                    if (var16_16 == var18_18) {
                        var16_16 = var4_4.f;
                        var9_9 = this.getWidthMode();
                        var11_11 = var23_22.width;
                        var31_30 = null;
                        var16_16 = RecyclerView$o.getChildMeasureSpec(var16_16, var9_9, 0, var11_11, false);
                        var9_9 = this.getHeight();
                        var11_11 = this.getHeightMode();
                        var25_24 = this.getPaddingTop();
                        var14_14 = this.getPaddingBottom() + var25_24;
                        var25_24 = var23_22.height;
                        var9_9 = RecyclerView$o.getChildMeasureSpec(var9_9, var11_11, var14_14, var25_24, (boolean)var18_18);
                        var4_4.n(var22_21 /* !! */ , var16_16, var9_9);
                    } else {
                        var16_16 = this.getWidth();
                        var9_9 = this.getWidthMode();
                        var11_11 = this.getPaddingLeft();
                        var25_24 = this.getPaddingRight() + var11_11;
                        var11_11 = var23_22.width;
                        var16_16 = RecyclerView$o.getChildMeasureSpec(var16_16, var9_9, var25_24, var11_11, (boolean)var18_18);
                        var9_9 = var4_4.f;
                        var11_11 = this.getHeightMode();
                        var25_24 = var23_22.height;
                        var14_14 = 0;
                        var32_31 = null;
                        var9_9 = RecyclerView$o.getChildMeasureSpec(var9_9, var11_11, 0, var25_24, false);
                        var4_4.n(var22_21 /* !! */ , var16_16, var9_9);
                    }
                }
                var16_16 = var6_6.e;
                if (var16_16 == var18_18) {
                    var16_16 = var23_22.b;
                    var16_16 = var16_16 != 0 ? var4_4.j(var15_15) : var5_5.h(var15_15);
                    var19_19 /* !! */  = (int[])var4_4.c;
                    var18_18 = var19_19 /* !! */ .c(var22_21 /* !! */ ) + var16_16;
                    if (var24_23 != 0 && (var9_9 = (int)var23_22.b) != 0) {
                        var10_10 = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                        var29_28 = new int[var4_4.a];
                        var10_10.c = (int[])var29_28;
                        var29_28 = null;
                        for (var11_11 = 0; var11_11 < (var25_24 = var4_4.a); ++var11_11) {
                            var31_30 = var10_10.c;
                            var32_31 = var4_4.b[var11_11];
                            var14_14 = var32_31.h(var16_16);
                            var31_30[var11_11] = var14_14 = var16_16 - var14_14;
                        }
                        var10_10.b = var11_11 = -1;
                        var10_10.a = var13_13;
                        var17_17.a((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)var10_10);
                    }
                    var9_9 = var18_18;
                    var18_18 = var16_16;
                } else {
                    var16_16 = var23_22.b;
                    var16_16 = var16_16 != 0 ? var4_4.k(var15_15) : var5_5.j(var15_15);
                    var19_19 /* !! */  = (int[])var4_4.c;
                    var18_18 = var19_19 /* !! */ .c(var22_21 /* !! */ );
                    var18_18 = var16_16 - var18_18;
                    if (var24_23 != 0 && (var9_9 = (int)var23_22.b) != 0) {
                        var10_10 = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
                        var29_28 = new int[var4_4.a];
                        var10_10.c = (int[])var29_28;
                        var29_28 = null;
                        for (var11_11 = 0; var11_11 < (var25_24 = var4_4.a); ++var11_11) {
                            var31_30 = var10_10.c;
                            var32_31 = var4_4.b[var11_11];
                            var31_30[var11_11] = var14_14 = var32_31.j(var16_16) - var16_16;
                        }
                        var10_10.b = var11_11 = 1;
                        var10_10.a = var13_13;
                        var17_17.a((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)var10_10);
                    }
                    var9_9 = var16_16;
                }
                var16_16 = (int)var23_22.b;
                if (var16_16 != 0 && (var16_16 = var6_6.d) == (var11_11 = -1)) {
                    block74: {
                        if (var24_23 != 0) {
                            var16_16 = 1;
                            var4_4.u = var16_16;
lbl228:
                            // 2 sources

                            while (true) {
                                var11_11 = -1 << -1;
                                break block73;
                                break;
                            }
                        }
                        var11_11 = var6_6.e;
                        var16_16 = 1;
                        if (var11_11 == var16_16) {
                            var28_27 = var4_4.b;
                            var29_28 = null;
                            var28_27 = var28_27[0];
                            var11_11 = -1 << -1;
                            var16_16 = var28_27.h(var11_11);
                            for (var24_23 = 1; var24_23 < (var25_24 = var4_4.a); ++var24_23) {
                                var31_30 = var4_4.b[var24_23];
                                var25_24 = var31_30.h(var11_11);
                                if (var25_24 == var16_16) continue;
                                while (true) {
                                    var16_16 = 1;
                                    var33_32 = 0;
                                    break block74;
                                    break;
                                }
                            }
                            while (true) {
                                var16_16 = 1;
                                var33_32 = 1;
                                break block74;
                                break;
                            }
                        }
                        var11_11 = -1 << -1;
                        var28_27 = var4_4.b[0];
                        var16_16 = var28_27.j(var11_11);
                        var24_23 = 1;
                        while (true) {
                            if (var24_23 >= (var25_24 = var4_4.a)) ** continue;
                            if ((var25_24 = (var31_30 = (Object)var4_4.b[var24_23]).j(var11_11)) != var16_16) ** continue;
                            ++var24_23;
                        }
                    }
                    var24_23 = var33_32 ^ 1;
                    if (var24_23 != 0) {
                        var7_7 = var17_17.f(var13_13);
                        if (var7_7 != null) {
                            var7_7.d = var16_16;
                        }
                        var4_4.u = var16_16;
                    }
                } else {
                    var16_16 = 1;
                    ** continue;
                }
            }
            var13_13 = var6_6.e;
            if (var13_13 == var16_16) {
                var13_13 = (int)var23_22.b;
                if (var13_13 != 0) {
                    for (var13_13 = var4_4.a - var16_16; var13_13 >= 0; var13_13 += -1) {
                        var17_17 = var4_4.b[var13_13];
                        var17_17.a(var22_21 /* !! */ );
                    }
                } else {
                    var7_7 = var23_22.a;
                    var7_7.a(var22_21 /* !! */ );
                }
            } else {
                var13_13 = (int)var23_22.b;
                if (var13_13 != 0) {
                    var13_13 = var4_4.a;
                    var8_8 = 1;
                    var13_13 -= var8_8;
                    while (var13_13 >= 0) {
                        var17_17 = var4_4.b[var13_13];
                        var17_17.m(var22_21 /* !! */ );
                        var13_13 += -1;
                    }
                } else {
                    var7_7 = var23_22.a;
                    var7_7.m(var22_21 /* !! */ );
                }
            }
            if ((var13_13 = (int)this.isLayoutRTL()) != 0 && (var13_13 = var4_4.e) == (var8_8 = 1)) {
                var13_13 = (int)var23_22.b;
                if (var13_13 != 0) {
                    var7_7 = var4_4.d;
                    var13_13 = var7_7.g();
                } else {
                    var7_7 = var4_4.d;
                    var13_13 = var7_7.g();
                    var16_16 = var4_4.a - var8_8;
                    var8_8 = var5_5.e;
                    var16_16 -= var8_8;
                    var8_8 = var4_4.f;
                    var13_13 -= (var16_16 *= var8_8);
                }
                var17_17 = var4_4.d;
                var8_8 = var17_17.c(var22_21 /* !! */ );
                var8_8 = var13_13 - var8_8;
                var25_24 = var13_13;
                var24_23 = var8_8;
            } else {
                var13_13 = (int)var23_22.b;
                if (var13_13 != 0) {
                    var7_7 = var4_4.d;
                    var13_13 = var7_7.k();
                } else {
                    var13_13 = var5_5.e;
                    var8_8 = var4_4.f;
                    var13_13 *= var8_8;
                    var17_17 = var4_4.d;
                    var8_8 = var17_17.k();
                    var13_13 += var8_8;
                }
                var17_17 = var4_4.d;
                var8_8 = var17_17.c(var22_21 /* !! */ ) + var13_13;
                var24_23 = var13_13;
                var25_24 = var8_8;
            }
            var13_13 = var4_4.e;
            var14_14 = 1;
            if (var13_13 == var14_14) {
                var7_7 = this;
                var17_17 = var22_21 /* !! */ ;
                var16_16 = var24_23;
                var34_33 = var22_21 /* !! */ ;
                this.layoutDecoratedWithMargins(var22_21 /* !! */ , var24_23, var18_18, var25_24, var9_9);
                var10_10 = var23_22;
            } else {
                var34_33 = var22_21 /* !! */ ;
                var22_21 /* !! */  = var23_22;
                var7_7 = this;
                var17_17 = var34_33;
                var16_16 = var18_18;
                var18_18 = var24_23;
                var10_10 = var23_22;
                this.layoutDecoratedWithMargins(var34_33, var16_16, var24_23, var9_9, var25_24);
            }
            var13_13 = (int)var10_10.b;
            if (var13_13 != 0) {
                var13_13 = var12_12.e;
                var24_23 = var26_25;
                var4_4.v(var13_13, var26_25);
lbl353:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var24_23 = var26_25;
            var13_13 = var12_12.e;
            var4_4.x((StaggeredGridLayoutManager$b)var5_5, var13_13, var26_25);
            ** continue;
            var17_17 = var1_1;
            var4_4.r(var1_1, var12_12);
            var13_13 = (int)var12_12.h;
            if (var13_13 == 0 || (var13_13 = (int)var34_33.hasFocusable()) == 0) ** GOTO lbl367
            var13_13 = (int)var10_10.b;
            if (var13_13 != 0) {
                var7_7 = var4_4.j;
                var7_7.clear();
lbl367:
                // 2 sources

                var18_18 = 0;
                var19_19 /* !! */  = null;
            } else {
                var7_7 = var4_4.j;
                var16_16 = var5_5.e;
                var18_18 = 0;
                var19_19 /* !! */  = null;
                var7_7.set(var16_16, false);
            }
            var5_5 = var17_17;
            var14_14 = var24_23;
            var13_13 = 1;
            var9_9 = 0;
            var10_10 = null;
            var11_11 = 1;
        }
        var17_17 = var5_5;
        var18_18 = 0;
        var19_19 /* !! */  = null;
        if (var13_13 == 0) {
            var4_4.r((RecyclerView$u)var5_5, var12_12);
        }
        if ((var13_13 = var12_12.e) == (var8_8 = -1)) {
            var7_7 = var4_4.c;
            var13_13 = var7_7.k();
            var13_13 = var4_4.k(var13_13);
            var17_17 = var4_4.c;
            var8_8 = var17_17.k() - var13_13;
        } else {
            var7_7 = var4_4.c;
            var13_13 = var7_7.g();
            var13_13 = var4_4.j(var13_13);
            var17_17 = var4_4.c;
            var8_8 = var17_17.g();
            var8_8 = var13_13 - var8_8;
        }
        if (var8_8 > 0) {
            var13_13 = var6_6.b;
            var9_9 = Math.min(var13_13, var8_8);
        } else {
            var9_9 = 0;
            var10_10 = null;
        }
        return var9_9;
    }

    public final boolean canScrollHorizontally() {
        int n3 = this.e;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean canScrollVertically() {
        int n3 = this.e;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final boolean checkLayoutParams(RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams instanceof StaggeredGridLayoutManager$LayoutParams;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void collectAdjacentPrefetchPositions(int n3, int n4, RecyclerView$y recyclerView$y, RecyclerView$o$c recyclerView$o$c) {
        Object object;
        Object object2;
        int n7 = this.e;
        if (n7 != 0) {
            n3 = n4;
        }
        n4 = this.getChildCount();
        if (n4 == 0) return;
        if (n3 == 0) {
            return;
        }
        this.q(n3, recyclerView$y);
        int[] nArray = this.w;
        if (nArray == null || (n3 = nArray.length) < (n4 = this.a)) {
            n3 = this.a;
            this.w = nArray = new int[n3];
        }
        n3 = 0;
        nArray = null;
        n4 = 0;
        int[] nArray2 = null;
        n7 = 0;
        while (true) {
            int n8;
            int n10 = this.a;
            object2 = this.g;
            if (n4 >= n10) break;
            n10 = ((n)object2).d;
            int n14 = -1;
            if (n10 == n14) {
                n10 = ((n)object2).f;
                object2 = this.b[n4];
                n8 = ((StaggeredGridLayoutManager$b)object2).j(n10);
            } else {
                object = this.b[n4];
                n14 = ((n)object2).g;
                n10 = ((StaggeredGridLayoutManager$b)object).h(n14);
                n8 = ((n)object2).g;
            }
            if ((n10 -= n8) >= 0) {
                object2 = this.w;
                object2[n7] = n10;
                ++n7;
            }
            ++n4;
        }
        nArray2 = this.w;
        Arrays.sort(nArray2, 0, n7);
        while (n3 < n7) {
            n4 = ((n)object2).c;
            if (n4 < 0) return;
            Object object3 = recyclerView$y.b();
            if (n4 >= object3) return;
            n4 = ((n)object2).c;
            object = this.w;
            object3 = object[n3];
            RecyclerView$o$c recyclerView$o$c2 = recyclerView$o$c;
            recyclerView$o$c2 = (GapWorker$b)recyclerView$o$c;
            ((GapWorker$b)recyclerView$o$c2).a(n4, (int)object3);
            n4 = ((n)object2).c;
            object3 = ((n)object2).d;
            ((n)object2).c = n4 += object3;
            ++n3;
        }
    }

    public final int computeHorizontalScrollExtent(RecyclerView$y recyclerView$y) {
        return this.computeScrollExtent(recyclerView$y);
    }

    public final int computeHorizontalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.computeScrollOffset(recyclerView$y);
    }

    public final int computeHorizontalScrollRange(RecyclerView$y recyclerView$y) {
        return this.computeScrollRange(recyclerView$y);
    }

    public final int computeScrollExtent(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0;
        }
        t t3 = this.c;
        n3 = (int)(this.v ? 1 : 0);
        boolean bl2 = n3 ^ 1;
        View view = this.e(bl2);
        View view2 = this.d((n3 ^= 1) != 0);
        boolean bl3 = this.v;
        return androidx.recyclerview.widget.w.a(recyclerView$y, t3, view, view2, this, bl3);
    }

    public final int computeScrollOffset(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0;
        }
        t t3 = this.c;
        n3 = (int)(this.v ? 1 : 0);
        boolean bl2 = n3 ^ 1;
        View view = this.e(bl2);
        View view2 = this.d((n3 ^= 1) != 0);
        boolean bl3 = this.v;
        boolean bl4 = this.i;
        return androidx.recyclerview.widget.w.b(recyclerView$y, t3, view, view2, this, bl3, bl4);
    }

    public final int computeScrollRange(RecyclerView$y recyclerView$y) {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            return 0;
        }
        t t3 = this.c;
        n3 = (int)(this.v ? 1 : 0);
        boolean bl2 = n3 ^ 1;
        View view = this.e(bl2);
        View view2 = this.d((n3 ^= 1) != 0);
        boolean bl3 = this.v;
        return androidx.recyclerview.widget.w.c(recyclerView$y, t3, view, view2, this, bl3);
    }

    public final PointF computeScrollVectorForPosition(int n3) {
        n3 = this.a(n3);
        PointF pointF = new PointF();
        if (n3 == 0) {
            return null;
        }
        int n4 = this.e;
        if (n4 == 0) {
            float f5;
            pointF.x = f5 = (float)n3;
            pointF.y = 0.0f;
        } else {
            float f6;
            pointF.x = 0.0f;
            pointF.y = f6 = (float)n3;
        }
        return pointF;
    }

    public final int computeVerticalScrollExtent(RecyclerView$y recyclerView$y) {
        return this.computeScrollExtent(recyclerView$y);
    }

    public final int computeVerticalScrollOffset(RecyclerView$y recyclerView$y) {
        return this.computeScrollOffset(recyclerView$y);
    }

    public final int computeVerticalScrollRange(RecyclerView$y recyclerView$y) {
        return this.computeScrollRange(recyclerView$y);
    }

    public final View d(boolean bl2) {
        t t3 = this.c;
        int n3 = t3.k();
        t t4 = this.c;
        int n4 = t4.g();
        View view = null;
        for (int i3 = this.getChildCount() + -1; i3 >= 0; i3 += -1) {
            View view2 = this.getChildAt(i3);
            t t7 = this.c;
            int n7 = t7.e(view2);
            t t9 = this.c;
            int n8 = t9.b(view2);
            if (n8 <= n3 || n7 >= n4) continue;
            if (n8 > n4 && bl2) {
                if (view != null) continue;
                view = view2;
                continue;
            }
            return view2;
        }
        return view;
    }

    public final View e(boolean bl2) {
        t t3 = this.c;
        int n3 = t3.k();
        t t4 = this.c;
        int n4 = t4.g();
        int n7 = this.getChildCount();
        View view = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            View view2 = this.getChildAt(i3);
            t t7 = this.c;
            int n8 = t7.e(view2);
            t t9 = this.c;
            int n10 = t9.b(view2);
            if (n10 <= n3 || n8 >= n4) continue;
            if (n8 < n3 && bl2) {
                if (view != null) continue;
                view = view2;
                continue;
            }
            return view2;
        }
        return view;
    }

    public final void f(RecyclerView$u object, RecyclerView$y recyclerView$y, boolean bl2) {
        int n3 = -1 << -1;
        int n4 = this.j(n3);
        if (n4 == n3) {
            return;
        }
        t t3 = this.c;
        n3 = t3.g() - n4;
        if (n3 > 0) {
            n4 = -n3;
            int n7 = -this.scrollBy(n4, (RecyclerView$u)object, recyclerView$y);
            if (bl2 && (n3 -= n7) > 0) {
                object = this.c;
                ((t)object).p(n3);
            }
        }
    }

    public final void g(RecyclerView$u object, RecyclerView$y recyclerView$y, boolean bl2) {
        int n3 = -1 >>> 1;
        int n4 = this.k(n3);
        if (n4 == n3) {
            return;
        }
        t t3 = this.c;
        n3 = t3.k();
        if ((n4 -= n3) > 0) {
            int n7 = this.scrollBy(n4, (RecyclerView$u)object, recyclerView$y);
            if (bl2 && (n4 -= n7) > 0) {
                object = this.c;
                int n8 = -n4;
                ((t)object).p(n8);
            }
        }
    }

    public final RecyclerView$LayoutParams generateDefaultLayoutParams() {
        int n3 = this.e;
        int n4 = -1;
        int n7 = -2;
        if (n3 == 0) {
            StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = new RecyclerView$LayoutParams(n7, n4);
            return staggeredGridLayoutManager$LayoutParams;
        }
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = new RecyclerView$LayoutParams(n4, n7);
        return staggeredGridLayoutManager$LayoutParams;
    }

    public final RecyclerView$LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = new StaggeredGridLayoutManager$LayoutParams(context, attributeSet);
        return staggeredGridLayoutManager$LayoutParams;
    }

    public final RecyclerView$LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = new RecyclerView$LayoutParams((ViewGroup.MarginLayoutParams)layoutParams);
            return staggeredGridLayoutManager$LayoutParams;
        }
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = new RecyclerView$LayoutParams(layoutParams);
        return staggeredGridLayoutManager$LayoutParams;
    }

    public final int getColumnCountForAccessibility(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3 = this.e;
        int n4 = 1;
        if (n3 == n4) {
            n3 = this.a;
            int n7 = recyclerView$y.b();
            return Math.min(n3, n7);
        }
        return -1;
    }

    public final int getRowCountForAccessibility(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        int n3 = this.e;
        if (n3 == 0) {
            n3 = this.a;
            int n4 = recyclerView$y.b();
            return Math.min(n3, n4);
        }
        return -1;
    }

    public final int h() {
        int n3 = this.getChildCount();
        int n4 = 0;
        if (n3 != 0) {
            View view = this.getChildAt(0);
            n4 = this.getPosition(view);
        }
        return n4;
    }

    public final int i() {
        int n3 = this.getChildCount();
        if (n3 == 0) {
            n3 = 0;
            Object var2_2 = null;
        } else {
            View view = this.getChildAt(n3 += -1);
            n3 = this.getPosition(view);
        }
        return n3;
    }

    public final boolean isAutoMeasureEnabled() {
        int n3 = this.n;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isLayoutRTL() {
        int n3;
        int n4 = this.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final boolean isLayoutReversed() {
        return this.h;
    }

    public final int j(int n3) {
        int n4;
        StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = this.b[0];
        int n7 = staggeredGridLayoutManager$b.h(n3);
        for (int i3 = 1; i3 < (n4 = this.a); ++i3) {
            StaggeredGridLayoutManager$b staggeredGridLayoutManager$b2 = this.b[i3];
            n4 = staggeredGridLayoutManager$b2.h(n3);
            if (n4 <= n7) continue;
            n7 = n4;
        }
        return n7;
    }

    public final int k(int n3) {
        int n4;
        StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = this.b[0];
        int n7 = staggeredGridLayoutManager$b.j(n3);
        for (int i3 = 1; i3 < (n4 = this.a); ++i3) {
            StaggeredGridLayoutManager$b staggeredGridLayoutManager$b2 = this.b[i3];
            n4 = staggeredGridLayoutManager$b2.j(n3);
            if (n4 >= n7) continue;
            n7 = n4;
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(int n3, int n4, int n7) {
        int n8;
        int n10;
        int n14;
        block10: {
            StaggeredGridLayoutManager$LazySpanLookup staggeredGridLayoutManager$LazySpanLookup;
            block9: {
                int n15;
                block8: {
                    block7: {
                        block5: {
                            block6: {
                                n14 = this.i;
                                n14 = n14 != 0 ? this.i() : this.h();
                                n15 = 8;
                                if (n7 != n15) break block5;
                                if (n3 >= n4) break block6;
                                n10 = n4 + 1;
                                break block7;
                            }
                            n10 = n3 + 1;
                            n8 = n4;
                            break block8;
                        }
                        n10 = n3 + n4;
                    }
                    n8 = n3;
                }
                staggeredGridLayoutManager$LazySpanLookup = this.m;
                staggeredGridLayoutManager$LazySpanLookup.g(n8);
                int n16 = 1;
                if (n7 == n16) break block9;
                int n17 = 2;
                if (n7 != n17) {
                    if (n7 == n15) {
                        staggeredGridLayoutManager$LazySpanLookup.i(n3, n16);
                        staggeredGridLayoutManager$LazySpanLookup.h(n4, n16);
                    }
                    break block10;
                } else {
                    staggeredGridLayoutManager$LazySpanLookup.i(n3, n4);
                }
                break block10;
            }
            staggeredGridLayoutManager$LazySpanLookup.h(n3, n4);
        }
        if (n10 <= n14) {
            return;
        }
        n3 = (int)(this.i ? 1 : 0);
        n3 = n3 != 0 ? this.h() : this.i();
        if (n8 <= n3) {
            this.requestLayout();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final View m() {
        var1_1 = this.getChildCount();
        var2_2 = var1_1 + -1;
        var4_4 = this.a;
        var3_3 = new BitSet(var4_4);
        var4_4 = this.a;
        var5_5 = 1;
        var3_3.set(0, var4_4, (boolean)var5_5);
        var4_4 = this.e;
        var6_6 = -1;
        var4_4 = var4_4 == var5_5 && (var4_4 = (int)this.isLayoutRTL()) != 0 ? 1 : -1;
        var7_7 = this.i;
        if (var7_7) {
            var1_1 = -1;
        } else {
            var2_2 = 0;
        }
        if (var2_2 < var1_1) {
            var6_6 = 1;
        }
        while (var2_2 != var1_1) {
            block24: {
                block25: {
                    var8_8 = this.getChildAt(var2_2);
                    var9_9 /* !! */  = (StaggeredGridLayoutManager$LayoutParams)var8_8.getLayoutParams();
                    var10_10 /* !! */  = var9_9 /* !! */ .a;
                    var11_11 = var10_10 /* !! */ .e;
                    if ((var11_11 = (int)var3_3.get(var11_11)) != 0) {
                        block23: {
                            var10_10 /* !! */  = var9_9 /* !! */ .a;
                            var12_12 = this.i;
                            var13_13 = -1 << -1;
                            if (var12_12 != 0) {
                                var12_12 = var10_10 /* !! */ .c;
                                if (var12_12 == var13_13) {
                                    var10_10 /* !! */ .b();
                                    var12_12 = var10_10 /* !! */ .c;
                                }
                                var14_14 = this.c;
                                var13_13 = var14_14.g();
                                if (var12_12 < var13_13) {
                                    var10_10 /* !! */  = var10_10 /* !! */ .a;
                                    var10_10 /* !! */  = (StaggeredGridLayoutManager$LayoutParams)((View)pp_0.a(var5_5, (ArrayList)var10_10 /* !! */ )).getLayoutParams();
                                    var11_11 = (int)var10_10 /* !! */ .b;
lbl38:
                                    // 2 sources

                                    while (true) {
                                        var11_11 ^= var5_5;
                                        break block23;
                                        break;
                                    }
                                }
                            } else {
                                var12_12 = var10_10 /* !! */ .b;
                                if (var12_12 == var13_13) {
                                    var10_10 /* !! */ .c();
                                    var12_12 = var10_10 /* !! */ .b;
                                }
                                var14_14 = this.c;
                                var13_13 = var14_14.k();
                                if (var12_12 > var13_13) {
                                    var10_10 /* !! */  = (StaggeredGridLayoutManager$LayoutParams)((View)var10_10 /* !! */ .a.get(0)).getLayoutParams();
                                    var11_11 = (int)var10_10 /* !! */ .b;
                                    ** continue;
                                }
                            }
                            var11_11 = 0;
                            var10_10 /* !! */  = null;
                        }
                        if (var11_11 != 0) {
                            return var8_8;
                        }
                        var10_10 /* !! */  = var9_9 /* !! */ .a;
                        var11_11 = var10_10 /* !! */ .e;
                        var3_3.clear(var11_11);
                    }
                    if ((var11_11 = (int)var9_9 /* !! */ .b) != 0 || (var11_11 = var2_2 + var6_6) == var1_1) break block24;
                    var10_10 /* !! */  = this.getChildAt(var11_11);
                    var12_12 = (int)this.i;
                    if (var12_12 == 0) break block25;
                    var15_15 = this.c;
                    var12_12 = var15_15.b(var8_8);
                    if (var12_12 < (var13_13 = (var14_14 = this.c).b((View)var10_10 /* !! */ ))) {
                        return var8_8;
                    }
                    if (var12_12 != var13_13) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                var15_15 = this.c;
                var12_12 = var15_15.e(var8_8);
                if (var12_12 > (var13_13 = (var14_14 = this.c).e((View)var10_10 /* !! */ ))) {
                    return var8_8;
                }
                if (var12_12 == var13_13) lbl-1000:
                // 2 sources

                {
                    var12_12 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var12_12 = 0;
                    var15_15 = null;
                }
                if (var12_12 != 0) {
                    var10_10 /* !! */  = (StaggeredGridLayoutManager$LayoutParams)var10_10 /* !! */ .getLayoutParams();
                    var9_9 /* !! */  = var9_9 /* !! */ .a;
                    var16_16 = var9_9 /* !! */ .e;
                    var10_10 /* !! */  = var10_10 /* !! */ .a;
                    var11_11 = var10_10 /* !! */ .e;
                    if ((var16_16 -= var11_11) < 0) {
                        var16_16 = 1;
                    } else {
                        var16_16 = 0;
                        var9_9 /* !! */  = null;
                    }
                    if (var4_4 < 0) {
                        var11_11 = 1;
                    } else {
                        var11_11 = 0;
                        var10_10 /* !! */  = null;
                    }
                    if (var16_16 != var11_11) {
                        return var8_8;
                    }
                }
            }
            var2_2 += var6_6;
        }
        return null;
    }

    public final void n(View view, int n3, int n4) {
        Rect rect = this.s;
        this.calculateItemDecorationsForChild(view, rect);
        StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        int n7 = staggeredGridLayoutManager$LayoutParams.leftMargin;
        int n8 = rect.left;
        n7 += n8;
        n8 = staggeredGridLayoutManager$LayoutParams.rightMargin;
        int n10 = rect.right;
        n3 = StaggeredGridLayoutManager.y(n3, n7, n8 += n10);
        n7 = staggeredGridLayoutManager$LayoutParams.topMargin;
        n8 = rect.top;
        n7 += n8;
        n8 = staggeredGridLayoutManager$LayoutParams.bottomMargin;
        int n14 = rect.bottom;
        n4 = StaggeredGridLayoutManager.y(n4, n7, n8 += n14);
        n14 = (int)(this.shouldMeasureChild(view, n3, n4, staggeredGridLayoutManager$LayoutParams) ? 1 : 0);
        if (n14 != 0) {
            view.measure(n3, n4);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void o(RecyclerView$u var1_1, RecyclerView$y var2_2, boolean var3_3) {
        block82: {
            block81: {
                block80: {
                    var4_4 = this;
                    var5_5 = var1_1;
                    var6_6 = var2_2;
                    var7_7 = this.q;
                    var8_8 = -1;
                    var9_9 = 0.0f / 0.0f;
                    var10_10 = this.t;
                    if ((var7_7 != null || (var11_11 = this.k) != var8_8) && (var11_11 = var2_2.b()) == 0) {
                        this.removeAndRecycleAllViews(var1_1);
                        var10_10.a();
                        return;
                    }
                    var11_11 = (int)var10_10.e;
                    var12_12 = 1;
                    if (var11_11 != 0 && (var11_11 = var4_4.k) == var8_8 && (var7_7 = var4_4.q) == null) {
                        var11_11 = 0;
                        var7_7 = null;
                    } else {
                        var11_11 = 1;
                    }
                    var13_13 = var4_4.m;
                    var14_14 = var10_10.g;
                    var15_15 = -1 << -1;
                    if (var11_11 == 0) break block80;
                    var10_10.a();
                    var16_16 = var4_4.q;
                    if (var16_16 != null) {
                        var17_17 = var16_16.c;
                        var18_18 = 0;
                        var19_19 = null;
                        if (var17_17 > 0) {
                            var20_20 /* !! */  = var4_4.a;
                            if (var17_17 == var20_20 /* !! */ ) {
                                var22_22 = 0.0f;
                                var16_16 = null;
                                for (var21_21 = 0; var21_21 < (var17_17 = var4_4.a); ++var21_21) {
                                    var4_4.b[var21_21].d();
                                    var23_23 = var4_4.q;
                                    var24_24 /* !! */  = (View)var23_23.d;
                                    var20_20 /* !! */  = (int)var24_24 /* !! */ [var21_21];
                                    if (var20_20 /* !! */  != var15_15) {
                                        var17_17 = (int)var23_23.i;
                                        if (var17_17 != 0) {
                                            var23_23 = var4_4.c;
                                            var17_17 = var23_23.g();
lbl44:
                                            // 2 sources

                                            while (true) {
                                                var20_20 /* !! */  += var17_17;
                                                break;
                                            }
                                        } else {
                                            var23_23 = var4_4.c;
                                            var17_17 = var23_23.k();
                                            ** continue;
                                        }
                                    }
                                    var23_23 = var4_4.b[var21_21];
                                    var23_23.b = var20_20 /* !! */ ;
                                    var23_23.c = var20_20 /* !! */ ;
                                }
                            } else {
                                var16_16.d = null;
                                var16_16.c = 0;
                                var16_16.e = 0;
                                var16_16.f = null;
                                var16_16.g = null;
                                var16_16.a = var17_17 = var16_16.b;
                            }
                        }
                        var16_16 = var4_4.q;
                        var17_17 = (int)var16_16.j;
                        var4_4.p = var17_17;
                        var21_21 = (int)var16_16.h;
                        var4_4.assertNotInLayoutOrScroll(null);
                        var23_23 = var4_4.q;
                        if (var23_23 != null && (var18_18 = (int)var23_23.h) != var21_21) {
                            var23_23.h = var21_21;
                        }
                        var4_4.h = var21_21;
                        this.requestLayout();
                        this.resolveShouldLayoutReverse();
                        var16_16 = var4_4.q;
                        var17_17 = var16_16.a;
                        if (var17_17 != var8_8) {
                            var4_4.k = var17_17;
                            var17_17 = (int)var16_16.i;
                            var10_10.c = var17_17;
                        } else {
                            var17_17 = (int)var4_4.i;
                            var10_10.c = var17_17;
                        }
                        var17_17 = var16_16.e;
                        if (var17_17 > var12_12) {
                            var23_23 = var16_16.f;
                            var13_13.a = (int[])var23_23;
                            var13_13.b = var16_16 = var16_16.g;
                        }
                    } else {
                        this.resolveShouldLayoutReverse();
                        var21_21 = (int)var4_4.i;
                        var10_10.c = var21_21;
                    }
                    if ((var21_21 = (int)var6_6.g) != 0 || (var21_21 = var4_4.k) == var8_8) ** GOTO lbl178
                    if (var21_21 >= 0 && var21_21 < (var17_17 = var2_2.b())) {
                        var16_16 = var4_4.q;
                        if (var16_16 != null && (var17_17 = var16_16.a) != var8_8 && (var21_21 = var16_16.c) >= var12_12) {
                            var10_10.b = var15_15;
                            var10_10.a = var21_21 = var4_4.k;
                        } else {
                            var21_21 = var4_4.k;
                            var16_16 = var4_4.findViewByPosition(var21_21);
                            if (var16_16 != null) {
                                var17_17 = (int)var4_4.i;
                                var17_17 = var17_17 != 0 ? this.i() : this.h();
                                var10_10.a = var17_17;
                                var17_17 = var4_4.l;
                                if (var17_17 != var15_15) {
                                    var17_17 = (int)var10_10.c;
                                    if (var17_17 != 0) {
                                        var23_23 = var4_4.c;
                                        var17_17 = var23_23.g();
                                        var18_18 = var4_4.l;
                                        var17_17 -= var18_18;
                                        var19_19 = var4_4.c;
                                        var21_21 = var19_19.b((View)var16_16);
                                        var10_10.b = var17_17 -= var21_21;
                                    } else {
                                        var23_23 = var4_4.c;
                                        var17_17 = var23_23.k();
                                        var18_18 = var4_4.l;
                                        var17_17 += var18_18;
                                        var19_19 = var4_4.c;
                                        var21_21 = var19_19.e((View)var16_16);
                                        var10_10.b = var17_17 -= var21_21;
                                    }
                                } else {
                                    var23_23 = var4_4.c;
                                    var17_17 = var23_23.c((View)var16_16);
                                    if (var17_17 > (var18_18 = (var19_19 = var4_4.c).l())) {
                                        var21_21 = (int)var10_10.c;
                                        if (var21_21 != 0) {
                                            var16_16 = var4_4.c;
                                            var21_21 = var16_16.g();
                                        } else {
                                            var16_16 = var4_4.c;
                                            var21_21 = var16_16.k();
                                        }
                                        var10_10.b = var21_21;
                                    } else {
                                        var23_23 = var4_4.c;
                                        var17_17 = var23_23.e((View)var16_16);
                                        var19_19 = var4_4.c;
                                        var18_18 = var19_19.k();
                                        if ((var17_17 -= var18_18) < 0) {
                                            var10_10.b = var21_21 = -var17_17;
                                        } else {
                                            var23_23 = var4_4.c;
                                            var17_17 = var23_23.g();
                                            var19_19 = var4_4.c;
                                            var21_21 = var19_19.b((View)var16_16);
                                            var10_10.b = (var17_17 -= var21_21) < 0 ? var17_17 : var15_15;
                                        }
                                    }
                                }
                            } else {
                                var10_10.a = var21_21 = var4_4.k;
                                var17_17 = var4_4.l;
                                if (var17_17 == var15_15) {
                                    if ((var21_21 = var4_4.a(var21_21)) == var12_12) {
                                        var21_21 = 1;
                                        var22_22 = 1.4E-45f;
                                    } else {
                                        var21_21 = 0;
                                        var22_22 = 0.0f;
                                        var16_16 = null;
                                    }
                                    var10_10.c = var21_21;
                                    if (var21_21 != 0) {
                                        var16_16 = var14_14.c;
                                        var21_21 = var16_16.g();
                                    } else {
                                        var16_16 = var14_14.c;
                                        var21_21 = var16_16.k();
                                    }
                                    var10_10.b = var21_21;
                                } else {
                                    var21_21 = (int)var10_10.c;
                                    if (var21_21 != 0) {
                                        var16_16 = var14_14.c;
                                        var10_10.b = var21_21 = var16_16.g() - var17_17;
                                    } else {
                                        var16_16 = var14_14.c;
                                        var10_10.b = var21_21 = var16_16.k() + var17_17;
                                    }
                                }
                                var10_10.d = var12_12;
                            }
                        }
                    } else {
                        block79: {
                            var4_4.k = var8_8;
                            var4_4.l = var15_15;
lbl178:
                            // 2 sources

                            if ((var21_21 = (int)var4_4.o) != 0) {
                                var21_21 = var2_2.b();
                                for (var17_17 = this.getChildCount() - var12_12; var17_17 >= 0; var17_17 += -1) {
                                    var19_19 = var4_4.getChildAt(var17_17);
                                    var18_18 = var4_4.getPosition((View)var19_19);
                                    if (var18_18 < 0 || var18_18 >= var21_21) {
                                        continue;
                                    }
                                    break block79;
                                }
                                while (true) {
                                    var18_18 = 0;
                                    var19_19 = null;
                                    break block79;
                                    break;
                                }
                            }
                            var21_21 = var2_2.b();
                            var17_17 = this.getChildCount();
                            var18_18 = 0;
                            var19_19 = null;
                            while (true) {
                                if (var18_18 >= var17_17) ** continue;
                                var24_24 /* !! */  = var4_4.getChildAt(var18_18);
                                var20_20 /* !! */  = var4_4.getPosition(var24_24 /* !! */ );
                                if (var20_20 /* !! */  >= 0 && var20_20 /* !! */  < var21_21) {
                                    var18_18 = var20_20 /* !! */ ;
                                    break;
                                }
                                ++var18_18;
                            }
                        }
                        var10_10.a = var18_18;
                        var10_10.b = var15_15;
                    }
                    var10_10.e = var12_12;
                }
                if ((var16_16 = var4_4.q) == null && (var21_21 = var4_4.k) == var8_8 && ((var21_21 = (int)var10_10.c) != (var17_17 = (int)var4_4.o) || (var21_21 = (int)this.isLayoutRTL()) != (var17_17 = (int)var4_4.p))) {
                    var13_13.b();
                    var10_10.d = var12_12;
                }
                if ((var25_25 = this.getChildCount()) > 0 && ((var13_13 = var4_4.q) == null || (var25_25 = var13_13.c) < var12_12)) {
                    var25_25 = (int)var10_10.d;
                    if (var25_25 != 0) {
                        var7_7 = null;
                        for (var11_11 = 0; var11_11 < (var25_25 = var4_4.a); ++var11_11) {
                            var13_13 = var4_4.b[var11_11];
                            var13_13.d();
                            var25_25 = var10_10.b;
                            if (var25_25 == var15_15) continue;
                            var14_14 = var4_4.b[var11_11];
                            var14_14.b = var25_25;
                            var14_14.c = var25_25;
                        }
                    } else if (var11_11 == 0 && (var7_7 = (Object)var10_10.f) != null) {
                        var7_7 = null;
                        for (var11_11 = 0; var11_11 < (var25_25 = var4_4.a); ++var11_11) {
                            var13_13 = var4_4.b[var11_11];
                            var13_13.d();
                            var14_14 = var10_10.f;
                            var13_13.b = var26_26 /* !! */  = (int)var14_14[var11_11];
                            var13_13.c = var26_26 /* !! */ ;
                        }
                    } else {
                        var7_7 = null;
                        for (var11_11 = 0; var11_11 < (var25_25 = var4_4.a); ++var11_11) {
                            var13_13 = var4_4.b[var11_11];
                            var21_21 = (int)var4_4.i;
                            var17_17 = var10_10.b;
                            var18_18 = var21_21 != 0 ? var13_13.h(var15_15) : var13_13.j(var15_15);
                            var13_13.d();
                            if (var18_18 == var15_15) continue;
                            var24_24 /* !! */  = var13_13.f;
                            if (var21_21 != 0 && var18_18 < (var28_28 = (var27_27 = var24_24 /* !! */ .c).g()) || var21_21 == 0 && var18_18 > (var21_21 = (var16_16 = var24_24 /* !! */ .c).k())) continue;
                            if (var17_17 != var15_15) {
                                var18_18 += var17_17;
                            }
                            var13_13.c = var18_18;
                            var13_13.b = var18_18;
                        }
                        var7_7 = var4_4.b;
                        var25_25 = ((StaggeredGridLayoutManager$b[])var7_7).length;
                        var16_16 = var10_10.f;
                        if (var16_16 == null || (var21_21 = ((Object)var16_16).length) < var25_25) {
                            var26_26 /* !! */  = var14_14.b.length;
                            var14_14 = new int[var26_26 /* !! */ ];
                            var10_10.f = (int[])var14_14;
                        }
                        var29_29 = 0.0f;
                        var14_14 = null;
                        for (var26_26 /* !! */  = 0; var26_26 /* !! */  < var25_25; ++var26_26 /* !! */ ) {
                            var16_16 = var10_10.f;
                            var23_23 = var7_7[var26_26 /* !! */ ];
                            var17_17 = var23_23.j(var15_15);
                            var16_16[var26_26 /* !! */ ] = var17_17;
                        }
                    }
                }
                this.detachAndScrapAttachedViews(var1_1);
                var7_7 = var4_4.g;
                var7_7.a = false;
                var4_4.u = false;
                var13_13 = var4_4.d;
                var25_25 = var13_13.l();
                var26_26 /* !! */  = var4_4.a;
                var4_4.f = var26_26 /* !! */  = var25_25 / var26_26 /* !! */ ;
                var14_14 = var4_4.d;
                var26_26 /* !! */  = var14_14.i();
                var4_4.r = var25_25 = View.MeasureSpec.makeMeasureSpec((int)var25_25, (int)var26_26 /* !! */ );
                var25_25 = var10_10.a;
                var4_4.w(var25_25, var6_6);
                var25_25 = (int)var10_10.c;
                if (var25_25 != 0) {
                    var4_4.u(var8_8);
                    var4_4.c(var5_5, (n)var7_7, var6_6);
                    var4_4.u(var12_12);
                    var8_8 = var10_10.a;
                    var25_25 = var7_7.d;
                    var7_7.c = var8_8 += var25_25;
                    var4_4.c(var5_5, (n)var7_7, var6_6);
                } else {
                    var4_4.u(var12_12);
                    var4_4.c(var5_5, (n)var7_7, var6_6);
                    var4_4.u(var8_8);
                    var8_8 = var10_10.a;
                    var25_25 = var7_7.d;
                    var7_7.c = var8_8 += var25_25;
                    var4_4.c(var5_5, (n)var7_7, var6_6);
                }
                var7_7 = var4_4.d;
                var11_11 = var7_7.i();
                var8_8 = 0x40000000;
                var9_9 = 2.0f;
                if (var11_11 != var8_8) {
                    var11_11 = this.getChildCount();
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var13_13 = null;
                    for (var25_25 = 0; var25_25 < var11_11; ++var25_25) {
                        var16_16 = var4_4.d;
                        var14_14 = var4_4.getChildAt(var25_25);
                        var21_21 = var16_16.c((View)var14_14);
                        var22_22 = var21_21;
                        cfr_temp_0 = var22_22 - var9_9;
                        var17_17 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var17_17 < 0) continue;
                        var14_14 = (StaggeredGridLayoutManager$LayoutParams)var14_14.getLayoutParams();
                        var26_26 /* !! */  = (int)var14_14.b;
                        if (var26_26 /* !! */  != 0) {
                            var22_22 *= 1.0f;
                            var26_26 /* !! */  = var4_4.a;
                            var29_29 = var26_26 /* !! */ ;
                            var22_22 /= var29_29;
                        }
                        var9_9 = Math.max(var9_9, var22_22);
                    }
                    var25_25 = var4_4.f;
                    var29_29 = var4_4.a;
                    var8_8 = Math.round(var9_9 *= var29_29);
                    var14_14 = var4_4.d;
                    var26_26 /* !! */  = var14_14.i();
                    if (var26_26 /* !! */  == var15_15) {
                        var14_14 = var4_4.d;
                        var26_26 /* !! */  = var14_14.l();
                        var8_8 = Math.min(var8_8, var26_26 /* !! */ );
                    }
                    var26_26 /* !! */  = var4_4.a;
                    var4_4.f = var26_26 /* !! */  = var8_8 / var26_26 /* !! */ ;
                    var14_14 = var4_4.d;
                    var26_26 /* !! */  = var14_14.i();
                    var4_4.r = var8_8 = View.MeasureSpec.makeMeasureSpec((int)var8_8, (int)var26_26 /* !! */ );
                    var8_8 = var4_4.f;
                    if (var8_8 != var25_25) {
                        var9_9 = 0.0f;
                        for (var8_8 = 0; var8_8 < var11_11; ++var8_8) {
                            var14_14 = var4_4.getChildAt(var8_8);
                            var30_30 /* !! */  = (StaggeredGridLayoutManager$LayoutParams)var14_14.getLayoutParams();
                            var21_21 = (int)var30_30 /* !! */ .b;
                            if (var21_21 != 0) continue;
                            var21_21 = (int)this.isLayoutRTL();
                            if (var21_21 != 0 && (var21_21 = var4_4.e) == var12_12) {
                                var21_21 = var4_4.a - var12_12;
                                var30_30 /* !! */  = var30_30 /* !! */ .a;
                                var15_15 = var30_30 /* !! */ .e;
                                var15_15 = -(var21_21 - var15_15);
                                var21_21 = var4_4.f * var15_15;
                                var14_14.offsetLeftAndRight(var21_21 -= (var15_15 *= var25_25));
                                continue;
                            }
                            var30_30 /* !! */  = var30_30 /* !! */ .a;
                            var15_15 = var30_30 /* !! */ .e;
                            var21_21 = var4_4.f * var15_15;
                            var15_15 *= var25_25;
                            var17_17 = var4_4.e;
                            if (var17_17 == var12_12) {
                                var14_14.offsetLeftAndRight(var21_21 -= var15_15);
                                continue;
                            }
                            var14_14.offsetTopAndBottom(var21_21 -= var15_15);
                        }
                    }
                }
                var11_11 = this.getChildCount();
                if (var11_11 > 0) {
                    var11_11 = (int)var4_4.i;
                    if (var11_11 != 0) {
                        var4_4.f(var5_5, var6_6, (boolean)var12_12);
                        var4_4.g(var5_5, var6_6, false);
                    } else {
                        var4_4.g(var5_5, var6_6, (boolean)var12_12);
                        var4_4.f(var5_5, var6_6, false);
                    }
                }
                if (!var3_3 || (var11_11 = (int)var6_6.g) != 0 || (var11_11 = var4_4.n) == 0 || (var11_11 = this.getChildCount()) <= 0 || (var11_11 = (int)var4_4.u) == 0 && (var7_7 = this.m()) == null) break block81;
                var7_7 = var4_4.x;
                var4_4.removeCallbacks((Runnable)var7_7);
                var11_11 = (int)this.b();
                if (var11_11 != 0) break block82;
            }
            var12_12 = 0;
        }
        var11_11 = (int)var6_6.g;
        if (var11_11 != 0) {
            var10_10.a();
        }
        var11_11 = (int)var10_10.c;
        var4_4.o = var11_11;
        var11_11 = (int)this.isLayoutRTL();
        var4_4.p = var11_11;
        if (var12_12 != 0) {
            var10_10.a();
            var4_4.o(var5_5, var6_6, false);
        }
    }

    public final void offsetChildrenHorizontal(int n3) {
        int n4;
        super.offsetChildrenHorizontal(n3);
        for (int i3 = 0; i3 < (n4 = this.a); ++i3) {
            StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = this.b[i3];
            int n7 = staggeredGridLayoutManager$b.b;
            int n8 = -1 << -1;
            if (n7 != n8) {
                staggeredGridLayoutManager$b.b = n7 += n3;
            }
            if ((n7 = staggeredGridLayoutManager$b.c) == n8) continue;
            staggeredGridLayoutManager$b.c = n7 += n3;
        }
    }

    public final void offsetChildrenVertical(int n3) {
        int n4;
        super.offsetChildrenVertical(n3);
        for (int i3 = 0; i3 < (n4 = this.a); ++i3) {
            StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = this.b[i3];
            int n7 = staggeredGridLayoutManager$b.b;
            int n8 = -1 << -1;
            if (n7 != n8) {
                staggeredGridLayoutManager$b.b = n7 += n3;
            }
            if ((n7 = staggeredGridLayoutManager$b.c) == n8) continue;
            staggeredGridLayoutManager$b.c = n7 += n3;
        }
    }

    public final void onAdapterChanged(RecyclerView$f recyclerView$f, RecyclerView$f object) {
        int n3;
        this.m.b();
        for (int i3 = 0; i3 < (n3 = this.a); ++i3) {
            object = this.b[i3];
            ((StaggeredGridLayoutManager$b)object).d();
        }
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView$u object) {
        int n3;
        super.onDetachedFromWindow(recyclerView, (RecyclerView$u)object);
        object = this.x;
        this.removeCallbacks((Runnable)object);
        object = null;
        for (int i3 = 0; i3 < (n3 = this.a); ++i3) {
            StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = this.b[i3];
            staggeredGridLayoutManager$b.d();
        }
        recyclerView.requestLayout();
    }

    /*
     * Unable to fully structure code
     */
    public final View onFocusSearchFailed(View var1_1, int var2_2, RecyclerView$u var3_3, RecyclerView$y var4_4) {
        block28: {
            block29: {
                block35: {
                    block36: {
                        block34: {
                            block30: {
                                block31: {
                                    block32: {
                                        block33: {
                                            var5_5 = this.getChildCount();
                                            if (var5_5 == 0) {
                                                return null;
                                            }
                                            if ((var1_1 = this.findContainingItemView(var1_1)) == null) {
                                                return null;
                                            }
                                            this.resolveShouldLayoutReverse();
                                            var5_5 = -1 << -1;
                                            var6_6 = -1;
                                            var7_7 = 1;
                                            if (var2_2 == var7_7) break block29;
                                            var8_8 = 2;
                                            if (var2_2 == var8_8) break block30;
                                            var8_8 = 17;
                                            if (var2_2 == var8_8) break block31;
                                            var8_8 = 33;
                                            if (var2_2 == var8_8) break block32;
                                            var8_8 = 66;
                                            if (var2_2 == var8_8) break block33;
                                            var8_8 = 130;
                                            if (var2_2 != var8_8) lbl-1000:
                                            // 5 sources

                                            {
                                                while (true) {
                                                    var2_2 = -1 << -1;
                                                    break block28;
                                                    break;
                                                }
                                            }
                                            var2_2 = this.e;
                                            if (var2_2 != var7_7) ** GOTO lbl-1000
                                            break block34;
                                        }
                                        var2_2 = this.e;
                                        if (var2_2 != 0) ** GOTO lbl-1000
                                        break block34;
                                    }
                                    var2_2 = this.e;
                                    if (var2_2 != var7_7) ** GOTO lbl-1000
                                    break block35;
                                }
                                var2_2 = this.e;
                                if (var2_2 == 0) ** break;
                                ** while (true)
                                break block35;
                            }
                            var2_2 = this.e;
                            if (var2_2 != var7_7) break block36;
                        }
lbl44:
                        // 3 sources

                        while (true) {
                            var2_2 = 1;
                            break block28;
                            break;
                        }
                    }
                    var2_2 = (int)this.isLayoutRTL();
                    if (var2_2 == 0) ** GOTO lbl44
                }
lbl51:
                // 2 sources

                while (true) {
                    var2_2 = -1;
                    break block28;
                    break;
                }
            }
            ** while ((var2_2 = this.e) == var7_7 || (var2_2 = (int)this.isLayoutRTL()) == 0)
lbl56:
            // 1 sources

            ** while (true)
        }
        if (var2_2 == var5_5) {
            return null;
        }
        var9_9 = (StaggeredGridLayoutManager$LayoutParams)var1_1.getLayoutParams();
        var8_8 = (int)var9_9.b;
        var9_9 = var9_9.a;
        var10_10 = var2_2 == var7_7 ? this.i() : this.h();
        this.w(var10_10, (RecyclerView$y)var4_4);
        this.u(var2_2);
        var11_11 = this.g;
        var11_11.c = var12_12 = var11_11.d + var10_10;
        var13_13 = this.c.l();
        var14_14 = 0.33333334f;
        var11_11.b = var12_12 = (int)(var13_13 * var14_14);
        var11_11.h = var7_7;
        var12_12 = 0;
        var13_13 = 0.0f;
        var11_11.a = false;
        this.c(var3_3, var11_11, (RecyclerView$y)var4_4);
        this.o = var15_15 = this.i;
        if (var8_8 == 0 && (var3_3 = var9_9.i(var10_10, var2_2)) != null && var3_3 != var1_1) {
            return var3_3;
        }
        var15_15 = this.p(var2_2);
        if (var15_15 != 0) {
            for (var15_15 = this.a - var7_7; var15_15 >= 0; var15_15 += -1) {
                var4_4 = this.b[var15_15].i(var10_10, var2_2);
                if (var4_4 == null || var4_4 == var1_1) continue;
                return var4_4;
            }
        } else {
            var3_3 = null;
            for (var15_15 = 0; var15_15 < (var16_16 = this.a); ++var15_15) {
                var4_4 = this.b[var15_15].i(var10_10, var2_2);
                if (var4_4 == null || var4_4 == var1_1) continue;
                return var4_4;
            }
        }
        var15_15 = this.h ^ var7_7;
        if (var2_2 == var6_6) {
            var16_16 = 1;
        } else {
            var16_16 = 0;
            var4_4 = null;
        }
        if (var15_15 == var16_16) {
            var15_15 = 1;
        } else {
            var15_15 = 0;
            var3_3 = null;
        }
        if (var8_8 == 0 && (var4_4 = this.findViewByPosition(var16_16 = var15_15 != 0 ? var9_9.e() : var9_9.f())) != null && var4_4 != var1_1) {
            return var4_4;
        }
        if ((var2_2 = (int)this.p(var2_2)) != 0) {
            for (var2_2 = this.a - var7_7; var2_2 >= 0; var2_2 += -1) {
                var16_16 = var9_9.e;
                if (var2_2 == var16_16) continue;
                if (var15_15 != 0) {
                    var4_4 = this.b[var2_2];
                    var16_16 = var4_4.e();
                } else {
                    var4_4 = this.b[var2_2];
                    var16_16 = var4_4.f();
                }
                var4_4 = this.findViewByPosition(var16_16);
                if (var4_4 == null || var4_4 == var1_1) continue;
                return var4_4;
            }
        } else {
            while (var12_12 < (var2_2 = this.a)) {
                if (var15_15 != 0) {
                    var17_17 = this.b[var12_12];
                    var2_2 = var17_17.e();
                } else {
                    var17_17 = this.b[var12_12];
                    var2_2 = var17_17.f();
                }
                var17_17 = this.findViewByPosition(var2_2);
                if (var17_17 != null && var17_17 != var1_1) {
                    return var17_17;
                }
                ++var12_12;
            }
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int n3 = this.getChildCount();
        if (n3 > 0) {
            n3 = 0;
            View view = this.e(false);
            View view2 = this.d(false);
            if (view != null && view2 != null) {
                int n4 = this.getPosition(view);
                if (n4 < (n3 = this.getPosition(view2))) {
                    accessibilityEvent.setFromIndex(n4);
                    accessibilityEvent.setToIndex(n3);
                } else {
                    accessibilityEvent.setFromIndex(n3);
                    accessibilityEvent.setToIndex(n4);
                }
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(recyclerView$u, recyclerView$y, c2);
        c2.l("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView$u object, RecyclerView$y object2, View view, C2 c2) {
        object = view.getLayoutParams();
        int n3 = object instanceof StaggeredGridLayoutManager$LayoutParams;
        if (n3 == 0) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c2);
            return;
        }
        object = (StaggeredGridLayoutManager$LayoutParams)((Object)object);
        n3 = this.e;
        int n4 = -1;
        int n7 = 1;
        if (n3 == 0) {
            object2 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).a;
            int n8 = object2 == null ? -1 : (n4 = ((StaggeredGridLayoutManager$b)object2).e);
            boolean bl2 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).b;
            int n10 = bl2 ? (n7 = this.a) : 1;
            int n14 = -1;
            int n15 = -1;
            object = C2$f.a(n8, n10, n14, n15, false, false);
            c2.n((C2$f)object);
        } else {
            object2 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).a;
            int n16 = object2 == null ? -1 : (n4 = ((StaggeredGridLayoutManager$b)object2).e);
            boolean bl3 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).b;
            int n17 = bl3 ? (n7 = this.a) : 1;
            int n18 = -1;
            int n19 = -1;
            object = C2$f.a(n18, n19, n16, n17, false, false);
            c2.n((C2$f)object);
        }
    }

    public final void onItemsAdded(RecyclerView recyclerView, int n3, int n4) {
        this.l(n3, n4, 1);
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        this.m.b();
        this.requestLayout();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int n3, int n4, int n7) {
        this.l(n3, n4, 8);
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int n3, int n4) {
        this.l(n3, n4, 2);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int n3, int n4, Object object) {
        this.l(n3, n4, 4);
    }

    public final void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        this.o(recyclerView$u, recyclerView$y, true);
    }

    public final void onLayoutCompleted(RecyclerView$y recyclerView$y) {
        super.onLayoutCompleted(recyclerView$y);
        this.k = -1;
        this.l = -1 << -1;
        this.q = null;
        this.t.a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int n3 = parcelable instanceof StaggeredGridLayoutManager$SavedState;
        if (n3 != 0) {
            parcelable = (StaggeredGridLayoutManager$SavedState)parcelable;
            this.q = parcelable;
            n3 = this.k;
            int n4 = -1;
            if (n3 != n4) {
                n3 = 0;
                parcelable.d = null;
                parcelable.c = 0;
                parcelable.a = n4;
                parcelable.b = n4;
                parcelable.d = null;
                parcelable.c = 0;
                parcelable.e = 0;
                parcelable.f = null;
                parcelable.g = null;
            }
            this.requestLayout();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Parcelable onSaveInstanceState() {
        int n3;
        Object object;
        int n4;
        Object object2 = this.q;
        if (object2 != null) {
            int[] nArray;
            int n7;
            StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = new Object();
            staggeredGridLayoutManager$SavedState.c = n7 = ((StaggeredGridLayoutManager$SavedState)object2).c;
            staggeredGridLayoutManager$SavedState.a = n7 = ((StaggeredGridLayoutManager$SavedState)object2).a;
            staggeredGridLayoutManager$SavedState.b = n7 = ((StaggeredGridLayoutManager$SavedState)object2).b;
            staggeredGridLayoutManager$SavedState.d = nArray = ((StaggeredGridLayoutManager$SavedState)object2).d;
            staggeredGridLayoutManager$SavedState.e = n7 = ((StaggeredGridLayoutManager$SavedState)object2).e;
            nArray = ((StaggeredGridLayoutManager$SavedState)object2).f;
            staggeredGridLayoutManager$SavedState.f = nArray;
            n7 = (int)(((StaggeredGridLayoutManager$SavedState)object2).h ? 1 : 0);
            staggeredGridLayoutManager$SavedState.h = n7;
            n7 = (int)(((StaggeredGridLayoutManager$SavedState)object2).i ? 1 : 0);
            staggeredGridLayoutManager$SavedState.i = n7;
            n7 = (int)(((StaggeredGridLayoutManager$SavedState)object2).j ? 1 : 0);
            staggeredGridLayoutManager$SavedState.j = n7;
            staggeredGridLayoutManager$SavedState.g = object2 = ((StaggeredGridLayoutManager$SavedState)object2).g;
            return staggeredGridLayoutManager$SavedState;
        }
        object2 = new StaggeredGridLayoutManager$SavedState();
        ((StaggeredGridLayoutManager$SavedState)object2).h = n4 = this.h;
        ((StaggeredGridLayoutManager$SavedState)object2).i = n4 = this.o;
        ((StaggeredGridLayoutManager$SavedState)object2).j = n4 = this.p;
        n4 = 0;
        Object var2_3 = null;
        Object object3 = this.m;
        if (object3 != null && (object = ((StaggeredGridLayoutManager$LazySpanLookup)object3).a) != null) {
            ((StaggeredGridLayoutManager$SavedState)object2).f = object;
            ((StaggeredGridLayoutManager$SavedState)object2).e = n3 = ((int[])object).length;
            ((StaggeredGridLayoutManager$SavedState)object2).g = object3 = ((StaggeredGridLayoutManager$LazySpanLookup)object3).b;
        } else {
            ((StaggeredGridLayoutManager$SavedState)object2).e = 0;
        }
        int n8 = this.getChildCount();
        n3 = -1;
        if (n8 <= 0) {
            ((StaggeredGridLayoutManager$SavedState)object2).a = n3;
            ((StaggeredGridLayoutManager$SavedState)object2).b = n3;
            ((StaggeredGridLayoutManager$SavedState)object2).c = 0;
            return object2;
        }
        n8 = (int)(this.o ? 1 : 0);
        n8 = n8 != 0 ? this.i() : this.h();
        ((StaggeredGridLayoutManager$SavedState)object2).a = n8;
        n8 = (int)(this.i ? 1 : 0);
        boolean bl2 = true;
        object3 = n8 != 0 ? this.d(bl2) : this.e(bl2);
        if (object3 != null) {
            n3 = this.getPosition((View)object3);
        }
        ((StaggeredGridLayoutManager$SavedState)object2).b = n3;
        ((StaggeredGridLayoutManager$SavedState)object2).c = n8 = this.a;
        object3 = new int[n8];
        ((StaggeredGridLayoutManager$SavedState)object2).d = (int[])object3;
        while (n4 < (n8 = this.a)) {
            block11: {
                block12: {
                    block10: {
                        n8 = (int)(this.o ? 1 : 0);
                        n3 = -1 << -1;
                        if (n8 == 0) break block10;
                        object3 = this.b[n4];
                        n8 = ((StaggeredGridLayoutManager$b)object3).h(n3);
                        if (n8 == n3) break block11;
                        object = this.c;
                        n3 = ((t)object).g();
                        break block12;
                    }
                    object3 = this.b[n4];
                    n8 = ((StaggeredGridLayoutManager$b)object3).j(n3);
                    if (n8 == n3) break block11;
                    object = this.c;
                    n3 = ((t)object).k();
                }
                n8 -= n3;
            }
            object = ((StaggeredGridLayoutManager$SavedState)object2).d;
            object[n4] = n8;
            ++n4;
        }
        return object2;
    }

    public final void onScrollStateChanged(int n3) {
        if (n3 == 0) {
            this.b();
        }
    }

    public final boolean p(int n3) {
        int n4 = this.e;
        int n7 = -1;
        boolean bl2 = false;
        if (n4 == 0) {
            if ((n3 = n3 == n7 ? 1 : 0) != (n4 = (int)(this.i ? 1 : 0))) {
                bl2 = true;
            }
            return bl2;
        }
        n3 = n3 == n7 ? 1 : 0;
        n4 = (int)(this.i ? 1 : 0);
        if ((n3 = n3 == n4 ? 1 : 0) == (n4 = (int)(this.isLayoutRTL() ? 1 : 0))) {
            bl2 = true;
        }
        return bl2;
    }

    public final void q(int n3, RecyclerView$y recyclerView$y) {
        int n4;
        int n7;
        boolean bl2 = true;
        if (n3 > 0) {
            n7 = this.i();
            n4 = 1;
        } else {
            n7 = this.h();
            n4 = -1;
        }
        n n8 = this.g;
        n8.a = bl2;
        this.w(n7, recyclerView$y);
        this.u(n4);
        int n10 = n8.d;
        n8.c = n7 += n10;
        n8.b = n3 = Math.abs(n3);
    }

    public final void r(RecyclerView$u recyclerView$u, n n3) {
        int n4 = n3.a;
        if (n4 != 0 && (n4 = n3.i) == 0) {
            n4 = n3.b;
            int n7 = -1;
            if (n4 == 0) {
                n4 = n3.e;
                if (n4 == n7) {
                    int n8 = n3.g;
                    this.s(recyclerView$u, n8);
                } else {
                    int n10 = n3.f;
                    this.t(recyclerView$u, n10);
                }
            } else {
                int n14;
                n4 = n3.e;
                int n15 = 0;
                StaggeredGridLayoutManager$b staggeredGridLayoutManager$b = null;
                if (n4 == n7) {
                    int n16;
                    n4 = n3.f;
                    StaggeredGridLayoutManager$b staggeredGridLayoutManager$b2 = this.b[0];
                    n7 = staggeredGridLayoutManager$b2.j(n4);
                    for (n14 = 1; n14 < (n15 = this.a); ++n14) {
                        staggeredGridLayoutManager$b = this.b[n14];
                        n15 = staggeredGridLayoutManager$b.j(n4);
                        if (n15 <= n7) continue;
                        n7 = n15;
                    }
                    if ((n4 -= n7) < 0) {
                        n16 = n3.g;
                    } else {
                        n7 = n3.g;
                        n16 = n3.b;
                        n16 = Math.min(n4, n16);
                        n16 = n7 - n16;
                    }
                    this.s(recyclerView$u, n16);
                } else {
                    int n17;
                    n4 = n3.g;
                    StaggeredGridLayoutManager$b staggeredGridLayoutManager$b3 = this.b[0];
                    n7 = staggeredGridLayoutManager$b3.h(n4);
                    while (n14 < (n15 = this.a)) {
                        staggeredGridLayoutManager$b = this.b[n14];
                        n15 = staggeredGridLayoutManager$b.h(n4);
                        if (n15 < n7) {
                            n7 = n15;
                        }
                        ++n14;
                    }
                    n4 = n3.g;
                    if ((n7 -= n4) < 0) {
                        n17 = n3.f;
                    } else {
                        n4 = n3.f;
                        n17 = n3.b;
                        n17 = Math.min(n7, n17) + n4;
                    }
                    this.t(recyclerView$u, n17);
                }
            }
        }
    }

    public final void resolveShouldLayoutReverse() {
        int n3 = this.e;
        int n4 = 1;
        if (n3 != n4 && (n3 = (int)(this.isLayoutRTL() ? 1 : 0)) != 0) {
            n3 = this.h ^ n4;
            this.i = n3;
        } else {
            n3 = (int)(this.h ? 1 : 0);
            this.i = n3;
        }
    }

    public final void s(RecyclerView$u recyclerView$u, int n3) {
        View view;
        Object object;
        int n4;
        int n7 = this.getChildCount();
        int n8 = 1;
        n7 -= n8;
        while (n7 >= 0 && (n4 = ((t)(object = this.c)).e(view = this.getChildAt(n7))) >= n3 && (n4 = ((t)(object = this.c)).o(view)) >= n3) {
            Object object2;
            object = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
            int n10 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).b;
            if (n10 != 0) {
                int n14;
                n4 = 0;
                object = null;
                object2 = null;
                for (n10 = 0; n10 < (n14 = this.a); ++n10) {
                    ArrayList arrayList = this.b[n10].a;
                    n14 = arrayList.size();
                    if (n14 != n8) continue;
                    return;
                }
                while (n4 < (n10 = this.a)) {
                    object2 = this.b[n4];
                    ((StaggeredGridLayoutManager$b)object2).k();
                    ++n4;
                }
            } else {
                object2 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).a.a;
                n10 = ((ArrayList)object2).size();
                if (n10 == n8) {
                    return;
                }
                object = ((StaggeredGridLayoutManager$LayoutParams)((Object)object)).a;
                ((StaggeredGridLayoutManager$b)object).k();
            }
            this.removeAndRecycleView(view, recyclerView$u);
            n7 += -1;
        }
    }

    public final int scrollBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y object) {
        int n4 = this.getChildCount();
        if (n4 != 0 && n3 != 0) {
            this.q(n3, (RecyclerView$y)object);
            n n7 = this.g;
            int n8 = this.c(recyclerView$u, n7, (RecyclerView$y)object);
            int n10 = n7.b;
            if (n10 >= n8) {
                n3 = n3 < 0 ? -n8 : n8;
            }
            object = this.c;
            n10 = -n3;
            ((t)object).p(n10);
            n8 = (int)(this.i ? 1 : 0);
            this.o = n8;
            n7.b = 0;
            this.r(recyclerView$u, n7);
            return n3;
        }
        return 0;
    }

    public final int scrollHorizontallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return this.scrollBy(n3, recyclerView$u, recyclerView$y);
    }

    public final void scrollToPosition(int n3) {
        int n4;
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = this.q;
        if (staggeredGridLayoutManager$SavedState != null && (n4 = staggeredGridLayoutManager$SavedState.a) != n3) {
            staggeredGridLayoutManager$SavedState.d = null;
            staggeredGridLayoutManager$SavedState.c = 0;
            staggeredGridLayoutManager$SavedState.a = n4 = -1;
            staggeredGridLayoutManager$SavedState.b = n4;
        }
        this.k = n3;
        this.l = -1 << -1;
        this.requestLayout();
    }

    public final int scrollVerticallyBy(int n3, RecyclerView$u recyclerView$u, RecyclerView$y recyclerView$y) {
        return this.scrollBy(n3, recyclerView$u, recyclerView$y);
    }

    public final void setMeasuredDimension(Rect rect, int n3, int n4) {
        int n7;
        int n8 = this.getPaddingLeft();
        int n10 = this.getPaddingRight() + n8;
        n8 = this.getPaddingTop();
        int n14 = this.getPaddingBottom() + n8;
        n8 = this.e;
        int n15 = 1;
        if (n8 == n15) {
            n7 = rect.height() + n14;
            n8 = this.getMinimumHeight();
            n7 = RecyclerView$o.chooseSize(n4, n7, n8);
            n4 = this.f;
            n8 = this.a;
            n4 = n4 * n8 + n10;
            n8 = this.getMinimumWidth();
            n3 = RecyclerView$o.chooseSize(n3, n4, n8);
        } else {
            n7 = rect.width() + n10;
            n8 = this.getMinimumWidth();
            n3 = RecyclerView$o.chooseSize(n3, n7, n8);
            n7 = this.f;
            n8 = this.a;
            n7 = n7 * n8 + n14;
            n8 = this.getMinimumHeight();
            n7 = RecyclerView$o.chooseSize(n4, n7, n8);
        }
        this.setMeasuredDimension(n3, n7);
    }

    public final void setSpanCount(int n3) {
        StaggeredGridLayoutManager$b[] staggeredGridLayoutManager$bArray = null;
        this.assertNotInLayoutOrScroll(null);
        int n4 = this.a;
        if (n3 != n4) {
            staggeredGridLayoutManager$bArray = this.m;
            staggeredGridLayoutManager$bArray.b();
            this.requestLayout();
            n4 = this.a = n3;
            StaggeredGridLayoutManager$b[] staggeredGridLayoutManager$bArray2 = new BitSet(n4);
            this.j = staggeredGridLayoutManager$bArray2;
            staggeredGridLayoutManager$bArray2 = new StaggeredGridLayoutManager$b[this.a];
            this.b = staggeredGridLayoutManager$bArray2;
            staggeredGridLayoutManager$bArray2 = null;
            for (n3 = 0; n3 < (n4 = this.a); ++n3) {
                StaggeredGridLayoutManager$b staggeredGridLayoutManager$b;
                staggeredGridLayoutManager$bArray = this.b;
                staggeredGridLayoutManager$bArray[n3] = staggeredGridLayoutManager$b = new StaggeredGridLayoutManager$b(this, n3);
            }
            this.requestLayout();
        }
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$y object, int n3) {
        recyclerView = recyclerView.getContext();
        object = new o((Context)recyclerView);
        ((RecyclerView$x)object).setTargetPosition(n3);
        this.startSmoothScroll((RecyclerView$x)object);
    }

    public final boolean supportsPredictiveItemAnimations() {
        boolean bl2;
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = this.q;
        if (staggeredGridLayoutManager$SavedState == null) {
            bl2 = true;
        } else {
            bl2 = false;
            staggeredGridLayoutManager$SavedState = null;
        }
        return bl2;
    }

    public final void t(RecyclerView$u recyclerView$u, int n3) {
        int n4;
        while ((n4 = this.getChildCount()) > 0) {
            n4 = 0;
            Object object = null;
            Object object2 = this.c;
            View view = this.getChildAt(0);
            int n7 = ((t)object2).b(view);
            if (n7 > n3 || (n7 = ((t)(object2 = this.c)).n(view)) > n3) break;
            object2 = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
            int n8 = ((StaggeredGridLayoutManager$LayoutParams)((Object)object2)).b;
            int n10 = 1;
            if (n8 != 0) {
                object2 = null;
                for (n7 = 0; n7 < (n8 = this.a); ++n7) {
                    ArrayList arrayList = this.b[n7].a;
                    n8 = arrayList.size();
                    if (n8 != n10) continue;
                    return;
                }
                while (n4 < (n7 = this.a)) {
                    object2 = this.b[n4];
                    ((StaggeredGridLayoutManager$b)object2).l();
                    ++n4;
                }
            } else {
                object = ((StaggeredGridLayoutManager$LayoutParams)((Object)object2)).a.a;
                n4 = ((ArrayList)object).size();
                if (n4 == n10) {
                    return;
                }
                object = ((StaggeredGridLayoutManager$LayoutParams)((Object)object2)).a;
                ((StaggeredGridLayoutManager$b)object).l();
            }
            this.removeAndRecycleView(view, recyclerView$u);
        }
    }

    public final void u(int n3) {
        n n4 = this.g;
        n4.e = n3;
        int n7 = this.i;
        int n8 = 1;
        int n10 = -1;
        if (n7 != (n3 = n3 == n10 ? 1 : 0)) {
            n8 = -1;
        }
        n4.d = n8;
    }

    public final void v(int n3, int n4) {
        int n7;
        for (int i3 = 0; i3 < (n7 = this.a); ++i3) {
            Object object = this.b[i3].a;
            n7 = (int)(((ArrayList)object).isEmpty() ? 1 : 0);
            if (n7 != 0) continue;
            object = this.b[i3];
            this.x((StaggeredGridLayoutManager$b)object, n3, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(int n3, RecyclerView$y object) {
        t t3;
        int n4;
        boolean bl2;
        int n7;
        boolean bl3;
        block8: {
            block7: {
                block5: {
                    block6: {
                        n n8 = this.g;
                        bl3 = false;
                        n8.b = 0;
                        n8.c = n3;
                        n7 = this.isSmoothScrolling();
                        bl2 = true;
                        if (n7 == 0 || (n4 = ((RecyclerView$y)object).a) == (n7 = -1)) break block5;
                        n7 = (int)(this.i ? 1 : 0);
                        if (n4 < n3) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            t3 = null;
                        }
                        if (n7 != n3) break block6;
                        t3 = this.c;
                        n3 = t3.l();
                        break block7;
                    }
                    n4 = this.c.l();
                    n3 = 0;
                    t3 = null;
                    break block8;
                }
                n3 = 0;
                t3 = null;
            }
            n4 = 0;
            object = null;
        }
        n7 = (int)(this.getClipToPadding() ? 1 : 0);
        if (n7 != 0) {
            t t4 = this.c;
            n8.f = n7 = t4.k() - n4;
            object = this.c;
            n8.g = n4 = ((t)object).g() + n3;
        } else {
            t t7 = this.c;
            n8.g = n7 = t7.f() + n3;
            n8.f = n3 = -n4;
        }
        n8.h = false;
        n8.a = bl2;
        t3 = this.c;
        n3 = t3.i();
        if (n3 == 0 && (n3 = (t3 = this.c).f()) == 0) {
            bl3 = true;
        }
        n8.i = bl3;
    }

    public final void x(StaggeredGridLayoutManager$b object, int n3, int n4) {
        int n7 = ((StaggeredGridLayoutManager$b)object).d;
        int n8 = -1 << -1;
        int n10 = -1;
        int n14 = ((StaggeredGridLayoutManager$b)object).e;
        if (n3 == n10) {
            n3 = ((StaggeredGridLayoutManager$b)object).b;
            if (n3 == n8) {
                ((StaggeredGridLayoutManager$b)object).c();
                n3 = ((StaggeredGridLayoutManager$b)object).b;
            }
            if ((n3 += n7) <= n4) {
                object = this.j;
                ((BitSet)object).set(n14, false);
            }
        } else {
            n3 = ((StaggeredGridLayoutManager$b)object).c;
            if (n3 == n8) {
                ((StaggeredGridLayoutManager$b)object).b();
                n3 = ((StaggeredGridLayoutManager$b)object).c;
            }
            if ((n3 -= n7) >= n4) {
                object = this.j;
                ((BitSet)object).set(n14, false);
            }
        }
    }
}

