/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KN
 */
public final class kn_1
implements View.OnClickListener {
    public final /* synthetic */ ln_1 a;
    public final /* synthetic */ InternalWalletDataHolder b;

    public /* synthetic */ kn_1(ln_1 ln_12, InternalWalletDataHolder internalWalletDataHolder) {
        this.a = ln_12;
        this.b = internalWalletDataHolder;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        InternalWalletDataHolder internalWalletDataHolder = this.b;
        Intrinsics.checkNotNullParameter(internalWalletDataHolder, "$internalWalletDataHolder");
        en_1 en_12 = ((ln_1)object).b;
        if (en_12 != null) {
            String string2 = internalWalletDataHolder.getZeroViewTitle();
            String string3 = internalWalletDataHolder.getZeroViewInfo();
            int n3 = -8388609;
            int n4 = -8388609;
            int n7 = Short.MAX_VALUE;
            double d2 = 0.0;
            object = new PaymentInstrumentInfo(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, string3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, string2, null, null, null, null, null, null, null, null, null, null, d2, null, false, null, null, null, null, null, null, null, null, null, null, n3, n4, n7, null);
            en_12.s((PaymentInstrumentInfo)object);
        }
    }
}

