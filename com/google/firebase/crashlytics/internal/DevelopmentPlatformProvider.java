/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 */
package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$DevelopmentPlatform;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatformProvider$DevelopmentPlatform developmentPlatform;

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
        this.developmentPlatform = null;
    }

    public static /* synthetic */ Context access$300(DevelopmentPlatformProvider developmentPlatformProvider) {
        return developmentPlatformProvider.context;
    }

    public static /* synthetic */ boolean access$400(DevelopmentPlatformProvider developmentPlatformProvider, String string2) {
        return developmentPlatformProvider.assetFileExists(string2);
    }

    private boolean assetFileExists(String object) {
        block6: {
            AssetManager assetManager = this.context.getAssets();
            if (assetManager == null) {
                return false;
            }
            try {
                assetManager = this.context;
            }
            catch (IOException iOException) {
                return false;
            }
            assetManager = assetManager.getAssets();
            object = assetManager.open((String)object);
            if (object == null) break block6;
            ((InputStream)object).close();
        }
        return true;
    }

    private DevelopmentPlatformProvider$DevelopmentPlatform initDevelopmentPlatform() {
        DevelopmentPlatformProvider$DevelopmentPlatform developmentPlatformProvider$DevelopmentPlatform = this.developmentPlatform;
        if (developmentPlatformProvider$DevelopmentPlatform == null) {
            this.developmentPlatform = developmentPlatformProvider$DevelopmentPlatform = new DevelopmentPlatformProvider$DevelopmentPlatform(this, null);
        }
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context context) {
        String string2 = UNITY_VERSION_FIELD;
        String string3 = "string";
        int n3 = CommonUtils.getResourcesIdentifier(context, string2, string3);
        if (n3) {
            n3 = 1;
        } else {
            n3 = 0;
            context = null;
        }
        return n3 != 0;
    }

    public String getDevelopmentPlatform() {
        return DevelopmentPlatformProvider$DevelopmentPlatform.access$000(this.initDevelopmentPlatform());
    }

    public String getDevelopmentPlatformVersion() {
        return DevelopmentPlatformProvider$DevelopmentPlatform.access$100(this.initDevelopmentPlatform());
    }
}

