/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzel;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

public final class zzek
extends AbstractSafeParcelable
implements Geofence {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    static {
        zzel zzel2 = new zzel();
        CREATOR = zzel2;
    }

    public zzek(String object, int n3, short s7, double d2, double d5, float f5, long l2, int n4, int n7) {
        int n8;
        int n10;
        if (object != null && (n10 = ((String)object).length()) <= (n8 = 100)) {
            float f6 = f5 - 0.0f;
            n10 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
            if (n10 > 0) {
                double d7;
                double d9 = 90.0;
                double d12 = d2 - d9;
                Object object2 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                if (object2 <= 0 && (object2 = (d7 = d2 - (d9 = -90.0)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) >= 0) {
                    double d13;
                    d9 = 180.0;
                    double d14 = d5 - d9;
                    object2 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    if (object2 <= 0 && (object2 = (d13 = d5 - (d9 = -180.0)) == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1)) >= 0) {
                        n10 = n3 & 7;
                        if (n10 != 0) {
                            this.zzc = s7;
                            this.zza = object;
                            this.zzd = d2;
                            this.zze = d5;
                            this.zzf = f5;
                            this.zzb = l2;
                            this.zzg = n10;
                            this.zzh = n4;
                            this.zzi = n7;
                            return;
                        }
                        s7 = (short)String.valueOf(n3).length();
                        s7 = (short)(s7 + 35);
                        StringBuilder stringBuilder = new StringBuilder(s7);
                        stringBuilder.append("No supported transition specified: ");
                        stringBuilder.append(n3);
                        String string2 = stringBuilder.toString();
                        object = new IllegalArgumentException(string2);
                        throw object;
                    }
                    n3 = String.valueOf(d5).length();
                    StringBuilder stringBuilder = new StringBuilder(n3 += 19);
                    stringBuilder.append("invalid longitude: ");
                    stringBuilder.append(d5);
                    String string3 = stringBuilder.toString();
                    object = new IllegalArgumentException(string3);
                    throw object;
                }
                n3 = String.valueOf(d2).length();
                StringBuilder stringBuilder = new StringBuilder(n3 += 18);
                stringBuilder.append("invalid latitude: ");
                stringBuilder.append(d2);
                String string4 = stringBuilder.toString();
                object = new IllegalArgumentException(string4);
                throw object;
            }
            n3 = String.valueOf(f5).length();
            StringBuilder stringBuilder = new StringBuilder(n3 += 16);
            stringBuilder.append("invalid radius: ");
            stringBuilder.append(f5);
            String string5 = stringBuilder.toString();
            object = new IllegalArgumentException(string5);
            throw object;
        }
        object = String.valueOf(object);
        object = "requestId is null or too long: ".concat((String)object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof zzek;
        if (object2 != 0) {
            int n3;
            short s7;
            double d2;
            double d5;
            double d7;
            double d9;
            object = (zzek)object;
            float f5 = this.zzf;
            float f6 = ((zzek)object).zzf;
            float f7 = f5 - f6;
            object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 == 0 && (object2 = (d9 = (d7 = this.zzd) - (d5 = ((zzek)object).zzd)) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) == 0 && (object2 = (d2 = (d7 = this.zze) - (d5 = ((zzek)object).zze)) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) == 0 && (object2 = this.zzc) == (s7 = ((zzek)object).zzc) && (object2 = this.zzg) == (n3 = ((zzek)object).zzg)) {
                return bl2;
            }
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.zzb;
    }

    public final double getLatitude() {
        return this.zzd;
    }

    public final int getLoiteringDelay() {
        return this.zzi;
    }

    public final double getLongitude() {
        return this.zze;
    }

    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    public final float getRadius() {
        return this.zzf;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long l2 = Double.doubleToLongBits(this.zzd);
        int n3 = 32;
        long l3 = l2 >>> n3;
        l2 ^= l3;
        l3 = Double.doubleToLongBits(this.zze);
        long l4 = l3 >>> n3;
        long l7 = l3 ^ l4;
        int n4 = (int)l2;
        float f5 = this.zzf;
        int n7 = 31;
        n4 = (n4 + n7) * 31;
        int n8 = (int)l7;
        n4 = (n4 + n8) * 31;
        int n10 = UR0.a(f5, n4, n7);
        n4 = this.zzc;
        n10 = (n10 + n4) * 31;
        n4 = this.zzg;
        return n10 + n4;
    }

    public final String toString() {
        short s7 = 1;
        short s8 = this.zzc;
        Locale locale = Locale.US;
        short s10 = -1;
        String string2 = s8 != s10 ? (s8 != s7 ? "UNKNOWN" : "CIRCLE") : "INVALID";
        String string3 = this.zza.replaceAll("\\p{C}", "?");
        Integer n3 = this.zzg;
        Double d2 = this.zzd;
        Double d5 = this.zze;
        Float f5 = Float.valueOf(this.zzf);
        Integer n4 = this.zzh / 1000;
        Integer n7 = this.zzi;
        Long l2 = this.zzb;
        Object[] objectArray = new Object[9];
        objectArray[0] = string2;
        objectArray[s7] = string3;
        objectArray[2] = n3;
        objectArray[3] = d2;
        objectArray[4] = d5;
        objectArray[5] = f5;
        objectArray[6] = n4;
        objectArray[7] = n7;
        objectArray[8] = l2;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        int n7 = this.zzc;
        SafeParcelWriter.writeShort(parcel, 3, (short)n7);
        double d2 = this.zzd;
        SafeParcelWriter.writeDouble(parcel, 4, d2);
        d2 = this.zze;
        SafeParcelWriter.writeDouble(parcel, 5, d2);
        float f5 = this.zzf;
        SafeParcelWriter.writeFloat(parcel, 6, f5);
        n7 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        n7 = this.zzh;
        SafeParcelWriter.writeInt(parcel, 8, n7);
        n7 = this.zzi;
        SafeParcelWriter.writeInt(parcel, 9, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

