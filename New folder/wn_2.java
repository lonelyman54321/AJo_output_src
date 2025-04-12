/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ProductSimilar;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WN
 */
public final class wn_2
extends rn_1 {
    public final dn_1 h;
    public final int i;
    public final View[] j;
    public final ImageView[] k;
    public final TextView l;
    public final View m;
    public final ShimmerFrameLayout n;
    public final View o;
    public final ShimmerFrameLayout p;
    public final View q;
    public final TextView r;
    public final TextView s;

    public wn_2(View view, j82_0 object, dn_1 object2) {
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        int n8 = 4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "onCartClickListener");
        super((j82_0)object, view, false);
        this.h = object2;
        this.i = n8;
        int n10 = R$id.similarImgContainer1;
        object = view.findViewById(n10);
        int n14 = R$id.similarImgContainer2;
        object2 = view.findViewById(n14);
        int n15 = R$id.similarImgContainer3;
        View view2 = view.findViewById(n15);
        int n16 = R$id.similarImgContainer4;
        View view3 = view.findViewById(n16);
        View[] viewArray = new View[n8];
        viewArray[0] = object;
        viewArray[n7] = object2;
        viewArray[n4] = view2;
        viewArray[n3] = view3;
        this.j = viewArray;
        object = new ImageView[n8];
        n14 = R$id.similarImg1;
        object2 = view.findViewById(n14);
        object[0] = object2;
        n14 = R$id.similarImg2;
        object2 = view.findViewById(n14);
        object[n7] = object2;
        n14 = R$id.similarImg3;
        object2 = view.findViewById(n14);
        object[n4] = object2;
        n14 = R$id.similarImg4;
        object2 = view.findViewById(n14);
        object[n3] = object2;
        this.k = object;
        n10 = R$id.shopSimilar;
        object = view.findViewById(n10);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.l = object;
        n10 = R$id.oosSimilarShimmerContainer1;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.m = object;
        n10 = R$id.oosSimilarShimmer1;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ShimmerFrameLayout)((Object)object);
        this.n = object;
        n10 = R$id.oosSimilarShimmerContainer2;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.o = object;
        n10 = R$id.oosSimilarShimmer2;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (ShimmerFrameLayout)((Object)object);
        this.p = object;
        n10 = R$id.similarSpace;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        this.q = object;
        n10 = R$id.removeBtn;
        object = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        this.r = object;
        n10 = R$id.productBrandTv;
        view = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        this.s = view;
    }

    public final void x(Object object) {
        int n3 = object instanceof CartEntry;
        if (n3 != 0) {
            int n4;
            View view;
            View[] viewArray;
            int n7;
            int n8;
            super.x(object);
            n3 = 0;
            Object object2 = null;
            int n10 = 0;
            Object object3 = null;
            while (true) {
                n8 = this.i;
                n7 = 8;
                viewArray = this.j;
                if (n10 >= n8) break;
                view = viewArray[n10];
                view.setVisibility(n7);
                ++n10;
            }
            object3 = this.q;
            object3.setVisibility(n7);
            Object object4 = this.l;
            object4.setVisibility(n7);
            List list = this.h;
            if (list != null && (n4 = list.F4()) == 0) {
                n7 = list.H1();
                Object object5 = this.o;
                Object object6 = this.p;
                Object object7 = this.m;
                Object object8 = this.n;
                int n14 = 1;
                TextView textView = this.e;
                if (n7 == n14) {
                    int n15;
                    if (textView != null) {
                        n7 = R$drawable.revamp_secondary_button_bg;
                        textView.setBackgroundResource(n7);
                    }
                    if (textView != null) {
                        n7 = hv3_0.m(R$color.accent_color_11);
                        textView.setTextColor(n7);
                    }
                    if (textView != null) {
                        textView.setClickable(n14 != 0);
                    }
                    hv3_0.t0(object8, (View)object7);
                    hv3_0.t0((ShimmerFrameLayout)((Object)object6), (View)object5);
                    list = object;
                    list = (CartEntry)object;
                    object5 = ((CartEntry)((Object)list)).getProduct();
                    if (object5 != null) {
                        object6 = ((Product)object5).getBrandName();
                        n15 = TextUtils.isEmpty((CharSequence)object6);
                        object5 = n15 == 0 ? String.valueOf(((Product)object5).getBrandName()) : "";
                        object6 = this.s;
                        object6.setText((CharSequence)object5);
                    }
                    if ((list = ((CartEntry)((Object)list)).getProductSimilarList()) != null && (n4 = list.size()) > 0) {
                        boolean bl2;
                        object4.setVisibility(0);
                        object3.setVisibility(0);
                        n10 = list.size();
                        if (n10 > n8) {
                            list = list.subList(0, n8);
                        }
                        object3 = list;
                        object3 = ((Iterable)list).iterator();
                        n8 = 0;
                        view = null;
                        while (bl2 = object3.hasNext()) {
                            object4 = object3.next();
                            n4 = n8 + 1;
                            if (n8 >= 0) {
                                if ((object4 = (ProductSimilar)object4) != null && (object6 = ((ProductSimilar)object4).getImageURL()) != null && (n15 = ((String)object6).length()) != 0) {
                                    int n16;
                                    viewArray[n8].setVisibility(0);
                                    object6 = new da$a();
                                    ((da$a)object6).k = n14;
                                    ((da$a)object6).a = n16 = R$drawable.component_placeholder;
                                    ((da$a)object6).b = n16;
                                    ((da$a)object6).c = n16;
                                    ((da$a)object6).s = n14;
                                    n16 = R$string.acc_icon_product_placeholder;
                                    object7 = hv3_0.K(n16);
                                    ((da$a)object6).b((String)object7);
                                    object7 = UrlHelper.Companion.getInstance();
                                    object8 = ((ProductSimilar)object4).getImageURL();
                                    object7 = ((UrlHelper)object7).getImageUrl((String)object8);
                                    object8 = this.k[n8];
                                    ((da$a)object6).n = object7;
                                    ((da$a)object6).u = object8;
                                    ((da$a)object6).i = n14;
                                    ((da$a)object6).a();
                                    object6 = viewArray[n8];
                                    object8 = object;
                                    object8 = (CartEntry)object;
                                    object7 = new un_1(this, (CartEntry)object8, n8, (ProductSimilar)object4);
                                    object6.setOnClickListener((View.OnClickListener)object7);
                                }
                                n8 = n4;
                                continue;
                            }
                            xx_2.n();
                            throw null;
                        }
                        object2 = this.b;
                        if (object2 != null) {
                            n10 = list.size();
                            object2.y7(n10);
                        }
                    }
                } else {
                    object3.setVisibility(0);
                    object4.setVisibility(0);
                    if (textView != null) {
                        textView.setClickable(false);
                    }
                    if (textView != null) {
                        n3 = R$drawable.revamp_disable_btn_bg;
                        textView.setBackgroundResource(n3);
                    }
                    if (textView != null) {
                        n3 = hv3_0.m(R$color.accent_color_12);
                        textView.setTextColor(n3);
                    }
                    hv3_0.r0(object8, (View)object7);
                    hv3_0.r0((ShimmerFrameLayout)((Object)object6), (View)object5);
                }
            }
            object = (CartEntry)object;
            object2 = new vn_1(this, (CartEntry)object);
            object = this.r;
            object.setOnClickListener((View.OnClickListener)object2);
        }
    }
}

