/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel$Gift;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel$Gift$Offer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GM
 */
public final class gm_2
extends RecyclerView$f {
    public final List a;

    public gm_2(List list) {
        Intrinsics.checkNotNullParameter(list, "gifts");
        this.a = list;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof km_2;
        if (bl2) {
            int n4;
            String string2;
            String string3;
            String string4;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            int n7;
            recyclerView$B2 = (km_2)recyclerView$B;
            object = this;
            Object object6 = (CartAssuredGiftModel$Gift)this.a.get(n3);
            recyclerView$B2.getClass();
            Intrinsics.checkNotNullParameter(object6, "giftItem");
            Object object7 = ((km_2)recyclerView$B2).b;
            object7.removeAllViews();
            Object object8 = ((CartAssuredGiftModel$Gift)object6).getGiftValueText();
            ((km_2)recyclerView$B2).d.setText((CharSequence)object8);
            object8 = ((km_2)recyclerView$B2).e;
            String string5 = ((CartAssuredGiftModel$Gift)object6).getOrderValueRangeText();
            object8.setText((CharSequence)string5);
            boolean n42 = ((CartAssuredGiftModel$Gift)object6).getHasGift();
            string5 = ((km_2)recyclerView$B2).f;
            if (!n42 && (object8 = ((CartAssuredGiftModel$Gift)object6).getNudgeText()) != null && (n7 = ((String)object8).length()) != 0) {
                object8 = ((CartAssuredGiftModel$Gift)object6).getNudgeText();
                string5.setText((CharSequence)object8);
                ai0_2.B((View)string5);
            } else {
                ai0_2.i((View)string5);
            }
            object8 = ((CartAssuredGiftModel$Gift)object6).getOffers();
            int n8 = object8.size();
            string5 = null;
            Object object9 = null;
            for (int i3 = 0; i3 < n8; ++i3) {
                int n10;
                boolean bl3;
                object5 = LayoutInflater.from((Context)recyclerView$B2.itemView.getContext());
                int n14 = R$layout.cart_assured_gift_product_item;
                object5 = object5.inflate(n14, null, false);
                n14 = R$id.id_product_amount;
                object4 = object5.findViewById(n14);
                object3 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                object4 = (TextView)object4;
                int n15 = object4.getPaintFlags() | 0x10;
                object4.setPaintFlags(n15);
                n15 = R$id.id_product_image;
                object2 = object5.findViewById(n15);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                object2 = (ImageView)object2;
                int n16 = R$id.id_product_title;
                string4 = object5.findViewById(n16);
                Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
                string4 = (TextView)string4;
                int n17 = R$id.id_product_detail;
                string3 = object5.findViewById(n17);
                Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                string3 = (TextView)string3;
                object3 = new da$a();
                ((da$a)object3).k = bl3 = true;
                ((da$a)object3).a = n10 = R$drawable.ic_asuured_default;
                ((da$a)object3).b = n10;
                ((da$a)object3).c = n10;
                ((da$a)object3).r = bl3;
                ((da$a)object3).i = bl3;
                string2 = ((CartAssuredGiftModel$Gift$Offer)((CartAssuredGiftModel$Gift)object6).getOffers().get(i3)).getBannerImageURL();
                ((da$a)object3).n = string2;
                ((da$a)object3).u = object2;
                ((da$a)object3).a();
                object3 = ((CartAssuredGiftModel$Gift$Offer)((CartAssuredGiftModel$Gift)object6).getOffers().get(i3)).getLabel();
                string4.setText((CharSequence)object3);
                object3 = ((CartAssuredGiftModel$Gift$Offer)((CartAssuredGiftModel$Gift)object6).getOffers().get(i3)).getFulfillmentText();
                string3.setText((CharSequence)object3);
                object3 = ((CartAssuredGiftModel$Gift$Offer)((CartAssuredGiftModel$Gift)object6).getOffers().get(i3)).getValue();
                object4.setText((CharSequence)object3);
                object7.addView((View)object5);
            }
            boolean bl4 = ((CartAssuredGiftModel$Gift)object6).getHasGift();
            string5 = ((km_2)recyclerView$B2).g;
            if (bl4 && (object8 = ((CartAssuredGiftModel$Gift)object6).getBannerText()) != null && (n4 = ((String)object8).length()) != 0) {
                Bundle bundle = new Bundle();
                object9 = ((CartAssuredGiftModel$Gift)object6).getGiftValueText();
                bundle.putString("header", (String)object9);
                object9 = ((CartAssuredGiftModel$Gift)object6).getOrderValueRangeText();
                bundle.putString("subheader", (String)object9);
                object9 = ((km_2)recyclerView$B2).i;
                object5 = "bag interactions";
                object4 = "assured gift highlighted section";
                object3 = "";
                object2 = "assured_gifts_highlighted_section";
                string4 = "bag screen";
                string3 = "bag screen";
                string2 = "";
                String string6 = "";
                int n18 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object9, (String)object5, (String)object4, (String)object3, (String)object2, string4, string3, string2, bundle, string6, false, null, n18, null);
                object8 = ((CartAssuredGiftModel$Gift)object6).getBannerText();
                string5.setText((CharSequence)object8);
                ai0_2.B((View)string5);
                int n19 = R$drawable.cart_assured_gradient_bg;
                object7.setBackgroundResource(n19);
                ai0_2.B((View)object7);
                object7 = ((km_2)recyclerView$B2).h;
                int n20 = 0x43340000;
                float f5 = 180.0f;
                object7.setRotation(f5);
            } else {
                ai0_2.i((View)string5);
                ai0_2.i((View)object7);
            }
            object7 = ((km_2)recyclerView$B2).a;
            object7.setTag(object6);
            object6 = new jm_1((km_2)recyclerView$B2);
            object7.setOnClickListener((View.OnClickListener)object6);
        } else {
            object = this;
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.cart_assured_gift_items_holder;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        km_2 km_22 = new km_2((View)viewGroup);
        return km_22;
    }
}

