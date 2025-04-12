/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult$1;
import com.google.firebase.installations.AutoValue_InstallationTokenResult$Builder;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.installations.InstallationTokenResult$Builder;

final class AutoValue_InstallationTokenResult
extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(String string2, long l2, long l3) {
        this.token = string2;
        this.tokenExpirationTimestamp = l2;
        this.tokenCreationTimestamp = l3;
    }

    public /* synthetic */ AutoValue_InstallationTokenResult(String string2, long l2, long l3, AutoValue_InstallationTokenResult$1 autoValue_InstallationTokenResult$1) {
        this(string2, l2, l3);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof InstallationTokenResult;
        if (bl3) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            String string2 = this.token;
            String string3 = ((InstallationTokenResult)(object = (InstallationTokenResult)object)).getToken();
            bl3 = string2.equals(string3);
            if (!bl3 || (bl3 = (l8 = (l7 = this.tokenExpirationTimestamp) - (l4 = ((InstallationTokenResult)object).getTokenExpirationTimestamp())) == 0L ? 0 : (l8 < 0L ? -1 : 1)) || (l3 = (l2 = (l7 = this.tokenCreationTimestamp) - (l4 = ((InstallationTokenResult)object).getTokenCreationTimestamp())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getToken() {
        return this.token;
    }

    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int n3 = this.token.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        long l2 = this.tokenExpirationTimestamp;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 ^ n8) * n4;
        long l4 = this.tokenCreationTimestamp;
        long l7 = l4 >>> n7;
        int n10 = (int)(l4 ^ l7);
        return n3 ^ n10;
    }

    public InstallationTokenResult$Builder toBuilder() {
        AutoValue_InstallationTokenResult$Builder autoValue_InstallationTokenResult$Builder = new AutoValue_InstallationTokenResult$Builder(this, null);
        return autoValue_InstallationTokenResult$Builder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InstallationTokenResult{token=");
        String string2 = this.token;
        stringBuilder.append(string2);
        stringBuilder.append(", tokenExpirationTimestamp=");
        long l2 = this.tokenExpirationTimestamp;
        stringBuilder.append(l2);
        stringBuilder.append(", tokenCreationTimestamp=");
        l2 = this.tokenCreationTimestamp;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

