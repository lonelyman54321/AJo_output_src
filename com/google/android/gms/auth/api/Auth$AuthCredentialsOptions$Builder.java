/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;

public class Auth$AuthCredentialsOptions$Builder {
    protected Boolean zba;
    protected String zbb;

    public Auth$AuthCredentialsOptions$Builder() {
        Boolean bl2;
        this.zba = bl2 = Boolean.FALSE;
    }

    public Auth$AuthCredentialsOptions$Builder(Auth$AuthCredentialsOptions object) {
        Boolean bl2;
        this.zba = bl2 = Boolean.FALSE;
        Auth$AuthCredentialsOptions.zbb((Auth$AuthCredentialsOptions)object);
        this.zba = bl2 = Boolean.valueOf(Auth$AuthCredentialsOptions.zbe((Auth$AuthCredentialsOptions)object));
        this.zbb = object = Auth$AuthCredentialsOptions.zbc((Auth$AuthCredentialsOptions)object);
    }

    public Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog() {
        Boolean bl2;
        this.zba = bl2 = Boolean.TRUE;
        return this;
    }

    public final Auth$AuthCredentialsOptions$Builder zba(String string2) {
        this.zbb = string2;
        return this;
    }
}

