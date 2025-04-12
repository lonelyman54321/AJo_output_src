/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
import com.google.android.gms.common.internal.Objects;

public class Auth$AuthCredentialsOptions
implements Api$ApiOptions$Optional {
    public static final Auth$AuthCredentialsOptions zba;
    private final String zbb;
    private final boolean zbc;
    private final String zbd;

    static {
        Auth$AuthCredentialsOptions auth$AuthCredentialsOptions;
        Auth$AuthCredentialsOptions$Builder auth$AuthCredentialsOptions$Builder = new Auth$AuthCredentialsOptions$Builder();
        zba = auth$AuthCredentialsOptions = new Auth$AuthCredentialsOptions(auth$AuthCredentialsOptions$Builder);
    }

    public Auth$AuthCredentialsOptions(Auth$AuthCredentialsOptions$Builder object) {
        boolean bl2;
        this.zbb = null;
        this.zbc = bl2 = ((Auth$AuthCredentialsOptions$Builder)object).zba.booleanValue();
        this.zbd = object = ((Auth$AuthCredentialsOptions$Builder)object).zbb;
    }

    public static /* bridge */ /* synthetic */ String zbb(Auth$AuthCredentialsOptions object) {
        object = ((Auth$AuthCredentialsOptions)object).zbb;
        return null;
    }

    public static /* bridge */ /* synthetic */ String zbc(Auth$AuthCredentialsOptions auth$AuthCredentialsOptions) {
        return auth$AuthCredentialsOptions.zbd;
    }

    public static /* bridge */ /* synthetic */ boolean zbe(Auth$AuthCredentialsOptions auth$AuthCredentialsOptions) {
        return auth$AuthCredentialsOptions.zbc;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = true;
        if (object == this) {
            return bl4;
        }
        boolean bl5 = object instanceof Auth$AuthCredentialsOptions;
        if (!bl5) {
            return false;
        }
        object = (Auth$AuthCredentialsOptions)object;
        String string2 = ((Auth$AuthCredentialsOptions)object).zbb;
        string2 = null;
        bl5 = Objects.equal(null, null);
        if (bl5 && (bl5 = this.zbc) == (bl3 = ((Auth$AuthCredentialsOptions)object).zbc) && (bl2 = Objects.equal(string2 = this.zbd, object = ((Auth$AuthCredentialsOptions)object).zbd))) {
            return bl4;
        }
        return false;
    }

    public int hashCode() {
        Boolean bl2 = this.zbc;
        String string2 = this.zbd;
        Object[] objectArray = new Object[]{null, bl2, string2};
        return Objects.hashCode(objectArray);
    }

    public final Bundle zba() {
        Bundle bundle = E1.a("consumer_package", null);
        boolean bl2 = this.zbc;
        bundle.putBoolean("force_save_dialog", bl2);
        String string2 = this.zbd;
        bundle.putString("log_session_id", string2);
        return bundle;
    }

    public final String zbd() {
        return this.zbd;
    }
}

