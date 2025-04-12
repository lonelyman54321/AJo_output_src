/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartInventory;
import com.ril.ajio.services.data.Cart.Extra;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FX1$b
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;
    public final /* synthetic */ boolean b;

    public FX1$b(wx1_1 wx1_12, boolean bl2) {
        this.a = wx1_12;
        this.b = bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(DataCallback var1_1, f80_0 var2_2) {
        block40: {
            block38: {
                block39: {
                    var3_3 = this;
                    var4_4 = var2_2;
                    var5_5 = var2_2 instanceof FX1$b$b;
                    if (!var5_5) ** GOTO lbl-1000
                    var6_6 = var2_2;
                    var6_6 = (FX1$b$b)var2_2;
                    var7_7 = var6_6.e;
                    var8_8 = -1 << -1;
                    var9_9 = -0.0f;
                    var10_10 = var7_7 & var8_8;
                    if (var10_10 != 0) {
                        var6_6.e = var7_7 -= var8_8;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var6_6 = new FX1$b$b(var3_3, (f80_0)var4_4);
                    }
                    var4_4 = var6_6.c;
                    var11_11 = j90_0.COROUTINE_SUSPENDED;
                    var8_8 = var6_6.e;
                    var10_10 = 1;
                    if (var8_8 == 0) break block38;
                    if (var8_8 != var10_10) break block39;
                    var11_11 = var6_6.b;
                    var6_6 = var6_6.a;
                    vl2_2.b(var4_4);
                    var4_4 = var11_11;
                    break block40;
                }
                var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var4_4;
            }
            vl2_2.b(var4_4);
            var4_4 = new Ref$ObjectRef();
            var4_4.element = var12_12 = var1_1.getData();
            var12_12 = h40_0.a;
            var8_8 = (int)h40_0.k2();
            var13_13 = 0;
            var14_14 = null;
            var15_15 = null;
            if (var8_8 == 0) {
                var12_12 = (Cart)var4_4.element;
                if (var12_12 != null) {
                    var16_16 = var12_12.getRvpReturnFee();
                    if (var16_16 != null) {
                        var17_17 = var12_12.getRvpReturnFee();
                        if (var17_17 != null && (var18_18 = var17_17.getActionContent()) != null) {
                            var17_17 = new Float(0.0f);
                            var19_19 = null;
                            var20_20 = 0;
                            var21_21 = null;
                            var22_22 = 0;
                            var23_23 = null;
                            var24_24 = 0x7FBFFFF;
                            var18_18 = var14_14 = ActionContent.copy$default((ActionContent)var18_18, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Float)var17_17, null, null, null, null, null, null, null, null, var24_24, null);
                        } else {
                            var25_25 = false;
                            var18_18 = null;
                        }
                        var26_26 = false;
                        var17_17 = null;
                        var19_19 = null;
                        var20_20 = 0;
                        var21_21 = null;
                        var22_22 = 125;
                        var14_14 = ProfileHealth.copy$default(var16_16, null, (ActionContent)var18_18, null, null, null, null, null, var22_22, null);
                    } else {
                        var13_13 = 0;
                        var14_14 = null;
                    }
                    var12_12.setRvpReturnFee((ProfileHealth)var14_14);
                } else {
                    var8_8 = 0;
                    var12_12 = null;
                    var9_9 = 0.0f;
                }
                var4_4.element = var12_12;
            } else {
                var12_12 = (Cart)var4_4.element;
                if (var12_12 != null && (var12_12 = var12_12.getRvpReturnFee()) != null && (var12_12 = var12_12.getReturnFee()) != null) {
                    var9_9 = var12_12.floatValue();
                } else {
                    var8_8 = 0;
                    var9_9 = 0.0f;
                    var12_12 = null;
                }
                var8_8 = (int)((cfr_temp_0 = var9_9 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var8_8 > 0) {
                    var12_12 = (Cart)var4_4.element;
                    if (var12_12 != null) {
                        var14_14 = var12_12.getRvpReturnFee().getReturnPercent();
                        if (var14_14 != null) {
                            var13_13 = var14_14.intValue();
                        } else {
                            var13_13 = 0;
                            var14_14 = null;
                        }
                        var19_19 = new Extra(var13_13);
                        var16_16 = var12_12.getRvpReturnFee();
                        if (var16_16 != null) {
                            var14_14 = var12_12.getRvpReturnFee();
                            var21_21 = var14_14.getActionContent();
                            if (var21_21 != null) {
                                var14_14 = var12_12.getRvpReturnFee();
                                var23_23 = var14_14 != null ? (var14_14 = var14_14.getReturnFee()) : null;
                                var24_24 = 0;
                                var22_22 = 0;
                                var27_27 = 0x7FBFFFF;
                                var18_18 = var14_14 = ActionContent.copy$default((ActionContent)var21_21, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (Float)var23_23, null, null, null, null, null, null, null, null, var27_27, null);
                            } else {
                                var25_25 = false;
                                var18_18 = null;
                            }
                            var26_26 = false;
                            var17_17 = null;
                            var20_20 = 0;
                            var21_21 = null;
                            var22_22 = 121;
                            var14_14 = ProfileHealth.copy$default(var16_16, null, (ActionContent)var18_18, (Extra)var19_19, null, null, null, null, var22_22, null);
                        } else {
                            var13_13 = 0;
                            var14_14 = null;
                        }
                        var12_12.setRvpReturnFee((ProfileHealth)var14_14);
                    } else {
                        var8_8 = 0;
                        var12_12 = null;
                        var9_9 = 0.0f;
                    }
                    var4_4.element = var12_12;
                }
            }
            var12_12 = (Cart)var4_4.element;
            if (var12_12 != null) {
                var12_12 = var12_12.getEntries();
            } else {
                var8_8 = 0;
                var12_12 = null;
                var9_9 = 0.0f;
            }
            if (var12_12 == null || (var8_8 = (int)var12_12.isEmpty()) != 0) ** GOTO lbl142
            var12_12 = (Cart)var4_4.element;
            if (var12_12 != null) {
                var15_15 = var12_12.getStockStatus();
            }
            var12_12 = var3_3.a;
            if (var15_15 == null) ** GOTO lbl-1000
            var14_14 = z40_0.Companion;
            var14_14 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var14_14).a;
            var15_15 = "firebase_cart_inventory_enabled";
            var13_13 = (int)var14_14.a((String)var15_15);
            if (var13_13 != 0) {
                var4_4 = (Cart)var4_4.element;
                if (var4_4 != null) {
                    var6_6 = var12_12.c.bindCartInventoryData((Cart)var4_4);
                    var4_4.setCartInventory((CartInventory)var6_6);
                }
lbl142:
                // 4 sources

                var4_4 = var1_1;
            } else lbl-1000:
            // 2 sources

            {
                var14_14 = var12_12.c.getInventoryData();
                var15_15 = new FX1$b$a((wx1_1)var12_12, (Ref$ObjectRef)var4_4);
                var6_6.a = var3_3;
                var4_4 = var1_1;
                var6_6.b = var1_1;
                var6_6.e = var10_10;
                if ((var6_6 = var14_14.collect((fs0_2)var15_15, (f80_0)var6_6)) == var11_11) {
                    return var11_11;
                }
            }
            var6_6 = var3_3;
        }
        var11_11 = (Cart)var4_4.getData();
        if (var11_11 != null && (var11_11 = var11_11.getEntries()) != null) {
            var6_6.a.getClass();
            Intrinsics.checkNotNullParameter(var11_11, "entries");
            var12_12 = var11_11.iterator();
            var28_28 = 0x7FFFFFFFFFFFFFFFL;
            var30_29 = -9223372036854775808L;
            while (var26_26 = var12_12.hasNext()) {
                var17_17 = (CartEntry)var12_12.next();
                var18_18 = var17_17.getServicabilityInfo();
                if (var18_18 == null || (var18_18 = var18_18.getEddUpper()) == null) continue;
                var18_18 = var17_17.getServicabilityInfo().getEddLower();
                var25_25 = TextUtils.isEmpty((CharSequence)var18_18);
                var19_19 = "yyyy-MM-dd'T'HH:mm:ssZZZZ";
                var32_30 = -1;
                if (!var25_25) {
                    var18_18 = var17_17.getServicabilityInfo().getEddLower();
                    var34_31 = k7.w((String)var18_18, (String)var19_19);
                } else {
                    var34_31 = var32_30;
                }
                var18_18 = var17_17.getServicabilityInfo().getEddUpper();
                var36_32 = k7.w((String)var18_18, (String)var19_19);
                var22_22 = (int)(var34_31 == var32_30 ? 0 : (var34_31 < var32_30 ? -1 : 1));
                if (var22_22 == 0) {
                    var34_31 = var36_32;
                }
                if ((var20_20 = var34_31 == var28_28 ? 0 : (var34_31 < var28_28 ? -1 : 1)) < 0) {
                    var28_28 = var34_31;
                }
                if ((var20_20 = (int)(var36_32 == var30_29 ? 0 : (var36_32 < var30_29 ? -1 : 1))) > 0) {
                    var30_29 = var36_32;
                }
                var21_21 = k7.d(var34_31, var36_32);
                var17_17.setEddDate((String)var21_21);
                var18_18 = k7.e(var34_31, var36_32);
                var17_17.setEddFormattedDate((String)var18_18);
            }
            var11_11 = var11_11.iterator();
            var12_12 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(var11_11, (String)var12_12);
            while ((var8_8 = (int)var11_11.hasNext()) != 0) {
                var12_12 = (CartEntry)var11_11.next();
                var38_33 = var12_12.getProduct();
                var14_14 = var12_12.getExperimentId();
                var38_33.setExperimentId((String)var14_14);
                var38_33 = var12_12.getProduct();
                var12_12 = var12_12.getSegmentId();
                var38_33.setSegmentId((String)var12_12);
            }
        }
        var7_7 = (int)var6_6.b;
        var6_6 = var6_6.a;
        if (var7_7 != 0) {
            var6_6 = var6_6.h;
            var6_6.k(var4_4);
        } else {
            var6_6 = var6_6.n;
            var6_6.k(var4_4);
        }
        return Unit.a;
    }
}

