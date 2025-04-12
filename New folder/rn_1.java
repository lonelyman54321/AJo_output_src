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
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from RN
 */
public class rn_1
extends RecyclerView$B {
    public final View a;
    public final j82_0 b;
    public final boolean c;
    public String d;
    public final TextView e;
    public final TextView f;
    public TextView g;

    public rn_1(j82_0 j82_02, View view, boolean bl2) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        this.b = j82_02;
        this.c = bl2;
        int n3 = R$id.moveToWishlistBtn;
        j82_02 = (TextView)view.findViewById(n3);
        this.e = j82_02;
        n3 = R$id.sizeInfo;
        j82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, "findViewById(...)");
        j82_02 = (TextView)j82_02;
        this.f = j82_02;
    }

    public static String w(CartEntry object) {
        int n3;
        String string2;
        int n4;
        Intrinsics.checkNotNullParameter(object, "entry");
        Object object2 = ((CartEntry)object).getProduct().getCode();
        object = object2 != null && (n4 = ((String)object2).length()) != 0 && (object2 = ((CartEntry)object).getProduct()) != null && (object2 = ((Product)object2).getCode()) != null && (n4 = (int)(StringsKt.F((CharSequence)object2, string2 = "_", false) ? 1 : 0)) == (n3 = 1) ? ((CartEntry)object).getProduct().getCode() : ((CartEntry)object).getProduct().getBaseProduct();
        return String.valueOf(object);
    }

    public void x(Object object) {
        if (object != null) {
            int n3;
            Object object2;
            String string2;
            int n4;
            float f5;
            int n7;
            float f6;
            object = (CartEntry)object;
            int n8 = R$id.productImg;
            Object object3 = this.a;
            Object object4 = object3.findViewById(n8);
            Object object5 = "findViewById(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object4 = (ImageView)object4;
            int n10 = this.c;
            if (n10 != 0) {
                n10 = 1057635697;
                f6 = 0.54f;
                object4.setAlpha(f6);
            }
            Object object6 = ((CartEntry)object).getProduct();
            Intrinsics.checkNotNullExpressionValue(object6, "getProduct(...)");
            Object object7 = ((Product)object6).getImages();
            if (object7 != null) {
                n7 = object7.size();
            } else {
                n7 = 0;
                f5 = 0.0f;
                object7 = null;
            }
            int n14 = 0;
            String string3 = null;
            String string4 = "";
            if (n7 > 0) {
                block34: {
                    object7 = ((Product)object6).getImages();
                    Intrinsics.checkNotNull(object7);
                    object7 = object7.iterator();
                    while ((n4 = object7.hasNext()) != 0) {
                        string2 = "mobileProductListingImage";
                        ProductImage productImage = (ProductImage)object7.next();
                        object2 = productImage.getFormat();
                        n3 = (int)(string2.equalsIgnoreCase((String)object2) ? 1 : 0);
                        if (n3 == 0) continue;
                        object7 = productImage.getUrl();
                        break block34;
                    }
                    object7 = string4;
                }
                if (object7 == null) {
                    if ((object6 = ((Product)object6).getImages()) != null && (object6 = (ProductImage)object6.get(0)) != null) {
                        object7 = object6 = ((ProductImage)object6).getUrl();
                    } else {
                        n7 = 0;
                        object7 = null;
                        f5 = 0.0f;
                    }
                }
            } else {
                object7 = string4;
            }
            object6 = new da$a();
            n4 = 1;
            ((da$a)object6).k = n4;
            ((da$a)object6).a = n3 = R$drawable.component_placeholder;
            ((da$a)object6).b = n3;
            ((da$a)object6).c = n3;
            ((da$a)object6).s = n4;
            n3 = R$string.acc_icon_product_placeholder;
            object2 = hv3_0.K(n3);
            ((da$a)object6).b((String)object2);
            object2 = UrlHelper.Companion.getInstance();
            ((da$a)object6).n = object7 = ((UrlHelper)object2).getImageUrl((String)object7);
            ((da$a)object6).u = object4;
            ((da$a)object6).i = n4;
            ((da$a)object6).a();
            n8 = R$id.sizeContainer;
            object4 = object3.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            n10 = R$id.productTitle;
            object6 = object3.findViewById(n10);
            Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
            object6 = (TextView)object6;
            object7 = ((CartEntry)object).getProduct();
            if (object7 != null) {
                object2 = ((Product)object7).getName();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n3 == 0) {
                    object7 = ((Product)object7).getName();
                    object7 = kp1_0.c(string4, (String)object7);
                } else {
                    object7 = string4;
                }
                object6.setText((CharSequence)object7);
            }
            n7 = R$id.cartS1S2Info;
            object7 = object3.findViewById(n7);
            Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
            object7 = (TextView)object7;
            object2 = ka2_2.a((CartEntry)object);
            boolean bl2 = ((ja2_2)object2).b;
            if (bl2) {
                n14 = 8;
                object4.setVisibility(n14);
            } else {
                object4.setVisibility(0);
                n8 = (int)(hv3_0.Y() ? 1 : 0);
                if (n8 != 0) {
                    object4 = ((CartEntry)object).getProduct().getSelectedSizeVariant();
                    if (object4 != null) {
                        this.d = object4 = Y63.c((ProductOptionVariant)object4);
                    }
                } else {
                    this.d = object4 = ((ja2_2)object2).c;
                }
                object4 = this.d;
                n8 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                string2 = this.f;
                if (n8 == 0) {
                    object4 = this.d;
                    if (object4 != null) {
                        n14 = ((String)object4).length() - n4;
                        int n15 = 0;
                        string4 = null;
                        boolean bl3 = false;
                        while (n15 <= n14) {
                            int n16 = !bl3 ? n15 : n14;
                            n16 = ((String)object4).charAt(n16);
                            int n17 = 32;
                            n16 = Intrinsics.compare(n16, n17);
                            n16 = n16 <= 0 ? 1 : 0;
                            if (!bl3) {
                                if (n16 == 0) {
                                    bl3 = true;
                                    continue;
                                }
                                ++n15;
                                continue;
                            }
                            if (n16 == 0) break;
                            n14 += -1;
                        }
                        string3 = com.jio.jioads.adinterfaces.a.a(n14, n4, n15, (String)object4);
                    }
                    string2.setText(string3);
                } else {
                    string2.setText((CharSequence)string4);
                }
            }
            object4 = ((ja2_2)object2).a;
            if (object4 != null && (n8 = ((String)object4).length()) != 0) {
                object7.setVisibility(0);
                object6.setMaxLines(n4);
                object4 = ((ja2_2)object2).a;
                object7.setText((CharSequence)object4);
            }
            n8 = R$id.qtyInfo;
            object4 = object3.findViewById(n8);
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object4 = (TextView)object4;
            object5 = ((CartEntry)object).getQuantity().toString();
            object4.setText((CharSequence)object5);
            n8 = R$id.price;
            object4 = (TextView)object3.findViewById(n8);
            this.g = object4;
            float f7 = mz3_0.J(((CartEntry)object).getBasePrice().getValue());
            object5 = ((CartEntry)object).getQuantity();
            Intrinsics.checkNotNullExpressionValue(object5, "getQuantity(...)");
            float f8 = ((Number)object5).floatValue() * f7;
            object3 = ((CartEntry)object).getVoucherPromoAmt();
            int n18 = TextUtils.isEmpty((CharSequence)object3);
            n10 = 0;
            f6 = 0.0f;
            object6 = null;
            if (n18 == 0) {
                object3 = ((CartEntry)object).getVoucherPromoAmt();
                f7 = mz3_0.J((String)object3);
            } else {
                n18 = 0;
                f7 = 0.0f;
                object3 = null;
            }
            object7 = ((CartEntry)object).getMultiItemPromoAmt();
            n7 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
            if (n7 == 0) {
                object7 = ((CartEntry)object).getMultiItemPromoAmt();
                f5 = mz3_0.J((String)object7);
            } else {
                n7 = 0;
                f5 = 0.0f;
                object7 = null;
            }
            f8 = f8 - f7 - f5;
            float f11 = f8 - 0.0f;
            n18 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (n18 <= 0) {
                if (object4 != null) {
                    n18 = R$string.free;
                    object3 = hv3_0.K(n18);
                    object4.setText((CharSequence)object3);
                }
            } else if (object4 != null) {
                object3 = qz2_0.u(f8);
                object4.setText((CharSequence)object3);
            }
            if ((object4 = this.e) != null) {
                object3 = new qn_1(this, (CartEntry)object);
                object4.setOnClickListener((View.OnClickListener)object3);
            }
        }
    }
}

