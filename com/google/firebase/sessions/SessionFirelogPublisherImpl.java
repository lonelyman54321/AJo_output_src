/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.EventGDTLoggerInterface;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionFirelogPublisher;
import com.google.firebase.sessions.SessionFirelogPublisherImpl$Companion;
import com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1;
import com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class SessionFirelogPublisherImpl
implements SessionFirelogPublisher {
    public static final SessionFirelogPublisherImpl$Companion Companion;
    private static final String TAG = "SessionFirelogPublisher";
    private static final double randomValueForSampling;
    private final CoroutineContext backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final SessionsSettings sessionSettings;

    static {
        SessionFirelogPublisherImpl$Companion sessionFirelogPublisherImpl$Companion;
        Companion = sessionFirelogPublisherImpl$Companion = new SessionFirelogPublisherImpl$Companion(null);
        randomValueForSampling = Math.random();
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLoggerInterface, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(coroutineContext, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.sessionSettings = sessionsSettings;
        this.eventGDTLogger = eventGDTLoggerInterface;
        this.backgroundDispatcher = coroutineContext;
    }

    public static final /* synthetic */ void access$attemptLoggingSessionEvent(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionEvent sessionEvent) {
        sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvent);
    }

    public static final /* synthetic */ FirebaseApp access$getFirebaseApp$p(SessionFirelogPublisherImpl sessionFirelogPublisherImpl) {
        return sessionFirelogPublisherImpl.firebaseApp;
    }

    public static final /* synthetic */ FirebaseInstallationsApi access$getFirebaseInstallations$p(SessionFirelogPublisherImpl sessionFirelogPublisherImpl) {
        return sessionFirelogPublisherImpl.firebaseInstallations;
    }

    public static final /* synthetic */ SessionsSettings access$getSessionSettings$p(SessionFirelogPublisherImpl sessionFirelogPublisherImpl) {
        return sessionFirelogPublisherImpl.sessionSettings;
    }

    public static final /* synthetic */ Object access$shouldLogSession(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, f80_0 f80_02) {
        return sessionFirelogPublisherImpl.shouldLogSession(f80_02);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        EventGDTLoggerInterface eventGDTLoggerInterface;
        try {
            eventGDTLoggerInterface = this.eventGDTLogger;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        eventGDTLoggerInterface.log(sessionEvent);
    }

    private final boolean shouldCollectEvents() {
        double d2 = randomValueForSampling;
        SessionsSettings sessionsSettings = this.sessionSettings;
        double d5 = sessionsSettings.getSamplingRate();
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        boolean bl2 = object <= 0;
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    private final Object shouldLogSession(f80_0 var1_1) {
        var2_2 = var1_1 instanceof SessionFirelogPublisherImpl$shouldLogSession$1;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (SessionFirelogPublisherImpl$shouldLogSession$1)var1_1;
        var4_4 = var3_3.label;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.label = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new SessionFirelogPublisherImpl$shouldLogSession$1(this, (f80_0)var1_1);
        }
        var1_1 = var3_3.result;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.label;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl23
        if (var5_5 == var6_6) {
            var3_3 = (SessionFirelogPublisherImpl)var3_3.L$0;
            vl2_2.b(var1_1);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var1_1);
            var1_1 = this.sessionSettings;
            var3_3.L$0 = this;
            var3_3.label = var6_6;
            var1_1 = var1_1.updateSettings((f80_0)var3_3);
            if (var1_1 == var7_7) {
                return var7_7;
            }
            var3_3 = this;
        }
        var1_1 = var3_3.sessionSettings;
        var8_8 = var1_1.getSessionsEnabled();
        if (!var8_8) {
            return Boolean.FALSE;
        }
        var8_8 = super.shouldCollectEvents();
        if (!var8_8) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public void logSession(SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        c80 c802 = d.a(this.backgroundDispatcher);
        SessionFirelogPublisherImpl$logSession$1 sessionFirelogPublisherImpl$logSession$1 = new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, null);
        Ae3.d(c802, null, null, sessionFirelogPublisherImpl$logSession$1, 3);
    }
}

