/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.TextView
 */
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from bu3
 */
public final class bu3_0
implements Function1 {
    public final /* synthetic */ cu3 a;

    public /* synthetic */ bu3_0(cu3 cu32) {
        this.a = cu32;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        boolean bl2;
        int n3;
        int n4 = 1;
        object = (rz2_0)object;
        cu3 cu32 = this.a;
        Intrinsics.checkNotNullParameter(cu32, "this$0");
        Intrinsics.checkNotNull(object);
        cu32.getClass();
        Object object2 = ((rz2_0)object).a;
        Object object3 = hj_1.INTENT_UPI;
        if (object2 != object3 && object2 != (object3 = hj_1.SAVED_UPI)) {
            object3 = hj_1.UPI;
            if (object2 != object3) return Unit.a;
        }
        if ((n3 = ((DataCallback)(object = ((rz2_0)object).b)).getStatus()) != 0) {
            int n7 = ((DataCallback)object).getStatus();
            if (n7 != n4) return Unit.a;
            object = cu32.i;
            if (object == null) return Unit.a;
            object.hideProgressView();
            return Unit.a;
        }
        object = (PriceValidation)((DataCallback)object).getData();
        n3 = 0;
        float f5 = 0.0f;
        object2 = null;
        if (object != null) {
            object3 = ((PriceValidation)object).getError();
        } else {
            bl2 = false;
            object3 = null;
        }
        if (object3 != null) {
            object3 = ((PriceValidation)object).getError();
            if (object3 != null) {
                object3 = ((Error)object3).getCode();
            } else {
                bl2 = false;
                object3 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2) {
                object3 = cu32.f;
                if (object3 != null) {
                    Error error = ((PriceValidation)object).getError();
                    Object object4 = cu32.h;
                    if (object4 != null) {
                        object4 = object4.n8();
                    } else {
                        boolean bl3 = false;
                        object4 = null;
                    }
                    co2_0 co2_02 = cu32.h;
                    if (co2_02 != null) {
                        f5 = co2_02.D();
                        object2 = Float.valueOf(f5);
                    }
                    Intrinsics.checkNotNull(object2);
                    f5 = ((Float)object2).floatValue();
                    ((op2_2)object3).b(error, (TenantResponse)object4, f5);
                }
                object2 = new Intent();
                object3 = new Bundle();
                object = JsonUtils.toJson(((PriceValidation)object).getError());
                String string2 = "transactionresponse";
                object3.putString(string2, (String)object);
                object3.putBoolean("backendCartError", n4 != 0);
                object2.putExtras((Bundle)object3);
                object = cu32.i;
                if (object == null) return Unit.a;
                object.M5((Intent)object2);
                return Unit.a;
            }
        }
        if (object != null && (object3 = ((PriceValidation)object).getPriceSplitup()) != null) {
            Object object5;
            int n8;
            hj_1 hj_12 = cu32.l;
            if (hj_12 == null) {
                n8 = -1;
            } else {
                object5 = cu3$a.$EnumSwitchMapping$0;
                n8 = hj_12.ordinal();
                n8 = object5[n8];
            }
            int n10 = 2;
            if (n8 == n10) {
                object2 = ((PriceSplitUp)object3).getOfferDetails();
                if (object2 != null && (object3 = cu32.m) != null) {
                    ((UpiAppInfo)object3).setOfferDetails((OfferDetails)object2);
                }
                if ((object2 = cu32.m) != null) {
                    ((UpiAppInfo)object2).setPriceValidation((PriceValidation)object);
                }
                if ((object2 = cu32.e) != null) {
                    object2.notifyDataSetChanged();
                }
            } else {
                hj_1 hj_13;
                object3 = ((PriceSplitUp)object3).getOfferDetails();
                hj_1 hj_14 = cu32.l;
                object5 = (Object)hj_1.SAVED_UPI;
                if (hj_14 == object5) {
                    UPI uPI;
                    UPI uPI2 = cu32.j;
                    if (uPI2 != null) {
                        uPI2.setOfferDetails((OfferDetails)object3);
                    }
                    if ((uPI = cu32.j) != null) {
                        uPI.setPriceValidation((PriceValidation)object);
                    }
                } else {
                    UPI uPI = cu32.n;
                    uPI.setOfferDetails((OfferDetails)object3);
                    uPI.setPriceValidation((PriceValidation)object);
                }
                if (object3 != null) {
                    void var9_23;
                    PriceSplitUp priceSplitUp;
                    String string3 = ((PriceValidation)object).getInstantDiscountMsg();
                    n8 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                    if (n8 == 0) {
                        String string4 = ((PriceValidation)object).getInstantDiscountMsg();
                        ((OfferDetails)object3).setInstantDiscountMsg(string4);
                    }
                    if ((priceSplitUp = ((PriceValidation)object).getPriceSplitup()) != null) {
                        Float f6 = priceSplitUp.getNetPayableAmount();
                    } else {
                        n8 = 0;
                        Object var9_22 = null;
                    }
                    ((OfferDetails)object3).setNetPayableAmount((Float)var9_23);
                }
                if ((hj_13 = cu32.l) == object5) {
                    String string5 = "upi-savedupi";
                } else {
                    String string6 = "upi-newupi";
                }
                object5 = (Object)cu32.k;
                if (object5 != null) {
                    void var9_28;
                    ((PesdkLoyaltyCardInfoView)((Object)object5)).setData(null, (OfferDetails)object3, n4, (String)var9_28);
                }
            }
            if ((object2 = cu32.i) != null) {
                object3 = Boolean.TRUE;
                object2.Ka((PriceValidation)object, (Boolean)object3);
            }
            if ((object = cu32.h) != null) {
                float f7 = object.D();
                object2 = cu32.o;
                if (object2 != null) {
                    object3 = StringCompanionObject.INSTANCE;
                    object = kq2_1.a(f7);
                    object3 = new Object[n4];
                    n8 = 0;
                    object3[0] = object;
                    object = "PAY \u20b9%s SECURELY";
                    String string7 = "format(...)";
                    zn0_1.b((Object[])object3, n4, (String)object, string7, (TextView)object2);
                }
            }
        }
        if ((object = cu32.i) == null) return Unit.a;
        object.hideProgressView();
        return Unit.a;
    }
}

