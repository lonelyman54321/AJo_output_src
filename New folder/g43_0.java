/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G43
 */
public final class g43_0
extends BottomSheetDialogFragment {
    public final Product a;
    public final boolean b;

    public g43_0(Product product, boolean bl2) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.a = product;
        this.b = bl2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.CustomBottomSheetDialogTheme;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.similar_items_error_bottom_sheet_fragments;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        TextView textView;
        ImageView imageView;
        Object object3;
        Object object4;
        int n3;
        TextView textView2;
        int n4;
        block9: {
            Intrinsics.checkNotNullParameter(object, "view");
            super.onViewCreated((View)object, (Bundle)object2);
            n4 = R$id.productImg;
            object2 = (ImageView)object.findViewById(n4);
            int n7 = R$id.productBrandName;
            textView2 = (TextView)object.findViewById(n7);
            n3 = R$id.errorTitleTv;
            object4 = (TextView)object.findViewById(n3);
            int n8 = R$id.errorMessageTv;
            object3 = (TextView)object.findViewById(n8);
            int n10 = R$id.close_cross_btn;
            imageView = (ImageView)object.findViewById(n10);
            int n14 = R$id.okayBtn;
            textView = (TextView)object.findViewById(n14);
            int n15 = R$id.parent_layout;
            object = (ConstraintLayout)object.findViewById(n15);
            Object object5 = Looper.getMainLooper();
            Object object6 = new Handler(object5);
            object5 = new E43((ConstraintLayout)((Object)object));
            long l2 = 300L;
            object6.postDelayed((Runnable)object5, l2);
            int n16 = this.b;
            if (n16 != 0) {
                n16 = R$string.failed_to_load;
                object = this.getString(n16);
                object4.setText((CharSequence)object);
                n16 = R$string.error_while_getting_similar_products;
                object = this.getString(n16);
                object3.setText((CharSequence)object);
                n16 = R$string.retry;
                object = this.getString(n16);
                textView.setText((CharSequence)object);
            }
            Intrinsics.checkNotNull(object2);
            object = this.a;
            object4 = ((Product)object).getImages();
            if (object4 != null) {
                object4 = object4.iterator();
                while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    object3 = (ProductImage)object4.next();
                    object6 = ((ProductImage)object3).getFormat();
                    n15 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                    if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object6 = ((ProductImage)object3).getFormat(), object5 = "product") ? 1 : 0)) == 0) continue;
                    object4 = new da$a();
                    ((da$a)object4).a = n15 = R$drawable.component_placeholder;
                    ((da$a)object4).b = n15;
                    object6 = UrlHelper.Companion.getInstance();
                    object3 = ((ProductImage)object3).getUrl();
                    ((da$a)object4).n = object3 = ((UrlHelper)object6).getImageUrl((String)object3);
                    ((da$a)object4).u = object2;
                    ((da$a)object4).a();
                    break block9;
                }
                n3 = R$drawable.product_cell_placeholder;
                object2.setImageResource(n3);
                n3 = R$string.acc_icon_product_placeholder;
                object4 = hv3_0.K(n3);
                object2.setContentDescription((CharSequence)object4);
            }
        }
        object2 = ((Product)object).getFnlColorVariantData();
        n3 = 0;
        object4 = null;
        if (object2 != null) {
            object2 = ((ProductFnlColorVariantData)object2).getBrandName();
        } else {
            n4 = 0;
            object2 = null;
        }
        object3 = " ";
        if (object2 != null) {
            object2 = ((Product)object).getFnlColorVariantData();
            if (object2 != null) {
                object4 = ((ProductFnlColorVariantData)object2).getBrandName();
            }
            object = ((Product)object).getName();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object4);
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            textView2.setText((CharSequence)object);
        } else {
            object2 = ((Product)object).getBrandName();
            if (object2 != null) {
                object2 = ((Product)object).getBrandName();
                object = ((Product)object).getName();
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append((String)object);
                object = ((StringBuilder)object4).toString();
                textView2.setText((CharSequence)object);
            }
        }
        object = new F43(this);
        textView.setOnClickListener((View.OnClickListener)object);
        object = new un2_0(this, 1);
        imageView.setOnClickListener((View.OnClickListener)object);
    }
}

