/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class dP
extends RecyclerView$f
implements View.OnClickListener {
    public static final dP$a Companion;
    public List a;
    public dP$b b;

    static {
        dP$a dP$a;
        Companion = dP$a = new Object();
    }

    public static void g(TextView textView, ProductOptionVariant productOptionVariant) {
        String string2 = productOptionVariant.getValue();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return;
        }
        string2 = Y63.f(productOptionVariant);
        Intrinsics.checkNotNull(textView);
        textView.setText((CharSequence)string2);
        bl2 = productOptionVariant.isStockAvailable();
        if (!bl2) {
            textView.setTag(null);
            int n3 = og1_1.b();
            if (n3 != 0) {
                n3 = R$drawable.half_cart_closet_size_oos_luxe;
                textView.setBackgroundResource(n3);
                n3 = hv3_0.m(R$color.luxe_color_989898);
                textView.setTextColor(n3);
            } else {
                n3 = R$drawable.half_cart_closet_size_oos_refresh;
                textView.setBackgroundResource(n3);
                n3 = hv3_0.m(R$color.accent_color_28);
                textView.setTextColor(n3);
            }
        } else {
            bl2 = productOptionVariant.isSelected();
            if (bl2) {
                textView.setTag(null);
                int n4 = hv3_0.m(R$color.accent_color_10);
                textView.setBackgroundColor(n4);
                n4 = (int)(og1_1.b() ? 1 : 0);
                if (n4 != 0) {
                    n4 = hv3_0.m(R$color.luxe_color_E0E0E0);
                    textView.setTextColor(n4);
                } else {
                    n4 = hv3_0.m(R$color.white);
                    textView.setTextColor(n4);
                }
            } else {
                textView.setTag((Object)productOptionVariant);
                int n7 = og1_1.b();
                if (n7 != 0) {
                    productOptionVariant = hv3_0.r(R$drawable.luxe_btn_bg);
                    textView.setBackground((Drawable)productOptionVariant);
                    n7 = hv3_0.m(R$color.luxe_color_121212);
                    textView.setTextColor(n7);
                } else {
                    n7 = hv3_0.m(R$color.white);
                    textView.setBackgroundColor(n7);
                }
                n7 = hv3_0.m(R$color.accent_color_10);
                textView.setTextColor(n7);
            }
        }
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        List list = this.a;
        String string2 = ((ProductOptionVariant)list.get(n3)).getValue();
        Intrinsics.checkNotNull(string2);
        int n4 = string2.length();
        int n7 = 1;
        n4 -= n7;
        int n8 = 0;
        boolean bl2 = false;
        while (n8 <= n4) {
            int n10 = !bl2 ? n8 : n4;
            n10 = string2.charAt(n10);
            int n14 = 32;
            n10 = Intrinsics.compare(n10, n14);
            n10 = n10 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n10 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n8;
                continue;
            }
            if (n10 == 0) break;
            n4 += -1;
        }
        n4 += n7;
        n3 = (string2 = ((Object)string2.subSequence(n8, n4)).toString()).length();
        if (n3 > (n4 = 3)) {
            return 2;
        }
        return n7;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (fP)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        ProductOptionVariant productOptionVariant = (ProductOptionVariant)this.a.get(n3);
        n3 = this.getItemViewType(n3);
        int n4 = 2;
        if (n3 == n4) {
            recyclerView$B = ((mp_2)recyclerView$B).a;
            dP.g((TextView)recyclerView$B, productOptionVariant);
        } else {
            recyclerView$B = ((dn_2)recyclerView$B).a;
            dP.g((TextView)recyclerView$B, productOptionVariant);
        }
    }

    public final void onClick(View object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "v");
        Object object2 = object.getTag();
        if (object2 != null && (bl2 = (object2 = object.getTag()) instanceof ProductOptionVariant)) {
            object2 = object.getTag();
            Object object3 = "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductOptionVariant";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = ((ProductOptionVariant)object2).getCode();
            Object object4 = object.getTag();
            Intrinsics.checkNotNull(object4, (String)object3);
            object4 = ((ProductOptionVariant)object4).getValue();
            if (object4 != null) {
                object = object.getTag();
                Intrinsics.checkNotNull(object, (String)object3);
                object = ((ProductOptionVariant)object).getValue();
            } else {
                object = "";
            }
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Intrinsics.checkNotNull(object);
            object4 = "Change Size/";
            String string2 = "bag screen";
            String string3 = "Change Size";
            cP.b((String)object4, (String)object, (GTMEvents)object3, string3, string2);
            object = this.b;
            object.O9((String)object2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 2;
        String string3 = "clickListener";
        String string4 = "itemView";
        if (n3 == n4) {
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.row_cart_variable_size_luxe;
                viewGroup = object.inflate(n4, viewGroup, false);
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.row_cart_variable_size_refresh;
                viewGroup = object.inflate(n4, viewGroup, false);
            }
            Intrinsics.checkNotNullParameter(viewGroup, string4);
            Intrinsics.checkNotNullParameter(this, string3);
            object = new fP((View)viewGroup);
            n4 = R$id.row_cart_variable_size_tv;
            viewGroup = (TextView)viewGroup.findViewById(n4);
            object.a = viewGroup;
            if (viewGroup != null) {
                viewGroup.setOnClickListener((View.OnClickListener)this);
            }
        } else {
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.row_cart_fixed_size_luxe;
                viewGroup = object.inflate(n4, viewGroup, false);
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.row_cart_fixed_size_refresh;
                viewGroup = object.inflate(n4, viewGroup, false);
            }
            Intrinsics.checkNotNullParameter(viewGroup, string4);
            Intrinsics.checkNotNullParameter(this, string3);
            object = new fP((View)viewGroup);
            n4 = R$id.row_cart_fixed_size_tv;
            viewGroup = (TextView)viewGroup.findViewById(n4);
            object.a = viewGroup;
            if (viewGroup != null) {
                viewGroup.setOnClickListener((View.OnClickListener)this);
            }
        }
        return object;
    }
}

