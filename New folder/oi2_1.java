/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  org.json.JSONObject
 */
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from oi2
 */
public final class oi2_1
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final OnGAEventHandlerListener c;
    public final int d;
    public final View e;
    public final ImageView f;
    public boolean g;
    public final ni2_1 h;

    public oi2_1(View view, yi2_1 object, OnGAEventHandlerListener object2, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(object, string2);
        super(view);
        this.a = view;
        this.b = object;
        this.c = object2;
        this.d = n3;
        this.h = object = new ni2_1(this);
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.e = view;
        object = null;
        object2 = "parentView";
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            view = null;
        }
        view.getContext();
        view = this.e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object = view;
        }
        n4 = R$id.imageView;
        view = (ImageView)object.findViewById(n4);
        this.f = view;
    }

    public final void setData(String object) {
        int n3;
        int n4;
        Object object2;
        int n7;
        Object object3 = this.f;
        Object object4 = null;
        Object object5 = "imageView";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            object2 = null;
        } else {
            object2 = object3;
        }
        Object object6 = this.h;
        object2.setOnClickListener((View.OnClickListener)object6);
        object2 = new da$a();
        ((da$a)object2).a = n4 = R$drawable.component_placeholder;
        ((da$a)object2).b = n4;
        n4 = 1;
        ((da$a)object2).k = n4;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n3 = 0;
            object3 = null;
        }
        ((da$a)object2).n = object;
        ((da$a)object2).u = object3;
        ((da$a)object2).i = n4;
        ((da$a)object2).a();
        boolean bl2 = this.g;
        if (!bl2) {
            this.g = n4;
            object = h40_0.a;
            object = z40_0.Companion;
            object3 = AJIOApplication.Companion;
            object5 = Q.a((AJIOApplication$a)object3, (z40$a)object).a;
            object2 = "dressToolPdpBannerConfig";
            boolean bl3 = (object5 = ((cw)object5).d((String)object2)).has((String)(object6 = "bannerName"));
            object5 = bl3 ? object5.optString((String)object6) : null;
            object = Q.a((AJIOApplication$a)object3, (z40$a)object).a.d((String)object2);
            n7 = object.has((String)(object3 = "imgUrl"));
            if (n7 != 0) {
                object4 = object.optString((String)object3);
            }
            object = new Message();
            ((Message)object).what = n3 = 1003;
            object3 = new JSONObject();
            object3.put("bannerImpression", object4);
            n7 = this.d;
            object3.put("componentPosition", n7);
            object3.put("name", object5);
            object4 = AnalyticsManager.Companion;
            object5 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents().getScreenName();
            object2 = "screenName";
            object3.put((String)object2, object5);
            object4 = ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents().getScreenName();
            object3.put("screenType", object4);
            object4 = "servedFromCms";
            object5 = null;
            object3.put((String)object4, false);
            ((Message)object).obj = object3;
            object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object);
            object3 = this.c;
            ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
        }
    }
}

