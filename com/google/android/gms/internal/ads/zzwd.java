/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbs;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzuy;
import com.google.android.gms.internal.ads.zzuz;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwc;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxh;
import com.google.android.gms.internal.ads.zzxn;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

final class zzwd
implements zzvm,
zzvl {
    private final zzvm[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc;
    private final HashMap zzd;
    private zzvl zze;
    private zzxr zzf;
    private zzvm[] zzg;
    private zzxh zzh;
    private final zzuz zzi;

    public zzwd(zzuz identityHashMap, long[] lArray, zzvm ... zzvmArray) {
        int n3;
        this.zzi = identityHashMap;
        this.zza = zzvmArray;
        identityHashMap = new IdentityHashMap();
        this.zzc = identityHashMap;
        this.zzd = identityHashMap;
        zzvm[] zzvmArray2 = zzgbc.zzm();
        zzgbc zzgbc2 = zzgbc.zzm();
        identityHashMap = new IdentityHashMap((List)zzvmArray2, zzgbc2);
        this.zzh = identityHashMap;
        this.zzb = identityHashMap = new IdentityHashMap();
        identityHashMap = null;
        zzvmArray2 = new zzvm[]{};
        this.zzg = zzvmArray2;
        for (int i3 = 0; i3 < (n3 = zzvmArray.length); ++i3) {
            long l2 = lArray[i3];
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) continue;
            zzvm[] zzvmArray3 = this.zza;
            zzvm zzvm2 = zzvmArray[i3];
            zzxn zzxn2 = new zzxn(zzvm2, l2);
            zzvmArray3[i3] = zzxn2;
        }
    }

    public final long zza(long l2, zzmr zzmr2) {
        Object object = this.zzg;
        int n3 = ((zzvm[])object).length;
        object = n3 > 0 ? object[0] : this.zza[0];
        return object.zza(l2, zzmr2);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long l2;
        zzwd zzwd2 = this;
        Object object = this.zzg;
        int n3 = ((zzvm[])object).length;
        long l3 = l2 = -9223372036854775807L;
        for (int i3 = 0; i3 < n3; ++i3) {
            long l4;
            long l7;
            long l8;
            zzvm zzvm2 = object[i3];
            long l12 = zzvm2.zzd();
            String string2 = "Unexpected child seekToUs result.";
            Object object2 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1);
            if (object2 != false) {
                object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (object2 == false) {
                    zzvm zzvm3;
                    zzvm[] zzvmArray = zzwd2.zzg;
                    int n4 = zzvmArray.length;
                    for (object2 = (Object)0; object2 < n4 && (zzvm3 = zzvmArray[object2]) != zzvm2; ++object2) {
                        long l14 = zzvm3.zze(l12);
                        long l15 = l14 - l12;
                        Object object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object3 == false) {
                            continue;
                        }
                        object = new IllegalStateException(string2);
                        throw object;
                    }
                    l3 = l12;
                    continue;
                }
                Object object4 = l12 == l3 ? 0 : (l12 < l3 ? -1 : 1);
                if (object4 == false) continue;
                object = new IllegalStateException("Conflicting discontinuities.");
                throw object;
            }
            Object object5 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object5 == false || (l8 = (l7 = (l4 = zzvm2.zze(l3)) - l3) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            object = new IllegalStateException(string2);
            throw object;
        }
        return l3;
    }

    public final long zze(long l2) {
        int n3;
        Object object = this.zzg;
        Object object2 = null;
        object = object[0];
        l2 = object.zze(l2);
        for (int i3 = 1; i3 < (n3 = ((zzvm[])(object2 = this.zzg)).length); ++i3) {
            long l3 = (object2 = object2[i3]).zze(l2);
            long l4 = l3 - l2;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                continue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected child seekToUs result.");
            throw illegalStateException;
        }
        return l2;
    }

    public final long zzf(zzzg[] zzzgArray, boolean[] blArray, zzxf[] zzxfArray, boolean[] blArray2, long l2) {
        Object object;
        int n3;
        int n4;
        zzwd zzwd2 = this;
        Object object2 = zzzgArray;
        Object object3 = zzxfArray;
        int n7 = zzzgArray.length;
        int[] nArray = new int[n7];
        int[] nArray2 = new int[n7];
        Object object4 = null;
        int n8 = 0;
        zzvm[] zzvmArray = null;
        while (true) {
            n4 = ((zzzg[])object2).length;
            int n10 = 0;
            Object object5 = null;
            if (n8 >= n4) break;
            Object object6 = object3[n8];
            if (object6 != null) {
                object5 = object6 = zzwd2.zzb.get(object6);
                object5 = (Integer)object6;
            }
            n4 = -1;
            n10 = object5 == null ? -1 : (Integer)object5;
            nArray[n8] = n10;
            object5 = object2[n8];
            if (object5 != null) {
                object6 = object5.zze().zzc;
                object5 = ":";
                n10 = ((String)object6).indexOf((String)object5);
                object6 = ((String)object6).substring(0, n10);
                nArray2[n8] = n4 = Integer.parseInt((String)object6);
            } else {
                nArray2[n8] = n4;
            }
            ++n8;
        }
        zzwd2.zzb.clear();
        zzvmArray = zzwd2.zza;
        zzxf[] zzxfArray2 = new zzxf[n4];
        zzxf[] zzxfArray3 = new zzxf[n4];
        Object object7 = new zzzg[n4];
        n8 = zzvmArray.length;
        Object object8 = new ArrayList(n8);
        long l3 = l2;
        zzvmArray = null;
        for (n8 = 0; n8 < (n3 = ((zzvm[])(object = zzwd2.zza)).length); ++n8) {
            block19: {
                Object object9;
                zzxf[] zzxfArray4;
                zzzg[] zzzgArray2;
                Object object10;
                Object object11;
                int n14;
                block18: {
                    long l4;
                    block17: {
                        object = null;
                        for (n3 = 0; n3 < (n14 = ((zzzg[])object2).length); ++n3) {
                            n14 = nArray[n3];
                            if (n14 == n8) {
                                object11 = object3[n3];
                            } else {
                                n14 = 0;
                                object11 = null;
                            }
                            zzxfArray3[n3] = object11;
                            n14 = nArray2[n3];
                            if (n14 == n8) {
                                object11 = object2[n3];
                                object11.getClass();
                                object10 = zzwd2.zzd;
                                object4 = object11.zze();
                                object4 = (zzde)((HashMap)object10).get(object4);
                                object4.getClass();
                                object7[n3] = object10 = new zzwc((zzzg)object11, (zzde)object4);
                            } else {
                                object7[n3] = null;
                            }
                            object4 = null;
                        }
                        object = zzwd2.zza[n8];
                        object11 = object7;
                        object10 = blArray;
                        object4 = object8;
                        object8 = zzxfArray3;
                        zzzgArray2 = object7;
                        object7 = blArray2;
                        zzxfArray4 = zzxfArray3;
                        l4 = object.zzf((zzzg[])object11, blArray, zzxfArray3, blArray2, l3);
                        if (n8 != 0) break block17;
                        l3 = l4;
                        break block18;
                    }
                    object9 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                    if (object9 != false) break block19;
                }
                object = null;
                n14 = 0;
                object11 = null;
                for (n3 = 0; n3 < (object9 = (Object)((Object[])object2).length); ++n3) {
                    object9 = nArray2[n3];
                    boolean bl2 = true;
                    if (object9 == n8) {
                        object11 = zzxfArray4[n3];
                        object11.getClass();
                        zzxfArray2[n3] = object11;
                        object10 = zzwd2.zzb;
                        object7 = n8;
                        ((IdentityHashMap)object10).put(object11, object7);
                        n14 = 1;
                        continue;
                    }
                    object9 = nArray[n3];
                    if (object9 != n8) continue;
                    object10 = zzxfArray4[n3];
                    if (object10 != null) {
                        bl2 = false;
                        object8 = null;
                    }
                    zzeq.zzf(bl2);
                }
                if (n14 != 0) {
                    object = zzwd2.zza[n8];
                    ((ArrayList)object4).add(object);
                }
                object8 = object4;
                object7 = zzzgArray2;
                zzxfArray3 = zzxfArray4;
                object4 = null;
                continue;
            }
            object2 = new IllegalStateException("Children enabled at different positions.");
            throw object2;
        }
        object4 = object8;
        System.arraycopy(zzxfArray2, 0, object3, 0, n4);
        object2 = new zzvm[]{};
        object2 = (zzvm[])object8.toArray((T[])object2);
        zzwd2.zzg = object2;
        object2 = new zzwb();
        object2 = zzgbs.zzb((List)object8, (zzfxu)object2);
        zzwd2.zzh = object3 = new zzuy((List)object8, (List)object2);
        return l3;
    }

    public final zzxr zzh() {
        zzxr zzxr2 = this.zzf;
        zzxr2.getClass();
        return zzxr2;
    }

    public final void zzi(zzvm object) {
        int n3;
        Object object2;
        int n4;
        int n7;
        Object object3 = this.zzc;
        ((ArrayList)object3).remove(object);
        object = this.zzc;
        boolean bl2 = ((ArrayList)object).isEmpty();
        if (!bl2) {
            return;
        }
        object = this.zza;
        object3 = null;
        int n8 = 0;
        for (n7 = 0; n7 < (n4 = ((zzvm[])object).length); ++n7) {
            object2 = object[n7].zzh();
            n4 = ((zzxr)object2).zzc;
            n8 += n4;
        }
        object = new zzde[n8];
        n8 = 0;
        for (n7 = 0; n7 < (n3 = ((zzvm[])(object2 = this.zza)).length); ++n7) {
            object2 = object2[n7].zzh();
            n3 = ((zzxr)object2).zzc;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object4;
                Object object5;
                String string2;
                zzde zzde2 = ((zzxr)object2).zzb(i3);
                int n10 = zzde2.zzb;
                Object object6 = new zzan[n10];
                int n14 = 0;
                zzde zzde3 = null;
                while (true) {
                    int n15 = zzde2.zzb;
                    string2 = ":";
                    if (n14 >= n15) break;
                    object5 = zzde2.zzb(n14);
                    object4 = ((zzan)object5).zzb();
                    object5 = ((zzan)object5).zzb;
                    if (object5 == null) {
                        object5 = "";
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(n7);
                    stringBuilder.append(string2);
                    stringBuilder.append((String)object5);
                    object5 = stringBuilder.toString();
                    ((zzal)object4).zzK((String)object5);
                    object6[n14] = object5 = ((zzal)object4).zzad();
                    ++n14;
                }
                object5 = zzde2.zzc;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append(n7);
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append((String)object5);
                object5 = ((StringBuilder)object4).toString();
                zzde3 = new zzde((String)object5, (zzan[])object6);
                object6 = this.zzd;
                ((HashMap)object6).put(zzde3, zzde2);
                int n16 = n8 + 1;
                object[n8] = zzde3;
                n8 = n16;
            }
        }
        this.zzf = object3 = new zzxr((zzde[])object);
        object = this.zze;
        object.getClass();
        object.zzi(this);
    }

    public final void zzj(long l2, boolean bl2) {
        for (zzvm zzvm2 : this.zzg) {
            zzvm2.zzj(l2, false);
        }
    }

    public final void zzk() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((zzvm[])(object = this.zza)).length); ++i3) {
            object = object[i3];
            object.zzk();
        }
    }

    public final void zzl(zzvl object, long l2) {
        int n3;
        this.zze = object;
        object = this.zzc;
        Object object2 = this.zza;
        Collections.addAll(object, object2);
        object = null;
        for (int i3 = 0; i3 < (n3 = ((zzvm[])(object2 = this.zza)).length); ++i3) {
            object2 = object2[i3];
            object2.zzl(this, l2);
        }
    }

    public final void zzm(long l2) {
        this.zzh.zzm(l2);
    }

    public final zzvm zzn(int n3) {
        zzvm[] zzvmArray = this.zza;
        zzvm zzvm2 = zzvmArray[n3];
        boolean bl2 = zzvm2 instanceof zzxn;
        if (bl2) {
            zzvm2 = ((zzxn)zzvm2).zzn();
        }
        return zzvm2;
    }

    public final boolean zzo(zzlo zzlo2) {
        ArrayList arrayList = this.zzc;
        int n3 = arrayList.isEmpty();
        if (n3 == 0) {
            arrayList = this.zzc;
            n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                zzvm zzvm2 = (zzvm)this.zzc.get(i3);
                zzvm2.zzo(zzlo2);
            }
            return false;
        }
        return this.zzh.zzo(zzlo2);
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

