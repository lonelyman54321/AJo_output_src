/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzbz
extends FastSafeParcelableJsonResponse {
    public final byte[] toByteArray() {
        String string2;
        String string3;
        try {
            string3 = this.toString();
            string2 = "UTF-8";
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return null;
        }
        return string3.getBytes(string2);
    }
}

