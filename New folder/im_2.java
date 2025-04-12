/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IM
 */
public final class im_2
extends RecyclerView$B {
    public final j82_0 a;
    public final RecyclerView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final String f;

    public im_2(View view, j82_0 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        int n3 = R$id.id_cart_gift_list;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.b = object = (RecyclerView)object;
        n3 = R$id.id_cart_assured_gift_text;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.c = object;
        n3 = R$id.id_cart_gift_title;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.d = object;
        n3 = R$id.id_know_more;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
        this.f = "title";
    }

    public final void w(CartAssuredGiftModel object) {
        String string2;
        Object object2;
        Object object3;
        if (object != null) {
            int n3;
            boolean n32 = ((CartAssuredGiftModel)object).getHasGift();
            object3 = this.c;
            if (!n32 && (object2 = ((CartAssuredGiftModel)object).getCtaText()) != null && (n3 = ((String)object2).length()) != 0) {
                object2 = ((CartAssuredGiftModel)object).getCtaText();
                object3.setText((CharSequence)object2);
                ai0_2.B((View)object3);
            } else {
                ai0_2.i((View)object3);
            }
        }
        cp_1.Companion.getClass();
        object2 = cp$a.b();
        object3 = this.f;
        int n4 = object2.has((String)object3);
        int n7 = 1;
        if (n4 == n7 && (string2 = object2.getString((String)object3)) != null && (n4 = string2.length()) != 0) {
            string2 = this.d;
            object2 = object2.getString((String)object3);
            string2.setText((CharSequence)object2);
        }
        object2 = new hm_1(this);
        object3 = this.e;
        object3.setOnClickListener((View.OnClickListener)object2);
        if (object != null && (object = ((CartAssuredGiftModel)object).getGifts()) != null) {
            object2 = new gm_2((List)object);
        } else {
            boolean bl2 = false;
            object2 = null;
        }
        object3 = this.itemView.getContext();
        object = new LinearLayoutManager((Context)object3, n7, false);
        object3 = this.b;
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
        ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
    }
}

