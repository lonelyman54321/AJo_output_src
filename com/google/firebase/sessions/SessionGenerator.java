/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionGenerator$1;
import com.google.firebase.sessions.SessionGenerator$Companion;
import com.google.firebase.sessions.TimeProvider;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class SessionGenerator {
    public static final SessionGenerator$Companion Companion;
    private SessionDetails currentSession;
    private final String firstSessionId;
    private int sessionIndex;
    private final TimeProvider timeProvider;
    private final Function0 uuidGenerator;

    static {
        SessionGenerator$Companion sessionGenerator$Companion;
        Companion = sessionGenerator$Companion = new SessionGenerator$Companion(null);
    }

    public SessionGenerator(TimeProvider object, Function0 function0) {
        Intrinsics.checkNotNullParameter(object, "timeProvider");
        Intrinsics.checkNotNullParameter(function0, "uuidGenerator");
        this.timeProvider = object;
        this.uuidGenerator = function0;
        this.firstSessionId = object = this.generateSessionId();
        this.sessionIndex = -1;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, Function0 function0, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            function0 = SessionGenerator$1.INSTANCE;
        }
        this(timeProvider, function0);
    }

    private final String generateSessionId() {
        String string2 = ((UUID)this.uuidGenerator.invoke()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "uuidGenerator().toString()");
        string2 = b.n(string2, "-", "", false);
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final SessionDetails generateNewSession() {
        SessionDetails sessionDetails;
        int n3;
        this.sessionIndex = n3 = this.sessionIndex + 1;
        String string2 = n3 == 0 ? this.firstSessionId : this.generateSessionId();
        String string3 = string2;
        String string4 = this.firstSessionId;
        int n4 = this.sessionIndex;
        long l2 = this.timeProvider.currentTimeUs();
        this.currentSession = sessionDetails = new SessionDetails(string3, string4, n4, l2);
        return this.getCurrentSession();
    }

    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentSession");
        return null;
    }

    public final boolean getHasGenerateSession() {
        boolean bl2;
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            bl2 = true;
        } else {
            bl2 = false;
            sessionDetails = null;
        }
        return bl2;
    }
}

