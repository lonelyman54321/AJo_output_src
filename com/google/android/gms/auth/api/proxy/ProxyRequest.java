/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.zza;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int HTTP_METHOD_DELETE = 0;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_OPTIONS = 0;
    public static final int HTTP_METHOD_PATCH = 0;
    public static final int HTTP_METHOD_POST = 0;
    public static final int HTTP_METHOD_PUT = 0;
    public static final int HTTP_METHOD_TRACE = 0;
    public static final int LAST_CODE = 0;
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    final int zza;
    Bundle zzb;

    static {
        int n3;
        zza zza2 = new zza();
        CREATOR = zza2;
        HTTP_METHOD_GET = 0;
        HTTP_METHOD_POST = 1;
        HTTP_METHOD_PUT = 2;
        HTTP_METHOD_DELETE = 3;
        HTTP_METHOD_HEAD = 4;
        HTTP_METHOD_OPTIONS = 5;
        HTTP_METHOD_TRACE = 6;
        HTTP_METHOD_PATCH = n3 = 7;
        LAST_CODE = n3;
    }

    public ProxyRequest(int n3, String string2, int n4, long l2, byte[] byArray, Bundle bundle) {
        this.zza = n3;
        this.url = string2;
        this.httpMethod = n4;
        this.timeoutMillis = l2;
        this.body = byArray;
        this.zzb = bundle;
    }

    public Map getHeaderMap() {
        boolean bl2;
        int n3 = this.zzb.size();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(n3);
        Iterator iterator = this.zzb.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = this.zzb.getString(string2);
            if (string3 == null) {
                string3 = "";
            }
            linkedHashMap.put(string2, string3);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String string2 = this.url;
        int n3 = this.httpMethod;
        StringBuilder stringBuilder = new StringBuilder("ProxyRequest[ url: ");
        stringBuilder.append(string2);
        stringBuilder.append(", method: ");
        stringBuilder.append(n3);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.url;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        int n4 = this.httpMethod;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        long l2 = this.timeoutMillis;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        Object object = this.body;
        SafeParcelWriter.writeByteArray(parcel, 4, object, false);
        object = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 5, (Bundle)object, false);
        n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1000, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

