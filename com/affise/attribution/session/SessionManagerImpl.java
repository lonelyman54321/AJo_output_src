/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.os.SystemClock
 */
package com.affise.attribution.session;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.session.SessionData;
import com.affise.attribution.session.SessionManager;
import com.affise.attribution.session.SessionManagerImpl$Companion;
import com.affise.attribution.session.SessionManagerImpl$sessionStart$1;
import com.affise.attribution.session.SessionManagerImpl$subscribeToActivityEvents$1;
import com.affise.attribution.utils.DelayRunKt;
import com.affise.attribution.utils.TimestampKt;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class SessionManagerImpl
implements SessionManager {
    public static final SessionManagerImpl$Companion Companion;
    private static final long TIME_TO_START_SESSION = 15000L;
    private final CurrentActiveActivityCountProvider activityCountProvider;
    private Long closeAppDateTime;
    private boolean isOpenApp;
    private Long openAppTime;
    private final SharedPreferences preferences;
    private boolean sessionActive;
    private SessionData sessionData;

    static {
        SessionManagerImpl$Companion sessionManagerImpl$Companion;
        Companion = sessionManagerImpl$Companion = new SessionManagerImpl$Companion(null);
    }

    public SessionManagerImpl(SharedPreferences sharedPreferences2, CurrentActiveActivityCountProvider object) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "preferences");
        Intrinsics.checkNotNullParameter(object, "activityCountProvider");
        this.preferences = sharedPreferences2;
        this.activityCountProvider = object;
        String string2 = ProviderType.LIFETIME_SESSION_COUNT.getProvider();
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        string2 = ProviderType.AFFISE_SESSION_COUNT.getProvider();
        long l4 = sharedPreferences2.getLong(string2, l2);
        this.sessionData = object = new SessionData(l3, l4);
    }

    public static final /* synthetic */ void access$checkSessionToStart(SessionManagerImpl sessionManagerImpl) {
        sessionManagerImpl.checkSessionToStart();
    }

    public static final /* synthetic */ void access$saveSessionTime(SessionManagerImpl sessionManagerImpl) {
        sessionManagerImpl.saveSessionTime();
    }

    public static final /* synthetic */ long access$sessionTime(SessionManagerImpl sessionManagerImpl) {
        return sessionManagerImpl.sessionTime();
    }

    public static final /* synthetic */ void access$setCloseAppDateTime$p(SessionManagerImpl sessionManagerImpl, Long l2) {
        sessionManagerImpl.closeAppDateTime = l2;
    }

    public static final /* synthetic */ void access$setOpenApp$p(SessionManagerImpl sessionManagerImpl, boolean bl2) {
        sessionManagerImpl.isOpenApp = bl2;
    }

    public static final /* synthetic */ void access$setOpenAppTime$p(SessionManagerImpl sessionManagerImpl, Long l2) {
        sessionManagerImpl.openAppTime = l2;
    }

    public static final /* synthetic */ void access$setSessionActive$p(SessionManagerImpl sessionManagerImpl, boolean bl2) {
        sessionManagerImpl.sessionActive = bl2;
    }

    private final void addNewSession() {
        SessionData sessionData;
        long l2 = this.sessionData.getAffiseSessionCount() + 1L;
        this.sessionData = sessionData = SessionData.copy$default(this.sessionData, 0L, l2, 1, null);
        sessionData = this.preferences.edit();
        String string2 = ProviderType.AFFISE_SESSION_COUNT.getProvider();
        sessionData.putLong(string2, l2).commit();
    }

    private final void checkSessionToStart() {
        long l2;
        boolean bl2 = this.sessionActive;
        if (bl2) {
            return;
        }
        long l3 = this.sessionTime();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            this.sessionActive = bl2 = true;
            this.addNewSession();
        }
    }

    private final long getSaveSessionsTime() {
        return this.sessionData.getLifetimeSessionCount();
    }

    private final void saveSessionTime() {
        SessionData sessionData;
        long l2 = this.getLifetimeSessionTime();
        this.sessionData = sessionData = SessionData.copy$default(this.sessionData, l2, 0L, 2, null);
        sessionData = this.preferences.edit();
        String string2 = ProviderType.LIFETIME_SESSION_COUNT.getProvider();
        sessionData.putLong(string2, l2).commit();
    }

    private final long sessionTime() {
        Object object = this.sessionActive;
        long l2 = 0L;
        if (object != 0) {
            return l2;
        }
        Long l3 = this.openAppTime;
        if (l3 != null) {
            long l4 = l3;
            long l7 = SystemClock.elapsedRealtime() - l4;
            l4 = 15000L;
            long l8 = (l7 -= l4) - l2;
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object > 0) {
                return l7;
            }
        }
        return l2;
    }

    private final void subscribeToActivityEvents() {
        CurrentActiveActivityCountProvider currentActiveActivityCountProvider = this.activityCountProvider;
        SessionManagerImpl$subscribeToActivityEvents$1 sessionManagerImpl$subscribeToActivityEvents$1 = new SessionManagerImpl$subscribeToActivityEvents$1(this);
        currentActiveActivityCountProvider.addActivityCountListener(sessionManagerImpl$subscribeToActivityEvents$1);
    }

    public Long getLastInteractionTime() {
        Long l2;
        boolean bl2 = this.isOpenApp;
        if (bl2) {
            long l3 = TimestampKt.timestamp();
            l2 = l3;
        } else {
            l2 = this.closeAppDateTime;
        }
        return l2;
    }

    public long getLifetimeSessionTime() {
        long l2 = this.getSaveSessionsTime();
        return this.getSessionTime() + l2;
    }

    public long getSessionCount() {
        boolean bl2 = this.sessionActive;
        if (!bl2) {
            this.checkSessionToStart();
        }
        return this.sessionData.getAffiseSessionCount();
    }

    public long getSessionTime() {
        long l2;
        Long l3 = this.openAppTime;
        if (l3 != null) {
            long l4 = l3;
            l2 = SystemClock.elapsedRealtime() - l4;
        } else {
            l2 = 0L;
        }
        return l2;
    }

    public void init() {
        this.subscribeToActivityEvents();
    }

    public boolean isSessionActive() {
        this.checkSessionToStart();
        return this.sessionActive;
    }

    public void sessionStart() {
        boolean bl2;
        this.isOpenApp = bl2 = true;
        Serializable serializable = this.openAppTime;
        if (serializable == null) {
            long l2 = SystemClock.elapsedRealtime();
            this.openAppTime = serializable = Long.valueOf(l2);
        }
        serializable = new SessionManagerImpl$sessionStart$1(this);
        DelayRunKt.delayRun(15000L, (Function0)((Object)serializable));
    }
}

