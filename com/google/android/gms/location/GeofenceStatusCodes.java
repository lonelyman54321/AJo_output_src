/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GeofenceStatusCodes
extends CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION = 1004;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_REQUEST_TOO_FREQUENT = 1005;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes() {
    }

    public static String getStatusCodeString(int n3) {
        switch (n3) {
            default: {
                return CommonStatusCodes.getStatusCodeString(n3);
            }
            case 1004: {
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            }
            case 1002: {
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            }
            case 1001: {
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            }
            case 1000: 
        }
        return "GEOFENCE_NOT_AVAILABLE";
    }

    public static int zza(int n3) {
        int n4;
        if (n3 != 0 && (n3 < (n4 = 1000) || n3 >= (n4 = 1006))) {
            n3 = 13;
        }
        return n3;
    }
}

