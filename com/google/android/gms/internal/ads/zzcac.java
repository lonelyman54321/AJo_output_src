/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzcad;
import java.util.List;
import org.json.JSONObject;

public final class zzcac
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    static {
        zzcad zzcad2 = new zzcad();
        CREATOR = zzcad2;
    }

    public zzcac(String string2, String string3, boolean bl2, boolean bl3, List list, boolean bl4, boolean bl5, List list2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = bl2;
        this.zzd = bl3;
        this.zze = list;
        this.zzf = bl4;
        this.zzg = bl5;
        if (list2 == null) {
        }
        this.zzh = list2;
    }

    public static zzcac zza(JSONObject object) {
        String string2 = "";
        String string3 = object.optString("click_string", string2);
        String string4 = object.optString("report_url", string2);
        boolean bl2 = object.optBoolean("rendered_ad_enabled", false);
        boolean bl3 = object.optBoolean("non_malicious_reporting_enabled", false);
        List list = zzbw.zzc(object.optJSONArray("allowed_headers"), null);
        List list2 = zzbw.zzc(object.optJSONArray("webview_permissions"), null);
        boolean bl4 = object.optBoolean("protection_enabled", false);
        boolean bl5 = object.optBoolean("malicious_reporting_enabled", false);
        object = new zzcac(string3, string4, bl2, bl3, list, bl4, bl5, list2);
        return object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        boolean bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        bl2 = this.zzd;
        SafeParcelWriter.writeBoolean(parcel, 5, bl2);
        object = this.zze;
        SafeParcelWriter.writeStringList(parcel, 6, (List)object, false);
        bl2 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 7, bl2);
        bl2 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 8, bl2);
        object = this.zzh;
        SafeParcelWriter.writeStringList(parcel, 9, (List)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

