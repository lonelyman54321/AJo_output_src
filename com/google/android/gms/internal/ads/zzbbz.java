/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbbx;
import com.google.android.gms.internal.ads.zzbby;
import java.io.IOException;
import java.io.OutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

public final class zzbbz {
    private final zzbbo zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzbbz(int n3, int n4, int n7) {
        this.zzb = n3;
        n3 = 64;
        if (n4 > n3 || n4 < 0) {
            n4 = 64;
        }
        this.zzd = n7 <= 0 ? (n3 = 1) : n7;
        zzbbx zzbbx2 = new zzbbx(n4);
        this.zza = zzbbx2;
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        boolean bl2;
        Object object;
        int n3;
        zzbbz zzbbz2 = this;
        Object object2 = arrayList2;
        Object object3 = new zzbby(this);
        Collections.sort(arrayList2, object3);
        object3 = new HashSet();
        zzbbo zzbbo2 = null;
        block5: for (int i3 = 0; i3 < (n3 = arrayList2.size()); ++i3) {
            int n4;
            n3 = ((zzbbn)((ArrayList)object2).get(i3)).zze();
            String[] stringArray = (String[])arrayList.get(n3);
            Object object4 = Normalizer.Form.NFKC;
            stringArray = Normalizer.normalize((CharSequence)stringArray, object4);
            object4 = Locale.US;
            stringArray = stringArray.toLowerCase((Locale)object4);
            object4 = "\n";
            int n7 = (stringArray = stringArray.split((String)object4)).length;
            if (n7 == 0) continue;
            object4 = null;
            for (n7 = 0; n7 < (n4 = stringArray.length); ++n7) {
                int n8;
                String string2;
                int n10;
                int n14;
                Object object5 = stringArray[n7];
                CharSequence charSequence = "'";
                int n15 = object5.contains(charSequence);
                int n16 = 1;
                if (n15 != 0) {
                    char c2;
                    int n17;
                    charSequence = new StringBuilder((String)object5);
                    n14 = 1;
                    n10 = 0;
                    string2 = null;
                    while ((n17 = n14 + 2) <= (c2 = ((StringBuilder)charSequence).length())) {
                        char c3;
                        c2 = ((StringBuilder)charSequence).charAt(n14);
                        if (c2 == (c3 = '\'')) {
                            n10 = n14 + -1;
                            if (!((n10 = (int)((StringBuilder)charSequence).charAt(n10)) == (c2 = ' ') || (c3 = ((StringBuilder)charSequence).charAt(n10 = n14 + 1)) != (n8 = 115) && (n8 = (int)((StringBuilder)charSequence).charAt(n10)) != (n10 = 83) || n17 != (n8 = ((StringBuilder)charSequence).length()) && (n8 = (int)((StringBuilder)charSequence).charAt(n17)) != c2)) {
                                ((StringBuilder)charSequence).insert(n14, c2);
                                n14 = n17;
                            } else {
                                ((StringBuilder)charSequence).setCharAt(n14, c2);
                            }
                            n10 = 1;
                        }
                        n14 += n16;
                    }
                    if (n10 != 0) {
                        object = ((StringBuilder)charSequence).toString();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    if (object != null) {
                        zzbbz2.zzc = object;
                        object5 = object;
                    }
                }
                if ((n4 = ((String[])(object = zzbbs.zzb((String)object5, n16 != 0))).length) < (n15 = zzbbz2.zzd)) continue;
                object5 = null;
                block8: for (n4 = 0; n4 < (n15 = ((String[])object).length); ++n4) {
                    charSequence = "";
                    for (n16 = 0; n16 < (n14 = zzbbz2.zzd); ++n16) {
                        n14 = n4 + n16;
                        n10 = ((String[])object).length;
                        if (n14 >= n10) break block8;
                        if (n16 > 0) {
                            string2 = " ";
                            charSequence = ((String)charSequence).concat(string2);
                        }
                        String string3 = String.valueOf(object[n14]);
                        charSequence = ((String)charSequence).concat(string3);
                    }
                    ((HashSet)object3).add(charSequence);
                    n15 = ((HashSet)object3).size();
                    n16 = zzbbz2.zzb;
                    if (n15 >= n16) break block5;
                }
                if ((n8 = ((HashSet)object3).size()) >= (n4 = zzbbz2.zzb)) break block5;
            }
        }
        object = new zzbbq();
        object2 = ((HashSet)object3).iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (String)object2.next();
            zzbbo2 = zzbbz2.zza;
            object3 = zzbbo2.zzb((String)object3);
            zzbbo2 = object.zzb;
            try {
                ((OutputStream)((Object)zzbbo2)).write((byte[])object3);
            }
            catch (IOException iOException) {
                object3 = "Error while writing hash to byteStream";
                zzm.zzh((String)object3, iOException);
                break;
            }
        }
        return object.toString();
    }
}

