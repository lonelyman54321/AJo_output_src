/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.repo;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import com.ril.ajio.kmm.shared.bonanza.network.CouponBonanzaApi;
import com.ril.ajio.kmm.shared.bonanza.repo.CouponBonanzaRepo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.BaseResponse$Companion;
import com.ril.ajio.kmm.shared.util.Utils;
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class CouponBonanzaRepo$fetchCouponBonanzaDetails$2
extends qg3_2
implements Function2 {
    final /* synthetic */ CouponBonanzaInfoRequest $request;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $url;
    int label;

    public CouponBonanzaRepo$fetchCouponBonanzaDetails$2(String string2, String string3, CouponBonanzaInfoRequest couponBonanzaInfoRequest, f80_0 f80_02) {
        this.$requestId = string2;
        this.$url = string3;
        this.$request = couponBonanzaInfoRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$requestId;
        String string3 = this.$url;
        CouponBonanzaInfoRequest couponBonanzaInfoRequest = this.$request;
        object = new CouponBonanzaRepo$fetchCouponBonanzaDetails$2(string2, string3, couponBonanzaInfoRequest, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (CouponBonanzaRepo$fetchCouponBonanzaDetails$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CouponBonanzaRepo$fetchCouponBonanzaDetails$2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block12: {
            block11: {
                block10: {
                    block13: {
                        var2_6 = j90_0.COROUTINE_SUSPENDED;
                        var3_7 = this.label;
                        var4_8 = 1;
                        var5_9 = 2;
                        if (var3_7 == 0) break block13;
                        if (var3_7 == var4_8) ** GOTO lbl-1000
                        if (var3_7 != var5_9) {
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        try {
                            vl2_2.b(var1_1);
                            return (BaseResponse)var1_1;
                        }
                        catch (ResponseException var1_2) {
                            break block10;
                        }
                        catch (ServerResponseException var1_3) {
                            break block11;
                        }
                        catch (ClientRequestException var1_4) {
                            break block12;
                        }
lbl-1000:
                        // 1 sources

                        {
                            vl2_2.b(var1_1);
                            ** GOTO lbl-1000
                        }
                    }
                    vl2_2.b(var1_1);
                    {
                        var1_1 = CouponBonanzaApi.INSTANCE;
                        var6_10 = this.$requestId;
                        var7_11 = this.$url;
                        var8_12 = this.$request;
                        this.label = var4_8;
                        var1_1 = var1_1.getBonanzaCouponInfo((String)var6_10, var7_11, var8_12, this);
                        if (var1_1 != var2_6) ** GOTO lbl-1000
                        return var2_6;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = (jb1_2)var1_1;
                        var6_10 = var1_1.e();
                        var3_7 = var6_10.a;
                        var4_8 = 200;
                        if (var4_8 <= var3_7 && var3_7 < (var4_8 = 300)) {
                            var6_10 = CouponBonanzaRepo.INSTANCE;
                            this.label = var5_9;
                            if ((var1_1 = CouponBonanzaRepo.access$getResponse((CouponBonanzaRepo)var6_10, (jb1_2)var1_1, this)) != var2_6) return (BaseResponse)var1_1;
                            return var2_6;
                        }
                    }
                    {
                        var2_6 = BaseResponse.Companion;
                        var1_1 = var1_1.e();
                        var9_13 = var1_1.a;
                        var6_10 = new Integer(var9_13);
                        var9_13 = 0;
                        var1_1 = null;
                        return BaseResponse$Companion.onFailed$default((BaseResponse$Companion)var2_6, (Integer)var6_10, null, var5_9, null);
                    }
                }
                var2_6 = BaseResponse.Companion;
                var6_10 = Utils.Companion;
                var4_8 = var1_2.a.e().a;
                var3_7 = var6_10.checkAndGet3DigitRespCode(var4_8);
                var10_14 = new Integer(var3_7);
                var1_5 = var1_2.getMessage();
                var6_10 = new Throwable((String)var1_5);
                return var2_6.onFailed(var10_14, (Throwable)var6_10);
            }
            var2_6 = BaseResponse.Companion;
            var6_10 = Utils.Companion;
            var4_8 = var1_3.a.e().a;
            var3_7 = var6_10.checkAndGet3DigitRespCode(var4_8);
            var10_15 = new Integer(var3_7);
            var1_5 = var1_3.b;
            var6_10 = new Throwable((String)var1_5);
            return var2_6.onFailed(var10_15, (Throwable)var6_10);
        }
        var2_6 = BaseResponse.Companion;
        var6_10 = Utils.Companion;
        var4_8 = var1_4.a.e().a;
        var3_7 = var6_10.checkAndGet3DigitRespCode(var4_8);
        var10_16 = new Integer(var3_7);
        var1_5 = var1_4.b;
        var6_10 = new Throwable((String)var1_5);
        return var2_6.onFailed(var10_16, (Throwable)var6_10);
    }
}

