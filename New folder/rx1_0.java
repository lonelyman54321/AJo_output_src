/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsflyer.internal.AFb1rSDK;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$f;
import com.facebook.login.j;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.t;
import com.jio.jioads.jioreel.vast.parser.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.login.activity.LoginActivityRevamp;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rx1
 */
public final class rx1_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rx1_0(GraphRequest$b graphRequest$b, long l2, long l3) {
        this.a = 2;
        this.b = graphRequest$b;
    }

    public /* synthetic */ rx1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = 0;
        Object var2_2 = null;
        boolean bl2 = true;
        Dialog dialog = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2;
                object3 = (a)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                t t3 = new t();
                object3.getClass();
                try {
                    string2 = ((a)object3).b;
                    m m2 = t3.a(null, string2, null, null);
                }
                catch (Exception exception) {
                    object = 0;
                    Object var2_5 = null;
                }
                try {
                    void var2_6;
                    bl2 = com.jio.jioads.jioreel.vast.parser.a.a((m)var2_6);
                    object2 = ((a)object3).a;
                    if (bl2) {
                        if (object2 == null) return;
                        object2.a((m)var2_6);
                        return;
                    }
                    if (object2 == null) return;
                    object2.a(null);
                    return;
                }
                catch (Exception exception) {
                    string2 = "message";
                    Intrinsics.checkNotNullParameter("VastParserTask onPostExecute exception", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                }
                return;
            }
            case 3: {
                AFb1rSDK.c((AFb1rSDK)object3);
                return;
            }
            case 2: {
                ((GraphRequest$f)((GraphRequest$b)object3)).a();
                return;
            }
            case 1: {
                cp$a cp$a;
                long l2;
                long l3;
                long l4;
                object3 = (PDPVideoKYPHolder)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                long l7 = ((PDPVideoKYPHolder)object3).B;
                long l8 = 1L;
                ((PDPVideoKYPHolder)object3).B = l7 += l8;
                Handler handler = ((PDPVideoKYPHolder)object3).C;
                rx1_0 rx1_02 = ((PDPVideoKYPHolder)object3).D;
                handler.postDelayed((Runnable)rx1_02, 1000L);
                l7 = ((PDPVideoKYPHolder)object3).B;
                long l12 = 3;
                long l14 = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1);
                if (l14 <= 0 && (l4 = (l3 = l7 - (l2 = (long)5)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
                    handler.removeCallbacks((Runnable)rx1_02);
                    VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    String string3 = ((PDPVideoKYPHolder)object3).u;
                    String string4 = String.valueOf(string3);
                    long l15 = ((PDPVideoKYPHolder)object3).v;
                    String string5 = "pdp_video_interactions";
                    String string6 = "pdp_screen_interaction";
                    videoComponentEvents.logVideoWatchEvent(false, string4, false, l15, string5, string6);
                }
                if ((object = km_1.b(cp$a = cp_1.Companion)) == 0) return;
                l7 = ((PDPVideoKYPHolder)object3).B;
                long l16 = l7 - l12;
                object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object < 0) return;
                object = ((PDPVideoKYPHolder)object3).s;
                if (object != 0) return;
                ((PDPVideoKYPHolder)object3).s = bl2;
                ((PDPVideoKYPHolder)object3).z(bl2);
                return;
            }
            case 0: 
        }
        Object object4 = LoginActivityRevamp.Companion;
        object3 = (LoginActivityRevamp)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        j.j.a().f();
        object2 = AccessToken.l;
        AccessToken$b.d(null);
        dialog = new Dialog((Context)object3);
        dialog.requestWindowFeature((int)(bl2 ? 1 : 0));
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        bl2 = R$layout.sociallogin_error_layout;
        dialog.setContentView((int)(bl2 ? 1 : 0));
        bl2 = R$id.close;
        TextView textView = (TextView)dialog.findViewById((int)(bl2 ? 1 : 0));
        int n4 = R$id.social_login_failed_image;
        object2 = (ImageView)dialog.findViewById(n4);
        n3 = R$id.social_login_failed_message;
        object4 = (AjioTextView)dialog.findViewById(n3);
        sx1_0 sx1_02 = new sx1_0(dialog, 0);
        textView.setOnClickListener((View.OnClickListener)sx1_02);
        Drawable drawable2 = hv3_0.r(R$drawable.facebook_failed);
        object2.setImageDrawable(drawable2);
        String string7 = hv3_0.K(R$string.facebook_login_failed_messahe);
        object4.setText((CharSequence)string7);
        object = object3.isFinishing();
        if (object != 0) return;
        dialog.show();
        hv3_0.e0(dialog);
    }
}

