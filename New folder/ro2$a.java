/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.response.InternalWalletsInfo;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ro2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ PaymentInstruments b;
    public final /* synthetic */ TenantResponse c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;

    public ro2$a(fs0_2 fs0_22, PaymentInstruments paymentInstruments, TenantResponse tenantResponse, boolean bl2, ArrayList arrayList) {
        this.a = fs0_22;
        this.b = paymentInstruments;
        this.c = tenantResponse;
        this.d = bl2;
        this.e = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ro2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ro2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ro2$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var9_9 = var1_1;
            var9_9 = (dl2_2)var1_1;
            var1_1 = (InternalWalletsInfo)var9_9.b;
            var2_2 = var9_9.a;
            var10_10 = var2_2.d();
            if (var10_10 && var1_1 != null) {
                InternalWalletUtil.a.getClass();
                var2_2 = new HashMap();
                var11_11 = var1_1.getInternalWallets();
                var12_13 = this.c;
                if (var11_11 != null) {
                    var11_11 = var11_11.iterator();
                    while ((var13_15 = var11_11.hasNext()) != 0) {
                        var9_9 = (PaymentInstrumentInfo)var11_11.next();
                        if (var9_9 == null || (var14_16 = var9_9.getCode()) == null || (var15_18 = var14_16.length()) <= 0) continue;
                        var16_20 = oo2_0.a;
                        var16_20.getClass();
                        var9_9 = oo2_0.b(var12_13, (PaymentInstrumentInfo)var9_9);
                        var2_2.put(var14_16, var9_9);
                    }
                }
                if ((var11_11 = this.b) != null) {
                    var9_9 = var1_1.getLoyaltyPointsInfo();
                    var11_11.setLoyaltyPointsInfo((String)var9_9);
                }
                if ((var13_15 = var2_2.size()) > 0 && var11_11 != null && (var11_11 = var11_11.getPaymentInstrumentDetails()) != null) {
                    var11_11 = ((Iterable)var11_11).iterator();
                    while ((var13_15 = (int)var11_11.hasNext()) != 0) {
                        var9_9 = (PaymentInstrumentType)var11_11.next();
                        var14_16 = null;
                        if (var9_9 != null) {
                            var16_20 = var9_9.getPaymentInstrumentCode();
                        } else {
                            var15_18 = 0;
                            var16_20 = null;
                        }
                        if ((var15_18 = (int)kotlin.text.b.i((String)var16_20, (String)(var17_22 = "INTERNAL_WALLET"), (boolean)var7_7)) == 0) continue;
                        var11_11 = new ArrayList<Object>();
                        if (var9_9 != null && (var16_20 = var9_9.getPaymentInstrumentsInfo()) != null) {
                            var16_20 = var16_20.iterator();
                            while (var18_24 = var16_20.hasNext()) {
                                var17_22 = (PaymentInstrumentInfo)var16_20.next();
                                if (var17_22 != null) {
                                    var19_26 = var17_22.getCode();
                                } else {
                                    var20_28 = false;
                                    var19_26 = null;
                                }
                                var20_28 = var2_2.containsKey(var19_26);
                                if (var20_28) {
                                    if (var17_22 != null) {
                                        var17_22 = var17_22.getCode();
                                    } else {
                                        var18_24 = false;
                                        var17_22 = null;
                                    }
                                    var17_22 = var2_2.get(var17_22);
                                    var11_11.add(var17_22);
                                    continue;
                                }
                                var19_26 = oo2_0.a;
                                var19_26.getClass();
                                var17_22 = oo2_0.b(var12_13, (PaymentInstrumentInfo)var17_22);
                                var11_11.add(var17_22);
                            }
                        }
                        if (var9_9 == null) break;
                        var9_9.setPaymentInstrumentsInfo(var11_11);
                        break;
                    }
                }
                var2_2 = DataCallback.Companion;
                var1_1 = var2_2.onSuccess(var1_1);
            } else {
                var12_14 = ApiErrorRepo.INSTANCE;
                var18_25 = false;
                var17_23 = null;
                var20_29 = false;
                var19_27 = null;
                var14_17 = "FETCH_WALLETS";
                var15_19 = false;
                var16_21 = null;
                var21_30 = 28;
                var1_1 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var12_14, (dl2_2)var9_9, var14_17, false, null, null, var21_30, null);
                var10_10 = this.d;
                if (var10_10 && (var6_6 = (var2_2 = this.e).size()) == var7_7) {
                    var11_12 = DataCallback.Companion;
                    var2_2 = var2_2.get(0);
                    var12_14 = "get(...)";
                    Intrinsics.checkNotNullExpressionValue(var2_2, (String)var12_14);
                    var1_1 = var11_12.onFailed((DataError)var1_1, var2_2);
                } else {
                    var2_2 = DataCallback.Companion;
                    var1_1 = var2_2.onFailed((DataError)var1_1);
                }
            }
            var4_4.b = var7_7;
            var2_2 = this.a;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

