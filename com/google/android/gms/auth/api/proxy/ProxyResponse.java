/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProxyResponse
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int STATUS_CODE_NO_CONNECTION = 255;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;
    final int zza;
    final Bundle zzb;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public ProxyResponse(int n3, int n4, PendingIntent pendingIntent, int n7, Bundle bundle, byte[] byArray) {
        this.zza = n3;
        this.googlePlayServicesStatusCode = n4;
        this.statusCode = n7;
        this.zzb = bundle;
        this.body = byArray;
        this.recoveryAction = pendingIntent;
    }

    public ProxyResponse(int n3, PendingIntent pendingIntent, int n4, Bundle bundle, byte[] byArray) {
        this(1, n3, pendingIntent, n4, bundle, byArray);
    }

    public ProxyResponse(int n3, Map map2, byte[] byArray) {
        Bundle bundle = ProxyResponse.zza(map2);
        this(1, 0, null, n3, bundle, byArray);
    }

    public static ProxyResponse createErrorProxyResponse(int n3, PendingIntent pendingIntent, int n4, Map map2, byte[] byArray) {
        Bundle bundle = ProxyResponse.zza(map2);
        ProxyResponse proxyResponse = new ProxyResponse(1, n3, pendingIntent, n4, bundle, byArray);
        return proxyResponse;
    }

    private static Bundle zza(Map object) {
        boolean bl2;
        Bundle bundle = new Bundle();
        if (object == null) {
            return bundle;
        }
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            bundle.putString(string2, (String)object2);
        }
        return bundle;
    }

    public Map getHeaders() {
        boolean bl2;
        Object object = this.zzb;
        if (object == null) {
            return Collections.emptyMap();
        }
        object = new HashMap();
        Iterator iterator = this.zzb.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = this.zzb.getString(string2);
            ((HashMap)object).put(string2, string3);
        }
        return object;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.googlePlayServicesStatusCode;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        Object object = this.recoveryAction;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        int n8 = this.statusCode;
        SafeParcelWriter.writeInt(parcel, 3, n8);
        object = this.zzb;
        SafeParcelWriter.writeBundle(parcel, 4, (Bundle)object, false);
        object = this.body;
        SafeParcelWriter.writeByteArray(parcel, 5, (byte[])object, false);
        n8 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1000, n8);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

