/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.CachedSettingsIo;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior;
import com.google.firebase.crashlytics.internal.settings.SettingsController$1;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonParser;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.settings.SettingsRequest;
import com.google.firebase.crashlytics.internal.settings.SettingsSpiCall;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class SettingsController
implements SettingsProvider {
    private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private static final String SETTINGS_URL_FORMAT = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final CachedSettingsIo cachedSettingsIo;
    private final Context context;
    private final CurrentTimeProvider currentTimeProvider;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final AtomicReference settings;
    private final SettingsJsonParser settingsJsonParser;
    private final SettingsRequest settingsRequest;
    private final SettingsSpiCall settingsSpiCall;
    private final AtomicReference settingsTask;

    public SettingsController(Context object, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<TaskCompletionSource> atomicReference;
        AtomicReference<Context> atomicReference2;
        this.settings = atomicReference2 = new AtomicReference<Context>();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.settingsTask = atomicReference = new AtomicReference<TaskCompletionSource>(taskCompletionSource);
        this.context = object;
        this.settingsRequest = settingsRequest;
        this.currentTimeProvider = currentTimeProvider;
        this.settingsJsonParser = settingsJsonParser;
        this.cachedSettingsIo = cachedSettingsIo;
        this.settingsSpiCall = settingsSpiCall;
        this.dataCollectionArbiter = dataCollectionArbiter;
        object = DefaultSettingsJsonTransform.defaultSettings(currentTimeProvider);
        atomicReference2.set((Context)object);
    }

    public static /* synthetic */ SettingsJsonParser access$000(SettingsController settingsController) {
        return settingsController.settingsJsonParser;
    }

    public static /* synthetic */ CachedSettingsIo access$100(SettingsController settingsController) {
        return settingsController.cachedSettingsIo;
    }

    public static /* synthetic */ void access$200(SettingsController settingsController, JSONObject jSONObject, String string2) {
        settingsController.logSettings(jSONObject, string2);
    }

    public static /* synthetic */ SettingsRequest access$300(SettingsController settingsController) {
        return settingsController.settingsRequest;
    }

    public static /* synthetic */ boolean access$400(SettingsController settingsController, String string2) {
        return settingsController.setStoredBuildInstanceIdentifier(string2);
    }

    public static /* synthetic */ AtomicReference access$500(SettingsController settingsController) {
        return settingsController.settings;
    }

    public static /* synthetic */ AtomicReference access$600(SettingsController settingsController) {
        return settingsController.settingsTask;
    }

    public static /* synthetic */ SettingsSpiCall access$700(SettingsController settingsController) {
        return settingsController.settingsSpiCall;
    }

    public static SettingsController create(Context context, String string2, IdManager idManager, HttpRequestFactory httpRequestFactory, String string3, String string4, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        SettingsRequest settingsRequest;
        Object object = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        Object object2 = fileStore;
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        object2 = Locale.US;
        object2 = cP.a("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", string2, "/settings");
        Object object3 = httpRequestFactory;
        DefaultSettingsSpiCall defaultSettingsSpiCall = new DefaultSettingsSpiCall((String)object2, httpRequestFactory);
        object2 = idManager.getModelName();
        object3 = idManager.getOsBuildVersionString();
        Object object4 = idManager.getOsDisplayVersionString();
        Object object5 = CommonUtils.getMappingFileId(context);
        Object object6 = CommonUtils.createInstanceIdFrom(new String[]{object5, string2, string4, string3});
        int n3 = DeliveryMechanism.determineFrom((String)object).getId();
        object = settingsRequest;
        object5 = idManager;
        settingsRequest = new SettingsRequest(string2, (String)object2, (String)object3, (String)object4, idManager, (String)object6, string4, string3, n3);
        object2 = context;
        object3 = settingsRequest;
        object4 = systemCurrentTimeProvider;
        object5 = settingsJsonParser;
        object6 = cachedSettingsIo;
        object = new SettingsController(context, settingsRequest, systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, defaultSettingsSpiCall, dataCollectionArbiter);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Settings getCachedSettingsData(SettingsCacheBehavior object) {
        void var1_4;
        Object object2;
        Object object3;
        Object object4;
        block8: {
            block5: {
                block6: {
                    block7: {
                        object4 = null;
                        try {
                            object3 = SettingsCacheBehavior.SKIP_CACHE_LOOKUP;
                            boolean bl2 = object3.equals(object);
                            if (bl2) return object4;
                            object3 = this.cachedSettingsIo;
                            if ((object3 = ((CachedSettingsIo)object3).readCachedSettings()) == null) break block5;
                            object2 = this.settingsJsonParser;
                            if ((object2 = ((SettingsJsonParser)object2).parseSettingsJson((JSONObject)object3)) == null) break block6;
                            String string2 = "Loaded cached settings: ";
                            this.logSettings((JSONObject)object3, string2);
                            object3 = this.currentTimeProvider;
                            long l2 = object3.getCurrentTimeMillis();
                            object3 = SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION;
                            boolean bl3 = object3.equals(object);
                            if (bl3 || !(bl3 = ((Settings)object2).isExpired(l2))) break block7;
                            object = Logger.getLogger();
                            object3 = "Cached settings have expired.";
                            ((Logger)object).v((String)object3);
                            return object4;
                        }
                        catch (Exception exception) {}
                    }
                    try {
                        object = Logger.getLogger();
                        object4 = "Returning cached settings.";
                        ((Logger)object).v((String)object4);
                        return object2;
                    }
                    catch (Exception exception) {
                        object4 = object2;
                    }
                    break block8;
                }
                object = Logger.getLogger();
                object3 = "Failed to parse cached settings data.";
                ((Logger)object).e((String)object3, null);
                return object4;
                break block8;
            }
            object = Logger.getLogger();
            object3 = "No cached settings data found.";
            ((Logger)object).d((String)object3);
            return object4;
        }
        object3 = Logger.getLogger();
        object2 = "Failed to get cached settings";
        ((Logger)object3).e((String)object2, (Throwable)var1_4);
        return object4;
    }

    private String getStoredBuildInstanceIdentifier() {
        return CommonUtils.getSharedPrefs(this.context).getString(PREFS_BUILD_INSTANCE_IDENTIFIER, "");
    }

    private void logSettings(JSONObject object, String charSequence) {
        Logger logger = Logger.getLogger();
        charSequence = Ex0.a((String)charSequence);
        object = object.toString();
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        logger.d((String)object);
    }

    private boolean setStoredBuildInstanceIdentifier(String string2) {
        SharedPreferences.Editor editor = CommonUtils.getSharedPrefs(this.context).edit();
        editor.putString(PREFS_BUILD_INSTANCE_IDENTIFIER, string2);
        editor.apply();
        return true;
    }

    public boolean buildInstanceIdentifierChanged() {
        String string2 = this.getStoredBuildInstanceIdentifier();
        String string3 = this.settingsRequest.instanceId;
        return string2.equals(string3) ^ true;
    }

    public Task getSettingsAsync() {
        return ((TaskCompletionSource)this.settingsTask.get()).getTask();
    }

    public Settings getSettingsSync() {
        return (Settings)this.settings.get();
    }

    public Task loadSettingsData(CrashlyticsWorkers crashlyticsWorkers) {
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        return this.loadSettingsData(settingsCacheBehavior, crashlyticsWorkers);
    }

    public Task loadSettingsData(SettingsCacheBehavior object, CrashlyticsWorkers crashlyticsWorkers) {
        Object object2;
        boolean bl2 = this.buildInstanceIdentifierChanged();
        if (!bl2 && (object = this.getCachedSettingsData((SettingsCacheBehavior)((Object)object))) != null) {
            this.settings.set(object);
            ((TaskCompletionSource)this.settingsTask.get()).trySetResult(object);
            return Tasks.forResult(null);
        }
        object = SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION;
        if ((object = this.getCachedSettingsData((SettingsCacheBehavior)((Object)object))) != null) {
            this.settings.set(object);
            object2 = (TaskCompletionSource)this.settingsTask.get();
            ((TaskCompletionSource)object2).trySetResult(object);
        }
        object = this.dataCollectionArbiter.waitForDataCollectionPermission();
        object2 = crashlyticsWorkers.common;
        SettingsController$1 settingsController$1 = new SettingsController$1(this, crashlyticsWorkers);
        return ((Task)object).onSuccessTask((Executor)object2, settingsController$1);
    }
}

