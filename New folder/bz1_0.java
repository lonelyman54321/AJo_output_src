/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.e;
import com.jio.jioads.videomodule.p_0;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.NewExchangeReturnSelectionListActivity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from bZ1
 */
public final class bz1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bz1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View view) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                object2 = (s)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((s)object2).N;
                if (object == null) return;
                object = ((AdMetaData$AdParams)object).getSecondaryCtaUrl();
                n3 = 0;
                Object object3 = null;
                if (object != null) {
                    object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object == null) return;
                n4 = ((String)object).length();
                if (!n4) {
                    return;
                }
                com.jio.jioads.instream.video.a.a((s)object2, ": inside performSecondaryCTAClick");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                try {
                    b b2 = ((s)object2).d;
                    c c2 = ((s)object2).e;
                    Object object4 = ((s)object2).N;
                    Object object5 = object4 != null ? (object4 = ((AdMetaData$AdParams)object4).getSecondaryCtaUrl()) : null;
                    object4 = ((s)object2).T();
                    if (object4 == null) {
                        object4 = "";
                    }
                    Object object6 = object4;
                    String string2 = ((s)object2).V();
                    object4 = ((s)object2).h;
                    if (object4 != null) {
                        int n7 = object4.getWidth();
                        object4 = n7;
                    } else {
                        boolean bl2 = false;
                        object4 = null;
                    }
                    String string3 = String.valueOf(object4);
                    object4 = ((s)object2).h;
                    if (object4 != null) {
                        n3 = object4.getHeight();
                        object3 = n3;
                    }
                    String string4 = String.valueOf(object3);
                    p_0 p_02 = new p_0((s)object2);
                    object3 = ((s)object2).a;
                    int n8 = e.i((Map)object3);
                    Object var18_32 = null;
                    Object var19_34 = null;
                    Object var20_36 = null;
                    object4 = object;
                    object = new f(b2, c2, null, (String)object5, null, null, (String)object6, string2, string3, string4, p_02, n8);
                    ((f)object).a();
                    return;
                }
                catch (Exception exception) {}
                object3 = new StringBuilder();
                Object object7 = ((s)object2).R();
                ((StringBuilder)object3).append((String)object7);
                ((StringBuilder)object3).append(": Exception while handling Vast click.ex= ");
                ((StringBuilder)object3).append(exception);
                Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = JioAdError.Companion;
                object7 = JioAdError$JioAdErrorType.ERROR_IN_AD_CLICK;
                object3.getClass();
                object3 = t_0.a((JioAdError$JioAdErrorType)((Object)object7));
                boolean bl3 = false;
                ((s)object2).d0 = false;
                Utility utility = Utility.INSTANCE;
                Context context = ((s)object2).g;
                String string5 = ((s)object2).R();
                d d2 = d.a;
                String string6 = ((JioAdError)object3).getErrorTitle();
                object7 = new StringBuilder("exception:");
                Object object8 = yc0_2.b(exception);
                ((StringBuilder)object7).append((String)object8);
                String string7 = ((StringBuilder)object7).toString();
                object8 = (com.jio.jioads.controller.f)((s)object2).e;
                object7 = ((com.jio.jioads.controller.f)object8).a;
                a a2 = ((o)object7).T();
                n4 = (int)(((com.jio.jioads.controller.f)object8).a.a() ? 1 : 0);
                Boolean bl4 = n4 != 0;
                object8 = ((s)object2).d;
                String string8 = object8.q0();
                String string9 = ((JioAdError)object3).getErrorCode();
                String string10 = "handleVastClickThrough";
                boolean bl5 = false;
                utility.logError(context, string5, d2, string6, string7, a2, string10, bl4, string8, string9, false);
                return;
            }
            case 0: 
        }
        n3 = NewExchangeReturnSelectionListActivity.w0;
        object2 = (NewExchangeReturnSelectionListActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object2.finish();
    }
}

