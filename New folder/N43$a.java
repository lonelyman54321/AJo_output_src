/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class N43$a
extends RecyclerView$s {
    public final /* synthetic */ N43 a;

    public N43$a(N43 n43) {
        this.a = n43;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            int n4;
            object = this.a;
            LinearLayoutManager linearLayoutManager = ((N43)object).f;
            object2 = null;
            if (linearLayoutManager != null) {
                n3 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                n3 = 0;
                linearLayoutManager = null;
            }
            Object object3 = ((N43)object).c;
            if (object3 != null && n3 > (n4 = ((N43)object).m)) {
                String string2;
                int n7;
                ArrayList arrayList;
                object3 = new ArrayList();
                int n8 = ((N43)object).m;
                if (n8 <= n3) {
                    while (true) {
                        arrayList = ((N43)object).c;
                        Intrinsics.checkNotNull(arrayList);
                        n7 = arrayList.size();
                        if (n8 < n7) {
                            arrayList = ((N43)object).c;
                            Intrinsics.checkNotNull(arrayList);
                            ((Product)arrayList.get(n8)).setPosition(n8);
                            arrayList = ((N43)object).c;
                            Intrinsics.checkNotNull(arrayList);
                            arrayList = arrayList.get(n8);
                            string2 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(arrayList, string2);
                            ((ArrayList)object3).add(arrayList);
                        }
                        if (n8 == n3) break;
                        ++n8;
                    }
                }
                if ((n8 = ((ArrayList)object3).isEmpty() ^ 1) != 0) {
                    Message message = new Message();
                    message.what = n7 = 1001;
                    arrayList = new JSONObject();
                    arrayList.put("productImpression", object3);
                    string2 = "pdp screen - explore similar overlay";
                    arrayList.put("listName", string2);
                    String string3 = "NA";
                    arrayList.put("sizeText", string3);
                    arrayList.put("isPLP", false);
                    arrayList.put("screenName", string2);
                    arrayList.put("screenType", "pdp screen");
                    message.obj = arrayList;
                    object2 = vg_1.a(AnalyticsGAEventHandler.Companion, message);
                    object3 = ((N43)object).q;
                    ((AnalyticsGAEventHandler)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
                }
                ((N43)object).m = ++n3;
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, n3, n4);
    }
}

