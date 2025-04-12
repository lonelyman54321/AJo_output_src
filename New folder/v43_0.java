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
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from V43
 */
public final class v43_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ u43_0 a;

    public v43_0(u43_0 u43_02, f80_0 f80_02) {
        this.a = u43_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        u43_0 u43_02 = this.a;
        object = new v43_0(u43_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (v43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((v43_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((u43_0)object).i.getAdapter();
        if (object2 != null) {
            Object object3;
            int n3;
            int n4;
            Object object4;
            int n7;
            AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget;
            block12: {
                object2 = ((u43_0)object).i.getLayoutManager();
                analyticsGAEventHandlerMultipleWidget = null;
                if (object2 != null && (n7 = object2 instanceof LinearLayoutManager) != 0) {
                    object4 = object2;
                    object4 = (LinearLayoutManager)object2;
                    n7 = ((RecyclerView$o)object4).getChildCount();
                    if (n7 > 0) {
                        try {
                            object2 = (LinearLayoutManager)object2;
                        }
                        catch (Exception exception) {}
                        n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
                        break block12;
                    }
                }
                n4 = 0;
                object2 = null;
            }
            object4 = ((u43_0)object).i.getAdapter();
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.adapter.ProductWidgetSubAdapter");
            object4 = (bb2_1)object4;
            Object object5 = new ArrayList();
            List list = ((u43_0)object).b;
            list = list != null && (list = list.E(n3 = ((RecyclerView$B)object).getBindingAdapterPosition())) != null ? ((RecentlyViewedProducts)((Object)list)).getProducts() : null;
            Object object6 = list;
            object6 = list;
            if (object6 != null && (n3 = (int)(object6.isEmpty() ? 1 : 0)) == 0 && (n3 = ((u43_0)object).l) <= n4) {
                while (true) {
                    int n8;
                    Object object7;
                    int n10;
                    if (n3 < (n10 = list.size()) && (n10 = (int)(((ArrayList)(object3 = ((u43_0)object).m)).contains(object7 = new Integer(n3)) ? 1 : 0)) == 0 && (n10 = ((bb2_1)object4).getItemViewType(n3)) != (n8 = ((HomeWidgetTypes)((Object)(object7 = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER))).getType()) && n3 >= 0 && n3 < (n10 = object5.size())) {
                        object3 = ((u43_0)object).m;
                        object7 = new Integer(n3);
                        ((ArrayList)object3).add(object7);
                        object3 = (Product)CollectionsKt.N(n3, list);
                        if (object3 != null) {
                            ((Product)object3).setPosition(n3);
                            ((ArrayList)object5).add(object3);
                        }
                    }
                    if (n3 == n4) break;
                    ++n3;
                }
            }
            if ((n7 = object5.isEmpty() ^ 1) != 0) {
                object4 = ((u43_0)object).k;
                list = "Similar Products";
                if (object4 != null && (n7 = object4.length()) != 0 && (object4 = ((u43_0)object).k) != null) {
                    list = object4;
                }
                object4 = "pdp widget-".concat((String)((Object)list));
                list = new Message();
                ((Message)list).what = n3 = 1008;
                object6 = new JSONObject();
                object3 = "similarProductImpression";
                object6.put((String)object3, object5);
                object6.put("listName", object4);
                object5 = "";
                object6.put("sizeText", object5);
                object6.put("isPLP", false);
                object4 = "pdp widget screen";
                object6.put("screenName", object4);
                object6.put("screenType", object4);
                ((Message)list).obj = object6;
                ((u43_0)object).j.sendMessage((Message)list);
                analyticsGAEventHandlerMultipleWidget = ((u43_0)object).j;
                object4 = ((u43_0)object).c;
                analyticsGAEventHandlerMultipleWidget.setOnGAEventHandlerListener((OnGAEventHandlerListener)object4);
            }
            ((u43_0)object).l = ++n4;
        }
        return Unit.a;
    }
}

