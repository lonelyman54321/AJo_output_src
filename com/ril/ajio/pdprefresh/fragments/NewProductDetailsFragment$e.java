/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class NewProductDetailsFragment$e
extends RecyclerView$s {
    public final /* synthetic */ NewProductDetailsFragment a;

    public NewProductDetailsFragment$e(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int n3) {
        int n4;
        Object object;
        Object object2 = recyclerView;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, n3);
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Object object3 = newProductDetailsFragment.getActivity();
        Integer n7 = null;
        if (object3 != null && (object = (object3 = newProductDetailsFragment.requireActivity()).isFinishing()) == 0) {
            int n8;
            int n10;
            float f5;
            int n14;
            float f6;
            object3 = newProductDetailsFragment.L;
            if (object3 != null) {
                object = ((RecyclerView)object3).computeVerticalScrollOffset();
                object3 = object;
            } else {
                object = 0;
                object3 = null;
                f6 = 0.0f;
            }
            Object object4 = newProductDetailsFragment.L;
            if (object4 != null) {
                n14 = ((RecyclerView)object4).computeVerticalScrollExtent();
                object4 = n14;
            } else {
                n14 = 0;
                object4 = null;
                f5 = 0.0f;
            }
            Object object5 = newProductDetailsFragment.L;
            if (object5 != null) {
                n10 = ((RecyclerView)object5).computeVerticalScrollRange();
                object5 = n10;
            } else {
                n10 = 0;
                object5 = null;
            }
            Intrinsics.checkNotNull(object3);
            object = (Integer)object3;
            f6 = object;
            Object object6 = 1120403456;
            float f7 = 100.0f;
            f6 *= f7;
            Intrinsics.checkNotNull(object5);
            n10 = (Integer)object5;
            Intrinsics.checkNotNull(object4);
            n14 = (Integer)object4;
            f5 = n10 -= n14;
            f6 /= f5;
            object4 = newProductDetailsFragment.T;
            if (object4 != null && (n10 = ((Object)object4).length) >= (n8 = 5)) {
                NewCustomEventsRevamp newCustomEventsRevamp = newProductDetailsFragment.H;
                n10 = 1;
                object6 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
                if (object6 >= 0) {
                    object = 4;
                    f6 = 5.6E-45f;
                    object6 = object4[object];
                    if (object6 == 0) {
                        String string2 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                        String string3 = newProductDetailsFragment.n1;
                        String string4 = newProductDetailsFragment.o1;
                        String string5 = "scroll depth";
                        String string6 = "100%";
                        String string7 = "scroll_depth";
                        String string8 = "my account screen";
                        String string9 = "my account screen";
                        int n15 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string5, string6, string7, string8, string9, string3, null, string4, false, null, n15, null);
                        object4[object] = n10;
                    }
                } else {
                    f7 = 80.0f;
                    float f8 = f6 - f7;
                    object6 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object6 >= 0) {
                        object = 3;
                        f6 = 4.2E-45f;
                        object6 = object4[object];
                        if (object6 == 0) {
                            String string10 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                            String string11 = newProductDetailsFragment.n1;
                            String string12 = newProductDetailsFragment.o1;
                            String string13 = "scroll depth";
                            String string14 = "80%";
                            String string15 = "scroll_depth";
                            String string16 = "my account screen";
                            String string17 = "my account screen";
                            int n16 = 1536;
                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string10, string13, string14, string15, string16, string17, string11, null, string12, false, null, n16, null);
                            object4[object] = n10;
                        }
                    } else {
                        f7 = 60.0f;
                        float f11 = f6 - f7;
                        object6 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        if (object6 >= 0) {
                            object = 2;
                            f6 = 2.8E-45f;
                            object6 = object4[object];
                            if (object6 == 0) {
                                String string18 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                                String string19 = newProductDetailsFragment.n1;
                                String string20 = newProductDetailsFragment.o1;
                                String string21 = "scroll depth";
                                String string22 = "60%";
                                String string23 = "scroll_depth";
                                String string24 = "my account screen";
                                String string25 = "my account screen";
                                int n17 = 1536;
                                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string18, string21, string22, string23, string24, string25, string19, null, string20, false, null, n17, null);
                                object4[object] = n10;
                            }
                        } else {
                            f7 = 40.0f;
                            float f12 = f6 - f7;
                            object6 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            if (object6 >= 0) {
                                object = object4[n10];
                                if (object == 0) {
                                    String string26 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                                    object3 = newProductDetailsFragment.n1;
                                    String string27 = newProductDetailsFragment.o1;
                                    String string28 = "scroll depth";
                                    String string29 = "40%";
                                    String string30 = "scroll_depth";
                                    String string31 = "my account screen";
                                    String string32 = "my account screen";
                                    int n18 = 1536;
                                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string26, string28, string29, string30, string31, string32, (String)object3, null, string27, false, null, n18, null);
                                    object4[n10] = n10;
                                }
                            } else {
                                object6 = 1101004800;
                                f7 = 20.0f;
                                float f14 = f6 - f7;
                                object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                if (object >= 0) {
                                    object = 0;
                                    f6 = 0.0f;
                                    object3 = null;
                                    object6 = object4[0];
                                    if (object6 == 0) {
                                        String string33 = newCustomEventsRevamp.getEC_USER_INTERACTION();
                                        String string34 = newProductDetailsFragment.n1;
                                        String string35 = newProductDetailsFragment.o1;
                                        String string36 = "scroll depth";
                                        String string37 = "20%";
                                        String string38 = "scroll_depth";
                                        String string39 = "my account screen";
                                        String string40 = "my account screen";
                                        int n19 = 1536;
                                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string33, string36, string37, string38, string39, string40, string34, null, string35, false, null, n19, null);
                                        object4[0] = n10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        recyclerView.getY();
        object2 = newProductDetailsFragment.getActivity();
        if (object2 != null && (n4 = (object2 = newProductDetailsFragment.requireActivity()).isFinishing()) == 0) {
            object2 = newProductDetailsFragment.L;
            if (object2 != null) {
                n4 = object2.getHeight();
                n7 = n4;
            }
            Intrinsics.checkNotNull(n7);
            n7.intValue();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onScrolled(RecyclerView var1_1, int var2_2, int var3_3) {
        block54: {
            block55: {
                var4_4 = var1_1;
                var5_5 = false;
                var6_6 = 1;
                Intrinsics.checkNotNullParameter(var1_1, "recyclerView");
                super.onScrolled(var1_1, var2_2, var3_3);
                var7_7 = this.a;
                var7_7.getClass();
                var8_8 = var1_1.getLayoutManager();
                var9_9 = var8_8 instanceof LinearLayoutManager;
                var8_8 = var9_9 != 0 ? (LinearLayoutManager)var8_8 : null;
                if (var8_8 == null) break block54;
                var9_9 = var1_1.getHeight();
                var10_10 = var8_8.findFirstVisibleItemPosition();
                var11_11 = var8_8.findLastVisibleItemPosition();
                var12_12 = -1;
                var13_13 = 0.0f / 0.0f;
                var14_14 = 26;
                var15_15 = 3.6E-44f;
                if (var10_10 == var12_12) break block55;
                var16_16 = var1_1.getAdapter();
                if (var16_16 == null) break block54;
                var12_12 = var16_16.getItemViewType(var10_10);
                var7_7.N1 = var12_12 == var14_14 ? var12_12 : var12_12;
            }
            if (var10_10 > var11_11) break block54;
            while (true) {
                block53: {
                    block62: {
                        block63: {
                            block61: {
                                block59: {
                                    block60: {
                                        block58: {
                                            block57: {
                                                block56: {
                                                    if ((var16_16 = var8_8.findViewByPosition(var10_10)) == null) lbl-1000:
                                                    // 11 sources

                                                    {
                                                        while (true) {
                                                            var17_17 /* !! */  = 0;
                                                            var18_18 = 0.0f;
                                                            var19_19 = null;
                                                            break block53;
                                                            break;
                                                        }
                                                    }
                                                    var20_20 /* !! */  = var4_4.findViewHolderForAdapterPosition(var10_10);
                                                    var21_21 = var16_16.getTop();
                                                    var22_22 = var16_16.getBottom();
                                                    var12_12 = var16_16.getHeight();
                                                    if (var22_22 <= 0) {
                                                        while (true) {
                                                            var22_22 = 0;
                                                            var23_23 = 0.0f;
                                                            var24_24 = null;
                                                            break;
                                                        }
                                                    } else {
                                                        if (var21_21 >= var9_9) ** continue;
                                                        if (var21_21 >= 0) {
                                                            var22_22 = var22_22 > var9_9 ? var9_9 - var21_21 : (var22_22 -= var21_21);
                                                        }
                                                    }
                                                    var25_25 = var22_22;
                                                    var13_13 = var12_12;
                                                    var25_25 /= var13_13;
                                                    var12_12 = 100;
                                                    var13_13 = var12_12;
                                                    var25_25 *= var13_13;
                                                    if (var20_20 /* !! */  == null) ** GOTO lbl-1000
                                                    var12_12 = var20_20 /* !! */  instanceof M41;
                                                    if (var12_12 == 0) break block56;
                                                    var20_20 /* !! */  = (M41)var20_20 /* !! */ ;
                                                    var16_16 = var20_20 /* !! */ .d;
                                                    var16_16.W6(false);
                                                    ** GOTO lbl-1000
                                                }
                                                var12_12 = var20_20 /* !! */  instanceof ih2_1;
                                                var22_22 = 1065353216;
                                                var23_23 = 1.0f;
                                                if (var12_12 == 0) break block57;
                                                var20_20 /* !! */  = (ih2_1)var20_20 /* !! */ ;
                                                var12_12 = (int)var20_20 /* !! */ .f;
                                                if (var12_12 == 0 && (var12_12 = (int)(var25_25 == var23_23 ? 0 : (var25_25 > var23_23 ? 1 : -1))) > 0) {
                                                    var20_20 /* !! */ .f = var6_6;
                                                    var16_16 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
                                                    var20_20 /* !! */  = var20_20 /* !! */ .b;
                                                    var26_26 = var20_20 /* !! */ .x5();
                                                    if (var26_26 != null) {
                                                        var26_26 = var26_26.getCode();
                                                    } else {
                                                        var21_21 = 0;
                                                        var25_25 = 0.0f;
                                                        var26_26 = null;
                                                    }
                                                    var27_27 = "product_id";
                                                    var24_24 = new Pair(var27_27, var26_26);
                                                    var20_20 /* !! */  = var20_20 /* !! */ .x5();
                                                    if (var20_20 /* !! */  != null) {
                                                        var20_20 /* !! */  = var20_20 /* !! */ .getName();
                                                    } else {
                                                        var28_28 /* !! */  = (float)false;
                                                        var20_20 /* !! */  = null;
                                                    }
                                                    var26_26 = new Pair("product_name", var20_20 /* !! */ );
                                                    var28_28 /* !! */  = 2;
                                                    var20_20 /* !! */  = new Pair[var28_28 /* !! */ ];
                                                    var20_20 /* !! */ [0] = var24_24;
                                                    var20_20 /* !! */ [var6_6] = var26_26;
                                                    var20_20 /* !! */  = DE.b((Pair[])var20_20 /* !! */ );
                                                    var26_26 = "pdp screen";
                                                    var24_24 = "explore more ajiogram products";
                                                    var27_27 = "seen";
                                                    var16_16.newPDPInteractionsCustomEvent((String)var24_24, (String)var27_27, (String)var26_26, var20_20 /* !! */ );
                                                }
                                                ** GOTO lbl-1000
                                            }
                                            var12_12 = var20_20 /* !! */  instanceof ni2_2;
                                            var29_29 = 1117782016;
                                            var30_30 = 80.0f;
                                            var31_31 = 0x40C00000;
                                            var32_32 = 6.0f;
                                            if (var12_12 == 0) break block58;
                                            var20_20 /* !! */  = (ni2_2)var20_20 /* !! */ ;
                                            var13_13 = var20_20 /* !! */ .f;
                                            cfr_temp_0 = var25_25 - var13_13;
                                            var12_12 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                            if (var12_12 > 0) {
                                                var12_12 = 1;
                                                var13_13 = 1.4E-45f;
                                            } else {
                                                var12_12 = 0;
                                                var13_13 = 0.0f;
                                                var16_16 = null;
                                            }
                                            var24_24 = var20_20 /* !! */ .b;
                                            var31_31 = (int)(var25_25 == var32_32 ? 0 : (var25_25 > var32_32 ? 1 : -1));
                                            if (var31_31 > 0 && var12_12 != 0) {
                                                var24_24.W6((boolean)var6_6);
                                            } else {
                                                var29_29 = (int)(var25_25 == var30_30 ? 0 : (var25_25 < var30_30 ? -1 : 1));
                                                if (var29_29 < 0 && var12_12 == 0 && (var12_12 = (int)(var16_16 = var20_20 /* !! */ .c).H0()) == 0) {
                                                    var24_24.W6(false);
                                                }
                                            }
                                            var20_20 /* !! */ .f = var25_25;
                                            ** GOTO lbl-1000
                                        }
                                        var12_12 = var20_20 /* !! */  instanceof ci2_2;
                                        var33_33 = 1109393408 != 0;
                                        var34_34 = 40.0f;
                                        if (var12_12 == 0) break block59;
                                        var20_20 /* !! */  = (ci2_2)var20_20 /* !! */ ;
                                        var16_16 = var20_20 /* !! */ .h;
                                        var28_28 /* !! */  = (float)(var25_25 == var34_34 ? 0 : (var25_25 > var34_34 ? 1 : -1));
                                        if (var28_28 /* !! */  <= 0) break block60;
                                        var16_16.A1((boolean)var6_6);
                                        ** GOTO lbl-1000
                                    }
                                    var16_16.A1(false);
                                    ** GOTO lbl-1000
                                }
                                var12_12 = var20_20 /* !! */  instanceof si2_1;
                                if (var12_12 == 0) break block61;
                                var20_20 /* !! */  = (si2_1)var20_20 /* !! */ ;
                                var12_12 = var7_7.N1;
                                var23_23 = var20_20 /* !! */ .p;
                                cfr_temp_1 = var25_25 - var23_23;
                                var22_22 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                if (var22_22 > 0) {
                                    var22_22 = 1;
                                    var23_23 = 1.4E-45f;
                                } else {
                                    var22_22 = 0;
                                    var23_23 = 0.0f;
                                    var24_24 = null;
                                }
                                var19_19 = var20_20 /* !! */ .b;
                                var31_31 = (int)(var25_25 == var32_32 ? 0 : (var25_25 > var32_32 ? 1 : -1));
                                if (var31_31 > 0 && var22_22 != 0) {
                                    var19_19.W6((boolean)var6_6);
                                } else {
                                    var29_29 = (int)(var25_25 == var30_30 ? 0 : (var25_25 < var30_30 ? -1 : 1));
                                    if (var29_29 < 0 && var22_22 == 0 && (var22_22 = (int)(var24_24 = var20_20 /* !! */ .c).H0()) == 0) {
                                        var19_19.W6(false);
                                    }
                                }
                                var20_20 /* !! */ .p = var25_25;
                                if (var12_12 == var14_14) {
                                    var19_19.W6((boolean)var6_6);
                                }
                                ** GOTO lbl-1000
                            }
                            var17_17 /* !! */  = var20_20 /* !! */  instanceof ij2_2;
                            if (var17_17 /* !! */  == 0) break block62;
                            var20_20 /* !! */  = (ij2_2)var20_20 /* !! */ ;
                            var19_19 = var20_20 /* !! */ .e;
                            var12_12 = (int)(var25_25 == var23_23 ? 0 : (var25_25 > var23_23 ? 1 : -1));
                            if (var12_12 <= 0) break block63;
                            var19_19.getClass();
                            ** GOTO lbl-1000
                        }
                        var16_16 = var20_20 /* !! */ .b.o5();
                        Intrinsics.checkNotNullParameter(var16_16, "storeId");
                        var20_20 /* !! */  = h40_0.a;
                        var12_12 = (int)h40_0.t2((String)var16_16);
                        if (var12_12 != 0 && (var16_16 = gv_1.a) != null && (var28_28 /* !! */  = (float)var16_16.f) == var6_6) {
                            var16_16.h();
                        }
                        var19_19.getClass();
                        ** GOTO lbl-1000
                    }
                    var17_17 /* !! */  = var20_20 /* !! */  instanceof aj2_2;
                    var12_12 = 1092616192;
                    var13_13 = 10.0f;
                    if (var17_17 /* !! */  != 0) {
                        var20_20 /* !! */  = (aj2_2)var20_20 /* !! */ ;
                        var18_18 = var20_20 /* !! */ .n;
                        cfr_temp_2 = var25_25 - var18_18;
                        var17_17 /* !! */  = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var17_17 /* !! */  > 0) {
                            var17_17 /* !! */  = 1;
                            var18_18 = 1.4E-45f;
                        } else {
                            var17_17 /* !! */  = 0;
                            var18_18 = 0.0f;
                            var19_19 = null;
                        }
                        var24_24 = var20_20 /* !! */ .o;
                        var27_27 = var20_20 /* !! */ .b;
                        var12_12 = (int)(var25_25 == var13_13 ? 0 : (var25_25 < var13_13 ? -1 : 1));
                        if (var12_12 < 0 && (var12_12 = (int)Intrinsics.areEqual(var16_16 = var27_27.w5(), var35_35 = Boolean.TRUE)) != 0) {
                            var24_24.s5((boolean)var6_6);
                        } else if (var17_17 /* !! */  != 0 && (var17_17 /* !! */  = (int)((cfr_temp_3 = var25_25 - (var18_18 = 90.0f)) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) > 0 && (var17_17 /* !! */  = (int)Intrinsics.areEqual(var19_19 = var27_27.w5(), var16_16 = Boolean.TRUE)) != 0) {
                            var24_24.s5(false);
                        }
                        var20_20 /* !! */ .n = var25_25;
                        ** continue;
                    }
                    var17_17 /* !! */  = var20_20 /* !! */  instanceof qi2_1;
                    if (var17_17 /* !! */  != 0) {
                        var20_20 /* !! */  = (qi2_1)var20_20 /* !! */ ;
                        var4_4 = null;
                        cfr_temp_4 = var25_25 - 0.0f;
                        var36_40 /* !! */  = (float)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                        if (var36_40 /* !! */  > 0) {
                            var5_5 = true;
                        }
                        if ((var36_40 /* !! */  = var25_25 == var34_34 ? 0 : (var25_25 > var34_34 ? 1 : -1)) > 0 && var5_5) {
                            throw null;
                        }
                        throw null;
                    }
                    var17_17 /* !! */  = 0;
                    var18_18 = 0.0f;
                    var19_19 = null;
                    var14_14 = var20_20 /* !! */  instanceof ai2_2;
                    if (var14_14 != 0) {
                        var20_20 /* !! */  = (ai2_2)var20_20 /* !! */ ;
                        var15_15 = var20_20 /* !! */ .m;
                        cfr_temp_5 = var25_25 - var15_15;
                        var14_14 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                        if (var14_14 > 0) {
                            var14_14 = 1;
                            var15_15 = 1.4E-45f;
                        } else {
                            var14_14 = 0;
                            var15_15 = 0.0f;
                            var35_35 = null;
                        }
                        var24_24 = var20_20 /* !! */ .k;
                        var12_12 = (int)(var25_25 == var13_13 ? 0 : (var25_25 > var13_13 ? 1 : -1));
                        if (var12_12 > 0 && var14_14 != 0) {
                            var24_24.G5((boolean)var6_6);
                            var16_16 = var20_20 /* !! */ .b;
                            var37_36 = var16_16.R2();
                            var14_14 = (int)var20_20 /* !! */ .l;
                            if (var14_14 == 0) {
                                var20_20 /* !! */ .l = var6_6;
                                var35_35 = AnalyticsManager.Companion.getInstance();
                                var24_24 = var35_35.getGtmEvents();
                                var38_37 = var16_16.x5();
                                var27_27 = "pdp_widget_impression";
                                var39_38 = "pdp screen";
                                var33_33 = true;
                                var34_34 = 1.4E-45f;
                                var24_24.pushSuggestionWidgetEvent((String)var27_27, var39_38, var33_33, var37_36, var38_37);
                            }
                        } else {
                            var24_24.G5(false);
                        }
                        var20_20 /* !! */ .m = var25_25;
                    } else {
                        var14_14 = var20_20 /* !! */  instanceof xi2_1;
                        if (var14_14 != 0) {
                            var20_20 /* !! */  = (xi2_1)var20_20 /* !! */ ;
                            var15_15 = var20_20 /* !! */ .l;
                            cfr_temp_6 = var25_25 - var15_15;
                            var14_14 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                            if (var14_14 > 0) {
                                var14_14 = 1;
                                var15_15 = 1.4E-45f;
                            } else {
                                var14_14 = 0;
                                var15_15 = 0.0f;
                                var35_35 = null;
                            }
                            var24_24 = var20_20 /* !! */ .i;
                            var12_12 = (int)(var25_25 == var13_13 ? 0 : (var25_25 > var13_13 ? 1 : -1));
                            if (var12_12 > 0 && var14_14 != 0) {
                                var24_24.U7((boolean)var6_6);
                                var12_12 = (int)var20_20 /* !! */ .k;
                                if (var12_12 == 0) {
                                    var20_20 /* !! */ .k = var6_6;
                                    var16_16 = AnalyticsManager.Companion.getInstance();
                                    var24_24 = var16_16.getGtmEvents();
                                    var40_39 = 28;
                                    var27_27 = "recently_viewed";
                                    var39_38 = "pdp screen";
                                    var33_33 = false;
                                    var34_34 = 0.0f;
                                    var37_36 = null;
                                    var38_37 = null;
                                    GTMEvents.pushSuggestionWidgetEvent$default((GTMEvents)var24_24, (String)var27_27, var39_38, false, null, null, var40_39, null);
                                }
                            } else {
                                var24_24.U7(false);
                            }
                            var20_20 /* !! */ .l = var25_25;
                        } else {
                            var14_14 = var20_20 /* !! */  instanceof zi2_2;
                            if (var14_14 != 0) {
                                var20_20 /* !! */  = (zi2_2)var20_20 /* !! */ ;
                                var15_15 = var20_20 /* !! */ .q;
                                cfr_temp_7 = var25_25 - var15_15;
                                var14_14 = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1));
                                if (var14_14 > 0) {
                                    var14_14 = 1;
                                    var15_15 = 1.4E-45f;
                                } else {
                                    var14_14 = 0;
                                    var15_15 = 0.0f;
                                    var35_35 = null;
                                }
                                var24_24 = var20_20 /* !! */ .o;
                                var12_12 = (int)(var25_25 == var13_13 ? 0 : (var25_25 > var13_13 ? 1 : -1));
                                if (var12_12 > 0 && var14_14 != 0) {
                                    var24_24.X8((boolean)var6_6);
                                    var12_12 = (int)var20_20 /* !! */ .p;
                                    if (var12_12 == 0) {
                                        var20_20 /* !! */ .p = var6_6;
                                        var16_16 = AnalyticsManager.Companion.getInstance();
                                        var24_24 = var16_16.getGtmEvents();
                                        var40_39 = 28;
                                        var27_27 = "similar_to";
                                        var39_38 = "pdp screen";
                                        var33_33 = false;
                                        var34_34 = 0.0f;
                                        var37_36 = null;
                                        var38_37 = null;
                                        GTMEvents.pushSuggestionWidgetEvent$default((GTMEvents)var24_24, (String)var27_27, var39_38, false, null, null, var40_39, null);
                                    }
                                } else {
                                    var24_24.X8(false);
                                }
                                var20_20 /* !! */ .q = var25_25;
                            }
                        }
                    }
                }
                if (var10_10 == var11_11) break;
                var10_10 += var6_6;
                var14_14 = 26;
                var15_15 = 3.6E-44f;
            }
        }
    }
}

