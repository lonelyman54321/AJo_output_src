/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.Credit.CreditDetailsList;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.AjioCashApi;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class H5
extends am2_0 {
    public static final H5$a Companion;
    public final AjioCashApi b;
    public final UserInformation c;

    static {
        H5$a h5$a;
        Companion = h5$a = new Object();
    }

    public H5() {
        AjioCashApi ajioCashApi = wb_0.b;
        UserInformation userInformation = wb_0.c;
        Intrinsics.checkNotNullParameter(ajioCashApi, "ajioCashApi");
        Intrinsics.checkNotNullParameter(userInformation, "userInformation");
        this.b = ajioCashApi;
        this.c = userInformation;
    }

    public final Integer a(cm2 cm22) {
        Intrinsics.checkNotNullParameter(cm22, "state");
        return 1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(am2$a var1_1, f80_0 var2_3) {
        block11: {
            block10: {
                var3_4 = 1;
                var4_5 = "Bearer ";
                var5_6 = var2_3 instanceof H5$b;
                if (!var5_6) ** GOTO lbl-1000
                var6_7 = var2_3;
                var6_7 = (H5$b)var2_3;
                var7_8 = var6_7.d;
                var8_9 = -1 << -1;
                var9_10 = var7_8 & var8_9;
                if (var9_10 != 0) {
                    var6_7.d = var7_8 -= var8_9;
                } else lbl-1000:
                // 2 sources

                {
                    var6_7 = new H5$b(this, (f80_0)var2_3);
                }
                var2_3 = var6_7.b;
                var10_11 = j90_0.COROUTINE_SUSPENDED;
                var8_9 = var6_7.d;
                if (var8_9 != 0) {
                    if (var8_9 != var3_4) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var11_12 = var6_7.a;
                    try {
                        vl2_2.b(var2_3);
                        break block10;
                    }
                    catch (Exception var1_2) {
                        break block11;
                    }
                }
                vl2_2.b(var2_3);
                var1_1 = (Integer)var1_1.a();
                var11_12 = var1_1 != null ? var1_1.intValue() : 1;
                var2_3 = UrlHelper.Companion.getInstance();
                var12_13 = this.c;
                var13_14 = var12_13.getUserId();
                var14_18 = new Integer(var11_12);
                var15_15 = 2;
                var16_16 = new Object[var15_15];
                var17_19 = null;
                var16_16[0] = var13_14;
                var16_16[var3_4] = var14_18;
                var13_14 = "ajio_cash";
                var14_18 = "credit_detail_acash";
                var2_3 = var2_3.getApiUrl((String)var13_14, (String)var14_18, var16_16);
                {
                    var13_14 = this.b;
                    var12_13 = ServiceUtil.getToken((UserInformation)var12_13);
                    var14_18 = new StringBuilder((String)var4_5);
                    var14_18.append((String)var12_13);
                    var4_5 = var14_18.toString();
                    var12_13 = "GetACASHCreditDetails";
                    var6_7.a = var11_12;
                    var6_7.d = var3_4;
                    var2_3 = var13_14.getAjioCashT((String)var2_3, (String)var4_5, (String)var12_13, (f80_0)var6_7);
                    if (var2_3 != var10_11) break block10;
                    return var10_11;
                }
            }
            var4_5 = var2_3;
            {
                var4_5 = (dl2_2)var2_3;
                var2_3 = var4_5.b;
                var2_3 = (CreditDetailsList)var2_3;
                var18_17 = var4_5.a;
                var3_4 = (int)var18_17.d();
                var17_19 = null;
                if (var3_4 == 0 || var2_3 == null) ** GOTO lbl74
                var3_4 = var2_3.getNoofpages() * 5;
                if (var3_4 < (var11_12 += 5)) ** GOTO lbl67
            }
            {
                block12: {
                    var18_17 = new Integer(var11_12);
                    break block12;
lbl67:
                    // 1 sources

                    var3_4 = 0;
                    var18_17 = null;
                }
                var2_3 = var2_3.getCredits();
                if (var2_3 != null) return new am2$b$b((List)var2_3, null, (Integer)var18_17);
                var2_3 = mz0_2.a;
                return new am2$b$b((List)var2_3, null, (Integer)var18_17);
lbl74:
                // 1 sources

                var18_17 = ApiErrorRepo.INSTANCE;
                var6_7 = "GetACASHCreditDetails";
                var8_9 = 0;
                var12_13 = null;
                var9_10 = 0;
                var13_14 = null;
                var19_20 = 24;
                var15_15 = 0;
                var16_16 = null;
                var7_8 = 1;
                var1_1 = ApiErrorRepo.getApiError$default((ApiErrorRepo)var18_17, (dl2_2)var4_5, (String)var6_7, (boolean)var7_8, null, null, var19_20, null);
                if ((var1_1 = var1_1.getErrorMessage()) != null) {
                    var17_19 = var1_1.getMessage();
                }
                var18_17 = new Exception(var17_19);
                var2_3 = new am2$b$a((Exception)var18_17);
                return var2_3;
            }
        }
        var18_17 = ApiErrorRepo.INSTANCE;
        var8_9 = 0;
        var12_13 = null;
        var9_10 = 0;
        var13_14 = null;
        var6_7 = "GetACASHCreditDetails";
        var7_8 = 1;
        var19_21 = 24;
        var15_15 = 0;
        var16_16 = null;
        var4_5 = var1_2;
        ApiErrorRepo.logApiException$default((ApiErrorRepo)var18_17, var1_2, (String)var6_7, (boolean)var7_8, null, null, var19_21, null);
        var2_3 = new am2$b$a(var1_2);
        return var2_3;
    }
}

