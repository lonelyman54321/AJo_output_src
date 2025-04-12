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
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.options.CuratedWidget;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from m71
 */
public final class m71_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ HomeCuratedWidgetVH a;

    public m71_0(HomeCuratedWidgetVH homeCuratedWidgetVH, f80_0 f80_02) {
        this.a = homeCuratedWidgetVH;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        HomeCuratedWidgetVH homeCuratedWidgetVH = this.a;
        object = new m71_0(homeCuratedWidgetVH, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (m71_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((m71_0)object).invokeSuspend(object2);
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
        object2 = ((HomeCuratedWidgetVH)object).k.getAdapter();
        if (object2 != null) {
            Object object3;
            boolean bl2;
            Object object4;
            int n3;
            object2 = ((HomeCuratedWidgetVH)object).k.getLayoutManager();
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
            if (bl2 = Intrinsics.areEqual(object2 = ((HomeCuratedWidgetVH)object).g.name(), object4 = "Home")) {
                object2 = ((HomeCuratedWidgetVH)object).k.getAdapter();
                object3 = "null cannot be cast to non-null type com.ril.ajio.home.landingpage.adapter.cms.HomeCuratedWidgetSubAdapter";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (i71)object2;
            } else {
                object2 = ((HomeCuratedWidgetVH)object).k.getAdapter();
                object3 = "null cannot be cast to non-null type com.ril.ajio.pdprefresh.adapter.CuratedWidgetSubAdapter";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (ze0_2)object2;
            }
            int n7 = ((HomeCuratedWidgetVH)object).o;
            if (n4 > n7) {
                Object object5;
                Object object6;
                int n8;
                int n10;
                int n14;
                object3 = new ArrayList();
                ArrayList arrayList = ((HomeCuratedWidgetVH)object).b;
                String string2 = null;
                arrayList = arrayList != null && (arrayList = arrayList.H(n14 = ((RecyclerView$B)object).getBindingAdapterPosition())) != null ? ((CuratedWidget)((Object)arrayList)).getCuratedWidgetItemList() : null;
                String string3 = "";
                if (arrayList != null && (n10 = arrayList.isEmpty()) == 0 && (n10 = ((HomeCuratedWidgetVH)object).o) <= n4) {
                    while (true) {
                        int n15;
                        if (n10 < (n15 = arrayList.size()) && (n15 = ((RecyclerView$f)object2).getItemViewType(n10)) != (n8 = ((HomeWidgetTypes)((Object)(object6 = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER))).getType()) && n10 < (n15 = arrayList.size()) && (object5 = (CuratedWidgetItem)CollectionsKt.N(n10, arrayList)) != null) {
                            ((CuratedWidgetItem)object5).setPosition(n10);
                            object6 = ((HomeCuratedWidgetVH)object).q;
                            if (object6 == null || (object6 = ((HomeRowData)object6).getComponentName()) == null) {
                                object6 = ((HomeCuratedWidgetVH)object).q;
                                if (object6 != null) {
                                    object6 = ((HomeRowData)object6).getHeading();
                                } else {
                                    n8 = 0;
                                    object6 = null;
                                }
                                if (object6 == null) {
                                    object6 = string3;
                                }
                            }
                            ((CuratedWidgetItem)object5).setWidgetName((String)object6);
                            ((ArrayList)object3).add(object5);
                        }
                        if (n10 == n4) break;
                        ++n10;
                    }
                }
                if (bl2 = object3.isEmpty() ^ true) {
                    object2 = ((HomeCuratedWidgetVH)object).g.name();
                    bl2 = Intrinsics.areEqual(object2, object4);
                    arrayList = null;
                    if (bl2) {
                        object2 = ((HomeCuratedWidgetVH)object).q;
                        if (object2 != null && (object2 = ((HomeRowData)object2).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null) {
                            string2 = ((BannerData)object2).getFeedLogic();
                        }
                        object2 = ((HomeCuratedWidgetVH)object).n;
                        n10 = ((RecyclerView$B)object).getBindingAdapterPosition();
                        object5 = "curated_";
                        object6 = "_";
                        object2 = og_1.a((String)object5, string2, (String)object6, (String)object2, (String)object6);
                        ((StringBuilder)object2).append(n10);
                        object2 = ((StringBuilder)object2).toString();
                        string2 = "home landing screen";
                    } else {
                        object2 = ((HomeCuratedWidgetVH)object).n;
                        if (object2 == null) {
                            object2 = string3;
                        }
                        object2 = "pdp widget - ".concat((String)object2);
                        string2 = "pdp widget screen";
                    }
                    object5 = new Message();
                    ((Message)object5).what = n8 = 1007;
                    object6 = new JSONObject();
                    String string4 = "curatedWidgetOptionImpression";
                    object6.put(string4, object3);
                    int n16 = ((RecyclerView$B)object).getBindingAdapterPosition();
                    object6.put("rowPosition", n16);
                    object3 = "listName";
                    object6.put((String)object3, object2);
                    object6.put("sizeText", (Object)string3);
                    object6.put("isPLP", false);
                    object6.put("screenName", (Object)string2);
                    object6.put("screenType", (Object)string2);
                    ((Message)object5).obj = object6;
                    object2 = ((HomeCuratedWidgetVH)object).g.name();
                    bl2 = Intrinsics.areEqual(object2, object4);
                    if (bl2) {
                        ((HomeCuratedWidgetVH)object).l.sendMessage((Message)object5);
                        object2 = ((HomeCuratedWidgetVH)object).l;
                        object4 = ((HomeCuratedWidgetVH)object).f;
                        ((AnalyticsGAEventHandlerMultipleWidget)((Object)object2)).setOnGACuratedWidgetEventHandlerListener((OnGACuratedWidgetEventHandlerListener)object4);
                    } else {
                        ((HomeCuratedWidgetVH)object).m.sendMessage((Message)object5);
                        object2 = ((HomeCuratedWidgetVH)object).m;
                        object4 = ((HomeCuratedWidgetVH)object).f;
                        ((AnalyticsGAEventHandlerMultipleWidget)((Object)object2)).setOnGACuratedWidgetEventHandlerListener((OnGACuratedWidgetEventHandlerListener)object4);
                    }
                }
                ((HomeCuratedWidgetVH)object).o = ++n4;
            }
        }
        return Unit.a;
    }
}

