/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.d$a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public final class d
extends RecyclerView$s {
    public ViewPager2$g a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final d$a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public d(ViewPager2 object) {
        this.b = object;
        object = object.j;
        this.c = object;
        object = (LinearLayoutManager)object.getLayoutManager();
        this.d = object;
        this.g = object;
        this.c();
    }

    public final void a(int n3) {
        ViewPager2$g viewPager2$g = this.a;
        if (viewPager2$g != null) {
            viewPager2$g.onPageSelected(n3);
        }
    }

    public final void b(int n3) {
        int n4 = this.e;
        int n7 = 3;
        if (n4 == n7 && (n4 = this.f) == 0) {
            return;
        }
        n4 = this.f;
        if (n4 == n3) {
            return;
        }
        this.f = n3;
        ViewPager2$g viewPager2$g = this.a;
        if (viewPager2$g != null) {
            viewPager2$g.onPageScrollStateChanged(n3);
        }
    }

    public final void c() {
        int n3;
        this.e = 0;
        this.f = 0;
        d$a d$a = this.g;
        d$a.a = n3 = -1;
        d$a.b = 0.0f;
        d$a.c = 0;
        this.h = n3;
        this.i = n3;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void d(boolean n3) {
        this.m = n3;
        int n4 = 1;
        n3 = n3 != 0 ? 4 : 1;
        this.e = n3;
        n3 = this.i;
        int n7 = -1;
        if (n3 != n7) {
            this.h = n3;
            this.i = n7;
        } else {
            n3 = this.h;
            if (n3 == n7) {
                LinearLayoutManager linearLayoutManager = this.d;
                this.h = n3 = linearLayoutManager.findFirstVisibleItemPosition();
            }
        }
        this.b(n4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e() {
        d$a d$a;
        Object object;
        block27: {
            int n3;
            block23: {
                int n4;
                int n7;
                block25: {
                    int n8;
                    Object object2;
                    Object object3;
                    void var5_23;
                    void var10_47;
                    int n10;
                    Object object4;
                    int n14;
                    int n15;
                    float f5;
                    block26: {
                        void var2_9;
                        block24: {
                            void var2_8;
                            int n16;
                            int n17;
                            object = this.d;
                            int n18 = ((LinearLayoutManager)object).findFirstVisibleItemPosition();
                            d$a = this.g;
                            d$a.a = n18;
                            n3 = 0;
                            boolean bl2 = false;
                            f5 = 0.0f;
                            Object var7_27 = null;
                            int n19 = -1;
                            if (n18 == n19) {
                                d$a.a = n19;
                                d$a.b = 0.0f;
                                d$a.c = 0;
                                return;
                            }
                            View view = ((LinearLayoutManager)object).findViewByPosition(n18);
                            if (view == null) {
                                d$a.a = n19;
                                d$a.b = 0.0f;
                                d$a.c = 0;
                                return;
                            }
                            n19 = ((RecyclerView$o)object).getLeftDecorationWidth(view);
                            int n20 = ((RecyclerView$o)object).getRightDecorationWidth(view);
                            int n21 = ((RecyclerView$o)object).getTopDecorationHeight(view);
                            n15 = ((RecyclerView$o)object).getBottomDecorationHeight(view);
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            n7 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                            if (n7 != 0) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
                                n7 = marginLayoutParams.leftMargin;
                                n19 += n7;
                                n7 = marginLayoutParams.rightMargin;
                                n17 = n20 + n7;
                                n7 = marginLayoutParams.topMargin;
                                n16 = n21 + n7;
                                n14 = marginLayoutParams.bottomMargin;
                                n15 += n14;
                            }
                            n14 = view.getHeight() + n16 + n15;
                            n15 = view.getWidth() + n19 + n17;
                            int n22 = ((LinearLayoutManager)object).getOrientation();
                            n7 = 1;
                            RecyclerView recyclerView = this.c;
                            if (n22 == 0) {
                                int n24 = view.getLeft() - n19;
                                n19 = recyclerView.getPaddingLeft();
                                int n25 = n24 - n19;
                                object4 = this.b.g;
                                n19 = ((RecyclerView$o)object4).getLayoutDirection();
                                if (n19 == n7) {
                                    int n26 = -n25;
                                }
                                n14 = n15;
                            } else {
                                int n27 = view.getTop() - n16;
                                n19 = recyclerView.getPaddingTop();
                                int n28 = n27 - n19;
                            }
                            var2_9 = -var2_8;
                            d$a.c = var2_9;
                            if (var2_9 >= 0) break block24;
                            n10 = ((RecyclerView$o)object).getChildCount();
                            if (n10 == 0) break block25;
                            int n29 = ((LinearLayoutManager)object).getOrientation();
                            if (n29 == 0) {
                                boolean bl3 = true;
                                f5 = Float.MIN_VALUE;
                            } else {
                                boolean bl4 = false;
                                f5 = 0.0f;
                                Object var7_28 = null;
                            }
                            n19 = 2;
                            int[] nArray = new int[n19];
                            nArray[n7] = n19;
                            nArray[0] = n10;
                            object4 = (int[][])Array.newInstance(Integer.TYPE, nArray);
                            boolean bl5 = false;
                            Object var18_67 = null;
                            break block26;
                        }
                        if (n14 != 0) {
                            float f6 = (float)var2_9;
                            float f7 = n14;
                            f5 = f6 / f7;
                        }
                        d$a.b = f5;
                        return;
                    }
                    while (var10_47 < n10) {
                        int n30;
                        int n32;
                        int n34;
                        void var5_21;
                        View view = ((RecyclerView$o)object).getChildAt((int)var10_47);
                        if (view == null) {
                            object = new IllegalStateException("null view contained in the view hierarchy");
                            throw object;
                        }
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        n14 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                        layoutParams = n14 != 0 ? (ViewGroup.MarginLayoutParams)layoutParams : lk_0.a;
                        Object object5 = object4[var10_47];
                        if (var5_21 != false) {
                            n34 = view.getLeft();
                            n32 = layoutParams.leftMargin;
                        } else {
                            n34 = view.getTop();
                            n32 = layoutParams.topMargin;
                        }
                        object5[0] = n34 -= n32;
                        Object object6 = object4[var10_47];
                        if (var5_21 != false) {
                            n30 = view.getRight();
                            n15 = layoutParams.rightMargin;
                        } else {
                            n30 = view.getBottom();
                            n15 = layoutParams.bottomMargin;
                        }
                        object6[n7] = n30 += n15;
                        ++var10_47;
                    }
                    kk_0 kk_02 = new Object();
                    Arrays.sort(object4, kk_02);
                    boolean bl6 = true;
                    f5 = Float.MIN_VALUE;
                    while (var5_23 < n10) {
                        Object object7 = var5_23 + -1;
                        Object object8 = object4[object7];
                        Object object9 = object4[var5_23];
                        Object object10 = object9[0];
                        if ((object7 = object8[n7]) == object10) {
                            ++var5_23;
                            continue;
                        }
                        break block23;
                    }
                    Object object11 = object4[0];
                    Object object12 = object11[n7];
                    Object object13 = object11[0];
                    reference var10_50 = object12 - object13;
                    if (object13 > 0 || (object3 = (object2 = object4[n8 = n10 - n7])[n7]) < var10_50) break block23;
                }
                if ((n4 = ((RecyclerView$o)object).getChildCount()) > n7) break block27;
            }
            int n35 = ((RecyclerView$o)object).getChildCount();
            while (n3 < n35) {
                View view = ((RecyclerView$o)object).getChildAt(n3);
                boolean bl7 = lk_0.a(view);
                if (bl7) {
                    object = new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    throw object;
                }
                ++n3;
            }
        }
        Locale locale = Locale.US;
        String string2 = hj0_0.a(d$a.c, "Page can only be offset by a positive amount, not by ");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        block16: {
            block18: {
                int n14;
                block17: {
                    ViewPager2$g viewPager2$g;
                    n10 = this.e;
                    n8 = 1;
                    if ((n10 != n8 || (n7 = this.f) != n8) && n3 == n8) {
                        this.d(false);
                        return;
                    }
                    n7 = 4;
                    if (n10 != n8 && n10 != n7) {
                        n14 = 0;
                        viewPager2$g = null;
                    } else {
                        n14 = 1;
                    }
                    n4 = 2;
                    if (n14 != 0 && n3 == n4) {
                        n10 = (int)(this.k ? 1 : 0);
                        if (n10 != 0) {
                            this.b(n4);
                            this.j = n8;
                        }
                        return;
                    }
                    if (n10 != n8 && n10 != n7) {
                        n8 = 0;
                    }
                    object = this.g;
                    n7 = -1;
                    if (n8 == 0 || n3 != 0) break block16;
                    this.e();
                    n8 = (int)(this.k ? 1 : 0);
                    if (n8 != 0) break block17;
                    n8 = ((d$a)object).a;
                    if (n8 != n7 && (viewPager2$g = this.a) != null) {
                        viewPager2$g.onPageScrolled(n8, 0.0f, 0);
                    }
                    break block18;
                }
                n8 = ((d$a)object).c;
                if (n8 != 0) break block16;
                n8 = this.h;
                n14 = ((d$a)object).a;
                if (n8 != n14) {
                    this.a(n14);
                }
            }
            this.b(0);
            this.c();
        }
        if ((n8 = this.e) == n4 && n3 == 0 && (n3 = (int)(this.l ? 1 : 0)) != 0) {
            this.e();
            n3 = ((d$a)object).c;
            if (n3 == 0) {
                n3 = this.i;
                n10 = ((d$a)object).a;
                if (n3 != n10) {
                    if (n10 == n7) {
                        n10 = 0;
                        object = null;
                    }
                    this.a(n10);
                }
                this.b(0);
                this.c();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void onScrolled(RecyclerView var1_1, int var2_2, int var3_3) {
        block12: {
            block10: {
                block11: {
                    var4_4 = 1;
                    this.k = var4_4;
                    this.e();
                    var5_5 = this.j;
                    var6_6 = this.g;
                    var7_7 = -1;
                    if (var5_5 == 0) break block10;
                    this.j = false;
                    if (var3_3 > 0) break block11;
                    if (var3_3 != 0) ** GOTO lbl-1000
                    var2_2 = var2_2 < 0 ? 1 : 0;
                    var8_8 = this.b.g;
                    var3_3 = var8_8.getLayoutDirection();
                    if (var3_3 == var4_4) {
                        var3_3 = 1;
                        var9_9 = 1.4E-45f;
                    } else {
                        var3_3 = 0;
                        var9_9 = 0.0f;
                        var8_8 = null;
                    }
                    if (var2_2 != var3_3) ** GOTO lbl-1000
                }
                if ((var2_2 = var6_6.c) != 0) {
                    var2_2 = var6_6.a + var4_4;
                } else lbl-1000:
                // 3 sources

                {
                    var2_2 = var6_6.a;
                }
                this.i = var2_2;
                var3_3 = this.h;
                if (var3_3 != var2_2) {
                    this.a(var2_2);
                }
                break block12;
            }
            var2_2 = this.e;
            if (var2_2 == 0) {
                var2_2 = var6_6.a;
                if (var2_2 == var7_7) {
                    var2_2 = 0;
                }
                this.a(var2_2);
            }
        }
        if ((var2_2 = var6_6.a) == var7_7) {
            var2_2 = 0;
        }
        var9_9 = var6_6.b;
        var5_5 = var6_6.c;
        var10_10 = this.a;
        if (var10_10 != null) {
            var10_10.onPageScrolled(var2_2, var9_9, var5_5);
        }
        if (((var2_2 = var6_6.a) == (var3_3 = this.i) || var3_3 == var7_7) && (var2_2 = var6_6.c) == 0 && (var2_2 = this.f) != var4_4) {
            this.b(0);
            this.c();
        }
    }
}

