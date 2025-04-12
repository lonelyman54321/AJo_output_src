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
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzfxm;

public class zzagy
implements zzcc {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzagx zzagx2 = new zzagx();
        CREATOR = zzagx2;
    }

    public zzagy(Parcel object) {
        String string2 = object.readString();
        this.zza = string2;
        object = object.readString();
        this.zzb = object;
    }

    public zzagy(String string2, String string3) {
        this.zza = string2 = zzfxm.zzb(string2);
        this.zzb = string3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzagy)object;
            object3 = this.zza;
            object2 = ((zzagy)object).zza;
            boolean bl4 = ((String)object3).equals(object2);
            if (bl4 && (bl3 = ((String)(object3 = this.zzb)).equals(object = ((zzagy)object).zzb))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() + 527;
        String string2 = this.zzb;
        return string2.hashCode() + (n3 *= 31);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VC: ");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append("=");
        string2 = this.zzb;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        parcel.writeString(string2);
        string2 = this.zzb;
        parcel.writeString(string2);
    }

    public final void zza(zzby zzby2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        String string2;
        block12: {
            string2 = this.zza;
            int n14 = string2.hashCode();
            n10 = 2;
            n8 = 4;
            n7 = 3;
            n4 = 1;
            switch (n14) {
                default: {
                    break;
                }
                case 1939198791: {
                    String string3 = "ARTIST";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block12;
                }
                case 1746739798: {
                    String string4 = "ALBUMARTIST";
                    n3 = (int)(string2.equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block12;
                }
                case 428414940: {
                    String string5 = "DESCRIPTION";
                    n3 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block12;
                }
                case 79833656: {
                    String string6 = "TITLE";
                    n3 = (int)(string2.equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    string2 = null;
                    break block12;
                }
                case 62359119: {
                    String string7 = "ALBUM";
                    n3 = (int)(string2.equals(string7) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block12;
                }
            }
            n3 = -1;
        }
        if (n3 != 0) {
            if (n3 != n4) {
                if (n3 != n10) {
                    if (n3 != n7) {
                        if (n3 != n8) {
                            return;
                        }
                        string2 = this.zzb;
                        zzby2.zzh(string2);
                        return;
                    }
                    string2 = this.zzb;
                    zzby2.zzc(string2);
                    return;
                }
                string2 = this.zzb;
                zzby2.zzd(string2);
                return;
            }
            string2 = this.zzb;
            zzby2.zze(string2);
            return;
        }
        string2 = this.zzb;
        zzby2.zzq(string2);
    }
}

