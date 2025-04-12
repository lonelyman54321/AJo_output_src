/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from kO
 */
public final class ko_2 {
    public final wx1_1 a;

    public ko_2(wx1_1 wx1_12) {
        Intrinsics.checkNotNullParameter(wx1_12, "cartViewModel");
        this.a = wx1_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList a(boolean var1_1) {
        block112: {
            block113: {
                block115: {
                    block116: {
                        block114: {
                            var2_2 = new ArrayList<Object>();
                            var3_3 = this.a;
                            var4_4 = var3_3.S0;
                            if (var4_4 == null) break block113;
                            var5_5 = var3_3.X0;
                            var6_6 = 0;
                            if (var5_5 != 0) {
                                var3_3.W0 = false;
                            }
                            if ((var5_5 = var3_3.Y0) != 0) {
                                var3_3.W0 = false;
                            }
                            var4_4 = var4_4.getFreeDeliveryBannerUrl();
                            var7_7 = TextUtils.isEmpty((CharSequence)var4_4);
                            var5_5 = 1;
                            if (!var7_7) {
                                var8_8 = var3_3.S0;
                                if (var8_8 != null) {
                                    var8_8 = var8_8.getFreeDeliveryBannerUrl();
                                } else {
                                    var9_9 = 0;
                                    var8_8 = null;
                                    var10_10 = 0.0f;
                                }
                                var4_4 = new su3(var5_5, (String)var8_8, null);
                                var2_2.add(0, var4_4);
                            }
                            if ((var4_4 = var3_3.S0) != null) {
                                var4_4 = var4_4.getEntries();
                            } else {
                                var7_7 = false;
                                var4_4 = null;
                                var11_11 = 0.0f;
                            }
                            if (var4_4 != null && !(var7_7 = var4_4.isEmpty())) {
                                var7_7 = 20 != 0;
                                var11_11 = 2.8E-44f;
                                jo_1.a((int)var7_7, null, null, var2_2);
                            }
                            if (var7_7 = var3_3.W0) {
                                var7_7 = 11 != 0;
                                var11_11 = 1.5E-44f;
                                jo_1.a((int)var7_7, null, null, var2_2);
                            }
                            var4_4 = h40_0.a;
                            var9_9 = h40_0.O1();
                            if (var9_9 != 0) {
                                var8_8 = var3_3.S0;
                                if (var8_8 != null) {
                                    var8_8 = var8_8.getPriorityDeliveryAlertMessage();
                                } else {
                                    var9_9 = 0;
                                    var8_8 = null;
                                    var10_10 = 0.0f;
                                }
                                if (var8_8 != null && (var9_9 = var8_8.length()) != 0 && (var9_9 = (int)var3_3.Y0) == 0) {
                                    var9_9 = 24;
                                    var10_10 = 3.4E-44f;
                                    jo_1.a(var9_9, null, null, var2_2);
                                }
                            }
                            if ((var8_8 = var3_3.S0) != null) {
                                var8_8 = var8_8.getMergedCartEntries();
                            } else {
                                var9_9 = 0;
                                var8_8 = null;
                                var10_10 = 0.0f;
                            }
                            if (var8_8 != null && (var9_9 = (int)var8_8.isEmpty()) == 0) {
                                var9_9 = 3;
                                var10_10 = 4.2E-45f;
                                jo_1.a(var9_9, null, null, var2_2);
                            }
                            if ((var8_8 = var3_3.S0) != null) {
                                var8_8 = var8_8.getLowStockCartEntries();
                            } else {
                                var9_9 = 0;
                                var8_8 = null;
                                var10_10 = 0.0f;
                            }
                            if (var8_8 != null && (var9_9 = (int)var8_8.isEmpty()) == 0) {
                                var9_9 = 5;
                                var10_10 = 7.0E-45f;
                                jo_1.a(var9_9, null, null, var2_2);
                            }
                            var7_7 = var4_4.f1();
                            var8_8 = "next(...)";
                            var12_12 = "iterator(...)";
                            if (var7_7) {
                                var4_4 = var3_3.S0;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getEntries();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                if (var4_4 != null && !(var7_7 = (boolean)var4_4.isEmpty())) {
                                    var4_4 = var3_3.S0;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.getEntries();
                                    } else {
                                        var7_7 = false;
                                        var4_4 = null;
                                        var11_11 = 0.0f;
                                    }
                                    var13_13 = new ArrayList();
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.iterator();
                                        Intrinsics.checkNotNullExpressionValue(var4_4, (String)var12_12);
                                        while (var14_14 = var4_4.hasNext()) {
                                            var15_15 = var4_4.next();
                                            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var8_8);
                                            var16_16 = (var15_15 = (CartEntry)var15_15).isGiftProduct();
                                            if (var16_16 == null || !(var17_17 = var16_16.booleanValue())) continue;
                                            var13_13.add(var15_15);
                                        }
                                    }
                                    if ((var4_4 = var3_3.S0) != null) {
                                        var4_4.setGwpGiftEntries((ArrayList)var13_13);
                                    }
                                    if (var7_7 = var13_13.isEmpty() ^ var5_5) {
                                        var7_7 = 23 != 0;
                                        var11_11 = 3.2E-44f;
                                        jo_1.a((int)var7_7, null, null, var2_2);
                                    }
                                }
                            }
                            if ((var18_18 = (var4_4 = var3_3.T0).isEmpty() ^ var5_5) != 0) {
                                cp_1.Companion.getClass();
                                var13_13 = cp$a.j();
                                var15_15 = "master_flag";
                                var18_18 = (int)var13_13.has((String)var15_15);
                                if (var18_18 != 0 && (var18_18 = (int)(var13_13 = cp$a.j()).getBoolean((String)var15_15)) != 0) {
                                    var18_18 = 19;
                                    var19_19 = 2.7E-44f;
lbl118:
                                    // 2 sources

                                    while (true) {
                                        jo_1.a(var18_18, null, null, var2_2);
                                        break;
                                    }
                                } else {
                                    var18_18 = 13;
                                    var19_19 = 1.8E-44f;
                                    ** continue;
                                }
                            }
                            if ((var13_13 = var3_3.S0) != null) {
                                var13_13 = var13_13.getEntries();
                            } else {
                                var18_18 = 0;
                                var13_13 = null;
                                var19_19 = 0.0f;
                            }
                            var15_15 = var3_3.C;
                            var20_20 = 22;
                            var21_21 = "HEALTHY";
                            var22_22 = "NO_ACTION";
                            var6_6 = 25;
                            var23_23 = 15;
                            if (var13_13 == null || (var18_18 = (int)var13_13.isEmpty()) != 0) break block114;
                            var13_13 = var3_3.S0;
                            if (var13_13 != null) {
                                var19_19 = var13_13.getBagTotal();
                            } else {
                                var18_18 = 0;
                                var19_19 = 0.0f;
                                var13_13 = null;
                            }
                            var18_18 = (int)((cfr_temp_0 = var19_19 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var18_18 <= 0) break block114;
                            var13_13 = var3_3.S0;
                            if (var13_13 != null) {
                                var13_13 = var13_13.getEntries();
                            } else {
                                var18_18 = 0;
                                var13_13 = null;
                                var19_19 = 0.0f;
                            }
                            if (var13_13 == null) break block114;
                            var13_13 = var13_13.iterator();
                            Intrinsics.checkNotNullExpressionValue(var13_13, (String)var12_12);
                            while (var24_24 = var13_13.hasNext()) {
                                var16_16 = var13_13.next();
                                Intrinsics.checkNotNullExpressionValue(var16_16, (String)var8_8);
                                var17_17 = (var16_16 = (CartEntry)var16_16).isQuantityAvailable();
                                if (!var17_17) continue;
                                var3_3.e(var2_2);
                                var4_4 = var3_3.S0;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getEntries();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                Intrinsics.checkNotNull(var4_4);
                                var4_4 = var4_4.iterator();
                                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var12_12);
                                while ((var9_9 = (int)var4_4.hasNext()) != 0) {
                                    var8_8 = (CartEntry)var4_4.next();
                                    if (var8_8 == null || (var12_12 = var8_8.isGiftProduct()) == null) continue;
                                    var25_25 = var12_12.booleanValue();
                                    var18_18 = (int)var8_8.isQuantityAvailable();
                                    if (var18_18 == 0 || var25_25 != 0) continue;
                                    var2_2.add(var8_8);
                                }
                                var4_4 = (DataCallback)var15_15.d();
                                if (var4_4 != null && (var4_4 = (ProductsList)var4_4.getData()) != null) {
                                    var4_4 = var4_4.getProducts();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                if ((var4_4 != null || (var4_4 = var3_3.V0) != null && (var4_4 = var4_4.getProducts()) != null && !(var7_7 = (boolean)(var4_4 = (Collection)var4_4).isEmpty())) && var1_1) {
                                    jo_1.a(var23_23, null, null, var2_2);
                                }
                                var4_4 = new su3(14, null, null);
                                var2_2.add(var4_4);
                                var7_7 = 6 != 0;
                                var11_11 = 8.4E-45f;
                                jo_1.a((int)var7_7, null, null, var2_2);
                                var4_4 = var3_3.d1;
                                var26_26 = var4_4.getEligibleEarnAmount();
                                var28_27 = 0.0;
                                var23_23 = (int)(var26_26 == var28_27 ? 0 : (var26_26 > var28_27 ? 1 : -1));
                                if (var23_23 > 0 || (var7_7 = (boolean)((cfr_temp_1 = (var11_11 = var4_4.getAdditionalPurchaseAmount()) - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) > false) {
                                    var7_7 = 12 != 0;
                                    var11_11 = 1.7E-44f;
                                    jo_1.a((int)var7_7, null, null, var2_2);
                                }
                                var4_4 = cp_1.Companion;
                                var4_4.getClass();
                                var7_7 = cp$a.i();
                                if (var7_7 && (var4_4 = var3_3.q1.a()) != null && (var7_7 = var4_4.length()) && (var4_4 = var3_3.S0) != null) {
                                    var7_7 = var4_4.isOtpValidationRequired();
                                    var30_28 = var3_3.S0;
                                    if (var30_28 != null && (var30_28 = var30_28.getInternalWallets()) != null) {
                                        var9_9 = 2;
                                        var10_10 = 2.8E-45f;
                                        jo_1.a(var9_9, null, null, var2_2);
                                        if (var7_7) {
                                            var9_9 = 28;
                                            var10_10 = 3.9E-44f;
                                            jo_1.a(var9_9, null, null, var2_2);
                                        }
                                        var8_8 = var30_28.iterator();
                                        var25_25 = 0;
                                        var12_12 = null;
                                        while ((var18_18 = (int)var8_8.hasNext()) != 0) {
                                            var13_13 = (PaymentInstrumentInfo)var8_8.next();
                                            var15_15 = var13_13.getCode();
                                            var14_14 = Intrinsics.areEqual(var15_15, var16_16 = "RELIANCE_ONE_WALLET");
                                            if (!var14_14 && !(var14_14 = Intrinsics.areEqual(var15_15 = var13_13.getCode(), var16_16 = "MAHA_CASHBACK")) && !(var14_14 = Intrinsics.areEqual(var15_15 = var13_13.getCode(), var16_16 = "TAARA_WALLET"))) continue;
                                            if ((var13_13 = var13_13.getAvailableAmount()) != null) {
                                                var19_19 = var13_13.floatValue();
                                            } else {
                                                var18_18 = 0;
                                                var19_19 = 0.0f;
                                                var13_13 = null;
                                            }
                                            if ((var18_18 = (int)((cfr_temp_2 = var19_19 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) <= 0) continue;
                                            var25_25 = 1;
                                        }
                                        if (var25_25 == 0) {
                                            var9_9 = R$string.loyalty_pts;
                                            var8_8 = hv3_0.K(var9_9);
                                            var13_13 = var3_3.S0;
                                            if (var13_13 != null) {
                                                var13_13 = var13_13.getLoyaltyPointsInfo();
                                            } else {
                                                var18_18 = 0;
                                                var13_13 = null;
                                                var19_19 = 0.0f;
                                            }
                                            var12_12 = new InternalWalletDataHolder(var7_7, null, (String)var8_8, (String)var13_13);
                                            var9_9 = 33;
                                            var10_10 = 4.6E-44f;
                                            jo_1.a(var9_9, null, (InternalWalletDataHolder)var12_12, var2_2);
                                        }
                                        var30_28 = var30_28.iterator();
                                        while ((var9_9 = (int)var30_28.hasNext()) != 0) {
                                            var31_29 = var8_8 = var30_28.next();
                                            var31_29 = (PaymentInstrumentInfo)var8_8;
                                            if ((var8_8 = var31_29.getAvailableAmount()) != null) {
                                                var10_10 = var8_8.floatValue();
                                            } else {
                                                var9_9 = 0;
                                                var10_10 = 0.0f;
                                                var8_8 = null;
                                            }
                                            if ((var9_9 = (int)((cfr_temp_3 = var10_10 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) <= 0) continue;
                                            var32_30 = 12;
                                            var8_8 = new InternalWalletDataHolder(var7_7, (PaymentInstrumentInfo)var31_29, null, null, var32_30, null);
                                            var25_25 = 31;
                                            jo_1.a(var25_25, null, (InternalWalletDataHolder)var8_8, var2_2);
                                        }
                                    }
                                }
                                if (var7_7 = (boolean)var3_3.c()) {
                                    var4_4 = h40_0.a;
                                    var7_7 = h40_0.k2();
                                    if (var7_7 && (var7_7 = (boolean)mz3_0.D((Cart)(var4_4 = var3_3.S0)))) {
                                        jo_1.a(var6_6, null, null, var2_2);
lbl271:
                                        // 7 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                }
                                if (!(var7_7 = (boolean)var3_3.c())) ** GOTO lbl271
                                var4_4 = var3_3.S0;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getPROFILE_HEALTH();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                if (var4_4 == null) ** GOTO lbl271
                                var4_4 = h40_0.a;
                                var7_7 = h40_0.R1();
                                if (!var7_7) ** GOTO lbl271
                                var4_4 = var3_3.S0;
                                if (var4_4 != null && (var4_4 = var4_4.getPROFILE_HEALTH()) != null) {
                                    var4_4 = var4_4.getAction();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                if (var7_7 = (boolean)b.i((String)var4_4, var22_22, (boolean)var5_5)) ** GOTO lbl271
                                var4_4 = var3_3.S0;
                                if (var4_4 != null && (var4_4 = var4_4.getPROFILE_HEALTH()) != null) {
                                    var4_4 = var4_4.getAction();
                                } else {
                                    var7_7 = false;
                                    var4_4 = null;
                                    var11_11 = 0.0f;
                                }
                                if (var7_7 = (boolean)b.i((String)var4_4, var21_21, (boolean)var5_5)) ** GOTO lbl271
                                jo_1.a(var20_20, null, null, var2_2);
                                ** continue;
                                var7_7 = 9 != 0;
                                var11_11 = 1.3E-44f;
                                jo_1.a((int)var7_7, null, null, var2_2);
                                var4_4 = var3_3.n1.b;
                                if (var4_4 != null) {
                                    var4_4 = var4_4.getCartExchangeReturnPolicyFlag();
                                    var30_28 = Boolean.TRUE;
                                    var7_7 = Intrinsics.areEqual(var4_4, var30_28);
                                } else {
                                    var7_7 = false;
                                    var11_11 = 0.0f;
                                    var4_4 = null;
                                }
                                if (var7_7) {
                                    var7_7 = 18 != 0;
                                    var11_11 = 2.5E-44f;
                                    jo_1.a((int)var7_7, null, null, var2_2);
                                }
                                if ((var7_7 = (boolean)og1_1.b()) || !(var7_7 = (boolean)pa_1.a())) ** GOTO lbl-1000
                                cp_1.Companion.getClass();
                                var4_4 = cp$a.q();
                                var30_28 = "cart_flag";
                                var7_7 = var4_4.has((String)var30_28);
                                if (var7_7 && (var7_7 = (boolean)(var4_4 = cp$a.q()).getBoolean(var30_28))) {
                                    var6_6 = 1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var6_6 = 0;
                                }
                                if (var6_6 != 0) {
                                    var4_4 = var3_3.m1;
                                    if (var4_4 != null) {
                                        var4_4 = var4_4.getGifts();
                                    } else {
                                        var7_7 = false;
                                        var4_4 = null;
                                        var11_11 = 0.0f;
                                    }
                                    if (var4_4 != null) {
                                        var3_3 = var3_3.m1;
                                        if (var3_3 != null) {
                                            var3_3 = var3_3.getGifts();
                                        } else {
                                            var33_31 = 0;
                                            var3_3 = null;
                                        }
                                        Intrinsics.checkNotNull(var3_3);
                                        var3_3 = (Collection)var3_3;
                                        var33_31 = var3_3.isEmpty() ^ var5_5;
                                        if (var33_31 != 0) {
                                            var33_31 = 17;
lbl349:
                                            // 2 sources

                                            while (true) {
                                                jo_1.a(var33_31, null, null, var2_2);
                                                ** GOTO lbl442
                                                break;
                                            }
                                        }
                                    }
                                }
                                break block112;
                            }
                        }
                        var3_3.e(var2_2);
                        var8_8 = var3_3.S0;
                        if (var8_8 != null) {
                            var8_8 = var8_8.getEntries();
                        } else {
                            var9_9 = 0;
                            var8_8 = null;
                            var10_10 = 0.0f;
                        }
                        if (var8_8 != null && (var9_9 = (int)var8_8.isEmpty()) == 0) {
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var8_8 = null;
                        } else {
                            var9_9 = 1;
                            var10_10 = 1.4E-45f;
                        }
                        if (var9_9 != 0 && (var9_9 = var4_4.size()) <= 0) {
                            var9_9 = 16;
                            var10_10 = 2.2E-44f;
                            jo_1.a(var9_9, null, null, var2_2);
                        }
                        if ((var9_9 = var4_4.size()) <= 0) break block115;
                        var8_8 = (DataCallback)var15_15.d();
                        if (var8_8 != null && (var8_8 = (ProductsList)var8_8.getData()) != null) {
                            var8_8 = var8_8.getProducts();
                        } else {
                            var9_9 = 0;
                            var8_8 = null;
                            var10_10 = 0.0f;
                        }
                        if (var8_8 != null) break block116;
                        var8_8 = var3_3.V0;
                        if (var8_8 != null && (var8_8 = var8_8.getProducts()) != null && (var9_9 = (int)(var8_8 = (Collection)var8_8).isEmpty()) == 0) {
                            var9_9 = 1;
                            var10_10 = 1.4E-45f;
                        } else {
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var8_8 = null;
                        }
                        if (var9_9 == 0) break block115;
                    }
                    if (var1_1) {
                        jo_1.a(var23_23, null, null, var2_2);
                    }
                }
                if ((var7_7 = var4_4.size()) <= false) break block112;
                var23_23 = 9;
                var4_4 = new su3(var23_23, null, null);
                var2_2.add(var4_4);
                var7_7 = var3_3.c();
                if (!var7_7) ** GOTO lbl-1000
                var4_4 = h40_0.a;
                var7_7 = h40_0.k2();
                if (var7_7 && (var7_7 = (boolean)mz3_0.D((Cart)(var4_4 = var3_3.S0)))) {
                    jo_1.a(var6_6, null, null, var2_2);
                } else if (var7_7 = (boolean)var3_3.c()) {
                    var4_4 = var3_3.S0;
                    if (var4_4 != null) {
                        var4_4 = var4_4.getPROFILE_HEALTH();
                    } else {
                        var7_7 = false;
                        var4_4 = null;
                        var11_11 = 0.0f;
                    }
                    var6_6 = var4_4 == null ? 1 : 0;
                    if (var6_6 == 0) {
                        var4_4 = h40_0.a;
                        var7_7 = h40_0.R1();
                        if (var7_7) {
                            var4_4 = var3_3.S0;
                            if (var4_4 != null && (var4_4 = var4_4.getPROFILE_HEALTH()) != null) {
                                var4_4 = var4_4.getAction();
                            } else {
                                var7_7 = false;
                                var4_4 = null;
                                var11_11 = 0.0f;
                            }
                            var7_7 = b.i((String)var4_4, var22_22, (boolean)var5_5);
                            if (!var7_7) {
                                var3_3 = var3_3.S0;
                                if (var3_3 != null && (var3_3 = var3_3.getPROFILE_HEALTH()) != null) {
                                    var3_3 = var3_3.getAction();
                                } else {
                                    var33_32 = false;
                                    var3_3 = null;
                                }
                                var33_32 = b.i((String)var3_3, var21_21, (boolean)var5_5);
                                if (!var33_32) {
                                    jo_1.a(var20_20, null, null, var2_2);
                                }
                            }
                        }
                    }
                }
                break block112;
            }
            var33_31 = 16;
            ** while (true)
        }
        return var2_2;
    }
}

