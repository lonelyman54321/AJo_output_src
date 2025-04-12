/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.v;
import java.util.concurrent.ExecutorService;

final class AFi1eSDK$1
implements InstallReferrerStateListener {
    final /* synthetic */ AFi1eSDK this$0;
    final /* synthetic */ Context val$context;
    final /* synthetic */ InstallReferrerClient val$referrerClient;

    public AFi1eSDK$1(AFi1eSDK aFi1eSDK, InstallReferrerClient installReferrerClient, Context context) {
        this.this$0 = aFi1eSDK;
        this.val$referrerClient = installReferrerClient;
        this.val$context = context;
    }

    public static /* synthetic */ void a(AFi1eSDK$1 aFi1eSDK$1, InstallReferrerClient installReferrerClient, Context context, int n3) {
        aFi1eSDK$1.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, n3);
    }

    private /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int n3) {
        this.this$0.AFAdRevenueData(installReferrerClient, context, n3);
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
        aFLogger.d(aFh1vSDK, "Install Referrer service disconnected");
    }

    public final void onInstallReferrerSetupFinished(int n3) {
        ExecutorService executorService = this.this$0.getCurrencyIso4217Code;
        InstallReferrerClient installReferrerClient = this.val$referrerClient;
        Context context = this.val$context;
        v v4 = new v(this, installReferrerClient, context, n3);
        executorService.execute(v4);
    }
}

