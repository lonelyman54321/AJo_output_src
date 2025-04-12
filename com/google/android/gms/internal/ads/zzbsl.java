/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions$Builder;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.ads.zzbhk;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzbsl
implements NativeMediationAdRequest {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final zzbhk zzg;
    private final List zzh;
    private final boolean zzi;
    private final Map zzj;
    private final String zzk;

    public zzbsl(Date object, int n3, Set object2, Location object3, boolean bl2, int n4, zzbhk zzbhk2, List list, boolean bl3, int n7, String string2) {
        this.zza = object;
        this.zzb = n3;
        this.zzc = object2;
        this.zze = object3;
        this.zzd = bl2;
        this.zzf = n4;
        this.zzg = zzbhk2;
        this.zzi = bl3;
        this.zzk = string2;
        this.zzh = object;
        super();
        this.zzj = object;
        if (list != null) {
            object = list.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Object object4 = (String[])object.next();
                int n8 = object4.startsWith((String)(object2 = "custom:"));
                if (n8 != 0) {
                    object2 = ":";
                    int n10 = 3;
                    n8 = ((String[])(object4 = object4.split((String)object2, n10))).length;
                    if (n8 != n10) continue;
                    n8 = 2;
                    object3 = object4[n8];
                    String string3 = "true";
                    n10 = (int)(string3.equals(object3) ? 1 : 0);
                    bl2 = true;
                    if (n10 != 0) {
                        object2 = this.zzj;
                        object4 = object4[bl2];
                        object3 = Boolean.TRUE;
                        object2.put(object4, object3);
                        continue;
                    }
                    object3 = "false";
                    object2 = object4[n8];
                    if ((n8 = (int)(object3.equals(object2) ? 1 : 0)) == 0) continue;
                    object2 = this.zzj;
                    object4 = object4[bl2];
                    object3 = Boolean.FALSE;
                    object2.put(object4, object3);
                    continue;
                }
                object2 = this.zzh;
                object2.add(object4);
            }
        }
    }

    public final float getAdVolume() {
        return zzej.zzf().zza();
    }

    public final Date getBirthday() {
        return this.zza;
    }

    public final int getGender() {
        return this.zzb;
    }

    public final Set getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    public final NativeAdOptions getNativeAdOptions() {
        Object object;
        block5: {
            int n3;
            zzbhk zzbhk2;
            block8: {
                block6: {
                    zzfk zzfk2;
                    block7: {
                        block4: {
                            object = new NativeAdOptions$Builder();
                            zzbhk2 = this.zzg;
                            if (zzbhk2 != null) break block4;
                            object = ((NativeAdOptions$Builder)object).build();
                            break block5;
                        }
                        n3 = zzbhk2.zza;
                        int n4 = 2;
                        if (n3 == n4) break block6;
                        n4 = 3;
                        if (n3 == n4) break block7;
                        n4 = 4;
                        if (n3 != n4) break block8;
                        n3 = (int)(zzbhk2.zzg ? 1 : 0);
                        ((NativeAdOptions$Builder)object).setRequestCustomMuteThisAd(n3 != 0);
                        n3 = zzbhk2.zzh;
                        ((NativeAdOptions$Builder)object).setMediaAspectRatio(n3);
                    }
                    if ((zzfk2 = zzbhk2.zzf) != null) {
                        VideoOptions videoOptions = new VideoOptions(zzfk2);
                        ((NativeAdOptions$Builder)object).setVideoOptions(videoOptions);
                    }
                }
                n3 = zzbhk2.zze;
                ((NativeAdOptions$Builder)object).setAdChoicesPlacement(n3);
            }
            n3 = (int)(zzbhk2.zzb ? 1 : 0);
            ((NativeAdOptions$Builder)object).setReturnUrlsForImageAssets(n3 != 0);
            n3 = zzbhk2.zzc;
            ((NativeAdOptions$Builder)object).setImageOrientation(n3);
            boolean bl2 = zzbhk2.zzd;
            ((NativeAdOptions$Builder)object).setRequestMultipleImages(bl2);
            object = ((NativeAdOptions$Builder)object).build();
        }
        return object;
    }

    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbhk.zza(this.zzg);
    }

    public final boolean isAdMuted() {
        return zzej.zzf().zzw();
    }

    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    public final boolean isTesting() {
        return this.zzd;
    }

    public final boolean isUnifiedNativeAdRequested() {
        List list = this.zzh;
        String string2 = "6";
        boolean bl2 = list.contains(string2);
        return bl2;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    public final Map zza() {
        return this.zzj;
    }

    public final boolean zzb() {
        List list = this.zzh;
        String string2 = "3";
        boolean bl2 = list.contains(string2);
        return bl2;
    }
}

