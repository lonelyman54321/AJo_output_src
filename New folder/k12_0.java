/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.view.View
 */
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.chuckerteam.chucker.R$drawable;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Product.EddResult;
import com.ril.ajio.services.data.Product.ProductDetail;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k12
 */
public final class k12_0
implements F62 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k12_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onChanged(Object var1_1) {
        block52: {
            block54: {
                block53: {
                    var2_2 = this.b;
                    var3_3 = this.a;
                    switch (var3_3) {
                        default: {
                            var4_4 = var1_1;
                            var4_4 = (Boolean)var1_1;
                            var5_6 = TransactionActivity.k0;
                            var6_8 = "encode";
                            Intrinsics.checkNotNullExpressionValue(var4_4, var6_8);
                            var3_3 = var4_4.booleanValue();
                            var3_3 = var3_3 != false ? R$drawable.chucker_ic_encoded_url_white : R$drawable.chucker_ic_decoded_url_white;
                            ((MenuItem)var2_2).setIcon((int)var3_3);
                            return;
                        }
                        case 0: 
                    }
                    var4_5 = var1_1;
                    var4_5 = (DataCallback)var1_1;
                    var2_2 = (o12_0)var2_2;
                    Intrinsics.checkNotNullParameter(var2_2, "this$0");
                    var6_9 = cp_1.Companion;
                    var5_7 = nn_2.b((cp$a)var6_9, (DataCallback)var4_5);
                    if (!var5_7 || (var5_7 = var2_2.isDetached())) break block52;
                    var5_7 = false;
                    var6_9 = null;
                    if (var4_5 != null) {
                        var7_10 = var4_5.getError();
                    } else {
                        var8_11 = false;
                        var7_10 = null;
                    }
                    var9_12 = "";
                    if (var7_10 == null) ** GOTO lbl-1000
                    var7_10 = var4_5.getError();
                    Intrinsics.checkNotNull(var7_10);
                    var7_10 = var7_10.getErrorMessage();
                    if (var7_10 != null) {
                        var7_10 = var4_5.getError();
                        Intrinsics.checkNotNull(var7_10);
                        var7_10 = var7_10.getErrorMessage().getMessage();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_10 = var9_12;
                    }
                    var8_11 = TextUtils.isEmpty((CharSequence)var7_10);
                    var10_13 = var2_2.k;
                    var11_14 = "We are unable to estimate delivery date, please try later";
                    var12_15 = "please try later";
                    var13_16 = "pdp screen";
                    var14_17 = "EDD on PDP";
                    var15_18 = null;
                    if (var8_11) break block53;
                    var4_5 = var2_2.c;
                    Intrinsics.checkNotNull(var4_5);
                    var4_5.setVisibility(0);
                    AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent((String)var14_17, var12_15, var13_16);
                    var12_15 = var10_13.getEC_PRODUCT_DETAILS_INTERACTIONS();
                    var16_19 = var2_2.n;
                    var17_23 = var2_2.l;
                    var4_5 = var2_2.m;
                    var13_16 = "estimate delivery date";
                    var14_17 = "error";
                    var15_18 = "edd_error";
                    var18_27 = "pdp screen";
                    var19_31 = "pdp screen";
                    var20_35 = 1536;
                    var7_10 = var11_14;
                    var11_14 = var4_5;
                    NewCustomEventsRevamp.newPushCustomEvent$default(var10_13, (String)var12_15, var13_16, (String)var14_17, var15_18, var18_27, var19_31, var17_23, var16_19, (String)var4_5, false, null, var20_35, null);
                    var2_2 = var2_2.c;
                    Intrinsics.checkNotNull(var2_2);
                    var2_2.setText((CharSequence)var7_10);
                    break block52;
                }
                var7_10 = var11_14;
                var21_39 = true;
                if (var4_5 == null || (var22_40 = var4_5.getStatus()) != 0) break block54;
                var2_2.h = var4_5 = (EddResult)var4_5.getData();
                if (var4_5 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var4_5);
                var4_5 = var4_5.getStatus();
                if (var4_5 == null) ** GOTO lbl-1000
                var4_5 = var2_2.h;
                Intrinsics.checkNotNull(var4_5);
                var4_5 = var4_5.getStatus();
                var3_3 = var4_5.getStatusCode();
                if (!var3_3) {
                    var4_5 = var2_2.getParentFragment();
                    var3_3 = var4_5 instanceof zi2_1;
                    if (var3_3) {
                        var3_3 = h40_0.Q1();
                        if (var3_3) {
                            var4_5 = new CartDeliveryAddress();
                            var7_10 = AddressType.Pincode;
                            var4_5.setAddressType((AddressType)var7_10);
                            var7_10 = var2_2.s;
                            var4_5.setPostalCode((String)var7_10);
                            var7_10 = var2_2.a;
                            var12_15 = (jo_2)var7_10.getValue();
                            var13_16 = var2_2.s;
                            var12_15.G(var13_16);
                            var7_10 = (jo_2)var7_10.getValue();
                            var7_10.F((CartDeliveryAddress)var4_5);
                        }
                        var4_5 = var2_2.getParentFragment();
                        Intrinsics.checkNotNull(var4_5, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoSetter");
                        var4_5 = (zi2_1)var4_5;
                        var7_10 = var2_2.h;
                        var4_5.Q6((EddResult)var7_10);
                    }
                    var16_20 = new Bundle();
                    var4_5 = var2_2.h;
                    if (var4_5 != null) {
                        var4_5 = var4_5.getPinCode();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var4_5 = String.valueOf(var4_5);
                    var7_10 = "pincode";
                    var16_20.putString((String)var7_10, (String)var4_5);
                    var4_5 = var2_2.h;
                    if (var4_5 != null) {
                        var3_3 = var4_5.isCodEligible();
                        var4_5 = var3_3;
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var4_5 = String.valueOf(var4_5);
                    var7_10 = "cod_eligible";
                    var16_20.putString((String)var7_10, (String)var4_5);
                    var4_5 = var2_2.h;
                    if (var4_5 != null) {
                        var3_3 = var4_5.isServicability();
                        var4_5 = var3_3;
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var4_5 = String.valueOf(var4_5);
                    var7_10 = "serviceable";
                    var16_20.putString((String)var7_10, (String)var4_5);
                    var4_5 = var2_2.h;
                    if (var4_5 != null && (var4_5 = var4_5.getProductDetails()) != null && (var4_5 = (ProductDetail)var4_5.get(0)) != null) {
                        var4_5 = var4_5.getEddUpper();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var4_5 = String.valueOf(var4_5);
                    var16_20.putString("EDD", (String)var4_5);
                    var4_5 = var2_2.i;
                    var7_10 = "pdpInfoProvider";
                    if (var4_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_10);
                        var3_3 = false;
                        var4_5 = null;
                    }
                    if ((var4_5 = var4_5.x5()) != null) {
                        var4_5 = var4_5.getCode();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var12_15 = "product_id";
                    var16_20.putString((String)var12_15, (String)var4_5);
                    var4_5 = var2_2.i;
                    if (var4_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_10);
                        var3_3 = false;
                        var4_5 = null;
                    }
                    if ((var4_5 = var4_5.x5()) != null) {
                        var4_5 = var4_5.getName();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var12_15 = "product_name";
                    var16_20.putString((String)var12_15, (String)var4_5);
                    var4_5 = var2_2.i;
                    if (var4_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_10);
                        var3_3 = false;
                        var4_5 = null;
                    }
                    if ((var4_5 = var4_5.x5()) != null) {
                        var4_5 = var4_5.getBrickCategory();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var12_15 = "product_category";
                    var16_20.putString((String)var12_15, (String)var4_5);
                    var4_5 = var2_2.i;
                    if (var4_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_10);
                        var3_3 = false;
                        var4_5 = null;
                    }
                    if ((var4_5 = var4_5.x5()) != null) {
                        var4_5 = var4_5.getBrickName();
                    } else {
                        var3_3 = false;
                        var4_5 = null;
                    }
                    var7_10 = "product_brick";
                    var16_20.putString((String)var7_10, (String)var4_5);
                    var3_3 = mz3_0.B();
                    if (var3_3 && (var3_3 = (var4_5 = UserInformation.getInstance(var2_2.getContext())).isUserOnline())) {
                        var4_5 = var2_2.h;
                        if (var4_5 != null) {
                            var3_3 = var4_5.isFinalCodEligible() ^ var21_39;
                            var4_5 = var3_3;
                        } else {
                            var3_3 = false;
                            var4_5 = null;
                        }
                        var4_5 = String.valueOf(var4_5);
                        var7_10 = "isCodBlocked";
                        var16_20.putString((String)var7_10, (String)var4_5);
                    }
                    if ((var3_3 = h40_0.Q1()) && (var4_5 = var2_2.h) != null && (var4_5 = var4_5.getProductDetails()) != null) {
                        var4_5 = var2_2.h;
                        if (var4_5 != null && (var4_5 = var4_5.getProductDetails()) != null) {
                            block51: {
                                var4_5 = var4_5.iterator();
                                while (var8_11 = var4_5.hasNext()) {
                                    var12_15 = var7_10 = var4_5.next();
                                    var12_15 = ((ProductDetail)var7_10).getDeliveryMethod();
                                    var23_41 = (int)Intrinsics.areEqual(var12_15, var13_16 = "PRIORITY");
                                    if (var23_41 == 0) continue;
                                    break block51;
                                }
                                var8_11 = false;
                                var7_10 = null;
                            }
                            var7_10 = (ProductDetail)var7_10;
                        } else {
                            var8_11 = false;
                            var7_10 = null;
                        }
                        if (var7_10 != null) {
                            var4_5 = var7_10.getDeliveryFee();
                        } else {
                            var3_3 = false;
                            var4_5 = null;
                        }
                        if (var7_10 != null) {
                            var12_15 = var7_10.getDeliverySLA();
                        } else {
                            var23_41 = 0;
                            var12_15 = null;
                        }
                        if (var12_15 != null && (var23_41 = var12_15.length()) != 0) {
                            if (var7_10 != null) {
                                var7_10 = var7_10.getDeliverySLA();
                            } else {
                                var8_11 = false;
                                var7_10 = null;
                            }
                            var7_10 = String.valueOf(var7_10);
                            var12_15 = "event_priority_delivery_edd";
                            var16_20.putString((String)var12_15, (String)var7_10);
                            var4_5 = String.valueOf(var4_5);
                            var7_10 = "event_priority_delivery_fee";
                            var16_20.putString((String)var7_10, (String)var4_5);
                        }
                    }
                    if ((var3_3 = mz3_0.B()) && (var3_3 = (var4_5 = UserInformation.getInstance(var2_2.getContext())).isUserOnline())) {
                        var4_5 = var2_2.h;
                        if (var4_5 != null) {
                            var6_9 = var4_5.getReturnLayoutMessage();
                        }
                    } else {
                        var6_9 = var9_12;
                    }
                    var14_17 = var6_9 == null ? var9_12 : var6_9;
                    var12_15 = var10_13.getEC_PRODUCT_DETAILS_INTERACTIONS();
                    var17_24 = var2_2.l;
                    var11_14 = var2_2.m;
                    var13_16 = "estimate delivery date";
                    var15_18 = "edd_submit";
                    var18_28 = "pdp screen";
                    var19_32 = "pdp screen";
                    var20_36 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(var10_13, (String)var12_15, var13_16, (String)var14_17, var15_18, var18_28, var19_32, var17_24, var16_20, (String)var11_14, false, null, var20_36, null);
                    var2_2.dismiss();
                } else lbl-1000:
                // 3 sources

                {
                    if ((var4_5 = var2_2.getActivity()) != null && (var7_10 = var2_2.j) != null) {
                        var24_42 = R$string.something_wrong_msg;
                        var9_12 = hv3_0.K(var24_42);
                        var7_10.showToastNotification((Context)var4_5, var9_12, (int)var21_39, null);
                    }
                    var4_5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var6_9 = var2_2.e;
                    Intrinsics.checkNotNull(var6_9);
                    var6_9 = var6_9.getText();
                    var9_12 = "please try later-";
                    var7_10 = new StringBuilder(var9_12);
                    var7_10.append(var6_9);
                    var6_9 = var7_10.toString();
                    var4_5.pushButtonTapEvent((String)var14_17, var6_9, var13_16);
                    var12_15 = var10_13.getEC_PRODUCT_DETAILS_INTERACTIONS();
                    var16_21 = var2_2.n;
                    var17_25 = var2_2.l;
                    var11_14 = var2_2.m;
                    var13_16 = "estimate delivery date";
                    var14_17 = "error";
                    var15_18 = "edd_error";
                    var18_29 = "pdp screen";
                    var19_33 = "pdp screen";
                    var20_37 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(var10_13, (String)var12_15, var13_16, (String)var14_17, var15_18, var18_29, var19_33, var17_25, var16_21, (String)var11_14, false, null, var20_37, null);
                }
                break block52;
            }
            if (var4_5 != null && (var3_3 = var4_5.getStatus()) == var21_39) {
                var4_5 = var2_2.c;
                Intrinsics.checkNotNull(var4_5);
                var4_5.setVisibility(0);
                var4_5 = var2_2.c;
                if (var4_5 != null) {
                    ai0_2.a((View)var4_5);
                }
                var4_5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var4_5.pushButtonTapEvent((String)var14_17, var12_15, var13_16);
                var12_15 = var10_13.getEC_PRODUCT_DETAILS_INTERACTIONS();
                var16_22 = var2_2.n;
                var17_26 = var2_2.l;
                var11_14 = var2_2.m;
                var13_16 = "estimate delivery date";
                var14_17 = "error";
                var15_18 = "edd_error";
                var18_30 = "pdp screen";
                var19_34 = "pdp screen";
                var20_38 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default(var10_13, (String)var12_15, var13_16, (String)var14_17, var15_18, var18_30, var19_34, var17_26, var16_22, (String)var11_14, false, null, var20_38, null);
                var2_2 = var2_2.c;
                Intrinsics.checkNotNull(var2_2);
                var2_2.setText((CharSequence)var7_10);
            }
        }
    }
}

