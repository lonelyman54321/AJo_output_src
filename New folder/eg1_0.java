/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eG1
 */
public final class eg1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eg1_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (AV2)this.b;
                Intrinsics.checkNotNullParameter(object, "$listener");
                Object object2 = (SuggestionSearchModel)this.c;
                Intrinsics.checkNotNullParameter(object2, "$historyItem");
                object2 = ((SuggestionSearchModel)object2).getText();
                Intrinsics.checkNotNullExpressionValue(object2, "getText(...)");
                object.na((String)object2);
                return;
            }
            case 1: {
                int n4;
                object = (Yr2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object3 = (PaymentInstrumentInfo)this.c;
                Intrinsics.checkNotNullParameter(object3, "$paymentInstrumentInfo");
                Object object4 = ((Yr2)object).e;
                boolean bl2 = object4.isChecked() ^ true;
                object4.setChecked(bl2);
                object4 = ((Yr2)object).e;
                bl2 = object4.isChecked();
                Object object5 = bl2;
                ((PaymentInstrumentInfo)object3).setSelected((Boolean)object5);
                object = ((Yr2)object).b;
                if (object != null) {
                    object5 = ((PaymentInstrumentInfo)object3).getCode();
                    boolean bl3 = object4.isChecked();
                    object.p((String)object5, bl3);
                }
                object = ((PaymentInstrumentInfo)object3).getCode();
                boolean bl4 = object4.isChecked();
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    object3 = bl4 ? "select" : "deselect";
                    Bundle bundle = new Bundle();
                    InternalWalletUtil.a.getClass();
                    object4 = InternalWalletUtil.c((String)object);
                    bundle.putString((String)object4, (String)object3);
                    object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    object = InternalWalletUtil.f((String)object);
                    String string2 = n1.a((String)object, " - ", (String)object3);
                    String string3 = "single page checkout";
                    object5 = "wallet toggle";
                    String string4 = "checkout_wallet_toggle";
                    ((GTMEvents)object4).pushCheckoutInteractionsEvent((String)object5, string2, string4, string3, bundle);
                }
                return;
            }
            case 0: 
        }
        kG1 kG12 = (kG1)this.c;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        n3 = kG12.getLayoutPosition();
        Product product = (Product)this.b;
        product.setViewHolderPos(n3);
        object = product.getFnlColorVariantData();
        if (object != null) {
            object = ((ProductFnlColorVariantData)object).getColorGroup();
        } else {
            n3 = 0;
            object = null;
        }
        kG12.b.C(product, (String)object);
    }
}

