/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.IntentSender
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.zze;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.PlatformVersion;
import kotlin.jvm.internal.Intrinsics;

public final class Status
extends AbstractSafeParcelable
implements Result,
ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Status RESULT_CANCELED;
    public static final Status RESULT_DEAD_CLIENT;
    public static final Status RESULT_INTERNAL_ERROR;
    public static final Status RESULT_INTERRUPTED;
    public static final Status RESULT_SUCCESS;
    public static final Status RESULT_SUCCESS_CACHE;
    public static final Status RESULT_TIMEOUT;
    public static final Status zza;
    private final int zzb;
    private final String zzc;
    private final PendingIntent zzd;
    private final ConnectionResult zze;

    static {
        Object object = new Status(-1);
        RESULT_SUCCESS_CACHE = object;
        object = new Status(0);
        RESULT_SUCCESS = object;
        object = new Status(14);
        RESULT_INTERRUPTED = object;
        object = new Status(8);
        RESULT_INTERNAL_ERROR = object;
        object = new Status(15);
        RESULT_TIMEOUT = object;
        object = new Status(16);
        RESULT_CANCELED = object;
        object = new Status(17);
        zza = object;
        object = new Status(18);
        RESULT_DEAD_CLIENT = object;
        object = new zze();
        CREATOR = object;
    }

    public Status(int n3) {
        this(n3, null);
    }

    public Status(int n3, String string2) {
        this(n3, string2, null);
    }

    public Status(int n3, String string2, PendingIntent pendingIntent) {
        this(n3, string2, pendingIntent, null);
    }

    public Status(int n3, String string2, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.zzb = n3;
        this.zzc = string2;
        this.zzd = pendingIntent;
        this.zze = connectionResult;
    }

    public Status(ConnectionResult connectionResult, String string2) {
        this(connectionResult, string2, 17);
    }

    public Status(ConnectionResult connectionResult, String string2, int n3) {
        PendingIntent pendingIntent = connectionResult.getResolution();
        this(n3, string2, pendingIntent, connectionResult);
    }

    public boolean equals(Object object) {
        boolean bl2;
        String string2;
        Object object2;
        int n3 = object instanceof Status;
        if (n3 == 0) {
            return false;
        }
        object = (Status)object;
        n3 = this.zzb;
        int n4 = ((Status)object).zzb;
        return n3 == n4 && (n3 = (int)(Objects.equal(object2 = this.zzc, string2 = ((Status)object).zzc) ? 1 : 0)) != 0 && (n3 = (int)(Objects.equal(object2 = this.zzd, string2 = ((Status)object).zzd) ? 1 : 0)) != 0 && (bl2 = Objects.equal(object2 = this.zze, object = ((Status)object).zze));
    }

    public ConnectionResult getConnectionResult() {
        return this.zze;
    }

    public PendingIntent getResolution() {
        return this.zzd;
    }

    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zzb;
    }

    public String getStatusMessage() {
        return this.zzc;
    }

    public boolean hasResolution() {
        PendingIntent pendingIntent = this.zzd;
        return pendingIntent != null;
    }

    public int hashCode() {
        Integer n3 = this.zzb;
        String string2 = this.zzc;
        PendingIntent pendingIntent = this.zzd;
        ConnectionResult connectionResult = this.zze;
        Object[] objectArray = new Object[]{n3, string2, pendingIntent, connectionResult};
        return Objects.hashCode(objectArray);
    }

    public boolean isCanceled() {
        int n3 = this.zzb;
        int n4 = 16;
        return n3 == n4;
    }

    public boolean isInterrupted() {
        int n3 = this.zzb;
        int n4 = 14;
        return n3 == n4;
    }

    public boolean isSuccess() {
        int n3 = this.zzb;
        return n3 <= 0;
    }

    public void startResolutionForResult(I3 i3) {
        boolean bl2 = this.hasResolution();
        if (!bl2) {
            return;
        }
        PendingIntent pendingIntent = this.zzd;
        Preconditions.checkNotNull(pendingIntent);
        pendingIntent = pendingIntent.getIntentSender();
        Intrinsics.checkNotNullParameter(pendingIntent, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest((IntentSender)pendingIntent, null, 0, 0);
        i3.a(intentSenderRequest);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void startResolutionForResult(Activity activity, int n3) {
        Bundle bundle;
        boolean bl2 = this.hasResolution();
        if (!bl2) {
            return;
        }
        bl2 = PlatformVersion.isAtLeastU();
        if (bl2) {
            bundle = dc1_1.a(o2.a()).toBundle();
        } else {
            bl2 = false;
            bundle = null;
        }
        Bundle bundle2 = bundle;
        bundle = this.zzd;
        Preconditions.checkNotNull(bundle);
        IntentSender intentSender = bundle.getIntentSender();
        activity.startIntentSenderForResult(intentSender, n3, null, 0, 0, 0, bundle2);
    }

    public String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        String string2 = this.zza();
        objects$ToStringHelper.add("statusCode", string2);
        string2 = this.zzd;
        objects$ToStringHelper.add("resolution", string2);
        return objects$ToStringHelper.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.getStatusCode();
        SafeParcelWriter.writeInt(parcel, 1, n7);
        String string2 = this.getStatusMessage();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        object = this.getConnectionResult();
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final String zza() {
        String string2 = this.zzc;
        if (string2 != null) {
            return string2;
        }
        return CommonStatusCodes.getStatusCodeString(this.zzb);
    }
}

