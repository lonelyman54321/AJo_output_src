/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Mh2
 */
public final class mh2_1
extends RecyclerView$f {
    public final ArrayList a;
    public final boolean b;

    public mh2_1(ArrayList arrayList, boolean bl2) {
        Intrinsics.checkNotNullParameter(arrayList, "bankOfferList");
        this.a = arrayList;
        this.b = bl2;
    }

    public final int getItemCount() {
        int n3;
        boolean bl2;
        ArrayList arrayList = this.a;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4;
        object = (oh2_1)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
        object2 = (BankOfferItem)object2;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "bankOffer");
        Object object3 = ((BankOfferItem)object2).getDescription();
        int n7 = 8;
        AjioTextView ajioTextView = ((oh2_1)object).a;
        if (object3 != null && (n4 = object3.length()) != 0) {
            object3 = ((BankOfferItem)object2).getDescription();
            ajioTextView.setText((CharSequence)object3);
            ajioTextView.setVisibility(0);
        } else {
            ajioTextView.setVisibility(n7);
        }
        object3 = ((BankOfferItem)object2).getOfferDetails();
        ajioTextView = ((oh2_1)object).b;
        if (object3 != null && (n4 = object3.length()) != 0 || (object3 = ((BankOfferItem)object2).getTncUrl()) != null && (n4 = object3.length()) != 0) {
            int n8;
            Object object4;
            object3 = ((BankOfferItem)object2).getOfferDetails();
            ajioTextView.setText((CharSequence)object3);
            object3 = ((BankOfferItem)object2).getOfferDetails();
            String string2 = "";
            Object object5 = "T&C Apply";
            if (object3 != null && (n4 = object3.length()) != 0) {
                int n10;
                object3 = ((BankOfferItem)object2).getOfferDetails();
                Intrinsics.checkNotNull(object3);
                object4 = ((BankOfferItem)object2).getTncUrl();
                object4 = object4 != null && (n10 = ((String)object4).length()) != 0 ? "\nT&C Apply" : string2;
                object3 = Ft2.a(object3, (String)object4);
            } else {
                object3 = ((BankOfferItem)object2).getTncUrl();
                object3 = object3 != null && (n4 = object3.length()) != 0 ? object5 : string2;
            }
            object4 = new SpannableStringBuilder((CharSequence)object3);
            Object object6 = ((BankOfferItem)object2).getTncUrl();
            if (object6 != null && (n8 = object6.length()) != 0) {
                object6 = new nh2_1((BankOfferItem)object2, (oh2_1)object);
                int n14 = StringsKt.O(object3, (String)object5, 0, false, 6);
                n4 = n14 + 9;
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                int n15 = 10;
                aJIOApplication = mz3_0.t(aJIOApplication, n15);
                object5 = new AjioCustomTypefaceSpan(string2, (Typeface)aJIOApplication);
                n7 = 18;
                object4.setSpan(object6, n14, n4, n7);
                object4.setSpan(object5, n14, n4, n7);
            }
            object = LinkMovementMethod.getInstance();
            ajioTextView.setMovementMethod((MovementMethod)object);
            ajioTextView.setText((CharSequence)object4);
            object = ((BankOfferItem)object2).getDescription();
            object3 = "T&C Apply - View T&C of ";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            ajioTextView.setContentDescription((CharSequence)object);
            ajioTextView.setVisibility(0);
        } else {
            ajioTextView.setVisibility(n7);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(this.b ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.bank_offer_popup_row;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.bank_offer_row;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new oh2_1((View)viewGroup);
        return object;
    }
}

