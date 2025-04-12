/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserInformationModel {
    private final String access_token;
    private final long expires_in;
    private final String message;
    private final boolean redirectToOTP;
    private final String refresh_token;

    public UserInformationModel() {
        this(null, null, 0L, false, null, 31, null);
    }

    public UserInformationModel(String string2, String string3, long l2, boolean bl2, String string4) {
        this.access_token = string2;
        this.refresh_token = string3;
        this.expires_in = l2;
        this.redirectToOTP = bl2;
        this.message = string4;
    }

    public /* synthetic */ UserInformationModel(String object, String object2, long l2, boolean bl2, String string2, int n3, DefaultConstructorMarker object3) {
        String string3;
        boolean bl3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        if (n7 != 0) {
            l2 = 0L;
        }
        long l3 = l2;
        n7 = n3 & 8;
        if (n7 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        object = this;
        object2 = object3;
        this((String)object3, (String)object4, l3, bl3, string3);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getRedirectToOTP() {
        return this.redirectToOTP;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }
}

