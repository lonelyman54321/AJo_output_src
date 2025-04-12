/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzmp;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;
import com.google.android.gms.internal.ads.zzzk;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzn;
import java.util.Arrays;
import java.util.List;

public abstract class zzzj
extends zzzm {
    private zzzi zza;

    public abstract Pair zzd(zzzi var1, int[][][] var2, int[] var3, zzvo var4, zzdc var5);

    public final zzzn zzp(zzmp[] zzmpArray, zzxr zzdeArray, zzvo zzvo2, zzdc zzdc2) {
        int n3;
        Object object;
        int n4;
        Object object2;
        int n7;
        int n8;
        boolean[] blArray;
        zzmp zzmp2;
        int n10;
        int n14;
        Object object3;
        int n15;
        Object object4;
        int n16;
        Object object5;
        Object object6;
        int n17;
        int n18;
        Object object7 = zzdeArray;
        int n19 = 3;
        Object object8 = new int[n19];
        Object object9 = new zzde[n19][];
        int[][][] nArrayArray = new int[n19][][];
        Object object10 = null;
        for (n18 = 0; n18 < n19; ++n18) {
            n17 = ((zzxr)object7).zzc;
            object6 = new zzde[n17];
            object9[n18] = object6;
            object5 = new int[n17][];
            nArrayArray[n18] = (int[][])object5;
        }
        n19 = 2;
        int[] nArray = new int[n19];
        object10 = null;
        for (n18 = 0; n18 < n19; ++n18) {
            object5 = zzmpArray[n18];
            nArray[n18] = n17 = object5.zze();
        }
        object10 = null;
        for (n18 = 0; n18 < (n17 = ((zzxr)object7).zzc); ++n18) {
            object5 = ((zzxr)object7).zzb(n18);
            n16 = ((zzde)object5).zzd;
            object4 = null;
            int n20 = 2;
            n15 = 0;
            object3 = null;
            n14 = 1;
            for (n10 = 0; n10 < n19; ++n10) {
                zzmp2 = zzmpArray[n10];
                blArray = null;
                n8 = 0;
                for (n7 = 0; n7 < (n19 = ((zzde)object5).zzb); ++n7) {
                    object2 = ((zzde)object5).zzb(n7);
                    n19 = zzmp2.zzY((zzan)object2) & 7;
                    n8 = Math.max(n8, n19);
                }
                n19 = object8[n10];
                if (n19 == 0) {
                    n19 = 1;
                } else {
                    n19 = 0;
                    object2 = null;
                }
                if (n8 <= n15) {
                    if (n8 == n15 && n16 == (n7 = 5) && n14 == 0 && n19 != 0) {
                        n20 = n10;
                        n15 = n8;
                        n14 = 1;
                    }
                } else {
                    n14 = n19;
                    n20 = n10;
                    n15 = n8;
                }
                n19 = 2;
            }
            if (n20 == n19) {
                n19 = ((zzde)object5).zzb;
                object2 = new int[n19];
            } else {
                object2 = zzmpArray[n20];
                n16 = ((zzde)object5).zzb;
                object6 = new int[n16];
                object4 = null;
                for (n10 = 0; n10 < (n15 = ((zzde)object5).zzb); ++n10) {
                    object3 = ((zzde)object5).zzb(n10);
                    n15 = object2.zzY((zzan)object3);
                    object6[n10] = n15;
                }
                object2 = object6;
            }
            n16 = object8[n20];
            object4 = object9[n20];
            object4[n16] = object5;
            object5 = nArrayArray[n20];
            object5[n16] = (int[])object2;
            object8[n20] = ++n16;
            n19 = 2;
        }
        n19 = 1;
        n18 = 2;
        object4 = new zzxr[n18];
        object5 = new String[n18];
        object6 = new int[n18];
        object7 = null;
        for (n4 = 0; n4 < n18; ++n4) {
            n18 = object8[n4];
            object3 = (zzde[])zzgd.zzP(object9[n4], n18);
            object = new zzxr((zzde)object3);
            object4[n4] = object;
            object = nArrayArray[n4];
            object10 = (int[][])zzgd.zzP((Object[])object, n18);
            nArrayArray[n4] = (int[][])object10;
            object10 = zzmpArray[n4].zzU();
            object5[n4] = (int[])object10;
            object10 = zzmpArray[n4];
            n18 = object10.zzb();
            object6[n4] = (zzde)n18;
            n18 = 2;
        }
        n4 = 2;
        int n21 = object8[n4];
        object7 = (zzde[])zzgd.zzP(object9[n4], n21);
        Object object11 = new zzxr((zzde[])object7);
        object10 = object7;
        object = nArray;
        object3 = nArrayArray;
        object7 = new zzzi((String[])object5, (int[])object6, (zzxr[])object4, nArray, nArrayArray, (zzxr)object11);
        object10 = this;
        object5 = object7;
        object6 = nArrayArray;
        object4 = nArray;
        object = zzvo2;
        object3 = zzdc2;
        object8 = this.zzd((zzzi)object7, nArrayArray, nArray, zzvo2, zzdc2);
        object9 = (zzzk[])object8.second;
        n18 = ((zzde[][])object9).length;
        object10 = new List[n18];
        object5 = null;
        for (n17 = 0; n17 < (n16 = ((zzde[][])object9).length); ++n17) {
            object6 = object9[n17];
            object6 = object6 != null ? zzgbc.zzn(object6) : zzgbc.zzm();
            object10[n17] = object6;
        }
        object9 = new zzgaz();
        n17 = 2;
        object6 = null;
        for (n16 = 0; n16 < n17; ++n16) {
            object4 = ((zzzi)object7).zzd(n16);
            object = object10[n16];
            object3 = null;
            for (n15 = 0; n15 < (n14 = object4.zzc); ++n15) {
                int n22;
                object11 = object4.zzb(n15);
                n3 = 0;
                nArrayArray = null;
                n7 = ((zzzi)object7).zza(n16, n15, false);
                if (n7 != 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    nArrayArray = null;
                }
                n7 = ((zzde)object11).zzb;
                nArray = new int[n7];
                blArray = new boolean[n7];
                for (n8 = 0; n8 < (n22 = ((zzde)object11).zzb); ++n8) {
                    block23: {
                        nArray[n8] = n22 = ((zzzi)object7).zzb(n16, n15, n8) & 7;
                        zzmp2 = null;
                        for (n22 = 0; n22 < (n19 = object.size()); ++n22) {
                            object2 = (zzzk)object.get(n22);
                            object5 = object2.zze();
                            n17 = (int)(((zzde)object5).equals(object11) ? 1 : 0);
                            if (n17 != 0 && (n19 = object2.zzb(n8)) != (n17 = -1)) {
                                n19 = 1;
                                break block23;
                            }
                            n17 = 2;
                        }
                        n19 = 0;
                        object2 = null;
                    }
                    blArray[n8] = n19;
                    n19 = 1;
                    n17 = 2;
                }
                object2 = new zzdo((zzde)object11, n3 != 0, nArray, blArray);
                ((zzgaz)object9).zzf(object2);
                n19 = 1;
                n17 = 2;
            }
            n19 = 1;
            n17 = 2;
        }
        object2 = ((zzzi)object7).zze();
        nArrayArray = null;
        for (n3 = 0; n3 < (n18 = ((zzxr)object2).zzc); ++n3) {
            object10 = ((zzxr)object2).zzb(n3);
            n17 = ((zzde)object10).zzb;
            object5 = new int[n17];
            n16 = 0;
            object6 = null;
            Arrays.fill((int[])object5, 0);
            n10 = ((zzde)object10).zzb;
            object4 = new boolean[n10];
            object = new zzdo((zzde)object10, false, (int[])object5, (boolean[])object4);
            ((zzgaz)object9).zzf(object);
        }
        object9 = ((zzgaz)object9).zzi();
        object2 = new zzdp((List)object9);
        object10 = (zzmq[])object8.first;
        object8 = (zzzg[])object8.second;
        object9 = new zzzn((zzmq[])object10, (zzzg[])object8, (zzdp)object2, object7);
        return object9;
    }

    public final void zzq(Object object) {
        this.zza = object = (zzzi)object;
    }
}

