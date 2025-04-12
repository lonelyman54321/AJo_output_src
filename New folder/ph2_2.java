/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Offers.BankOffer;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ph2
 */
public final class ph2_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final cq1_2 c;
    public final View d;
    public final ShimmerFrameLayout e;
    public final RecyclerView f;
    public final AjioTextView g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final View j;

    public ph2_2(View view, yi2_1 object, cq1_2 cq1_22) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        String string2 = "moreProductOfferCallback";
        Intrinsics.checkNotNullParameter(cq1_22, string2);
        super(view);
        this.a = view;
        this.b = object;
        this.c = cq1_22;
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.d = view;
        int n3 = R$id.bank_offer_shimmer_view;
        object = (ShimmerFrameLayout)view.findViewById(n3);
        this.e = object;
        n3 = R$id.bank_offers_rv;
        object = (RecyclerView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.more_offer_top_tv;
        object = (AjioTextView)view.findViewById(n3);
        this.g = object;
        if (object != null) {
            object.setOnClickListener(this);
        }
        n3 = R$id.more_offer_bottom_tv;
        object = (AjioTextView)view.findViewById(n3);
        this.h = object;
        if (object != null) {
            object.setOnClickListener(this);
        }
        n3 = R$id.bank_offer_title_tv;
        object = (AjioTextView)view.findViewById(n3);
        this.i = object;
        n3 = R$id.bank_offers_layout;
        object = (ConstraintLayout)view.findViewById(n3);
        if (object != null) {
            ai0_2.t((View)object);
        }
        n3 = R$id.offer_divider;
        this.j = view = view.findViewById(n3);
    }

    public final void onClick(View object) {
        block6: {
            block5: {
                int n3;
                int n4;
                if (object != null) {
                    n4 = object.getId();
                    object = n4;
                } else {
                    n4 = 0;
                    object = null;
                }
                int n7 = R$id.more_offer_bottom_tv;
                if (object != null && (n3 = ((Integer)object).intValue()) == n7) break block5;
                n7 = R$id.more_offer_top_tv;
                if (object == null || (n4 = ((Integer)object).intValue()) != n7) break block6;
            }
            object = this.c;
            object.X7();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void w() {
        Object object;
        ph2_2 ph2_22 = this;
        AjioTextView ajioTextView = this.i;
        View view = this.j;
        AjioTextView ajioTextView2 = this.h;
        AjioTextView ajioTextView3 = this.g;
        Object object2 = this.f;
        int n3 = 1;
        ShimmerFrameLayout shimmerFrameLayout = this.e;
        yi2_1 yi2_12 = this.b;
        int n4 = yi2_12.I8();
        if (n4 == 0) {
            object = h40_0.a;
            n4 = h40_0.B1();
            if (n4 == 0 && (n4 = h40_0.A1()) == 0) {
                hv3_0.p0(shimmerFrameLayout);
                return;
            }
        }
        object = yi2_12.N9();
        ViewGroup.LayoutParams layoutParams = null;
        if (object != null) {
            object = yi2_12.N9();
            Intrinsics.checkNotNull(object);
            object = ((BankOffer)object).getAllBankOffer();
            if (object != null && (n4 = object.isEmpty()) == 0) {
                int n7;
                int n8;
                void var14_18;
                Object object3;
                boolean bl2;
                hv3_0.s0(shimmerFrameLayout);
                object = yi2_12.N9();
                Intrinsics.checkNotNull(object);
                object = ((BankOffer)object).getAllBankOffer();
                Intrinsics.checkNotNull(object);
                Object[] objectArray = new ArrayList();
                Iterator iterator = object.iterator();
                int n10 = 0;
                while (bl2 = iterator.hasNext()) {
                    Object t3 = iterator.next();
                    int n14 = n10 + 1;
                    if (n10 < 0) {
                        xx_2.n();
                        throw null;
                    }
                    object3 = t3;
                    object3 = (BankOfferItem)t3;
                    if (n10 <= n3) {
                        objectArray.add(object3);
                    }
                    n10 = n14;
                }
                View view2 = ph2_22.itemView;
                if (view2 != null) {
                    Context context = view2.getContext();
                } else {
                    Object var14_17 = null;
                }
                Intrinsics.checkNotNull(var14_18);
                object3 = new LinearLayoutManager((Context)var14_18, n3, false);
                if (object2 != null) {
                    ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
                }
                object3 = new mh2_1((ArrayList)objectArray, false);
                if (object2 != null) {
                    ((RecyclerView)object2).setAdapter((RecyclerView$f)object3);
                }
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                if ((n8 = ((ArrayList)object).size()) > (n7 = 2)) {
                    object2 = StringCompanionObject.INSTANCE;
                    n8 = R$string.pdp_bank_more_offers;
                    object2 = hv3_0.K(n8);
                    n4 = ((ArrayList)object).size();
                    int n15 = objectArray.size();
                    object = n4 -= n15;
                    objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = "format(...)";
                    object2 = xh2_0.a(objectArray, n3, (String)object2, (String)object);
                    if (ajioTextView3 != null) {
                        ajioTextView3.setText((CharSequence)object2);
                    }
                    if (ajioTextView2 != null) {
                        ajioTextView2.setText((CharSequence)object2);
                    }
                }
                if ((n8 = yi2_12.b3()) == n3) {
                    n8 = 8;
                    if (view != null) {
                        view.setVisibility(n8);
                    }
                    if (ajioTextView3 != null) {
                        ajioTextView3.setVisibility(n8);
                    }
                    if (ajioTextView2 != null) {
                        ajioTextView2.setVisibility(0);
                    }
                    if (ajioTextView == null) return;
                    ajioTextView.setVisibility(n8);
                    return;
                }
                n8 = yi2_12.b3();
                if (n8 == n7) {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    if (ajioTextView3 != null) {
                        ajioTextView3.setVisibility(0);
                    }
                    if (ajioTextView2 != null) {
                        int n16 = 8;
                        ajioTextView2.setVisibility(n16);
                    }
                    if (ajioTextView == null) return;
                    ajioTextView.setVisibility(0);
                    return;
                }
                hv3_0.s0(shimmerFrameLayout);
                ajioTextView = ph2_22.itemView;
                if (ajioTextView != null) {
                    layoutParams = ajioTextView.getLayoutParams();
                }
                if (layoutParams != null) {
                    layoutParams.height = 0;
                }
                if (layoutParams != null) {
                    layoutParams.width = 0;
                }
                if ((ajioTextView = ph2_22.itemView) == null) return;
                int n17 = 8;
                ajioTextView.setVisibility(n17);
                return;
            }
        }
        hv3_0.s0(shimmerFrameLayout);
        ajioTextView = ph2_22.itemView;
        if (ajioTextView != null) {
            layoutParams = ajioTextView.getLayoutParams();
        }
        if (layoutParams != null) {
            layoutParams.height = 0;
        }
        if (layoutParams != null) {
            layoutParams.width = 0;
        }
        if ((ajioTextView = ph2_22.itemView) == null) return;
        int n18 = 8;
        ajioTextView.setVisibility(n18);
    }
}

