/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.settings.CachedSettingsIo;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.settings.SettingsRequest;
import com.google.firebase.crashlytics.internal.settings.SettingsSpiCall;
import com.google.firebase.crashlytics.internal.settings.a;
import org.json.JSONObject;

class SettingsController$1
implements SuccessContinuation {
    final /* synthetic */ SettingsController this$0;
    final /* synthetic */ CrashlyticsWorkers val$crashlyticsWorkers;

    public SettingsController$1(SettingsController settingsController, CrashlyticsWorkers crashlyticsWorkers) {
        this.this$0 = settingsController;
        this.val$crashlyticsWorkers = crashlyticsWorkers;
    }

    public static /* synthetic */ JSONObject a(SettingsController$1 settingsController$1) {
        return settingsController$1.lambda$then$0();
    }

    private /* synthetic */ JSONObject lambda$then$0() {
        SettingsSpiCall settingsSpiCall = SettingsController.access$700(this.this$0);
        SettingsRequest settingsRequest = SettingsController.access$300(this.this$0);
        return settingsSpiCall.invoke(settingsRequest, true);
    }

    public Task then(Void object) {
        object = this.val$crashlyticsWorkers.network.getExecutor();
        Object object2 = new a(this);
        if ((object = (JSONObject)object.submit(object2).get()) != null) {
            object2 = SettingsController.access$000(this.this$0).parseSettingsJson((JSONObject)object);
            Object object3 = SettingsController.access$100(this.this$0);
            long l2 = ((Settings)object2).expiresAtMillis;
            ((CachedSettingsIo)object3).writeCachedSettings(l2, (JSONObject)object);
            object3 = this.this$0;
            String string2 = "Loaded settings: ";
            SettingsController.access$200((SettingsController)object3, (JSONObject)object, string2);
            object = this.this$0;
            object3 = SettingsController.access$300((SettingsController)object).instanceId;
            SettingsController.access$400((SettingsController)object, (String)object3);
            SettingsController.access$500(this.this$0).set(object2);
            object = (TaskCompletionSource)SettingsController.access$600(this.this$0).get();
            ((TaskCompletionSource)object).trySetResult(object2);
        }
        return Tasks.forResult(null);
    }
}

