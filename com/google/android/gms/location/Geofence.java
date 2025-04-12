/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = 255L;

    public long getExpirationTime();

    public double getLatitude();

    public int getLoiteringDelay();

    public double getLongitude();

    public int getNotificationResponsiveness();

    public float getRadius();

    public String getRequestId();

    public int getTransitionTypes();
}

