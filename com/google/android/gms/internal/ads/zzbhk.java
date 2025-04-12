/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions$Builder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbhl;

public final class zzbhk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final zzfk zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    static {
        zzbhl zzbhl2 = new zzbhl();
        CREATOR = zzbhl2;
    }

    public zzbhk(int n3, boolean bl2, int n4, boolean bl3, int n7, zzfk zzfk2, boolean bl4, int n8, int n10, boolean bl5, int n14) {
        this.zza = n3;
        this.zzb = bl2;
        this.zzc = n4;
        this.zzd = bl3;
        this.zze = n7;
        this.zzf = zzfk2;
        this.zzg = bl4;
        this.zzh = n8;
        this.zzj = bl5;
        this.zzi = n10;
        this.zzk = n14;
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzbhk(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        boolean bl2 = nativeAdOptions.shouldReturnUrlsForImageAssets();
        int n3 = nativeAdOptions.getImageOrientation();
        boolean bl3 = nativeAdOptions.shouldRequestMultipleImages();
        int n4 = nativeAdOptions.getAdChoicesPlacement();
        Object object = nativeAdOptions.getVideoOptions();
        if (object != null) {
            VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
            object = new zzfk(videoOptions);
        } else {
            object = null;
        }
        Object object2 = object;
        boolean bl4 = nativeAdOptions.zza();
        int n7 = nativeAdOptions.getMediaAspectRatio();
        object = this;
        this(4, bl2, n3, bl3, n4, (zzfk)object2, bl4, n7, 0, false, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static NativeAdOptions zza(zzbhk zzbhk2) {
        int n3;
        NativeAdOptions$Builder nativeAdOptions$Builder;
        block7: {
            block5: {
                zzfk zzfk2;
                block6: {
                    int n4;
                    block10: {
                        block8: {
                            int n7;
                            block9: {
                                nativeAdOptions$Builder = new NativeAdOptions$Builder();
                                if (zzbhk2 == null) {
                                    return nativeAdOptions$Builder.build();
                                }
                                n3 = zzbhk2.zza;
                                n4 = 2;
                                if (n3 == n4) break block5;
                                int n8 = 3;
                                if (n3 == n8) break block6;
                                n7 = 4;
                                if (n3 != n7) break block7;
                                n3 = (int)(zzbhk2.zzg ? 1 : 0);
                                nativeAdOptions$Builder.setRequestCustomMuteThisAd(n3 != 0);
                                n3 = zzbhk2.zzh;
                                nativeAdOptions$Builder.setMediaAspectRatio(n3);
                                n3 = zzbhk2.zzi;
                                n7 = (int)(zzbhk2.zzj ? 1 : 0);
                                nativeAdOptions$Builder.enableCustomClickGestureDirection(n3, n7 != 0);
                                n3 = zzbhk2.zzk;
                                n7 = 1;
                                if (n3 == 0) break block8;
                                if (n3 != n4) break block9;
                                n4 = 3;
                                break block10;
                            }
                            if (n3 == n7) break block10;
                        }
                        n4 = 1;
                    }
                    nativeAdOptions$Builder.zzi(n4);
                }
                if ((zzfk2 = zzbhk2.zzf) != null) {
                    VideoOptions videoOptions = new VideoOptions(zzfk2);
                    nativeAdOptions$Builder.setVideoOptions(videoOptions);
                }
            }
            n3 = zzbhk2.zze;
            nativeAdOptions$Builder.setAdChoicesPlacement(n3);
        }
        n3 = (int)(zzbhk2.zzb ? 1 : 0);
        nativeAdOptions$Builder.setReturnUrlsForImageAssets(n3 != 0);
        boolean bl2 = zzbhk2.zzd;
        nativeAdOptions$Builder.setRequestMultipleImages(bl2);
        return nativeAdOptions$Builder.build();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        int n8 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, n8 != 0);
        n8 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n8);
        n8 = (int)(this.zzd ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 4, n8 != 0);
        n8 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, n8);
        zzfk zzfk2 = this.zzf;
        SafeParcelWriter.writeParcelable(parcel, 6, zzfk2, n3, false);
        n4 = (int)(this.zzg ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 7, n4 != 0);
        n4 = this.zzh;
        SafeParcelWriter.writeInt(parcel, 8, n4);
        n4 = this.zzi;
        SafeParcelWriter.writeInt(parcel, 9, n4);
        n4 = (int)(this.zzj ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 10, n4 != 0);
        n4 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 11, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

