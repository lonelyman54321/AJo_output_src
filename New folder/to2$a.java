/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentChannelInformation;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class to2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ oo2_1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TenantResponse d;

    public to2$a(fs0_2 fs0_22, oo2_1 oo2_12, TenantResponse tenantResponse) {
        this.a = fs0_22;
        this.b = oo2_12;
        this.c = "PAYMENT_GetPaymentInstruments";
        this.d = tenantResponse;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = this;
        var4_4 = var2_2;
        var5_5 = var2_2 instanceof to2$a$a;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var2_2;
        var6_6 = (to2$a$a)var2_2;
        var7_7 = var6_6.b;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9) {
            var6_6.b = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new to2$a$a(var3_3, (f80_0)var4_4);
        }
        var4_4 = var6_6.a;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.b;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            vl2_2.b(var4_4);
        } else {
            var4_4 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var4_4;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var11_11 = var1_1;
            var11_11 = (dl2_2)var1_1;
            var4_4 = (PaymentInstruments)var11_11.b;
            var12_12 = var11_11.a;
            var13_13 = var12_12.d();
            if (var13_13 && var4_4 != null) {
                var14_14 = var4_4.getError();
                var15_16 = false;
                var11_11 = null;
                if (var14_14 != null) {
                    var14_14 = var14_14.getCode();
                } else {
                    var13_13 = false;
                    var14_14 = null;
                }
                if (var14_14 != null) {
                    var14_14 = var4_4.getError();
                    if (var14_14 != null) {
                        var14_14 = var14_14.getDescription();
                    } else {
                        var13_13 = false;
                        var14_14 = null;
                    }
                    if (var14_14 != null) {
                        var14_14 = var4_4.getError();
                        if (var14_14 == null || (var14_14 = var14_14.getDescription()) == null) {
                            var14_14 = "";
                        }
                        var3_3.b.getClass();
                        var16_17 = var3_3.c;
                        var8_8 = var12_12.d;
                        oo2_1.h(var8_8, (String)var16_17, var14_14);
                    }
                }
                if ((var12_12 = var4_4.getPaymentChannelInformation()) == null) {
                    var17_19 = false;
                    var18_21 = null;
                    var19_22 = null;
                    var20_24 = null;
                    var21_26 = 63;
                    var16_17 = var12_12;
                    var12_12 = new PaymentChannelInformation(null, null, null, null, null, null, var21_26, null);
                    var12_12.setAppType("ANDROID");
                    var14_14 = "APP";
                    var12_12.setPaymentChannel((String)var14_14);
                }
                var12_12.setAppVersion("9.20.0");
                var4_4.setPaymentChannelInformation((PaymentChannelInformation)var12_12);
                InternalWalletUtil.a.getClass();
                var12_12 = new ArrayList();
                var14_14 = var4_4.getPaymentInstrumentDetails();
                if (var14_14 != null) {
                    var14_14 = ((Iterable)var14_14).iterator();
                    while (var22_27 = var14_14.hasNext()) {
                        var16_17 = (PaymentInstrumentType)var14_14.next();
                        if (var16_17 != null) {
                            var18_21 = var16_17.getPaymentInstrumentCode();
                        } else {
                            var17_19 = false;
                            var18_21 = null;
                        }
                        if (!(var17_19 = kotlin.text.b.i((String)var18_21, var19_22 = "INTERNAL_WALLET", (boolean)var9_9))) continue;
                        if (var16_17 != null && (var14_14 = var16_17.getPaymentInstrumentsInfo()) != null) {
                            var14_14 = var14_14.iterator();
                            while (var15_16 = var14_14.hasNext()) {
                                var11_11 = (PaymentInstrumentInfo)var14_14.next();
                                if (var11_11 == null || !(var17_19 = Intrinsics.areEqual(var18_21 = var11_11.getCode(), var19_22 = "AJIO_CASH_WALLET")) && !(var17_19 = CollectionsKt.F((Iterable)(var18_21 = InternalWalletUtil.a()), var19_22 = var11_11.getCode()))) continue;
                                oo2_0.a.getClass();
                                var18_21 = var3_3.d;
                                var11_11 = oo2_0.b((TenantResponse)var18_21, (PaymentInstrumentInfo)var11_11);
                                var12_12.add(var11_11);
                            }
                        }
                        if (var16_17 == null) break;
                        var16_17.setPaymentInstrumentsInfo((ArrayList)var12_12);
                        break;
                    }
                }
                var12_12 = DataCallback.Companion;
                var4_4 = var12_12.onSuccess(var4_4);
            } else {
                var14_15 = ApiErrorRepo.INSTANCE;
                var16_18 = var3_3.c;
                var17_20 = true;
                var19_23 = "single page checkout";
                var20_25 = "Forward";
                var4_4 = var14_15.handleApiError((dl2_2)var11_11, var16_18, var17_20, var19_23, var20_25);
            }
            var6_6.b = var9_9;
            var12_12 = var3_3.a;
            var4_4 = var12_12.emit(var4_4, var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }
}

