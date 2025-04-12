/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Message
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from S81
 */
public final class s81_0
extends RecyclerView$f {
    public final List a;
    public final g71_0 b;
    public final OnGAEventHandlerListener c;
    public final gx0_2 d;
    public final String e;
    public final ma_2 f;

    public s81_0(List object, g71_0 g71_02, OnGAEventHandlerListener onGAEventHandlerListener, gx0_2 gx0_22, String string2) {
        Intrinsics.checkNotNullParameter(object, "bannerList");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        Intrinsics.checkNotNullParameter(onGAEventHandlerListener, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(gx0_22, "trackBannerImpression");
        Intrinsics.checkNotNullParameter(string2, "parentPosition");
        this.a = object;
        this.b = g71_02;
        this.c = onGAEventHandlerListener;
        this.d = gx0_22;
        this.e = string2;
        this.f = object = eb_2.a;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4;
        float f5;
        Object object2;
        int n7 = 1;
        object = (x71_0)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object3 = object2 = this.a.get(n3);
        object3 = (BannerData)object2;
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "bannerData");
        Object object4 = this.e;
        Intrinsics.checkNotNullParameter(object4, "parentPosition");
        ((x71_0)object).e = object3;
        object2 = ((x71_0)object).a;
        Intrinsics.checkNotNullParameter(object2, "view");
        int n8 = R$id.video_view;
        Object object5 = (PlayerView)object2.findViewById(n8);
        ((x71_0)object).f = object5;
        String string2 = "videoView";
        RecyclerView$B recyclerView$B = null;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object5 = null;
        }
        int n10 = R$string.video_player;
        String string3 = hv3_0.K(n10);
        object5.setContentDescription((CharSequence)string3);
        n8 = R$id.imgVolume;
        object5 = (ImageView)object2.findViewById(n8);
        ((x71_0)object).g = object5;
        n8 = R$id.imgPlay;
        object5 = (ImageView)object2.findViewById(n8);
        ((x71_0)object).i = object5;
        string3 = "imgPlay";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object5 = null;
        }
        int n14 = R$string.video_play_button;
        CharSequence charSequence = hv3_0.K(n14);
        object5.setContentDescription(charSequence);
        n8 = R$id.txtDuration;
        object5 = (TextView)object2.findViewById(n8);
        n8 = R$id.imgFullScreen;
        object5 = (ImageView)object2.findViewById(n8);
        ((x71_0)object).j = object5;
        charSequence = "imgFullScreen";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
            n8 = 0;
            object5 = null;
        }
        int n15 = R$string.video_full_screen;
        String string4 = hv3_0.K(n15);
        object5.setContentDescription((CharSequence)string4);
        n8 = R$id.progress;
        object5 = (ProgressBar)object2.findViewById(n8);
        ((x71_0)object).l = object5;
        n8 = R$id.layoutVideoView;
        object5 = (ConstraintLayout)object2.findViewById(n8);
        n8 = R$id.imgThumbnail;
        object5 = (ImageView)object2.findViewById(n8);
        ((x71_0)object).h = object5;
        n8 = R$id.rlPreviewItem;
        object2 = (ConstraintLayout)object2.findViewById(n8);
        ((x71_0)object).k = object2;
        object2 = new da$a();
        ((da$a)object2).k = n7;
        ((da$a)object2).r = n7;
        n8 = R$string.acc_banner;
        object5 = hv3_0.K(n8);
        ((da$a)object2).b((String)object5);
        object5 = ((x71_0)object).e;
        if (object5 != null) {
            object5 = ((BannerData)object5).getThumbnailImage();
        } else {
            n8 = 0;
            object5 = null;
        }
        string4 = ((x71_0)object).h;
        if (string4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n15 = 0;
            string4 = null;
        }
        ((da$a)object2).n = object5;
        ((da$a)object2).u = string4;
        ((da$a)object2).a();
        object2 = ((x71_0)object).f;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object5 = new v71((x71_0)object);
        object2.setOnClickListener((View.OnClickListener)object5);
        object2 = ((x71_0)object).j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object5 = new w71((x71_0)object);
        object2.setOnClickListener((View.OnClickListener)object5);
        object2 = ((x71_0)object).g;
        string4 = "imgVolume";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object5 = new xd0_2((RecyclerView$B)object, n7);
        object2.setOnClickListener((View.OnClickListener)object5);
        object2 = ((x71_0)object).i;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object5 = new yd0_2((RecyclerView$B)object, n7);
        object2.setOnClickListener((View.OnClickListener)object5);
        object2 = ((x71_0)object).k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rlPreviewItem");
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        Object object6 = ((BannerData)object3).getAltText();
        object5 = " index ";
        if (object6 != null && (n7 = ((String)object6).length()) != 0) {
            object6 = ((BannerData)object3).getAltText();
            n4 = ((RecyclerView$B)object).getPosition();
            object6 = LO1.a(n4, (String)object6, (String)object5);
        } else {
            cp_1.Companion.getClass();
            object6 = cp$a.e();
            n4 = ((RecyclerView$B)object).getPosition();
            object6.getClass();
            object6 = cp_1.M(n4);
            n4 = ((RecyclerView$B)object).getPosition();
            n10 = R$string.acc_banner;
            string3 = hv3_0.K(n10);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object6);
            ((StringBuilder)charSequence).append((String)object5);
            ((StringBuilder)charSequence).append(n4);
            ((StringBuilder)charSequence).append(string3);
            object6 = ((StringBuilder)charSequence).toString();
        }
        object2.setContentDescription((CharSequence)object6);
        object2 = eb_2.a;
        object2 = ((BannerData)object3).getBannerType();
        n3 = (int)(eb_2.e(object2) ? 1 : 0);
        n7 = 0;
        object6 = null;
        ConstraintLayout constraintLayout = ((x71_0)object).d;
        if (n3 != 0) {
            constraintLayout.setVisibility(0);
            ((x71_0)object).w((BannerData)object3);
        } else {
            string3 = LO1.a(((RecyclerView$B)object).getBindingAdapterPosition(), object4, "|");
            object5 = ((x71_0)object).b;
            n4 = 0;
            string2 = null;
            object4 = ((x71_0)object).c;
            n14 = 24;
            V81.c((ConstraintLayout)((Object)object4), (BannerData)object3, (g71_0)object5, null, string3, n14);
            n3 = 8;
            f5 = 1.1E-44f;
            constraintLayout.setVisibility(n3);
        }
        object2 = ((x71_0)object).m;
        if (object2 != null) {
            n7 = ((ma_2)object2).r;
        }
        if (object2 != null) {
            object2 = ((ow_0)object2).a(n7);
        } else {
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        if (object2 != null) {
            f5 = object2.getVolume();
            object2 = Float.valueOf(f5);
        } else {
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        n7 = 0;
        object6 = null;
        n3 = (int)(Intrinsics.areEqual((Float)object2, 0.0f) ? 1 : 0);
        if (n3 != 0) {
            object = ((x71_0)object).g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                recyclerView$B = object;
            }
            int n16 = R$string.video_mute;
            object = hv3_0.K(n16);
            recyclerView$B.setContentDescription((CharSequence)object);
        } else {
            object = ((x71_0)object).g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
            } else {
                recyclerView$B = object;
            }
            int n17 = R$string.video_unmute;
            object = hv3_0.K(n17);
            recyclerView$B.setContentDescription((CharSequence)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.cms_internal_layout;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        x71_0 x71_02 = new x71_0((View)viewGroup, (g71_0)object);
        x71_02.setIsRecyclable(false);
        return x71_02;
    }

    public final void onViewAttachedToWindow(RecyclerView$B object) {
        object = (x71_0)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        super.onViewAttachedToWindow((RecyclerView$B)object);
        Object object2 = ((x71_0)object).e;
        if (object2 != null) {
            Object object3;
            Object object4;
            boolean bl2;
            boolean n3 = ((BannerData)object2).isAnalyticsEventPushed();
            boolean bl3 = true;
            if (!n3 && (bl2 = Intrinsics.areEqual(object4 = ((BannerData)object2).isAdBanner(), object3 = Boolean.TRUE))) {
                ((BannerData)object2).setAnalyticsEventPushed(bl3);
                object2 = ((BannerData)object2).getBannerAdsMetaData();
                int n4 = ((RecyclerView$B)object).getLayoutPosition();
                object4 = n4;
                int n7 = ((RecyclerView$B)object).getAbsoluteAdapterPosition();
                object = n7;
                gx0_2 gx0_22 = this.d;
                gx0_22.invoke(object2, object4, object);
            } else {
                int n8;
                boolean bl4 = ((BannerData)object2).isAnalyticsEventPushed();
                if (!bl4 && (object4 = ((BannerData)object2).getBannerUrl()) != null && (n8 = ((String)object4).length()) != 0) {
                    int n10;
                    ((BannerData)object2).setAnalyticsEventPushed(bl3);
                    object4 = AnalyticsManager.Companion.getInstance().getGa();
                    object3 = ((BannerData)object2).getBannerUrl();
                    ((GoogleAnalyticsEvents)object4).trackCMSLandingPageCustomDimension((String)object3);
                    object4 = new Message();
                    ((Message)object4).what = n10 = 1003;
                    object3 = new JSONObject();
                    object2 = ((BannerData)object2).getBannerUrl();
                    object3.put("bannerImpression", object2);
                    int n14 = Integer.parseInt(this.e);
                    String string2 = "componentPosition";
                    object3.put(string2, n14);
                    int n15 = ((RecyclerView$B)object).getAbsoluteAdapterPosition();
                    object3.put("bannerPosition", n15);
                    object2 = "home landing screen";
                    object3.put("screenName", object2);
                    object3.put("screenType", object2);
                    object3.put("servedFromCms", bl3);
                    object = yx0_0.a;
                    object3.put("pageType", object);
                    ((Message)object4).obj = object3;
                    object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object4);
                    object2 = this.c;
                    ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        recyclerView$B = (x71_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        super.onViewDetachedFromWindow(recyclerView$B);
        ma_2 ma_22 = this.f;
        if (ma_22 != null) {
            int n3 = ma_22.r;
            ((x71_0)recyclerView$B).y(n3);
        }
    }
}

