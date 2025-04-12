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
 *  android.widget.EditText
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.returnexchange.dropatstore.StoreAddress;
import com.ril.ajio.services.data.returnexchange.dropatstore.StoreNode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fC0
 */
public final class fc0_1
extends RecyclerView$f
implements View.OnClickListener {
    public List a;
    public fC0$d b;
    public EditText c;

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        List list = this.a;
        Intrinsics.checkNotNull(list);
        return ((gc0_0)list.get((int)n3)).a;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        boolean bl2 = false;
        String string2 = null;
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = this.getItemViewType(n3);
        int n7 = 2;
        if (n4 == n7) {
            recyclerView$B = (fC0$e)recyclerView$B;
            object = this.a;
            Intrinsics.checkNotNull(object);
            Object object2 = ((gc0_0)object.get((int)n3)).b;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.services.data.returnexchange.dropatstore.StoreNode");
            object = ((StoreNode)object2).getStoreAddress();
            Object object3 = ((fC0$e)recyclerView$B).j;
            int n8 = 8;
            if (object3 != null) {
                object3.setVisibility(n8);
            }
            n7 = (int)(((StoreNode)object2).isRefundByCash() ? 1 : 0);
            Object object4 = ((fC0$e)recyclerView$B).b;
            if (n7 != 0) {
                n7 = hv3_0.m(R$color.accent_color_2);
                object4.setTextColor(n7);
                n7 = R$string.cash_refund_available;
                object3 = hv3_0.K(n7);
                object4.setText((CharSequence)object3);
            } else {
                n7 = hv3_0.m(R$color.accent_color_1);
                object4.setTextColor(n7);
                n7 = R$string.cash_refund_unavailable;
                object3 = hv3_0.K(n7);
                object4.setText((CharSequence)object3);
            }
            object3 = ((StoreAddress)object).getLine1();
            n7 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            object4 = "";
            object3 = n7 == 0 ? ((StoreAddress)object).getLine1() : object4;
            String string3 = ((StoreAddress)object).getLine2();
            boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
            String string4 = ",";
            if (!bl3) {
                string3 = ((StoreAddress)object).getLine2();
                object3 = n1.a((String)object3, string4, string3);
            }
            string3 = ((StoreAddress)object).getLandmark();
            bl3 = TextUtils.isEmpty((CharSequence)string3);
            View view = ((fC0$e)recyclerView$B).g;
            if (!bl3) {
                view.setVisibility(0);
                string3 = ((StoreAddress)object).getLandmark();
                view = ((fC0$e)recyclerView$B).d;
                view.setText((CharSequence)string3);
            } else {
                view.setVisibility(n8);
            }
            string3 = ((StoreAddress)object).getPhone();
            bl3 = TextUtils.isEmpty((CharSequence)string3);
            view = ((fC0$e)recyclerView$B).h;
            if (!bl3) {
                view.setVisibility(0);
                string3 = ((StoreAddress)object).getPhone();
                view = ((fC0$e)recyclerView$B).e;
                view.setText((CharSequence)string3);
            } else {
                view.setVisibility(n8);
            }
            string3 = ((StoreNode)object2).getStoreTime();
            bl3 = TextUtils.isEmpty((CharSequence)string3);
            view = ((fC0$e)recyclerView$B).f;
            if (!bl3) {
                view.setVisibility(0);
                n8 = R$string.timing_format;
                string3 = ((StoreNode)object2).getStoreTime();
                int n10 = 1;
                Object[] objectArray = new Object[n10];
                objectArray[0] = string3;
                string2 = hv3_0.L(n8, objectArray);
                view.setText((CharSequence)string2);
            } else {
                view.setVisibility(n8);
            }
            string2 = ((StoreAddress)object).getTown();
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                string2 = ((StoreAddress)object).getTown();
                object3 = n1.a((String)object3, string4, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((StoreAddress)object).getDistrict())))) {
                string2 = ((StoreAddress)object).getDistrict();
                object3 = n1.a((String)object3, string4, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((StoreAddress)object).getState())))) {
                string2 = ((StoreAddress)object).getState();
                object3 = n1.a((String)object3, string4, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((StoreAddress)object).getPostalCode())))) {
                string2 = ((StoreAddress)object).getPostalCode();
                object = "-";
                object3 = n1.a((String)object3, (String)object, string2);
            }
            string2 = ((StoreNode)object2).getStoreName();
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            object = ((fC0$e)recyclerView$B).a;
            if (!bl2) {
                object2 = ((StoreNode)object2).getStoreName();
                object.setText((CharSequence)object2);
            } else {
                object.setText((CharSequence)object4);
            }
            recyclerView$B = ((fC0$e)recyclerView$B).c;
            recyclerView$B.setText((CharSequence)object3);
        }
    }

    public final void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        fC0$d fC0$d = this.b;
        if (fC0$d == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.dns_tv_findstore)) {
            fC0$d.v();
        } else {
            n3 = R$id.tv_pincode_check;
            if (n4 == n3) {
                object = this.c;
                if (object != null) {
                    object = object.getText();
                } else {
                    n4 = 0;
                    object = null;
                }
                object = String.valueOf(object);
                fC0$d.w((String)object);
                object = this.c;
                if (object != null) {
                    object.clearFocus();
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = 1;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    Object object2 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.row_find_store_exchange_revamp;
                    object = object2.inflate(n4, object, false);
                    object2 = new fC0$e(this, (View)object);
                    return object2;
                }
                Object object3 = LayoutInflater.from((Context)object.getContext());
                n4 = R$layout.row_no_item_eligible;
                object = object3.inflate(n4, object, false);
                Intrinsics.checkNotNullParameter(object, "itemView");
                object3 = new RecyclerView$B((View)object);
                return object3;
            }
            Object object4 = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.row_no_store_exchange_return_revamp;
            object = object4.inflate(n4, object, false);
            string2 = "itemView";
            Intrinsics.checkNotNullParameter(object, string2);
            object4 = new RecyclerView$B((View)object);
            n4 = R$id.dns_tv_findstore;
            object = (AjioTextView)object.findViewById(n4);
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
            return object4;
        }
        Object object5 = LayoutInflater.from((Context)object.getContext());
        n4 = R$layout.row_checkout_find_store_revamp;
        object = object5.inflate(n4, object, false);
        object5 = new fc0$a_0(this, (View)object);
        return object5;
    }
}

