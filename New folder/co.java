/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.appevents.g;
import kotlin.jvm.internal.Intrinsics;

public final class co
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ g b;

    public /* synthetic */ co(Context context, g g3) {
        this.a = context;
        this.b = g3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "$context");
        g g3 = this.b;
        Intrinsics.checkNotNullParameter(g3, "$logger");
        Bundle bundle = new Bundle();
        String[] stringArray = new String[]{"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
        String string2 = "gamingservices_lib_included";
        String string3 = "all_lib_included";
        String string4 = "messenger_lib_included";
        String string5 = "applinks_lib_included";
        String string6 = "marketing_lib_included";
        String string7 = "billing_client_lib_included";
        String string8 = "billing_service_lib_included";
        String[] stringArray2 = new String[]{"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", string4, string5, string6, string2, string3, string7, string8};
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n7;
            if (n3 >= (n7 = 11)) {
                String string9;
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                int n8 = sharedPreferences2.getInt(string9 = "kitsBitmask", 0);
                if (n8 == n4) return;
                sharedPreferences2.edit().putInt(string9, n4).apply();
                String string10 = "fb_sdk_initialize";
                g3.h(bundle, string10);
                return;
            }
            string4 = stringArray[n3];
            string5 = stringArray2[n3];
            try {
                Class.forName(string4);
                n7 = 1;
                bundle.putInt(string5, n7);
                n4 |= (n7 <<= n3);
            }
            catch (ClassNotFoundException classNotFoundException) {}
            ++n3;
        }
    }
}

