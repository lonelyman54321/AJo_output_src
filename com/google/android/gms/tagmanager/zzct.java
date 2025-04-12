/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzfs;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zzct
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzN.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzbE.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzbI.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzaY.toString();

    public zzct() {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
    }

    private static final void zzc(Set set, String string2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            n3 = string2.charAt(i3);
            Character c2 = Character.valueOf((char)n3);
            set.add(c2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String zzd(String string2, int n3, Set object) {
        int n4 = 1;
        if ((n3 += -1) != n4) {
            boolean bl2;
            n4 = 2;
            if (n3 != n4) {
                return string2;
            }
            String string3 = "\\";
            string2 = string2.replace(string3, "\\\\");
            Iterator iterator = object.iterator();
            while (bl2 = iterator.hasNext()) {
                object = ((Character)iterator.next()).toString();
                String string4 = String.valueOf(object);
                string4 = string3.concat(string4);
                string2 = string2.replace((CharSequence)object, string4);
            }
            return string2;
        }
        try {
            return zzfs.zza(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzap zza(Map object) {
        boolean bl2;
        int n3;
        CharSequence charSequence;
        Object object2 = zzb;
        if ((object2 = (zzap)object.get(object2)) == null) {
            return zzfp.zza();
        }
        Object object3 = zzc;
        object3 = (object3 = (zzap)object.get(object3)) != null ? zzfp.zzm(zzfp.zzk((zzap)object3)) : "";
        Object object4 = zzd;
        object4 = (zzap)object.get(object4);
        object4 = object4 != null ? zzfp.zzm(zzfp.zzk((zzap)object4)) : "=";
        String string2 = zze;
        object = (zzap)object.get(string2);
        int n4 = 3;
        int n7 = 2;
        boolean bl3 = false;
        Object object5 = null;
        boolean bl4 = true;
        if (object != null) {
            charSequence = "url";
            boolean bl5 = ((String)charSequence).equals(object = zzfp.zzm(zzfp.zzk((zzap)object)));
            if (bl5) {
                n3 = 2;
            } else {
                object5 = "backslash";
                bl3 = ((String)object5).equals(object);
                if (!bl3) {
                    object = String.valueOf(object);
                    "Joiner: unsupported escape type: ".concat((String)object);
                    return zzfp.zza();
                }
                object5 = new Object();
                zzct.zzc(object5, (String)object3);
                zzct.zzc(object5, (String)object4);
                object = Character.valueOf('\\');
                ((HashSet)object5).remove(object);
                n3 = 3;
            }
        } else {
            n3 = 1;
        }
        charSequence = new StringBuilder();
        int n8 = ((zzap)object2).zzO();
        int n10 = 0;
        if (n8 != n7) {
            if (n8 != n4) {
                object2 = zzfp.zzm(zzfp.zzk(object2));
                object = zzct.zzd((String)object2, n3, object5);
                ((StringBuilder)charSequence).append((String)object);
                return zzfp.zzb(((StringBuilder)charSequence).toString());
            }
            while (n10 < (n4 = ((zzap)object2).zzc())) {
                if (n10 > 0) {
                    ((StringBuilder)charSequence).append((String)object3);
                }
                string2 = zzfp.zzm(zzfp.zzk(((zzap)object2).zzk(n10)));
                String string3 = zzfp.zzm(zzfp.zzk(((zzap)object2).zzl(n10)));
                string2 = zzct.zzd(string2, n3, object5);
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append((String)object4);
                string2 = zzct.zzd(string3, n3, object5);
                ((StringBuilder)charSequence).append(string2);
                ++n10;
            }
            return zzfp.zzb(((StringBuilder)charSequence).toString());
        }
        object2 = ((zzap)object2).zzr().iterator();
        while (bl2 = object2.hasNext()) {
            object4 = (zzap)object2.next();
            if (!bl4) {
                ((StringBuilder)charSequence).append((String)object3);
            }
            object4 = zzct.zzd(zzfp.zzm(zzfp.zzk((zzap)object4)), n3, object5);
            ((StringBuilder)charSequence).append((String)object4);
            bl4 = false;
        }
        return zzfp.zzb(((StringBuilder)charSequence).toString());
    }

    public final boolean zzb() {
        return true;
    }
}

