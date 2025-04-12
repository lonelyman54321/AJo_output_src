/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.RecyclerView$y;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Ji2
 */
public final class ji2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final q82_0 b;
    public final yi2_1 c;
    public final ArrayList d;
    public final View e;
    public final LinearLayoutManager f;
    public final RecyclerView g;
    public final View h;
    public final View i;
    public final AjioTextView j;
    public final AjioImageView k;
    public final AjioImageView l;
    public int m;
    public K12 n;
    public int o;
    public final Ji2$b p;

    public ji2_1(View view, q82_0 q82_02, yi2_1 yi2_12, ArrayList arrayList) {
        String string2;
        Object object;
        ji2_1 ji2_12 = this;
        Object object2 = view;
        Object object3 = q82_02;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(q82_02, "onColorClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super(view);
        this.a = view;
        this.b = q82_02;
        this.c = yi2_12;
        object3 = arrayList;
        this.d = arrayList;
        object3 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        String string3 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp().getPrevScreenType();
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.e = view;
        int n3 = R$id.pdp_rv_color;
        this.g = object3 = (RecyclerView)view.findViewById(n3);
        Object object4 = view.getContext();
        this.f = object3 = new LinearLayoutManager((Context)object4, 0, false);
        object3 = this.g;
        object4 = "mColorRv";
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object3 = null;
        }
        if ((object = ji2_12.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorLayoutManager");
            object = null;
        }
        ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
        n3 = R$id.color_top_divider;
        object3 = object2.findViewById(n3);
        ji2_12.h = object3;
        n3 = R$id.pdp_color_layout;
        object3 = object2.findViewById(n3);
        ji2_12.i = object3;
        n3 = R$id.pdp_tv_selected_color;
        object3 = (AjioTextView)object2.findViewById(n3);
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedColorTv");
            n3 = 0;
            object3 = null;
        }
        ai0_2.i((View)object3);
        n3 = R$id.pdp_tv_title;
        ji2_12.j = object3 = (AjioTextView)object2.findViewById(n3);
        object = "titleTV";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n3 = 0;
            object3 = null;
        }
        Object object6 = h40_0.a;
        object6 = z40_0.Companion;
        object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a.d("pdp_to_bag_conversation_json");
        boolean bl2 = object6.has(string2 = "pdp_oos_scenario_title");
        if (bl2) {
            object6 = object6.getString(string2);
            string2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object6, string2);
        } else {
            int n4 = R$string.pdp_oos_other_colour;
            object6 = hv3_0.K(n4);
        }
        object3.setText((CharSequence)object6);
        object3 = ji2_12.j;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n3 = 0;
            object3 = null;
        }
        ai0_2.t((View)object3);
        n3 = (int)(h40_0.s1() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(og1_1.c() ? 1 : 0)) == 0) {
            n3 = R$id.pdp_Imv_prev_color;
            object3 = (AjioImageView)object2.findViewById(n3);
            ji2_12.k = object3;
            n3 = R$id.pdp_Imv_next_color;
            object2 = (AjioImageView)object2.findViewById(n3);
            ji2_12.l = object2;
        }
        if ((object2 = ji2_12.g) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        }
        ((RecyclerView)object2).clearOnScrollListeners();
        object2 = ji2_12.g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object5 = object2;
        }
        object2 = new ii2_1(ji2_12);
        ((RecyclerView)object5).addOnScrollListener((RecyclerView$s)object2);
        object2 = GAUtils.Companion;
        object3 = yi2_12.x5();
        Bundle bundle = ((GAUtils$Companion)object2).getPDPBundleData((Product)object3);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "product details interactions", "oos more color widget", "seen", "product_details_interactions", "pdp screen", "pdp screen", null, bundle, string3, false, null, 1600, null);
        new Ji2$a(ji2_12);
        ji2_12.p = object2 = new Object();
    }

    public static final void w(ji2_1 ji2_12) {
        boolean n3;
        Object object = ji2_12.d;
        if (object != null && !(n3 = object.isEmpty())) {
            int n4;
            String string2;
            Object object2;
            Product product;
            int n7;
            Object object3 = new ArrayList();
            int n8 = ((ArrayList)object).size();
            for (n7 = 0; n7 < n8; ++n7) {
                product = new Product();
                object2 = ji2_12.c.x5();
                if (object2 != null) {
                    product = ((Product)object2).clone();
                }
                object2 = ((ProductOptionVariant)((ArrayList)object).get(n7)).getCode();
                product.setCode((String)object2);
                object2 = product.getFnlColorVariantData();
                if (object2 != null) {
                    string2 = ((ProductOptionVariant)((ArrayList)object).get(n7)).getCode();
                    ((ProductFnlColorVariantData)object2).setColorGroup(string2);
                }
                object2 = ((ProductOptionVariant)((ArrayList)object).get(n7)).getPriceData();
                product.setPrice((Price)object2);
                object2 = ((ProductOptionVariant)((ArrayList)object).get(n7)).getWasPriceData();
                product.setWasPriceData((Price)object2);
                ((ArrayList)object3).add(product);
            }
            object = ji2_12.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mColorLayoutManager");
                n4 = 0;
                object = null;
            }
            if ((n4 = ((LinearLayoutManager)object).findLastVisibleItemPosition()) > (n8 = ji2_12.o)) {
                int n10;
                int n14;
                int n15;
                Object object4 = new ArrayList();
                n7 = ji2_12.o;
                if (n7 <= n4) {
                    while (true) {
                        if (n7 < (n15 = ((ArrayList)object3).size())) {
                            ((Product)((ArrayList)object3).get(n7)).setPosition(n7);
                            product = ((ArrayList)object3).get(n7);
                            object2 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(product, (String)object2);
                            ((ArrayList)object4).add(product);
                        }
                        if (n7 == n4) break;
                        ++n7;
                    }
                }
                if ((n14 = (n10 = ((ArrayList)object4).isEmpty()) ^ (n7 = 1)) != 0) {
                    object3 = new Message();
                    ((Message)object3).what = n15 = 1001;
                    product = new JSONObject();
                    product.put("productImpression", object4);
                    object2 = "PDP - OOS - Other Colours";
                    product.put("listName", object2);
                    string2 = "NA";
                    product.put("sizeText", string2);
                    product.put("isPLP", n7 != 0);
                    product.put("screenName", object2);
                    product.put("screenType", object2);
                    ((Message)object3).obj = product;
                    object3 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object3);
                    object4 = ji2_12.p;
                    ((AnalyticsGAEventHandler)((Object)object3)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object4);
                }
                ji2_12.o = n4 += n7;
            }
        }
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
    }

    public final void x() {
        int n3;
        LinearLayoutManager linearLayoutManager = this.f;
        View view = this.i;
        RecyclerView recyclerView = this.g;
        Object object = this.d;
        if (object == null) {
            return;
        }
        this.m = n3 = ((ArrayList)object).size();
        Object object2 = new ArrayList();
        ((ArrayList)object2).addAll(object);
        int n4 = ((ArrayList)object2).size();
        Object object3 = "colorLayout";
        if (n4 > 0) {
            int n7;
            int n8;
            object = this.n;
            String string2 = "mColorRv";
            if (object == null) {
                Object object4 = this.b;
                yi2_1 yi2_12 = this.c;
                this.n = object = new K12((q82_0)object4, (ArrayList)object2, yi2_12);
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                } else {
                    object = recyclerView;
                }
                object4 = this.n;
                ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
                object = h40_0.a;
                n4 = (int)(h40_0.s1() ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object = null;
                    } else {
                        object = recyclerView;
                    }
                    object4 = new ki2_0(this);
                    ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object4);
                }
            } else {
                ((K12)object).b = object2;
                ((RecyclerView$f)object).notifyDataSetChanged();
            }
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n8 = 0;
                view = null;
            }
            object = null;
            view.setVisibility(0);
            n8 = -1;
            for (n4 = 0; n4 < (n7 = ((ArrayList)object2).size()); ++n4) {
                object3 = (ProductOptionVariant)((ArrayList)object2).get(n4);
                n7 = (int)(((ProductOptionVariant)object3).isSelected() ? 1 : 0);
                if (n7 == 0) continue;
                n8 = n4;
            }
            object = h40_0.a;
            n4 = (int)(h40_0.s1() ? 1 : 0);
            object2 = "mColorLayoutManager";
            if (n4 != 0 && (n4 = (int)(og1_1.c() ? 1 : 0)) == 0) {
                if (n8 >= 0) {
                    if (linearLayoutManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        boolean bl2 = false;
                        linearLayoutManager = null;
                    }
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        recyclerView = null;
                    }
                    object = new RecyclerView$y();
                    linearLayoutManager.smoothScrollToPosition(recyclerView, (RecyclerView$y)object, n8);
                }
            } else {
                if (linearLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    boolean bl3 = false;
                    linearLayoutManager = null;
                }
                linearLayoutManager.scrollToPosition(n8);
            }
        } else {
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                boolean bl4 = false;
                view = null;
            }
            int n10 = 8;
            view.setVisibility(n10);
        }
    }
}

