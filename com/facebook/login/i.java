/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.g;
import com.facebook.appevents.h;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.i$a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final h b;
    public final String c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public i(Context object, String string2) {
        h h3;
        String string3;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(string3, "applicationId");
        this.a = string3;
        g g3 = new g((Context)object, string3);
        this.b = h3 = new h(g3);
        try {
            String string4;
            PackageManager packageManager = object.getPackageManager();
            if (packageManager == null) return;
            string3 = "com.facebook.katana";
            h3 = null;
            PackageInfo packageInfo = packageManager.getPackageInfo(string3, 0);
            if (packageInfo == null) return;
            this.c = string4 = packageInfo.versionName;
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
    }

    public final void a(String string2, String object) {
        String string3;
        String string4 = "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.";
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        String string5 = "";
        try {
            string5 = i$a.a(string5);
            string3 = "2_result";
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        Object object2 = LoginClient$Result$a.ERROR;
        object2 = object2.getLoggingValue();
        string5.putString(string3, (String)object2);
        string3 = "5_error_message";
        string5.putString(string3, string4);
        string4 = "3_method";
        string5.putString(string4, (String)object);
        object = this.b;
        ((h)object).a((Bundle)string5, string2);
    }
}

