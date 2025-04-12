/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 */
package in.juspay.hyper.core;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

public final class JuspayCoreLib {
    public static final JuspayCoreLib INSTANCE;
    private static Context applicationContext;
    private static boolean isMultiClientIntegration;

    static {
        JuspayCoreLib juspayCoreLib;
        INSTANCE = juspayCoreLib = new JuspayCoreLib();
    }

    private JuspayCoreLib() {
    }

    public static final Context getApplicationContext() {
        return applicationContext;
    }

    public static /* synthetic */ void getApplicationContext$annotations() {
    }

    public static final boolean isAppDebuggable() {
        Context context = applicationContext;
        boolean bl2 = false;
        if (context == null) {
            return false;
        }
        context = context.getApplicationInfo();
        int n3 = context.flags & 2;
        if (n3 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static /* synthetic */ void isAppDebuggable$annotations() {
    }

    public static final boolean isMultiClientIntegration() {
        return isMultiClientIntegration;
    }

    public static /* synthetic */ void isMultiClientIntegration$annotations() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void setApplicationContext(Context object) {
        String string2;
        String string3;
        String string4 = "applicationContext";
        Intrinsics.checkNotNullParameter(object, string4);
        applicationContext = object;
        try {
            string4 = object.getResources();
            string3 = "multiclient_integration";
            string2 = "string";
        }
        catch (Resources.NotFoundException notFoundException) {
            return;
        }
        String string5 = object.getPackageName();
        int n3 = string4.getIdentifier(string3, string2, string5);
        String string6 = object.getString(n3);
        string4 = "true";
        boolean bl2 = Intrinsics.areEqual(string6, string4);
        isMultiClientIntegration = bl2;
    }
}

