/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.LocationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CO
 */
public final class co_2
implements Function1 {
    public final /* synthetic */ fo_1 a;

    public /* synthetic */ co_2(fo_1 fo_12) {
        this.a = fo_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1) {
        block19: {
            block20: {
                block21: {
                    block22: {
                        var1_1 = (DataCallback)var1_1;
                        var2_2 = this.a;
                        Intrinsics.checkNotNullParameter(var2_2, "this$0");
                        var3_3 /* !! */  = cp_1.Companion;
                        var4_4 = nn_2.b((cp$a)var3_3 /* !! */ , (DataCallback)var1_1);
                        if (var4_4 == 0) break block19;
                        var4_4 = var1_1.getStatus();
                        var5_5 = null;
                        if (var4_4 != 0) break block20;
                        var3_3 /* !! */  = (LocationResponse)var1_1.getData();
                        if (var3_3 /* !! */  != null) {
                            var3_3 /* !! */  = var3_3 /* !! */ .getData();
                        } else {
                            var4_4 = 0;
                            var3_3 /* !! */  = null;
                        }
                        if (var3_3 /* !! */  == null) break block20;
                        var3_3 /* !! */  = var2_2.m;
                        var1_1 = (LocationResponse)var1_1.getData();
                        var6_6 = "";
                        if (var1_1 == null || (var1_1 = var1_1.getData()) == null || (var1_1 = var1_1.getPincodeGroup()) == null) {
                            var1_1 = var6_6;
                        }
                        var3_3 /* !! */ .z((String)var1_1);
                        var7_7 = var2_2.h;
                        if (!var7_7) break block21;
                        var7_7 = ap_0.b();
                        if (!var7_7) break block22;
                        var1_1 = var2_2.j;
                        if (var1_1 == null) {
                            var1_1 = "cartViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)var1_1);
                        } else {
                            var5_5 = var1_1;
                        }
                        var1_1 = var2_2.l;
                        var5_5.h((String)var1_1, (String)var6_6);
                        break block19;
                    }
                    var1_1 = new CartDeliveryAddress();
                    var3_3 /* !! */  = AddressType.Pincode;
                    var1_1.setAddressType((AddressType)var3_3 /* !! */ );
                    var6_6 = var2_2.l;
                    var1_1.setPostalCode((String)var6_6);
                    var6_6 = var2_2.m;
                    var8_9 = var6_6.l();
                    var9_10 = var8_9 != null ? var8_9.getAddressType() : null;
                    if (var9_10 == var3_3 /* !! */ ) ** GOTO lbl-1000
                    if (var8_9 != null) {
                        var3_3 /* !! */  = var8_9.getAddressType();
                    } else {
                        var4_4 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var9_10 = AddressType.Address;
                    if (var3_3 /* !! */  != var9_10) {
                        var6_6.D(false);
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (var8_9 != null) {
                            var5_5 = var8_9.getPostalCode();
                        }
                        if (!(var7_7 = Intrinsics.areEqual(var5_5, var1_1 = var1_1.getPostalCode()))) {
                            var7_7 = true;
                            var6_6.D(var7_7);
                        } else {
                            var6_6.D(false);
                        }
                    }
                    var2_2.Oa();
                    break block19;
                }
                var1_1 = var2_2.f;
                if (var1_1 != null) {
                    var2_2 = var2_2.l;
                    var1_1.loadCartBasedOnSelectedAddress((String)var2_2, (String)var6_6);
                }
                break block19;
            }
            if ((var1_1 = (LocationResponse)var1_1.getData()) != null) {
                var1_1 = var1_1.getData();
            } else {
                var7_8 = false;
                var1_1 = null;
            }
            if (var1_1 == null) {
                var1_1 = var2_2.e;
                var3_3 /* !! */  = "mProgressview";
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3 /* !! */ );
                    var7_8 = false;
                    var1_1 = null;
                }
                ai0_2.i((View)var1_1);
                var1_1 = var2_2.e;
                if (var1_1 != null) {
                    var5_5 = var1_1;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var3_3 /* !! */ );
                }
                ai0_2.i((View)var5_5);
                var1_1 = var2_2.Qa();
                ai0_2.B((View)var1_1);
            }
        }
        return Unit.a;
    }
}

