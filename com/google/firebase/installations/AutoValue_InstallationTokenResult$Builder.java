/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;
import com.google.firebase.installations.AutoValue_InstallationTokenResult$1;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.installations.InstallationTokenResult$Builder;

final class AutoValue_InstallationTokenResult$Builder
extends InstallationTokenResult$Builder {
    private String token;
    private Long tokenCreationTimestamp;
    private Long tokenExpirationTimestamp;

    public AutoValue_InstallationTokenResult$Builder() {
    }

    private AutoValue_InstallationTokenResult$Builder(InstallationTokenResult object) {
        Object object2 = ((InstallationTokenResult)object).getToken();
        this.token = object2;
        this.tokenExpirationTimestamp = object2 = Long.valueOf(((InstallationTokenResult)object).getTokenExpirationTimestamp());
        this.tokenCreationTimestamp = object = Long.valueOf(((InstallationTokenResult)object).getTokenCreationTimestamp());
    }

    public /* synthetic */ AutoValue_InstallationTokenResult$Builder(InstallationTokenResult installationTokenResult, AutoValue_InstallationTokenResult$1 autoValue_InstallationTokenResult$1) {
        this(installationTokenResult);
    }

    public InstallationTokenResult build() {
        boolean bl2;
        Object object = this.token;
        object = object == null ? " token" : "";
        Object object2 = this.tokenExpirationTimestamp;
        if (object2 == null) {
            object2 = " tokenExpirationTimestamp";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.tokenCreationTimestamp) == null) {
            object2 = " tokenCreationTimestamp";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            String string2 = this.token;
            long l2 = this.tokenExpirationTimestamp;
            long l3 = this.tokenCreationTimestamp;
            object = new AutoValue_InstallationTokenResult(string2, l2, l3, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public InstallationTokenResult$Builder setToken(String object) {
        if (object != null) {
            this.token = object;
            return this;
        }
        object = new NullPointerException("Null token");
        throw object;
    }

    public InstallationTokenResult$Builder setTokenCreationTimestamp(long l2) {
        Long l3;
        this.tokenCreationTimestamp = l3 = Long.valueOf(l2);
        return this;
    }

    public InstallationTokenResult$Builder setTokenExpirationTimestamp(long l2) {
        Long l3;
        this.tokenExpirationTimestamp = l3 = Long.valueOf(l2);
        return this;
    }
}

