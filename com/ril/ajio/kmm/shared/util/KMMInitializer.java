/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.ril.ajio.kmm.shared.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ril.ajio.kmm.shared.Platform;
import com.ril.ajio.kmm.shared.network.HttpClientProvider;
import java.io.PrintStream;
import kotlin.jvm.internal.Intrinsics;

public final class KMMInitializer {
    public static final KMMInitializer INSTANCE;

    static {
        KMMInitializer kMMInitializer;
        INSTANCE = kMMInitializer = new KMMInitializer();
    }

    private KMMInitializer() {
    }

    public final void init(Context object, x72_0 object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "okHttpClient");
        HttpClientProvider httpClientProvider = HttpClientProvider.INSTANCE;
        httpClientProvider.initializeHttpClient((x72_0)object2);
        object2 = Platform.INSTANCE;
        ((Platform)object2).setAdID(string2);
        string2 = object.getPackageManager();
        object = object.getPackageName();
        httpClientProvider = null;
        object = string2.getPackageInfo((String)object, 0);
        object = object.versionName;
        try {
            ((Platform)object2).setClientVersion((String)object);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object2 = System.out;
            ((PrintStream)object2).println((Object)nameNotFoundException);
        }
    }

    public final void updateAdId(String string2) {
        Platform.INSTANCE.setAdID(string2);
    }
}

