/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.ShippingImvData;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class k33
extends RecyclerView$f
implements View.OnClickListener {
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            Intrinsics.checkNotNull(arrayList);
            n3 = arrayList.size();
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        Serializable serializable;
        ArrayList arrayList = this.a;
        if (arrayList != null && (serializable = (ShippingImvData)arrayList.get(n3)) != null) {
            n3 = (int)(serializable.isDisplayOverlay() ? 1 : 0);
            serializable = Boolean.valueOf(n3 != 0);
        } else {
            n3 = 0;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        n3 = (int)(((Boolean)serializable).booleanValue() ? 1 : 0);
        if (n3 != 0) {
            return 2;
        }
        return 1;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        int n4 = this.getItemViewType(n3);
        int n7 = this.b;
        int n8 = this.e;
        String string3 = "get(...)";
        ArrayList arrayList = this.a;
        int n10 = 1;
        if (n4 == n10) {
            recyclerView$B = (k33$a)recyclerView$B;
            Intrinsics.checkNotNull(arrayList);
            string2 = arrayList.get(n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            string2 = ((ShippingImvData)((Object)string2)).getImageUrl();
            if (n3 == 0) {
                RelativeLayout relativeLayout = ((k33$a)recyclerView$B).b;
                relativeLayout.setPadding(0, 0, 0, 0);
            } else {
                RelativeLayout relativeLayout = ((k33$a)recyclerView$B).b;
                n8 = mz3_0.d(n8);
                relativeLayout.setPadding(n8, 0, 0, 0);
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
            if (n3 == 0) {
                if (n7 != 0 && (n3 = this.c) != 0) {
                    da$a da$a = new da$a();
                    da$a.k = n10;
                    da$a.j = n10;
                    da$a.o = n10;
                    da$a.d = n7;
                    da$a.e = n3;
                    da$a.a = n3 = R$drawable.component_placeholder;
                    da$a.b = n3;
                    da$a.g = n10;
                    recyclerView$B = ((k33$a)recyclerView$B).a;
                    da$a.n = string2;
                    da$a.u = recyclerView$B;
                    da$a.a();
                }
            } else {
                recyclerView$B = ((k33$a)recyclerView$B).a;
                n3 = R$drawable.item_dummy_noimg;
                recyclerView$B.setImageResource(n3);
            }
        } else {
            recyclerView$B = (k33$b)recyclerView$B;
            Intrinsics.checkNotNull(arrayList);
            string2 = arrayList.get(n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            string2 = ((ShippingImvData)((Object)string2)).getImageUrl();
            if (n3 == 0) {
                RelativeLayout relativeLayout = ((k33$b)recyclerView$B).b;
                relativeLayout.setPadding(0, 0, 0, 0);
            } else {
                RelativeLayout relativeLayout = ((k33$b)recyclerView$B).b;
                n8 = mz3_0.d(n8);
                relativeLayout.setPadding(n8, 0, 0, 0);
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
            if (n3 == 0) {
                if (n7 != 0 && (n3 = this.d) != 0) {
                    da$a da$a = new da$a();
                    da$a.k = n10;
                    da$a.j = n10;
                    da$a.o = n10;
                    da$a.d = n7;
                    da$a.e = n3;
                    da$a.a = n3 = R$drawable.component_placeholder;
                    da$a.b = n3;
                    da$a.g = n10;
                    recyclerView$B = ((k33$b)recyclerView$B).a;
                    da$a.n = string2;
                    da$a.u = recyclerView$B;
                    da$a.a();
                }
            } else {
                recyclerView$B = ((k33$b)recyclerView$B).a;
                n3 = R$drawable.item_dummy_noimg;
                recyclerView$B.setImageResource(n3);
            }
        }
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 1;
        String string3 = "inflate(...)";
        if (n3 == n4) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_shipping_product_imv;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
            k33$a k33$a = new k33$a((View)viewGroup);
            return k33$a;
        }
        string2 = LayoutInflater.from((Context)viewGroup.getContext());
        int n8 = R$layout.row_shipping_product_not_elligible;
        viewGroup = string2.inflate(n8, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
        k33$b k33$b = new k33$b((View)viewGroup);
        return k33$b;
    }
}

