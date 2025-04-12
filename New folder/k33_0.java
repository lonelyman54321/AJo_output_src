/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from K33
 */
public final class k33_0
extends RecyclerView$B {
    public final RelativeLayout a;
    public final CardView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final RelativeLayout f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final RelativeLayout k;
    public final ImageView l;
    public final TextView m;
    public final RelativeLayout n;
    public final ImageView o;
    public final ImageView p;
    public final hh3_2 q;

    public k33_0(View object) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        super((View)object);
        int n3 = R$id.productRl;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (RelativeLayout)object2;
        this.a = object2;
        n3 = R$id.stlProductCv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (CardView)((Object)object2);
        this.b = object2;
        n3 = R$id.stlProductIv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ImageView)object2;
        this.c = object2;
        n3 = R$id.stlProductTitleTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.d = object2;
        n3 = R$id.stlProductSubTitleTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.e = object2;
        n3 = R$id.stlProductPriceRl;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (RelativeLayout)object2;
        this.f = object2;
        n3 = R$id.stlProductSellingPriceTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.g = object2;
        n3 = R$id.stlProductActualPriceTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.h = object2;
        n3 = R$id.stlProductDiscountPercentageTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.i = object2;
        n3 = R$id.stlProductOosTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.j = object2;
        n3 = R$id.stlProductOfferPriceRl;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (RelativeLayout)object2;
        this.k = object2;
        n3 = R$id.offerIv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ImageView)object2;
        this.l = object2;
        n3 = R$id.stlProductOfferPriceTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.m = object2;
        n3 = R$id.sale_container;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (RelativeLayout)object2;
        this.n = object2;
        n3 = R$id.stlAddToWishlistIv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ImageView)object2;
        this.o = object2;
        n3 = R$id.stlRemoveFromWishlistIv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        this.p = object;
        super(2);
        object = yr1_2.b((Function0)object);
        this.q = object;
    }

    public final void w(Product object) {
        boolean bl2;
        int n3 = 1;
        Object object2 = ((Product)object).getOfferPrice();
        TextView textView = this.i;
        RelativeLayout relativeLayout = this.k;
        ImageView imageView = this.l;
        TextView textView2 = this.m;
        if (object2 != null && (bl2 = ((Boolean)(object2 = (Boolean)this.q.getValue())).booleanValue())) {
            object2 = ((Product)object).getOfferPrice();
            String string2 = null;
            if (object2 != null) {
                object2 = ((Price)object2).getFormattedValue();
            } else {
                bl2 = false;
                object2 = null;
            }
            object2 = qz2_0.n((String)object2);
            Object object3 = StringCompanionObject.INSTANCE;
            AJIOApplication.Companion.getClass();
            object3 = AJIOApplication$a.a();
            int n4 = R$string.plp_offer_price;
            object3 = object3.getString(n4);
            Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            String string3 = xh2_0.a(objectArray, n3, (String)object3, "format(...)");
            object2 = cp_1.Companion;
            object2.getClass();
            bl2 = cp$a.o();
            if (bl2) {
                n3 = R$string.offer_price_message;
                string3 = hv3_0.K(n3);
                if ((object = ((Product)object).getOfferPrice()) != null) {
                    string2 = ((Price)object).getFormattedValue();
                }
                float f5 = Float.parseFloat(mz3_0.h(string2));
                object = qz2_0.x(Float.valueOf(f5));
                object2 = " ";
                string3 = n1.a(string3, (String)object2, (String)object);
            }
            textView2.setText((CharSequence)string3);
            textView2.setVisibility(0);
            imageView.setVisibility(0);
            relativeLayout.setVisibility(0);
            int n7 = hv3_0.m(R$color.accent_color_10);
            textView.setTextColor(n7);
        } else {
            int n8 = 8;
            float f6 = 1.1E-44f;
            textView2.setVisibility(n8);
            imageView.setVisibility(n8);
            relativeLayout.setVisibility(n8);
            n8 = hv3_0.m(R$color.accent_color_2);
            textView.setTextColor(n8);
        }
    }
}

