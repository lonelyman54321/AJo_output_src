/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import com.facebook.FacebookButtonBase;
import com.facebook.login.widget.LoginButton;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.N;
import kotlin.jvm.internal.Intrinsics;

public final class vy1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy1(String string2, Object object, int n3) {
        this.a = n3;
        this.b = string2;
        this.c = object;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter(object2, "$packageName");
                object = (Context)object;
                Intrinsics.checkNotNullParameter(object, "$context");
                Object object3 = new StringBuilder("downloading master config via fibo logic for ");
                object3.append((String)object2);
                Intrinsics.checkNotNullParameter(object3.toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                N.d((Context)object, (String)object2, null, 24);
                return;
            }
            case 0: 
        }
        n3 = LoginButton.y;
        Intrinsics.checkNotNullParameter(object2, "$appId");
        object = (LoginButton)((Object)object);
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = dl0_2.k((String)object2, false);
        Activity activity = ((FacebookButtonBase)((Object)object)).getActivity();
        tw0_2 tw0_22 = new tw0_2(1, object, object2);
        activity.runOnUiThread((Runnable)tw0_22);
    }
}

