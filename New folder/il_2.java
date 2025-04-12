/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from IL
 */
public final class il_2 {
    public final op2_2 a;
    public final mu1_1 b;
    public final dv_0 c;
    public final co2_0 d;
    public PaymentInstrumentInfo e;
    public final eo2_0 f;
    public final ArrayList g;
    public qq2_2 h;
    public final mr2_0 i;

    public il_2(op2_2 object, mu1_1 arrayList, dv_0 dv_02, eg_1 eg_12, co2_0 co2_02) {
        Intrinsics.checkNotNullParameter(eg_12, "ccListener");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        this.a = object;
        this.b = arrayList;
        this.c = dv_02;
        this.d = co2_02;
        this.f = object = new eo2_0();
        object = new ArrayList();
        this.g = object;
        arrayList = new ArrayList();
        this.i = object = new mr2_0(arrayList, eg_12, null, co2_02);
    }

    /*
     * Unable to fully structure code
     */
    public final void a(TextView var1_1, PaymentInstrumentType var2_2) {
        var3_3 = 1;
        Intrinsics.checkNotNullParameter(var1_1, "more");
        var4_4 = this.g;
        var4_4.clear();
        var5_5 = 2;
        if (var2_2 != null && (var6_6 = var2_2.getPaymentInstrumentsInfo()) != null) {
            var6_6 = var6_6.iterator();
            var7_7 = 0;
            var8_8 = null;
            while (var9_9 = var6_6.hasNext()) {
                var10_10 = (PaymentInstrumentInfo)var6_6.next();
                if (var10_10 == null) continue;
                var4_4.add(var10_10);
                if ((var7_7 += var3_3) != var5_5) continue;
            }
        }
        var6_6 = this.h;
        var8_8 = this.i;
        if (var6_6 == null || (var11_11 = var6_6.f) != var3_3) ** GOTO lbl-1000
        if (var2_2 != null && (var6_6 = var2_2.getPaymentInstrumentsInfo()) != null) {
            var11_11 = var6_6.size();
        } else {
            var11_11 = 0;
            var6_6 = null;
        }
        if (var11_11 > var5_5) {
            var3_3 = R$string.card_view_less;
            var12_12 = hv3_0.K(var3_3);
            var1_1.setText((CharSequence)var12_12);
            if (var2_2 != null) {
                var12_12 = var2_2.getPaymentInstrumentsInfo();
            } else {
                var3_3 = 0;
                var12_12 = null;
            }
            var8_8.c((List)var12_12);
        } else lbl-1000:
        // 2 sources

        {
            var8_8.c((List)var4_4);
            if (var2_2 != null && (var4_4 = var2_2.getPaymentInstrumentsInfo()) != null) {
                var13_13 = var4_4.size();
            } else {
                var13_13 = 0;
                var4_4 = null;
            }
            if (var13_13 > var5_5) {
                if (var2_2 != null && (var4_4 = var2_2.getPaymentInstrumentsInfo()) != null) {
                    var13_13 = var4_4.size();
                } else {
                    var13_13 = 0;
                    var4_4 = null;
                }
                var11_11 = 3;
                if (var13_13 > var11_11) {
                    var4_4 = StringCompanionObject.INSTANCE;
                    if (var2_2 != null && (var4_4 = var2_2.getPaymentInstrumentsInfo()) != null) {
                        var13_13 = var4_4.size();
                    } else {
                        var13_13 = 0;
                        var4_4 = null;
                    }
                    var4_4 = var13_13 -= var5_5;
                    var6_6 = new Object[var3_3];
                    var6_6[0] = var4_4;
                    var4_4 = "View %s More Cards";
                    var8_8 = "format(...)";
                    zn0_1.b(var6_6, var3_3, (String)var4_4, (String)var8_8, var1_1);
                } else {
                    var3_3 = R$string.card_view_more_1;
                    var12_12 = hv3_0.K(var3_3);
                    var1_1.setText((CharSequence)var12_12);
                }
            }
        }
        if (var2_2 != null && (var12_12 = var2_2.getPaymentInstrumentsInfo()) != null) {
            var3_3 = var12_12.size();
        } else {
            var3_3 = 0;
            var12_12 = null;
        }
        if (var3_3 > var5_5) {
            var1_1.setVisibility(0);
            var12_12 = new gl_1(this, var1_1, var2_2);
            var1_1.setOnClickListener((View.OnClickListener)var12_12);
        } else {
            var14_14 = 8;
            var1_1.setVisibility(var14_14);
        }
    }

    public final void b(PaymentInstrumentType object) {
        if (object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo == null) continue;
                paymentInstrumentInfo.setPriceValidation(null);
                Boolean bl3 = Boolean.FALSE;
                paymentInstrumentInfo.setCLicked(bl3);
                paymentInstrumentInfo.setLoyalty(null);
                paymentInstrumentInfo.setOfferExpand(bl3);
                paymentInstrumentInfo.setOfferDetails(null);
            }
        }
        this.i.e = null;
    }
}

