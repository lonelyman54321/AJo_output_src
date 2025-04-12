/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzanc;
import com.google.android.gms.internal.ads.zzanl;
import com.google.android.gms.internal.ads.zzanp;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class zzanm
implements zzalv {
    private final zzfu zza;
    private final zzanc zzb;

    public zzanm() {
        Object object = new zzfu();
        this.zza = object;
        this.zzb = object = new zzanc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(byte[] object, int n3, int n4, zzalu zzalu2, zzev zzev2) {
        Object object2;
        Object object3;
        boolean bl2;
        String string2;
        ArrayList<Object> arrayList;
        Object object4;
        block15: {
            block14: {
                object4 = this.zza;
                ((zzfu)object4).zzI((byte[])object, n4 += n3);
                this.zza.zzK(n3);
                object = new ArrayList();
                arrayList = this.zza;
                n4 = ((zzfu)((Object)arrayList)).zzd();
                object4 = zzfxs.zzc;
                string2 = ((zzfu)((Object)arrayList)).zzy((Charset)object4);
                if (string2 == null || !(bl2 = string2.startsWith((String)(object3 = "WEBVTT")))) break block14;
                do {
                    arrayList = this.zza;
                } while ((n3 = (int)(TextUtils.isEmpty((CharSequence)((Object)(arrayList = ((zzfu)((Object)arrayList)).zzy((Charset)(object2 = zzfxs.zzc))))) ? 1 : 0)) == 0);
                break block15;
            }
            try {
                ((zzfu)((Object)arrayList)).zzK(n4);
                object = ((zzfu)((Object)arrayList)).zzy((Charset)object4);
                arrayList = "Expected WEBVTT. Got ";
                object = String.valueOf(object);
                object = ((String)((Object)arrayList)).concat((String)object);
                n3 = 0;
                arrayList = null;
                object = zzch.zza((String)object, null);
                throw object;
            }
            catch (zzch zzch2) {}
            arrayList = new ArrayList<Object>((Throwable)zzch2);
            throw arrayList;
        }
        arrayList = new ArrayList<Object>();
        block4: while (true) {
            int n7;
            int n8;
            object2 = this.zza;
            int n10 = -1;
            bl2 = false;
            string2 = null;
            int n14 = -1;
            int n15 = 0;
            while (true) {
                n8 = 1;
                n7 = 2;
                if (n14 != n10) break;
                n15 = ((zzfu)object2).zzd();
                object3 = zzfxs.zzc;
                if ((object3 = ((zzfu)object2).zzy((Charset)object3)) == null) {
                    n14 = 0;
                    object3 = null;
                    continue;
                }
                String string3 = "STYLE";
                boolean bl3 = string3.equals(object3);
                if (bl3) {
                    n14 = 2;
                    continue;
                }
                String string4 = "NOTE";
                n14 = (int)(((String)object3).startsWith(string4) ? 1 : 0);
                if (n14 != 0) {
                    n14 = 1;
                    continue;
                }
                n14 = 3;
            }
            ((zzfu)object2).zzK(n15);
            if (n14 == 0) {
                object = new zzanp(arrayList);
                zzalp.zza((zzalq)object, zzalu2, zzev2);
                return;
            }
            if (n14 == n8) {
                object2 = this.zza;
                while (true) {
                    object4 = zzfxs.zzc;
                    n10 = (int)(TextUtils.isEmpty((CharSequence)(object4 = ((zzfu)object2).zzy((Charset)object4))) ? 1 : 0);
                    if (n10 != 0) continue block4;
                }
            }
            if (n14 == n7) {
                n4 = (int)(arrayList.isEmpty() ? 1 : 0);
                if (n4 == 0) {
                    object = new IllegalArgumentException("A style block was found after the first cue.");
                    throw object;
                }
                object2 = this.zza;
                object4 = zzfxs.zzc;
                ((zzfu)object2).zzy((Charset)object4);
                object2 = this.zzb;
                object4 = this.zza;
                object2 = ((zzanc)object2).zzb((zzfu)object4);
                ((ArrayList)object).addAll(object2);
                continue;
            }
            object2 = zzanl.zzc(this.zza, (List)object);
            if (object2 == null) continue;
            arrayList.add(object2);
        }
    }
}

