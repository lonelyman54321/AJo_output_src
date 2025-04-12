/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONObject;

/*
 * Renamed from rY1
 */
public final class ry1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ oy1_1 a;

    public ry1_2(oy1_1 oy1_12, f80_0 f80_02) {
        this.a = oy1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        oy1_1 oy1_12 = this.a;
        object = new ry1_2(oy1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ry1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ry1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        int n4;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((oy1_1)object).s;
        boolean bl2 = false;
        Object object3 = null;
        if (object2 != null) {
            object2 = ((RecyclerView)object2).getLayoutManager();
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = object2 instanceof GridLayoutManager) != 0) {
            object2 = (GridLayoutManager)object2;
            n4 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
        } else {
            n4 = -1;
        }
        Object object4 = ((oy1_1)object).s;
        if (object4 != null && (n3 = (object4 = ((RecyclerView)object4).getAdapter()) instanceof tx1_0) != 0) {
            object4 = ((oy1_1)object).s;
            if (object4 != null) {
                object4 = ((RecyclerView)object4).getAdapter();
            } else {
                n3 = 0;
                object4 = null;
            }
            Object object5 = "null cannot be cast to non-null type com.ril.ajio.closet.adapter.NewClosetAdapter";
            Intrinsics.checkNotNull(object4, (String)object5);
            object4 = (tx1_0)object4;
            int n7 = ((oy1_1)object).C;
            if (n4 > n7) {
                int n8;
                object5 = new ArrayList();
                Object object6 = ((oy1_1)object).Qa().y;
                if (object6 != null && (n8 = ((ArrayList)object6).isEmpty()) == 0 && (n8 = ((oy1_1)object).C) <= n4) {
                    while (true) {
                        int n10;
                        int n14;
                        if ((n14 = ((tx1_0)object4).getItemViewType(n8)) == (n10 = 6) || n14 == (n10 = 7)) {
                            Ref$IntRef ref$IntRef = new Ref$IntRef();
                            ref$IntRef.element = n8;
                            n10 = ((ArrayList)object6).size();
                            if (n8 < n10) {
                                n10 = ref$IntRef.element;
                                ((Product)((ArrayList)object6).get(n10)).setPosition(n8);
                                Object object7 = h40_0.a;
                                n10 = (int)(h40_0.c2() ? 1 : 0);
                                if (n10 != 0) {
                                    n10 = ref$IntRef.element;
                                    object7 = (Product)CollectionsKt.N(n10, (List)object6);
                                    if (object7 != null) {
                                        object7 = ((Product)object7).getAverageRating();
                                    } else {
                                        n10 = 0;
                                        object7 = null;
                                    }
                                    int n15 = ref$IntRef.element;
                                    Object object8 = (Product)CollectionsKt.N(n15, (List)object6);
                                    if (object8 != null) {
                                        object8 = ((Product)object8).getNumUserRatings();
                                    } else {
                                        n15 = 0;
                                        object8 = null;
                                    }
                                    qy1_1 qy1_12 = new qy1_1((ArrayList)object6, ref$IntRef);
                                    ai0_2.r(qy1_12, object7, object8);
                                }
                                n14 = ref$IntRef.element;
                                ref$IntRef = ((ArrayList)object6).get(n14);
                                ((ArrayList)object5).add(ref$IntRef);
                            }
                        }
                        if (n8 == n4) break;
                        ++n8;
                    }
                }
                if (bl2 = ((ArrayList)object5).isEmpty() ^ true) {
                    object3 = new Message();
                    ((Message)object3).what = n3 = 1001;
                    object4 = new JSONObject();
                    object4.put("productImpression", object5);
                    object4.put("listName", (Object)"Closet List");
                    object4.put("sizeText", (Object)"");
                    object4.put("isPLP", false);
                    object6 = "closet screen";
                    object4.put("screenName", object6);
                    object5 = "screenType";
                    object4.put((String)object5, object6);
                    ((Message)object3).obj = object4;
                    object3 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object3);
                    object4 = ((oy1_1)object).q0;
                    ((AnalyticsGAEventHandler)((Object)object3)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object4);
                }
                ((oy1_1)object).C = ++n4;
            }
        }
        return Unit.a;
    }
}

