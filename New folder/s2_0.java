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

/*
 * Renamed from S2
 */
public final class s2_0
extends am2_0 {
    public final AjioCashApi b;
    public final UserInformation c;
    public final String d;

    public s2_0(String string2) {
        AjioCashApi ajioCashApi = wb_0.b;
        UserInformation userInformation = wb_0.c;
        Intrinsics.checkNotNullParameter(ajioCashApi, "ajioCashApi");
        Intrinsics.checkNotNullParameter(userInformation, "userInformation");
        Intrinsics.checkNotNullParameter(string2, "moneyType");
        this.b = ajioCashApi;
        this.c = userInformation;
        this.d = string2;
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
        block15: {
            block14: {
                var3_4 = 0;
                var4_5 = null;
                var5_6 = 1;
                var6_7 = "Bearer ";
                var7_8 = var2_3 instanceof S2$a;
                if (!var7_8) ** GOTO lbl-1000
                var8_9 = var2_3;
                var8_9 = (S2$a)var2_3;
                var9_10 = var8_9.c;
                var10_11 = -1 << -1;
                var11_12 = var9_10 & var10_11;
                if (var11_12 != 0) {
                    var8_9.c = var9_10 -= var10_11;
                } else lbl-1000:
                // 2 sources

                {
                    var8_9 = new S2$a(this, (f80_0)var2_3);
                }
                var2_3 = var8_9.a;
                var12_13 = j90_0.COROUTINE_SUSPENDED;
                var10_11 = var8_9.c;
                if (var10_11 != 0) {
                    if (var10_11 != var5_6) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    try {
                        vl2_2.b(var2_3);
                        break block14;
                    }
                    catch (Exception var1_2) {
                        break block15;
                    }
                }
                vl2_2.b(var2_3);
                var1_1 = (Integer)var1_1.a();
                if (var1_1 != null) {
                    var13_17 = var1_1.intValue();
                } else {
                    var13_17 = 0;
                    var1_1 = null;
                }
                var2_3 = UrlHelper.Companion.getInstance();
                var14_14 = this.c;
                var15_18 = var14_14.getUserId();
                var16_15 = new Integer(var13_17);
                var13_17 = Kb.a();
                var17_19 = new Integer(var13_17);
                var1_1 = this.d;
                var18_20 = 5;
                var19_21 = new Object[var18_20];
                var19_21[0] = var15_18;
                var19_21[var5_6] = var1_1;
                var3_4 = 2;
                var19_21[var3_4] = "ACTIVE";
                var19_21[3] = var16_15;
                var13_17 = 4;
                var19_21[var13_17] = var17_19;
                var4_5 = "txn_history";
                var1_1 = var2_3.getApiUrl("ajio_cash", (String)var4_5, var19_21);
                {
                    var2_3 = this.b;
                    var4_5 = ServiceUtil.getToken((UserInformation)var14_14);
                    var14_14 = new StringBuilder(var6_7);
                    var14_14.append((String)var4_5);
                    var4_5 = var14_14.toString();
                    var6_7 = "wallet_txn_history";
                    var8_9.c = var5_6;
                    var2_3 = var2_3.getACData((String)var1_1, (String)var4_5, var6_7, var8_9);
                    if (var2_3 != var12_13) break block14;
                    return var12_13;
                }
            }
            var20_16 = var2_3;
            {
                var20_16 = (dl2_2)var2_3;
                var1_1 = var20_16.b;
                var1_1 = (ACPointsData)var1_1;
                var2_3 = var20_16.a;
                var21_22 = var2_3.d();
                var17_19 = null;
                if (var21_22 != 0 && var1_1 != null) {
                    var2_3 = var1_1.getPaginationDetails();
                    var21_22 = var2_3 != null && (var2_3 = var2_3.getNextPageOffset()) != null ? var2_3.intValue() : -1;
                    if (var21_22 > (var3_4 = -1) && (var2_3 = var1_1.getPaginationDetails()) != null) {
                        var2_3 = var2_3.getNextPageOffset();
                    } else {
                        var21_22 = 0;
                        var2_3 = null;
                    }
                    var1_1 = var1_1.getActivePointHistoryResponses();
                    if (var1_1 != null) return new am2$b$b((List)var1_1, null, (Integer)var2_3);
                    var1_1 = mz0_2.a;
                    return new am2$b$b((List)var1_1, null, (Integer)var2_3);
                }
                var4_5 = ApiErrorRepo.INSTANCE;
                var6_7 = "wallet_txn_history";
                var9_10 = 0;
                var12_13 = null;
                var10_11 = 0;
                var14_14 = null;
                var11_12 = 24;
                var16_15 = null;
                var7_8 = true;
                var1_1 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var4_5, (dl2_2)var20_16, var6_7, var7_8, null, null, var11_12, null);
                if ((var1_1 = var1_1.getErrorMessage()) != null) {
                    var17_19 = var1_1.getMessage();
                }
                var2_3 = new Exception((String)var17_19);
                return new am2$b$a((Exception)var2_3);
            }
        }
        var4_5 = ApiErrorRepo.INSTANCE;
        var9_10 = 0;
        var12_13 = null;
        var10_11 = 0;
        var14_14 = null;
        var6_7 = "wallet_txn_history";
        var7_8 = true;
        var11_12 = 24;
        var16_15 = null;
        var20_16 = var1_2;
        ApiErrorRepo.logApiException$default((ApiErrorRepo)var4_5, var1_2, var6_7, var7_8, null, null, var11_12, null);
        return new am2$b$a(var1_2);
    }
}

