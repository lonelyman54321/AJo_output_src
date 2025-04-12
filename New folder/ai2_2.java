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
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from ai2
 */
public final class ai2_2
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final s82_0 c;
    public final v82_0 d;
    public final View e;
    public final View f;
    public final RecyclerView g;
    public final TextView h;
    public LinearLayoutManager i;
    public int j;
    public final zi2_1 k;
    public boolean l;
    public float m;
    public final ai2$a_0 n;

    public ai2_2(View object, yi2_1 object2, s82_0 object3, v82_0 v82_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object3, "onProductClickListener");
        String string2 = "onCrossSellClickListener";
        Intrinsics.checkNotNullParameter(v82_02, string2);
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = v82_02;
        object3 = AnalyticsManager.Companion.getInstance();
        ((AnalyticsManager)object3).getNewEEcommerceEventsRevamp();
        this.k = object2 = object2.Aa();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.e = object;
        int n3 = R$id.parent_recently_viewed;
        object2 = object.findViewById(n3);
        this.f = object2;
        n3 = R$id.pdo_rv_recently_viewed;
        this.g = object2 = (RecyclerView)object.findViewById(n3);
        n3 = R$id.rv_title;
        object2 = (TextView)object.findViewById(n3);
        if (object2 != null) {
            this.h = object2;
            object = object.getContext();
            int n4 = R$string.best_paired_with;
            object = object.getString(n4);
            object2.setText((CharSequence)object);
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCrossSellTv");
                object = null;
            }
            ai0_2.t(object);
        }
        super(this);
        this.n = object;
    }

    public final void w(int n3) {
        int n4 = -1;
        if (n3 > n4) {
            Object object = this.g;
            if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                n4 = ((RecyclerView$f)object).getItemCount();
            } else {
                n4 = 0;
                object = null;
            }
            if (n3 < n4 && (object = this.g) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
                ((RecyclerView$f)object).notifyItemChanged(n3);
            }
        }
    }

    public final void x(List object) {
        boolean bl2;
        int n3;
        int n4;
        Object object2 = this.i;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
        } else {
            n4 = -1;
        }
        Object object3 = new ArrayList();
        int n7 = 1;
        if (object != null && n4 >= (n3 = this.j)) {
            ArrayList<Product> arrayList = new ArrayList<Product>();
            int n8 = this.j;
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
            this.j = n4 += n7;
        }
        if (bl2 = object3.isEmpty() ^ n7) {
            object = new Message();
            ((Message)object).what = n4 = 1001;
            object2 = new JSONObject();
            object2.put("productImpression", object3);
            object2.put("listName", (Object)"pdp-cross-sell- best paired");
            object2.put("sizeText", (Object)"NA");
            n7 = 0;
            object2.put("isPLP", false);
            String string2 = "pdp screen";
            object2.put("screenName", (Object)string2);
            object3 = "screenType";
            object2.put((String)object3, (Object)string2);
            ((Message)object).obj = object2;
            object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object);
            object2 = this.n;
            ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void y(ArrayList var1_1, ArrayList var2_2) {
        block14: {
            var3_3 = null;
            if (var1_1 == null || (var4_4 = var1_1.size()) == 0) break block14;
            var5_5 = this.i;
            if (var5_5 == null) ** GOTO lbl-1000
            var5_5 = this.g;
            if (var5_5 != null) {
                var5_5 = var5_5.getAdapter();
            } else {
                var4_4 = 0;
                var5_5 = null;
            }
            if (var5_5 != null) {
                var2_2 = this.g;
                if (var2_2 != null) {
                    var3_3 = var2_2.getAdapter();
                }
                var2_2 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.CrossSellListAdapter";
                Intrinsics.checkNotNull(var3_3, (String)var2_2);
                var3_3 = (ke0_2)var3_3;
                var3_3.notifyDataSetChanged();
            } else lbl-1000:
            // 2 sources

            {
                if ((var6_6 = this.e) != null) {
                    var3_3 = var6_6.getContext();
                }
                Intrinsics.checkNotNull(var3_3);
                var6_6 = null;
                this.i = var5_5 = new LinearLayoutManager((Context)var3_3, 0, false);
                var3_3 = this.g;
                if (var3_3 != null) {
                    var3_3.setNestedScrollingEnabled(false);
                }
                if ((var3_3 = this.g) != null) {
                    var5_5 = this.i;
                    var3_3.setLayoutManager((RecyclerView$o)var5_5);
                }
                if ((var3_3 = this.f) != null) {
                    var3_3.setVisibility(0);
                }
                var5_5 = this.b;
                var7_7 = var5_5.c9();
                var8_8 = this.c;
                var9_9 = this.d;
                var3_3 = new ke0_2(var8_8, var9_9, (List)var1_1, (List)var2_2, var7_7);
                var2_2 = this.g;
                if (var2_2 != null) {
                    var2_2.setAdapter((RecyclerView$f)var3_3);
                }
                if ((var2_2 = this.g) != null) {
                    var2_2.clearOnScrollListeners();
                }
                if ((var2_2 = this.g) != null) {
                    var3_3 = new ai2$b(this, (ArrayList)var1_1);
                    var2_2.addOnScrollListener((RecyclerView$s)var3_3);
                }
            }
            var3_3 = Looper.getMainLooper();
            var2_2 = new Handler((Looper)var3_3);
            var3_3 = new Zh2(this, (ArrayList)var1_1);
            var2_2.postDelayed((Runnable)var3_3, 500L);
            return;
        }
        var1_1 = this.g;
        if (var1_1 != null) {
            var1_1.setAdapter(null);
        }
        if ((var1_1 = this.f) != null) {
            var10_10 = 8;
            var1_1.setVisibility(var10_10);
        }
    }
}

