/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.Toast
 */
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Payment.DeleteSaveInstrumentResponse;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from BO
 */
public final class bo_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bo_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block22: {
            block23: {
                var2_2 = 0;
                var3_3 = null;
                var4_4 = 1;
                var5_5 = 0;
                var6_6 = null;
                var7_7 /* !! */  = "this$0";
                var8_8 = this.b;
                var9_9 = this.a;
                switch (var9_9) {
                    default: {
                        var10_10 = var1_1;
                        var10_10 = (dl2_2)var1_1;
                        var8_8 = (oo2_1)var8_8;
                        Intrinsics.checkNotNullParameter(var8_8, (String)var7_7 /* !! */ );
                        var11_12 = "PAYMENT_DeletePaymentInstrument";
                        Intrinsics.checkNotNullParameter(var11_12, "$requestID");
                        Intrinsics.checkNotNullParameter(var10_10, "response");
                        var1_1 = (DeleteSaveInstrumentResponse)var10_10.b;
                        var3_3 = var10_10.a;
                        var4_4 = var3_3.d();
                        if (var4_4 != 0 && var1_1 != null) {
                            var12_13 = var1_1.getError();
                            if (var12_13 != null) {
                                var12_13 = var12_13.getCode();
                            } else {
                                var4_4 = 0;
                                var12_13 = null;
                            }
                            if (var12_13 != null) {
                                var12_13 = var1_1.getError();
                                if (var12_13 != null) {
                                    var6_6 = var12_13.getDescription();
                                }
                                if (var6_6 != null) {
                                    var12_13 = var1_1.getError();
                                    if (var12_13 == null || (var12_13 = var12_13.getDescription()) == null) {
                                        var12_13 = "";
                                    }
                                    var8_8.getClass();
                                    var2_2 = var3_3.d;
                                    oo2_1.h(var2_2, var11_12, (String)var12_13);
                                }
                            }
                            var3_3 = DataCallback.Companion;
                            var1_1 = var3_3.onSuccess(var1_1);
                        } else {
                            var13_15 = ApiErrorRepo.INSTANCE;
                            var14_17 = "single page checkout";
                            var15_18 = "Forward";
                            var16_19 = true;
                            var1_1 = var13_15.handleApiError((dl2_2)var10_10, var11_12, var16_19, var14_17, var15_18);
                        }
                        return var1_1;
                    }
                    case 0: 
                }
                var1_1 = (DataCallback)var1_1;
                var8_8 = (fo_1)var8_8;
                Intrinsics.checkNotNullParameter(var8_8, (String)var7_7 /* !! */ );
                var7_7 /* !! */  = cp_1.Companion;
                var17_20 = nn_2.b((cp$a)var7_7 /* !! */ , (DataCallback)var1_1);
                if (var17_20 == 0) break block22;
                Intrinsics.checkNotNull(var1_1);
                var17_20 = var1_1.getStatus();
                if (var17_20 != 0) break block23;
                var1_1 = new CartDeliveryAddress();
                var7_7 /* !! */  = AddressType.Pincode;
                var1_1.setAddressType((AddressType)var7_7 /* !! */ );
                var18_21 = var8_8.l;
                var1_1.setPostalCode((String)var18_21);
                var18_21 = var8_8.m;
                var13_16 = var18_21.l();
                var10_11 = var13_16 != null ? var13_16.getAddressType() : null;
                if (var10_11 == var7_7 /* !! */ ) ** GOTO lbl-1000
                if (var13_16 != null) {
                    var7_7 /* !! */  = var13_16.getAddressType();
                } else {
                    var17_20 = 0;
                    var7_7 /* !! */  = null;
                }
                var10_11 = AddressType.Address;
                if (var7_7 /* !! */  != var10_11) {
                    var18_21.D(false);
                } else lbl-1000:
                // 2 sources

                {
                    if (var13_16 != null) {
                        var6_6 = var13_16.getPostalCode();
                    }
                    if (!(var19_22 = Intrinsics.areEqual(var6_6, var1_1 = var1_1.getPostalCode()))) {
                        var18_21.D((boolean)var4_4);
                    } else {
                        var18_21.D(false);
                    }
                }
                var8_8.Oa();
                break block22;
            }
            var19_23 = var1_1.getStatus();
            if (var19_23 == var4_4) {
                var1_1 = var8_8.e;
                if (var1_1 != null) {
                    var6_6 = var1_1;
                } else {
                    var1_1 = "mProgressview";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
                }
                ai0_2.i((View)var6_6);
                var1_1 = StringCompanionObject.INSTANCE;
                var1_1 = hv3_0.K(R$string.acc_error_message);
                var5_5 = R$string.addresses_not_able_to_updated;
                var6_6 = hv3_0.K(var5_5);
                var7_7 /* !! */  = new Object[var4_4];
                var7_7 /* !! */ [0] = var6_6;
                var12_14 = Arrays.copyOf(var7_7 /* !! */ , var4_4);
                var1_1 = String.format((String)var1_1, (Object[])var12_14);
                var12_14 = "format(...)";
                Intrinsics.checkNotNullExpressionValue(var1_1, (String)var12_14);
                var19_23 = R$string.pincode_is_not_valid;
                var1_1 = hv3_0.K(var19_23);
                if (var1_1 != null && (var4_4 = var1_1.length()) != 0 && (var12_14 = var8_8.getContext()) != null) {
                    var12_14 = var8_8.requireContext();
                    var1_1 = Toast.makeText((Context)var12_14, (CharSequence)var1_1, (int)0);
                    var1_1.show();
                }
            }
        }
        return Unit.a;
    }
}

