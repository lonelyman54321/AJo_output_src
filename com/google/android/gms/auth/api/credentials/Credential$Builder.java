/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.List;

public class Credential$Builder {
    private final String zba;
    private String zbb;
    private Uri zbc;
    private List zbd;
    private String zbe;
    private String zbf;
    private String zbg;
    private String zbh;

    public Credential$Builder(Credential object) {
        Object object2 = Credential.zbe((Credential)object);
        this.zba = object2;
        object2 = Credential.zbf((Credential)object);
        this.zbb = object2;
        object2 = Credential.zba((Credential)object);
        this.zbc = object2;
        this.zbd = object2 = Credential.zbh((Credential)object);
        this.zbe = object2 = Credential.zbg((Credential)object);
        this.zbf = object2 = Credential.zbb((Credential)object);
        this.zbg = object2 = Credential.zbd((Credential)object);
        this.zbh = object = Credential.zbc((Credential)object);
    }

    public Credential$Builder(String string2) {
        this.zba = string2;
    }

    public Credential build() {
        String string2 = this.zba;
        String string3 = this.zbb;
        Uri uri = this.zbc;
        List list = this.zbd;
        String string4 = this.zbe;
        String string5 = this.zbf;
        String string6 = this.zbg;
        String string7 = this.zbh;
        Credential credential = new Credential(string2, string3, uri, list, string4, string5, string6, string7);
        return credential;
    }

    public Credential$Builder setAccountType(String string2) {
        this.zbf = string2;
        return this;
    }

    public Credential$Builder setName(String string2) {
        this.zbb = string2;
        return this;
    }

    public Credential$Builder setPassword(String string2) {
        this.zbe = string2;
        return this;
    }

    public Credential$Builder setProfilePictureUri(Uri uri) {
        this.zbc = uri;
        return this;
    }
}

