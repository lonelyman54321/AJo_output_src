/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.zzb;

public final class ConnectionResult
extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator CREATOR;
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final ConnectionResult RESULT_SUCCESS;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = 255;
    final int zza;
    private final int zzb;
    private final PendingIntent zzc;
    private final String zzd;

    static {
        Object object = new ConnectionResult(0);
        RESULT_SUCCESS = object;
        object = new zzb();
        CREATOR = object;
    }

    public ConnectionResult(int n3) {
        this(n3, null, null);
    }

    public ConnectionResult(int n3, int n4, PendingIntent pendingIntent, String string2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = pendingIntent;
        this.zzd = string2;
    }

    public ConnectionResult(int n3, PendingIntent pendingIntent) {
        this(n3, pendingIntent, null);
    }

    public ConnectionResult(int n3, PendingIntent pendingIntent, String string2) {
        this(1, n3, pendingIntent, string2);
    }

    public static String zza(int n3) {
        int n4 = 99;
        if (n3 != n4) {
            n4 = 1500;
            if (n3 != n4) {
                switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                return Gj0.b(n3, "UNKNOWN_ERROR_CODE(", ")");
                            }
                            case 25: {
                                return "API_INSTALL_REQUIRED";
                            }
                            case 24: {
                                return "API_DISABLED_FOR_CONNECTION";
                            }
                            case 23: {
                                return "API_DISABLED";
                            }
                            case 22: {
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            }
                            case 21: {
                                return "API_VERSION_UPDATE_REQUIRED";
                            }
                            case 20: {
                                return "RESTRICTED_PROFILE";
                            }
                            case 19: {
                                return "SERVICE_MISSING_PERMISSION";
                            }
                            case 18: {
                                return "SERVICE_UPDATING";
                            }
                            case 17: {
                                return "SIGN_IN_FAILED";
                            }
                            case 16: {
                                return "API_UNAVAILABLE";
                            }
                            case 15: {
                                return "INTERRUPTED";
                            }
                            case 14: {
                                return "TIMEOUT";
                            }
                            case 13: 
                        }
                        return "CANCELED";
                    }
                    case 11: {
                        return "LICENSE_CHECK_FAILED";
                    }
                    case 10: {
                        return "DEVELOPER_ERROR";
                    }
                    case 9: {
                        return "SERVICE_INVALID";
                    }
                    case 8: {
                        return "INTERNAL_ERROR";
                    }
                    case 7: {
                        return "NETWORK_ERROR";
                    }
                    case 6: {
                        return "RESOLUTION_REQUIRED";
                    }
                    case 5: {
                        return "INVALID_ACCOUNT";
                    }
                    case 4: {
                        return "SIGN_IN_REQUIRED";
                    }
                    case 3: {
                        return "SERVICE_DISABLED";
                    }
                    case 2: {
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    }
                    case 1: {
                        return "SERVICE_MISSING";
                    }
                    case 0: {
                        return "SUCCESS";
                    }
                    case -1: 
                }
                return "UNKNOWN";
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object object) {
        boolean bl2;
        PendingIntent pendingIntent;
        Object object2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        int n3 = object instanceof ConnectionResult;
        if (n3 == 0) {
            return false;
        }
        object = (ConnectionResult)object;
        n3 = this.zzb;
        int n4 = ((ConnectionResult)object).zzb;
        if (n3 == n4 && (n3 = (int)(Objects.equal(object2 = this.zzc, pendingIntent = ((ConnectionResult)object).zzc) ? 1 : 0)) != 0 && (bl2 = Objects.equal(object2 = this.zzd, object = ((ConnectionResult)object).zzd))) {
            return bl3;
        }
        return false;
    }

    public int getErrorCode() {
        return this.zzb;
    }

    public String getErrorMessage() {
        return this.zzd;
    }

    public PendingIntent getResolution() {
        return this.zzc;
    }

    public boolean hasResolution() {
        PendingIntent pendingIntent;
        int n3 = this.zzb;
        return n3 != 0 && (pendingIntent = this.zzc) != null;
    }

    public int hashCode() {
        Integer n3 = this.zzb;
        PendingIntent pendingIntent = this.zzc;
        String string2 = this.zzd;
        Object[] objectArray = new Object[]{n3, pendingIntent, string2};
        return Objects.hashCode(objectArray);
    }

    public boolean isSuccess() {
        int n3 = this.zzb;
        return n3 == 0;
    }

    public void startResolutionForResult(Activity activity, int n3) {
        boolean bl2 = this.hasResolution();
        if (!bl2) {
            return;
        }
        PendingIntent pendingIntent = this.zzc;
        Preconditions.checkNotNull(pendingIntent);
        IntentSender intentSender = pendingIntent.getIntentSender();
        activity.startIntentSenderForResult(intentSender, n3, null, 0, 0, 0);
    }

    public String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        String string2 = ConnectionResult.zza(this.zzb);
        objects$ToStringHelper.add("statusCode", string2);
        Object object = this.zzc;
        objects$ToStringHelper.add("resolution", object);
        object = this.zzd;
        objects$ToStringHelper.add("message", object);
        return objects$ToStringHelper.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        int n8 = this.getErrorCode();
        SafeParcelWriter.writeInt(parcel, 2, n8);
        Object object = this.getResolution();
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        object = this.getErrorMessage();
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

