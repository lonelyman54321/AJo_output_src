/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from W71
 */
public final class w71_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ v71_0 a;

    public w71_0(v71_0 v71_02, f80_0 f80_02) {
        this.a = v71_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        v71_0 v71_02 = this.a;
        object = new w71_0(v71_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (w71_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((w71_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((v71_0)object).j.getAdapter();
        if (object2 != null) {
            Object object3;
            int n3;
            object2 = ((v71_0)object).j.getLayoutManager();
            int n4 = -1;
            if (object2 != null && (n3 = object2 instanceof LinearLayoutManager) != 0) {
                object3 = object2;
                object3 = (LinearLayoutManager)object2;
                n3 = ((RecyclerView$o)object3).getChildCount();
                if (n3 > 0) {
                    try {
                        object2 = (LinearLayoutManager)object2;
                        n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
                    }
                    catch (Exception exception) {}
                }
            }
            object2 = ((v71_0)object).j.getAdapter();
            object3 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.adapter.cms.HomeWidgetSubAdapter";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (j91)object2;
            n3 = ((v71_0)object).n;
            if (n4 > n3) {
                boolean bl2;
                Object object4;
                int n7;
                int n8;
                object3 = new ArrayList();
                Object object5 = ((v71_0)object).b;
                if (object5 != null && (object5 = object5.E(n8 = ((RecyclerView$B)object).getBindingAdapterPosition())) != null) {
                    object5 = ((RecentlyViewedProducts)object5).getProducts();
                } else {
                    n7 = 0;
                    object5 = null;
                }
                Object object6 = object5;
                object6 = (Collection)object5;
                if (object6 != null && (n8 = (int)(object6.isEmpty() ? 1 : 0)) == 0 && (n8 = ((v71_0)object).n) <= n4) {
                    while (true) {
                        HomeWidgetTypes homeWidgetTypes;
                        int n10;
                        int n14;
                        if (n8 < (n14 = object5.size()) && (n14 = ((j91)object2).getItemViewType(n8)) != (n10 = (homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER).getType()) && n8 < (n14 = object5.size()) && (object4 = (Product)CollectionsKt.N(n8, (List)object5)) != null) {
                            ((Product)object4).setPosition(n8);
                            ((ArrayList)object3).add(object4);
                        }
                        if (n8 == n4) break;
                        ++n8;
                    }
                }
                if (bl2 = object3.isEmpty() ^ true) {
                    object2 = new Message();
                    ((Message)object2).what = n7 = 1005;
                    object5 = new JSONObject();
                    object5.put("productImpression", object3);
                    object3 = ((v71_0)object).l;
                    object4 = "landing screen - ";
                    object6 = new StringBuilder((String)object4);
                    ((StringBuilder)object6).append((String)object3);
                    object3 = ((StringBuilder)object6).toString();
                    object5.put("listName", object3);
                    object5.put("sizeText", (Object)"");
                    n8 = 0;
                    object5.put("isPLP", false);
                    object6 = "landing screen";
                    object5.put("screenName", object6);
                    object5.put("screenType", object6);
                    ((Message)object2).obj = object5;
                    ((v71_0)object).k.sendMessage((Message)object2);
                    object2 = ((v71_0)object).k;
                    object3 = ((v71_0)object).c;
                    ((AnalyticsGAEventHandlerMultipleWidget)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
                }
                ((v71_0)object).n = ++n4;
            }
        }
        return Unit.a;
    }
}

