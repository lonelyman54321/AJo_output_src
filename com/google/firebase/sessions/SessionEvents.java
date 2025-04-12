/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.AutoSessionEventEncoder;
import com.google.firebase.sessions.DataCollectionState;
import com.google.firebase.sessions.DataCollectionStatus;
import com.google.firebase.sessions.EventType;
import com.google.firebase.sessions.LogEnvironment;
import com.google.firebase.sessions.ProcessDetails;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionInfo;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class SessionEvents {
    public static final SessionEvents INSTANCE;
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        Object object = new SessionEvents();
        INSTANCE = object;
        object = new JsonDataEncoderBuilder();
        Configurator configurator = AutoSessionEventEncoder.CONFIG;
        object = ((JsonDataEncoderBuilder)object).configureWith(configurator).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(object, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = object;
    }

    private SessionEvents() {
    }

    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map2, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 8;
        if (n4 != 0) {
            map2 = fh1_2.f();
        }
        Map map3 = map2;
        int n7 = n3 & 0x10;
        object = "";
        Object object2 = n7 != 0 ? object : string2;
        n7 = n3 & 0x20;
        Object object3 = n7 != 0 ? object : string3;
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, map3, (String)object2, (String)object3);
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber object) {
        boolean bl2;
        object = object == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : ((bl2 = object.isDataCollectionEnabled()) ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED);
        return object;
    }

    public final SessionEvent buildSession(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map2, String string2, String string3) {
        SessionInfo sessionInfo;
        Object object = map2;
        Object object2 = firebaseApp;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Object object3 = sessionDetails;
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Object object4 = sessionsSettings;
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(map2, "subscribers");
        Intrinsics.checkNotNullParameter(string2, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(string3, "firebaseAuthenticationToken");
        EventType eventType = EventType.SESSION_START;
        String string4 = sessionDetails.getSessionId();
        String string5 = sessionDetails.getFirstSessionId();
        int n3 = sessionDetails.getSessionIndex();
        long l2 = sessionDetails.getSessionStartTimestampUs();
        object3 = SessionSubscriber$Name.PERFORMANCE;
        object3 = (SessionSubscriber)map2.get(object3);
        object3 = this.toDataCollectionState((SessionSubscriber)object3);
        object2 = SessionSubscriber$Name.CRASHLYTICS;
        object = (SessionSubscriber)map2.get(object2);
        object = this.toDataCollectionState((SessionSubscriber)object);
        double d2 = sessionsSettings.getSamplingRate();
        DataCollectionStatus dataCollectionStatus = new DataCollectionStatus((DataCollectionState)object3, (DataCollectionState)object, d2);
        object3 = sessionInfo;
        object4 = string4;
        string4 = string5;
        sessionInfo = new SessionInfo((String)object4, string5, n3, l2, dataCollectionStatus, string2, string3);
        object = this.getApplicationInfo(firebaseApp);
        SessionEvent sessionEvent = new SessionEvent(eventType, sessionInfo, (ApplicationInfo)object);
        return sessionEvent;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ApplicationInfo getApplicationInfo(FirebaseApp firebaseApp) {
        ApplicationInfo applicationInfo;
        AndroidApplicationInfo androidApplicationInfo;
        FirebaseApp firebaseApp2 = firebaseApp;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Object object = firebaseApp.getApplicationContext();
        String string2 = "firebaseApp.applicationContext";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        String string3 = object.getPackageName();
        object = object.getPackageManager();
        Object object2 = null;
        object = object.getPackageInfo(string3, 0);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            long l2 = ep.a((PackageInfo)object);
            object2 = String.valueOf(l2);
        } else {
            n3 = ((PackageInfo)object).versionCode;
            object2 = String.valueOf(n3);
        }
        String string4 = object2;
        String string5 = firebaseApp.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(string5, "firebaseApp.options.applicationId");
        String string6 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(string6, "MODEL");
        Object object3 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(object3, "RELEASE");
        Object object4 = LogEnvironment.LOG_ENVIRONMENT_PROD;
        object2 = "packageName";
        Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
        object = ((PackageInfo)object).versionName;
        Object object5 = object == null ? string4 : object;
        Object object6 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(object6, "MANUFACTURER");
        object = ProcessDetailsProvider.INSTANCE;
        object2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Object object7 = ((ProcessDetailsProvider)object).getCurrentProcessDetails((Context)object2);
        firebaseApp2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(firebaseApp2, string2);
        Object object8 = ((ProcessDetailsProvider)object).getAppProcessDetails((Context)firebaseApp2);
        object2 = androidApplicationInfo;
        androidApplicationInfo = new AndroidApplicationInfo(string3, (String)object5, string4, (String)object6, (ProcessDetails)object7, (List)object8);
        object6 = applicationInfo;
        object7 = string5;
        object8 = string6;
        string5 = "2.0.8";
        string6 = object3;
        object3 = object4;
        object4 = androidApplicationInfo;
        return new ApplicationInfo((String)object7, (String)object8, string5, string6, (LogEnvironment)object3, androidApplicationInfo);
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}

