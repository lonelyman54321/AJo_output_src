/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

public class Z63
extends RecyclerView$B {
    public TextView a;
    public LinearLayout b;
    public final c92 c;

    public Z63(View view, c92 c922) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        super(view);
        this.c = c922;
    }

    public final void w(ProductOptionVariant productOptionVariant, int n3) {
        boolean bl2;
        int n4;
        int n7;
        int n8;
        Intrinsics.checkNotNullParameter(productOptionVariant, "productOptionVariant");
        Object object = productOptionVariant.getValue();
        int n10 = TextUtils.isEmpty((CharSequence)object);
        if (n10 != 0) {
            return;
        }
        object = productOptionVariant.getValue();
        int n14 = 0;
        if (object != null) {
            n8 = object.length();
            n7 = 1;
            n8 -= n7;
            n4 = 0;
            boolean bl3 = false;
            while (n4 <= n8) {
                int n15 = !bl3 ? n4 : n8;
                n15 = object.charAt(n15);
                int n16 = 32;
                n15 = Intrinsics.compare(n15, n16);
                n15 = n15 <= 0 ? 1 : 0;
                if (!bl3) {
                    if (n15 == 0) {
                        bl3 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n15 == 0) break;
                n8 += -1;
            }
            object = ((Object)object.subSequence(n4, n8 += n7)).toString();
        } else {
            n10 = 0;
            object = null;
        }
        TextView textView = this.a;
        if (textView != null) {
            textView.setText((CharSequence)object);
        }
        if ((textView = this.a) != null) {
            n7 = hv3_0.m(R$color.black);
            textView.setTextColor(n7);
        }
        n8 = (int)(productOptionVariant.isStockAvailable() ? 1 : 0);
        n7 = 3;
        if (n8 == 0) {
            textView = this.a;
            if (textView != null) {
                textView.setTag(null);
            }
            if (object != null) {
                n8 = ((String)object).length();
            } else {
                n8 = 0;
                textView = null;
            }
            if (n8 > n7) {
                textView = this.a;
                if (textView != null) {
                    n4 = R$drawable.size_selectable_stock_not_available_drawable_one_size;
                    textView.setBackgroundResource(n4);
                }
            } else {
                textView = this.a;
                if (textView != null) {
                    n4 = R$drawable.size_selectable_stock_not_available_drawable;
                    textView.setBackgroundResource(n4);
                }
            }
        } else {
            textView = this.a;
            if (textView != null) {
                textView.setTag((Object)productOptionVariant);
            }
            if (object != null) {
                n8 = ((String)object).length();
            } else {
                n8 = 0;
                textView = null;
            }
            if (n8 > n7) {
                textView = this.a;
                if (textView != null) {
                    n4 = R$drawable.disselected_size_shape_drawable_one_size;
                    textView.setBackgroundResource(n4);
                }
            } else {
                textView = this.a;
                if (textView != null) {
                    n4 = R$drawable.disselected_size_shape_drawable;
                    textView.setBackgroundResource(n4);
                }
            }
        }
        if (bl2 = productOptionVariant.isSelected()) {
            productOptionVariant = this.a;
            if (productOptionVariant != null) {
                productOptionVariant.setTag(null);
            }
            if (object != null) {
                n14 = ((String)object).length();
            }
            if (n14 > n7) {
                productOptionVariant = this.a;
                if (productOptionVariant != null) {
                    n10 = R$drawable.selected_size_shape_drawable_one_size;
                    productOptionVariant.setBackgroundResource(n10);
                }
            } else {
                productOptionVariant = this.a;
                if (productOptionVariant != null) {
                    n10 = R$drawable.selected_size_shape_drawable;
                    productOptionVariant.setBackgroundResource(n10);
                }
            }
            if ((productOptionVariant = this.a) != null) {
                n10 = hv3_0.m(R$color.white);
                productOptionVariant.setTextColor(n10);
            }
        }
        if ((productOptionVariant = this.a) != null) {
            object = new Z63$a(this, n3);
            productOptionVariant.setOnClickListener((View.OnClickListener)object);
        }
    }
}

