/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.view.View
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.WidgetRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Xi2
 */
public final class xi2_1
extends RecyclerView$B
implements x82_0 {
    public final View a;
    public final yi2_1 b;
    public final hy0_0 c;
    public final View d;
    public final View e;
    public final RecyclerView f;
    public LinearLayoutManager g;
    public int h;
    public final zi2_1 i;
    public final NewEEcommerceEventsRevamp j;
    public boolean k;
    public float l;
    public final xi2$a_0 m;

    public xi2_1(View object, yi2_1 object2, hy0_0 hy0_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(object2, string2);
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = hy0_02;
        this.i = object2 = object2.Aa();
        this.j = object2 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
        ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.d = object;
        int n3 = R$id.parent_recently_viewed;
        object2 = object.findViewById(n3);
        this.e = object2;
        n3 = R$id.pdo_rv_recently_viewed;
        this.f = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.rv_title;
        object = (TextView)object.findViewById(n3);
        if (object != null) {
            ai0_2.t(object);
        }
        super();
        this.m = object;
    }

    public final void d(String string2, Product product, int n3, HomeRowData homeRowData) {
        Intrinsics.checkNotNullParameter(string2, "productColorGroup");
        Intrinsics.checkNotNullParameter(product, "clickedProduct");
        this.i.O1(product, n3, string2);
    }

    public final void h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "ctaLink");
    }

    public final void o(WidgetRecord widgetRecord, boolean bl2) {
        Intrinsics.checkNotNullParameter(widgetRecord, "widgetRecord");
    }

    public final void w(List object) {
        boolean bl2;
        int n3;
        int n4;
        Object object2 = this.g;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
        } else {
            n4 = -1;
        }
        Object object3 = new ArrayList();
        int n7 = 1;
        if (object != null && n4 >= (n3 = this.h)) {
            ArrayList<Product> arrayList = new ArrayList<Product>();
            int n8 = this.h;
            if (n8 <= n4) {
                while (true) {
                    int n10;
                    if (n8 < (n10 = object.size())) {
                        ((Product)object.get(n8)).setPosition(n8);
                        Product product = (Product)object.get(n8);
                        n10 = (int)(product.isGaFiredInCurrentSession() ? 1 : 0);
                        if (n10 == 0) {
                            product = object.get(n8);
                            arrayList.add(product);
                            product = object.get(n8);
                            ((ArrayList)object3).add(product);
                            product = (Product)object.get(n8);
                            product.setGaFiredInCurrentSession(n7 != 0);
                        }
                    }
                    if (n8 == n4) break;
                    ++n8;
                }
            }
            this.h = n4 += n7;
        }
        if (bl2 = object3.isEmpty() ^ n7) {
            object = new Message();
            ((Message)object).what = n4 = 1001;
            object2 = new JSONObject();
            object2.put("productImpression", object3);
            object3 = this.j.getPDP_RECENTLY_VIEWED();
            object2.put("listName", object3);
            object2.put("sizeText", (Object)"NA");
            n7 = 0;
            object2.put("isPLP", false);
            object2.put("screenName", (Object)"pdp screen - recently viewed widget");
            object3 = "screenType";
            String string2 = "pdp screen";
            object2.put((String)object3, (Object)string2);
            ((Message)object).obj = object2;
            object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object);
            object2 = this.m;
            ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(ArrayList var1_1, ArrayList var2_2) {
        block14: {
            var3_3 = null;
            if (var1_1 == null || (var4_4 = var1_1.size()) == 0) break block14;
            var1_1.size();
            var5_5 = this.g;
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = this.f;
            if (var5_5 != null) {
                var5_5 = var5_5.getAdapter();
            } else {
                var4_4 = 0;
                var5_5 = null;
            }
            if (var5_5 != null) {
                var5_5 = this.f;
                if (var5_5 != null) {
                    var3_3 = var5_5.getAdapter();
                }
                var5_5 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.adapter.NewRecentlyViewedListAdapter";
                Intrinsics.checkNotNull(var3_3, (String)var5_5);
                var3_3 = (i32_0)var3_3;
                var3_3.g((List)var1_1, var2_2);
                var3_3.notifyDataSetChanged();
            } else lbl-1000:
            // 2 sources

            {
                if ((var6_6 /* !! */  = this.d) != null) {
                    var3_3 = var6_6 /* !! */ .getContext();
                }
                Intrinsics.checkNotNull(var3_3);
                var6_6 /* !! */  = null;
                this.g = var5_5 = new LinearLayoutManager((Context)var3_3, 0, false);
                var3_3 = this.f;
                if (var3_3 != null) {
                    var3_3.setNestedScrollingEnabled(false);
                }
                if ((var3_3 = this.f) != null) {
                    var5_5 = this.g;
                    var3_3.setLayoutManager((RecyclerView$o)var5_5);
                }
                if ((var3_3 = this.e) != null) {
                    var3_3.setVisibility(0);
                }
                var5_5 = this.b;
                var6_6 /* !! */  = this.c;
                var3_3 = new i32_0(this, (yi2_1)var5_5, (hy0_0)var6_6 /* !! */ );
                var3_3.g((List)var1_1, var2_2);
                Intrinsics.checkNotNullParameter(this, "onRecentlyViewedClickListener");
                var3_3.a = this;
                var1_1 = this.f;
                if (var1_1 != null) {
                    var1_1.setAdapter((RecyclerView$f)var3_3);
                }
                if ((var1_1 = this.f) != null) {
                    var1_1.clearOnScrollListeners();
                }
                if ((var1_1 = this.f) != null) {
                    var3_3 = new Xi2$b(this, var2_2);
                    var1_1.addOnScrollListener((RecyclerView$s)var3_3);
                }
            }
            var3_3 = Looper.getMainLooper();
            var1_1 = new Handler((Looper)var3_3);
            var3_3 = new wi2_1(this, var2_2);
            var1_1.postDelayed((Runnable)var3_3, 500L);
            return;
        }
        var1_1 = this.f;
        if (var1_1 != null) {
            var1_1.setAdapter(null);
        }
        if ((var1_1 = this.e) != null) {
            var7_7 = 8;
            var1_1.setVisibility(var7_7);
        }
    }
}

