/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 */
package com.affise.attribution.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.affise.attribution.deeplink.DeeplinkClickRepository;
import com.affise.attribution.deeplink.DeeplinkManager;
import com.affise.attribution.deeplink.DeeplinkValue;
import com.affise.attribution.deeplink.DeeplinkValueKt;
import com.affise.attribution.deeplink.OnDeeplinkCallback;
import com.affise.attribution.init.InitPropertiesStorage;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.utils.ActivityLifecycleCallback;
import kotlin.jvm.internal.Intrinsics;

public final class DeeplinkManagerImpl
implements DeeplinkManager {
    private final ActivityActionsManager activityActionsManager;
    private OnDeeplinkCallback deeplinkCallback;
    private final InitPropertiesStorage initProperties;
    private final DeeplinkClickRepository isDeeplinkRepository;
    private ActivityLifecycleCallback onResumeSubscription;

    public DeeplinkManagerImpl(InitPropertiesStorage initPropertiesStorage, DeeplinkClickRepository deeplinkClickRepository, ActivityActionsManager activityActionsManager2) {
        Intrinsics.checkNotNullParameter(initPropertiesStorage, "initProperties");
        Intrinsics.checkNotNullParameter(deeplinkClickRepository, "isDeeplinkRepository");
        Intrinsics.checkNotNullParameter(activityActionsManager2, "activityActionsManager");
        this.initProperties = initPropertiesStorage;
        this.isDeeplinkRepository = deeplinkClickRepository;
        this.activityActionsManager = activityActionsManager2;
    }

    public static /* synthetic */ void a(DeeplinkManagerImpl deeplinkManagerImpl, Activity activity) {
        DeeplinkManagerImpl.init$lambda$0(deeplinkManagerImpl, activity);
    }

    private final void handleIntent(Intent intent) {
        String string2;
        if (intent == null) {
            return;
        }
        String string3 = intent.getAction();
        boolean bl2 = Intrinsics.areEqual(string3, string2 = "android.intent.action.VIEW");
        if (!bl2) {
            return;
        }
        if ((intent = intent.getData()) != null) {
            this.handleDeeplink((Uri)intent);
        }
    }

    private static final void init$lambda$0(DeeplinkManagerImpl deeplinkManagerImpl, Activity activity) {
        Intrinsics.checkNotNullParameter(deeplinkManagerImpl, "this$0");
        Intrinsics.checkNotNullParameter(activity, "it");
        activity = activity.getIntent();
        deeplinkManagerImpl.handleIntent((Intent)activity);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleDeeplink(Uri object) {
        Object object2 = "uri";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object2 = this.isDeeplinkRepository;
            boolean bl2 = true;
            object2.setDeeplinkClick(bl2);
            object2 = this.isDeeplinkRepository;
            String string2 = object.toString();
            String string3 = "uri.toString()";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            object2.setDeeplink(string2);
            object2 = this.deeplinkCallback;
            if (object2 == null) return;
            DeeplinkValue deeplinkValue = DeeplinkValueKt.toDeeplinkValue(object);
            object2.handleDeeplink(deeplinkValue);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        ActivityLifecycleCallback activityLifecycleCallback = this.onResumeSubscription;
                        if (activityLifecycleCallback != null) break block4;
                        activityLifecycleCallback = new aj0_0(this);
                        ActivityActionsManager activityActionsManager2 = this.activityActionsManager;
                        activityActionsManager2.addOnActivityResumedListener(activityLifecycleCallback);
                        this.onResumeSubscription = activityLifecycleCallback;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void setDeeplinkCallback(OnDeeplinkCallback onDeeplinkCallback) {
        this.deeplinkCallback = onDeeplinkCallback;
    }
}

