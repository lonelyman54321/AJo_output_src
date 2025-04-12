/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.firebase.sessions;

import android.util.Base64;
import com.google.firebase.sessions.ProcessDetailsProvider;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class SessionDataStoreConfigs {
    public static final SessionDataStoreConfigs INSTANCE;
    private static final String PROCESS_NAME;
    private static final String SESSIONS_CONFIG_NAME;
    private static final String SETTINGS_CONFIG_NAME;

    static {
        Object object = new SessionDataStoreConfigs();
        INSTANCE = object;
        object = ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object, "getBytes(...)");
        PROCESS_NAME = object = Base64.encodeToString((byte[])object, (int)10);
        object2 = "firebase_session_";
        SESSIONS_CONFIG_NAME = cP.a((String)object2, (String)object, "_data");
        SETTINGS_CONFIG_NAME = cP.a((String)object2, (String)object, "_settings");
    }

    private SessionDataStoreConfigs() {
    }

    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}

