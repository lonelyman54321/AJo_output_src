/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.CountDownTimer
 *  android.os.Message
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout$LayoutParams
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.cart.cartlist.viewholder.CMSBannerAdViewHolder$setDynamicAdView$1;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.entity.GABannerAdData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from YG
 */
public final class yg_1
extends RecyclerView$B {
    public static final /* synthetic */ int r;
    public final View a;
    public final Av b;
    public int c;
    public final NewAjioStoryViewPager d;
    public final ArrayList e;
    public final LinearLayout f;
    public final FrameLayout g;
    public ProgressBar h;
    public int i;
    public CountDownTimer j;
    public ArrayList k;
    public int l;
    public final String m;
    public final String n;
    public final xg_1 o;
    public JioAdView p;
    public final wg_1 q;

    public yg_1(View object, Av object2) {
        Object object3;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = 3000;
        int n3 = R$id.component_rotating_image_viewpager;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (NewAjioStoryViewPager)((Object)object2);
        this.d = object2;
        this.e = arrayList = new ArrayList();
        int n4 = R$id.progress_bar_view;
        this.f = object3 = (LinearLayout)object.findViewById(n4);
        n4 = R$id.dynamic_add_view_frame_layout;
        object = (FrameLayout)object.findViewById(n4);
        this.g = object;
        this.i = -1;
        object = AnalyticsManager.Companion;
        object3 = av_0.a((AnalyticsManager$Companion)object);
        this.m = object3;
        object = av_0.a((AnalyticsManager$Companion)object);
        this.n = object;
        super(this);
        this.o = object;
        ((NewAjioStoryViewPager)((Object)object2)).setMaxSettleDuration(1000);
        ((NewAjioStoryViewPager)((Object)object2)).b((NewAjioStoryViewPager$g)object);
        arrayList.clear();
        super();
        this.q = object;
    }

    public final void w() {
        int n3;
        int n4;
        yg_1 yg_12 = this;
        Object object = this.k;
        int n7 = 1;
        if (object != null && (n4 = object.isEmpty()) == n7) {
            return;
        }
        object = yg_12.k;
        if (object != null) {
            n3 = yg_12.l;
            object = (Banner)object.get(n3);
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null && (n3 = (int)(((Banner)object).isAnalyticsEventPushed() ? 1 : 0)) == 0) {
            int n8;
            GABannerAdData gABannerAdData;
            int n10;
            ((Banner)object).setAnalyticsEventPushed(n7 != 0);
            Message message = new Message();
            message.what = n10 = 1005;
            JSONObject jSONObject = new JSONObject();
            Object object2 = ((Banner)object).getBannerUrl();
            jSONObject.put("bannerImpression", object2);
            Object object3 = ((Banner)object).getWidth();
            object2 = ((Banner)object).getHeight();
            object3 = mz3_0.e((Double)object3, (Double)object2);
            int n14 = ((ScreenInfo)object3).getWidth();
            int n15 = ((ScreenInfo)object3).getHeight();
            Object object4 = new StringBuilder();
            ((StringBuilder)object4).append(n14);
            ((StringBuilder)object4).append("x");
            ((StringBuilder)object4).append(n15);
            object3 = ((StringBuilder)object4).toString();
            jSONObject.put("creative", object3);
            object3 = ((Banner)object).getBannerType();
            object2 = "EXTERNAL_AD";
            n15 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
            object3 = n15 != 0 ? "TPBA" : "paid";
            String string2 = null;
            object4 = gABannerAdData;
            Object object5 = gABannerAdData;
            gABannerAdData = null;
            int n16 = 255;
            object4 = new GABannerAdData(null, null, null, null, null, null, null, null, n16, null);
            object4 = ((Banner)object).getBannerAdsMetaData();
            if (object4 != null) {
                object4 = ((BannerAdsMetaData)object4).getCreativeName();
            } else {
                n8 = 0;
                object4 = null;
            }
            ((GABannerAdData)object5).setCreativeName((String)object4);
            object4 = ((Banner)object).getBannerAdsMetaData();
            if (object4 != null) {
                object4 = ((BannerAdsMetaData)object4).getCampaignId();
            } else {
                n8 = 0;
                object4 = null;
            }
            ((GABannerAdData)object5).setCampaignId((String)object4);
            object4 = yg_12.l + n7;
            ((GABannerAdData)object5).setBannerIndex((Integer)object4);
            n8 = this.getAdapterPosition();
            object4 = n8;
            ((GABannerAdData)object5).setComponentIndex((Integer)object4);
            object4 = ((Banner)object).getBannerAdsMetaData();
            string2 = "-";
            if (object4 != null) {
                object4 = ((Banner)object).getBannerAdsMetaData();
                if (object4 != null) {
                    object4 = ((BannerAdsMetaData)object4).getUrl();
                } else {
                    n8 = 0;
                    object4 = null;
                }
            } else {
                object4 = ((Banner)object).getBannerUrl();
                object4 = nb0_0.a((String)object3, string2, (String)object4);
            }
            ((GABannerAdData)object5).setUrl((String)object4);
            object4 = ((Banner)object).getBannerAdsMetaData();
            if (object4 == null || (object4 = ((BannerAdsMetaData)object4).getImageName()) == null) {
                object4 = object3;
            }
            ((GABannerAdData)object5).setImageName((String)object4);
            object4 = ((Banner)object).getBannerAdsMetaData();
            if (object4 != null) {
                object4 = ((BannerAdsMetaData)object4).getBannerType();
            } else {
                n8 = 0;
                object4 = null;
            }
            ((GABannerAdData)object5).setBannerType((String)object4);
            ((GABannerAdData)object5).setPageName("misc");
            jSONObject.put("banner_ad_data", object5);
            cp_1.Companion.getClass();
            object5 = cp$a.e();
            object4 = ((Banner)object).getBannerUrl();
            if (object4 == null) {
                object4 = "";
            }
            object5.getClass();
            object5 = cp_1.k((String)object4);
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(object3);
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append((String)object5);
            object5 = ((StringBuilder)object4).toString();
            jSONObject.put("name", object5);
            object3 = yg_12.m;
            jSONObject.put("screenName", object3);
            object3 = yg_12.n;
            jSONObject.put("screenType", object3);
            int n17 = yg_12.l + n7;
            jSONObject.put("bannerPosition", n17);
            message.obj = jSONObject;
            Object object6 = vg_1.a(AnalyticsGAEventHandler.Companion, message);
            object5 = yg_12.q;
            ((AnalyticsGAEventHandler)((Object)object6)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object5);
            object = ((Banner)object).getBannerAdsMetaData();
            if (object != null && ((n7 = (int)(Intrinsics.areEqual(object6 = ((BannerAdsMetaData)object).getBannerType(), object5 = "AD") ? 1 : 0)) != 0 || (n7 = (int)(Intrinsics.areEqual(object6 = ((BannerAdsMetaData)object).getBannerType(), object2) ? 1 : 0)) != 0) && (object6 = yg_12.b) != null) {
                object6.u9((BannerAdsMetaData)object);
            }
        }
    }

    public final void x(Component object, Activity object2, xc1_2 object3) {
        int n3;
        Object object4 = this.e;
        int n4 = 0;
        ViewGroup.LayoutParams layoutParams = null;
        Object object5 = this.d;
        Object object6 = this.f;
        int n7 = 1;
        if (object != null && (n3 = ((Component)object).isDynamicAdsFlowEnabled()) == n7) {
            boolean bl2;
            ArrayList arrayList = ((NewAjioStoryViewPager)((Object)object5)).S;
            if (arrayList != null) {
                xg_1 xg_12 = this.o;
                arrayList.remove(xg_12);
            }
            ((ArrayList)object4).clear();
            ai0_2.i((View)object5);
            if (object6 != null) {
                ai0_2.i((View)object6);
            }
            if (object2 != null && !(bl2 = object2.isFinishing()) && (object4 = this.p) == null) {
                boolean bl3;
                object5 = ((Component)object).getDynamicAdAsi();
                if (object5 == null) {
                    object5 = "";
                }
                object6 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                this.p = object4 = new JioAdView((Context)object2, (String)object5, (JioAdView$AD_TYPE)((Object)object6));
                object2 = new CMSBannerAdViewHolder$setDynamicAdView$1(this);
                ((JioAdView)object4).setAdListener((JioAdListener)object2);
                object2 = new ArrayList();
                object = ((Component)object).getDynamicAdsStdDimensions();
                if (object != null) {
                    object = ((Iterable)object).iterator();
                    while (bl2 = object.hasNext()) {
                        object4 = (String)object.next();
                        object5 = "SIZE_";
                        object6 = new StringBuilder((String)object5);
                        ((StringBuilder)object6).append((String)object4);
                        object4 = ((StringBuilder)object6).toString();
                        try {
                            object4 = Constants$DynamicDisplaySize.valueOf((String)object4);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            bl2 = false;
                            object4 = null;
                        }
                        if (object4 == null) continue;
                        ((ArrayList)object2).add(object4);
                    }
                }
                if ((bl3 = ((ArrayList)object2).isEmpty() ^ n7) && (object = this.p) != null) {
                    ((JioAdView)object).setDisplayAdSize((List)object2);
                }
                if ((object = this.p) != null) {
                    ((JioAdView)object).cacheAd();
                }
                if (object3 != null) {
                    object = this.p;
                    object3.W7((JioAdView)object);
                }
            }
            return;
        }
        if (object != null) {
            int n8;
            object2 = ((Component)object).getCarouselTimer();
            object3 = null;
            if (object2 != null) {
                n8 = (Integer)object2;
            } else {
                n8 = 0;
                object2 = null;
            }
            if (n8 > 0) {
                object2 = ((Component)object).getCarouselTimer();
                if (object2 != null) {
                    n8 = (Integer)object2;
                } else {
                    n8 = 0;
                    object2 = null;
                }
                this.c = n8 *= 1000;
            }
            if ((object = ((Component)object).getBanners()) != null && (n8 = object.isEmpty() ^ n7) != 0) {
                this.k = object;
                object2 = ((ArrayList)object).get(0);
                Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
                object2 = (Banner)object2;
                Object object7 = HomeDataUtil.INSTANCE;
                Double d2 = ((Banner)object2).getWidth();
                object2 = ((Banner)object2).getHeight();
                int n10 = hv3_0.F();
                hv3_0 hv3_02 = hv3_0.a;
                hv3_02.getClass();
                int n14 = hv3_0.E();
                ScreenInfo screenInfo = new ScreenInfo(n10, n14);
                object2 = ((HomeDataUtil)object7).getViewDimen(d2, (Double)object2, screenInfo, null);
                n8 = ((ScreenInfo)object2).getHeight();
                layoutParams = object5.getLayoutParams();
                object7 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
                Intrinsics.checkNotNull(layoutParams, (String)object7);
                layoutParams = (RelativeLayout.LayoutParams)layoutParams;
                layoutParams.height = n8;
                layoutParams.width = -1;
                object5.setLayoutParams(layoutParams);
                n8 = ((ArrayList)object).size();
                if (n8 > n7) {
                    if (object6 != null) {
                        object6.removeAllViews();
                    }
                    ((ArrayList)object4).clear();
                    n8 = object.size();
                    layoutParams = null;
                    for (n4 = 0; n4 < n8; ++n4) {
                        object7 = LayoutInflater.from((Context)this.a.getContext());
                        int n15 = R$layout.pdp_rotating_banner_progress_bar;
                        object7 = object7.inflate(n15, (ViewGroup)object6, false);
                        n15 = R$id.row_rotate_progressbar_one;
                        object7 = (ProgressBar)object7.findViewById(n15);
                        if (object6 != null) {
                            object6.addView((View)object7);
                        }
                        ((ArrayList)object4).add(object7);
                    }
                } else if (object6 != null) {
                    n8 = 8;
                    object6.setVisibility(n8);
                }
                object3 = this.b;
                object2 = new zv_1((ArrayList)object, (Av)object3);
                ((NewAjioStoryViewPager)((Object)object5)).setAdapter((Uk2)object2);
                n8 = ((ArrayList)object).size();
                if (n8 > n7) {
                    int n16 = ((ArrayList)object).size() * 50;
                    ((NewAjioStoryViewPager)((Object)object5)).setCurrentItem(n16);
                }
            }
        }
    }

    public final void y(int n3) {
        int n4;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        if (n4 == 0) {
            return;
        }
        int n7 = this.i % n4;
        arrayList = this.e;
        int n8 = arrayList.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            ProgressBar progressBar;
            if (i3 < n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                int n10 = 100;
                progressBar.setProgress(n10);
                continue;
            }
            if (i3 > n7) {
                progressBar = (ProgressBar)arrayList.get(i3);
                progressBar.setProgress(0);
                continue;
            }
            progressBar = (ProgressBar)arrayList.get(i3);
            progressBar.setProgress(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void z(ProgressBar var1_1, int var2_2) {
        block9: {
            block11: {
                block10: {
                    var3_3 = this.j;
                    if (var3_3 != null) {
                        Intrinsics.checkNotNull(var3_3);
                        var3_3.cancel();
                    }
                    if ((var3_3 = this.k) != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    if (var4_4 == 0) break block9;
                    var3_3 = this.k;
                    if (var3_3 != null) {
                        var4_4 = var3_3.size();
                    } else {
                        var4_4 = 0;
                        var3_3 = null;
                    }
                    var5_5 = 1;
                    if (var4_4 == var5_5) break block9;
                    if (var1_1 /* !! */  == null) {
                        return;
                    }
                    var4_4 = -1;
                    if (var2_2 == var4_4) {
                        this.i = var2_2;
                    }
                    var6_6 = cp_1.Companion;
                    var2_2 = (int)km_1.b(var6_6);
                    var4_4 = 100;
                    if (var2_2 == 0) break block10;
                    this.y(var4_4);
                    break block11;
                }
                var6_6 = this.h;
                if (var6_6 == null) ** GOTO lbl-1000
                Intrinsics.checkNotNull(var6_6);
                var2_2 = var6_6.getProgress();
                if (var2_2 < var4_4) {
                    var6_6 = this.h;
                    Intrinsics.checkNotNull(var6_6);
                    var2_2 = var6_6.getProgress();
                    this.y(var2_2);
                } else lbl-1000:
                // 2 sources

                {
                    this.y(0);
                }
            }
            this.h = var1_1 /* !! */ ;
            var2_2 = this.c;
            var4_4 = var2_2 / 100;
            Intrinsics.checkNotNull(var1_1 /* !! */ );
            var7_7 = var1_1 /* !! */ .getProgress() * var4_4;
            var8_8 = var2_2 -= var7_7;
            var10_9 = var4_4;
            var1_1 /* !! */  = new YG$a(this, var8_8, var10_9);
            var1_1 /* !! */  = var1_1 /* !! */ .start();
            this.j = var1_1 /* !! */ ;
        }
    }
}

