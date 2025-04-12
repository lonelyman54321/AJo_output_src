/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.os.Message
 *  android.widget.ProgressBar
 *  org.json.JSONObject
 */
import android.os.CountDownTimer;
import android.os.Message;
import android.widget.ProgressBar;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler$Companion;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Z61
 */
public final class z61_0
extends CountDownTimer {
    public final /* synthetic */ y61_0 a;

    public z61_0(y61_0 y61_02, long l2, long l3) {
        this.a = y61_02;
        super(l2, l3);
    }

    public final void onFinish() {
        int n3;
        int n4;
        Object object = this.a;
        Object object2 = ((y61_0)object).k;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = 100;
            object2.setProgress(n4);
        }
        if ((n3 = km_1.b((cp$a)(object2 = cp_1.Companion))) == 0) {
            int n7;
            n3 = ((y61_0)object).o;
            n4 = 1;
            ((y61_0)object).o = n3 += n4;
            Object object3 = ((y61_0)object).n;
            if (object3 != null && n3 == (n7 = object3.size())) {
                n3 = 0;
                object2 = null;
                ((y61_0)object).o = 0;
            }
            n3 = ((y61_0)object).o;
            object3 = ((y61_0)object).n;
            int n8 = 0;
            Object object4 = null;
            if (object3 != null) {
                n7 = object3.size();
                object3 = n7;
            } else {
                n7 = 0;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            n7 = (Integer)object3;
            if (n3 < n7) {
                object2 = ((y61_0)object).n;
                if (object2 != null) {
                    n7 = ((y61_0)object).o;
                    object2 = object2.get(n7);
                    object4 = object2;
                    object4 = (BannerData)object2;
                }
                if ((object2 = ((y61_0)object).q) != null && (n3 = ((String)object2).length()) != 0 && (object2 = ((y61_0)object).r) != null && (n3 = ((String)object2).length()) != 0 && object4 != null) {
                    n3 = (int)(object4.isAnalyticsEventPushed() ? 1 : 0);
                    if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = object4.isAdBanner(), object3 = Boolean.TRUE) ? 1 : 0)) != 0) {
                        object4.setAnalyticsEventPushed(n4 != 0);
                        object2 = object4.getBannerAdsMetaData();
                        n7 = ((y61_0)object).p;
                        object3 = n7;
                        n8 = ((y61_0)object).o;
                        object4 = n8;
                        gx0_2 gx0_22 = ((y61_0)object).c;
                        gx0_22.invoke(object2, object3, object4);
                    } else {
                        n3 = (int)(object4.isAnalyticsEventPushed() ? 1 : 0);
                        if (n3 == 0 && (object2 = object4.getBannerUrl()) != null && (n3 = ((String)object2).length()) != 0) {
                            object4.setAnalyticsEventPushed(n4 != 0);
                            object2 = AnalyticsManager.Companion.getInstance().getGa();
                            object3 = object4.getBannerUrl();
                            ((GoogleAnalyticsEvents)object2).trackCMSLandingPageCustomDimension((String)object3);
                            object2 = new Message();
                            object3 = new JSONObject();
                            ((Message)object2).what = 1003;
                            object4 = object4.getBannerUrl();
                            Intrinsics.checkNotNull(object4);
                            object3.put("bannerImpression", object4);
                            int n10 = ((y61_0)object).p;
                            object3.put("componentPosition", n10);
                            n10 = ((y61_0)object).o;
                            object3.put("bannerPosition", n10);
                            String string2 = ((y61_0)object).q;
                            object3.put("screenName", (Object)string2);
                            string2 = ((y61_0)object).r;
                            object3.put("screenType", (Object)string2);
                            object3.put("servedFromCms", n4 != 0);
                            object4 = yx0_0.a;
                            string2 = "pageType";
                            object3.put(string2, object4);
                            ((Message)object2).obj = object3;
                            object3 = AnalyticsGAEventHandler.Companion;
                            object4 = ((AnalyticsGAEventHandler$Companion)object3).getInstance();
                            object4.sendMessage((Message)object2);
                            object2 = ((y61_0)object).d;
                            if (object2 != null) {
                                object3 = ((AnalyticsGAEventHandler$Companion)object3).getInstance();
                                ((AnalyticsGAEventHandler)((Object)object3)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
                            }
                        }
                    }
                }
            }
            n3 = ((y61_0)object).l + n4;
            n7 = 1000;
            object = ((y61_0)object).g;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n3, n4 != 0, n7);
        }
    }

    public final void onTick(long l2) {
        y61_0 y61_02 = this.a;
        ProgressBar progressBar = y61_02.k;
        if (progressBar != null) {
            Intrinsics.checkNotNull(progressBar);
            y61_02 = y61_02.k;
            Intrinsics.checkNotNull(y61_02);
            int n3 = y61_02.getProgress() + 1;
            progressBar.setProgress(n3);
        }
    }
}

