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
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahy;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayList;
import java.util.List;

public final class zzahz
extends zzahr {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final zzgbc zzc;

    static {
        zzahy zzahy2 = new zzahy();
        CREATOR = zzahy2;
    }

    public zzahz(String object, String string2, List list) {
        super((String)object);
        zzeq.zzd(list.isEmpty() ^ true);
        this.zza = string2;
        this.zzc = object = zzgbc.zzk(list);
        this.zzb = object = (String)object.get(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static List zzb(String object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        try {
            int n3 = ((String)object).length();
            int n4 = 5;
            int n7 = 10;
            int n8 = 7;
            int n10 = 4;
            if (n3 >= n7) {
                Object object2 = ((String)object).substring(0, n10);
                n3 = Integer.parseInt((String)object2);
                object2 = n3;
                arrayList.add(object2);
                object2 = ((String)object).substring(n4, n8);
                n3 = Integer.parseInt((String)object2);
                object2 = n3;
                arrayList.add(object2);
                n3 = 8;
                object = ((String)object).substring(n3, n7);
                int n14 = Integer.parseInt((String)object);
                object = n14;
                arrayList.add(object);
                return arrayList;
            }
            n3 = ((String)object).length();
            if (n3 >= n8) {
                Object object3 = ((String)object).substring(0, n10);
                n3 = Integer.parseInt((String)object3);
                object3 = n3;
                arrayList.add(object3);
                object = ((String)object).substring(n4, n8);
                int n15 = Integer.parseInt((String)object);
                object = n15;
                arrayList.add(object);
                return arrayList;
            }
            n3 = ((String)object).length();
            if (n3 < n10) return arrayList;
            object = ((String)object).substring(0, n10);
            int n16 = Integer.parseInt((String)object);
            object = n16;
            arrayList.add(object);
            return arrayList;
        }
        catch (NumberFormatException numberFormatException) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzahz.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzahz)object;
            object2 = this.zzf;
            object3 = ((zzahr)object).zzf;
            boolean bl4 = zzgd.zzG(object2, object3);
            if (bl4 && (bl4 = zzgd.zzG(object2 = this.zza, object3 = ((zzahz)object).zza)) && (bl3 = ((zzgbc)(object2 = this.zzc)).equals(object = ((zzahz)object).zzc))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zzf;
        int n4 = string2.hashCode() + 527;
        String string3 = this.zza;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        n4 *= 31;
        zzgbc zzgbc2 = this.zzc;
        n4 = (n4 + n3) * 31;
        return zzgbc2.hashCode() + n4;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzc);
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.zzf;
        stringBuilder.append(string3);
        stringBuilder.append(": description=");
        string3 = this.zza;
        return BW0.b(stringBuilder, string3, ": values=", string2);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String[] stringArray = this.zzf;
        parcel.writeString((String)stringArray);
        stringArray = this.zza;
        parcel.writeString((String)stringArray);
        stringArray = this.zzc;
        Object[] objectArray = new String[]{};
        stringArray = (String[])stringArray.toArray(objectArray);
        parcel.writeStringArray(stringArray);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzby zzby2) {
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object2;
        block52: {
            object2 = this.zzf;
            n15 = ((String)object2).hashCode();
            n14 = -1;
            n10 = 4;
            n8 = 3;
            n7 = 2;
            n4 = 1;
            switch (n15) {
                default: {
                    break;
                }
                case 2590194: {
                    object = "TYER";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 11;
                    break block52;
                }
                case 2583398: {
                    object = "TRCK";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 9;
                    break block52;
                }
                case 2581514: {
                    object = "TPE3";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 19;
                    break block52;
                }
                case 2581513: {
                    object = "TPE2";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block52;
                }
                case 2581512: {
                    object = "TPE1";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block52;
                }
                case 2575251: {
                    object = "TIT2";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block52;
                }
                case 2571565: {
                    object = "TEXT";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 21;
                    break block52;
                }
                case 2570410: {
                    object = "TDRL";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 15;
                    break block52;
                }
                case 2570401: {
                    object = "TDRC";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 14;
                    break block52;
                }
                case 2569891: {
                    object = "TDAT";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 13;
                    break block52;
                }
                case 2569357: {
                    object = "TCOM";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 17;
                    break block52;
                }
                case 2567331: {
                    object = "TALB";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block52;
                }
                case 83552: {
                    object = "TYE";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 10;
                    break block52;
                }
                case 83536: {
                    object = "TXT";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 20;
                    break block52;
                }
                case 83378: {
                    object = "TT2";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    object2 = null;
                    break block52;
                }
                case 83341: {
                    object = "TRK";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block52;
                }
                case 83255: {
                    object = "TP3";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 18;
                    break block52;
                }
                case 83254: {
                    object = "TP2";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block52;
                }
                case 83253: {
                    object = "TP1";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block52;
                }
                case 82897: {
                    object = "TDA";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 12;
                    break block52;
                }
                case 82878: {
                    object = "TCM";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 16;
                    break block52;
                }
                case 82815: {
                    object = "TAL";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block52;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return;
            }
            case 20: 
            case 21: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zzt((CharSequence)object2);
                return;
            }
            case 18: 
            case 19: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zzg((CharSequence)object2);
                return;
            }
            case 16: 
            case 17: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zzf((CharSequence)object2);
                return;
            }
            case 15: {
                object2 = zzahz.zzb((String)this.zzc.get(0));
                n15 = object2.size();
                if (n15 != n4) {
                    if (n15 != n7) {
                        if (n15 != n8) {
                            return;
                        }
                        object = (Integer)object2.get(n7);
                        zzby2.zzm((Integer)object);
                    }
                    object = (Integer)object2.get(n4);
                    zzby2.zzn((Integer)object);
                }
                object2 = (Integer)object2.get(0);
                zzby2.zzo((Integer)object2);
                return;
            }
            case 14: {
                object2 = zzahz.zzb((String)this.zzc.get(0));
                n15 = object2.size();
                if (n15 != n4) {
                    if (n15 != n7) {
                        if (n15 != n8) {
                            return;
                        }
                        object = (Integer)object2.get(n7);
                        zzby2.zzj((Integer)object);
                    }
                    object = (Integer)object2.get(n4);
                    zzby2.zzk((Integer)object);
                }
                object2 = (Integer)object2.get(0);
                zzby2.zzl((Integer)object2);
                return;
            }
            case 12: 
            case 13: {
                object2 = this.zzc;
                object2 = object2.get(0);
                object2 = (String)object2;
                object = ((String)object2).substring(n7, n10);
                n15 = Integer.parseInt((String)object);
                object2 = ((String)object2).substring(0, n7);
                n3 = Integer.parseInt((String)object2);
                object = n15;
                zzby2.zzk((Integer)object);
                object2 = n3;
                zzby2.zzj((Integer)object2);
                return;
            }
            case 10: 
            case 11: {
                object2 = this.zzc;
                object2 = object2.get(0);
                object2 = (String)object2;
                n3 = Integer.parseInt((String)object2);
                object2 = n3;
                zzby2.zzl((Integer)object2);
                return;
            }
            case 8: 
            case 9: {
                object2 = (String)this.zzc.get(0);
                n15 = zzgd.zza;
                object = "/";
                object2 = ((String)object2).split((String)object, n14);
                object = object2[0];
                n15 = Integer.parseInt((String)object);
                n14 = ((Object)object2).length;
                if (n14 > n4) {
                    object2 = object2[n4];
                    n3 = Integer.parseInt((String)object2);
                    object2 = n3;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object = n15;
                zzby2.zzs((Integer)object);
                zzby2.zzr((Integer)object2);
                return;
            }
            case 6: 
            case 7: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zzd((CharSequence)object2);
                return;
            }
            case 4: 
            case 5: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zzc((CharSequence)object2);
                return;
            }
            case 2: 
            case 3: {
                object2 = (CharSequence)this.zzc.get(0);
                zzby2.zze((CharSequence)object2);
                return;
            }
            case 0: 
            case 1: 
        }
        object2 = (CharSequence)this.zzc.get(0);
        zzby2.zzq((CharSequence)object2);
        return;
        catch (NumberFormatException | StringIndexOutOfBoundsException runtimeException) {
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
    }
}

