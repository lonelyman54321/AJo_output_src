/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartPromotionClick;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from N62
 */
public final class n62_0
extends RecyclerView$f {
    public final List a;
    public final String b;
    public final j82_0 c;

    public n62_0(List list, String string2, j82_0 j82_02) {
        Intrinsics.checkNotNullParameter(j82_02, "onCartClickListener");
        this.a = list;
        this.b = string2;
        this.c = j82_02;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        boolean bl2;
        object = (W62)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = this.a;
        if (object2 == null) return;
        Object object3 = (CartPromotion)object2.get(n3);
        object2 = null;
        if (object3 == null) return;
        Object object4 = ((CartPromotion)object3).getPromotion();
        if (object4 == null) {
            return;
        }
        object.getClass();
        object4 = "promotion";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        boolean bl3 = ((CartPromotion)object3).isCouponCode();
        TextView textView = ((W62)object).c;
        Group group = ((W62)object).g;
        TextView textView2 = ((W62)object).d;
        int n4 = 8;
        TextView textView3 = ((W62)object).f;
        if (bl3) {
            textView3.setTag(null);
            textView3.setVisibility(n4);
            textView2.setVisibility(n4);
            group.setVisibility(0);
            textView.setVisibility(0);
            object4 = ((CartPromotion)object3).getPromotion().getCode();
            TextView textView4 = ((W62)object).e;
            textView4.setText((CharSequence)object4);
            bl3 = ((CartPromotion)object3).isApplied();
            if (!bl3) {
                int n7 = R$string.not_applicable;
                object = hv3_0.K(n7);
                textView.setText((CharSequence)object);
                return;
            }
            n3 = (int)(((CartPromotion)object3).isCouponCode() ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = ((W62)object).b)) ? 1 : 0)) == 0) {
                if (object != null) {
                    object = ((String)object).toLowerCase();
                    object3 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    if (object != null) {
                        object3 = "best price";
                        boolean bl4 = StringsKt.F((CharSequence)object, (CharSequence)object3, false);
                        object2 = bl4;
                    }
                }
                Intrinsics.checkNotNull(object2);
                boolean bl5 = (Boolean)object2;
                if (bl5) {
                    int n8 = R$string.Product_at_best_price;
                    object = hv3_0.K(n8);
                    textView.setText((CharSequence)object);
                    return;
                }
            }
            int n10 = R$string.applied;
            object = hv3_0.K(n10);
            textView.setText((CharSequence)object);
            return;
        }
        textView2.setVisibility(0);
        group.setVisibility(n4);
        object = ((CartPromotion)object3).getPromotion();
        object4 = "";
        object = object != null ? ((CartPromotion)object3).getPromotion().getPromotionType() : object4;
        String string2 = ((CartPromotion)object3).getPromotion().getDetailsURL();
        int n14 = TextUtils.isEmpty((CharSequence)string2);
        if (n14 == 0) {
            boolean bl6 = TextUtils.isEmpty((CharSequence)object);
            object2 = "Offer Link/More offers";
            if (!bl6) {
                n14 = R$string.add_product;
                String string3 = hv3_0.K(n14);
                object = new CartPromotionClick(string2, string3, (String)object2);
                textView3.setTag(object);
                int n15 = R$string.add_product;
                object = hv3_0.K(n15);
                textView3.setText((CharSequence)object);
            } else {
                n14 = R$string.view_product;
                String string4 = hv3_0.K(n14);
                object = new CartPromotionClick(string2, string4, (String)object2);
                textView3.setTag(object);
                int n16 = R$string.view_product;
                object = hv3_0.K(n16);
                textView3.setText((CharSequence)object);
            }
        } else {
            textView3.setTag(null);
        }
        boolean bl7 = ((CartPromotion)object3).isApplied();
        if (bl7) {
            object = hv3_0.K(R$string.applied);
            textView.setText((CharSequence)object);
            textView.setVisibility(0);
            textView3.setVisibility(n4);
            object = ((CartPromotion)object3).getDescription();
            boolean bl8 = TextUtils.isEmpty((CharSequence)object);
            if (!bl8) {
                object4 = ((CartPromotion)object3).getDescription();
                object = "getDescription(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object);
            }
        } else {
            object4 = ((CartPromotion)object3).getDescription();
            textView.setVisibility(n4);
            boolean bl9 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl9) {
                textView3.setVisibility(0);
                boolean bl10 = og1_1.b();
                if (bl10) {
                    int n17 = textView3.getPaintFlags() | n4;
                    textView3.setPaintFlags(n17);
                }
            }
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object4))) {
            textView2.setVisibility(0);
            textView2.setText((CharSequence)object4);
            return;
        }
        textView2.setVisibility(n4);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        j82_0 j82_02 = null;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.offers_row_luxe;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.offers_row_refresh;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        j82_02 = this.c;
        String string2 = this.b;
        object = new W62((View)viewGroup, j82_02, string2);
        return object;
    }
}

