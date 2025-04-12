/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.b$a;
import androidx.fragment.app.b$b;
import androidx.fragment.app.b$c;
import androidx.fragment.app.b$g;
import androidx.fragment.app.b$h;
import androidx.fragment.app.n;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import androidx.fragment.app.n$c$b$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class b
extends n {
    public static void n(Jp jp, View view) {
        int n3;
        Object object = ViewCompat.a;
        object = ViewCompat$c.g(view);
        if (object != null) {
            jp.put(object, view);
        }
        if ((n3 = view instanceof ViewGroup) != 0) {
            view = (ViewGroup)view;
            n3 = view.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = view.getChildAt(i3);
                int n4 = view2.getVisibility();
                if (n4 != 0) continue;
                String string2 = "child";
                Intrinsics.checkNotNullExpressionValue(view2, string2);
                androidx.fragment.app.b.n(jp, view2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(ArrayList var1_1, boolean var2_2) {
        block71: {
            block77: {
                block70: {
                    var3_3 = this;
                    var4_4 /* !! */  = var1_1;
                    var5_5 = var2_2;
                    Intrinsics.checkNotNullParameter(var1_1, "operations");
                    var6_6 = var1_1.iterator();
                    do {
                        var7_7 = var6_6.hasNext();
                        var8_8 /* !! */  = "operation.fragment.mView";
                        if (var7_7 == 0) break block70;
                        var9_9 = var6_6.next();
                        var10_10 /* !! */  = var9_9;
                        var10_10 /* !! */  = (n$c)var9_9;
                        var11_11 = n$c$b.Companion;
                        var12_12 /* !! */  = var10_10 /* !! */ .c.mView;
                        Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var8_8 /* !! */ );
                        var11_11.getClass();
                    } while ((var11_11 = n$c$b$a.a(var12_12 /* !! */ )) != (var12_12 /* !! */  = n$c$b.VISIBLE) || (var10_10 /* !! */  = var10_10 /* !! */ .a) == var12_12 /* !! */ );
                    break block77;
                }
                var7_7 = 0;
                var9_9 = null;
            }
            var6_6 = var9_9;
            var6_6 = (n$c)var9_9;
            var7_7 = var1_1.size();
            var9_9 = var4_4 /* !! */ .listIterator(var7_7);
            while ((var13_13 = var9_9.hasPrevious()) != 0) {
                var10_10 /* !! */  = var9_9.previous();
                var11_11 = var10_10 /* !! */ ;
                var11_11 = (n$c)var10_10 /* !! */ ;
                var12_12 /* !! */  = n$c$b.Companion;
                var14_14 /* !! */  = var11_11.c.mView;
                Intrinsics.checkNotNullExpressionValue(var14_14 /* !! */ , (String)var8_8 /* !! */ );
                var12_12 /* !! */ .getClass();
                var12_12 /* !! */  = n$c$b$a.a(var14_14 /* !! */ );
                if (var12_12 /* !! */  == (var14_14 /* !! */  = n$c$b.VISIBLE) || (var11_11 = var11_11.a) != var14_14 /* !! */ ) continue;
                break block71;
            }
            var13_13 = 0;
            var10_10 /* !! */  = null;
        }
        var9_9 = var10_10 /* !! */ ;
        var9_9 = (n$c)var10_10 /* !! */ ;
        var15_15 = "FragmentManager";
        var16_16 = 2;
        var17_17 = Log.isLoggable((String)var15_15, (int)var16_16);
        if (var17_17 != 0) {
            Objects.toString(var6_6);
            Objects.toString(var9_9);
        }
        var18_18 = new ArrayList();
        var8_8 /* !! */  = new ArrayList();
        var10_10 /* !! */  = ((n$c)CollectionsKt.S((List)var1_1)).c;
        var11_11 = var1_1.iterator();
        while ((var19_19 = var11_11.hasNext()) != 0) {
            var12_12 /* !! */  = ((n$c)var11_11.next()).c.mAnimationInfo;
            var14_14 /* !! */  = var10_10 /* !! */ .mAnimationInfo;
            var12_12 /* !! */ .b = var20_20 = var14_14 /* !! */ .b;
            var12_12 /* !! */ .c = var20_20 = var14_14 /* !! */ .c;
            var12_12 /* !! */ .d = var20_20 = var14_14 /* !! */ .d;
            var12_12 /* !! */ .e = var20_20 = var14_14 /* !! */ .e;
        }
        var4_4 /* !! */  = var1_1.iterator();
        while ((var20_20 = var4_4 /* !! */ .hasNext()) != 0) {
            block72: {
                var21_21 = (n$c)var4_4 /* !! */ .next();
                var10_10 /* !! */  = new T((n$c)var21_21, (boolean)var5_5);
                var18_18.add(var10_10 /* !! */ );
                if (var5_5 != 0) {
                    if (var21_21 == var6_6) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var22_22 = true;
                            break block72;
                            break;
                        }
                    }
                    while (true) {
                        var22_22 = false;
                        var14_14 /* !! */  = null;
                        break block72;
                        break;
                    }
                }
                if (var21_21 != var9_9) ** continue;
                ** continue;
            }
            var10_10 /* !! */  = new T((n$c)var21_21, (boolean)var5_5, var22_22);
            var8_8 /* !! */ .add(var10_10 /* !! */ );
            var10_10 /* !! */  = new T((b)var3_3, (n$c)var21_21);
            var11_11 = "listener";
            Intrinsics.checkNotNullParameter(var10_10 /* !! */ , (String)var11_11);
            var21_21 = var21_21.d;
            var21_21.add(var10_10 /* !! */ );
        }
        var4_4 /* !! */  = new ArrayList();
        var8_8 /* !! */  = var8_8 /* !! */ .iterator();
        while ((var20_20 = (int)var8_8 /* !! */ .hasNext()) != 0) {
            var21_21 = var8_8 /* !! */ .next();
            var10_10 /* !! */  = var21_21;
            var10_10 /* !! */  = (b$h)var21_21;
            var13_13 = var10_10 /* !! */ .a();
            if (var13_13 != 0) continue;
            var4_4 /* !! */ .add((n$c)var21_21);
        }
        var12_12 /* !! */  = new ArrayList();
        var4_4 /* !! */  = var4_4 /* !! */ .iterator();
        while ((var17_17 = var4_4 /* !! */ .hasNext()) != 0) {
            var8_8 /* !! */  = var4_4 /* !! */ .next();
            var21_21 = var8_8 /* !! */ ;
            var21_21 = ((b$h)var8_8 /* !! */ ).b();
            if (var21_21 == null) continue;
            var12_12 /* !! */ .add(var8_8 /* !! */ );
        }
        var4_4 /* !! */  = var12_12 /* !! */ .iterator();
        var17_17 = 0;
        var8_8 /* !! */  = null;
        while ((var20_20 = (int)var4_4 /* !! */ .hasNext()) != 0) {
            var21_21 = (b$h)var4_4 /* !! */ .next();
            var10_10 /* !! */  = var21_21.b();
            if (var8_8 /* !! */  != null && var10_10 /* !! */  != var8_8 /* !! */ ) {
                var4_4 /* !! */  = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                var23_23 = var21_21.a.c;
                var4_4 /* !! */ .append(var23_23);
                var4_4 /* !! */ .append(" returned Transition ");
                var23_23 = var21_21.b;
                var4_4 /* !! */  = fK.a(var4_4 /* !! */ , var23_23, " which uses a different Transition type than other Fragments.");
                var4_4 /* !! */  = var4_4 /* !! */ .toString();
                var23_23 = new IllegalArgumentException((String)var4_4 /* !! */ );
                throw var23_23;
            }
            var8_8 /* !! */  = var10_10 /* !! */ ;
        }
        var11_11 = "effect";
        if (var8_8 /* !! */  == null) {
            var24_25 = var11_11;
            var25_26 = var18_18;
            var26_27 = var15_15;
        } else {
            var10_10 /* !! */  = new T();
            var27_28 = new ArrayList();
            var21_21 = new Jp();
            var4_4 /* !! */  = new ArrayList();
            var25_26 = new ArrayList();
            var14_14 /* !! */  = new Jp();
            var28_29 = new Jp();
            var29_30 = var12_12 /* !! */ .iterator();
            var30_31 = var4_4 /* !! */ ;
            var31_32 = var25_26;
            var25_26 = null;
            block9: while (var32_33 = var29_30.hasNext()) {
                var4_4 /* !! */  = ((b$h)var29_30.next()).d;
                if (var4_4 /* !! */  != null && var6_6 != null && var9_9 != null) {
                    var4_4 /* !! */  = var8_8 /* !! */ .h(var4_4 /* !! */ );
                    var25_26 = var8_8 /* !! */ .y(var4_4 /* !! */ );
                    var4_4 /* !! */  = var9_9.c;
                    var24_25 = var4_4 /* !! */ .getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(var24_25, "lastIn.fragment.sharedElementSourceNames");
                    var23_24 = var6_6.c;
                    var33_34 = var11_11;
                    var11_11 = var23_24.getSharedElementSourceNames();
                    var34_35 = var18_18;
                    Intrinsics.checkNotNullExpressionValue(var11_11, "firstOut.fragment.sharedElementSourceNames");
                    var18_18 = var23_24.getSharedElementTargetNames();
                    var3_3 = "firstOut.fragment.sharedElementTargetNames";
                    Intrinsics.checkNotNullExpressionValue(var18_18, (String)var3_3);
                    var35_36 = var18_18.size();
                    var36_37 = var8_8 /* !! */ ;
                    var8_8 /* !! */  = null;
                    for (var17_17 = 0; var17_17 < var35_36; ++var17_17) {
                        var37_38 = var35_36;
                        var3_3 = var18_18.get(var17_17);
                        var35_36 = var24_25.indexOf(var3_3);
                        var31_32 = var18_18;
                        var38_39 = -1;
                        if (var35_36 != var38_39) {
                            var18_18 = var11_11.get(var17_17);
                            var24_25.set(var35_36, var18_18);
                        }
                        var35_36 = var37_38;
                        var18_18 = var31_32;
                    }
                    var3_3 = var4_4 /* !! */ .getSharedElementTargetNames();
                    var8_8 /* !! */  = "lastIn.fragment.sharedElementTargetNames";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var8_8 /* !! */ );
                    if (var5_5 == 0) {
                        var8_8 /* !! */  = var23_24.getExitTransitionCallback();
                        var11_11 = var4_4 /* !! */ .getEnterTransitionCallback();
                        var18_18 = new Pair(var8_8 /* !! */ , var11_11);
                    } else {
                        var8_8 /* !! */  = var23_24.getEnterTransitionCallback();
                        var11_11 = var4_4 /* !! */ .getExitTransitionCallback();
                        var18_18 = new Pair(var8_8 /* !! */ , var11_11);
                    }
                    var8_8 /* !! */  = (e23)var18_18.a;
                    var11_11 = (e23)var18_18.b;
                    var38_39 = var24_25.size();
                    var39_40 = var12_12 /* !! */ ;
                    var5_5 = 0;
                    var40_41 = null;
                    while (true) {
                        var12_12 /* !! */  = "enteringNames[i]";
                        var41_42 = var10_10 /* !! */ ;
                        var10_10 /* !! */  = "exitingNames[i]";
                        if (var5_5 >= var38_39) break;
                        var37_38 = var38_39;
                        var18_18 = var24_25.get(var5_5);
                        Intrinsics.checkNotNullExpressionValue(var18_18, (String)var10_10 /* !! */ );
                        var18_18 = (String)var18_18;
                        var10_10 /* !! */  = var3_3.get(var5_5);
                        Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var12_12 /* !! */ );
                        var10_10 /* !! */  = (String)var10_10 /* !! */ ;
                        var21_21.put(var18_18, var10_10 /* !! */ );
                        var13_13 = 1;
                        var5_5 += var13_13;
                        var10_10 /* !! */  = var41_42;
                    }
                    var38_39 = 2;
                    var5_5 = (int)Log.isLoggable((String)var15_15, (int)var38_39);
                    if (var5_5 != 0) {
                        var18_18 = var3_3.iterator();
                        while ((var5_5 = (int)var18_18.hasNext()) != 0) {
                            var40_41 = (String)var18_18.next();
                        }
                        var18_18 = var24_25.iterator();
                        while ((var5_5 = (int)var18_18.hasNext()) != 0) {
                            var40_41 = (String)var18_18.next();
                        }
                    }
                    var23_24 = var23_24.mView;
                    var18_18 = "firstOut.fragment.mView";
                    Intrinsics.checkNotNullExpressionValue(var23_24, (String)var18_18);
                    androidx.fragment.app.b.n((Jp)var14_14 /* !! */ , (View)var23_24);
                    var14_14 /* !! */ .o((Collection)var24_25);
                    if (var8_8 /* !! */  != null) {
                        var42_43 = 2;
                        var17_17 = (int)Log.isLoggable((String)var15_15, (int)var42_43);
                        if (var17_17 != 0) {
                            var6_6.toString();
                        }
                        var42_43 = var24_25.size();
                        var17_17 = -1;
                        if ((var42_43 += var17_17) >= 0) {
                            while (true) {
                                var38_39 = var42_43 + -1;
                                var23_24 = var24_25.get(var42_43);
                                Intrinsics.checkNotNullExpressionValue(var23_24, var10_10 /* !! */ );
                                var23_24 = (String)var23_24;
                                var8_8 /* !! */  = (View)var14_14 /* !! */ .get(var23_24);
                                if (var8_8 /* !! */  == null) {
                                    var21_21.remove(var23_24);
                                } else {
                                    var40_41 = ViewCompat.a;
                                    var40_41 = ViewCompat$c.g((View)var8_8 /* !! */ );
                                    var5_5 = (int)Intrinsics.areEqual(var23_24, var40_41);
                                    if (var5_5 == 0) {
                                        var23_24 = (String)var21_21.remove(var23_24);
                                        var8_8 /* !! */  = ViewCompat$c.g((View)var8_8 /* !! */ );
                                        var21_21.put(var8_8 /* !! */ , var23_24);
                                    }
                                }
                                if (var38_39 >= 0) {
                                    var42_43 = var38_39;
                                    var17_17 = -1;
                                    continue;
                                }
                                break;
                            }
                        }
                    } else {
                        var23_24 = var14_14 /* !! */ .keySet();
                        var21_21.o((Collection)var23_24);
                    }
                    var4_4 /* !! */  = var4_4 /* !! */ .mView;
                    var23_24 = "lastIn.fragment.mView";
                    Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , (String)var23_24);
                    androidx.fragment.app.b.n(var28_29, var4_4 /* !! */ );
                    var28_29.o((Collection)var3_3);
                    var4_4 /* !! */  = var21_21.values();
                    var28_29.o((Collection)var4_4 /* !! */ );
                    var4_4 /* !! */  = "<this>";
                    if (var11_11 != null) {
                        var5_5 = 2;
                        var42_43 = (int)Log.isLoggable((String)var15_15, (int)var5_5);
                        if (var42_43 != 0) {
                            var9_9.toString();
                        }
                        var42_43 = var3_3.size();
                        var17_17 = -1;
                        if ((var42_43 += var17_17) >= 0) {
                            while (true) {
                                var13_13 = var42_43 + -1;
                                var23_24 = var3_3.get(var42_43);
                                Intrinsics.checkNotNullExpressionValue(var23_24, (String)var12_12 /* !! */ );
                                var23_24 = (String)var23_24;
                                var8_8 /* !! */  = (View)var28_29.get(var23_24);
                                if (var8_8 /* !! */  == null) {
                                    if ((var23_24 = CW0.b((Jp)var21_21, (String)var23_24)) != null) {
                                        var21_21.remove(var23_24);
                                    }
                                } else {
                                    var11_11 = ViewCompat.a;
                                    var11_11 = ViewCompat$c.g((View)var8_8 /* !! */ );
                                    var43_44 = Intrinsics.areEqual(var23_24, var11_11);
                                    if (var43_44 == 0 && (var23_24 = CW0.b((Jp)var21_21, (String)var23_24)) != null) {
                                        var8_8 /* !! */  = ViewCompat$c.g((View)var8_8 /* !! */ );
                                        var21_21.put(var23_24, var8_8 /* !! */ );
                                    }
                                }
                                if (var13_13 < 0) {
                                    var17_17 = -1;
                                    break;
                                }
                                var42_43 = var13_13;
                                var17_17 = -1;
                            }
                        }
                    } else {
                        var5_5 = 2;
                        var23_24 = CW0.a;
                        Intrinsics.checkNotNullParameter(var21_21, (String)var4_4 /* !! */ );
                        var23_24 = "namedViews";
                        Intrinsics.checkNotNullParameter(var28_29, (String)var23_24);
                        var17_17 = -1;
                        for (var42_43 = var21_21.c - 1; var17_17 < var42_43; var42_43 += var17_17) {
                            var10_10 /* !! */  = (String)var21_21.l(var42_43);
                            var13_13 = (int)var28_29.containsKey(var10_10 /* !! */ );
                            if (var13_13 != 0) continue;
                            var21_21.j(var42_43);
                        }
                    }
                    var23_24 = var21_21.keySet();
                    Intrinsics.checkNotNullExpressionValue(var23_24, "sharedElementNameMapping.keys");
                    var10_10 /* !! */  = var14_14 /* !! */ .entrySet();
                    var11_11 = "entries";
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , (String)var11_11);
                    var12_12 /* !! */  = new in0_0((Collection)var23_24);
                    Intrinsics.checkNotNullParameter(var10_10 /* !! */ , (String)var4_4 /* !! */ );
                    var23_24 = "predicate";
                    Intrinsics.checkNotNullParameter(var12_12 /* !! */ , (String)var23_24);
                    cx_2.v(var10_10 /* !! */ , (Function1)var12_12 /* !! */ , false);
                    var10_10 /* !! */  = var21_21.values();
                    Intrinsics.checkNotNullExpressionValue(var10_10 /* !! */ , "sharedElementNameMapping.values");
                    var12_12 /* !! */  = var28_29.entrySet();
                    Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var11_11);
                    var11_11 = new in0_0((Collection)var10_10 /* !! */ );
                    Intrinsics.checkNotNullParameter(var12_12 /* !! */ , (String)var4_4 /* !! */ );
                    Intrinsics.checkNotNullParameter(var11_11, (String)var23_24);
                    var38_39 = 0;
                    var18_18 = null;
                    cx_2.v((Iterable)var12_12 /* !! */ , (Function1)var11_11, false);
                    var32_33 = var21_21.isEmpty();
                    if (var32_33) {
                        Objects.toString(var25_26);
                        var6_6.toString();
                        var9_9.toString();
                        var41_42.clear();
                        var27_28.clear();
                        var5_5 = var2_2;
                        var30_31 = var3_3;
                        var31_32 = var24_25;
                        var11_11 = var33_34;
                        var18_18 = var34_35;
                        var8_8 /* !! */  = var36_37;
                        var12_12 /* !! */  = var39_40;
                        var10_10 /* !! */  = var41_42;
                        var25_26 = null;
lbl371:
                        // 2 sources

                        while (true) {
                            var3_3 = this;
                            continue block9;
                            break;
                        }
                    }
                    var5_5 = var2_2;
                    var30_31 = var3_3;
                    var31_32 = var24_25;
                    var11_11 = var33_34;
                    var18_18 = var34_35;
                    var8_8 /* !! */  = var36_37;
                    var12_12 /* !! */  = var39_40;
                    var10_10 /* !! */  = var41_42;
                    ** continue;
                }
                var36_37 = var8_8 /* !! */ ;
                var41_42 = var10_10 /* !! */ ;
                var33_34 = var11_11;
                var39_40 = var12_12 /* !! */ ;
                var34_35 = var18_18;
                var17_17 = -1;
                var38_39 = 0;
                var3_3 = this;
                var5_5 = var2_2;
            }
            var36_37 = var8_8 /* !! */ ;
            var41_42 = var10_10 /* !! */ ;
            var33_34 = var11_11;
            var39_40 = var12_12 /* !! */ ;
            var34_35 = var18_18;
            var38_39 = 0;
            var18_18 = null;
            var5_5 = 2;
            if (var25_26 == null) {
                var35_36 = var12_12 /* !! */ .isEmpty();
                if (var35_36 == 0) {
                    var3_3 = var12_12 /* !! */ .iterator();
                    while (var32_33 = var3_3.hasNext()) {
                        var4_4 /* !! */  = ((b$h)var3_3.next()).b;
                        if (var4_4 /* !! */  == null) {
                            continue;
                        }
                        ** break block75
                    }
                }
                var26_27 = var15_15;
                var24_25 = var33_34;
                var25_26 = var34_35;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 /* !! */  = var3_3;
                var23_24 = var39_40;
                var8_8 /* !! */  = var36_37;
                var12_12 /* !! */  = var21_21;
                var21_21 = var25_26;
                var10_10 /* !! */  = var41_42;
                var24_25 = var33_34;
                var11_11 = var27_28;
                var27_28 = var14_14 /* !! */ ;
                var14_14 /* !! */  = var30_31;
                var25_26 = var34_35;
                var18_18 = var31_32;
                var44_45 = var28_29;
                var28_29 = var27_28;
                var26_27 = var15_15;
                var15_15 = var44_45;
                var5_5 = var2_2;
                var3_3 = new b$g((ArrayList)var39_40, (n$c)var6_6, (n$c)var9_9, (GW0)var36_37, var21_21, (ArrayList)var41_42, (ArrayList)var11_11, (Jp)var12_12 /* !! */ , (ArrayList)var30_31, (ArrayList)var31_32, (Jp)var27_28, var44_45, (boolean)var2_2);
                var4_4 /* !! */  = var39_40.iterator();
                while ((var42_43 = var4_4 /* !! */ .hasNext()) != 0) {
                    var23_24 = ((b$h)var4_4 /* !! */ .next()).a;
                    var23_24.getClass();
                    Intrinsics.checkNotNullParameter(var3_3, (String)var24_25);
                    var23_24 = var23_24.j;
                    var23_24.add(var3_3);
                }
            }
        }
        var3_3 = new ArrayList();
        var4_4 /* !! */  = new ArrayList();
        var23_24 = var25_26.iterator();
        while (var45_46 = var23_24.hasNext()) {
            var6_6 = ((b$b)var23_24.next()).a.k;
            cx_2.r((Iterable)var6_6, var4_4 /* !! */ );
        }
        var32_33 = var4_4 /* !! */ .isEmpty();
        var42_43 = 1;
        var32_33 ^= var42_43;
        var23_24 = var25_26.iterator();
        var22_22 = false;
        var14_14 /* !! */  = null;
        while (var45_46 = var23_24.hasNext()) {
            block78: {
                block76: {
                    var6_6 = (b$b)var23_24.next();
                    var9_9 = this;
                    var8_8 /* !! */  = this.a.getContext();
                    var21_21 = var6_6.a;
                    var10_10 /* !! */  = "context";
                    Intrinsics.checkNotNullExpressionValue(var8_8 /* !! */ , (String)var10_10 /* !! */ );
                    var8_8 /* !! */  = var6_6.b((Context)var8_8 /* !! */ );
                    if (var8_8 /* !! */  == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var10_10 /* !! */  = var26_27;
                            var43_44 = 1;
                            var19_19 = 2;
                            break block76;
                            break;
                        }
                    }
                    var8_8 /* !! */  = var8_8 /* !! */ .b;
                    if (var8_8 /* !! */  == null) {
                        var3_3.add((Object)var6_6);
                        ** continue;
                    }
                    var8_8 /* !! */  = var21_21.c;
                    var10_10 /* !! */  = var21_21.k;
                    var13_13 = var10_10 /* !! */ .isEmpty();
                    var43_44 = 1;
                    if ((var13_13 ^= var43_44) == 0) break block78;
                    var10_10 /* !! */  = var26_27;
                    var19_19 = 2;
                    var45_46 = Log.isLoggable((String)var26_27, (int)var19_19);
                    if (var45_46) {
                        Objects.toString(var8_8 /* !! */ );
                    }
                }
                var26_27 = var10_10 /* !! */ ;
                continue;
            }
            var10_10 /* !! */  = var26_27;
            var19_19 = 2;
            var8_8 /* !! */  = var21_21.a;
            var14_14 /* !! */  = n$c$b.GONE;
            if (var8_8 /* !! */  == var14_14 /* !! */ ) {
                var17_17 = 0;
                var8_8 /* !! */  = null;
                var21_21.i = false;
            } else {
                var17_17 = 0;
                var8_8 /* !! */  = null;
            }
            var14_14 /* !! */  = new b$c((b$b)var6_6);
            Intrinsics.checkNotNullParameter(var14_14 /* !! */ , (String)var24_25);
            var6_6 = var21_21.j;
            var6_6.add(var14_14 /* !! */ );
            var26_27 = var10_10 /* !! */ ;
            var22_22 = true;
        }
        var9_9 = this;
        var10_10 /* !! */  = var26_27;
        var19_19 = 2;
        var3_3 = var3_3.iterator();
        while ((var42_43 = var3_3.hasNext()) != 0) {
            var23_24 = (b$b)var3_3.next();
            var6_6 = var23_24.a;
            var8_8 /* !! */  = var6_6.c;
            if (var32_33) {
                var42_43 = Log.isLoggable((String)var10_10 /* !! */ , (int)var19_19);
                if (var42_43 == 0) continue;
                Objects.toString(var8_8 /* !! */ );
                continue;
            }
            if (var22_22) {
                var42_43 = Log.isLoggable((String)var10_10 /* !! */ , (int)var19_19);
                if (var42_43 == 0) continue;
                Objects.toString(var8_8 /* !! */ );
                continue;
            }
            var8_8 /* !! */  = new b$a((b$b)var23_24);
            Intrinsics.checkNotNullParameter(var8_8 /* !! */ , (String)var24_25);
            var23_24 = var6_6.j;
            var23_24.add(var8_8 /* !! */ );
        }
    }
}

