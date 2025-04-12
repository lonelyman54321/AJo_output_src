/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzek;
import com.google.android.gms.location.Geofence;

public final class Geofence$Builder {
    private String zza = null;
    private int zzb = 3;
    private long zzc = -1;
    private short zzd;
    private double zze;
    private double zzf;
    private float zzg;
    private int zzh;
    private int zzi;

    public Geofence$Builder() {
        int n3 = -1;
        this.zzd = (short)n3;
        this.zzh = 0;
        this.zzi = n3;
    }

    public Geofence build() {
        Object object = this.zza;
        if (object != null) {
            int n3 = this.zzb;
            if (n3 != 0) {
                if ((n3 &= 4) != 0 && (n3 = this.zzi) < 0) {
                    object = new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                    throw object;
                }
                long l2 = this.zzc;
                long l3 = Long.MIN_VALUE;
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 != false) {
                    n3 = this.zzd;
                    int n4 = -1;
                    if (n3 != n4) {
                        n3 = this.zzh;
                        if (n3 >= 0) {
                            String string2 = this.zza;
                            int n7 = this.zzb;
                            double d2 = this.zze;
                            double d5 = this.zzf;
                            float f5 = this.zzg;
                            long l7 = this.zzc;
                            int n8 = this.zzh;
                            int n10 = this.zzi;
                            object = new zzek(string2, n7, 1, d2, d5, f5, l7, n8, n10);
                            return object;
                        }
                        object = new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        throw object;
                    }
                    object = new IllegalArgumentException("Geofence region not set.");
                    throw object;
                }
                object = new IllegalArgumentException("Expiration not set.");
                throw object;
            }
            object = new IllegalArgumentException("Transitions types not set.");
            throw object;
        }
        object = new IllegalArgumentException("Request ID not set.");
        throw object;
    }

    public Geofence$Builder setCircularRegion(double d2, double d5, float f5) {
        double d7;
        String string2;
        int n3;
        double d9;
        double d12 = -90.0;
        short s7 = 1;
        boolean bl2 = false;
        Object object = d2 == d12 ? 0 : (d2 < d12 ? -1 : 1);
        if (object >= 0 && (object = (d9 = d2 - (d12 = 90.0)) == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1)) <= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        int n4 = String.valueOf(d2).length();
        StringBuilder stringBuilder = new StringBuilder(n4 += 18);
        stringBuilder.append("Invalid latitude: ");
        stringBuilder.append(d2);
        CharSequence charSequence = stringBuilder.toString();
        Preconditions.checkArgument(n3 != 0, charSequence);
        d12 = -180.0;
        object = d5 == d12 ? 0 : (d5 < d12 ? -1 : 1);
        if (object >= 0 && (object = (d7 = d5 - (d12 = 180.0)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) <= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        n4 = String.valueOf(d5).length();
        stringBuilder = new StringBuilder(n4 += 19);
        stringBuilder.append("Invalid longitude: ");
        stringBuilder.append(d5);
        charSequence = stringBuilder.toString();
        Preconditions.checkArgument(n3 != 0, charSequence);
        string2 = null;
        float f6 = f5 - 0.0f;
        n3 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            bl2 = true;
        }
        n3 = String.valueOf(f5).length();
        charSequence = new StringBuilder(n3 += 16);
        ((StringBuilder)charSequence).append("Invalid radius: ");
        ((StringBuilder)charSequence).append(f5);
        string2 = ((StringBuilder)charSequence).toString();
        Preconditions.checkArgument(bl2, string2);
        this.zzd = s7;
        this.zze = d2;
        this.zzf = d5;
        this.zzg = f5;
        return this;
    }

    public Geofence$Builder setExpirationDuration(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            this.zzc = l2 = (long)-1;
        } else {
            Clock clock = DefaultClock.getInstance();
            this.zzc = l3 = clock.elapsedRealtime() + l2;
        }
        return this;
    }

    public Geofence$Builder setLoiteringDelay(int n3) {
        this.zzi = n3;
        return this;
    }

    public Geofence$Builder setNotificationResponsiveness(int n3) {
        this.zzh = n3;
        return this;
    }

    public Geofence$Builder setRequestId(String string2) {
        this.zza = string2 = (String)Preconditions.checkNotNull(string2, "Request ID can't be set to null");
        return this;
    }

    public Geofence$Builder setTransitionTypes(int n3) {
        this.zzb = n3;
        return this;
    }
}

