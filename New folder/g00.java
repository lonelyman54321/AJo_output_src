/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.ajiocash.ACPointsData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class g00
extends am2_0 {
    public final AjioCashApi b;
    public final UserInformation c;
    public final ue3_1 d;
    public Integer e;
    public Integer f;
    public Boolean g;

    public g00(ue3_1 object) {
        AjioCashApi ajioCashApi = wb_0.b;
        UserInformation userInformation = wb_0.c;
        Intrinsics.checkNotNullParameter(ajioCashApi, "ajioCashApi");
        Intrinsics.checkNotNullParameter(userInformation, "userInformation");
        this.b = ajioCashApi;
        this.c = userInformation;
        this.d = object;
        this.e = object = Integer.valueOf(0);
        this.f = object;
        this.g = object = Boolean.TRUE;
    }

    public final Integer a(cm2 cm22) {
        Intrinsics.checkNotNullParameter(cm22, "state");
        return 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(am2$a var1_1, f80_0 var2_3) {
        block21: {
            block20: {
                var3_4 = 0;
                var1_1 = null;
                var4_5 = 1;
                var5_6 = 1.4E-45f;
                var6_7 = "Bearer ";
                var7_8 = var2_3 instanceof g00$a;
                if (!var7_8) ** GOTO lbl-1000
                var8_9 = var2_3;
                var8_9 = (g00$a)var2_3;
                var9_10 = var8_9.d;
                var10_11 = -1 << -1;
                var11_12 = var9_10 & var10_11;
                if (var11_12 != 0) {
                    var8_9.d = var9_10 -= var10_11;
                } else lbl-1000:
                // 2 sources

                {
                    var8_9 = new g00$a(this, (f80_0)var2_3);
                }
                var2_3 = var8_9.b;
                var12_13 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var10_11 = var8_9.d;
                if (var10_11 != 0) {
                    if (var10_11 != var4_5) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var13_14 = var8_9.a;
                    try {
                        vl2_2.b(var2_3);
                        break block20;
                    }
                    catch (Exception var1_2) {
                        break block21;
                    }
                }
                vl2_2.b(var2_3);
                var2_3 = UrlHelper.Companion.getInstance();
                var14_15 = this.c;
                var15_16 = var14_15.getUserId();
                var16_19 = this.e;
                var17_17 = this.f;
                var18_20 = this.g;
                var19_21 = h40_0.a;
                var19_21 = h40_0.r0();
                var20_22 = var19_21 != null ? var19_21.getCommonLedgerTxnLimitThreshold() : 50;
                var21_23 = new Integer(var20_22);
                var20_22 = 6;
                var19_21 = new Object[var20_22];
                var19_21[0] = var15_16;
                var19_21[var4_5] = var16_19;
                var19_21[2] = var17_17;
                var19_21[3] = var18_20;
                var22_18 = 4;
                var19_21[var22_18] = "ACTIVE";
                var11_12 = 5;
                var19_21[var11_12] = var21_23;
                var15_16 = "ajio_cash";
                var16_19 = "txn_history_v3";
                var2_3 = var2_3.getApiUrl((String)var15_16, (String)var16_19, var19_21);
                {
                    var15_16 = this.b;
                    var14_15 = ServiceUtil.getToken((UserInformation)var14_15);
                    var16_19 = new StringBuilder((String)var6_7);
                    var16_19.append((String)var14_15);
                    var6_7 = var16_19.toString();
                    var14_15 = "wallet_common_ledger";
                    var8_9.a = this;
                    var8_9.d = var4_5;
                    var2_3 = var15_16.getACData((String)var2_3, (String)var6_7, (String)var14_15, (f80_0)var8_9);
                    if (var2_3 == var12_13 /* !! */ ) {
                        return var12_13 /* !! */ ;
                    }
                    var13_14 = this;
                }
            }
            var8_9 = var2_3;
            {
                var8_9 = (dl2_2)var2_3;
                var2_3 = var8_9.b;
                var2_3 = (ACPointsData)var2_3;
                var6_7 = var8_9.a;
                var23_24 = var6_7.d();
                var20_22 = 0;
                var19_21 = null;
                if (!var23_24 || var2_3 == null) ** GOTO lbl126
                var6_7 = var2_3.getPaginationRequest();
                if (var6_7 != null) {
                    var1_1 = var6_7.getNextLoad();
                    var6_7 = Boolean.TRUE;
                    var3_4 = Intrinsics.areEqual(var1_1, var6_7);
                }
                if (var3_4 != 0 && (var1_1 = var2_3.getPaginationRequest()) != null) {
                    var3_4 = var1_1.getNextRcsPageOffset();
                    var6_7 = new Integer(var3_4);
                } else {
                    var23_24 = false;
                    var6_7 = null;
                }
                var1_1 = var2_3.getPaginationRequest();
                if (var1_1 != null) {
                    var3_4 = var1_1.getNextRcsPageOffset();
                    var8_9 = new Integer(var3_4);
                } else {
                    var7_8 = false;
                    var8_9 = null;
                }
                var13_14.e = var8_9;
                var1_1 = var2_3.getPaginationRequest();
                if (var1_1 != null) {
                    var3_4 = var1_1.getNextNtPageOffset();
                    var8_9 = new Integer(var3_4);
                } else {
                    var7_8 = false;
                    var8_9 = null;
                }
                var13_14.f = var8_9;
                var1_1 = var2_3.getPaginationRequest();
                if (var1_1 != null) {
                    var1_1 = var1_1.getNextLoad();
                } else {
                    var3_4 = 0;
                    var1_1 = null;
                }
                var13_14.g = var1_1;
                var1_1 = var13_14.d;
                if (var1_1 == null) ** GOTO lbl123
                var13_14 = var2_3.getTotalBalance();
                if (var13_14 == null) ** GOTO lbl119
                var24_25 = var13_14.doubleValue();
            }
            var5_6 = (float)var24_25;
            {
                block22: {
                    var8_9 = new Float(var5_6);
                    break block22;
lbl119:
                    // 1 sources

                    var7_8 = false;
                    var8_9 = null;
                }
                var1_1.d9((Float)var8_9);
lbl123:
                // 2 sources

                if ((var2_3 = var2_3.getWalletHistoryResponses()) != null) return new am2$b$b((List)var2_3, null, (Integer)var6_7);
                var2_3 = mz0_2.a;
                return new am2$b$b((List)var2_3, null, (Integer)var6_7);
lbl126:
                // 1 sources

                var6_7 = ApiErrorRepo.INSTANCE;
                var12_13 /* !! */  = "wallet_common_ledger";
                var11_12 = 0;
                var15_16 = null;
                var22_18 = 0;
                var16_19 = null;
                var26_26 = 24;
                var18_20 = null;
                var10_11 = 1;
                var1_1 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var6_7, (dl2_2)var8_9, (String)var12_13 /* !! */ , (boolean)var10_11, null, null, var26_26, null);
                if ((var1_1 = var1_1.getErrorMessage()) != null) {
                    var19_21 = var1_1.getMessage();
                }
                var13_14 = new Exception((String)var19_21);
                var2_3 = new am2$b$a((Exception)var13_14);
                return var2_3;
            }
        }
        var13_14 = ApiErrorRepo.INSTANCE;
        var10_11 = 0;
        var14_15 = null;
        var11_12 = 0;
        var15_16 = null;
        var8_9 = "wallet_common_ledger";
        var9_10 = 1;
        var22_18 = 24;
        var26_27 = false;
        var17_17 = null;
        var6_7 = var1_2;
        ApiErrorRepo.logApiException$default((ApiErrorRepo)var13_14, var1_2, (String)var8_9, (boolean)var9_10, null, null, var22_18, null);
        var2_3 = new am2$b$a(var1_2);
        return var2_3;
    }
}

