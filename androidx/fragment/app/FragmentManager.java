/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Looper
 *  android.util.Log
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$5;
import androidx.fragment.app.FragmentManager$a;
import androidx.fragment.app.FragmentManager$b;
import androidx.fragment.app.FragmentManager$c;
import androidx.fragment.app.FragmentManager$d;
import androidx.fragment.app.FragmentManager$e;
import androidx.fragment.app.FragmentManager$f;
import androidx.fragment.app.FragmentManager$g;
import androidx.fragment.app.FragmentManager$h;
import androidx.fragment.app.FragmentManager$i;
import androidx.fragment.app.FragmentManager$j;
import androidx.fragment.app.FragmentManager$l;
import androidx.fragment.app.FragmentManager$m;
import androidx.fragment.app.FragmentManager$n;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.FragmentManager$p;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.a;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.fragment.app.f$a;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import androidx.fragment.app.n;
import androidx.lifecycle.E$b;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public abstract class FragmentManager {
    public Fragment A;
    public final FragmentManager$d B;
    public final FragmentManager$e C;
    public N3 D;
    public N3 E;
    public N3 F;
    public ArrayDeque G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public g P;
    public final Runnable Q;
    public final ArrayList a;
    public boolean b;
    public final j c;
    public ArrayList d;
    public ArrayList e;
    public final e f;
    public d82_0 g;
    public a h;
    public boolean i;
    public final FragmentManager$b j;
    public final AtomicInteger k;
    public final Map l;
    public final Map m;
    public final Map n;
    public final ArrayList o;
    public final f p;
    public final CopyOnWriteArrayList q;
    public final mW0 r;
    public final nw0_0 s;
    public final ow0_1 t;
    public final pw0_0 u;
    public final FragmentManager$c v;
    public int w;
    public lw0_0 x;
    public cw0_0 y;
    public Fragment z;

    public FragmentManager() {
        Object object = new ArrayList();
        this.a = object;
        this.c = object = new j();
        object = new ArrayList();
        this.d = object;
        this.f = object = new e(this);
        this.h = null;
        this.i = false;
        this.j = object = new FragmentManager$b(this);
        this.k = object = new AtomicInteger();
        object = new HashMap();
        object = Collections.synchronizedMap(object);
        this.l = object;
        object = new HashMap();
        object = Collections.synchronizedMap(object);
        this.m = object;
        object = new HashMap();
        object = Collections.synchronizedMap(object);
        this.n = object;
        object = new ArrayList();
        this.o = object;
        this.p = object = new f(this);
        object = new CopyOnWriteArrayList();
        this.q = object;
        this.r = object = new mW0(this);
        this.s = object = new nw0_0(this);
        this.t = object = new ow0_1(this);
        this.u = object = new pw0_0(this);
        this.v = object = new FragmentManager$c(this);
        this.w = -1;
        this.B = object = new FragmentManager$d(this);
        this.C = object = new Object();
        object = new ArrayDeque();
        this.G = object;
        this.Q = object = new FragmentManager$5(this);
    }

    public static Fragment F(View view) {
        while (view != null) {
            int n3 = R$id.fragment_container_view_tag;
            Object object = view.getTag(n3);
            boolean bl2 = object instanceof Fragment;
            if (bl2) {
                object = (Fragment)object;
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null) {
                return object;
            }
            n3 = (view = view.getParent()) instanceof View;
            if (n3 != 0) continue;
            view = null;
        }
        return null;
    }

    public static HashSet H(a a2) {
        Object object;
        int n3;
        HashSet<Object> hashSet = new HashSet<Object>();
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = a2.a)).size()); ++i3) {
            boolean bl2;
            object = ((k$a)a2.a.get((int)i3)).b;
            if (object == null || !(bl2 = a2.g)) continue;
            hashSet.add(object);
        }
        return hashSet;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean P(Fragment iterator) {
        boolean bl2 = ((Fragment)((Object)iterator)).mHasMenu;
        if (bl2) {
            bl2 = ((Fragment)((Object)iterator)).mMenuVisible;
            if (bl2) return true;
        }
        iterator = ((Fragment)((Object)iterator)).mChildFragmentManager.c.e().iterator();
        bl2 = false;
        boolean bl3 = false;
        do {
            boolean bl4;
            if (!(bl4 = iterator.hasNext())) return bl2;
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) continue;
            bl3 = FragmentManager.P(fragment);
        } while (!bl3);
        return true;
    }

    public static boolean R(Fragment fragment) {
        boolean bl2 = true;
        if (fragment == null) {
            return bl2;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        Fragment fragment2 = fragmentManager.A;
        boolean bl3 = fragment.equals(fragment2);
        if (!bl3 || !(bl3 = FragmentManager.R(fragment = fragmentManager.z))) {
            bl2 = false;
        }
        return bl2;
    }

    public final void A(FragmentManager$o object, boolean bl2) {
        Object object2;
        Object object3;
        int n3;
        boolean bl3;
        lw0_0 lw0_02;
        if (bl2 && ((lw0_02 = this.x) == null || (bl3 = this.K))) {
            return;
        }
        this.y(bl2);
        Object object4 = this.h;
        bl3 = false;
        lw0_02 = null;
        boolean bl4 = true;
        if (object4 != null) {
            ((a)object4).s = false;
            ((a)object4).n();
            object4 = "FragmentManager";
            n3 = 3;
            bl2 = Log.isLoggable((String)object4, (int)n3);
            if (bl2) {
                object4 = this.h;
                Objects.toString(object4);
                Objects.toString(object);
            }
            this.h.o(false, false);
            object4 = this.h;
            object3 = this.M;
            object2 = this.N;
            ((a)object4).a((ArrayList)object3, (ArrayList)object2);
            object4 = this.h.a.iterator();
            while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object3 = ((k$a)object4.next()).b;
                if (object3 == null) continue;
                ((Fragment)object3).mTransitioning = false;
            }
            this.h = null;
            bl2 = true;
        } else {
            bl2 = false;
            object4 = null;
        }
        object3 = this.M;
        object2 = this.N;
        boolean bl5 = object.a((ArrayList)object3, (ArrayList)object2);
        if (bl2 || bl5) {
            this.b = bl4;
            object = this.M;
            object4 = this.N;
            this.b0((ArrayList)object, (ArrayList)object4);
        }
        this.n0();
        bl5 = this.L;
        object4 = this.c;
        if (bl5) {
            this.L = false;
            object = ((j)object4).d().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object3 = (h)object.next();
                object2 = ((h)object3).c;
                boolean bl6 = ((Fragment)object2).mDeferStart;
                if (!bl6) continue;
                bl6 = this.b;
                if (bl6) {
                    this.L = bl4;
                    continue;
                }
                ((Fragment)object2).mDeferStart = false;
                ((h)object3).i();
            }
        }
        object = ((j)object4).b.values();
        object4 = Collections.singleton(null);
        object.removeAll((Collection<?>)object4);
        return;
        finally {
            this.d();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void B(ArrayList var1_1, ArrayList var2_2, int var3_3, int var4_4) {
        var5_5 = this;
        var6_6 = var1_1;
        var7_7 = var2_2;
        var8_8 = var3_3;
        var9_9 = var4_4;
        var10_10 = (a)var1_1.get(var3_3);
        var11_11 = var10_10.p;
        var12_12 = this.O;
        if (var12_12 == null) {
            var12_12 = new ArrayList();
            this.O = var12_12;
        } else {
            var12_12.clear();
        }
        var12_12 = var5_5.O;
        var13_13 = var5_5.c;
        var14_14 = var13_13.f();
        var12_12.addAll(var14_14);
        var12_12 = var5_5.A;
        var15_15 = var8_8;
        var16_16 = false;
        while (true) {
            block97: {
                block93: {
                    var17_17 = 1;
                    if (var15_15 >= var9_9) break;
                    var18_18 = (a)var6_6.get(var15_15);
                    var19_19 = (Boolean)var7_7.get(var15_15);
                    var20_20 = var19_19.booleanValue();
                    if (var20_20 != 0) break block93;
                    var19_19 = var5_5.O;
                    var14_14 = null;
                    for (var21_21 = 0; var21_21 < (var23_23 = (var22_22 = var18_18.a).size()); var21_21 += var29_29) {
                        block91: {
                            block94: {
                                block95: {
                                    block96: {
                                        var24_24 = (k$a)var22_22.get(var21_21);
                                        var8_8 = var24_24.a;
                                        if (var8_8 == var17_17) break block94;
                                        var17_17 = 2;
                                        if (var8_8 == var17_17) break block95;
                                        var17_17 = 3;
                                        if (var8_8 == var17_17 || var8_8 == (var17_17 = 6)) break block96;
                                        var17_17 = 7;
                                        if (var8_8 != var17_17) {
                                            var17_17 = 8;
                                            if (var8_8 == var17_17) {
                                                var17_17 = 0;
                                                var26_26 = null;
                                                var25_25 = new k$a((Fragment)var12_12, 9, 0);
                                                var22_22.add(var21_21, var25_25);
                                                var27_27 = 1;
                                                var24_24.c = var27_27;
                                                ++var21_21;
                                                var12_12 = var7_7 = var24_24.b;
                                            }
                                            while (true) {
                                                var28_28 = var13_13;
                                                var29_29 = 1;
                                                break block91;
                                                break;
                                            }
                                        }
                                        break block94;
                                    }
                                    var7_7 = var24_24.b;
                                    var19_19.remove(var7_7);
                                    if ((var7_7 = var24_24.b) != var12_12) ** continue;
                                    var25_25 = new k$a((Fragment)var7_7, 9);
                                    var22_22.add(var21_21, var25_25);
                                    ++var21_21;
                                    var28_28 = var13_13;
                                    var29_29 = 1;
                                    var30_30 = 0;
                                    var12_12 = null;
                                    break block91;
                                }
                                var7_7 = var24_24.b;
                                var8_8 = var7_7.mContainerId;
                                var31_31 = false;
                                for (var17_17 = var19_19.size() + -1; var17_17 >= 0; var17_17 += -1) {
                                    var32_32 = var19_19.get(var17_17);
                                    var28_28 = var13_13;
                                    var13_13 = var32_32;
                                    var13_13 = (Fragment)var32_32;
                                    var29_29 = var13_13.mContainerId;
                                    if (var29_29 == var8_8) {
                                        if (var13_13 == var7_7) {
                                            var33_33 = var8_8;
                                            var29_29 = 1;
                                            var31_31 = true;
                                        } else {
                                            if (var13_13 == var12_12) {
                                                var33_33 = var8_8;
                                                var8_8 = 9;
                                                var6_6 = new k$a((Fragment)var13_13, var8_8, 0);
                                                var22_22.add(var21_21, var6_6);
                                                ++var21_21;
                                                var29_29 = 0;
                                                var6_6 = null;
                                                var30_30 = 0;
                                                var12_12 = null;
                                            } else {
                                                var33_33 = var8_8;
                                                var29_29 = 0;
                                                var6_6 = null;
                                                var8_8 = 9;
                                            }
                                            var30_30 = 3;
                                            var25_25 = new k$a((Fragment)var13_13, var30_30, 0);
                                            var25_25.d = var29_29 = var24_24.d;
                                            var25_25.f = var29_29 = var24_24.f;
                                            var25_25.e = var29_29 = var24_24.e;
                                            var25_25.g = var29_29 = var24_24.g;
                                            var22_22.add(var21_21, var25_25);
                                            var19_19.remove(var13_13);
                                            var29_29 = 1;
                                            var21_21 += var29_29;
                                        }
                                    } else {
                                        var33_33 = var8_8;
                                        var29_29 = 1;
                                    }
                                    var6_6 = var1_1;
                                    var8_8 = var33_33;
                                    var13_13 = var28_28;
                                }
                                var28_28 = var13_13;
                                var29_29 = 1;
                                if (var31_31) {
                                    var22_22.remove(var21_21);
                                    var21_21 += -1;
                                } else {
                                    var24_24.a = var29_29;
                                    var24_24.c = var29_29;
                                    var19_19.add(var7_7);
                                }
                                break block91;
                            }
                            var28_28 = var13_13;
                            var29_29 = 1;
                            var7_7 = var24_24.b;
                            var19_19.add(var7_7);
                        }
                        var6_6 = var1_1;
                        var7_7 = var2_2;
                        var8_8 = var3_3;
                        var13_13 = var28_28;
                        var17_17 = 1;
                    }
                    var28_28 = var13_13;
                    break block97;
                }
                var28_28 = var13_13;
                var29_29 = 1;
                var7_7 = var5_5.O;
                var25_25 = var18_18.a;
                for (var34_34 = var25_25.size() - var29_29; var34_34 >= 0; var34_34 += -1) {
                    var14_14 = (k$a)var25_25.get(var34_34);
                    var23_23 = var14_14.a;
                    if (var23_23 == var29_29) ** GOTO lbl175
                    var29_29 = 3;
                    if (var23_23 == var29_29) ** GOTO lbl-1000
                    switch (var23_23) {
                        default: {
                            break;
                        }
                        case 10: {
                            var24_24 = var14_14.h;
                            var14_14.i = var24_24;
                            break;
                        }
                        case 9: {
                            var12_12 = var14_14.b;
                            break;
                        }
                        case 8: {
                            var30_30 = 0;
                            var12_12 = null;
                            break;
                        }
                        case 6: lbl-1000:
                        // 2 sources

                        {
                            var14_14 = var14_14.b;
                            var7_7.add(var14_14);
                            break;
                        }
lbl175:
                        // 1 sources

                        var29_29 = 3;
                        case 7: {
                            var14_14 = var14_14.b;
                            var7_7.remove(var14_14);
                        }
                    }
                    var29_29 = 1;
                }
            }
            var16_16 = var16_16 || (var29_29 = (int)var18_18.g) != 0;
            ++var15_15;
            var6_6 = var1_1;
            var7_7 = var2_2;
            var8_8 = var3_3;
            var13_13 = var28_28;
        }
        var28_28 = var13_13;
        var6_6 = var5_5.O;
        var6_6.clear();
        if (var11_11 == 0 && (var29_29 = var5_5.w) >= (var27_27 = 1)) {
            for (var29_29 = var3_3; var29_29 < var9_9; ++var29_29) {
                var7_7 = var1_1;
                var25_25 = ((a)var1_1.get((int)var29_29)).a.iterator();
                while ((var11_11 = var25_25.hasNext()) != 0) {
                    var10_10 = ((k$a)var25_25.next()).b;
                    if (var10_10 != null && (var12_12 = var10_10.mFragmentManager) != null) {
                        var10_10 = var5_5.g((Fragment)var10_10);
                        var12_12 = var28_28;
                        var28_28.g((h)var10_10);
                    } else {
                        var12_12 = var28_28;
                    }
                    var28_28 = var12_12;
                }
                var12_12 = var28_28;
            }
        }
        var7_7 = var1_1;
        var29_29 = var3_3;
        while (true) {
            block92: {
                block98: {
                    var8_8 = -1;
                    if (var29_29 >= var9_9) break;
                    var10_10 = (a)var7_7.get(var29_29);
                    var12_12 = var2_2;
                    var13_13 = (Boolean)var2_2.get(var29_29);
                    var34_34 = (int)var13_13.booleanValue();
                    var14_14 = "FragmentManager";
                    var35_35 = "Unknown cmd: ";
                    if (var34_34 == 0) break block98;
                    var10_10.m(var8_8);
                    var25_25 = var10_10.a;
                    var34_34 = var25_25.size();
                    var23_23 = 1;
                    var34_34 -= var23_23;
                    while (var34_34 >= 0) {
                        var26_26 = (k$a)var25_25.get(var34_34);
                        var22_22 = var26_26.b;
                        if (var22_22 != null) {
                            var18_18 = null;
                            var22_22.mBeingSaved = false;
                            var22_22.setPopDirection((boolean)var23_23);
                            var23_23 = var10_10.f;
                            var36_36 = 8194;
                            var20_20 = 4097;
                            if (var23_23 != var20_20) {
                                if (var23_23 != var36_36) {
                                    var36_36 = 4100;
                                    var20_20 = 8197;
                                    if (var23_23 != var20_20) {
                                        var20_20 = 4099;
                                        if (var23_23 != var20_20) {
                                            if (var23_23 != var36_36) {
                                                var36_36 = 0;
                                                var18_18 = null;
                                            } else {
                                                var36_36 = 8197;
                                            }
                                        } else {
                                            var36_36 = 4099;
                                        }
                                    }
                                } else {
                                    var36_36 = 4097;
                                }
                            }
                            var22_22.setNextTransition(var36_36);
                            var24_24 = var10_10.o;
                            var18_18 = var10_10.n;
                            var22_22.setSharedElementNames((ArrayList)var24_24, (ArrayList)var18_18);
                        }
                        var23_23 = var26_26.a;
                        var18_18 = var10_10.r;
                        block7 : switch (var23_23 ? 1 : 0) {
                            default: {
                                var7_7 = new StringBuilder((String)var35_35);
                                var8_8 = var26_26.a;
                                var7_7.append(var8_8);
                                var7_7 = var7_7.toString();
                                var6_6 = new IllegalArgumentException((String)var7_7);
                                throw var6_6;
                            }
                            case 10: {
                                var24_24 = var26_26.h;
                                var18_18.i0((Fragment)var22_22, (i$b)var24_24);
lbl270:
                                // 3 sources

                                while (true) {
                                    var37_37 = var25_25;
lbl272:
                                    // 7 sources

                                    while (true) {
                                        var8_8 = 1;
                                        break block7;
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 9: {
                                var18_18.j0((Fragment)var22_22);
                                ** GOTO lbl270
                            }
                            case 8: {
                                var23_23 = 0;
                                var24_24 = null;
                                var18_18.j0(null);
                                ** continue;
                            }
                            case 7: {
                                var23_23 = var26_26.d;
                                var20_20 = var26_26.e;
                                var37_37 = var25_25;
                                var8_8 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var23_23, var20_20, var8_8, var17_17);
                                var8_8 = 1;
                                var18_18.g0((Fragment)var22_22, (boolean)var8_8);
                                var18_18.h((Fragment)var22_22);
                                ** GOTO lbl272
                            }
                            case 6: {
                                var37_37 = var25_25;
                                var8_8 = var26_26.d;
                                var23_23 = var26_26.e;
                                var20_20 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var8_8, var23_23, var20_20, var17_17);
                                var18_18.c((Fragment)var22_22);
                                ** GOTO lbl272
                            }
                            case 5: {
                                var37_37 = var25_25;
                                var8_8 = var26_26.d;
                                var23_23 = var26_26.e;
                                var20_20 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var8_8, var23_23, var20_20, var17_17);
                                var8_8 = 1;
                                var18_18.g0((Fragment)var22_22, (boolean)var8_8);
                                var18_18.O((Fragment)var22_22);
                                ** GOTO lbl272
                            }
                            case 4: {
                                var37_37 = var25_25;
                                var8_8 = var26_26.d;
                                var23_23 = var26_26.e;
                                var20_20 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var8_8, var23_23, var20_20, var17_17);
                                var18_18.getClass();
                                var8_8 = 2;
                                var23_23 = (int)Log.isLoggable((String)var14_14, (int)var8_8);
                                if (var23_23 != 0) {
                                    Objects.toString(var22_22);
                                }
                                if ((var8_8 = (int)var22_22.mHidden) == 0) ** GOTO lbl272
                                var25_25 = null;
                                var22_22.mHidden = false;
                                var8_8 = (int)var22_22.mHiddenChanged;
                                var23_23 = 1;
                                var22_22.mHiddenChanged = var8_8 ^= var23_23;
                                ** GOTO lbl272
                            }
                            case 3: {
                                var37_37 = var25_25;
                                var8_8 = var26_26.d;
                                var23_23 = var26_26.e;
                                var20_20 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var8_8, var23_23, var20_20, var17_17);
                                var18_18.a((Fragment)var22_22);
                                ** continue;
                            }
                            case 1: {
                                var37_37 = var25_25;
                                var8_8 = var26_26.d;
                                var23_23 = var26_26.e;
                                var20_20 = var26_26.f;
                                var17_17 = var26_26.g;
                                var22_22.setAnimations(var8_8, var23_23, var20_20, var17_17);
                                var8_8 = 1;
                                var18_18.g0((Fragment)var22_22, (boolean)var8_8);
                                var18_18.a0((Fragment)var22_22);
                            }
                        }
                        var34_34 += -1;
                        var25_25 = var37_37;
                        var23_23 = 1;
                    }
                    while (true) {
                        break block92;
                        break;
                    }
                }
                var8_8 = 1;
                var10_10.m(var8_8);
                var25_25 = var10_10.a;
                var34_34 = var25_25.size();
                var17_17 = 0;
                var26_26 = null;
                while (true) {
                    if (var17_17 >= var34_34) ** continue;
                    var24_24 = (k$a)var25_25.get(var17_17);
                    var22_22 = var24_24.b;
                    if (var22_22 != null) {
                        var22_22.mBeingSaved = false;
                        var22_22.setPopDirection(false);
                        var36_36 = var10_10.f;
                        var22_22.setNextTransition(var36_36);
                        var18_18 = var10_10.n;
                        var19_19 = var10_10.o;
                        var22_22.setSharedElementNames((ArrayList)var18_18, (ArrayList)var19_19);
                    }
                    var36_36 = var24_24.a;
                    var19_19 = var10_10.r;
                    block18 : switch (var36_36) {
                        default: {
                            var7_7 = new StringBuilder((String)var35_35);
                            var8_8 = var24_24.a;
                            var7_7.append(var8_8);
                            var7_7 = var7_7.toString();
                            var6_6 = new IllegalArgumentException((String)var7_7);
                            throw var6_6;
                        }
                        case 10: {
                            var24_24 = var24_24.i;
                            var19_19.i0((Fragment)var22_22, (i$b)var24_24);
lbl394:
                            // 3 sources

                            while (true) {
                                var37_37 = var25_25;
                                var38_38 = var10_10;
lbl397:
                                // 7 sources

                                while (true) {
                                    var11_11 = 0;
                                    var10_10 = null;
                                    break block18;
                                    break;
                                }
                                break;
                            }
                        }
                        case 9: {
                            var23_23 = 0;
                            var24_24 = null;
                            var19_19.j0(null);
                            ** GOTO lbl394
                        }
                        case 8: {
                            var19_19.j0((Fragment)var22_22);
                            ** continue;
                        }
                        case 7: {
                            var36_36 = var24_24.d;
                            var37_37 = var25_25;
                            var8_8 = var24_24.e;
                            var38_38 = var10_10;
                            var11_11 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var36_36, var8_8, var11_11, var23_23);
                            var8_8 = 0;
                            var25_25 = null;
                            var19_19.g0((Fragment)var22_22, false);
                            var19_19.c((Fragment)var22_22);
                            ** GOTO lbl397
                        }
                        case 6: {
                            var37_37 = var25_25;
                            var38_38 = var10_10;
                            var8_8 = var24_24.d;
                            var11_11 = var24_24.e;
                            var36_36 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var8_8, var11_11, var36_36, var23_23);
                            var19_19.h((Fragment)var22_22);
                            ** GOTO lbl397
                        }
                        case 5: {
                            var37_37 = var25_25;
                            var38_38 = var10_10;
                            var8_8 = var24_24.d;
                            var11_11 = var24_24.e;
                            var36_36 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var8_8, var11_11, var36_36, var23_23);
                            var8_8 = 0;
                            var25_25 = null;
                            var19_19.g0((Fragment)var22_22, false);
                            var11_11 = 2;
                            var23_23 = (int)Log.isLoggable((String)var14_14, (int)var11_11);
                            if (var23_23 != 0) {
                                Objects.toString(var22_22);
                            }
                            if ((var23_23 = (int)var22_22.mHidden) == 0) ** GOTO lbl397
                            var22_22.mHidden = false;
                            var8_8 = (int)var22_22.mHiddenChanged;
                            var23_23 = 1;
                            var22_22.mHiddenChanged = var8_8 ^= var23_23;
                            ** GOTO lbl397
                        }
                        case 4: {
                            var37_37 = var25_25;
                            var38_38 = var10_10;
                            var8_8 = var24_24.d;
                            var36_36 = var24_24.e;
                            var11_11 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var8_8, var36_36, var11_11, var23_23);
                            var19_19.O((Fragment)var22_22);
                            ** GOTO lbl397
                        }
                        case 3: {
                            var37_37 = var25_25;
                            var38_38 = var10_10;
                            var8_8 = var24_24.d;
                            var11_11 = var24_24.e;
                            var36_36 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var8_8, var11_11, var36_36, var23_23);
                            var19_19.a0((Fragment)var22_22);
                            ** continue;
                        }
                        case 1: {
                            var37_37 = var25_25;
                            var38_38 = var10_10;
                            var8_8 = var24_24.d;
                            var11_11 = var24_24.e;
                            var36_36 = var24_24.f;
                            var23_23 = var24_24.g;
                            var22_22.setAnimations(var8_8, var11_11, var36_36, var23_23);
                            var11_11 = 0;
                            var10_10 = null;
                            var19_19.g0((Fragment)var22_22, false);
                            var19_19.a((Fragment)var22_22);
                        }
                    }
                    ++var17_17;
                    var25_25 = var37_37;
                    var10_10 = var38_38;
                }
            }
            var11_11 = 0;
            var10_10 = null;
            ++var29_29;
        }
        var12_12 = var2_2;
        var11_11 = 0;
        var10_10 = null;
        var29_29 = var9_9 + -1;
        var6_6 = (Boolean)var2_2.get(var29_29);
        var29_29 = (int)var6_6.booleanValue();
        var13_13 = var5_5.o;
        if (var16_16 && (var21_21 = (int)var13_13.isEmpty()) == 0) {
            var14_14 = new LinkedHashSet();
            var35_35 = var1_1.iterator();
            while ((var23_23 = (int)var35_35.hasNext()) != 0) {
                var24_24 = FragmentManager.H((a)var35_35.next());
                var14_14.addAll(var24_24);
            }
            var35_35 = var5_5.h;
            if (var35_35 == null) {
                var35_35 = var13_13.iterator();
                while ((var23_23 = (int)var35_35.hasNext()) != 0) {
                    var24_24 = (FragmentManager$n)var35_35.next();
                    var26_26 = var14_14.iterator();
                    while (var39_39 = var26_26.hasNext()) {
                        var22_22 = (Fragment)var26_26.next();
                        var24_24.getClass();
                    }
                }
                var35_35 = var13_13.iterator();
                while ((var23_23 = (int)var35_35.hasNext()) != 0) {
                    var24_24 = (FragmentManager$n)var35_35.next();
                    var26_26 = var14_14.iterator();
                    while (var39_39 = var26_26.hasNext()) {
                        var22_22 = (Fragment)var26_26.next();
                        var24_24.getClass();
                    }
                }
            }
        }
        for (var21_21 = var3_3; var21_21 < var9_9; ++var21_21) {
            var35_35 = (a)var7_7.get(var21_21);
            if (var29_29 != 0) {
                var24_24 = var35_35.a;
                var23_23 = var24_24.size();
                var17_17 = 1;
                var23_23 -= var17_17;
                while (var23_23 >= 0) {
                    var26_26 = ((k$a)var35_35.a.get((int)var23_23)).b;
                    if (var26_26 != null) {
                        var26_26 = var5_5.g((Fragment)var26_26);
                        var26_26.i();
                    }
                    var23_23 += -1;
                }
                continue;
            }
            var35_35 = var35_35.a.iterator();
            while ((var23_23 = (int)var35_35.hasNext()) != 0) {
                var24_24 = ((k$a)var35_35.next()).b;
                if (var24_24 == null) continue;
                var24_24 = var5_5.g((Fragment)var24_24);
                var24_24.i();
            }
        }
        var21_21 = var5_5.w;
        var15_15 = 1;
        var5_5.T(var21_21, (boolean)var15_15);
        var21_21 = var3_3;
        var35_35 = var5_5.f((ArrayList)var7_7, var3_3, var9_9).iterator();
        while ((var23_23 = (int)var35_35.hasNext()) != 0) {
            var24_24 = (n)var35_35.next();
            var24_24.e = var29_29;
            var24_24.k();
            var24_24.e();
        }
        while (var21_21 < var9_9) {
            var6_6 = (a)var7_7.get(var21_21);
            var35_35 = (Boolean)var12_12.get(var21_21);
            var15_15 = (int)var35_35.booleanValue();
            if (var15_15 != 0 && (var15_15 = var6_6.t) >= 0) {
                var6_6.t = var8_8;
            }
            if ((var35_35 = var6_6.q) != null) {
                var26_26 = null;
                for (var17_17 = 0; var17_17 < (var15_15 = (var35_35 = var6_6.q).size()); ++var17_17) {
                    var35_35 = (Runnable)var6_6.q.get(var17_17);
                    var35_35.run();
                }
                var15_15 = 0;
                var35_35 = null;
                var6_6.q = null;
            } else {
                var15_15 = 0;
                var35_35 = null;
            }
            ++var21_21;
        }
        if (var16_16) {
            var14_14 = null;
            for (var21_21 = 0; var21_21 < (var29_29 = var13_13.size()); ++var21_21) {
                var6_6 = (FragmentManager$n)var13_13.get(var21_21);
                var6_6.a();
            }
        }
    }

    public final void C() {
        this.z(true);
        this.G();
    }

    public final Fragment D(int n3) {
        Fragment fragment;
        block3: {
            int n4;
            Object object = this.c;
            Object object2 = ((j)object).a;
            for (int i3 = ((ArrayList)object2).size() + -1; i3 >= 0; i3 += -1) {
                int n7;
                fragment = (Fragment)((ArrayList)object2).get(i3);
                if (fragment == null || (n7 = fragment.mFragmentId) != n3) {
                    continue;
                }
                break block3;
            }
            object = ((j)object).b.values().iterator();
            while ((n4 = object.hasNext()) != 0) {
                object2 = (h)object.next();
                if (object2 == null) continue;
                fragment = ((h)object2).c;
                n4 = fragment.mFragmentId;
                if (n4 != n3) continue;
                break block3;
            }
            fragment = null;
        }
        return fragment;
    }

    public final Fragment E(String string2) {
        Fragment fragment;
        block6: {
            Object object;
            Object object2 = this.c;
            if (string2 != null) {
                object = ((j)object2).a;
                for (int i3 = ((ArrayList)object).size() + -1; i3 >= 0; i3 += -1) {
                    String string3;
                    boolean bl2;
                    fragment = (Fragment)((ArrayList)object).get(i3);
                    if (fragment == null || !(bl2 = string2.equals(string3 = fragment.mTag))) {
                        continue;
                    }
                    break block6;
                }
            }
            if (string2 != null) {
                boolean bl3;
                object2 = ((j)object2).b.values().iterator();
                while (bl3 = object2.hasNext()) {
                    object = (h)object2.next();
                    if (object == null) continue;
                    fragment = ((h)object).c;
                    object = fragment.mTag;
                    bl3 = string2.equals(object);
                    if (!bl3) continue;
                    break block6;
                }
            } else {
                object2.getClass();
            }
            fragment = null;
        }
        return fragment;
    }

    public final void G() {
        boolean bl2;
        Iterator iterator = this.e().iterator();
        while (bl2 = iterator.hasNext()) {
            n n3 = (n)iterator.next();
            boolean bl3 = n3.f;
            if (!bl3) continue;
            int n4 = 2;
            Log.isLoggable((String)"FragmentManager", (int)n4);
            bl3 = false;
            n3.f = false;
            n3.e();
        }
    }

    public final FragmentManager$j I(int n3) {
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        if (n3 == n4) {
            Object object = this.h;
            if (object != null) {
                return object;
            }
            object = new IndexOutOfBoundsException();
            throw object;
        }
        return (FragmentManager$j)this.d.get(n3);
    }

    public final int J() {
        int n3;
        ArrayList arrayList = this.d;
        int n4 = arrayList.size();
        a a2 = this.h;
        if (a2 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            a2 = null;
        }
        return n4 + n3;
    }

    public final Fragment K(Bundle object, String string2) {
        if ((object = object.getString(string2)) == null) {
            return null;
        }
        Object object2 = this.c.b((String)object);
        if (object2 != null) {
            return object2;
        }
        object = UX.c("Fragment no longer exists for key ", string2, ": unique id ", (String)object);
        object2 = new IllegalStateException((String)object);
        this.l0((IllegalStateException)object2);
        throw null;
    }

    public final ViewGroup L(Fragment fragment) {
        int n3;
        Object object = fragment.mContainer;
        if (object != null) {
            return object;
        }
        int n4 = fragment.mContainerId;
        if (n4 <= 0) {
            return null;
        }
        object = this.y;
        n4 = (int)(((cw0_0)object).c() ? 1 : 0);
        if (n4 != 0 && (n4 = (fragment = ((cw0_0)(object = this.y)).b(n3 = fragment.mContainerId)) instanceof ViewGroup) != 0) {
            return (ViewGroup)fragment;
        }
        return null;
    }

    public final d M() {
        Fragment fragment = this.z;
        if (fragment != null) {
            return fragment.mFragmentManager.M();
        }
        return this.B;
    }

    public final ga3_0 N() {
        Fragment fragment = this.z;
        if (fragment != null) {
            return fragment.mFragmentManager.N();
        }
        return this.C;
    }

    public final void O(Fragment fragment) {
        String string2 = "FragmentManager";
        int n3 = 2;
        int n4 = (int)(Log.isLoggable((String)string2, (int)n3) ? 1 : 0);
        if (n4 != 0) {
            Objects.toString(fragment);
        }
        if ((n4 = fragment.mHidden) == 0) {
            n4 = 1;
            fragment.mHidden = n4;
            n3 = (int)(fragment.mHiddenChanged ? 1 : 0);
            fragment.mHiddenChanged = n4 ^= n3;
            this.k0(fragment);
        }
    }

    public final boolean Q() {
        Object object = this.z;
        boolean bl2 = true;
        if (object == null) {
            return bl2;
        }
        boolean bl3 = ((Fragment)object).isAdded();
        if (!bl3 || !(bl3 = ((FragmentManager)(object = this.z.getParentFragmentManager())).Q())) {
            bl2 = false;
        }
        return bl2;
    }

    public final boolean S() {
        boolean bl2 = this.I;
        bl2 = bl2 || (bl2 = this.J);
        return bl2;
    }

    public final void T(int n3, boolean n4) {
        int n7;
        boolean bl2;
        Object object;
        int n8;
        Object object2 = this.x;
        if (object2 == null && n3 != (n8 = -1)) {
            IllegalStateException illegalStateException = new IllegalStateException("No activity");
            throw illegalStateException;
        }
        if (n4 == 0 && n3 == (n4 = this.w)) {
            return;
        }
        this.w = n3;
        Object object3 = this.c;
        Object object4 = ((j)object3).a.iterator();
        while (true) {
            n8 = (int)(object4.hasNext() ? 1 : 0);
            object = ((j)object3).b;
            if (n8 == 0) break;
            object2 = ((Fragment)object4.next()).mWho;
            if ((object2 = (h)((HashMap)object).get(object2)) == null) continue;
            ((h)object2).i();
        }
        object4 = ((HashMap)object).values().iterator();
        while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            String string2;
            HashMap hashMap;
            object2 = (h)object4.next();
            if (object2 == null) continue;
            ((h)object2).i();
            object = ((h)object2).c;
            bl2 = ((Fragment)object).mRemoving;
            if (!bl2 || (bl2 = ((Fragment)object).isInBackStack())) continue;
            bl2 = ((Fragment)object).mBeingSaved;
            if (bl2 && !(bl2 = (hashMap = ((j)object3).c).containsKey(string2 = ((Fragment)object).mWho))) {
                object = ((Fragment)object).mWho;
                hashMap = ((h)object2).l();
                ((j)object3).i((Bundle)hashMap, (String)object);
            }
            ((j)object3).h((h)object2);
        }
        object3 = ((j)object3).d().iterator();
        while (true) {
            n4 = (int)(object3.hasNext() ? 1 : 0);
            n8 = 0;
            object2 = null;
            if (n4 == 0) break;
            object4 = (h)object3.next();
            object = ((h)object4).c;
            bl2 = ((Fragment)object).mDeferStart;
            if (!bl2) continue;
            bl2 = this.b;
            if (bl2) {
                n4 = 1;
                this.L = n4;
                continue;
            }
            ((Fragment)object).mDeferStart = false;
            ((h)object4).i();
        }
        n3 = (int)(this.H ? 1 : 0);
        if (n3 != 0 && (object3 = this.x) != null && (n4 = this.w) == (n7 = 7)) {
            ((lw0_0)object3).i();
            this.H = false;
        }
    }

    public final void U() {
        boolean bl2;
        Object object = this.x;
        if (object == null) {
            return;
        }
        this.I = false;
        this.J = false;
        Object object2 = this.P;
        ((g)object2).f = false;
        object = this.c.f().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Fragment)object.next();
            if (object2 == null) continue;
            ((Fragment)object2).noteStateNotSaved();
        }
    }

    public final void V() {
        FragmentManager$p fragmentManager$p = new FragmentManager$p(this, null, -1, 0);
        this.x(fragmentManager$p, false);
    }

    public final boolean W() {
        return this.X(-1, 0, null);
    }

    public final boolean X(int n3, int n4, String set) {
        Object object;
        boolean bl2;
        this.z(false);
        boolean bl3 = true;
        this.y(bl3);
        Object object2 = this.A;
        if (object2 != null && n3 < 0 && set == null && (bl2 = ((FragmentManager)(object2 = ((Fragment)object2).getChildFragmentManager())).W())) {
            return bl3;
        }
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.N;
        Object object3 = this;
        if ((n3 = (int)(this.Y(arrayList, arrayList2, (String)((Object)set), n3, n4) ? 1 : 0)) != 0) {
            this.b = bl3;
            try {
                object = this.M;
                set = this.N;
                this.b0((ArrayList)object, (ArrayList)((Object)set));
            }
            finally {
                this.d();
            }
        }
        this.n0();
        n4 = (int)(this.L ? 1 : 0);
        set = this.c;
        if (n4 != 0) {
            this.L = false;
            object = ((j)((Object)set)).d().iterator();
            while (bl2 = object.hasNext()) {
                object2 = (h)object.next();
                object3 = ((h)object2).c;
                boolean bl4 = ((Fragment)object3).mDeferStart;
                if (!bl4) continue;
                bl4 = this.b;
                if (bl4) {
                    this.L = bl3;
                    continue;
                }
                ((Fragment)object3).mDeferStart = false;
                ((h)object2).i();
            }
        }
        object = ((j)((Object)set)).b.values();
        set = Collections.singleton(null);
        object.removeAll(set);
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean Y(ArrayList arrayList, ArrayList arrayList2, String object, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        block14: {
            int n14;
            block15: {
                block17: {
                    String string2;
                    ArrayList arrayList3;
                    Object object2;
                    block16: {
                        n10 = 1;
                        if ((n4 &= n10) != 0) {
                            n4 = 1;
                        } else {
                            n4 = 0;
                            object2 = null;
                        }
                        arrayList3 = this.d;
                        n14 = arrayList3.isEmpty();
                        n8 = -1;
                        if (n14 != 0) break block14;
                        if (object != null || n3 >= 0) break block16;
                        if (n4 != 0) {
                            n8 = 0;
                            string2 = null;
                            break block14;
                        } else {
                            object = this.d;
                            n7 = ((ArrayList)object).size();
                            n8 = n7 + -1;
                        }
                        break block14;
                    }
                    arrayList3 = this.d;
                    for (n14 = arrayList3.size() - n10; n14 >= 0; n14 += -1) {
                        int n15;
                        String string3;
                        boolean bl2;
                        a a2 = (a)this.d.get(n14);
                        if (object != null && (bl2 = ((String)object).equals(string3 = a2.i)) || n3 >= 0 && n3 == (n15 = a2.t)) break;
                    }
                    if (n14 < 0) break block15;
                    if (n4 == 0) break block17;
                    while (n14 > 0) {
                        object2 = this.d;
                        n8 = n14 + -1;
                        object2 = (a)((ArrayList)object2).get(n8);
                        if (object != null && (n8 = (int)(((String)object).equals(string2 = ((k)object2).i) ? 1 : 0)) != 0 || n3 >= 0 && n3 == (n4 = ((a)object2).t)) {
                            n14 += -1;
                            continue;
                        }
                        break block15;
                    }
                    break block15;
                }
                object = this.d;
                n7 = ((ArrayList)object).size() - n10;
                if (n14 == n7) break block14;
                ++n14;
            }
            n8 = n14;
        }
        if (n8 < 0) {
            return false;
        }
        object = this.d;
        n7 = ((ArrayList)object).size() - n10;
        while (n7 >= n8) {
            Object object3 = (a)this.d.remove(n7);
            arrayList.add(object3);
            object3 = Boolean.TRUE;
            arrayList2.add(object3);
            n7 += -1;
        }
        return n10 != 0;
    }

    public final void Z(Bundle object, Fragment object2, String string2) {
        FragmentManager fragmentManager = ((Fragment)object2).mFragmentManager;
        if (fragmentManager == this) {
            object2 = ((Fragment)object2).mWho;
            object.putString(string2, (String)object2);
            return;
        }
        object2 = tv0_1.b("Fragment ", (Fragment)object2, " is not currently in the FragmentManager");
        object = new IllegalStateException((String)object2);
        this.l0((IllegalStateException)object);
        throw null;
    }

    public final h a(Fragment fragment) {
        int n3;
        boolean bl2;
        Object object = fragment.mPreviousWho;
        if (object != null) {
            zw0_0.d(fragment, (String)object);
        }
        if (bl2 = Log.isLoggable((String)(object = "FragmentManager"), (int)(n3 = 2))) {
            fragment.toString();
        }
        object = this.g(fragment);
        fragment.mFragmentManager = this;
        j j3 = this.c;
        j3.g((h)object);
        boolean bl3 = fragment.mDetached;
        if (!bl3) {
            boolean bl4;
            j3.a(fragment);
            n3 = 0;
            j3 = null;
            fragment.mRemoving = false;
            View view = fragment.mView;
            if (view == null) {
                fragment.mHiddenChanged = false;
            }
            if (bl4 = FragmentManager.P(fragment)) {
                this.H = bl4 = true;
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a0(Fragment fragment) {
        Object object = "FragmentManager";
        int n3 = 2;
        int n4 = Log.isLoggable((String)object, (int)n3);
        if (n4 != 0) {
            Objects.toString(fragment);
            n4 = fragment.mBackStackNesting;
        }
        n4 = fragment.isInBackStack();
        n3 = 1;
        boolean bl2 = fragment.mDetached;
        if (!bl2 || (n4 ^= n3) != 0) {
            object = this.c;
            ArrayList arrayList = ((j)object).a;
            synchronized (arrayList) {
                object = ((j)object).a;
                ((ArrayList)object).remove(fragment);
            }
            object = null;
            fragment.mAdded = false;
            n4 = (int)(FragmentManager.P(fragment) ? 1 : 0);
            if (n4 != 0) {
                this.H = n3;
            }
            fragment.mRemoving = n3;
            this.k0(fragment);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(lw0_0 object, cw0_0 object2, Fragment fragment) {
        Object object3;
        Object object4;
        boolean bl2;
        Object object5 = this.x;
        if (object5 != null) {
            object = new IllegalStateException("Already attached");
            throw object;
        }
        this.x = object;
        this.y = object2;
        this.z = fragment;
        object2 = this.q;
        if (fragment != null) {
            object5 = new FragmentManager$g(fragment);
            ((CopyOnWriteArrayList)object2).add(object5);
        } else {
            boolean bl3 = object instanceof uW0;
            if (bl3) {
                object5 = object;
                object5 = (uW0)object;
                ((CopyOnWriteArrayList)object2).add(object5);
            }
        }
        object2 = this.z;
        if (object2 != null) {
            this.n0();
        }
        if (bl2 = object instanceof h82_0) {
            object2 = object;
            object2 = (h82_0)object;
            this.g = object5 = object2.getOnBackPressedDispatcher();
            if (fragment != null) {
                object2 = fragment;
            }
            object4 = this.j;
            ((d82_0)object5).a((mu1_1)object2, (W72)object4);
        }
        if (fragment != null) {
            object = fragment.mFragmentManager.P;
            object2 = ((g)object).b;
            object5 = fragment.mWho;
            if ((object5 = (g)((HashMap)object2).get(object5)) == null) {
                boolean bl4 = ((g)object).d;
                object5 = new g(bl4);
                object = fragment.mWho;
                ((HashMap)object2).put(object, object5);
            }
            this.P = object5;
        } else {
            bl2 = object instanceof sD3;
            if (bl2) {
                object = ((sD3)object).getViewModelStore();
                object2 = androidx.fragment.app.g.g;
                object5 = "store";
                Intrinsics.checkNotNullParameter(object, (String)object5);
                object4 = "factory";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object3 = Wd0$a.b;
                Intrinsics.checkNotNullParameter(object, (String)object5);
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
                object5 = new pD3((rd3_0)object, (E$b)object2, (Wd0)object3);
                object = g.class;
                object2 = "modelClass";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object4 = "<this>";
                object = sw0_0.a((Class)object, (String)object4, (Class)object, (String)object2, (String)object2);
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object2 = object.getQualifiedName();
                if (object2 == null) {
                    object2 = "Local and anonymous classes can not be ViewModels".toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object2 = ((String)object4).concat((String)object2);
                this.P = object = (g)((pD3)object5).a((yn1_2)object, (String)object2);
            } else {
                bl2 = false;
                object2 = null;
                this.P = object = new g(false);
            }
        }
        object = this.P;
        ((g)object).f = bl2 = this.S();
        object = this.P;
        object2 = this.c;
        ((j)object2).d = object;
        object = this.x;
        bl2 = object instanceof zs2_1;
        if (bl2 && fragment == null) {
            object = ((zs2_1)object).getSavedStateRegistry();
            object2 = new qW0(this);
            object5 = "android:support:fragments";
            ((xs2_1)object).c((String)object5, (xS2$b)object2);
            object = ((xs2_1)object).a((String)object5);
            if (object != null) {
                this.c0((Bundle)object);
            }
        }
        if (bl2 = (object = this.x) instanceof O3) {
            object = ((O3)object).getActivityResultRegistry();
            if (fragment != null) {
                object2 = new StringBuilder();
                object5 = fragment.mWho;
                object4 = ":";
                object2 = h30_0.a((StringBuilder)object2, (String)object5, (String)object4);
            } else {
                object2 = "";
            }
            object2 = kp1_0.c("FragmentManager:", (String)object2);
            object5 = Ft2.a((String)object2, "StartActivityForResult");
            object4 = new x3();
            object3 = new FragmentManager$h(this);
            this.D = object5 = ((K3)object).d((String)object5, (x3)object4, (w3)object3);
            object5 = Ft2.a((String)object2, "StartIntentSenderForResult");
            object4 = new x3();
            object3 = new FragmentManager$i(this);
            this.E = object5 = ((K3)object).d((String)object5, (x3)object4, (w3)object3);
            object2 = Ft2.a((String)object2, "RequestPermissions");
            object5 = new x3();
            object4 = new FragmentManager$a(this);
            this.F = object = ((K3)object).d((String)object2, (x3)object5, (w3)object4);
        }
        if (bl2 = (object = this.x) instanceof s82) {
            object = (s82)object;
            object2 = this.r;
            object.addOnConfigurationChangedListener((p60_0)object2);
        }
        if (bl2 = (object = this.x) instanceof j92_0) {
            object = (j92_0)object;
            object2 = this.s;
            object.addOnTrimMemoryListener((p60_0)object2);
        }
        if (bl2 = (object = this.x) instanceof I82) {
            object = (I82)object;
            object2 = this.t;
            object.addOnMultiWindowModeChangedListener((p60_0)object2);
        }
        if (bl2 = (object = this.x) instanceof O82) {
            object = (O82)object;
            object2 = this.u;
            object.addOnPictureInPictureModeChangedListener((p60_0)object2);
        }
        if ((bl2 = (object = this.x) instanceof WN1) && fragment == null) {
            object = (WN1)object;
            object2 = this.v;
            object.addMenuProvider((fo1_0)object2);
        }
    }

    public final void b0(ArrayList serializable, ArrayList arrayList) {
        int n3;
        boolean n4 = ((ArrayList)serializable).isEmpty();
        if (n4) {
            return;
        }
        int n7 = ((ArrayList)serializable).size();
        if (n7 == (n3 = arrayList.size())) {
            int n8 = ((ArrayList)serializable).size();
            int n10 = 0;
            for (n3 = 0; n3 < n8; ++n3) {
                Object object = (a)((ArrayList)serializable).get(n3);
                boolean bl2 = ((k)object).p;
                if (bl2) continue;
                if (n10 != n3) {
                    this.B((ArrayList)serializable, arrayList, n10, n3);
                }
                if (bl2 = ((Boolean)(object = (Boolean)arrayList.get(n3))).booleanValue()) {
                    for (n10 = n3 + 1; n10 < n8 && (bl2 = ((Boolean)(object = (Boolean)arrayList.get(n10))).booleanValue()); ++n10) {
                        object = (a)((ArrayList)serializable).get(n10);
                        bl2 = ((k)object).p;
                        if (bl2) break;
                    }
                }
                this.B((ArrayList)serializable, arrayList, n3, n10);
                n3 = n10 + -1;
            }
            if (n10 != n8) {
                this.B((ArrayList)serializable, arrayList, n10, n8);
            }
            return;
        }
        serializable = new IllegalStateException("Internal error with the back stack records");
        throw serializable;
    }

    public final void c(Fragment fragment) {
        String string2 = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            Objects.toString(fragment);
        }
        if (bl2 = fragment.mDetached) {
            j j3 = null;
            fragment.mDetached = false;
            bl2 = fragment.mAdded;
            if (!bl2) {
                boolean bl3;
                j3 = this.c;
                j3.a(fragment);
                boolean bl4 = Log.isLoggable((String)string2, (int)n3);
                if (bl4) {
                    fragment.toString();
                }
                if (bl3 = FragmentManager.P(fragment)) {
                    this.H = bl3 = true;
                }
            }
        }
    }

    public final void c0(Bundle bundle) {
        Object object;
        Object object2;
        Object[] objectArray;
        ClassLoader classLoader;
        int n3;
        Object object3;
        Object object4;
        int n4;
        String string2;
        Object object5;
        int n7;
        int n8;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        int n14;
        FragmentManager fragmentManager = this;
        Object object11 = bundle;
        Object object12 = bundle.keySet().iterator();
        while ((n14 = object12.hasNext()) != 0) {
            object10 = (String)object12.next();
            object8 = ((String)object10).startsWith((String)(object9 = "result_"));
            if (object8 == 0 || (object9 = object11.getBundle((String)object10)) == null) continue;
            object7 = fragmentManager.x.b.getClassLoader();
            object9.setClassLoader((ClassLoader)object7);
            int n10 = 7;
            object10 = ((String)object10).substring(n10);
            object7 = fragmentManager.m;
            object7.put(object10, object9);
        }
        object12 = new HashMap();
        object10 = bundle.keySet().iterator();
        while ((object8 = object10.hasNext()) != 0) {
            object9 = (String)object10.next();
            boolean bl2 = ((String)object9).startsWith((String)(object7 = "fragment_"));
            if (!bl2 || (object7 = object11.getBundle((String)object9)) == null) continue;
            object6 = fragmentManager.x.b.getClassLoader();
            object7.setClassLoader((ClassLoader)object6);
            n8 = 9;
            object9 = ((String)object9).substring(n8);
            ((HashMap)object12).put(object9, object7);
        }
        object10 = fragmentManager.c;
        object9 = ((j)object10).c;
        ((HashMap)object9).clear();
        ((HashMap)object9).putAll(object12);
        object12 = "state";
        object11 = (FragmentManagerState)object11.getParcelable((String)object12);
        if (object11 == null) {
            return;
        }
        object9 = ((j)object10).b;
        ((HashMap)object9).clear();
        object7 = object11.a.iterator();
        while (true) {
            n8 = (int)(object7.hasNext() ? 1 : 0);
            n7 = 2;
            object5 = fragmentManager.p;
            string2 = "FragmentManager";
            if (n8 == 0) break;
            object6 = (String)object7.next();
            n4 = 0;
            object4 = null;
            if ((object6 = ((j)object10).i(null, (String)object6)) == null) continue;
            object4 = (FragmentState)object6.getParcelable(object12);
            object3 = fragmentManager.P;
            object4 = ((FragmentState)object4).b;
            object3 = ((g)object3).a;
            if ((object4 = (Fragment)((HashMap)object3).get(object4)) != null) {
                n3 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                if (n3 != 0) {
                    ((Fragment)object4).toString();
                }
                object3 = new h((f)object5, (j)object10, (Fragment)object4, (Bundle)object6);
            } else {
                object4 = fragmentManager.x.b;
                classLoader = object4.getClassLoader();
                objectArray = this.M();
                object2 = fragmentManager.p;
                object = fragmentManager.c;
                object3 = object5;
                object5 = new h((f)object2, (j)object, classLoader, (d)objectArray, (Bundle)object6);
            }
            object5 = ((h)object3).c;
            ((Fragment)object5).mSavedFragmentState = object6;
            ((Fragment)object5).mFragmentManager = fragmentManager;
            n8 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
            if (n8 != 0) {
                ((Fragment)object5).toString();
            }
            object6 = fragmentManager.x.b.getClassLoader();
            ((h)object3).j((ClassLoader)object6);
            ((j)object10).g((h)object3);
            ((h)object3).e = n8 = fragmentManager.w;
        }
        object12 = fragmentManager.P;
        object12.getClass();
        object12 = ((g)object12).a.values();
        object7 = new ArrayList(object12);
        object12 = ((ArrayList)object7).iterator();
        while (true) {
            boolean bl3 = object12.hasNext();
            n8 = 1;
            if (!bl3) break;
            object7 = (Fragment)object12.next();
            object4 = ((Fragment)object7).mWho;
            if ((object4 = ((HashMap)object9).get(object4)) != null) continue;
            n4 = Log.isLoggable((String)string2, (int)n7);
            if (n4 != 0) {
                ((Fragment)object7).toString();
                object4 = object11.a;
                Objects.toString(object4);
            }
            fragmentManager.P.e((Fragment)object7);
            ((Fragment)object7).mFragmentManager = fragmentManager;
            object4 = new h((f)object5, (j)object10, (Fragment)object7);
            ((h)object4).e = n8;
            ((h)object4).i();
            ((Fragment)object7).mRemoving = n8;
            ((h)object4).i();
        }
        object12 = object11.b;
        object9 = ((j)object10).a;
        ((ArrayList)object9).clear();
        if (object12 != null) {
            object12 = object12.iterator();
            while ((object8 = object12.hasNext()) != 0) {
                object9 = (String)object12.next();
                object7 = ((j)object10).b((String)object9);
                if (object7 != null) {
                    object8 = Log.isLoggable((String)string2, (int)n7);
                    if (object8 != 0) {
                        ((Fragment)object7).toString();
                    }
                    ((j)object10).a((Fragment)object7);
                    continue;
                }
                object12 = cP.a("No instantiated fragment for (", (String)object9, ")");
                object11 = new IllegalStateException((String)object12);
                throw object11;
            }
        }
        if ((object12 = object11.c) != null) {
            int n10;
            object7 = object11.c;
            int n15 = ((BackStackRecordState[])object7).length;
            fragmentManager.d = object12 = new ArrayList(n15);
            object12 = null;
            for (int i3 = 0; i3 < (n10 = ((Object)(object7 = object11.c)).length); ++i3) {
                int n16;
                object7 = object7[i3];
                object7.getClass();
                object5 = new a(fragmentManager);
                n4 = 0;
                object4 = null;
                n3 = 0;
                object3 = null;
                while (n4 < (n16 = ((Object)(object2 = (Object)((BackStackRecordState)object7).a)).length)) {
                    object = new k$a();
                    Object object13 = n4 + 1;
                    Object object14 = object2[n4];
                    ((k$a)object).a = (int)object14;
                    object14 = Log.isLoggable((String)string2, (int)n7);
                    if (object14 != false) {
                        Objects.toString(object5);
                        object14 = object2[object13];
                    }
                    objectArray = i$b.values();
                    object8 = ((BackStackRecordState)object7).c[n3];
                    object9 = objectArray[object8];
                    ((k$a)object).h = object9;
                    object9 = i$b.values();
                    objectArray = ((BackStackRecordState)object7).d;
                    object14 = objectArray[n3];
                    object9 = object9[object14];
                    ((k$a)object).i = object9;
                    object8 = n4 + 2;
                    if ((object13 = (Object)object2[object13]) != 0) {
                        object13 = 1;
                    } else {
                        object13 = 0;
                        classLoader = null;
                    }
                    ((k$a)object).c = object13;
                    object13 = n4 + 3;
                    ((k$a)object).d = object8 = (Object)object2[object8];
                    object14 = n4 + 4;
                    ((k$a)object).e = object13 = (Object)object2[object13];
                    int n17 = n4 + 5;
                    object14 = object2[object14];
                    ((k$a)object).f = (int)object14;
                    n4 += 6;
                    Object object15 = object2[n17];
                    ((k$a)object).g = (int)object15;
                    ((k)object5).b = object8;
                    ((k)object5).c = object13;
                    ((k)object5).d = (int)object14;
                    ((k)object5).e = (int)object15;
                    ((k)object5).b((k$a)object);
                    ++n3;
                }
                ((k)object5).f = object8 = ((BackStackRecordState)object7).e;
                ((k)object5).i = object9 = ((BackStackRecordState)object7).f;
                ((k)object5).g = n8;
                ((k)object5).j = object8 = ((BackStackRecordState)object7).h;
                ((k)object5).k = object9 = ((BackStackRecordState)object7).i;
                ((k)object5).l = object8 = ((BackStackRecordState)object7).j;
                object9 = ((BackStackRecordState)object7).k;
                ((k)object5).m = object9;
                object9 = ((BackStackRecordState)object7).l;
                ((k)object5).n = object9;
                object9 = ((BackStackRecordState)object7).m;
                ((k)object5).o = object9;
                object8 = ((BackStackRecordState)object7).n;
                ((k)object5).p = object8;
                ((a)object5).t = object8 = ((BackStackRecordState)object7).g;
                object9 = null;
                for (object8 = 0; object8 < (n3 = ((ArrayList)(object4 = ((BackStackRecordState)object7).b)).size()); ++object8) {
                    if ((object4 = (String)((ArrayList)object4).get((int)object8)) == null) continue;
                    object3 = (k$a)((k)object5).a.get((int)object8);
                    ((k$a)object3).b = object4 = ((j)object10).b((String)object4);
                }
                ((a)object5).m(n8);
                object8 = Log.isLoggable((String)string2, (int)n7);
                if (object8 != 0) {
                    ((a)object5).toString();
                    object9 = new lx1();
                    object7 = new PrintWriter((Writer)object9);
                    object9 = "  ";
                    n4 = 0;
                    object4 = null;
                    ((a)object5).q((String)object9, (PrintWriter)object7, false);
                    ((PrintWriter)object7).close();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                object9 = fragmentManager.d;
                ((ArrayList)object9).add(object5);
            }
            n4 = 0;
            object4 = null;
        } else {
            n4 = 0;
            object4 = null;
            fragmentManager.d = object12 = new ArrayList();
        }
        object12 = fragmentManager.k;
        object8 = object11.d;
        ((AtomicInteger)object12).set((int)object8);
        object12 = object11.e;
        if (object12 != null) {
            fragmentManager.A = object12 = ((j)object10).b((String)object12);
            fragmentManager.r((Fragment)object12);
        }
        if ((object12 = object11.f) != null) {
            object9 = null;
            for (object8 = 0; object8 < (n14 = ((ArrayList)object12).size()); ++object8) {
                object10 = (String)((ArrayList)object12).get((int)object8);
                object7 = (BackStackState)object11.g.get((int)object8);
                object6 = fragmentManager.l;
                object6.put(object10, object7);
            }
        }
        object11 = object11.h;
        fragmentManager.G = object12 = new ArrayDeque(object11);
    }

    public final void d() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Bundle d0() {
        int n3;
        Object object5;
        int n7;
        Object object6;
        int n4;
        BackStackRecordState[] backStackRecordStateArray;
        ArrayList<Object> arrayList;
        Object object;
        int n8;
        Object object2;
        int n10;
        Object object3;
        Object object4;
        Bundle bundle;
        block13: {
            block12: {
                bundle = new Bundle();
                this.G();
                this.w();
                boolean bl2 = true;
                this.z(bl2);
                this.I = bl2;
                this.P.f = bl2;
                object4 = this.c;
                object4.getClass();
                object3 = ((j)object4).b;
                n10 = ((HashMap)object3).size();
                object2 = new Object(n10);
                object3 = ((HashMap)object3).values().iterator();
                while (true) {
                    n10 = (int)(object3.hasNext() ? 1 : 0);
                    n8 = 2;
                    if (n10 == 0) break;
                    object = (h)object3.next();
                    if (object == null) continue;
                    arrayList = ((h)object).c;
                    backStackRecordStateArray = ((Fragment)((Object)arrayList)).mWho;
                    object = ((h)object).l();
                    ((j)object4).i((Bundle)object, (String)backStackRecordStateArray);
                    object = ((Fragment)((Object)arrayList)).mWho;
                    ((ArrayList)object2).add(object);
                    object = "FragmentManager";
                    n10 = (int)(Log.isLoggable((String)object, (int)n8) ? 1 : 0);
                    if (n10 == 0) continue;
                    ((Fragment)((Object)arrayList)).toString();
                    object = ((Fragment)((Object)arrayList)).mSavedFragmentState;
                    Objects.toString(object);
                }
                object4 = this.c.c;
                n4 = ((HashMap)object4).isEmpty();
                if (n4 != 0) {
                    object4 = "FragmentManager";
                    Log.isLoggable((String)object4, (int)n8);
                    return bundle;
                }
                object3 = this.c;
                object = ((j)object3).a;
                // MONITORENTER : object
                arrayList = ((j)object3).a;
                boolean bl3 = arrayList.isEmpty();
                backStackRecordStateArray = null;
                if (!bl3) break block12;
                // MONITOREXIT : object
                bl3 = false;
                arrayList = null;
                break block13;
            }
            object6 = ((j)object3).a;
            n7 = ((ArrayList)object6).size();
            arrayList = new ArrayList<Object>(n7);
            object3 = ((j)object3).a;
            object3 = ((ArrayList)object3).iterator();
            while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object6 = object3.next();
                object6 = (Fragment)object6;
                object5 = ((Fragment)object6).mWho;
                arrayList.add(object5);
                object5 = "FragmentManager";
                boolean bl4 = Log.isLoggable((String)object5, (int)n8);
                if (!bl4) continue;
                ((Fragment)object6).toString();
            }
            // MONITOREXIT : object
        }
        object3 = this.d;
        n4 = ((ArrayList)object3).size();
        if (n4 > 0) {
            backStackRecordStateArray = new BackStackRecordState[n4];
            object = null;
            for (n10 = 0; n10 < n4; ++n10) {
                object5 = (a)this.d.get(n10);
                backStackRecordStateArray[n10] = object6 = new BackStackRecordState((a)object5);
                object6 = "FragmentManager";
                n7 = (int)(Log.isLoggable((String)object6, (int)n8) ? 1 : 0);
                if (n7 == 0) continue;
                object6 = this.d.get(n10);
                Objects.toString(object6);
            }
        }
        object3 = new FragmentManagerState();
        ((FragmentManagerState)object3).a = object2;
        ((FragmentManagerState)object3).b = arrayList;
        ((FragmentManagerState)object3).c = backStackRecordStateArray;
        ((FragmentManagerState)object3).d = n3 = this.k.get();
        object2 = this.A;
        if (object2 != null) {
            object2 = ((Fragment)object2).mWho;
            ((FragmentManagerState)object3).e = object2;
        }
        object2 = ((FragmentManagerState)object3).f;
        object = this.l.keySet();
        ((ArrayList)object2).addAll(object);
        object2 = ((FragmentManagerState)object3).g;
        object = this.l.values();
        ((ArrayList)object2).addAll(object);
        object = this.G;
        object2 = new Object(object);
        ((FragmentManagerState)object3).h = object2;
        bundle.putParcelable("state", object3);
        object2 = this.m.keySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = (String)object2.next();
            object = kp1_0.c("result_", (String)object3);
            Map map2 = this.m;
            object3 = (Bundle)map2.get(object3);
            bundle.putBundle((String)object, (Bundle)object3);
        }
        object2 = ((HashMap)object4).keySet().iterator();
        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object3 = (String)object2.next();
            object = kp1_0.c("fragment_", (String)object3);
            object3 = (Bundle)((HashMap)object4).get(object3);
            bundle.putBundle((String)object, (Bundle)object3);
        }
        return bundle;
    }

    public final HashSet e() {
        boolean bl2;
        HashSet<Object> hashSet = new HashSet<Object>();
        Iterator iterator = this.c.d().iterator();
        while (bl2 = iterator.hasNext()) {
            ViewGroup viewGroup = ((h)iterator.next()).c.mContainer;
            if (viewGroup == null) continue;
            Object object = this.N();
            String string2 = "container";
            Intrinsics.checkNotNullParameter(viewGroup, string2);
            Intrinsics.checkNotNullParameter(object, "factory");
            int n3 = R$id.special_effects_controller_view_tag;
            Object object2 = viewGroup.getTag(n3);
            boolean bl3 = object2 instanceof n;
            if (bl3) {
                object2 = (n)object2;
            } else {
                ((FragmentManager$e)object).getClass();
                Intrinsics.checkNotNullParameter(viewGroup, string2);
                object2 = new n(viewGroup);
                object = "factory.createController(container)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                int n4 = R$id.special_effects_controller_view_tag;
                viewGroup.setTag(n4, object2);
            }
            hashSet.add(object2);
        }
        return hashSet;
    }

    public final Fragment$SavedState e0(Fragment object) {
        Fragment fragment;
        boolean bl2;
        Object object2 = ((Fragment)object).mWho;
        object2 = (h)this.c.b.get(object2);
        Fragment$SavedState fragment$SavedState = null;
        if (object2 != null && (bl2 = (fragment = ((h)object2).c).equals(object))) {
            int n3 = fragment.mState;
            int n4 = -1;
            if (n3 > n4) {
                object = ((h)object2).l();
                fragment$SavedState = new Fragment$SavedState((Bundle)object);
            }
            return fragment$SavedState;
        }
        object = tv0_1.b("Fragment ", (Fragment)object, " is not currently in the FragmentManager");
        object2 = new IllegalStateException((String)object);
        this.l0((IllegalStateException)object2);
        throw null;
    }

    public final HashSet f(ArrayList arrayList, int n3, int n4) {
        HashSet<Object> hashSet = new HashSet<Object>();
        while (n3 < n4) {
            boolean bl2;
            Iterator iterator = ((a)arrayList.get((int)n3)).a.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = ((k$a)iterator.next()).b;
                if (object == null || (object = ((Fragment)object).mContainer) == null) continue;
                object = androidx.fragment.app.n.i((ViewGroup)object, this);
                hashSet.add(object);
            }
            ++n3;
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f0() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object = this.a;
                        int n3 = ((ArrayList)object).size();
                        int n4 = 1;
                        if (n3 != n4) break block3;
                        object = this.x;
                        object = ((lw0_0)object).c;
                        Runnable runnable2 = this.Q;
                        object.removeCallbacks(runnable2);
                        object = this.x;
                        object = ((lw0_0)object).c;
                        runnable2 = this.Q;
                        object.post(runnable2);
                        this.n0();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final h g(Fragment object) {
        int n3;
        Object object2 = ((Fragment)object).mWho;
        j j3 = this.c;
        Object object3 = j3.b;
        if ((object2 = (h)((HashMap)object3).get(object2)) != null) {
            return object2;
        }
        object3 = this.p;
        object2 = new h((f)object3, j3, (Fragment)object);
        object = this.x.b.getClassLoader();
        ((h)object2).j((ClassLoader)object);
        ((h)object2).e = n3 = this.w;
        return object2;
    }

    public final void g0(Fragment object, boolean bl2) {
        boolean bl3;
        if ((object = this.L((Fragment)object)) != null && (bl3 = object instanceof FragmentContainerView)) {
            object = (FragmentContainerView)((Object)object);
            ((FragmentContainerView)((Object)object)).setDrawDisappearingViewsLast(bl2 ^= true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(Fragment fragment) {
        Object object = "FragmentManager";
        int n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            Objects.toString(fragment);
        }
        if (bl2 = fragment.mDetached) return;
        fragment.mDetached = bl2 = true;
        boolean bl3 = fragment.mAdded;
        if (!bl3) return;
        boolean bl4 = Log.isLoggable((String)object, (int)n3);
        if (bl4) {
            fragment.toString();
        }
        object = this.c;
        ArrayList arrayList = ((j)object).a;
        synchronized (arrayList) {
            object = ((j)object).a;
            ((ArrayList)object).remove(fragment);
        }
        object = null;
        fragment.mAdded = false;
        bl4 = FragmentManager.P(fragment);
        if (bl4) {
            this.H = bl2;
        }
        this.k0(fragment);
    }

    public final void h0(String object, mu1_1 object2, wW0 wW02) {
        int n3;
        boolean bl2;
        Object object3;
        Object object4 = ((i)(object2 = object2.getLifecycle())).b();
        if (object4 == (object3 = i$b.DESTROYED)) {
            return;
        }
        Map map2 = this.n;
        object4 = new FragmentManager$f(this, (String)object, wW02, (i)object2);
        object3 = new FragmentManager$m((i)object2, wW02, (FragmentManager$f)object4);
        if ((object = (FragmentManager$m)((Object)map2.put(object, object3))) != null) {
            object3 = ((FragmentManager$m)object).a;
            object = ((FragmentManager$m)object).c;
            ((i)object3).c((lu1)object);
        }
        if (bl2 = Log.isLoggable((String)(object = "FragmentManager"), (int)(n3 = 2))) {
            object2.toString();
            Objects.toString(wW02);
        }
        ((i)object2).a((lu1)object4);
    }

    public final void i(boolean bl2, Configuration configuration) {
        boolean bl3;
        Object object;
        boolean bl4;
        if (bl2 && (bl4 = (object = this.x) instanceof s82)) {
            IllegalStateException illegalStateException = new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments.");
            this.l0(illegalStateException);
            throw null;
        }
        object = this.c.f().iterator();
        while (bl3 = object.hasNext()) {
            Object object2 = (Fragment)object.next();
            if (object2 == null) continue;
            ((Fragment)object2).performConfigurationChanged(configuration);
            if (!bl2) continue;
            object2 = ((Fragment)object2).mChildFragmentManager;
            boolean bl5 = true;
            ((FragmentManager)object2).i(bl5, configuration);
        }
    }

    public final void i0(Fragment object, i$b object2) {
        Object object3 = ((Fragment)object).mWho;
        j j3 = this.c;
        boolean bl2 = ((Fragment)object).equals(object3 = j3.b((String)object3));
        if (bl2 && ((object3 = ((Fragment)object).mHost) == null || (object3 = ((Fragment)object).mFragmentManager) == this)) {
            ((Fragment)object).mMaxState = object2;
            return;
        }
        object3 = new StringBuilder("Fragment ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(" is not an active fragment of FragmentManager ");
        ((StringBuilder)object3).append(this);
        object = ((StringBuilder)object3).toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final boolean j(MenuItem menuItem) {
        boolean bl2;
        int n3 = this.w;
        int n4 = 1;
        if (n3 < n4) {
            return false;
        }
        Iterator iterator = this.c.f().iterator();
        while (bl2 = iterator.hasNext()) {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null || !(bl2 = fragment.performContextItemSelected(menuItem))) continue;
            return n4 != 0;
        }
        return false;
    }

    public final void j0(Fragment object) {
        Object object2;
        if (object != null) {
            object2 = ((Fragment)object).mWho;
            Object object3 = this.c;
            boolean bl2 = ((Fragment)object).equals(object2 = ((j)object3).b((String)object2));
            if (!bl2 || (object2 = ((Fragment)object).mHost) != null && (object2 = ((Fragment)object).mFragmentManager) != this) {
                object3 = new StringBuilder("Fragment ");
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(" is not an active fragment of FragmentManager ");
                ((StringBuilder)object3).append(this);
                object = ((StringBuilder)object3).toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
        }
        object2 = this.A;
        this.A = object;
        this.r((Fragment)object2);
        object = this.A;
        this.r((Fragment)object);
    }

    public final boolean k(Menu object, MenuInflater menuInflater) {
        boolean bl2;
        int n3 = this.w;
        int n4 = 0;
        int n7 = 1;
        if (n3 < n7) {
            return false;
        }
        Iterator iterator = this.c.f().iterator();
        ArrayList<Fragment> arrayList = null;
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            boolean bl4;
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null || !(bl4 = fragment.isMenuVisible()) || !(bl4 = fragment.performCreateOptionsMenu((Menu)object, menuInflater))) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<Fragment>();
            }
            arrayList.add(fragment);
            bl3 = true;
        }
        object = this.e;
        if (object != null) {
            int n8;
            while (n4 < (n8 = ((ArrayList)(object = this.e)).size())) {
                boolean bl5;
                object = (Fragment)this.e.get(n4);
                if (arrayList == null || !(bl5 = arrayList.contains(object))) {
                    ((Fragment)object).onDestroyOptionsMenu();
                }
                ++n4;
            }
        }
        this.e = arrayList;
        return bl3;
    }

    public final void k0(Fragment fragment) {
        Object object = this.L(fragment);
        if (object != null) {
            int n3 = fragment.getEnterAnim();
            int n4 = fragment.getExitAnim() + n3;
            n3 = fragment.getPopEnterAnim() + n4;
            n4 = fragment.getPopExitAnim() + n3;
            if (n4 > 0) {
                n3 = R$id.visible_removing_fragment_view_tag;
                Object object2 = object.getTag(n3);
                if (object2 == null) {
                    n3 = R$id.visible_removing_fragment_view_tag;
                    object.setTag(n3, (Object)fragment);
                }
                n3 = R$id.visible_removing_fragment_view_tag;
                object = (Fragment)object.getTag(n3);
                boolean bl2 = fragment.getPopDirection();
                ((Fragment)object).setPopDirection(bl2);
            }
        }
    }

    public final void l() {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        Object object;
        int n4;
        this.K = n4 = 1;
        this.z(n4 != 0);
        this.w();
        Object object2 = this.x;
        boolean bl22 = object2 instanceof sD3;
        j j3 = this.c;
        if (bl22) {
            object = j3.d;
            n4 = ((g)object).e;
        } else {
            object2 = ((lw0_0)object2).b;
            bl22 = object2 instanceof Activity;
            if (bl22) {
                object2 = (Activity)object2;
                int n3 = object2.isChangingConfigurations();
                n4 ^= n3;
            }
        }
        if (n4 != 0) {
            boolean bl6;
            object = this.l.values().iterator();
            while (bl6 = object.hasNext()) {
                object2 = ((BackStackState)object.next()).a.iterator();
                while (bl22 = object2.hasNext()) {
                    String string2 = (String)object2.next();
                    g g3 = j3.d;
                    g3.c(string2, false);
                }
            }
        }
        n4 = -1;
        this.u(n4);
        object = this.x;
        boolean bl7 = object instanceof j92_0;
        if (bl7) {
            object = (j92_0)object;
            object2 = this.s;
            object.removeOnTrimMemoryListener((p60_0)object2);
        }
        if (bl5 = (object = this.x) instanceof s82) {
            object = (s82)object;
            object2 = this.r;
            object.removeOnConfigurationChangedListener((p60_0)object2);
        }
        if (bl4 = (object = this.x) instanceof I82) {
            object = (I82)object;
            object2 = this.t;
            object.removeOnMultiWindowModeChangedListener((p60_0)object2);
        }
        if (bl3 = (object = this.x) instanceof O82) {
            object = (O82)object;
            object2 = this.u;
            object.removeOnPictureInPictureModeChangedListener((p60_0)object2);
        }
        if ((bl2 = (object = this.x) instanceof WN1) && (object2 = this.z) == null) {
            object = (WN1)object;
            object2 = this.v;
            object.removeMenuProvider((fo1_0)object2);
        }
        n4 = 0;
        object = null;
        this.x = null;
        this.y = null;
        this.z = null;
        object2 = this.g;
        if (object2 != null) {
            object2 = this.j;
            ((W72)object2).remove();
            this.g = null;
        }
        if ((object = this.D) != null) {
            ((N3)object).b();
            this.E.b();
            object = this.F;
            ((N3)object).b();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l0(IllegalStateException var1_1) {
        var1_1.getMessage();
        var2_2 = new lx1();
        var3_3 = new PrintWriter((Writer)var2_2);
        var2_2 = this.x;
        var4_4 = "  ";
        if (var2_2 == null) ** GOTO lbl12
        try {
            var4_4 = new String[]{};
            var2_2.d(var3_3, var4_4);
            throw var1_1;
lbl12:
            // 1 sources

            var2_2 = new String[]{};
            this.v((String)var4_4, null, var3_3, var2_2);
            throw var1_1;
        }
        catch (Exception v0) {
            throw var1_1;
        }
    }

    public final void m(boolean bl2) {
        boolean bl3;
        Object object;
        boolean bl4;
        if (bl2 && (bl4 = (object = this.x) instanceof j92_0)) {
            IllegalStateException illegalStateException = new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments.");
            this.l0(illegalStateException);
            throw null;
        }
        object = this.c.f().iterator();
        while (bl3 = object.hasNext()) {
            Object object2 = (Fragment)object.next();
            if (object2 == null) continue;
            ((Fragment)object2).performLowMemory();
            if (!bl2) continue;
            object2 = ((Fragment)object2).mChildFragmentManager;
            boolean bl5 = true;
            ((FragmentManager)object2).m(bl5);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m0(FragmentManager$l object) {
        f f5 = this.p;
        f5.getClass();
        Intrinsics.checkNotNullParameter(object, "cb");
        CopyOnWriteArrayList copyOnWriteArrayList = f5.b;
        synchronized (copyOnWriteArrayList) {
            Throwable throwable2;
            block5: {
                try {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = f5.b;
                    int n3 = copyOnWriteArrayList2.size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object2 = f5.b;
                        object2 = ((CopyOnWriteArrayList)object2).get(i3);
                        object2 = (f$a)object2;
                        object2 = ((f$a)object2).a;
                        if (object2 != object) continue;
                        object = f5.b;
                        ((CopyOnWriteArrayList)object).remove(i3);
                        break;
                    }
                    object = Unit.a;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void n(boolean bl2, boolean bl3) {
        boolean bl4;
        Object object;
        boolean bl5;
        if (bl3 && (bl5 = (object = this.x) instanceof I82)) {
            IllegalStateException illegalStateException = new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments.");
            this.l0(illegalStateException);
            throw null;
        }
        object = this.c.f().iterator();
        while (bl4 = object.hasNext()) {
            Object object2 = (Fragment)object.next();
            if (object2 == null) continue;
            ((Fragment)object2).performMultiWindowModeChanged(bl2);
            if (!bl3) continue;
            object2 = ((Fragment)object2).mChildFragmentManager;
            boolean bl6 = true;
            ((FragmentManager)object2).n(bl2, bl6);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void n0() {
        boolean bl2;
        int n3;
        Object object;
        block7: {
            object = this.a;
            // MONITORENTER : object
            Object object2 = this.a;
            boolean bl3 = ((ArrayList)object2).isEmpty();
            n3 = 3;
            bl2 = true;
            if (bl3) break block7;
            object2 = this.j;
            ((W72)object2).setEnabled(bl2);
            object2 = "FragmentManager";
            bl3 = Log.isLoggable((String)object2, (int)n3);
            if (!bl3) return;
            this.toString();
            return;
        }
        // MONITOREXIT : object
        int n4 = this.J();
        if (n4 <= 0 || (n4 = (int)(FragmentManager.R((Fragment)(object = this.z)) ? 1 : 0)) == 0) {
            bl2 = false;
        }
        object = "FragmentManager";
        n4 = (int)(Log.isLoggable((String)object, (int)n3) ? 1 : 0);
        if (n4 != 0) {
            this.toString();
        }
        this.j.setEnabled(bl2);
    }

    public final void o() {
        boolean bl2;
        Iterator iterator = this.c.e().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Fragment)iterator.next();
            if (object == null) continue;
            boolean bl3 = ((Fragment)object).isHidden();
            ((Fragment)object).onHiddenChanged(bl3);
            object = ((Fragment)object).mChildFragmentManager;
            ((FragmentManager)object).o();
        }
    }

    public final boolean p(MenuItem menuItem) {
        boolean bl2;
        int n3 = this.w;
        int n4 = 1;
        if (n3 < n4) {
            return false;
        }
        Iterator iterator = this.c.f().iterator();
        while (bl2 = iterator.hasNext()) {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null || !(bl2 = fragment.performOptionsItemSelected(menuItem))) continue;
            return n4 != 0;
        }
        return false;
    }

    public final void q(Menu menu2) {
        int n3 = this.w;
        int n4 = 1;
        if (n3 < n4) {
            return;
        }
        Iterator iterator = this.c.f().iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) continue;
            fragment.performOptionsMenuClosed(menu2);
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            Object object = fragment.mWho;
            j j3 = this.c;
            boolean bl2 = fragment.equals(object = j3.b((String)object));
            if (bl2) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean bl2, boolean bl3) {
        boolean bl4;
        Object object;
        boolean bl5;
        if (bl3 && (bl5 = (object = this.x) instanceof O82)) {
            IllegalStateException illegalStateException = new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments.");
            this.l0(illegalStateException);
            throw null;
        }
        object = this.c.f().iterator();
        while (bl4 = object.hasNext()) {
            Object object2 = (Fragment)object.next();
            if (object2 == null) continue;
            ((Fragment)object2).performPictureInPictureModeChanged(bl2);
            if (!bl3) continue;
            object2 = ((Fragment)object2).mChildFragmentManager;
            boolean bl6 = true;
            ((FragmentManager)object2).s(bl2, bl6);
        }
    }

    public final boolean t(Menu menu2) {
        boolean bl2;
        int n3 = this.w;
        boolean bl3 = false;
        int n4 = 1;
        if (n3 < n4) {
            return false;
        }
        Iterator iterator = this.c.f().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl4;
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null || !(bl4 = fragment.isMenuVisible()) || !(bl2 = fragment.performPrepareOptionsMenu(menu2))) continue;
            bl3 = true;
        }
        return bl3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        int n3 = System.identityHashCode(this);
        Object object = Integer.toHexString(n3);
        stringBuilder.append((String)object);
        stringBuilder.append(" in ");
        object = this.z;
        String string2 = "}";
        String string3 = "{";
        if (object != null) {
            object = object.getClass().getSimpleName();
            stringBuilder.append((String)object);
            stringBuilder.append(string3);
            n3 = System.identityHashCode(this.z);
            object = Integer.toHexString(n3);
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
        } else {
            object = this.x;
            if (object != null) {
                object = object.getClass().getSimpleName();
                stringBuilder.append((String)object);
                stringBuilder.append(string3);
                n3 = System.identityHashCode(this.x);
                object = Integer.toHexString(n3);
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
            } else {
                object = "null";
                stringBuilder.append((String)object);
            }
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void u(int n3) {
        Throwable throwable2;
        block18: {
            boolean bl2;
            block17: {
                bl2 = true;
                this.b = bl2;
                Object object = this.c;
                object = ((j)object).b;
                object = ((HashMap)object).values();
                object = object.iterator();
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break;
                    Object object2 = object.next();
                    if ((object2 = (h)object2) == null) continue;
                    ((h)object2).e = n3;
                    continue;
                    break;
                }
                this.T(n3, false);
                Object object3 = this.e();
                try {
                    object3 = ((HashSet)object3).iterator();
                }
                catch (Throwable throwable2) {}
                while (true) {
                    boolean bl4 = object3.hasNext();
                    if (!bl4) break block17;
                    break;
                }
                {
                    object = object3.next();
                    object = (n)object;
                    ((n)object).h();
                    continue;
                }
                break block18;
            }
            this.b = false;
            this.z(bl2);
            return;
        }
        this.b = false;
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void v(String string2, FileDescriptor object, PrintWriter printWriter, String[] object2) {
        int n3;
        Object object3;
        Object object4 = Ft2.a(string2, "    ");
        j j3 = this.c;
        j3.getClass();
        Object object5 = new StringBuilder();
        ((StringBuilder)object5).append(string2);
        ((StringBuilder)object5).append("    ");
        object5 = ((StringBuilder)object5).toString();
        Object object6 = j3.b;
        boolean bl2 = ((HashMap)object6).isEmpty();
        if (!bl2) {
            printWriter.print(string2);
            object3 = "Active Fragments:";
            printWriter.println((String)object3);
            object6 = ((HashMap)object6).values().iterator();
            while (bl2 = object6.hasNext()) {
                object3 = (h)object6.next();
                printWriter.print(string2);
                if (object3 != null) {
                    object3 = ((h)object3).c;
                    printWriter.println(object3);
                    ((Fragment)object3).dump((String)object5, (FileDescriptor)object, printWriter, (String[])object2);
                    continue;
                }
                object3 = "null";
                printWriter.println((String)object3);
            }
        }
        object = j3.a;
        int n4 = ((ArrayList)object).size();
        int n7 = 0;
        j3 = null;
        if (n4 > 0) {
            printWriter.print(string2);
            printWriter.println("Added Fragments:");
            object5 = null;
            for (int n8 = 0; n8 < n4; object6 = ((Fragment)object6).toString(), ++n8) {
                object6 = (Fragment)((ArrayList)object).get(n8);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(n8);
                object3 = ": ";
                printWriter.print((String)object3);
                printWriter.println((String)object6);
            }
        }
        if ((object = this.e) != null && (n3 = ((ArrayList)object).size()) > 0) {
            printWriter.print(string2);
            printWriter.println("Fragments Created Menus:");
            object2 = null;
            for (n4 = 0; n4 < n3; object5 = ((Fragment)object5).toString(), ++n4) {
                object5 = (Fragment)this.e.get(n4);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(n4);
                object6 = ": ";
                printWriter.print((String)object6);
                printWriter.println((String)object5);
            }
        }
        if ((n3 = ((ArrayList)(object = this.d)).size()) > 0) {
            printWriter.print(string2);
            printWriter.println("Back Stack:");
            object2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                object5 = (a)this.d.get(n4);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(n4);
                printWriter.print(": ");
                object6 = ((a)object5).toString();
                printWriter.println((String)object6);
                boolean bl3 = true;
                ((a)object5).q((String)object4, printWriter, bl3);
            }
        }
        printWriter.print(string2);
        object = new StringBuilder("Back Stack Index: ");
        object2 = this.k;
        n4 = ((AtomicInteger)object2).get();
        ((StringBuilder)object).append(n4);
        object = ((StringBuilder)object).toString();
        printWriter.println((String)object);
        object = this.a;
        // MONITORENTER : object
        object2 = this.a;
        n4 = ((ArrayList)object2).size();
        if (n4 > 0) {
            printWriter.print(string2);
            object4 = "Pending Actions:";
            printWriter.println((String)object4);
            while (n7 < n4) {
                object4 = this.a;
                object4 = ((ArrayList)object4).get(n7);
                object4 = (FragmentManager$o)object4;
                printWriter.print(string2);
                object5 = "  #";
                printWriter.print((String)object5);
                printWriter.print(n7);
                object5 = ": ";
                printWriter.print((String)object5);
                printWriter.println(object4);
                ++n7;
            }
        }
        printWriter.print(string2);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string2);
        printWriter.print("  mHost=");
        object = this.x;
        printWriter.println(object);
        printWriter.print(string2);
        printWriter.print("  mContainer=");
        object = this.y;
        printWriter.println(object);
        object = this.z;
        if (object != null) {
            printWriter.print(string2);
            printWriter.print("  mParent=");
            object = this.z;
            printWriter.println(object);
        }
        printWriter.print(string2);
        printWriter.print("  mCurState=");
        n3 = this.w;
        printWriter.print(n3);
        printWriter.print(" mStateSaved=");
        n3 = (int)(this.I ? 1 : 0);
        printWriter.print(n3 != 0);
        printWriter.print(" mStopped=");
        n3 = this.J;
        printWriter.print(n3 != 0);
        object = " mDestroyed=";
        printWriter.print((String)object);
        n3 = this.K;
        printWriter.println(n3 != 0);
        n3 = this.H;
        if (n3 == 0) return;
        printWriter.print(string2);
        string2 = "  mNeedMenuInvalidate=";
        printWriter.print(string2);
        boolean bl4 = this.H;
        printWriter.println(bl4);
    }

    public final void w() {
        boolean bl2;
        Iterator iterator = this.e().iterator();
        while (bl2 = iterator.hasNext()) {
            n n3 = (n)iterator.next();
            n3.h();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void x(FragmentManager$o object, boolean bl2) {
        Object object2;
        if (!bl2) {
            object2 = this.x;
            if (object2 == null) {
                boolean bl3 = this.K;
                if (bl3) {
                    object = new IllegalStateException("FragmentManager has been destroyed");
                    throw object;
                }
                object = new IllegalStateException("FragmentManager has not been attached to a host.");
                throw object;
            }
            boolean bl4 = this.S();
            if (bl4) {
                object = new IllegalStateException("Can not perform this action after onSaveInstanceState");
                throw object;
            }
        }
        object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block9: {
                try {
                    lw0_0 lw0_02 = this.x;
                    if (lw0_02 != null) {
                        ArrayList arrayList = this.a;
                        arrayList.add(object);
                        this.f0();
                        return;
                    }
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                String string2 = "Activity has been destroyed";
                object = new IllegalStateException(string2);
                throw object;
            }
            throw throwable2;
        }
    }

    public final void y(boolean bl2) {
        boolean bl3 = this.b;
        if (!bl3) {
            Looper looper;
            lw0_0 lw0_02 = this.x;
            if (lw0_02 == null) {
                bl2 = this.K;
                if (bl2) {
                    IllegalStateException illegalStateException = new IllegalStateException("FragmentManager has been destroyed");
                    throw illegalStateException;
                }
                IllegalStateException illegalStateException = new IllegalStateException("FragmentManager has not been attached to a host.");
                throw illegalStateException;
            }
            lw0_02 = Looper.myLooper();
            if (lw0_02 == (looper = this.x.c.getLooper())) {
                if (!bl2 && (bl2 = this.S())) {
                    IllegalStateException illegalStateException = new IllegalStateException("Can not perform this action after onSaveInstanceState");
                    throw illegalStateException;
                }
                ArrayList arrayList = this.M;
                if (arrayList == null) {
                    this.M = arrayList = new ArrayList();
                    this.N = arrayList = new ArrayList();
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Must be called from main thread of fragment host");
            throw illegalStateException;
        }
        IllegalStateException illegalStateException = new IllegalStateException("FragmentManager is already executing transactions");
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean z(boolean bl2) {
        Object object;
        Set<Object> set;
        block20: {
            boolean bl3;
            int n3;
            Object object2;
            Object object3;
            Object object4;
            int n4;
            block21: {
                Throwable throwable2;
                block18: {
                    block19: {
                        Object object5;
                        Iterator<Object> iterator;
                        this.y(bl2);
                        bl2 = this.i;
                        set = null;
                        object = null;
                        if (!bl2 && (iterator = this.h) != null) {
                            ((a)((Object)iterator)).s = false;
                            ((a)((Object)iterator)).n();
                            iterator = "FragmentManager";
                            n4 = 3;
                            bl2 = Log.isLoggable((String)((Object)iterator), (int)n4);
                            if (bl2) {
                                Objects.toString(this.h);
                                iterator = this.a;
                                Objects.toString(iterator);
                            }
                            this.h.o(false, false);
                            iterator = this.a;
                            object5 = this.h;
                            ((ArrayList)((Object)iterator)).add(0, object5);
                            iterator = this.h.a.iterator();
                            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                object5 = ((k$a)iterator.next()).b;
                                if (object5 == null) continue;
                                ((Fragment)object5).mTransitioning = false;
                            }
                            this.h = null;
                        }
                        bl2 = false;
                        iterator = null;
                        while (true) {
                            boolean bl4;
                            int n7;
                            block17: {
                                object5 = this.M;
                                object4 = this.N;
                                object3 = this.a;
                                // MONITORENTER : object3
                                object2 = this.a;
                                n7 = ((ArrayList)object2).isEmpty();
                                if (n7 == 0) break block17;
                                // MONITOREXIT : object3
                                bl4 = false;
                            }
                            try {
                                boolean bl5;
                                object2 = this.a;
                                n7 = ((ArrayList)object2).size();
                                bl4 = false;
                                for (n3 = 0; n3 < n7; bl4 |= bl5, ++n3) {
                                    Object object6 = this.a;
                                    object6 = ((ArrayList)object6).get(n3);
                                    object6 = (FragmentManager$o)object6;
                                    bl5 = object6.a((ArrayList)object5, (ArrayList)object4);
                                }
                            }
                            catch (Throwable throwable2) {
                                break block18;
                            }
                            object5 = this.a;
                            ((ArrayList)object5).clear();
                            object5 = this.x;
                            object5 = ((lw0_0)object5).c;
                            object4 = this.Q;
                            object5.removeCallbacks((Runnable)object4);
                            // MONITOREXIT : object3
                            n4 = 1;
                            if (!bl4) break block19;
                            this.b = n4;
                            iterator = this.M;
                            object4 = this.N;
                            this.b0((ArrayList)((Object)iterator), (ArrayList)object4);
                            bl2 = true;
                            continue;
                            break;
                        }
                        finally {
                            this.d();
                        }
                    }
                    this.n0();
                    boolean bl6 = this.L;
                    if (!bl6) break block20;
                    this.L = false;
                    object4 = this.c.d().iterator();
                    break block21;
                }
                set = this.a;
                ((ArrayList)((Object)set)).clear();
                set = this.x;
                set = ((lw0_0)((Object)set)).c;
                object = this.Q;
                set.removeCallbacks((Runnable)object);
                throw throwable2;
            }
            while (bl3 = object4.hasNext()) {
                object3 = (h)object4.next();
                object2 = ((h)object3).c;
                n3 = (int)(((Fragment)object2).mDeferStart ? 1 : 0);
                if (n3 == 0) continue;
                n3 = (int)(this.b ? 1 : 0);
                if (n3 != 0) {
                    this.L = n4;
                    continue;
                }
                ((Fragment)object2).mDeferStart = false;
                ((h)object3).i();
            }
        }
        object = this.c.b.values();
        set = Collections.singleton(null);
        object.removeAll(set);
        return bl2;
    }
}

