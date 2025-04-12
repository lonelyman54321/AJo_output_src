/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.repo;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo$fetchCouponBonanzaDetails$2;
import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo$getResponse$1;
import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo$purchaseCoupons$2;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.util.DispatchersKt;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.c;

public final class CouponBonanzaRepo {
    public static final CouponBonanzaRepo INSTANCE;

    static {
        CouponBonanzaRepo couponBonanzaRepo;
        INSTANCE = couponBonanzaRepo = new CouponBonanzaRepo();
    }

    private CouponBonanzaRepo() {
    }

    public static final /* synthetic */ Object access$getResponse(CouponBonanzaRepo couponBonanzaRepo, jb1_2 jb1_22, f80_0 f80_02) {
        return couponBonanzaRepo.getResponse(jb1_22, f80_02);
    }

    /*
     * Unable to fully structure code
     */
    private final Object getResponse(jb1_2 var1_1, f80_0 var2_2) {
        block16: {
            block14: {
                block15: {
                    block11: {
                        block12: {
                            block13: {
                                var3_3 = var2_2 instanceof CouponBonanzaRepo$getResponse$1;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (CouponBonanzaRepo$getResponse$1)var2_2;
                                var5_5 = var4_4.label;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7 != 0) {
                                    var4_4.label = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new CouponBonanzaRepo$getResponse$1(this, (f80_0)var2_2);
                                }
                                var2_2 = var4_4.result;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.label;
                                var7_7 = 2;
                                var9_9 = 1;
                                if (var6_6 == 0) break block11;
                                if (var6_6 == var9_9) break block12;
                                if (var6_6 != var7_7) break block13;
                                vl2_2.b(var2_2);
                                break block14;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var1_1 = (jb1_2)var4_4.L$0;
                        vl2_2.b(var2_2);
                        break block15;
                    }
                    vl2_2.b(var2_2);
                    var2_2 = var1_1.a();
                    var10_10 = CouponBonanzaInfo.class;
                    var11_11 = Reflection.getOrCreateKotlinClass(var10_10);
                    try {
                        var10_10 = Reflection.typeOf(var10_10);
                    }
                    catch (Throwable v0) {
                        var6_6 = 0;
                        var10_10 = null;
                    }
                    var12_12 = new at3_0(var11_11, (kn1_1)var10_10);
                    var4_4.L$0 = var1_1;
                    var4_4.label = var9_9;
                    var2_2 = var2_2.a(var12_12, var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    }
                }
                if (var2_2 == null) break block16;
                var10_10 = (var2_2 = (CouponBonanzaInfo)var2_2).getCouponsAvailable();
                if (var10_10 == null && (var10_10 = var2_2.getMyCoupons()) == null && (var10_10 = var2_2.getPointsBalance()) == null) {
                    var1_1 = var1_1.a();
                    var2_2 = CouponBonanzaErrorInfo.class;
                    var10_10 = Reflection.getOrCreateKotlinClass(var2_2);
                    try {
                        var2_2 = Reflection.typeOf(var2_2);
                    }
                    catch (Throwable v1) {
                        var2_2 = null;
                    }
                    var13_13 = new at3_0((yn1_2)var10_10, (kn1_1)var2_2);
                    var4_4.L$0 = null;
                    var4_4.label = var7_7;
                    var2_2 = var1_1.a(var13_13, var4_4);
                    if (var2_2 == var8_8) {
                        return var8_8;
                    } else {
                        ** GOTO lbl65
                    }
                }
                ** GOTO lbl72
            }
            if (var2_2 != null) {
                var2_2 = (CouponBonanzaErrorInfo)var2_2;
                var1_1 = BaseResponse.Companion.onSuccess(var2_2);
            } else {
                var1_1 = new NullPointerException("null cannot be cast to non-null type com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo");
                throw var1_1;
lbl72:
                // 1 sources

                var1_1 = BaseResponse.Companion.onSuccess(var2_2);
            }
            return var1_1;
        }
        var1_1 = new NullPointerException("null cannot be cast to non-null type com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo");
        throw var1_1;
    }

    public final Object fetchCouponBonanzaDetails(String string2, String string3, CouponBonanzaInfoRequest couponBonanzaInfoRequest, f80_0 f80_02) {
        c c2 = DispatchersKt.getIoDispatcher();
        CouponBonanzaRepo$fetchCouponBonanzaDetails$2 couponBonanzaRepo$fetchCouponBonanzaDetails$2 = new CouponBonanzaRepo$fetchCouponBonanzaDetails$2(string2, string3, couponBonanzaInfoRequest, null);
        return Ae3.g(f80_02, c2, couponBonanzaRepo$fetchCouponBonanzaDetails$2);
    }

    public final Object purchaseCoupons(String string2, String string3, CouponBonanzaInfoRequest couponBonanzaInfoRequest, f80_0 f80_02) {
        c c2 = DispatchersKt.getIoDispatcher();
        CouponBonanzaRepo$purchaseCoupons$2 couponBonanzaRepo$purchaseCoupons$2 = new CouponBonanzaRepo$purchaseCoupons$2(string2, string3, couponBonanzaInfoRequest, null);
        return Ae3.g(f80_02, c2, couponBonanzaRepo$purchaseCoupons$2);
    }
}

