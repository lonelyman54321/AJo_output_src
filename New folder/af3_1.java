/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aF3
 */
public final class af3_1 {
    public final Context a;
    public final dv_0 b;
    public final PENonScrollableListView c;
    public final co2_0 d;
    public final xe3_1 e;
    public PaymentInstrumentType f;
    public te3_2 g;
    public final eo2_0 h;
    public int i;
    public PaymentInstrumentInfo j;

    public af3_1(Context object, dv_0 dv_02, PENonScrollableListView pENonScrollableListView, co2_0 co2_02, xe3_1 xe3_12) {
        Intrinsics.checkNotNullParameter((Object)pENonScrollableListView, "list");
        Intrinsics.checkNotNullParameter(co2_02, "paymentInfoProvider");
        Intrinsics.checkNotNullParameter(xe3_12, "walletListener");
        this.a = object;
        this.b = dv_02;
        this.c = pENonScrollableListView;
        this.d = co2_02;
        this.e = xe3_12;
        this.h = object;
        this.i = -1;
    }

    public final void a() {
        int n3;
        Object object = this.f;
        if (object != null && (object = ((PaymentInstrumentType)object).getPaymentInstrumentsInfo()) != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)object.next();
                if (paymentInstrumentInfo == null) continue;
                paymentInstrumentInfo.setPriceValidation(null);
                paymentInstrumentInfo.setOfferDetails(null);
            }
        }
        this.j = null;
        this.i = n3 = -1;
        object = this.g;
        if (object != null) {
            object.notifyDataSetChanged();
        }
    }
}

