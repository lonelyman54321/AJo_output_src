/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class hG1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hG1(RecyclerView$B recyclerView$B, Object object, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
        this.c = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (as2_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                InternalWalletDataHolder internalWalletDataHolder = (InternalWalletDataHolder)this.c;
                Intrinsics.checkNotNullParameter(internalWalletDataHolder, "$internalWalletDataHolder");
                dv_0 dv_02 = ((as2_2)object).b;
                if (dv_02 != null) {
                    String string2 = internalWalletDataHolder.getZeroViewTitle();
                    String string3 = internalWalletDataHolder.getZeroViewInfo();
                    int n4 = -8388609;
                    int n7 = -8388609;
                    int n8 = Short.MAX_VALUE;
                    double d2 = 0.0;
                    object = new PaymentInstrumentInfo(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, string3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, string2, null, null, null, null, null, null, null, null, null, null, d2, null, false, null, null, null, null, null, null, null, null, null, null, n4, n7, n8, null);
                    dv_02.s((PaymentInstrumentInfo)object);
                }
                return;
            }
            case 0: 
        }
        kG1 kG12 = (kG1)this.b;
        Intrinsics.checkNotNullParameter(kG12, "this$0");
        Product product = (Product)this.c;
        kG12.x(product);
    }
}

