/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqz;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zznx
extends zzjo {
    private static final void zzb(Set set, String string2) {
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
    private static final String zzc(String string2, int n3, Set object) {
        String string3;
        int n4 = 1;
        if (n3 != n4) {
            boolean bl2;
            n4 = 2;
            if (n3 != n4) {
                return string2;
            }
            String string4 = "\\";
            string2 = string2.replace(string4, "\\\\");
            Iterator iterator = object.iterator();
            while (bl2 = iterator.hasNext()) {
                object = ((Character)iterator.next()).toString();
                String string5 = String.valueOf(object);
                string5 = string4.concat(string5);
                string2 = string2.replace((CharSequence)object, string5);
            }
            return string2;
        }
        String string6 = "UTF-8";
        try {
            string6 = URLEncoder.encode(string2, string6);
            object = "\\+";
            string3 = "%20";
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string2;
        }
        return string6.replaceAll((String)object, string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((Object)object2).length;
        if (n4 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object6 = null;
        }
        Preconditions.checkArgument(bl2);
        object6 = object2[0];
        Object object7 = n4 > n3 ? object2[n3] : zzqs.zze;
        String string2 = "";
        int n7 = 2;
        object5 = n4 <= n7 || (object5 = object2[n7]) == (object4 = zzqs.zze) ? string2 : zzjn.zzd((zzqo)object5);
        object4 = "=";
        int n8 = 3;
        if (n4 > n8 && (object2 = object2[n8]) != (object3 = zzqs.zze)) {
            object4 = zzjn.zzd((zzqo)object2);
        }
        object2 = zzqs.zze;
        n4 = 0;
        object3 = null;
        if (object7 != object2) {
            Preconditions.checkArgument(object7 instanceof zzqz);
            object2 = ((zzqo)object7).zzc();
            String string3 = "url";
            char c2 = string3.equals(object2);
            if (c2 != '\u0000') {
                n7 = 1;
            } else {
                object3 = "backslash";
                object2 = ((zzqo)object7).zzc();
                c2 = ((String)object3).equals(object2);
                if (c2 == '\u0000') return new zzqz(string2);
                object3 = new Object();
                zznx.zzb(object3, (String)object5);
                zznx.zzb(object3, (String)object4);
                c2 = '\\';
                object2 = Character.valueOf(c2);
                ((HashSet)object3).remove(object2);
            }
        } else {
            n7 = 0;
        }
        object2 = new StringBuilder();
        boolean bl3 = object6 instanceof zzqv;
        if (bl3) {
            object6 = ((zzqv)object6).zzk().iterator();
            while (bl3 = object6.hasNext()) {
                object7 = (zzqo)object6.next();
                if (n3 == 0) {
                    ((StringBuilder)object2).append((String)object5);
                }
                object = zznx.zzc(zzjn.zzd((zzqo)object7), n7, object3);
                ((StringBuilder)object2).append((String)object);
                n3 = 0;
                object = null;
            }
        } else {
            bl3 = object6 instanceof zzqw;
            if (bl3) {
                boolean bl4;
                object6 = ((zzqw)object6).zzi();
                object7 = object6.keySet().iterator();
                while (bl4 = object7.hasNext()) {
                    string2 = (String)object7.next();
                    if (n3 == 0) {
                        ((StringBuilder)object2).append((String)object5);
                    }
                    object = zzjn.zzd((zzqo)object6.get(string2));
                    string2 = zznx.zzc(string2, n7, object3);
                    ((StringBuilder)object2).append(string2);
                    ((StringBuilder)object2).append((String)object4);
                    object = zznx.zzc((String)object, n7, object3);
                    ((StringBuilder)object2).append((String)object);
                    n3 = 0;
                    object = null;
                }
            } else {
                object = zznx.zzc(zzjn.zzd(object6), n7, (Set)object3);
                ((StringBuilder)object2).append((String)object);
            }
        }
        object = ((StringBuilder)object2).toString();
        return new zzqz((String)object);
    }
}

