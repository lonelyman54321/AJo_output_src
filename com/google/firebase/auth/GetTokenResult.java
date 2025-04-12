/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.auth;

import java.util.Map;

public class GetTokenResult {
    private String zza;
    private Map zzb;

    public GetTokenResult(String string2, Map map2) {
        this.zza = string2;
        this.zzb = map2;
    }

    private final long zza(String object) {
        Map map2 = this.zzb;
        if ((object = (Integer)map2.get(object)) == null) {
            return 0L;
        }
        return ((Integer)object).longValue();
    }

    public long getAuthTimestamp() {
        return this.zza("auth_time");
    }

    public Map getClaims() {
        return this.zzb;
    }

    public long getExpirationTimestamp() {
        return this.zza("exp");
    }

    public long getIssuedAtTimestamp() {
        return this.zza("iat");
    }

    public String getSignInProvider() {
        Map map2 = this.zzb;
        String string2 = "firebase";
        if ((map2 = (Map)map2.get(string2)) != null) {
            return (String)map2.get("sign_in_provider");
        }
        return null;
    }

    public String getSignInSecondFactor() {
        Map map2 = this.zzb;
        String string2 = "firebase";
        if ((map2 = (Map)map2.get(string2)) != null) {
            return (String)map2.get("sign_in_second_factor");
        }
        return null;
    }

    public String getToken() {
        return this.zza;
    }
}

