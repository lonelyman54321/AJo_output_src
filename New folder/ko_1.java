/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartPromotionClick;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KO
 */
public final class ko_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ko_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (PO2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                PO2$a pO2$a = (PO2$a)this.c;
                String string2 = "this$1";
                Intrinsics.checkNotNullParameter(pO2$a, string2);
                object = ((PO2)object).b;
                if (object != null) {
                    int n4 = pO2$a.getBindingAdapterPosition();
                    string2 = "";
                    object.a(n4, string2);
                }
                return;
            }
            case 0: 
        }
        Object object2 = (lo_0)this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((lo_0)object2).a;
        String string3 = ((CartPromotion)this.c).getPromotion().getDetailsURL();
        object2 = ((lo_0)object2).x;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreOfferLbl");
            boolean bl2 = false;
            object2 = null;
        }
        object2 = ((Object)object2.getText()).toString();
        CartPromotionClick cartPromotionClick = new CartPromotionClick(string3, (String)object2, "Offer Link/More offers");
        object.Z(cartPromotionClick);
    }
}

