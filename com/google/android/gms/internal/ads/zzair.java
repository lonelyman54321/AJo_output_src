/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaiq;
import com.google.android.gms.internal.ads.zzais;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzaiw;
import com.google.android.gms.internal.ads.zzaiy;
import com.google.android.gms.internal.ads.zzaja;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import java.util.ArrayDeque;

final class zzair
implements zzait {
    private final byte[] zza;
    private final ArrayDeque zzb;
    private final zzaja zzc;
    private zzais zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public zzair() {
        Object object = new byte[8];
        this.zza = object;
        object = new ArrayDeque;
        this.zzb = object;
        object = new zzaja;
        super();
        this.zzc = object;
    }

    private final long zzd(zzadv object, int n3) {
        object = (zzadi)object;
        byte[] byArray = this.zza;
        ((zzadi)object).zzn(byArray, 0, n3, false);
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            l2 <<= 8;
            object = this.zza;
            int n4 = object[i3] & 0xFF;
            long l3 = n4;
            l2 |= l3;
        }
        return l2;
    }

    public final void zza(zzais zzais2) {
        this.zzd = zzais2;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    public final boolean zzc(zzadv object) {
        int n3;
        long l2;
        long l3;
        int n4;
        int n7;
        Object object2 = this.zzd;
        zzeq.zzb(object2);
        block7: while (true) {
            Object object3;
            Object object4;
            long l4;
            long l7;
            Object object5;
            block30: {
                block29: {
                    block25: {
                        long l8;
                        block26: {
                            long l12;
                            long l14;
                            object2 = (zzaiq)this.zzb.peek();
                            n7 = 1;
                            if (object2 != null && (object5 = (Object)((l14 = (l12 = object.zzf()) - (l7 = zzaiq.zzb((zzaiq)object2))) == 0L ? 0 : (l14 < 0L ? -1 : 1))) >= 0) {
                                object = this.zzd;
                                object5 = zzaiq.zza((zzaiq)this.zzb.pop());
                                ((zzaiw)object).zza.zzi((int)object5);
                                return n7 != 0;
                            }
                            object5 = this.zze;
                            n4 = 4;
                            if (object5 != 0) break block25;
                            object2 = this.zzc;
                            l7 = ((zzaja)object2).zzd((zzadv)object, n7 != 0, false, n4);
                            long l15 = l7 - (l3 = (long)-2);
                            object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                            if (object5 != 0) break block26;
                            object.zzj();
                            while (true) {
                                Object object6;
                                block27: {
                                    block28: {
                                        object2 = this.zza;
                                        object6 = object;
                                        object6 = (zzadi)object;
                                        ((zzadi)object6).zzm((byte[])object2, 0, n4, false);
                                        object2 = this.zza;
                                        object5 = zzaja.zzb((int)object2[0]);
                                        l4 = -1;
                                        if (object5 == l4 || object5 > n4) break block27;
                                        l2 = zzaja.zzc(this.zza, object5, false);
                                        object4 = (int)l2;
                                        object3 = ((zzaiw)this.zzd).zza;
                                        l4 = 357149030;
                                        if (object4 == l4 || object4 == (l4 = (long)524531317) || object4 == (l4 = (long)475249515)) break block28;
                                        l4 = 374648427;
                                        if (object4 != l4) break block27;
                                        object4 = 374648427;
                                    }
                                    ((zzadi)object6).zzo((int)object5, false);
                                    l7 = (long)object4;
                                    break;
                                }
                                ((zzadi)object6).zzo(n7, false);
                            }
                        }
                        if ((object5 = (Object)((l8 = l7 - (l3 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                            return false;
                        }
                        this.zzf = object5 = (int)l7;
                        this.zze = n7;
                        break block29;
                    }
                    if (object5 != n7) break block30;
                }
                object2 = this.zzc;
                n3 = 8;
                this.zzg = l7 = ((zzaja)object2).zzd((zzadv)object, false, n7 != 0, n3);
                this.zze = object5 = 2;
            }
            object2 = this.zzd;
            n3 = this.zzf;
            object2 = (zzaiw)object2;
            object3 = ((zzaiw)object2).zza;
            l3 = 8;
            switch (n3) {
                default: {
                    long l16 = this.zzg;
                    n7 = (int)l16;
                    object2 = object;
                    object2 = (zzadi)object;
                    ((zzadi)object2).zzo(n7, false);
                    this.zze = 0;
                    continue block7;
                }
                case 181: 
                case 17545: 
                case 21969: 
                case 21970: 
                case 21971: 
                case 21972: 
                case 21973: 
                case 21974: 
                case 21975: 
                case 21976: 
                case 21977: 
                case 21978: 
                case 30323: 
                case 30324: 
                case 30325: {
                    double d2;
                    long l17 = this.zzg;
                    long l18 = 4;
                    l4 = l17 == l18 ? 0 : (l17 < l18 ? -1 : 1);
                    if (l4 != false && (l4 = l17 == l3 ? 0 : (l17 < l3 ? -1 : 1)) != false) {
                        object = new StringBuilder("Invalid float size: ");
                        ((StringBuilder)object).append(l17);
                        throw zzch.zza(((StringBuilder)object).toString(), null);
                    }
                    l4 = (int)l17;
                    l3 = this.zzd((zzadv)object, (int)l4);
                    if (l4 == n4) {
                        int n8 = (int)l3;
                        float f5 = Float.intBitsToFloat(n8);
                        d2 = f5;
                    } else {
                        d2 = Double.longBitsToDouble(l3);
                    }
                    ((zzaiw)object2).zza.zzj(n3, d2);
                    this.zze = 0;
                    return n7 != 0;
                }
                case 161: 
                case 163: 
                case 165: 
                case 16877: 
                case 16981: 
                case 18402: 
                case 21419: 
                case 25506: 
                case 30322: {
                    object5 = (int)this.zzg;
                    ((zzaiy)object3).zzh(n3, (int)object5, (zzadv)object);
                    this.zze = 0;
                    return n7 != 0;
                }
                case 160: 
                case 166: 
                case 174: 
                case 183: 
                case 187: 
                case 224: 
                case 225: 
                case 16868: 
                case 18407: 
                case 19899: 
                case 20532: 
                case 20533: 
                case 21936: 
                case 21968: 
                case 25152: 
                case 28032: 
                case 30113: 
                case 30320: 
                case 290298740: 
                case 357149030: 
                case 374648427: 
                case 408125543: 
                case 440786851: 
                case 475249515: 
                case 524531317: {
                    long l19 = object.zzf();
                    l2 = this.zzg + l19;
                    object = this.zzb;
                    object2 = new zzaiq(n3, l2, null);
                    ((ArrayDeque)object).push(object2);
                    object = this.zzd;
                    int n10 = this.zzf;
                    l7 = this.zzg;
                    ((zzaiw)object).zza.zzl(n10, l19, l7);
                    this.zze = 0;
                    return n7 != 0;
                }
                case 134: 
                case 17026: 
                case 21358: 
                case 2274716: {
                    l2 = this.zzg;
                    long l20 = Integer.MAX_VALUE;
                    n4 = (int)(l2 == l20 ? 0 : (l2 < l20 ? -1 : 1));
                    if (n4 <= 0) {
                        n4 = (int)l2;
                        if (n4 == 0) {
                            object = "";
                        } else {
                            int n14;
                            object3 = new byte[n4];
                            object = (zzadi)object;
                            ((zzadi)object).zzn((byte[])object3, 0, n4, false);
                            while (n4 > 0 && (object4 = object3[n14 = n4 + -1]) == false) {
                                n4 = n14;
                            }
                            object = new String((byte[])object3, 0, n4);
                        }
                        ((zzaiw)object2).zza.zzm(n3, (String)object);
                        this.zze = 0;
                        return n7 != 0;
                    }
                    object = new StringBuilder("String element size: ");
                    ((StringBuilder)object).append(l2);
                    throw zzch.zza(((StringBuilder)object).toString(), null);
                }
                case 131: 
                case 136: 
                case 155: 
                case 159: 
                case 176: 
                case 179: 
                case 186: 
                case 215: 
                case 231: 
                case 238: 
                case 241: 
                case 251: 
                case 16871: 
                case 16980: 
                case 17029: 
                case 17143: 
                case 18401: 
                case 18408: 
                case 20529: 
                case 20530: 
                case 21420: 
                case 21432: 
                case 21680: 
                case 21682: 
                case 21690: 
                case 21930: 
                case 21938: 
                case 21945: 
                case 21946: 
                case 21947: 
                case 21948: 
                case 21949: 
                case 21998: 
                case 22186: 
                case 22203: 
                case 25188: 
                case 30114: 
                case 30321: 
                case 2352003: 
                case 2807729: 
            }
            break;
        }
        long l21 = this.zzg;
        n4 = (int)(l21 == l3 ? 0 : (l21 < l3 ? -1 : 1));
        if (n4 <= 0) {
            n4 = (int)l21;
            l2 = this.zzd((zzadv)object, n4);
            ((zzaiw)object2).zza.zzk(n3, l2);
            this.zze = 0;
            return n7 != 0;
        }
        object = new StringBuilder("Invalid integer size: ");
        ((StringBuilder)object).append(l21);
        throw zzch.zza(((StringBuilder)object).toString(), null);
    }
}

