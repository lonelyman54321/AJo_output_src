/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Patterns
 */
package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.util.Patterns;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.Preconditions;

public class ProxyRequest$Builder {
    private final String zza;
    private int zzb;
    private long zzc;
    private byte[] zzd;
    private final Bundle zze;

    public ProxyRequest$Builder(String string2) {
        long l2;
        int n3;
        this.zzb = n3 = ProxyRequest.HTTP_METHOD_GET;
        this.zzc = l2 = 3000L;
        Object object = new byte[]{};
        this.zzd = object;
        object = new Bundle;
        this.zze = (Bundle)object;
        Preconditions.checkNotEmpty(string2);
        object = Patterns.WEB_URL.matcher(string2);
        n3 = (int)(object.matches() ? 1 : 0);
        if (n3 != 0) {
            this.zza = string2;
            return;
        }
        string2 = cP.a("The supplied url [ ", string2, "] is not match Patterns.WEB_URL!");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public ProxyRequest build() {
        Object object = this.zzd;
        if (object == null) {
            this.zzd = object = new byte[0];
        }
        object = new ProxyRequest;
        String string2 = this.zza;
        int n3 = this.zzb;
        long l2 = this.zzc;
        byte[] byArray = this.zzd;
        Bundle bundle = this.zze;
        object(2, string2, n3, l2, byArray, bundle);
        return object;
    }

    public ProxyRequest$Builder putHeader(String string2, String string3) {
        Preconditions.checkNotEmpty(string2, "Header name cannot be null or empty!");
        Bundle bundle = this.zze;
        if (string3 == null) {
            string3 = "";
        }
        bundle.putString(string2, string3);
        return this;
    }

    public ProxyRequest$Builder setBody(byte[] byArray) {
        this.zzd = byArray;
        return this;
    }

    public ProxyRequest$Builder setHttpMethod(int n3) {
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 <= (n4 = ProxyRequest.LAST_CODE)) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Unrecognized http method code.");
        this.zzb = n3;
        return this;
    }

    public ProxyRequest$Builder setTimeoutMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "The specified timeout must be non-negative.");
        this.zzc = l2;
        return this;
    }
}

