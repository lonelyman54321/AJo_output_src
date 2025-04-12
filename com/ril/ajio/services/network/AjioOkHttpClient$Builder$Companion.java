/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.services.network;

import android.content.Context;
import com.ril.ajio.services.network.AjioOkHttpClient;
import com.ril.ajio.services.network.OkHttpClientProvider;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AjioOkHttpClient$Builder$Companion {
    private AjioOkHttpClient$Builder$Companion() {
    }

    public /* synthetic */ AjioOkHttpClient$Builder$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void build(File object, Context context, boolean bl2, xe xe2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(xe2, "analyticsReporter");
        AjioOkHttpClient ajioOkHttpClient = AjioOkHttpClient.INSTANCE;
        object = OkHttpClientProvider.Companion.getInstance().getClient((File)object, context, bl2, xe2, stringArray);
        ajioOkHttpClient.setOkHttpClient((x72_0)object);
    }
}

