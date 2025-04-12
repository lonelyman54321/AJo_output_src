/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.a$a_0;
import androidx.recyclerview.widget.a$b_0;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.q$a;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from androidx.recyclerview.widget.a
 */
public final class a_0
implements q$a {
    public final zw2_0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final a$a_0 d;
    public final q e;
    public int f;

    public a_0(RecyclerView$e object) {
        ArrayList arrayList = new ArrayList(30);
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList();
        this.f = 0;
        this.d = object;
        this.e = object = new q(this);
    }

    public final boolean a(int n3) {
        ArrayList arrayList = this.c;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            a$b_0 a$b_0 = (a$b_0)arrayList.get(i3);
            int n8 = a$b_0.a;
            int n10 = 8;
            int n14 = 1;
            if (n8 == n10) {
                n7 = a$b_0.d;
                n8 = i3 + 1;
                if ((n7 = this.f(n7, n8)) != n3) continue;
                return n14 != 0;
            }
            if (n8 != n14) continue;
            n7 = a$b_0.d + n8;
            for (n8 = a$b_0.b; n8 < n7; ++n8) {
                n10 = i3 + 1;
                if ((n10 = this.f(n8, n10)) != n3) continue;
                return n14 != 0;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.c;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            a$b_0 a$b_0 = (a$b_0)arrayList.get(i3);
            RecyclerView$e recyclerView$e = (RecyclerView$e)this.d;
            recyclerView$e.a(a$b_0);
        }
        this.l(arrayList);
        this.f = 0;
    }

    public final void c() {
        this.b();
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object object = (a$b_0)arrayList.get(i3);
            int n7 = ((a$b_0)object).a;
            int n8 = 1;
            Object object2 = this.d;
            if (n7 != n8) {
                int n10 = 2;
                if (n7 != n10) {
                    n10 = 4;
                    if (n7 != n10) {
                        n10 = 8;
                        if (n7 != n10) continue;
                        object2 = (RecyclerView$e)object2;
                        ((RecyclerView$e)object2).a((a$b_0)object);
                        n7 = ((a$b_0)object).b;
                        n4 = ((a$b_0)object).d;
                        object2 = ((RecyclerView$e)object2).a;
                        ((RecyclerView)object2).offsetPositionRecordsForMove(n7, n4);
                        ((RecyclerView)object2).mItemsAddedOrRemoved = n8;
                        continue;
                    }
                    object2 = (RecyclerView$e)object2;
                    ((RecyclerView$e)object2).a((a$b_0)object);
                    n7 = ((a$b_0)object).b;
                    n10 = ((a$b_0)object).d;
                    object = ((a$b_0)object).c;
                    object2 = ((RecyclerView$e)object2).a;
                    ((RecyclerView)object2).viewRangeUpdate(n7, n10, object);
                    ((RecyclerView)object2).mItemsChanged = n8;
                    continue;
                }
                object2 = (RecyclerView$e)object2;
                ((RecyclerView$e)object2).a((a$b_0)object);
                n7 = ((a$b_0)object).b;
                n4 = ((a$b_0)object).d;
                object2 = ((RecyclerView$e)object2).a;
                ((RecyclerView)object2).offsetPositionRecordsForRemove(n7, n4, n8 != 0);
                ((RecyclerView)object2).mItemsAddedOrRemoved = n8;
                RecyclerView$y recyclerView$y = ((RecyclerView)object2).mState;
                recyclerView$y.c = n8 = recyclerView$y.c + n4;
                continue;
            }
            object2 = (RecyclerView$e)object2;
            ((RecyclerView$e)object2).a((a$b_0)object);
            n7 = ((a$b_0)object).b;
            n4 = ((a$b_0)object).d;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).offsetPositionRecordsForInsert(n7, n4);
            ((RecyclerView)object2).mItemsAddedOrRemoved = n8;
        }
        this.l(arrayList);
        this.f = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(a$b_0 object) {
        Object object2;
        zw2_0 zw2_02;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10 = ((a$b_0)object).a;
        int n14 = 1;
        if (n10 != n14 && n10 != (n8 = 8)) {
            n8 = ((a$b_0)object).b;
            n10 = this.m(n8, n10);
            n8 = ((a$b_0)object).b;
            n7 = ((a$b_0)object).a;
            n4 = 2;
            n3 = 4;
            if (n7 != n4) {
                if (n7 != n3) {
                    StringBuilder stringBuilder = new StringBuilder("op should be remove or update.");
                    stringBuilder.append(object);
                    object = stringBuilder.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
                n7 = 1;
            } else {
                n7 = 0;
                zw2_02 = null;
            }
        } else {
            object = new IllegalArgumentException("should not dispatch add or move for pre layout");
            throw object;
        }
        int n15 = 1;
        int n16 = 1;
        while (true) {
            int n17;
            int n18 = ((a$b_0)object).d;
            zw2_0 zw2_03 = null;
            if (n15 >= n18) break;
            n18 = ((a$b_0)object).b;
            int n19 = n7 * n15 + n18;
            n18 = ((a$b_0)object).a;
            n18 = this.m(n19, n18);
            n19 = ((a$b_0)object).a;
            if (n19 != n4 ? n19 == n3 && n18 == (n17 = n10 + 1) : n18 == n10) {
                ++n16;
            } else {
                Object object3 = ((a$b_0)object).c;
                object2 = this.h(n19, object3, n10, n16);
                this.e((a$b_0)object2, n8);
                ((a$b_0)object2).c = null;
                zw2_03 = this.a;
                zw2_03.a(object2);
                n10 = ((a$b_0)object).a;
                if (n10 == n3) {
                    n8 += n16;
                }
                n10 = n18;
                n16 = 1;
            }
            ++n15;
        }
        Object object4 = ((a$b_0)object).c;
        ((a$b_0)object).c = null;
        zw2_02 = this.a;
        zw2_02.a(object);
        if (n16 > 0) {
            int n20 = ((a$b_0)object).a;
            object = this.h(n20, object4, n10, n16);
            this.e((a$b_0)object, n8);
            ((a$b_0)object).c = null;
            object2 = this.a;
            ((zw2_0)object2).a(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(a$b_0 object, int n3) {
        Object object2 = (RecyclerView$e)this.d;
        ((RecyclerView$e)object2).a((a$b_0)object);
        int n4 = ((a$b_0)object).a;
        int n7 = 2;
        boolean bl2 = true;
        if (n4 == n7) {
            int n8;
            int n10 = ((a$b_0)object).d;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).offsetPositionRecordsForRemove(n3, n10, bl2);
            ((RecyclerView)object2).mItemsAddedOrRemoved = bl2;
            RecyclerView$y recyclerView$y = ((RecyclerView)object2).mState;
            recyclerView$y.c = n8 = recyclerView$y.c + n10;
            return;
        }
        n7 = 4;
        if (n4 == n7) {
            n4 = ((a$b_0)object).d;
            object = ((a$b_0)object).c;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).viewRangeUpdate(n3, n4, object);
            ((RecyclerView)object2).mItemsChanged = bl2;
            return;
        }
        object = new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        throw object;
    }

    public final int f(int n3, int n4) {
        ArrayList arrayList = this.c;
        int n7 = arrayList.size();
        while (n4 < n7) {
            int n8;
            a$b_0 a$b_0 = (a$b_0)arrayList.get(n4);
            int n10 = a$b_0.a;
            int n14 = 8;
            if (n10 == n14) {
                n10 = a$b_0.b;
                if (n10 == n3) {
                    n3 = a$b_0.d;
                } else {
                    if (n10 < n3) {
                        n3 += -1;
                    }
                    if ((n8 = a$b_0.d) <= n3) {
                        ++n3;
                    }
                }
            } else {
                n14 = a$b_0.b;
                if (n14 <= n3) {
                    int n15 = 2;
                    if (n10 == n15) {
                        n8 = a$b_0.d;
                        if (n3 < (n14 += n8)) {
                            return -1;
                        }
                        n3 -= n8;
                    } else {
                        n14 = 1;
                        if (n10 == n14) {
                            n8 = a$b_0.d;
                            n3 += n8;
                        }
                    }
                }
            }
            ++n4;
        }
        return n3;
    }

    public final boolean g() {
        ArrayList arrayList = this.b;
        int n3 = arrayList.size();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3 != 0;
    }

    public final a$b_0 h(int n3, Object object, int n4, int n7) {
        a$b_0 a$b_0 = (a$b_0)this.a.b();
        if (a$b_0 == null) {
            a$b_0 = new Object();
            a$b_0.a = n3;
            a$b_0.b = n4;
            a$b_0.d = n7;
            a$b_0.c = object;
        } else {
            a$b_0.a = n3;
            a$b_0.b = n4;
            a$b_0.d = n7;
            a$b_0.c = object;
        }
        return a$b_0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(a$b_0 object) {
        ArrayList arrayList = this.c;
        arrayList.add(object);
        int n3 = ((a$b_0)object).a;
        int n4 = 1;
        Object object2 = this.d;
        if (n3 == n4) {
            n3 = ((a$b_0)object).b;
            int n7 = ((a$b_0)object).d;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).offsetPositionRecordsForInsert(n3, n7);
            ((RecyclerView)object2).mItemsAddedOrRemoved = n4;
            return;
        }
        int n8 = 2;
        if (n3 == n8) {
            n3 = ((a$b_0)object).b;
            int n10 = ((a$b_0)object).d;
            object2 = ((RecyclerView$e)object2).a;
            n8 = 0;
            ((RecyclerView)object2).offsetPositionRecordsForRemove(n3, n10, false);
            ((RecyclerView)object2).mItemsAddedOrRemoved = n4;
            return;
        }
        n8 = 4;
        if (n3 == n8) {
            n3 = ((a$b_0)object).b;
            n8 = ((a$b_0)object).d;
            object = ((a$b_0)object).c;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).viewRangeUpdate(n3, n8, object);
            ((RecyclerView)object2).mItemsChanged = n4;
            return;
        }
        n8 = 8;
        if (n3 == n8) {
            n3 = ((a$b_0)object).b;
            int n14 = ((a$b_0)object).d;
            object2 = ((RecyclerView$e)object2).a;
            ((RecyclerView)object2).offsetPositionRecordsForMove(n3, n14);
            ((RecyclerView)object2).mItemsAddedOrRemoved = n4;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown update op type for ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    public final void j() {
        var1_1 = this;
        var2_2 = this.a;
        var3_3 = -1;
        var4_4 = 1;
        var5_5 = this.b;
        var6_6 = this.e;
        var6_6.getClass();
        while (true) {
            block77: {
                block75: {
                    block82: {
                        block81: {
                            block80: {
                                block76: {
                                    block79: {
                                        block78: {
                                            block73: {
                                                var7_7 = var5_5.size() - var4_4;
                                                var8_8 = 0;
                                                while (true) {
                                                    var9_9 = 8;
                                                    if (var7_7 < 0) break;
                                                    var10_10 = (a$b_0)var5_5.get(var7_7);
                                                    var11_11 = var10_10.a;
                                                    if (var11_11 == var9_9) {
                                                        if (var8_8 != 0) {
                                                            break block73;
                                                        }
                                                    } else {
                                                        var8_8 = 1;
                                                    }
                                                    var7_7 += var3_3;
                                                }
                                                var7_7 = -1;
                                            }
                                            var8_8 = 0;
                                            var11_11 = 4;
                                            var12_12 = 2;
                                            if (var7_7 == var3_3) break;
                                            var9_9 = var7_7 + 1;
                                            var13_13 = (a$b_0)var5_5.get(var7_7);
                                            var14_14 = (a$b_0)var5_5.get(var9_9);
                                            var15_15 = var14_14.a;
                                            if (var15_15 == var4_4) break block75;
                                            var16_16 = var6_6.a;
                                            if (var15_15 == var12_12) break block76;
                                            if (var15_15 != var11_11) break block77;
                                            var17_17 = var13_13.d;
                                            var12_12 = var14_14.b;
                                            if (var17_17 >= var12_12) break block78;
                                            var14_14.b = var12_12 -= var4_4;
                                            ** GOTO lbl-1000
                                        }
                                        var15_15 = var14_14.d;
                                        if (var17_17 < (var12_12 += var15_15)) {
                                            var14_14.d = var15_15 -= var4_4;
                                            var17_17 = var13_13.b;
                                            var18_18 = var14_14.c;
                                            var19_19 = var16_16;
                                            var19_19 = (a_0)var16_16;
                                            var20_20 = var19_19.h(var11_11, var18_18, var17_17, var4_4);
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var17_17 = 0;
                                            var20_20 = null;
                                        }
                                        var12_12 = var13_13.b;
                                        var15_15 = var14_14.b;
                                        if (var12_12 > var15_15) break block79;
                                        var14_14.b = var15_15 += var4_4;
                                        ** GOTO lbl-1000
                                    }
                                    var3_3 = var14_14.d;
                                    if (var12_12 < (var15_15 += var3_3)) {
                                        var15_15 -= var12_12;
                                        var21_21 = var14_14.c;
                                        var22_22 = var16_16;
                                        var22_22 = (a_0)var16_16;
                                        var21_21 = var22_22.h(var11_11, var21_21, var12_12 += var4_4, var15_15);
                                        var14_14.d = var4_4 = var14_14.d - var15_15;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = 0;
                                        var21_21 = null;
                                    }
                                    var5_5.set(var9_9, var13_13);
                                    var4_4 = var14_14.d;
                                    if (var4_4 > 0) {
                                        var5_5.set(var7_7, var14_14);
                                    } else {
                                        var5_5.remove(var7_7);
                                        var16_16 = (a_0)var16_16;
                                        var16_16.getClass();
                                        var14_14.c = null;
                                        var22_22 = var16_16.a;
                                        var22_22.a(var14_14);
                                    }
                                    if (var20_20 != null) {
                                        var5_5.add(var7_7, var20_20);
                                    }
                                    if (var21_21 != null) {
                                        var5_5.add(var7_7, var21_21);
                                    }
                                    break block77;
                                }
                                var3_3 = var13_13.b;
                                var4_4 = var13_13.d;
                                if (var3_3 >= var4_4) ** GOTO lbl110
                                var11_11 = var14_14.b;
                                if (var11_11 == var3_3 && (var11_11 = var14_14.d) == (var3_3 = var4_4 - var3_3)) {
                                    var3_3 = 0;
                                    var21_21 = null;
                                    var17_17 = 1;
lbl102:
                                    // 2 sources

                                    while (true) {
                                        var15_15 = 1;
                                        break;
                                    }
                                } else {
                                    var3_3 = 0;
                                    var21_21 = null;
                                    var17_17 = 0;
                                    var20_20 = null;
                                    ** continue;
lbl110:
                                    // 1 sources

                                    var11_11 = var14_14.b;
                                    var15_15 = 1;
                                    var17_17 = var4_4 + 1;
                                    if (var11_11 == var17_17 && (var17_17 = var14_14.d) == (var3_3 -= var4_4)) {
                                        var3_3 = 1;
                                        var17_17 = 1;
                                    } else {
                                        var3_3 = 1;
                                        var17_17 = 0;
                                        var20_20 = null;
                                    }
                                }
                                var11_11 = var14_14.b;
                                if (var4_4 >= var11_11) break block80;
                                var14_14.b = var11_11 -= var15_15;
                                break block81;
                            }
                            var8_8 = var14_14.d;
                            if (var4_4 >= (var11_11 += var8_8)) break block81;
                            var14_14.d = var8_8 -= var15_15;
                            var13_13.a = var12_12;
                            var13_13.d = var15_15;
                            var3_3 = var14_14.d;
                            if (var3_3 == 0) {
                                var5_5.remove(var9_9);
                                var16_16 = (a_0)var16_16;
                                var16_16.getClass();
                                var3_3 = 0;
                                var14_14.c = null;
                                var21_21 = var16_16.a;
                                var21_21.a(var14_14);
                            }
                            break block77;
                        }
                        var4_4 = var13_13.b;
                        var8_8 = var14_14.b;
                        if (var4_4 > var8_8) break block82;
                        var11_11 = 1;
                        var14_14.b = var8_8 += var11_11;
                        ** GOTO lbl-1000
                    }
                    var11_11 = 1;
                    var15_15 = var14_14.d;
                    if (var4_4 < (var8_8 += var15_15)) {
                        var8_8 -= var4_4;
                        var10_10 = var16_16;
                        var10_10 = (a_0)var16_16;
                        var15_15 = 0;
                        var19_19 = null;
                        var22_22 = var10_10.h(var12_12, null, var4_4 += var11_11, var8_8);
                        var8_8 = var13_13.b;
                        var11_11 = var14_14.b;
                        var14_14.d = var8_8 -= var11_11;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = 0;
                        var22_22 = null;
                    }
                    if (var17_17 != 0) {
                        var5_5.set(var7_7, var14_14);
                        var5_5.remove(var9_9);
                        var16_16 = (a_0)var16_16;
                        var16_16.getClass();
                        var3_3 = 0;
                        var13_13.c = null;
                        var21_21 = var16_16.a;
                        var21_21.a(var13_13);
                    } else {
                        if (var3_3 != 0) {
                            if (var22_22 != null) {
                                var3_3 = var13_13.b;
                                var17_17 = var22_22.b;
                                if (var3_3 > var17_17) {
                                    var17_17 = var22_22.d;
                                    var13_13.b = var3_3 -= var17_17;
                                }
                                if ((var3_3 = var13_13.d) > (var17_17 = var22_22.b)) {
                                    var17_17 = var22_22.d;
                                    var13_13.d = var3_3 -= var17_17;
                                }
                            }
                            if ((var3_3 = var13_13.b) > (var17_17 = var14_14.b)) {
                                var17_17 = var14_14.d;
                                var13_13.b = var3_3 -= var17_17;
                            }
                            if ((var3_3 = var13_13.d) > (var17_17 = var14_14.b)) {
                                var17_17 = var14_14.d;
                                var13_13.d = var3_3 -= var17_17;
                            }
                        } else {
                            if (var22_22 != null) {
                                var3_3 = var13_13.b;
                                var17_17 = var22_22.b;
                                if (var3_3 >= var17_17) {
                                    var17_17 = var22_22.d;
                                    var13_13.b = var3_3 -= var17_17;
                                }
                                if ((var3_3 = var13_13.d) >= (var17_17 = var22_22.b)) {
                                    var17_17 = var22_22.d;
                                    var13_13.d = var3_3 -= var17_17;
                                }
                            }
                            if ((var3_3 = var13_13.b) >= (var17_17 = var14_14.b)) {
                                var17_17 = var14_14.d;
                                var13_13.b = var3_3 -= var17_17;
                            }
                            if ((var3_3 = var13_13.d) >= (var17_17 = var14_14.b)) {
                                var17_17 = var14_14.d;
                                var13_13.d = var3_3 -= var17_17;
                            }
                        }
                        var5_5.set(var7_7, var14_14);
                        var3_3 = var13_13.b;
                        var17_17 = var13_13.d;
                        if (var3_3 != var17_17) {
                            var5_5.set(var9_9, var13_13);
                        } else {
                            var5_5.remove(var9_9);
                        }
                        if (var22_22 != null) {
                            var5_5.add(var7_7, var22_22);
                        }
                    }
                    break block77;
                }
                var3_3 = var13_13.d;
                var4_4 = var14_14.b;
                if (var3_3 < var4_4) {
                    var17_17 = -1;
                } else {
                    var17_17 = 0;
                    var20_20 = null;
                }
                var8_8 = var13_13.b;
                if (var8_8 < var4_4) {
                    var11_11 = 1;
                    var17_17 += var11_11;
                }
                if (var4_4 <= var8_8) {
                    var4_4 = var14_14.d;
                    var13_13.b = var8_8 += var4_4;
                }
                if ((var4_4 = var14_14.b) <= var3_3) {
                    var8_8 = var14_14.d;
                    var13_13.d = var3_3 += var8_8;
                }
                var14_14.b = var4_4 += var17_17;
                var5_5.set(var7_7, var14_14);
                var5_5.set(var9_9, var13_13);
            }
            var3_3 = -1;
            var4_4 = 1;
        }
        var3_3 = var5_5.size();
        var22_22 = null;
        for (var4_4 = 0; var4_4 < var3_3; var4_4 += var23_23) {
            block74: {
                block83: {
                    block84: {
                        block87: {
                            block85: {
                                block86: {
                                    var6_6 = (a$b_0)var5_5.get(var4_4);
                                    var7_7 = var6_6.a;
                                    var17_17 = 1;
                                    if (var7_7 == var17_17) break block83;
                                    var20_20 = var1_1.d;
                                    if (var7_7 == var12_12) break block84;
                                    if (var7_7 == var11_11) break block85;
                                    if (var7_7 == var9_9) break block86;
lbl263:
                                    // 3 sources

                                    while (true) {
                                        var23_23 = 1;
                                        var17_17 = 0;
                                        var20_20 = null;
                                        var8_8 = 2;
                                        break block74;
                                        break;
                                    }
                                }
                                var1_1.i((a$b_0)var6_6);
                                ** GOTO lbl263
                            }
                            var8_8 = var6_6.d + var7_7;
                            var24_24 = var7_7;
                            var25_25 = 0;
                            var14_14 = null;
                            var15_15 = -1;
                            for (var7_7 = var6_6.b; var7_7 < var8_8; var7_7 += var9_9) {
                                var16_16 = var20_20;
                                var16_16 = ((RecyclerView$e)var20_20).a;
                                var9_9 = 1;
                                var18_18 = var16_16.findViewHolderForPosition(var7_7, (boolean)var9_9);
                                if (var18_18 == null) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var12_12 = 0;
                                        var18_18 = null;
                                        break;
                                    }
                                } else {
                                    var26_26 = var16_16.mChildHelper;
                                    var16_16 = var18_18.itemView;
                                    var9_9 = (int)var26_26.k((View)var16_16);
                                    if (var9_9 != 0) {
                                        var9_9 = RecyclerView.HORIZONTAL;
                                        ** continue;
                                    }
                                }
                                if (var18_18 == null && (var9_9 = (int)var1_1.a(var7_7)) == 0) {
                                    var9_9 = 1;
                                    if (var15_15 == var9_9) {
                                        var26_26 = var6_6.c;
                                        var26_26 = var1_1.h(var11_11, var26_26, var24_24, var25_25);
                                        var1_1.i((a$b_0)var26_26);
                                        var24_24 = var7_7;
                                        var25_25 = 0;
                                        var14_14 = null;
                                    }
                                    var9_9 = 1;
                                    var15_15 = 0;
                                    var19_19 = null;
                                } else {
                                    if (var15_15 == 0) {
                                        var26_26 = var6_6.c;
                                        var26_26 = var1_1.h(var11_11, var26_26, var24_24, var25_25);
                                        var1_1.d((a$b_0)var26_26);
                                        var24_24 = var7_7;
                                        var25_25 = 0;
                                        var14_14 = null;
                                    }
                                    var9_9 = 1;
                                    var15_15 = 1;
                                }
                                var25_25 += var9_9;
                                var9_9 = 8;
                                var12_12 = 2;
                            }
                            var7_7 = var6_6.d;
                            if (var25_25 != var7_7) {
                                var27_27 = var6_6.c;
                                var17_17 = 0;
                                var20_20 = null;
                                var6_6.c = null;
                                var2_2.a(var6_6);
                                var6_6 = var1_1.h(var11_11, var27_27, var24_24, var25_25);
                            }
                            if (var15_15 != 0) break block87;
                            var1_1.d((a$b_0)var6_6);
                            ** GOTO lbl263
                        }
                        var1_1.i((a$b_0)var6_6);
                        ** continue;
                    }
                    var7_7 = var6_6.b;
                    var8_8 = var6_6.d + var7_7;
                    var12_12 = 0;
                    var18_18 = null;
                    var24_24 = -1;
                    for (var9_9 = var7_7; var9_9 < var8_8; var9_9 += var24_24) {
                        var14_14 = var20_20;
                        var14_14 = ((RecyclerView$e)var20_20).a;
                        var15_15 = 1;
                        var16_16 = var14_14.findViewHolderForPosition(var9_9, (boolean)var15_15);
                        if (var16_16 == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var16_16 = null;
                                break;
                            }
                        } else {
                            var14_14 = var14_14.mChildHelper;
                            var19_19 = var16_16.itemView;
                            var25_25 = (int)var14_14.k((View)var19_19);
                            if (var25_25 != 0) {
                                var25_25 = RecyclerView.HORIZONTAL;
                                ** continue;
                            }
                        }
                        if (var16_16 == null && (var25_25 = (int)var1_1.a(var9_9)) == 0) {
                            var25_25 = 1;
                            if (var24_24 == var25_25) {
                                var25_25 = 0;
                                var14_14 = null;
                                var15_15 = 2;
                                var13_13 = var1_1.h(var15_15, null, var7_7, var12_12);
                                var1_1.i(var13_13);
                                var24_24 = 1;
                            } else {
                                var25_25 = 0;
                                var14_14 = null;
                                var15_15 = 2;
                                var24_24 = 0;
                                var13_13 = null;
                            }
                            var25_25 = 0;
                            var14_14 = null;
                        } else {
                            var25_25 = 0;
                            var14_14 = null;
                            var15_15 = 2;
                            if (var24_24 == 0) {
                                var13_13 = var1_1.h(var15_15, null, var7_7, var12_12);
                                var1_1.d(var13_13);
                                var24_24 = 1;
                            } else {
                                var24_24 = 0;
                                var13_13 = null;
                            }
                            var25_25 = 1;
                        }
                        if (var24_24 != 0) {
                            var9_9 -= var12_12;
                            var8_8 -= var12_12;
                            var12_12 = 1;
                            var24_24 = 1;
                        } else {
                            var24_24 = 1;
                            var12_12 = var28_28 = var12_12 + 1;
                        }
                        var24_24 = var25_25;
                    }
                    var17_17 = var6_6.d;
                    if (var12_12 != var17_17) {
                        var17_17 = 0;
                        var20_20 = null;
                        var6_6.c = null;
                        var2_2.a(var6_6);
                        var8_8 = 2;
                        var6_6 = var1_1.h(var8_8, null, var7_7, var12_12);
                    } else {
                        var17_17 = 0;
                        var20_20 = null;
                        var8_8 = 2;
                    }
                    if (var24_24 == 0) {
                        var1_1.d((a$b_0)var6_6);
                    } else {
                        var1_1.i((a$b_0)var6_6);
                    }
lbl412:
                    // 3 sources

                    while (true) {
                        var23_23 = 1;
                        break block74;
                        break;
                    }
                }
                var17_17 = 0;
                var20_20 = null;
                var8_8 = 2;
                var1_1.i((a$b_0)var6_6);
                ** continue;
            }
            var9_9 = 8;
            var12_12 = 2;
        }
        var5_5.clear();
    }

    public final void k(a$b_0 a$b_0) {
        a$b_0.c = null;
        this.a.a(a$b_0);
    }

    public final void l(List list) {
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            a$b_0 a$b_0 = (a$b_0)list.get(i3);
            this.k(a$b_0);
        }
        list.clear();
    }

    public final int m(int n3, int n4) {
        int n7;
        a$b_0 a$b_0;
        int n8;
        ArrayList arrayList = this.c;
        int n10 = arrayList.size();
        int n14 = 1;
        n10 -= n14;
        while (true) {
            n8 = 8;
            if (n10 < 0) break;
            a$b_0 = (a$b_0)arrayList.get(n10);
            n7 = a$b_0.a;
            int n15 = 2;
            if (n7 == n8) {
                int n16;
                int n17;
                n8 = a$b_0.b;
                n7 = a$b_0.d;
                if (n8 < n7) {
                    n17 = n8;
                    n16 = n7;
                } else {
                    n16 = n8;
                    n17 = n7;
                }
                if (n3 >= n17 && n3 <= n16) {
                    if (n17 == n8) {
                        if (n4 == n14) {
                            a$b_0.d = ++n7;
                        } else if (n4 == n15) {
                            a$b_0.d = n7 += -1;
                        }
                        ++n3;
                    } else {
                        if (n4 == n14) {
                            a$b_0.b = ++n8;
                        } else if (n4 == n15) {
                            a$b_0.b = n8 += -1;
                        }
                        n3 += -1;
                    }
                } else if (n3 < n8) {
                    if (n4 == n14) {
                        a$b_0.b = ++n8;
                        a$b_0.d = ++n7;
                    } else if (n4 == n15) {
                        a$b_0.b = n8 += -1;
                        a$b_0.d = n7 += -1;
                    }
                }
            } else {
                n8 = a$b_0.b;
                if (n8 <= n3) {
                    if (n7 == n14) {
                        n8 = a$b_0.d;
                        n3 -= n8;
                    } else if (n7 == n15) {
                        n8 = a$b_0.d;
                        n3 += n8;
                    }
                } else if (n4 == n14) {
                    a$b_0.b = ++n8;
                } else if (n4 == n15) {
                    a$b_0.b = n8 += -1;
                }
            }
            n10 += -1;
        }
        for (n4 = arrayList.size() - n14; n4 >= 0; n4 += -1) {
            zw2_0 zw2_02;
            a$b_0 a$b_02 = (a$b_0)arrayList.get(n4);
            n14 = a$b_02.a;
            a$b_0 = null;
            if (n14 == n8) {
                n14 = a$b_02.d;
                n7 = a$b_02.b;
                if (n14 != n7 && n14 >= 0) continue;
                arrayList.remove(n4);
                a$b_02.c = null;
                zw2_02 = this.a;
                zw2_02.a(a$b_02);
                continue;
            }
            n14 = a$b_02.d;
            if (n14 > 0) continue;
            arrayList.remove(n4);
            a$b_02.c = null;
            zw2_02 = this.a;
            zw2_02.a(a$b_02);
        }
        return n3;
    }
}

