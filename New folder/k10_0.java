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
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
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
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.home.landingpage.widgets.view.ComponentRecyclerView;
import com.ril.ajio.home.landingpage.widgets.view.ComponentView;
import com.ril.ajio.services.data.Home.BannerDetails;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from k10
 */
public final class k10_0
extends RecyclerView$f
implements View.OnClickListener {
    public final List a;
    public final r82_0 b;
    public final OnGAEventHandlerListener c;
    public final Context d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public int l = -1;

    public k10_0(Context context, int n3, int n4, int n7, ArrayList arrayList, r82_0 r82_02, String string2, String string3, String string4) {
        this.d = context;
        this.a = arrayList;
        this.e = n3;
        this.f = n4;
        this.j = string3;
        this.k = string4;
        this.h = n7;
        this.g = 0;
        this.b = r82_02;
        this.c = null;
        this.i = string2;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = list.size();
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        String string2 = "nativeFeatureOverlayCarousel1";
        String string3 = this.k;
        boolean bl2 = string2.equalsIgnoreCase(string3);
        if (bl2 && n3 == 0) {
            return 1;
        }
        return 2;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object;
        int n4;
        int n7;
        Object object2;
        Object jSONException;
        boolean bl2;
        Object object4 = (BannerDetails)this.a.get(n3);
        boolean bl3 = true;
        if (object4 != null && !(bl2 = ((BannerDetails)object4).isEcommerceEventPushed()) && (jSONException = ((BannerDetails)object4).getImageUrl()) != null) {
            int n8;
            jSONException = AnalyticsManager.getInstance().getGa();
            object2 = ((BannerDetails)object4).getImageUrl();
            ((GoogleAnalyticsEvents)jSONException).trackLandingPageCustomDimension((String)object2);
            jSONException = ((BannerDetails)object4).getImageUrl();
            n7 = ((BannerDetails)object4).getComponentPosition();
            n4 = ((BannerDetails)object4).getBannerPosition();
            object = "home landing screen";
            Message message = new Message();
            message.what = n8 = 1003;
            JSONObject jSONObject = new JSONObject();
            String string2 = "bannerImpression";
            jSONObject.put(string2, jSONException);
            jSONException = "componentPosition";
            jSONObject.put((String)jSONException, n7);
            jSONException = "bannerPosition";
            jSONObject.put((String)jSONException, n4);
            jSONException = "screenName";
            jSONObject.put((String)jSONException, object);
            jSONException = "screenType";
            try {
                jSONObject.put((String)jSONException, object);
            }
            catch (JSONException jSONException2) {
                yn3_0.a((Exception)((Object)jSONException2));
            }
            message.obj = jSONObject;
            jSONException = vg_1.a(AnalyticsGAEventHandler.Companion, message);
            object2 = this.c;
            ((AnalyticsGAEventHandler)((Object)jSONException)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
            ((BannerDetails)object4).setEcommerceEventPushed(bl3);
        }
        boolean bl4 = this.getItemViewType(n3);
        object2 = this.k;
        Object object3 = "nativeFeatureOverlayCarousel1";
        object = null;
        if (bl4 != bl3) {
            boolean bl5 = 2 != 0;
            if (bl4 == bl5) {
                jSONException = recyclerView$B;
                jSONException = (k10$a)recyclerView$B;
                if (n3 == 0) {
                    n7 = (int)(((String)object3).equalsIgnoreCase((String)object2) ? 1 : 0);
                    if (n7 != 0) {
                        object2 = ((k10$a)jSONException).b;
                        object2.setPadding(0, 0, 0, 0);
                    } else {
                        object2 = ((k10$a)jSONException).b;
                        n4 = this.g;
                        object2.setPadding(n4, 0, 0, 0);
                    }
                } else {
                    object2 = ((k10$a)jSONException).b;
                    n4 = this.h;
                    object2.setPadding(n4, 0, 0, 0);
                }
                ((k10$a)jSONException).a.setVisibility(0);
                object2 = ((k10$a)jSONException).c;
                if (object4 != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((BannerDetails)object4).getPage())) ? 1 : 0)) == 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = ((BannerDetails)object4).getUrlLink())) ? 1 : 0)) == 0) {
                    object2.setVisibility(0);
                    object3 = n3;
                    object2.setTag(object3);
                } else {
                    n4 = 8;
                    object2.setVisibility(n4);
                }
                if (object4 != null) {
                    object2 = ((BannerDetails)object4).getImageUrl();
                    if (object2 != null) {
                        object2 = UrlHelper.getInstance();
                        object4 = ((BannerDetails)object4).getImageUrl();
                        object4 = ((UrlHelper)object2).getImageUrl((String)object4);
                    } else {
                        object4 = "";
                    }
                    n7 = this.e;
                    if (n7 != 0 && (n4 = this.f) != 0) {
                        object = new da$a();
                        ((da$a)object).k = bl3;
                        ((da$a)object).j = bl3;
                        ((da$a)object).o = bl3;
                        ((da$a)object).d = n7;
                        ((da$a)object).e = n4;
                        ((da$a)object).a = n7 = R$drawable.component_placeholder;
                        ((da$a)object).b = n7;
                        ((da$a)object).g = bl3;
                        ((da$a)object).n = object4;
                        object4 = ((k10$a)jSONException).a;
                        ((da$a)object).u = object4;
                        ((da$a)object).a();
                    }
                }
                object4 = this.b;
                bl3 = object4 instanceof ComponentRecyclerView;
                jSONException = this.d;
                if (bl3) {
                    object4 = (ComponentRecyclerView)object4;
                    int n14 = ((ComponentRecyclerView)object4).j;
                    if (n14 != 0) {
                        n14 = this.l;
                        n14 = n3 > n14 ? R$anim.right_from_left : R$anim.left_from_right;
                        object4 = AnimationUtils.loadAnimation((Context)jSONException, (int)n14);
                        recyclerView$B = recyclerView$B.itemView;
                        recyclerView$B.startAnimation((Animation)object4);
                        this.l = n3;
                    } else {
                        recyclerView$B = recyclerView$B.itemView;
                        recyclerView$B.clearAnimation();
                    }
                } else {
                    bl3 = object4 instanceof ComponentView;
                    if (bl3) {
                        object4 = (ComponentView)object4;
                        int bl52 = ((ComponentView)object4).f;
                        if (bl52 != 0) {
                            bl52 = this.l;
                            bl52 = n3 > bl52 ? R$anim.right_from_left : R$anim.left_from_right;
                            object4 = AnimationUtils.loadAnimation((Context)jSONException, (int)bl52);
                            recyclerView$B = recyclerView$B.itemView;
                            recyclerView$B.startAnimation((Animation)object4);
                            this.l = n3;
                        } else {
                            recyclerView$B = recyclerView$B.itemView;
                            recyclerView$B.clearAnimation();
                        }
                    }
                }
            }
        } else {
            recyclerView$B = (k10$b)recyclerView$B;
            bl3 = ((String)object3).equalsIgnoreCase((String)object2);
            if (bl3 && n3 == 0) {
                boolean bl6;
                String string3;
                if (object4 != null && !(bl3 = (boolean)TextUtils.isEmpty((CharSequence)(string3 = ((BannerDetails)object4).getPage()))) && !(bl6 = TextUtils.isEmpty((CharSequence)(object4 = ((BannerDetails)object4).getUrlLink())))) {
                    object4 = ((k10$b)recyclerView$B).a;
                    Integer view = n3;
                    object4.setTag((Object)view);
                    recyclerView$B = ((k10$b)recyclerView$B).a;
                    recyclerView$B.setVisibility(0);
                    recyclerView$B.setOnClickListener(this);
                } else {
                    View view = ((k10$b)recyclerView$B).a;
                    bl6 = false;
                    object4 = null;
                    view.setTag(null);
                    recyclerView$B = ((k10$b)recyclerView$B).a;
                    n3 = 4;
                    recyclerView$B.setVisibility(n3);
                    recyclerView$B.setClickable(false);
                    recyclerView$B.setOnClickListener(null);
                }
            }
        }
    }

    public final void onClick(View object) {
        Object object2;
        boolean bl2;
        r82_0 r82_02 = this.b;
        if (r82_02 != null && (bl2 = (object2 = object.getTag()) instanceof Integer)) {
            hp1_2 hp1_22;
            object = (Integer)object.getTag();
            int n3 = (Integer)object;
            object2 = this.a;
            int n4 = object2.size();
            if (n4 < n3) {
                return;
            }
            object = (BannerDetails)object2.get(n3);
            String string2 = ((BannerDetails)object).getPage();
            String string3 = ((BannerDetails)object).getUrlLink();
            int n7 = ((BannerDetails)object).getComponentPosition();
            String string4 = ((BannerDetails)object).getQuery();
            int n8 = ((BannerDetails)object).getBannerPosition();
            String string5 = ((BannerDetails)object).getImageUrl();
            String string6 = this.j;
            String string7 = this.i;
            object2 = hp1_22;
            hp1_22 = new hp1_2(string2, string3, n7, string4, string7, n8, string5, string6);
            r82_02.La(hp1_22);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        int n4 = this.f;
        int n7 = 1;
        int n8 = 0;
        LinearLayout.LayoutParams layoutParams = null;
        if (n3 == n7) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n10 = R$layout.sub_row_component_space;
            viewGroup = layoutInflater.inflate(n10, viewGroup, false);
            k10$b k10$b = new RecyclerView$B((View)viewGroup);
            n7 = R$id.sub_row_component_space;
            viewGroup = viewGroup.findViewById(n7);
            k10$b.a = viewGroup;
            n7 = hv3_0.F() / 2;
            layoutParams = (LinearLayout.LayoutParams)viewGroup.getLayoutParams();
            layoutParams.height = n4;
            layoutParams.width = n7;
            viewGroup.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            viewGroup.setOnClickListener((View.OnClickListener)this);
            return k10$b;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n14 = R$layout.sub_row_component_imv;
        viewGroup = layoutInflater.inflate(n14, viewGroup, false);
        k10$a k10$a = new RecyclerView$B((View)viewGroup);
        n7 = R$id.sub_row_layout_frame;
        layoutInflater = (FrameLayout)viewGroup.findViewById(n7);
        k10$a.b = layoutInflater;
        n7 = R$id.sub_row_layout_click;
        layoutInflater = viewGroup.findViewById(n7);
        k10$a.c = layoutInflater;
        n8 = R$id.sub_row_imv_component;
        viewGroup = (ImageView)viewGroup.findViewById(n8);
        k10$a.a = viewGroup;
        n8 = this.e;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams)viewGroup.getLayoutParams();
        layoutParams2.height = n4;
        layoutParams2.width = n8;
        viewGroup.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        viewGroup = (FrameLayout.LayoutParams)layoutInflater.getLayoutParams();
        viewGroup.height = n4;
        viewGroup.width = n8;
        layoutInflater.setLayoutParams((ViewGroup.LayoutParams)viewGroup);
        layoutInflater.setOnClickListener((View.OnClickListener)this);
        return k10$a;
    }

    public final void onViewDetachedFromWindow(RecyclerView$B recyclerView$B) {
        super.onViewDetachedFromWindow(recyclerView$B);
        recyclerView$B.itemView.clearAnimation();
    }
}

