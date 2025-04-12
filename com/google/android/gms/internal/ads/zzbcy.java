/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbcz;
import java.util.Iterator;

public final class zzbcy
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    static {
        zzbcz zzbcz2 = new zzbcz();
        CREATOR = zzbcz2;
    }

    public zzbcy(String string2, long l2, String string3, String string4, String string5, Bundle bundle, boolean bl2, long l3, String string6, int n3) {
        this.zza = string2;
        this.zzb = l2;
        string2 = "";
        if (string3 == null) {
            string3 = string2;
        }
        this.zzc = string3;
        if (string4 == null) {
            string4 = string2;
        }
        this.zzd = string4;
        if (string5 == null) {
            string5 = string2;
        }
        this.zze = string5;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzf = bundle;
        this.zzg = bl2;
        this.zzh = l3;
        this.zzi = string6;
        this.zzj = n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzbcy zza(Uri uri) {
        void var1_4;
        block7: {
            int n3;
            boolean bl2;
            String string2;
            Object object = uri;
            Iterator iterator = "Expected 2 path parts for namespace and id, found :";
            Object object2 = "gcache";
            try {
                int n4;
                string2 = uri.getScheme();
                bl2 = ((String)object2).equals(string2);
                if (!bl2) {
                    return null;
                }
                object2 = uri.getPathSegments();
                n3 = object2.size();
                if (n3 != (n4 = 2)) {
                    int n7 = object2.size();
                    object2 = new StringBuilder((String)((Object)iterator));
                    ((StringBuilder)object2).append(n7);
                    object = ((StringBuilder)object2).toString();
                    zzm.zzj((String)object);
                    return null;
                }
            }
            catch (NumberFormatException numberFormatException) {
                break block7;
            }
            catch (NullPointerException nullPointerException) {
                break block7;
            }
            int n8 = 0;
            iterator = null;
            iterator = object2.get(0);
            String string3 = iterator;
            string3 = iterator;
            n8 = 1;
            iterator = object2.get(n8);
            String string4 = iterator;
            string4 = iterator;
            String string5 = uri.getHost();
            iterator = "url";
            String string6 = uri.getQueryParameter((String)((Object)iterator));
            iterator = "1";
            object2 = "read_only";
            object2 = uri.getQueryParameter((String)object2);
            boolean bl3 = ((String)((Object)iterator)).equals(object2);
            iterator = "expiration";
            long l2 = (iterator = uri.getQueryParameter((String)((Object)iterator))) == null ? 0L : Long.parseLong((String)((Object)iterator));
            long l3 = l2;
            Bundle bundle = new Bundle();
            iterator = uri.getQueryParameterNames();
            iterator = iterator.iterator();
            while (true) {
                if (!(bl2 = iterator.hasNext())) {
                    String string7 = "";
                    long l4 = 0L;
                    string2 = object;
                    return new zzbcy(string6, l3, string5, string3, string4, bundle, bl3, l4, string7, 0);
                }
                object2 = iterator.next();
                string2 = "tag.";
                n3 = (int)(((String)(object2 = (String)object2)).startsWith(string2) ? 1 : 0);
                if (n3 == 0) continue;
                n3 = 4;
                string2 = ((String)object2).substring(n3);
                object2 = object.getQueryParameter((String)object2);
                bundle.putString(string2, (String)object2);
            }
        }
        zzm.zzk("Unable to parse Uri into cache offering.", (Throwable)var1_4);
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        String string3 = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        string3 = this.zzd;
        SafeParcelWriter.writeString(parcel, 5, string3, false);
        string3 = this.zze;
        SafeParcelWriter.writeString(parcel, 6, string3, false);
        string3 = this.zzf;
        SafeParcelWriter.writeBundle(parcel, 7, (Bundle)string3, false);
        int n7 = this.zzg;
        SafeParcelWriter.writeBoolean(parcel, 8, n7 != 0);
        l2 = this.zzh;
        SafeParcelWriter.writeLong(parcel, 9, l2);
        string3 = this.zzi;
        SafeParcelWriter.writeString(parcel, 10, string3, false);
        n7 = this.zzj;
        SafeParcelWriter.writeInt(parcel, 11, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

