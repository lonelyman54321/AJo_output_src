/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;

public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context object) {
        int n3;
        int n4;
        Object object2 = AppsFlyerLib.getInstance();
        String string2 = ((AppsFlyerLib)object2).getAppsFlyerUID((Context)object);
        Object object3 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string3 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        object2 = (AFb1rSDK)object2;
        object2 = AFb1rSDK.getCurrencyIso4217Code();
        LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        String string4 = object.getPackageName();
        object3 = linkGenerator.setBaseURL((String)object3, string3, string4);
        object2 = ((LinkGenerator)object3).setReferrerUID(string2).setReferrerCustomerId((String)object2);
        object = object.getPackageName();
        object = ((LinkGenerator)object2).addParameter("af_siteid", (String)object);
        object2 = AppsFlyerProperties.getInstance();
        string2 = "onelinkScheme";
        if ((object2 = ((AppsFlyerProperties)object2).getString(string2)) != null && (n4 = ((String)object2).length()) > (n3 = 3)) {
            ((LinkGenerator)object).setBaseDeeplink((String)object2);
        }
        return object;
    }

    public static void logInvite(Context context, String string2, Map object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        Object object2 = AppsFlyerProperties.getInstance();
        Object object3 = "waitForCustomerId";
        Map map2 = null;
        bl2 = ((AppsFlyerProperties)object2).getBoolean((String)object3, false);
        if (bl2) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        object2 = ShareInviteHelper.generateInviteUrl(context);
        ((LinkGenerator)object2).addParameters((Map)object);
        object = String.valueOf(string2);
        AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat((String)object));
        object = new StringBuilder("[Invite] Generated URL: ");
        object3 = ((LinkGenerator)object2).generateLink();
        ((StringBuilder)object).append((String)object3);
        AFLogger.afDebugLog(object.toString());
        object = ((LinkGenerator)object2).getMediaSource();
        object3 = "af_app_invites";
        boolean bl3 = object3.equals(object);
        if (bl3) {
            object = "af_invite";
        } else {
            object3 = "af_user_share";
            bl3 = object3.equals(object);
            if (bl3) {
                object = "af_share";
            }
        }
        object3 = new Object();
        map2 = ((LinkGenerator)object2).getUserParams();
        if (map2 != null) {
            object2 = ((LinkGenerator)object2).getUserParams();
            ((HashMap)object3).putAll(object2);
        }
        ((HashMap)object3).put("af_channel", string2);
        AppsFlyerLib.getInstance().logEvent(context, (String)object, (Map)object3);
    }
}

