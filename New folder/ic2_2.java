/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ic2
 */
public final class ic2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ CartEntry a;

    public ic2_2(CartEntry cartEntry, f80_0 f80_02) {
        this.a = cartEntry;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartEntry cartEntry = this.a;
        object = new ic2_2(cartEntry, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ic2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ic2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        float f5;
        float f6;
        float f7;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((CartEntry)object).getConvenienceFee();
        Intrinsics.checkNotNullExpressionValue(object2, "getConvenienceFee(...)");
        Intrinsics.checkNotNullParameter(object, "cartEntry");
        Intrinsics.checkNotNullParameter(object2, "conv");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        Object object3 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        Object object4 = ((ConvenienceFeePriceSplitUp)object2).getTotal();
        float f8 = 0.0f;
        Object object5 = null;
        if (object4 != null) {
            f7 = ((ConvenienceFeePriceSplitUp$AmountData)object4).getNetAmount();
        } else {
            f7 = 0.0f;
            object4 = null;
        }
        Object object6 = ((ConvenienceFeePriceSplitUp)object2).getDelivery();
        if (object6 != null) {
            f6 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
        } else {
            f6 = 0.0f;
            object6 = null;
        }
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = ((ConvenienceFeePriceSplitUp)object2).getCOD();
        if (convenienceFeePriceSplitUp$AmountData != null) {
            f5 = convenienceFeePriceSplitUp$AmountData.getNetAmount();
        } else {
            f5 = 0.0f;
            convenienceFeePriceSplitUp$AmountData = null;
        }
        object2 = ((ConvenienceFeePriceSplitUp)object2).getRVP();
        if (object2 != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object2).getNetAmount();
        }
        object2 = mz3_0.f(mz3_0.s(f7, f6, f5, f8));
        object4 = ((NewCustomEventsRevamp)object3).getPRODUCT_ID();
        object5 = ((CartEntry)object).getProduct();
        f6 = 0.0f;
        object6 = null;
        if (object5 != null) {
            object5 = ((Product)object5).getCode();
        } else {
            object5 = null;
            f8 = 0.0f;
        }
        object2.putString((String)object4, (String)object5);
        object3 = ((NewCustomEventsRevamp)object3).getPRODUCT_NAME();
        object = ((CartEntry)object).getProduct();
        if (object != null) {
            object6 = ((Product)object).getName();
        }
        object2.putString((String)object3, (String)object6);
        analyticsManager$Companion.getInstance().getGtmEvents().pushOpenScreenEvent("product breakup", (Bundle)object2);
        return Unit.a;
    }
}

