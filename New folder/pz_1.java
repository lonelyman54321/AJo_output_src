/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.services.entity.GABannerAdData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

/*
 * Renamed from PZ
 */
public final class pz_1
implements gx0_2 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ pz_1(e00 e002) {
        this.a = e002;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        int n4;
        String string2;
        Object object4;
        int n7;
        String string3;
        Object object5 = object;
        object5 = (BannerAdsMetaData)object;
        Object object6 = object2;
        object6 = (Integer)object2;
        Object object7 = object3;
        object7 = (Integer)object3;
        e00 e002 = this.a;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        e002.getClass();
        String string4 = null;
        String string5 = object5 != null ? ((BannerAdsMetaData)object5).getImpressionTracker() : null;
        if (object5 != null) {
            string3 = ((BannerAdsMetaData)object5).getBannerType();
        } else {
            n7 = 0;
            string3 = null;
        }
        n7 = Intrinsics.areEqual(string3, "AD");
        Object object8 = "";
        if (n7 != 0) {
            string3 = ((BannerAdsMetaData)object5).getImpressionTracker();
            if (string3 != null) {
                string5 = ((BannerAdsMetaData)object5).getCcbValue();
                Intrinsics.checkNotNullParameter(string3, "url");
                long l2 = k7.p();
                object4 = String.valueOf(l2);
                string2 = "[trq]";
                string3 = b.n(string3, string2, (String)object4, false);
                if (string5 == null) {
                    string5 = object8;
                }
                object4 = "[ccb]";
                string5 = b.n(string3, (String)object4, string5, false);
            }
        } else {
            if (object5 != null) {
                string3 = ((BannerAdsMetaData)object5).getBannerType();
            } else {
                n7 = 0;
                string3 = null;
            }
            object4 = "EXTERNAL_AD";
            n7 = Intrinsics.areEqual(string3, object4);
            if (n7 != 0) {
                string5 = ((BannerAdsMetaData)object5).getImpressionTracker();
            }
        }
        ((BannerAdViewModel)e002.H.getValue()).callBannerViewImpression(string5);
        string5 = new Message();
        ((Message)string5).what = n7 = 1005;
        string3 = new JSONObject();
        if (object5 != null) {
            object4 = ((BannerAdsMetaData)object5).getImageName();
        } else {
            n4 = 0;
            object4 = null;
        }
        if (object4 != null && (n4 = ((String)object4).length()) != 0) {
            if (object5 == null || (object4 = ((BannerAdsMetaData)object5).getImageName()) == null) {
                object4 = object8;
            }
        } else {
            object4 = "bannerimage";
        }
        string3.put("bannerImpression", object4);
        string3.put("componentPosition", object6);
        string3.put("bannerPosition", object7);
        string2 = "home landing screen";
        string3.put("screenName", (Object)string2);
        string3.put("screenType", (Object)string2);
        int n8 = 255;
        object4 = new GABannerAdData(null, null, null, null, null, null, null, null, n8, null);
        string2 = object5 != null ? ((BannerAdsMetaData)object5).getCreativeName() : null;
        ((GABannerAdData)object4).setCreativeName(string2);
        string2 = object5 != null ? ((BannerAdsMetaData)object5).getCampaignId() : null;
        ((GABannerAdData)object4).setCampaignId(string2);
        ((GABannerAdData)object4).setBannerIndex((Integer)object7);
        ((GABannerAdData)object4).setComponentIndex((Integer)object6);
        if (object5 != null) {
            object6 = ((BannerAdsMetaData)object5).getImageName();
        } else {
            n3 = 0;
            object6 = null;
        }
        if (object6 != null && (n3 = ((String)object6).length()) != 0) {
            if (object5 != null && (object6 = ((BannerAdsMetaData)object5).getImageName()) != null) {
                object8 = object6;
            }
        } else {
            object8 = "bannerImage";
        }
        ((GABannerAdData)object4).setUrl((String)object8);
        ((GABannerAdData)object4).setImageName((String)object8);
        if (object5 != null) {
            string4 = ((BannerAdsMetaData)object5).getBannerType();
        }
        ((GABannerAdData)object4).setBannerType(string4);
        ((GABannerAdData)object4).setPageName("home");
        string3.put("banner_ad_data", object4);
        ((Message)string5).obj = string3;
        object5 = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)string5);
        object6 = e002.h;
        ((AnalyticsGAEventHandler)((Object)object5)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object6);
        return Unit.a;
    }
}

