/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsStore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.api.SessionSubscriber$SessionDetails;

public class CrashlyticsAppQualitySessionsSubscriber
implements SessionSubscriber {
    private final CrashlyticsAppQualitySessionsStore appQualitySessionsStore;
    private final DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter object, FileStore fileStore) {
        this.dataCollectionArbiter = object;
        this.appQualitySessionsStore = object = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    public String getAppQualitySessionId(String string2) {
        return this.appQualitySessionsStore.getAppQualitySessionId(string2);
    }

    public SessionSubscriber$Name getSessionSubscriberName() {
        return SessionSubscriber$Name.CRASHLYTICS;
    }

    public boolean isDataCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void onSessionChanged(SessionSubscriber$SessionDetails object) {
        Object object2 = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("App Quality Sessions session changed: ");
        charSequence.append(object);
        charSequence = charSequence.toString();
        ((Logger)object2).d((String)charSequence);
        object2 = this.appQualitySessionsStore;
        object = ((SessionSubscriber$SessionDetails)object).getSessionId();
        ((CrashlyticsAppQualitySessionsStore)object2).rotateAppQualitySessionId((String)object);
    }

    public void setSessionId(String string2) {
        this.appQualitySessionsStore.rotateSessionId(string2);
    }
}

