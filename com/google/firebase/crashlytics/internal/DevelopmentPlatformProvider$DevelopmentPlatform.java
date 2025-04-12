/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider$1;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

class DevelopmentPlatformProvider$DevelopmentPlatform {
    private final String developmentPlatform;
    private final String developmentPlatformVersion;
    final /* synthetic */ DevelopmentPlatformProvider this$0;

    private DevelopmentPlatformProvider$DevelopmentPlatform(DevelopmentPlatformProvider object) {
        this.this$0 = object;
        Object object2 = DevelopmentPlatformProvider.access$300((DevelopmentPlatformProvider)object);
        CharSequence charSequence = "com.google.firebase.crashlytics.unity_version";
        String string2 = "string";
        int n3 = CommonUtils.getResourcesIdentifier((Context)object2, (String)charSequence, string2);
        if (n3 != 0) {
            this.developmentPlatform = "Unity";
            this.developmentPlatformVersion = object = DevelopmentPlatformProvider.access$300((DevelopmentPlatformProvider)object).getResources().getString(n3);
            object2 = Logger.getLogger();
            super("Unity Editor version is: ");
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            ((Logger)object2).v((String)object);
            return;
        }
        boolean bl2 = DevelopmentPlatformProvider.access$400((DevelopmentPlatformProvider)object, "flutter_assets/NOTICES.Z");
        n3 = 0;
        object2 = null;
        if (bl2) {
            this.developmentPlatform = "Flutter";
            this.developmentPlatformVersion = null;
            Logger.getLogger().v("Development platform is: Flutter");
            return;
        }
        this.developmentPlatform = null;
        this.developmentPlatformVersion = null;
    }

    public /* synthetic */ DevelopmentPlatformProvider$DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider, DevelopmentPlatformProvider$1 developmentPlatformProvider$1) {
        this(developmentPlatformProvider);
    }

    public static /* synthetic */ String access$000(DevelopmentPlatformProvider$DevelopmentPlatform developmentPlatformProvider$DevelopmentPlatform) {
        return developmentPlatformProvider$DevelopmentPlatform.developmentPlatform;
    }

    public static /* synthetic */ String access$100(DevelopmentPlatformProvider$DevelopmentPlatform developmentPlatformProvider$DevelopmentPlatform) {
        return developmentPlatformProvider$DevelopmentPlatform.developmentPlatformVersion;
    }
}

