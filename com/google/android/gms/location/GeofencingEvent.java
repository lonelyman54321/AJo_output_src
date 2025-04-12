/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.location.Location
 *  android.os.Parcel
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzek;
import java.util.ArrayList;
import java.util.List;

public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final List zzc;
    private final Location zzd;

    private GeofencingEvent(int n3, int n4, List list, Location location) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = list;
        this.zzd = location;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static GeofencingEvent fromIntent(Intent var0) {
        block11: {
            block10: {
                var1_1 = null;
                if (var0 == null) break block10;
                var2_2 = "gms_error_code";
                var3_3 = -1;
                var4_4 = var0.getIntExtra(var2_2, var3_3);
                var5_5 = "com.google.android.location.intent.extra.transition";
                var6_6 = var0.getIntExtra(var5_5, var3_3);
                if (var6_6 == var3_3) {
                    while (true) {
                        var6_6 = -1;
                        break;
                    }
                } else {
                    var7_7 = 1;
                    if (var6_6 != var7_7 && var6_6 != (var7_7 = 2)) {
                        if (var6_6 != (var7_7 = 4)) ** continue;
                        var6_6 = 4;
                    }
                }
                var8_8 = (ArrayList)var0.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
                if (var8_8 == null) {
                    var9_9 = null;
                } else {
                    var10_10 = var8_8.size();
                    var9_9 = new ArrayList<byte[]>(var10_10);
                    var10_10 = var8_8.size();
                    for (var11_11 = 0; var11_11 < var10_10; ++var11_11) {
                        var12_12 /* !! */  = (byte[])var8_8.get(var11_11);
                        var13_13 = Parcel.obtain();
                        var14_14 = var12_12 /* !! */ .length;
                        var13_13.unmarshall(var12_12 /* !! */ , 0, var14_14);
                        var13_13.setDataPosition(0);
                        var12_12 /* !! */  = (byte[])((zzek)zzek.CREATOR.createFromParcel(var13_13));
                        var13_13.recycle();
                        var9_9.add(var12_12 /* !! */ );
                    }
                }
                var8_8 = "com.google.android.location.intent.extra.triggering_location";
                var0 = (Location)var0.getParcelableExtra((String)var8_8);
                if (var9_9 != null || var4_4 != var3_3) break block11;
            }
            return null;
        }
        var1_1 = new GeofencingEvent(var4_4, var6_6, var9_9, (Location)var0);
        return var1_1;
    }

    public int getErrorCode() {
        return this.zza;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public List getTriggeringGeofences() {
        return this.zzc;
    }

    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        int n3 = this.zza;
        int n4 = -1;
        return n3 != n4;
    }
}

