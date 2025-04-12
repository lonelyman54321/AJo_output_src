/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzco;
import com.google.android.gms.internal.gtm.zzff;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzek {
    private final Map zza;
    private final List zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzek(zzbq zzbq2, Map map2, long l2, boolean bl2) {
        this(zzbq2, map2, l2, bl2, 0L, 0, null);
    }

    public zzek(zzbq object, Map object2, long l2, boolean bl2, long l3, int n3, List list) {
        boolean bl3;
        boolean bl4;
        String string2;
        Object object3;
        Object object4;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        this.zzd = l2;
        this.zzf = bl2;
        this.zzc = l3;
        this.zze = n3;
        Object object5 = list != null ? list : Collections.emptyList();
        this.zzb = object5;
        object5 = null;
        if (list != null) {
            object4 = list.iterator();
            while (bl2 = object4.hasNext()) {
                String string3 = "appendVersion";
                object3 = (zzco)object4.next();
                string2 = ((zzco)object3).zza();
                bl4 = string3.equals(string2);
                if (!bl4) continue;
                object4 = ((zzco)object3).zzb();
                break;
            }
        } else {
            bl3 = false;
            object4 = null;
        }
        bl2 = true;
        bl4 = TextUtils.isEmpty(object4);
        if (bl2 != bl4) {
            object5 = object4;
        }
        this.zzg = object5;
        object5 = new Object();
        object4 = object2.entrySet().iterator();
        while (bl2 = object4.hasNext()) {
            object3 = (Map.Entry)object4.next();
            string2 = object3.getKey();
            bl4 = zzek.zzl(string2);
            if (!bl4) continue;
            string2 = object3.getKey();
            if ((string2 = zzek.zzj((zzbq)object, string2)) == null) continue;
            object3 = object3.getValue();
            object3 = zzek.zzk(object, object3);
            ((HashMap)object5).put(string2, object3);
        }
        object2 = object2.entrySet().iterator();
        while (bl3 = object2.hasNext()) {
            object4 = (Map.Entry)object2.next();
            object3 = object4.getKey();
            bl2 = zzek.zzl(object3);
            if (bl2) continue;
            object3 = object4.getKey();
            if ((object3 = zzek.zzj(object, object3)) == null) continue;
            object4 = object4.getValue();
            object4 = zzek.zzk((zzbq)object, object4);
            ((HashMap)object5).put(object3, object4);
        }
        object = this.zzg;
        boolean bl5 = TextUtils.isEmpty((CharSequence)object);
        if (!bl5) {
            object = this.zzg;
            zzff.zzg(object5, "_v", object);
            object = this.zzg;
            object2 = "ma4.0.0";
            bl5 = ((String)object).equals(object2);
            if (bl5 || (bl5 = ((String)(object = this.zzg)).equals(object2 = "ma4.0.1"))) {
                object = "adid";
                ((HashMap)object5).remove(object);
            }
        }
        object = Collections.unmodifiableMap(object5);
        this.zza = object;
    }

    public static zzek zze(zzbq zzbq2, zzek zzek2, Map map2) {
        long l2 = zzek2.zzd;
        boolean bl2 = zzek2.zzf;
        long l3 = zzek2.zzc;
        int n3 = zzek2.zze;
        List list = zzek2.zzb;
        zzek2 = new zzek(zzbq2, map2, l2, bl2, l3, n3, list);
        return zzek2;
    }

    private final String zzi(String string2, String string3) {
        Preconditions.checkNotEmpty(string2);
        boolean bl2 = string2.startsWith("&") ^ true;
        String string4 = "Short param name required";
        Preconditions.checkArgument(bl2, string4);
        Map map2 = this.zza;
        string2 = (String)map2.get(string2);
        if (string2 != null) {
            return string2;
        }
        return string3;
    }

    private static String zzj(zzbq zzbq2, Object object) {
        boolean bl2;
        int n3;
        int n4;
        Object object2;
        if (object == null) {
            return null;
        }
        boolean n42 = ((String)(object = object.toString())).startsWith((String)(object2 = "&"));
        if (n42) {
            int n7 = 1;
            object = ((String)object).substring(n7);
        }
        if ((n4 = ((String)object).length()) > (n3 = 256)) {
            object = ((String)object).substring(0, n3);
            object2 = n4;
            String string2 = "Hit param name is too long and will be trimmed";
            zzbq2.zzS(string2, object2, object);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)object)) {
            return null;
        }
        return object;
    }

    private static String zzk(zzbq zzbq2, Object object) {
        int n3;
        int n4 = ((String)(object = object == null ? "" : object.toString())).length();
        if (n4 > (n3 = 8192)) {
            object = ((String)object).substring(0, n3);
            Integer n7 = n4;
            String string2 = "Hit param value is too long and will be trimmed";
            zzbq2.zzS(string2, n7, object);
        }
        return object;
    }

    private static boolean zzl(Object object) {
        if (object == null) {
            return false;
        }
        return object.toString().startsWith("&");
    }

    public final String toString() {
        int n3;
        Set set = "ht=";
        StringBuilder stringBuilder = new StringBuilder((String)((Object)set));
        long l2 = this.zzd;
        stringBuilder.append(l2);
        l2 = this.zzc;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            set = ", dbId=";
            stringBuilder.append((String)((Object)set));
            l2 = this.zzc;
            stringBuilder.append(l2);
        }
        if ((n3 = this.zze) != 0) {
            set = ", appUID=";
            stringBuilder.append((String)((Object)set));
            n3 = this.zze;
            stringBuilder.append(n3);
        }
        set = this.zza;
        set = set.keySet();
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = (String)arrayList.get(i3);
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            stringBuilder.append("=");
            Map map2 = this.zza;
            string2 = (String)map2.get(string2);
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzff.zza(this.zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzi("_m", "");
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }
}

