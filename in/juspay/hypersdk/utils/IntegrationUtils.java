/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 */
package in.juspay.hypersdk.utils;

import android.content.Context;
import android.content.res.Resources;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hypersdk.R$bool;
import in.juspay.hypersdk.R$string;
import in.juspay.hypersdk.data.SdkInfo;

public class IntegrationUtils {
    public static String getAppName(Context context) {
        int n3 = R$string.godel_app_name;
        return context.getString(n3);
    }

    public static String getAssetAarVersion(Context context, String string2) {
        boolean bl2 = JuspayCoreLib.isMultiClientIntegration();
        if (bl2 && string2 != null) {
            string2 = "asset_aar_version_".concat(string2);
            return IntegrationUtils.getVersion(context, string2);
        }
        return IntegrationUtils.getVersion(context, "asset_aar_version");
    }

    public static String getGodelBuildVersion(Context context) {
        return IntegrationUtils.getVersion(context, "godel_build_version");
    }

    public static String getGodelVersion(Context context) {
        return IntegrationUtils.getVersion(context, "godel_version");
    }

    public static SdkInfo getSdkInfo(Context context) {
        String string2 = IntegrationUtils.getAppName(context);
        String string3 = IntegrationUtils.getGodelVersion(context);
        boolean bl2 = IntegrationUtils.isSdkDebuggable(context);
        boolean bl3 = IntegrationUtils.usesLocalAssets(context);
        SdkInfo sdkInfo = new SdkInfo(string2, string3, bl2, bl3);
        return sdkInfo;
    }

    public static String getSdkVersion(Context context) {
        return IntegrationUtils.getSdkVersion(context, "-");
    }

    public static String getSdkVersion(Context object, String string2) {
        String string3 = IntegrationUtils.getGodelVersion(object);
        StringBuilder stringBuilder = new StringBuilder(string3);
        string3 = object.getResources();
        String string4 = object.getPackageName();
        String string5 = "use_rc";
        String string6 = "bool";
        int n3 = string3.getIdentifier(string5, string6, string4);
        string4 = object.getResources();
        n3 = (int)(string4.getBoolean(n3) ? 1 : 0);
        if (n3 != 0) {
            stringBuilder.append(string2);
            object = IntegrationUtils.getGodelBuildVersion(object);
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    private static String getVersion(Context context, String string2) {
        String string3;
        String string4;
        Resources resources = context.getResources();
        int n3 = resources.getIdentifier(string2, string4 = "string", string3 = context.getPackageName());
        if (n3 == 0) {
            return "undefined";
        }
        return context.getString(n3);
    }

    private static boolean isSdkDebuggable(Context context) {
        context = context.getResources();
        int n3 = R$bool.godel_debuggable;
        return context.getBoolean(n3);
    }

    private static boolean usesLocalAssets(Context context) {
        context = context.getResources();
        int n3 = R$bool.use_local_assets;
        return context.getBoolean(n3);
    }
}

