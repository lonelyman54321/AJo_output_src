/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView;
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView$EllipsisListener;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Sh2
 */
public final class sh2_2
extends RecyclerView$B
implements AjioEllipsisTextView$EllipsisListener {
    public final View a;
    public final yi2_1 b;
    public final WA c;
    public final TextView d;
    public final ImageView e;
    public final AjioEllipsisTextView f;
    public final TextView g;
    public final CardView h;

    public sh2_2(View view, yi2_1 object, WA wA) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        String string2 = "listener";
        Intrinsics.checkNotNullParameter(wA, string2);
        super(view);
        this.a = view;
        this.b = object;
        this.c = wA;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.brand_desc_title_tv;
        object = (TextView)view.findViewById(n3);
        this.d = object;
        if (object != null) {
            ai0_2.t((View)object);
        }
        n3 = R$id.brand_desc_logo_iv;
        object = (ImageView)view.findViewById(n3);
        this.e = object;
        n3 = R$id.brand_desc_tv;
        this.f = object = (AjioEllipsisTextView)view.findViewById(n3);
        n3 = R$id.logo_card_view;
        object = (CardView)view.findViewById(n3);
        this.h = object;
        n3 = R$id.desc_read_more_tv;
        view = (TextView)view.findViewById(n3);
        this.g = view;
    }

    public final void ellipsisStateChanged(boolean bl2) {
        if (bl2) {
            TextView textView = this.g;
            if (textView != null) {
                boolean bl3 = false;
                textView.setVisibility(0);
            }
        } else {
            TextView textView = this.g;
            if (textView != null) {
                int n3 = 8;
                textView.setVisibility(n3);
            }
        }
    }

    public final void w() {
        int n3;
        Object object = this.f;
        int n4 = 1;
        boolean bl2 = false;
        Object object2 = this.b;
        Object object3 = object2.x5();
        String string2 = null;
        object3 = object3 != null && (object3 = ((Product)object3).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object3).getDescriptionV2() : null;
        Object object4 = object2.x5();
        object4 = object4 != null && (object4 = ((Product)object4).getFnlColorVariantData()) != null ? ((ProductFnlColorVariantData)object4).getAboutBrandImgUrl() : null;
        object2 = object2.x5();
        if (object2 != null && (object2 = ((Product)object2).getFnlColorVariantData()) != null) {
            string2 = ((ProductFnlColorVariantData)object2).getBrandName();
        }
        if (object3 != null && (n3 = ((String)object3).length()) != 0 && string2 != null && (n3 = string2.length()) != 0) {
            int n7;
            object2 = this.d;
            if (object2 != null) {
                int n8 = R$string.more_from_brand_pdp;
                Object[] objectArray = new Object[n4];
                objectArray[0] = string2;
                string2 = hv3_0.L(n8, objectArray);
                object2.setText((CharSequence)string2);
            }
            if (object != null) {
                object.setEllipsesListener(this);
            }
            if (object != null) {
                object.setText((CharSequence)object3);
            }
            if ((object = this.g) != null) {
                object2 = new rh2_1(this, 0);
                object.setOnClickListener((View.OnClickListener)object2);
            }
            if (object4 != null && (n7 = ((String)object4).length()) != 0) {
                object = "https://www.ajio.com";
                bl2 = StringsKt.F((CharSequence)object4, (CharSequence)object, false);
                if (!bl2) {
                    object4 = ((String)object).concat((String)object4);
                }
                object = new da$a();
                ((da$a)object).k = n4;
                ((da$a)object).r = n4;
                n4 = R$string.acc_banner;
                Object object5 = hv3_0.K(n4);
                ((da$a)object).b((String)object5);
                ((da$a)object).m = object5 = new Sh2$a(this);
                object5 = this.e;
                Intrinsics.checkNotNull(object5);
                ((da$a)object).n = object4;
                ((da$a)object).u = object5;
                ((da$a)object).a();
            } else {
                object = this.h;
                if (object != null) {
                    n4 = 8;
                    object.setVisibility(n4);
                }
            }
        }
    }
}

