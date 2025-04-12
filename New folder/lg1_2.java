/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from lG1
 */
public final class lg1_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final t82_0 c;
    public final cq1_2 d;
    public final View e;

    public lg1_2(cq1_2 cq1_22, t82_0 t82_02, yi2_1 yi2_12, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(t82_02, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(cq1_22, "moreProductOfferCallback");
        super(view);
        this.a = view;
        this.b = yi2_12;
        this.c = t82_02;
        this.d = cq1_22;
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.e = view;
    }

    public final void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.pdp_more_offers;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            object = this.b.F7();
            cq1_2 cq1_22 = this.d;
            cq1_22.a2((ArrayList)object);
        }
    }

    public final void w(List list, boolean bl2) {
        Object object;
        int n3;
        int n4;
        int n7;
        RecyclerView recyclerView;
        int n8;
        AjioTextView ajioTextView;
        lg1_2 lg1_22 = this;
        Object object2 = list;
        int n10 = 1;
        h32 h322 = null;
        Object object3 = new ArrayList();
        Object object4 = this.e;
        int n14 = 0;
        Object object5 = null;
        if (object4 != null) {
            int n15 = R$id.pdp_more_offers;
            ajioTextView = (AjioTextView)object4.findViewById(n15);
        } else {
            boolean bl3 = false;
            ajioTextView = null;
        }
        if (object4 != null) {
            n8 = R$id.pdp_offer_view;
            object4 = object4.findViewById(n8);
        } else {
            boolean n74 = false;
            object4 = null;
        }
        Intrinsics.checkNotNull(object4);
        if (object4 != null) {
            n8 = R$id.promo_offer_rv;
            recyclerView = (RecyclerView)object4.findViewById(n8);
        } else {
            n8 = 0;
            recyclerView = null;
        }
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setPadding(0, 0, 0, 0);
        int n15 = 8;
        if (object2 != null && (n7 = list.size()) > 0) {
            object4 = (ProductPromotion)object2.get(0);
            ((ArrayList)object3).clear();
            ((ArrayList)object3).add(object4);
        } else {
            object4.setVisibility(n15);
            if (ajioTextView != null) {
                ajioTextView.setVisibility(n15);
            }
        }
        if (object2 != null && (n4 = list.size()) > n10) {
            if (ajioTextView != null) {
                ajioTextView.setVisibility(0);
            }
            if (ajioTextView != null) {
                object4 = StringCompanionObject.INSTANCE;
                int n16 = R$string.more_pdp_offer;
                object4 = hv3_0.K(n16);
                n3 = list.size() - n10;
                object2 = n3;
                object = new Object[n10];
                object[0] = object2;
                object2 = "format(...)";
                n40_0.a(object, n10, (String)object4, (String)object2, ajioTextView);
            }
            if (ajioTextView != null) {
                ajioTextView.setOnClickListener(lg1_22);
            }
        } else if (ajioTextView != null) {
            ajioTextView.setVisibility(n15);
        }
        if ((n3 = ((ArrayList)object3).isEmpty() ^ n10) != 0 && (n3 = ((ArrayList)object3).size()) > 0 || bl2) {
            double d2;
            yi2_1 yi2_12;
            boolean bl3;
            NewProductDetailsFragment newProductDetailsFragment;
            ArrayList<View> arrayList;
            object2 = lg1_22.b;
            object4 = object2.x5();
            if (object4 != null) {
                boolean bl4 = ((Product)object4).isBundleOfferAvailable();
                object5 = bl4;
            }
            Intrinsics.checkNotNull(object5);
            boolean bl5 = (Boolean)object5;
            if (bl5) {
                object3 = new ArrayList();
                n7 = 0;
                object = null;
                arrayList = null;
                newProductDetailsFragment = null;
                bl3 = false;
                yi2_12 = null;
                int n17 = 1023;
                object4 = new ProductPromotion(null, null, null, null, null, 0.0f, null, null, null, null, n17, null);
                ((ProductPromotion)object4).setTitle("Shop<br>the Look");
                n14 = R$string.pdp_bundleoffer_description;
                object5 = hv3_0.K(n14);
                ((ProductPromotion)object4).setDescription((String)object5);
                ((ArrayList)object3).add(object4);
            }
            arrayList = object3;
            recyclerView.setVisibility(0);
            object4 = recyclerView.getContext();
            object3 = new LinearLayoutManager((Context)object4, 0, false);
            recyclerView.setLayoutManager((RecyclerView$o)object3);
            newProductDetailsFragment = object2.Aa();
            bl3 = object2.c9();
            object = lg1_22.c;
            yi2_12 = lg1_22.b;
            h322 = new h32((t82_0)object, arrayList, newProductDetailsFragment, bl3, yi2_12, null);
            object3 = object2.la();
            Intrinsics.checkNotNull(object3);
            h322.j = d2 = ((Double)object3).doubleValue();
            object2 = object2.x5();
            if (object2 != null) {
                ((Product)object2).getCode();
            }
            h322.G(n10 != 0);
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            String string2 = "android_plp_offer";
            n3 = (int)(((ao0_0)object2).a(string2) ? 1 : 0);
            h322.k = n3;
            recyclerView.setAdapter(h322);
        } else {
            recyclerView.setVisibility(n15);
        }
    }
}

