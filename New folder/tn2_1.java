/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TN2
 */
public final class tn2_1
extends RecyclerView$f {
    public final ReturnRequest a;
    public final ArrayList b;
    public final HN2 c;
    public final hE2 d;
    public final wx0_0 e;
    public final OT2 f;
    public final OnFragmentInteractionListener g;
    public final qz1_2 h;

    public tn2_1(ReturnRequest returnRequest, ArrayList arrayList, HN2 hN2, hE2 hE22, wx0_0 wx0_02, OT2 oT2, OnFragmentInteractionListener onFragmentInteractionListener, qz1_2 qz1_22) {
        Intrinsics.checkNotNullParameter(hE22, "ratingsClickListener");
        Intrinsics.checkNotNullParameter(wx0_02, "editFeedbackClickListener");
        Intrinsics.checkNotNullParameter(oT2, "scrollListener");
        Intrinsics.checkNotNullParameter(qz1_22, "newOrderDetailsViewModel");
        this.a = returnRequest;
        this.b = arrayList;
        this.c = hN2;
        this.d = hE22;
        this.e = wx0_02;
        this.f = oT2;
        this.g = onFragmentInteractionListener;
        this.h = qz1_22;
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

    public final int getItemViewType(int n3) {
        Object object;
        ArrayList arrayList = this.b;
        if (arrayList != null && (object = (pa2_0)arrayList.get(n3)) != null && (object = ((pa2_0)object).a) != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        pa2_0 pa2_02;
        recyclerView$B = (vw_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Serializable serializable = this.b;
        if (serializable != null) {
            pa2_02 = (pa2_0)serializable.get(n3);
        } else {
            n3 = 0;
            pa2_02 = null;
        }
        serializable = this.a;
        ((vw_0)recyclerView$B).w(pa2_02, serializable);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Object object2 = "viewGroup";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object2);
        int n4 = 2;
        if (n3 != n4) {
            n4 = 8;
            HN2 hN2 = this.c;
            if (n3 != n4) {
                object2 = this.h;
                OnFragmentInteractionListener onFragmentInteractionListener = this.g;
                block0 : switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                int n7 = R$layout.return_refund_tracker_row_without_subtatus;
                                viewGroup = object.inflate(n7, viewGroup, false);
                                object = new fo2_2((View)viewGroup, hN2, onFragmentInteractionListener, (qz1_2)object2);
                                break block0;
                            }
                            case 23: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.return_refund_next_steps;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object = new rn2_2((View)viewGroup, hN2);
                                break block0;
                            }
                            case 22: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.return_refund_view_product_current_order_view;
                                onFragmentInteractionListener = object.inflate(n4, viewGroup, false);
                                HN2 hN22 = this.c;
                                hE2 hE22 = this.d;
                                wx0_0 wx0_02 = this.e;
                                OT2 oT2 = this.f;
                                hN2 = object;
                                object = new wn2_2((View)onFragmentInteractionListener, hN22, hE22, wx0_02, oT2);
                                break block0;
                            }
                            case 21: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.return_refund_row_self_ship_address;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object = new sn2_1((View)viewGroup);
                                break block0;
                            }
                            case 20: {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                n4 = R$layout.return_refund_not_yet_shipped_info;
                                viewGroup = object.inflate(n4, viewGroup, false);
                                object = new sn2_1((View)viewGroup);
                                break block0;
                            }
                            case 19: 
                        }
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.return_refund_view_roginal_order;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object = new vn2_1((View)viewGroup, hN2);
                        break;
                    }
                    case 16: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.return_refund_window_closed;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object = new ho2_0((View)viewGroup);
                        break;
                    }
                    case 15: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.return_refund_new_return_creation;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object = new nn2_2((View)viewGroup, hN2);
                        break;
                    }
                    case 14: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.return_refund_reason_section;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object = new ao2_1((View)viewGroup);
                        break;
                    }
                    case 13: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        n4 = R$layout.return_refund_amount_section;
                        viewGroup = object.inflate(n4, viewGroup, false);
                        object = new fn2_2((View)viewGroup, hN2);
                        break;
                    }
                    case 12: {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        int n8 = R$layout.return_refund_tracker_main_layout;
                        viewGroup = object.inflate(n8, viewGroup, false);
                        object = new fo2_2((View)viewGroup, hN2, onFragmentInteractionListener, (qz1_2)object2);
                        break;
                    }
                }
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.return_refund_top_ptoducts;
                viewGroup = object.inflate(n4, viewGroup, false);
                object = new bo2_2((View)viewGroup, hN2);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.return_refund_row_od_address;
            viewGroup = object.inflate(n4, viewGroup, false);
            object = new cn2_0((View)viewGroup);
        }
        return object;
    }
}

