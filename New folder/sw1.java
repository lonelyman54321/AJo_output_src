/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
import android.location.Location;

public final class sw1 {
    public static float a(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float b(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float c(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean d(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean e(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean f(Location location) {
        return location.hasVerticalAccuracy();
    }
}

