/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lv
 */
public final class lv_1
extends RecyclerView$f {
    public final ArrayList a;
    public final t82_0 b;
    public final yi2_1 c;

    public lv_1(ArrayList arrayList, NewProductDetailsFragment newProductDetailsFragment, NewProductDetailsFragment newProductDetailsFragment2) {
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(newProductDetailsFragment2, "pdpInfoProvider");
        this.a = arrayList;
        this.b = newProductDetailsFragment;
        this.c = newProductDetailsFragment2;
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

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        BankOfferItem bankOfferItem;
        recyclerView$B = (lv$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        if (object != null) {
            bankOfferItem = (BankOfferItem)((ArrayList)object).get(n3);
        } else {
            n3 = 0;
            bankOfferItem = null;
        }
        Intrinsics.checkNotNull(bankOfferItem);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(bankOfferItem, "item");
        object = recyclerView$B.itemView;
        int n7 = R$id.offer_desc;
        object = (AjioTextView)object.findViewById(n7);
        Object object2 = recyclerView$B.itemView;
        int n8 = R$id.terms_conditions;
        object2 = (AjioTextView)object2.findViewById(n8);
        String string2 = bankOfferItem.getDescription();
        object.setText((CharSequence)string2);
        object = bankOfferItem.getTncUrl();
        if (object != null && (n4 = ((String)object).length()) > 0 && (n4 = (int)((object = ((lv$a)recyclerView$B).b).u7() ? 1 : 0)) == 0) {
            n4 = 0;
            object2.setVisibility(0);
            object = new kv_1(bankOfferItem, (lv$a)recyclerView$B);
            object2.setOnClickListener((View.OnClickListener)object);
        } else {
            int n10 = 8;
            object2.setVisibility(n10);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.bank_offer_popup_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = (NewProductDetailsFragment)this.b;
        NewProductDetailsFragment newProductDetailsFragment = (NewProductDetailsFragment)this.c;
        lv$a lv$a = new lv$a((View)viewGroup, (NewProductDetailsFragment)object, newProductDetailsFragment);
        return lv$a;
    }
}

