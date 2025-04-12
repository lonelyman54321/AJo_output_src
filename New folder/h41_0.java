/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  org.json.JSONException
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.home.landingpage.widgets.view.ComponentRecyclerView;
import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from H41
 */
public final class h41_0
extends RecyclerView$f
implements View.OnClickListener {
    public List a;
    public r82_0 b;
    public OnGAEventHandlerListener c;
    public Context d;
    public int e;
    public String f;
    public int g;
    public String h;
    public int i;
    public int j;

    public final void g(ImageView object, View view, int n3, int n4, int n7) {
        BannerDetails bannerDetails = (BannerDetails)this.a.get(n3);
        int n8 = 8;
        if (bannerDetails != null) {
            Object object2 = bannerDetails.getImageUrl();
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                boolean bl3;
                Object object3;
                bl2 = bannerDetails.isEcommerceEventPushed();
                boolean bl4 = true;
                if (!bl2) {
                    int n10;
                    object2 = AnalyticsManager.getInstance().getGa();
                    object3 = bannerDetails.getImageUrl();
                    ((GoogleAnalyticsEvents)object2).trackLandingPageCustomDimension((String)object3);
                    object2 = bannerDetails.getImageUrl();
                    int n14 = bannerDetails.getComponentPosition();
                    int n15 = bannerDetails.getBannerPosition();
                    String string2 = "home landing screen";
                    Message message = new Message();
                    message.what = n10 = 1003;
                    JSONObject jSONObject = new JSONObject();
                    String string3 = "bannerImpression";
                    jSONObject.put(string3, object2);
                    object2 = "componentPosition";
                    jSONObject.put((String)object2, n14);
                    object2 = "bannerPosition";
                    jSONObject.put((String)object2, n15);
                    object2 = "screenName";
                    jSONObject.put((String)object2, (Object)string2);
                    object2 = "screenType";
                    try {
                        jSONObject.put((String)object2, (Object)string2);
                    }
                    catch (JSONException jSONException) {
                        yn3_0.a((Exception)((Object)jSONException));
                    }
                    message.obj = jSONObject;
                    object2 = vg_1.a(AnalyticsGAEventHandler.Companion, message);
                    object3 = this.c;
                    ((AnalyticsGAEventHandler)((Object)object2)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object3);
                    bannerDetails.setEcommerceEventPushed(bl4);
                }
                bl2 = false;
                object2 = null;
                object.setVisibility(0);
                object3 = UrlHelper.getInstance();
                Object object4 = bannerDetails.getImageUrl();
                object3 = ((UrlHelper)object3).getImageUrl((String)object4);
                if (n4 != 0 && n7 != 0) {
                    object4 = new da$a();
                    ((da$a)object4).k = bl4;
                    ((da$a)object4).j = bl4;
                    ((da$a)object4).o = bl4;
                    ((da$a)object4).d = n4;
                    ((da$a)object4).e = n7;
                    ((da$a)object4).a = n4 = R$drawable.component_placeholder;
                    ((da$a)object4).b = n4;
                    ((da$a)object4).g = bl4;
                    ((da$a)object4).n = object3;
                    ((da$a)object4).u = object;
                    ((da$a)object4).a();
                }
                if (!(bl3 = TextUtils.isEmpty((CharSequence)(object = bannerDetails.getPage()))) && !(bl3 = TextUtils.isEmpty((CharSequence)(object = bannerDetails.getUrlLink())))) {
                    view.setVisibility(0);
                    object = n3;
                    view.setTag(object);
                } else {
                    view.setVisibility(n8);
                }
            } else {
                object.setVisibility(n8);
                view.setVisibility(n8);
            }
        } else {
            object.setVisibility(n8);
            view.setVisibility(n8);
        }
    }

    public final int getItemCount() {
        int n3;
        int n4;
        List list = this.a;
        if (list != null && (n4 = list.size()) != 0) {
            n3 = (list.size() + 2) / 2;
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        if (n3 == 0) {
            return 10;
        }
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Context context;
        Object object;
        recyclerView$B = (H41$a)recyclerView$B;
        int n4 = this.getItemViewType(n3);
        int n7 = 2;
        int n8 = 0;
        if (n4 != n7) {
            n7 = 10;
            if (n4 == n7) {
                int n10;
                int n14;
                int n15;
                object = recyclerView$B;
                object = (H41$b)recyclerView$B;
                n7 = this.i;
                if (n7 != 0 && (n15 = this.j) != 0) {
                    n14 = n7;
                    n10 = n15;
                } else {
                    this.i = n7 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_big_imv_width);
                    this.j = n7 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_big_imv_height);
                    n14 = 0;
                    n10 = 0;
                }
                ImageView imageView = ((H41$b)object).a;
                View view = ((H41$b)object).b;
                h41_0 h41_02 = this;
                int n16 = n3;
                this.g(imageView, view, n3, n14, n10);
            }
        } else {
            int n17;
            int n18;
            View view;
            ImageView imageView;
            n4 = this.i;
            if (n4 == 0 || (n7 = this.j) == 0) {
                this.i = n4 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_row_imv_width);
                this.j = n4 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_row_imv_height);
                n4 = 0;
                object = null;
                n7 = 0;
                context = null;
            }
            RecyclerView$B recyclerView$B2 = recyclerView$B;
            recyclerView$B2 = (H41$c)recyclerView$B;
            RelativeLayout relativeLayout = ((H41$c)recyclerView$B2).e;
            int n19 = this.e;
            relativeLayout.setPadding(n19, 0, 0, 0);
            n8 = n3 * 2;
            int n20 = n8 + -1;
            List list = this.a;
            int n21 = list.size();
            int n22 = 8;
            if (n21 > n20) {
                imageView = ((H41$c)recyclerView$B2).a;
                view = ((H41$c)recyclerView$B2).c;
                h41_0 h41_03 = this;
                n18 = n4;
                n17 = n7;
                this.g(imageView, view, n20, n4, n7);
            } else {
                ((H41$c)recyclerView$B2).a.setVisibility(n22);
                View view2 = ((H41$c)recyclerView$B2).c;
                view2.setVisibility(n22);
            }
            n21 = list.size();
            if (n21 > n8) {
                imageView = ((H41$c)recyclerView$B2).b;
                view = ((H41$c)recyclerView$B2).d;
                h41_0 h41_04 = this;
                n20 = n8;
                n18 = n4;
                n17 = n7;
                this.g(imageView, view, n8, n4, n7);
            } else {
                ((H41$c)recyclerView$B2).b.setVisibility(n22);
                object = ((H41$c)recyclerView$B2).d;
                object.setVisibility(n22);
            }
        }
        object = this.b;
        if (object != null) {
            object = (ComponentRecyclerView)object;
            n4 = (int)(((ComponentRecyclerView)object).j ? 1 : 0);
            if (n4 != 0) {
                n4 = this.g;
                n4 = n3 > n4 ? R$anim.right_from_left : R$anim.left_from_right;
                context = this.d;
                object = AnimationUtils.loadAnimation((Context)context, (int)n4);
                recyclerView$B = recyclerView$B.itemView;
                recyclerView$B.startAnimation((Animation)object);
                this.g = n3;
                return;
            }
        }
        recyclerView$B = recyclerView$B.itemView;
        recyclerView$B.clearAnimation();
    }

    public final void onClick(View object) {
        int n3;
        Object object2 = object.getTag();
        boolean bl2 = object2 instanceof Integer;
        int n4 = -1;
        if (bl2) {
            object = (Integer)object.getTag();
            n3 = (Integer)object;
        } else {
            n3 = -1;
        }
        if (n3 > n4) {
            hp1_2 hp1_22;
            object = (BannerDetails)this.a.get(n3);
            String string2 = ((BannerDetails)object).getPage();
            String string3 = ((BannerDetails)object).getUrlLink();
            int n7 = ((BannerDetails)object).getComponentPosition();
            String string4 = ((BannerDetails)object).getQuery();
            int n8 = ((BannerDetails)object).getBannerPosition();
            String string5 = ((BannerDetails)object).getImageUrl();
            String string6 = this.h;
            String string7 = this.f;
            object2 = hp1_22;
            hp1_22 = new hp1_2(string2, string3, n7, string4, string7, n8, string5, string6);
            object = this.b;
            if (object != null) {
                object.La(hp1_22);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        int n4 = 10;
        int n7 = 0;
        if (n3 == n4) {
            View view;
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.sub_row_component_imv;
            viewGroup = object.inflate(n4, viewGroup, false);
            object = new RecyclerView$B((View)viewGroup);
            n4 = R$id.sub_row_layout_click;
            object.b = view = viewGroup.findViewById(n4);
            n7 = R$id.sub_row_imv_component;
            viewGroup = (ImageView)viewGroup.findViewById(n7);
            object.a = viewGroup;
            view.setOnClickListener((View.OnClickListener)this);
            n7 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_big_imv_width);
            int n8 = hv3_0.q(R$dimen.nativeFeatureHeroGridCarousel_big_imv_height);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)viewGroup.getLayoutParams();
            layoutParams.height = n8;
            layoutParams.width = n7;
            viewGroup.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            viewGroup = (FrameLayout.LayoutParams)view.getLayoutParams();
            viewGroup.height = n8;
            viewGroup.width = n7;
            view.setLayoutParams((ViewGroup.LayoutParams)viewGroup);
        } else {
            RelativeLayout relativeLayout;
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_hero_grid_carousel;
            viewGroup = object.inflate(n4, viewGroup, false);
            object = new RecyclerView$B((View)viewGroup);
            n4 = R$id.sub_row_layout_frame;
            object.e = relativeLayout = (RelativeLayout)viewGroup.findViewById(n4);
            n4 = R$id.component_view_imv_one;
            relativeLayout = (ImageView)viewGroup.findViewById(n4);
            object.a = relativeLayout;
            n4 = R$id.component_view_imv_two;
            relativeLayout = (ImageView)viewGroup.findViewById(n4);
            object.b = relativeLayout;
            n4 = R$id.component_view_layout_click_one;
            relativeLayout = viewGroup.findViewById(n4);
            object.c = relativeLayout;
            n7 = R$id.component_view_layout_click_two;
            viewGroup = viewGroup.findViewById(n7);
            object.d = viewGroup;
            relativeLayout.setOnClickListener((View.OnClickListener)this);
            viewGroup.setOnClickListener((View.OnClickListener)this);
        }
        return object;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        recyclerView$B = (H41$a)recyclerView$B;
        super.onViewDetachedFromWindow(recyclerView$B);
        recyclerView$B.itemView.clearAnimation();
    }
}

