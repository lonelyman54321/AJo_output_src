/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;

class ItemTouchHelper$1
implements Runnable {
    public final /* synthetic */ ItemTouchHelper a;

    public ItemTouchHelper$1(ItemTouchHelper itemTouchHelper) {
        this.a = itemTouchHelper;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        block14: {
            block17: {
                block16: {
                    block15: {
                        var1_1 = this;
                        var2_2 = this.a;
                        var3_3 = var2_2.c;
                        if (var3_3 == null) break block14;
                        var4_4 = -9223372036854775808L;
                        if (var3_3 != null) break block15;
                        var2_2.B = var4_4;
                        break block14;
                    }
                    var6_5 = System.currentTimeMillis();
                    var8_6 = var2_2.B;
                    cfr_temp_0 = var8_6 - var4_4;
                    var10_7 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    var8_6 = var10_7 /* !! */  == false ? 0L : var6_5 - var8_6;
                    var3_3 = var2_2.r.getLayoutManager();
                    var11_8 = var2_2.A;
                    if (var11_8 == null) {
                        var11_8 = new Rect();
                        var2_2.A = var11_8;
                    }
                    var11_8 = var2_2.c.itemView;
                    var12_9 /* !! */  = var2_2.A;
                    var3_3.calculateItemDecorationsForChild((View)var11_8, var12_9 /* !! */ );
                    var13_10 = var3_3.canScrollHorizontally();
                    var12_9 /* !! */  = null;
                    var14_11 = 0;
                    var15_12 = null;
                    if (var13_10 == 0) break block16;
                    var16_13 = var2_2.j;
                    var17_14 = var2_2.h;
                    var13_10 = (int)(var16_13 += var17_14);
                    var18_15 = var2_2.A;
                    var19_16 = var18_15.left;
                    var19_16 = var13_10 - var19_16;
                    var20_17 = var2_2.r;
                    var21_18 = var20_17.getPaddingLeft();
                    var22_19 = var2_2.h;
                    cfr_temp_1 = var22_19 - 0.0f;
                    var23_20 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                    if (var23_20 < 0 && (var19_16 -= var21_18) < 0) break block17;
                    cfr_temp_2 = var22_19 - 0.0f;
                    var19_16 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                    if (var19_16 <= 0) break block16;
                    var18_15 = var2_2.c.itemView;
                    var19_16 = var18_15.getWidth() + var13_10;
                    var13_10 = var2_2.A.right;
                    var19_16 += var13_10;
                    var11_8 = var2_2.r;
                    var13_10 = var11_8.getWidth();
                    var20_17 = var2_2.r;
                    var21_18 = var20_17.getPaddingRight();
                    if ((var19_16 -= (var13_10 -= var21_18)) > 0) break block17;
                }
                var19_16 = 0;
                var17_14 = 0.0f;
                var18_15 = null;
            }
            if ((var10_7 /* !! */  = (long)var3_3.canScrollVertically()) == false) ** GOTO lbl83
            var24_21 = var2_2.k;
            var16_13 = var2_2.i;
            var10_7 /* !! */  = (int)(var24_21 += var16_13);
            var11_8 = var2_2.A;
            var13_10 = var11_8.top;
            var13_10 = (int)(var10_7 /* !! */  - var13_10);
            var20_17 = var2_2.r;
            var21_18 = var20_17.getPaddingTop();
            var22_19 = var2_2.i;
            cfr_temp_3 = var22_19 - 0.0f;
            var23_20 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
            if (var23_20 < 0 && (var13_10 -= var21_18) < 0) {
                while (true) {
                    var10_7 /* !! */  = var13_10;
                    break;
                }
            } else {
                cfr_temp_4 = var22_19 - 0.0f;
                var13_10 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                if (var13_10 > 0) {
                    var11_8 = var2_2.c.itemView;
                    var13_10 = var11_8.getHeight() + var10_7 /* !! */ ;
                    var10_7 /* !! */  = var2_2.A.bottom;
                    var13_10 += var10_7 /* !! */ ;
                    var3_3 = var2_2.r;
                    var10_7 /* !! */  = var3_3.getHeight();
                    if ((var13_10 -= (var10_7 /* !! */  -= (var14_11 = (var15_12 = var2_2.r).getPaddingBottom()))) > 0) ** continue;
                }
lbl83:
                // 4 sources

                var10_7 /* !! */  = 0;
                var24_21 = 0.0f;
                var3_3 = null;
            }
            if (var19_16 != 0) {
                var12_9 /* !! */  = var2_2.r;
                var14_11 = var2_2.c.itemView.getWidth();
                var21_18 = var2_2.r.getWidth();
                var11_8 = var2_2.m;
                var19_16 = var11_8.interpolateOutOfBoundsScroll((RecyclerView)var12_9 /* !! */ , var14_11, var19_16, var21_18, var8_6);
            }
            var23_20 = var19_16;
            if (var10_7 /* !! */  != false) {
                var12_9 /* !! */  = var2_2.r;
                var14_11 = var2_2.c.itemView.getHeight();
                var21_18 = var2_2.r.getHeight();
                var11_8 = var2_2.m;
                var19_16 = (int)var10_7 /* !! */ ;
                var10_7 /* !! */  = var23_20;
                var25_22 = var11_8.interpolateOutOfBoundsScroll((RecyclerView)var12_9 /* !! */ , var14_11, var19_16, var21_18, var8_6);
                var19_16 = var23_20;
                var10_7 /* !! */  = var25_22;
            }
            if (var19_16 == 0 && var10_7 /* !! */  == false) {
                var2_2.B = var4_4;
            } else {
                var8_6 = var2_2.B;
                cfr_temp_5 = var8_6 - var4_4;
                var13_10 = (int)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                if (var13_10 == 0) {
                    var2_2.B = var6_5;
                }
                var26_23 = var2_2.r;
                var26_23.scrollBy(var19_16, (int)var10_7 /* !! */ );
                var3_3 = var2_2.c;
                if (var3_3 != null) {
                    var2_2.m((RecyclerView$B)var3_3);
                }
                var3_3 = var2_2.r;
                var26_23 = var2_2.s;
                var3_3.removeCallbacks((Runnable)var26_23);
                var2_2 = var2_2.r;
                var3_3 = ViewCompat.a;
                var2_2.postOnAnimation((Runnable)var1_1);
            }
        }
    }
}

