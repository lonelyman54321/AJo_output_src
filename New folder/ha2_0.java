/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.home.landingpage.widgets.view.ComponentOrderRecyclerView;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ha2
 */
public final class ha2_0
extends RecyclerView$f {
    public static final ha2$a Companion;
    public final List a;
    public final r82_0 b;
    public final String c;
    public final String d;

    static {
        ha2$a ha2$a;
        Companion = ha2$a = new Object();
    }

    public ha2_0(ArrayList arrayList, r82_0 r82_02, String string2, String string3) {
        this.a = arrayList;
        this.b = r82_02;
        this.c = string2;
        this.d = string3;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = list.size() + 1;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        List list = this.a;
        Intrinsics.checkNotNull(list);
        int n4 = list.size();
        n3 = n3 < n4 ? 2 : 1;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        block16: {
            hp1_2 hp1_22;
            Object object;
            block15: {
                String string2;
                TextView textView;
                Object object2;
                int n4;
                block18: {
                    block20: {
                        int n7;
                        block19: {
                            block17: {
                                object = "viewHolder";
                                Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
                                int n74 = this.getItemViewType(n3);
                                n7 = 1;
                                if (n74 == n7) break block15;
                                n4 = 2;
                                if (n74 != n4) break block16;
                                recyclerView$B = (ng2_1)recyclerView$B;
                                object = this.a;
                                Intrinsics.checkNotNull(object);
                                object2 = (OrderItemLine)object.get(n3);
                                if (object2 != null) break block17;
                                recyclerView$B.getClass();
                                break block16;
                            }
                            int n8 = recyclerView$B.getAdapterPosition();
                            Object object3 = ((ng2_1)recyclerView$B).d;
                            boolean bl2 = false;
                            if (n8 == 0) {
                                int n10 = mz3_0.d(10);
                                object3.setPadding(n10, 0, 0, 0);
                            } else {
                                int n14 = mz3_0.d(4);
                                object3.setPadding(n14, 0, 0, 0);
                            }
                            object = ((OrderItemLine)object2).getImageUrl();
                            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                            if (!bl3) {
                                object = new da$a();
                                ((da$a)object).k = n7;
                                ((da$a)object).r = n7;
                                n4 = R$string.acc_banner;
                                object3 = hv3_0.K(n4);
                                ((da$a)object).b((String)object3);
                                object3 = ((OrderItemLine)object2).getImageUrl();
                                ((da$a)object).n = object3;
                                object3 = ((ng2_1)recyclerView$B).e;
                                ((da$a)object).u = object3;
                                ((da$a)object).a();
                            }
                            object = no_2.d((OrderItemLine)object2);
                            boolean bl4 = TextUtils.isEmpty((CharSequence)object);
                            n4 = 8;
                            if (bl4) break block18;
                            object = no_2.d((OrderItemLine)object2).toUpperCase();
                            Intrinsics.checkNotNullExpressionValue(object, "toUpperCase(...)");
                            textView = ((ng2_1)recyclerView$B).g;
                            if (object == null) break block19;
                            int n15 = ((String)object).hashCode();
                            switch (n15) {
                                default: {
                                    break block19;
                                }
                                case 509551236: {
                                    string2 = "DELIVERY REFUSED";
                                    boolean bl5 = ((String)object).equals(string2);
                                    if (bl5) {
                                        break;
                                    }
                                    break block19;
                                }
                                case -999438689: {
                                    string2 = "DELIVERY UNSUCCESSFUL";
                                    boolean bl6 = ((String)object).equals(string2);
                                    if (bl6) break;
                                    break block19;
                                }
                                case -1031784143: {
                                    string2 = "CANCELLED";
                                    boolean bl7 = ((String)object).equals(string2);
                                    if (bl7) break;
                                    break block19;
                                }
                                case -1161358223: {
                                    string2 = "CANCELLATION REQUESTED";
                                    boolean bl8 = ((String)object).equals(string2);
                                    if (!bl8) break block19;
                                }
                            }
                            textView.setEnabled(false);
                            break block20;
                        }
                        textView.setEnabled(n7 != 0);
                    }
                    object = no_2.a((OrderItemLine)object2);
                    boolean bl9 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl9) {
                        textView.setVisibility(0);
                        object = hv3_0.u(no_2.a((OrderItemLine)object2));
                        textView.setText((CharSequence)object);
                    } else {
                        textView.setVisibility(n4);
                    }
                }
                object = no_2.e((OrderItemLine)object2);
                boolean bl10 = TextUtils.isEmpty((CharSequence)object);
                Object object4 = ((ng2_1)recyclerView$B).h;
                if (!bl10) {
                    object4.setVisibility(0);
                    object = no_2.e((OrderItemLine)object2);
                    object4.setText((CharSequence)object);
                } else {
                    object4.setVisibility(n4);
                }
                object = ((ng2_1)recyclerView$B).f;
                object.setVisibility(0);
                int n16 = recyclerView$B.getAdapterPosition();
                int n17 = recyclerView$B.getAdapterPosition();
                String string3 = "";
                String string4 = ((ng2_1)recyclerView$B).c;
                string2 = "OPEN_ORDER_DETAIL";
                String string5 = "";
                String string6 = "";
                String string7 = ((ng2_1)recyclerView$B).b;
                textView = object4;
                object4 = new hp1_2(string2, string5, n16, string6, string7, n17, string3, string4);
                ((OrderItemLine)object2).getOrderId();
                object4.g = object2 = no_2.d((OrderItemLine)object2);
                object.setTag(object4);
                object2 = ((ng2_1)recyclerView$B).a;
                boolean bl11 = object2 instanceof ComponentOrderRecyclerView;
                if (bl11) {
                    object2 = (ComponentOrderRecyclerView)object2;
                    object2.getClass();
                    recyclerView$B = recyclerView$B.itemView;
                    recyclerView$B.clearAnimation();
                }
                break block16;
            }
            recyclerView$B = (ia2_1)recyclerView$B;
            int n18 = recyclerView$B.getAdapterPosition();
            int n19 = recyclerView$B.getAdapterPosition();
            String string8 = "";
            String string9 = ((ia2_1)recyclerView$B).c;
            String string10 = "OPEN_ORDER_LIST";
            String string11 = "";
            String string12 = "";
            String string13 = ((ia2_1)recyclerView$B).b;
            object = hp1_22;
            hp1_22 = new hp1_2(string10, string11, n18, string12, string13, n19, string8, string9);
            recyclerView$B = ((ia2_1)recyclerView$B).d;
            recyclerView$B.setTag(hp1_22);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 1;
        String string3 = this.d;
        String string4 = this.c;
        r82_0 r82_02 = this.b;
        String string5 = "inflate(...)";
        if (n3 == n4) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_component_order_footer_revamp;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string5);
            recyclerView$B = new ia2_1((View)viewGroup, r82_02, string4, string3);
        } else {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.row_component_order_revamp;
            viewGroup = string2.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string5);
            recyclerView$B = new ng2_1((View)viewGroup, r82_02, string4, string3);
        }
        return recyclerView$B;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewDetachedFromWindow(recyclerView$B);
        recyclerView$B.itemView.clearAnimation();
    }
}

