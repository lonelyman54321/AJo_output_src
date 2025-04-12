/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import ai.haptik.android.wrapper.sdk.HaptikSDK;
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import in.juspay.hypersmshandler.SmsConsentHandler;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u31
 */
public final class u31_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u31_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                SmsConsentHandler.a((SmsConsentHandler)((Object)this.b));
                return;
            }
            case 0: 
        }
        Map map2 = (Map)this.b;
        Intrinsics.checkNotNullParameter(map2, "$data");
        HaptikSDK haptikSDK = HaptikSDK.INSTANCE;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        int n4 = R$drawable.launcher_icon;
        haptikSDK.handleNotification((Context)aJIOApplication, map2, n4);
    }
}

