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
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
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
 * Renamed from q71
 */
public final class q71_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ p71_0 a;

    public q71_0(p71_0 p71_02, f80_0 f80_02) {
        this.a = p71_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        p71_0 p71_02 = this.a;
        object = new q71_0(p71_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (q71_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((q71_0)object).invokeSuspend(object2);
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
        object2 = ((p71_0)object).k.getAdapter();
        if (object2 != null) {
            Object object3;
            boolean bl2;
            Object object4;
            int n3;
            object2 = ((p71_0)object).k.getLayoutManager();
            int n4 = -1;
            if (object2 != null && (n3 = object2 instanceof LinearLayoutManager) != 0) {
                object4 = object2;
                object4 = (LinearLayoutManager)object2;
                n3 = ((RecyclerView$o)object4).getChildCount();
                if (n3 > 0) {
                    try {
                        object2 = (LinearLayoutManager)object2;
                        n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
                    }
                    catch (Exception exception) {}
                }
            }
            if (bl2 = Intrinsics.areEqual(object2 = ((p71_0)object).f.name(), object4 = "Home")) {
                object2 = ((p71_0)object).k.getAdapter();
                object3 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.adapter.cms.HomeWidgetSubAdapter";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (j91)object2;
            } else {
                object2 = ((p71_0)object).k.getAdapter();
                object3 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.adapter.ProductWidgetSubAdapter";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (bb2_1)object2;
            }
            int n7 = ((p71_0)object).o;
            if (n4 > n7) {
                Object object5;
                HomeWidgetTypes homeWidgetTypes;
                int n8;
                int n10;
                object3 = new ArrayList();
                List list = ((p71_0)object).b;
                String string2 = null;
                list = list != null && (list = list.E(n10 = ((RecyclerView$B)object).getBindingAdapterPosition())) != null ? ((RecentlyViewedProducts)((Object)list)).getProducts() : null;
                Object object6 = list;
                object6 = list;
                if (object6 != null && (n10 = (int)(object6.isEmpty() ? 1 : 0)) == 0 && (n10 = ((p71_0)object).o) <= n4) {
                    while (true) {
                        int n14;
                        if (n10 < (n14 = list.size()) && (n14 = ((RecyclerView$f)object2).getItemViewType(n10)) != (n8 = (homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER).getType()) && n10 < (n14 = list.size()) && (object5 = (Product)CollectionsKt.N(n10, list)) != null) {
                            ((Product)object5).setPosition(n10);
                            ((ArrayList)object3).add(object5);
                        }
                        if (n10 == n4) break;
                        ++n10;
                    }
                }
                if (bl2 = object3.isEmpty() ^ true) {
                    int n15;
                    Object object7;
                    object2 = ((p71_0)object).f.name();
                    bl2 = Intrinsics.areEqual(object2, object4);
                    list = "";
                    n10 = 0;
                    object6 = null;
                    if (bl2) {
                        object2 = ((p71_0)object).q;
                        if (object2 != null && (object2 = ((HomeRowData)object2).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                            object2 = ((BannerData)object2).getWidgetLevel();
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object5 = "USER";
                        bl2 = Intrinsics.areEqual(object2, object5);
                        object2 = bl2 ? "user_level" : "dynamic";
                        object5 = ((p71_0)object).q;
                        if (object5 != null && (object5 = ((HomeRowData)object5).getBanners()) != null && (object5 = (BannerData)CollectionsKt.N(0, (List)object5)) != null) {
                            string2 = ((BannerData)object5).getFeedLogic();
                        }
                        object5 = ((p71_0)object).n;
                        n8 = ((RecyclerView$B)object).getBindingAdapterPosition();
                        object7 = new StringBuilder();
                        ((StringBuilder)object7).append((String)object2);
                        object2 = "_";
                        ((StringBuilder)object7).append((String)object2);
                        ((StringBuilder)object7).append(string2);
                        ((StringBuilder)object7).append((String)object2);
                        ((StringBuilder)object7).append((String)object5);
                        ((StringBuilder)object7).append((String)object2);
                        ((StringBuilder)object7).append(n8);
                        object2 = ((StringBuilder)object7).toString();
                        string2 = "landing screen";
                    } else {
                        object2 = ((p71_0)object).n;
                        if (object2 == null) {
                            object2 = list;
                        }
                        object2 = "pdp widget - ".concat((String)object2);
                        string2 = "pdp widget screen";
                    }
                    object5 = string2;
                    homeWidgetTypes = new Message();
                    ((Message)homeWidgetTypes).what = n15 = 1005;
                    object7 = new JSONObject();
                    String string3 = "productImpression";
                    object7.put(string3, object3);
                    object3 = "listName";
                    object7.put((String)object3, object2);
                    object7.put("sizeText", (Object)list);
                    object7.put("isPLP", false);
                    object7.put("screenName", (Object)string2);
                    object7.put("screenType", (Object)string2);
                    ((Message)homeWidgetTypes).obj = object7;
                    object2 = ((p71_0)object).f.name();
                    bl2 = Intrinsics.areEqual(object2, object4);
                    if (bl2) {
                        ((p71_0)object).l.sendMessage((Message)homeWidgetTypes);
                        object2 = ((p71_0)object).l;
                        object4 = ((p71_0)object).c;
                        ((AnalyticsGAEventHandlerMultipleWidget)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object4);
                    } else {
                        ((p71_0)object).m.sendMessage((Message)homeWidgetTypes);
                        object2 = ((p71_0)object).m;
                        object4 = ((p71_0)object).c;
                        ((AnalyticsGAEventHandlerMultipleWidget)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object4);
                    }
                }
                ((p71_0)object).o = ++n4;
            }
        }
        return Unit.a;
    }
}

