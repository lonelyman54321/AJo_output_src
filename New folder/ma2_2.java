/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOption;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.Stock;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from MA2
 */
public final class ma2_2
extends RecyclerView$B {
    public final u21_0 a;
    public ProductOptionItem b;
    public ProductOptionVariant c;
    public Product d;
    public final TextView e;
    public String f;

    public ma2_2(View view, u21_0 u21_02) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = u21_02;
        int n3 = R$id.closet_size_item_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.e = view;
    }

    public final void w(ProductOptionItem object, ProductOptionVariant productOptionVariant, Product object2) {
        int n3;
        String string2;
        boolean bl2;
        Object object3;
        Object object4;
        int n4;
        String string3;
        int n7;
        int n8;
        Object object5;
        Intrinsics.checkNotNullParameter(object, "optionItem");
        Intrinsics.checkNotNullParameter(object2, "product");
        this.b = object;
        this.c = productOptionVariant;
        this.d = object2;
        int n10 = 0;
        object = null;
        this.f = null;
        int n14 = 1;
        if (object2 != null && (object5 = ((Product)object2).getBaseOptions()) != null && (n8 = (object5 = (Collection)object5).isEmpty() ^ n14) == n14 && (object2 = ((Product)object2).getBaseOptions()) != null && (object2 = (ProductOption)object2.get(0)) != null && (object2 = ((ProductOption)object2).getOptions()) != null && (n7 = (object2 = (Collection)object2).isEmpty() ^ n14) == n14 && (object2 = this.d) != null && (object2 = ((Product)object2).getBaseOptions()) != null && (object2 = (ProductOption)object2.get(0)) != null && (object2 = ((ProductOption)object2).getOptions()) != null && (object2 = (ProductOptionItem)object2.get(0)) != null && (object5 = (Collection)((ProductOptionItem)object2).getAttributes()) != null && (n8 = (int)(object5.isEmpty() ? 1 : 0)) == 0) {
            object2 = ((ProductOptionItem)object2).getAttributes();
            Intrinsics.checkNotNull(object2);
            object2 = object2.iterator();
            while ((n8 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object5 = (ProductOptionVariant)object2.next();
                string3 = ((ProductOptionVariant)object5).getAttributeName();
                n4 = (int)("selection1".equalsIgnoreCase(string3) ? 1 : 0);
                object4 = "null";
                if (n4 != 0 && (string3 = ((ProductOptionVariant)object5).getAttributeValue()) != null && (n4 = string3.length()) != 0 && (n4 = (int)(kotlin.text.b.i(string3 = ((ProductOptionVariant)object5).getAttributeValue(), (String)object4, n14 != 0) ? 1 : 0)) == 0) {
                    ((ProductOptionVariant)object5).getAttributeValue();
                    continue;
                }
                object3 = "selection2";
                string3 = ((ProductOptionVariant)object5).getAttributeName();
                n4 = (int)(((String)object3).equalsIgnoreCase(string3) ? 1 : 0);
                if (n4 == 0 || (string3 = ((ProductOptionVariant)object5).getAttributeValue()) == null || (n4 = string3.length()) == 0 || (n4 = (int)(kotlin.text.b.i(string3 = ((ProductOptionVariant)object5).getAttributeValue(), (String)object4, n14 != 0) ? 1 : 0)) != 0 || (n4 = (int)(kotlin.text.b.i(string3 = ((ProductOptionVariant)object5).getAttributeValue(), (String)(object4 = "size"), n14 != 0) ? 1 : 0)) != 0) continue;
                this.f = object5 = ((ProductOptionVariant)object5).getAttributeValue();
            }
        }
        object2 = this.b;
        object5 = this.f;
        string3 = "";
        if (object5 != null && (n8 = kotlin.text.b.k((CharSequence)object5)) == 0) {
            if (object2 != null) {
                object5 = ((ProductOptionItem)object2).getVariantOptionQualifiers();
            } else {
                n8 = 0;
                object5 = null;
            }
            if (object5 != null) {
                object2 = ((ProductOptionItem)object2).getVariantOptionQualifiers();
                Intrinsics.checkNotNull(object2);
                object2 = object2.iterator();
                n8 = 0;
                object5 = null;
                object4 = null;
                while (bl2 = object2.hasNext()) {
                    String string4;
                    object3 = (ProductOptionVariant)object2.next();
                    string2 = this.f;
                    if (string2 != null && (n3 = kotlin.text.b.k(string2)) == 0 && (n3 = kotlin.text.b.i(string2 = this.f, string4 = ((ProductOptionVariant)object3).getQualifier(), n14 != 0)) != 0) {
                        object5 = ((ProductOptionVariant)object3).getValue();
                    }
                    if ((n3 = (string4 = "uom").equalsIgnoreCase(string2 = ((ProductOptionVariant)object3).getQualifier())) == 0) continue;
                    object4 = ((ProductOptionVariant)object3).getValue();
                }
            } else {
                n8 = 0;
                object5 = null;
                object4 = null;
            }
            if (object5 != null && (n7 = kotlin.text.b.k((CharSequence)object5)) == 0 && object4 != null && (n7 = (int)(kotlin.text.b.k((CharSequence)object4) ? 1 : 0)) == 0) {
                object2 = " ";
                string3 = n1.a((String)object5, (String)object2, (String)object4);
            }
        }
        if ((object2 = this.b) != null) {
            object5 = ((ProductOptionItem)object2).getStock();
            if (object5 != null && (object5 = ((Stock)object5).getStockLevel()) != null) {
                n8 = (Integer)object5;
            } else {
                n8 = 0;
                object5 = null;
            }
            if (n8 > 0) {
                n8 = 1;
            } else {
                n8 = 0;
                object5 = null;
            }
            object4 = this.e;
            object4.setTag(object2);
            n7 = string3.length();
            if (n7 == 0) {
                n7 = 1;
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n7 == 0) {
                object = string3;
            } else {
                n7 = (int)(hv3_0.Y() ? 1 : 0);
                if (n7 != 0 && (object2 = this.c) != null) {
                    Intrinsics.checkNotNull(object2);
                    object = Y63.f((ProductOptionVariant)object2);
                } else {
                    object2 = this.c;
                    if (object2 != null && (object2 = ((ProductOptionVariant)object2).getValue()) != null) {
                        n10 = ((String)object2).length() - n14;
                        n4 = 0;
                        string3 = null;
                        bl2 = false;
                        object3 = null;
                        while (n4 <= n10) {
                            n3 = !bl2 ? n4 : n10;
                            n3 = ((String)object2).charAt(n3);
                            int n15 = 32;
                            if ((n3 = Intrinsics.compare(n3, n15)) <= 0) {
                                n3 = 1;
                            } else {
                                n3 = 0;
                                string2 = null;
                            }
                            if (!bl2) {
                                if (n3 == 0) {
                                    bl2 = true;
                                    continue;
                                }
                                ++n4;
                                continue;
                            }
                            if (n3 == 0) break;
                            n10 += -1;
                        }
                        object = com.jio.jioads.adinterfaces.a.a(n10, n14, n4, (String)object2);
                    }
                }
            }
            object4.setText((CharSequence)object);
            if (n8 != 0) {
                n10 = og1_1.b();
                if (n10 != 0) {
                    n10 = R$drawable.luxe_btn_bg;
                    object4.setBackgroundResource(n10);
                    n10 = hv3_0.m(R$color.luxe_color_121212);
                    object4.setTextColor(n10);
                } else {
                    n10 = R$drawable.rounded_white_refresh_4dp;
                    object4.setBackgroundResource(n10);
                }
                object4.setEnabled(n14 != 0);
            } else {
                n10 = og1_1.b();
                if (n10 != 0) {
                    n10 = R$drawable.half_cart_closet_size_oos_luxe;
                    object4.setBackgroundResource(n10);
                    n10 = hv3_0.m(R$color.luxe_color_989898);
                    object4.setTextColor(n10);
                } else {
                    n10 = R$drawable.half_cart_closet_size_oos_refresh;
                    object4.setBackgroundResource(n10);
                }
                object4.setEnabled(false);
            }
            n10 = hv3_0.m(R$color.blue);
            object4.setTextColor(n10);
            n14 = 2;
            object = new t40_0(this, n14);
            object4.setOnClickListener((View.OnClickListener)object);
        }
    }
}

