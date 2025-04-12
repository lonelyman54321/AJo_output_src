/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.home.landingpage.widgets.view.ComponentRecyclerView;
import com.ril.ajio.services.data.Home.ImageData;
import com.ril.ajio.services.data.Home.NativeFeatureHeroListDetails;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from G41
 */
public final class g41_0
extends RecyclerView$f {
    public final List a;
    public final r82_0 b;
    public final OnGAEventHandlerListener c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public g41_0(ArrayList arrayList, r82_0 r82_02, String string2, String string3, int n3, int n4) {
        Intrinsics.checkNotNullParameter(string2, "mTitle");
        String string4 = "mTypeCode";
        Intrinsics.checkNotNullParameter(string3, string4);
        this.a = arrayList;
        this.b = r82_02;
        this.d = string2;
        this.e = string3;
        if (n3 != 0 && n4 != 0) {
            this.f = n3;
            this.g = n4;
        } else {
            int n7;
            this.f = n7 = hv3_0.q(R$dimen.native_feature_hero_imv_width);
            this.g = n7 = hv3_0.q(R$dimen.native_feature_hero_imv_height);
        }
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object;
        int n4;
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        recyclerView$B2 = (s41_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B2, "viewHolder");
        Object object2 = this.a;
        Intrinsics.checkNotNull(object2);
        int n7 = n3;
        object2 = (NativeFeatureHeroListDetails)object2.get(n3);
        recyclerView$B2.getClass();
        Intrinsics.checkNotNullParameter(object2, "dataObject");
        Object object3 = ((NativeFeatureHeroListDetails)object2).getImageDetails();
        int n8 = 0;
        boolean bl2 = true;
        if (object3 != null && (n4 = ((ArrayList)object3).size()) > 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = ((ImageData)((ArrayList)object3).get(0)).getImageUrl())) ? 1 : 0)) == 0) {
            int n10;
            Object object4;
            String string2;
            int n14;
            Object object5;
            object3 = (ImageData)((ArrayList)object3).get(0);
            object = UrlHelper.Companion.getInstance();
            Object object6 = ((ImageData)object3).getImageUrl();
            object = ((UrlHelper)object).getImageUrl((String)object6);
            boolean n142 = ((NativeFeatureHeroListDetails)object2).isEcommerceEventPushed();
            if (!n142) {
                object6 = AnalyticsManager.Companion.getInstance().getGa();
                object5 = ((ImageData)object3).getImageUrl();
                ((GoogleAnalyticsEvents)object6).trackLandingPageCustomDimension((String)object5);
                object6 = new Message();
                ((Message)object6).what = n14 = 1003;
                object5 = new JSONObject();
                string2 = ((ImageData)object3).getImageUrl();
                object5.put("bannerImpression", (Object)string2);
                int n15 = ((ImageData)object3).getComponentPosition();
                object5.put("componentPosition", n15);
                n15 = ((ImageData)object3).getBannerPosition();
                object5.put("bannerPosition", n15);
                string2 = "home landing screen";
                object5.put("screenName", (Object)string2);
                object4 = "screenType";
                object5.put((String)object4, (Object)string2);
                ((Message)object6).obj = object5;
                object6 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object6);
                object5 = ((s41_0)recyclerView$B2).f;
                ((AnalyticsGAEventHandler)((Object)object6)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object5);
                ((NativeFeatureHeroListDetails)object2).setEcommerceEventPushed(bl2);
            }
            if ((n10 = ((s41_0)recyclerView$B2).c) != 0 && (n14 = ((s41_0)recyclerView$B2).d) != 0) {
                int n16;
                object4 = new da$a();
                ((da$a)object4).k = bl2;
                ((da$a)object4).j = bl2;
                ((da$a)object4).o = bl2;
                ((da$a)object4).d = n10;
                ((da$a)object4).e = n14;
                ((da$a)object4).a = n16 = R$drawable.component_placeholder;
                ((da$a)object4).b = n16;
                ((da$a)object4).g = bl2;
                ((da$a)object4).n = object;
                object = ((s41_0)recyclerView$B2).g;
                ((da$a)object4).u = object;
                ((da$a)object4).a();
            }
            object = ((ImageData)object3).getPage();
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            object6 = ((s41_0)recyclerView$B2).h;
            if (n4 == 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = ((ImageData)object3).getUrlLink())) ? 1 : 0)) == 0) {
                object6.setVisibility(0);
                object4 = ((ImageData)object3).getPage();
                string2 = ((ImageData)object3).getUrlLink();
                int n17 = ((ImageData)object3).getComponentPosition();
                String string3 = ((ImageData)object3).getQuery();
                int n18 = ((ImageData)object3).getBannerPosition();
                String string4 = ((ImageData)object3).getImageUrl();
                object3 = ((s41_0)recyclerView$B2).b;
                String string5 = ((s41_0)recyclerView$B2).a;
                object5 = object;
                object = new hp1_2((String)object4, string2, n17, string3, string5, n18, string4, (String)object3);
                object6.setTag(object);
            } else {
                n7 = 8;
                object6.setVisibility(n7);
            }
        }
        object2 = ((NativeFeatureHeroListDetails)object2).getCategoryTextLinkDetails();
        object3 = ((s41_0)recyclerView$B2).i;
        ((s41_0)recyclerView$B2).w((TextView)object3, (ArrayList)object2, 0);
        object3 = ((s41_0)recyclerView$B2).j;
        ((s41_0)recyclerView$B2).w((TextView)object3, (ArrayList)object2, (int)(bl2 ? 1 : 0));
        object3 = ((s41_0)recyclerView$B2).k;
        ((s41_0)recyclerView$B2).w((TextView)object3, (ArrayList)object2, 2);
        object3 = ((s41_0)recyclerView$B2).l;
        ((s41_0)recyclerView$B2).w((TextView)object3, (ArrayList)object2, 3);
        object3 = ((s41_0)recyclerView$B2).m;
        n8 = 4;
        ((s41_0)recyclerView$B2).w((TextView)object3, (ArrayList)object2, n8);
        object2 = ((s41_0)recyclerView$B2).e;
        n7 = object2 instanceof ComponentRecyclerView;
        if (n7 != 0) {
            object2 = (ComponentRecyclerView)object2;
            int n19 = ((ComponentRecyclerView)object2).j;
            if (n19 != 0) {
                object2 = recyclerView$B2.itemView.getContext();
                n7 = recyclerView$B2.getAdapterPosition();
                n7 = n7 > (n8 = ((s41_0)recyclerView$B2).n) ? R$anim.right_from_left : R$anim.left_from_right;
                object2 = AnimationUtils.loadAnimation((Context)object2, (int)n7);
                object3 = recyclerView$B2.itemView;
                object3.startAnimation((Animation)object2);
                ((s41_0)recyclerView$B2).n = n19 = recyclerView$B2.getAdapterPosition();
            } else {
                recyclerView$B2 = recyclerView$B2.itemView;
                recyclerView$B2.clearAnimation();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        LayoutInflater layoutInflater = ck0.a(object, "parent");
        int n4 = R$layout.row_native_feature_hero;
        View view = layoutInflater.inflate(n4, object, false);
        Intrinsics.checkNotNull(view);
        int n7 = this.f;
        int n8 = this.g;
        String string2 = this.e;
        r82_0 r82_02 = this.b;
        String string3 = this.d;
        object = new s41_0(view, string3, string2, n7, n8, r82_02);
        return object;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        recyclerView$B = (s41_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewDetachedFromWindow(recyclerView$B);
        recyclerView$B.itemView.clearAnimation();
    }
}

