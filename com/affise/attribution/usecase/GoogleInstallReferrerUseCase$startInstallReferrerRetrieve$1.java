/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.usecase;

import com.affise.attribution.usecase.GoogleInstallReferrerUseCase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.jvm.functions.Function0;

public final class GoogleInstallReferrerUseCase$startInstallReferrerRetrieve$1
implements InstallReferrerStateListener {
    final /* synthetic */ Function0 $onFinished;
    final /* synthetic */ GoogleInstallReferrerUseCase this$0;

    public GoogleInstallReferrerUseCase$startInstallReferrerRetrieve$1(GoogleInstallReferrerUseCase googleInstallReferrerUseCase2, Function0 function0) {
        this.this$0 = googleInstallReferrerUseCase2;
        this.$onFinished = function0;
    }

    public void onInstallReferrerServiceDisconnected() {
    }

    public void onInstallReferrerSetupFinished(int n3) {
        Object object;
        if (n3 == 0) {
            block10: {
                block9: {
                    object = this.this$0;
                    object = GoogleInstallReferrerUseCase.access$getReferrerClient$p((GoogleInstallReferrerUseCase)object);
                    if (object == null) break block9;
                    object = ((InstallReferrerClient)object).getInstallReferrer();
                    break block10;
                }
                n3 = 0;
                object = null;
            }
            if (object == null) {
                return;
            }
            Object object2 = this.this$0;
            try {
                GoogleInstallReferrerUseCase.access$processReferrerDetails((GoogleInstallReferrerUseCase)object2, (ReferrerDetails)object);
            }
            catch (Throwable throwable) {
                object = GoogleInstallReferrerUseCase.access$getLogsManager$p(this.this$0);
                String string2 = "Error read ReferrerClient";
                object2 = new RuntimeException(string2);
                object.addSdkError((Throwable)object2);
            }
        }
        object = this.$onFinished;
        if (object != null) {
            object.invoke();
        }
    }
}

