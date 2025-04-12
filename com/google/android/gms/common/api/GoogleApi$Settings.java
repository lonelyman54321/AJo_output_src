/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Looper
 */
package com.google.android.gms.common.api;

import android.accounts.Account;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.zae;

public class GoogleApi$Settings {
    public static final GoogleApi$Settings DEFAULT_SETTINGS;
    public final StatusExceptionMapper zaa;
    public final Looper zab;

    static {
        GoogleApi$Settings$Builder googleApi$Settings$Builder = new GoogleApi$Settings$Builder();
        DEFAULT_SETTINGS = googleApi$Settings$Builder.build();
    }

    private GoogleApi$Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
        this.zaa = statusExceptionMapper;
        this.zab = looper;
    }

    public /* synthetic */ GoogleApi$Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, zae zae2) {
        this(statusExceptionMapper, null, looper);
    }
}

