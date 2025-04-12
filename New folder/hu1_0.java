/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from HU1
 */
public final class hu1_0
implements TextWatcher {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ gu1_2 d;

    public hu1_0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, gu1_2 gu1_22) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = gu1_22;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "arg0");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "query");
        Object object2 = this.a;
        if (object2 == null) {
            return;
        }
        object2 = this.b;
        object2.clear();
        this.c.clear();
        gu1_2 gu1_22 = this.d;
        Iterator iterator = gu1_22.f.iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2;
            PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)iterator.next();
            if (paymentInstrumentInfo == null || (string2 = paymentInstrumentInfo.getName()) == null) continue;
            string2 = string2.toLowerCase();
            String string3 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            if (string2 == null) continue;
            String string4 = object.toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            string3 = null;
            boolean bl4 = StringsKt.F(string2, string4, false);
            if (bl4 != (bl3 = true)) continue;
            object2.add(paymentInstrumentInfo);
        }
        object = gu1_22.c;
        if (object != null) {
            ((qw_2)object).a = object2;
        }
        if (object != null) {
            ((qw_2)object).c = n3 = -1;
            object = ((qw_2)object).b;
            object2 = ((zu1_1)object).c;
            iterator = null;
            if (object2 != null) {
                ((PaymentInstrumentInfo)object2).setOfferDetails(null);
                ((PaymentInstrumentInfo)object2).setPriceValidation(null);
            }
            ((zu1_1)object).c = null;
        }
        if ((object = gu1_22.c) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }
}

