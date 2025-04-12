/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appindexing.AppIndexApi$AppIndexingLink;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzan;
import com.google.android.gms.internal.icing.zzao;
import com.google.android.gms.internal.icing.zzap;
import com.google.android.gms.internal.icing.zzaq;
import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzf;
import com.google.android.gms.internal.icing.zzg;
import com.google.android.gms.internal.icing.zzi;
import com.google.android.gms.internal.icing.zzk;
import com.google.android.gms.internal.icing.zzq;
import com.google.android.gms.internal.icing.zzr;
import com.google.android.gms.internal.icing.zzs;
import com.google.android.gms.internal.icing.zzy;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

public final class zzx
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final zzi zza;
    final long zzb;
    int zzc;
    public final String zzd;
    final zzg zze;
    final boolean zzf;
    int zzg;
    int zzh;
    public final String zzi;

    static {
        zzy zzy2 = new zzy();
        CREATOR = zzy2;
    }

    public zzx(zzi zzi2, long l2, int n3, String string2, zzg zzg2, boolean bl2, int n4, int n7, String string3) {
        this.zza = zzi2;
        this.zzb = l2;
        this.zzc = n3;
        this.zzd = string2;
        this.zze = zzg2;
        this.zzf = bl2;
        this.zzg = n4;
        this.zzh = n7;
        this.zzi = string3;
    }

    public zzx(String string2, Intent intent, String string3, Uri uri, String string4, List list, int n3) {
        String string5 = zzx.zze(intent);
        zzi zzi2 = zzx.zzc(string2, string5);
        long l2 = System.currentTimeMillis();
        Object object = list;
        object = zzx.zzb(intent, string3, uri, null, list).zze();
        this(zzi2, l2, 0, null, (zzg)object, false, -1, 1, null);
    }

    public static zzi zza(String string2, Intent object) {
        object = zzx.zze(object);
        return zzx.zzc(string2, (String)object);
    }

    public static zzf zzb(Intent object, String object2, Uri object3, String string2, List object4) {
        int n3;
        Object object5;
        Object object6;
        Object object7;
        zzf zzf2 = new zzf();
        boolean bl2 = true;
        if (object2 != null) {
            object7 = new zzr("title");
            ((zzr)object7).zzc(bl2);
            ((zzr)object7).zzd("name");
            object7 = ((zzr)object7).zze();
            object6 = "text1";
            int n4 = zzq.zzb((String)object6);
            object5 = new zzk((String)object2, (zzs)object7, n4, null);
            zzf2.zza((zzk)object5);
        }
        if (object3 != null) {
            object3 = object3.toString();
            object5 = new zzr("web_url");
            object5.zzb(bl2);
            object7 = "url";
            object5.zzd((String)object7);
            object5 = object5.zze();
            n3 = zzk.zza;
            object2 = new zzk((String)object3, (zzs)object5, n3, null);
            zzf2.zza((zzk)object2);
        }
        if (object4 != null) {
            object2 = zzaq.zza();
            int n7 = object4.size();
            object5 = new zzap[n7];
            object7 = null;
            for (n3 = 0; n3 < n7; ++n3) {
                object6 = zzap.zza();
                Object object8 = (AppIndexApi$AppIndexingLink)object4.get(n3);
                String string3 = ((AppIndexApi$AppIndexingLink)object8).appIndexingUrl.toString();
                ((zzao)object6).zza(string3);
                int n8 = ((AppIndexApi$AppIndexingLink)object8).viewId;
                ((zzao)object6).zzc(n8);
                object8 = ((AppIndexApi$AppIndexingLink)object8).webUrl;
                if (object8 != null) {
                    object8 = object8.toString();
                    ((zzao)object6).zzb((String)object8);
                }
                object5[n3] = object6 = (zzap)((zzcx)object6).zzj();
            }
            object3 = Arrays.asList(object5);
            ((zzan)object2).zza((Iterable)object3);
            object2 = ((zzaq)((zzcx)object2).zzj()).zzh();
            object4 = new zzr("outlinks");
            ((zzr)object4).zzb(bl2);
            ((zzr)object4).zzd(".private:outLinks");
            object5 = "blob";
            ((zzr)object4).zza((String)object5);
            object4 = ((zzr)object4).zze();
            int n10 = zzk.zza;
            object3 = new zzk(null, (zzs)object4, n10, (byte[])object2);
            zzf2.zza((zzk)object3);
        }
        if ((object2 = object.getAction()) != null) {
            object3 = "intent_action";
            object2 = zzx.zzd((String)object3, (String)object2);
            zzf2.zza((zzk)object2);
        }
        if ((object2 = object.getDataString()) != null) {
            object3 = "intent_data";
            object2 = zzx.zzd((String)object3, (String)object2);
            zzf2.zza((zzk)object2);
        }
        if ((object2 = object.getComponent()) != null) {
            object3 = "intent_activity";
            object2 = object2.getClassName();
            object2 = zzx.zzd((String)object3, (String)object2);
            zzf2.zza((zzk)object2);
        }
        if ((object = object.getExtras()) != null && (object = object.getString((String)(object2 = "intent_extra_data_key"))) != null) {
            object2 = "intent_extra_data";
            object = zzx.zzd((String)object2, (String)object);
            zzf2.zza((zzk)object);
        }
        if (string2 != null) {
            zzf2.zzb(string2);
        }
        zzf2.zzc(bl2);
        return zzf2;
    }

    private static zzi zzc(String string2, String string3) {
        zzi zzi2 = new zzi(string2, "", string3);
        return zzi2;
    }

    private static zzk zzd(String string2, String string3) {
        Object object = new zzr(string2);
        ((zzr)object).zzb(true);
        object = ((zzr)object).zze();
        int n3 = zzq.zzb(string2);
        zzk zzk2 = new zzk(string3, (zzs)object, n3, null);
        return zzk2;
    }

    private static String zze(Intent object) {
        int n3 = 1;
        object = object.toUri(n3);
        Object object2 = new CRC32();
        String string2 = "UTF-8";
        try {
            object = object.getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object2 = new IllegalStateException(unsupportedEncodingException);
            throw object2;
        }
        object2.update((byte[])object);
        return Long.toHexString(((CRC32)object2).getValue());
    }

    public final String toString() {
        Object object = Locale.US;
        object = this.zza;
        long l2 = this.zzb;
        int n3 = this.zzc;
        int n4 = this.zzh;
        StringBuilder stringBuilder = new StringBuilder("UsageInfo[documentId=");
        stringBuilder.append(object);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(l2);
        stringBuilder.append(", usageType=");
        stringBuilder.append(n3);
        stringBuilder.append(", status=");
        stringBuilder.append(n4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        Object object2 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object2, false);
        object2 = this.zze;
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)object2, n3, false);
        int n8 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 6, n8 != 0);
        n8 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 7, n8);
        n8 = this.zzh;
        SafeParcelWriter.writeInt(parcel, 8, n8);
        object = this.zzi;
        SafeParcelWriter.writeString(parcel, 9, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

