/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from kv
 */
public final class kv_1
implements View.OnClickListener {
    public final /* synthetic */ BankOfferItem a;
    public final /* synthetic */ lv$a b;

    public /* synthetic */ kv_1(BankOfferItem bankOfferItem, lv$a a2) {
        this.a = bankOfferItem;
        this.b = a2;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$item");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((BankOfferItem)object).getTncUrl();
        Intrinsics.checkNotNull(object3);
        int n3 = ((String)object3).length();
        if (n3 > 0) {
            object2 = ((lv$a)object2).a;
            object = ((BankOfferItem)object).getTncUrl();
            Intrinsics.checkNotNull(object);
            object3 = new Regex("\\|");
            object = (String)((Regex)object3).e((CharSequence)object).get(0);
            object2.V3((String)object);
        }
    }
}

