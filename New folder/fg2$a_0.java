/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.returnexchange.InvoiceCheckData;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from fg2$a
 */
public final class fg2$a_0
implements fs0_2 {
    public final /* synthetic */ bg2_1 a;

    public fg2$a_0(bg2_1 bg2_12) {
        this.a = bg2_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block8: {
            block7: {
                var2_2 /* !! */  = null;
                var3_3 = 1;
                var1_1 = (DataCallback)var1_1;
                var4_4 = var1_1.getData();
                var5_5 = "format(...)";
                if (var4_4 == null) break block7;
                if ((var1_1 = (InvoiceCheckData)var1_1.getData()) == null) break block8;
                var4_4 = var1_1.getErrors();
                if (var4_4 == null) ** GOTO lbl-1000
                var4_4 = var1_1.getErrors();
                var6_6 = "getErrors(...)";
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var6_6);
                var7_8 = var4_4.length();
                if (var7_8 > 0) {
                    var1_1 = var1_1.getErrors();
                    Intrinsics.checkNotNullExpressionValue(var1_1, (String)var6_6);
                    var7_8 = var1_1.length() - var3_3;
                    var8_10 = 0;
                    var6_6 = null;
                    var9_11 = false;
                    while (var8_10 <= var7_8) {
                        var10_12 = var9_11 == false ? var8_10 : var7_8;
                        var10_12 = var1_1.charAt(var10_12);
                        var11_13 = 32;
                        var10_12 = Intrinsics.compare(var10_12, var11_13);
                        var10_12 = var10_12 <= 0 ? 1 : 0;
                        if (!var9_11) {
                            if (var10_12 == 0) {
                                var9_11 = true;
                                continue;
                            }
                            var8_10 += var3_3;
                            continue;
                        }
                        if (var10_12 == 0) break;
                        var7_8 += -1;
                    }
                    var1_1 = com.jio.jioads.adinterfaces.a.a(var7_8, var3_3, var8_10, (String)var1_1);
                    var4_4 = StringCompanionObject.INSTANCE;
                    var7_8 = R$string.acc_error_message;
                    var4_4 = hv3_0.K(var7_8);
                    var6_6 = new Object[var3_3];
                    var6_6[0] = var1_1;
                    var2_2 /* !! */  = xh2_0.a(var6_6, var3_3, (String)var4_4, var5_5);
                    hv3_0.o0(var3_3, (String)var1_1, (String)var2_2 /* !! */ );
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = this.a;
                    var2_2 /* !! */  = var1_1.k;
                    if (var2_2 /* !! */  != null) {
                        var2_2 /* !! */ .setRefreshOrderList((boolean)var3_3);
                    }
                    var1_1.Oa();
                    var12_14 = R$string.invoice_validated_message;
                    var1_1 = hv3_0.K(var12_14);
                    var2_2 /* !! */  = null;
                    hv3_0.o0(var3_3, (String)var1_1, null);
                }
                break block8;
            }
            var4_4 = var1_1.getError();
            if (var4_4 != null) {
                var1_1 = var1_1.getError();
                Intrinsics.checkNotNull(var1_1);
                var1_1 = ((DataError$ErrorMessage)var1_1.getErrors().get(0)).getMessage();
                var4_4 = StringCompanionObject.INSTANCE;
                var7_9 = R$string.acc_error_message;
                var4_4 = hv3_0.K(var7_9);
                var6_7 = new Object[var3_3];
                var6_7[0] = var1_1;
                var2_2 /* !! */  = Arrays.copyOf(var6_7, var3_3);
                var2_2 /* !! */  = String.format((String)var4_4, var2_2 /* !! */ );
                Intrinsics.checkNotNullExpressionValue(var2_2 /* !! */ , var5_5);
                Intrinsics.checkNotNull(var1_1);
                hv3_0.o0(var3_3, (String)var1_1, (String)var2_2 /* !! */ );
            }
        }
        return Unit.a;
    }
}

