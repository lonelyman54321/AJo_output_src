/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from qD0
 */
public final class qd0_1
extends RecyclerView$f {
    public final r72_0 a;
    public final ArrayList b;
    public final HashMap c;

    public qd0_1(r72_0 r72_02, ArrayList arrayList, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(r72_02, "onAdapterChangeListener");
        this.a = r72_02;
        this.b = arrayList;
        this.c = hashMap;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (td0_1)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Serializable serializable = this.b;
        if (serializable != null) {
            Object object2;
            int n4;
            int n7;
            int n8;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7 = ((ArrayList)serializable).get(n3);
            Intrinsics.checkNotNullExpressionValue(object7, "get(...)");
            object7 = (CartEntry)object7;
            object.getClass();
            Intrinsics.checkNotNullParameter(object7, "parentCartEntry");
            serializable = ((CartEntry)object7).getOrderEntry();
            Object object8 = ((CartEntry)serializable).getProduct();
            Object object9 = ((td0_1)object).c;
            int n10 = 1;
            if (object8 != null) {
                object6 = ((CartEntry)serializable).getProduct().getImages();
                if (object6 != null) {
                    boolean bl2;
                    object6 = ((CartEntry)serializable).getProduct().getImages();
                    Intrinsics.checkNotNull(object6);
                    object6 = object6.iterator();
                    while (bl2 = object6.hasNext()) {
                        object5 = (ProductImage)object6.next();
                        object4 = ((ProductImage)object5).getFormat();
                        boolean bl3 = kotlin.text.b.i((String)object4, (String)(object3 = "cartIcon"), n10 != 0);
                        if (!bl3 || !(bl3 = kotlin.text.b.i((String)(object4 = ((ProductImage)object5).getImageType()), (String)(object3 = "PRIMARY"), n10 != 0))) continue;
                        object4 = new da$a();
                        ((da$a)object4).k = n10;
                        ((da$a)object4).r = n10;
                        n8 = R$string.acc_banner;
                        object3 = hv3_0.K(n8);
                        ((da$a)object4).b((String)object3);
                        object3 = UrlHelper.Companion.getInstance();
                        object5 = ((ProductImage)object5).getUrl();
                        ((da$a)object4).n = object5 = ((UrlHelper)object3).getImageUrl((String)object5);
                        ((da$a)object4).u = object9;
                        ((da$a)object4).a();
                    }
                }
            } else {
                n7 = R$drawable.item_dummy_noimg;
                ((AppCompatImageView)((Object)object9)).setImageResource(n7);
            }
            if ((object9 = ((Product)object8).getCode()) != null && (n4 = ((String)object9).length()) != 0 && (object9 = this.c) != null && (n7 = (int)(object9.containsKey(object6 = ((Product)object8).getCode()) ? 1 : 0)) == n10 && (n7 = ((CartEntry)serializable).isExchangeItem()) == 0) {
                object6 = a21.a;
                object5 = a21$a.RETURN_REFUND;
                object4 = ((RecyclerView$B)object).itemView;
                Intrinsics.checkNotNullExpressionValue(object4, "itemView");
                object3 = ((Product)object8).getCode();
                object9 = (ArrayList)object9.get(object3);
                a21.i((a21)object6, (a21$a)((Object)object5), (View)object4, (ArrayList)object9);
            }
            n4 = (int)(((CartEntry)serializable).isExchangeItem() ? 1 : 0);
            object6 = ((td0_1)object).i;
            object5 = ((td0_1)object).h;
            object4 = ((td0_1)object).f;
            n8 = 8;
            AjioTextView ajioTextView = ((td0_1)object).g;
            if (n4 != 0) {
                object9 = hv3_0.K(R$string.exchange_request);
                object4.setText((CharSequence)object9);
                n4 = Color.parseColor((String)"#333333");
                ajioTextView.setTextColor(n4);
                object9 = ((CartEntry)serializable).getProduct().getSelectedSize();
                object4 = "Size:";
                object2 = new StringBuilder((String)object4);
                ((StringBuilder)object2).append((String)object9);
                object9 = ((StringBuilder)object2).toString();
                ajioTextView.setText((CharSequence)object9);
                ajioTextView.setPadding(0, 0, 0, 0);
                n4 = 0;
                object9 = null;
                ajioTextView.setBackground(null);
                ajioTextView.setVisibility(0);
                object5.setVisibility(n8);
                object6.setVisibility(n8);
            } else {
                object9 = hv3_0.K(R$string.return_request);
                object4.setText((CharSequence)object9);
                object5.setVisibility(n8);
                object6.setVisibility(n8);
                object9 = ((CartEntry)serializable).getReason();
                object6 = ((CartEntry)serializable).getSubReason();
                n4 = (int)(ce0_2.a((String)object9, (String)object6) ? 1 : 0);
                if (n4 != 0) {
                    n4 = Color.parseColor((String)"#999999");
                    ajioTextView.setTextColor(n4);
                    n4 = R$drawable.pending_verification_bg;
                    ajioTextView.setBackgroundResource(n4);
                    object9 = hv3_0.K(R$string.pending_verification);
                    ajioTextView.setText((CharSequence)object9);
                    n4 = mz3_0.d(5);
                    n10 = mz3_0.d(n10);
                    n7 = mz3_0.d(2);
                    ajioTextView.setPadding(n4, n10, n4, n7);
                    ajioTextView.setVisibility(0);
                } else {
                    ajioTextView.setVisibility(n8);
                }
            }
            object9 = new rd0_2((td0_1)object, (CartEntry)object7);
            object2 = ((td0_1)object).d;
            object2.setOnClickListener((View.OnClickListener)object9);
            object9 = ((Product)object8).getName();
            object5 = "Reset product ";
            object6 = new StringBuilder((String)object5);
            ((StringBuilder)object6).append((String)object9);
            object9 = ((StringBuilder)object6).toString();
            object2.setContentDescription((CharSequence)object9);
            object9 = new sd0_0((td0_1)object, (CartEntry)object7, (CartEntry)serializable);
            object = ((td0_1)object).e;
            object.setOnClickListener((View.OnClickListener)object9);
            object7 = ((Product)object8).getName();
            object8 = "Edit product ";
            serializable = new StringBuilder((String)object8);
            ((StringBuilder)serializable).append((String)object7);
            object7 = ((StringBuilder)serializable).toString();
            object.setContentDescription((CharSequence)object7);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.exchange_return_controller_bottomlist_row_new;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        r72_0 r72_02 = this.a;
        object = new td0_1((View)viewGroup, r72_02);
        return object;
    }
}

