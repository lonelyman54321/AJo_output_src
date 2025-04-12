/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzacd;
import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzach;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzact;
import com.google.android.gms.internal.gtm.zzacv;
import com.google.android.gms.internal.gtm.zzacw;
import com.google.android.gms.internal.gtm.zzadk;
import com.google.android.gms.internal.gtm.zzadl;
import com.google.android.gms.internal.gtm.zzadm;
import com.google.android.gms.internal.gtm.zzadq;
import com.google.android.gms.internal.gtm.zzaea;
import com.google.android.gms.internal.gtm.zzaeb;
import com.google.android.gms.internal.gtm.zzaef;
import com.google.android.gms.internal.gtm.zzaex;
import com.google.android.gms.internal.gtm.zzaey;
import com.google.android.gms.internal.gtm.zzyi;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzi;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzabv {
    private static final zzabv zzb;
    final zzaef zza;
    private boolean zzc;
    private boolean zzd;

    static {
        zzabv zzabv2;
        zzb = zzabv2 = new zzabv(true);
    }

    private zzabv() {
        zzaea zzaea2 = new zzaea();
        this.zza = zzaea2;
    }

    private zzabv(boolean bl2) {
        zzaea zzaea2 = new zzaea();
        this.zza = zzaea2;
        this.zzi();
        this.zzi();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int zza(zzaex var0, int var1_1, Object var2_2) {
        var1_1 = zzzi.zzC(var1_1 << 3);
        var3_3 /* !! */  = zzaex.zzj;
        if (var0 == var3_3 /* !! */ ) {
            var3_3 /* !! */  = var2_2;
            var3_3 /* !! */  = (zzadl)var2_2;
            var4_4 = var3_3 /* !! */  instanceof zzyi;
            if (var4_4 == 0) {
                var1_1 += var1_1;
            } else {
                throw null;
            }
        }
        var3_3 /* !! */  = zzaey.zza;
        var5_5 = var0.ordinal();
        var4_4 = 4;
        block0 : switch (var5_5) {
            default: {
                var0 = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw var0;
            }
            case 17: {
                var2_2 = (Long)var2_2;
                var6_6 = var2_2.longValue();
                var8_12 = var6_6 + var6_6;
                var5_5 = 63;
                var6_6 = var6_6 >> var5_5 ^ var8_12;
                var4_4 = zzzi.zzD(var6_6);
                break;
            }
            case 16: {
                var2_2 = (Integer)var2_2;
                var5_5 = var2_2.intValue();
                var10_13 = var5_5 + var5_5;
                var5_5 = var5_5 >> 31 ^ var10_13;
                var4_4 = zzzi.zzC(var5_5);
                break;
            }
            case 15: {
                var2_2 = (Long)var2_2;
                var2_2.getClass();
lbl38:
                // 3 sources

                while (true) {
                    var4_4 = 8;
                    break block0;
                    break;
                }
            }
            case 14: {
                var2_2 = (Integer)var2_2;
                var2_2.getClass();
                break;
            }
            case 13: {
                var5_5 = var2_2 instanceof zzach;
                if (var5_5 != 0) {
                    var2_2 = (zzach)var2_2;
                    var5_5 = var2_2.zza();
                    var6_7 = var5_5;
                    var4_4 = zzzi.zzD(var6_7);
                    break;
                }
                var2_2 = (Integer)var2_2;
                var5_5 = var2_2.intValue();
                var6_8 = var5_5;
                var4_4 = zzzi.zzD(var6_8);
                break;
            }
            case 12: {
                var2_2 = (Integer)var2_2;
                var5_5 = var2_2.intValue();
                var4_4 = zzzi.zzC(var5_5);
                break;
            }
            case 11: {
                var5_5 = var2_2 instanceof zzyx;
                if (var5_5 != 0) {
                    var2_2 = (zzyx)var2_2;
                    var5_5 = var2_2.zzd();
                    var10_14 = zzzi.zzC(var5_5);
lbl70:
                    // 4 sources

                    while (true) {
                        var4_4 = var10_14 + var5_5;
                        break block0;
                        break;
                    }
                }
                var2_2 = (byte[])var2_2;
                var5_5 = ((Object)var2_2).length;
                var10_14 = zzzi.zzC(var5_5);
                ** GOTO lbl70
            }
            case 10: {
                var5_5 = var2_2 instanceof zzacv;
                if (var5_5 == 0) ** GOTO lbl84
                var2_2 = (zzacv)var2_2;
                var5_5 = var2_2.zza();
                var10_14 = zzzi.zzC(var5_5);
                ** GOTO lbl70
lbl84:
                // 1 sources

                var2_2 = (zzadl)var2_2;
                var4_4 = zzzi.zzz((zzadl)var2_2);
                break;
            }
            case 9: {
                var2_2 = (zzadl)var2_2;
                var4_4 = var2_2.zzY();
                break;
            }
            case 8: {
                var5_5 = var2_2 instanceof zzyx;
                if (var5_5 != 0) {
                    var2_2 = (zzyx)var2_2;
                    var5_5 = var2_2.zzd();
                    var10_14 = zzzi.zzC(var5_5);
                    ** continue;
                }
                var2_2 = (String)var2_2;
                var4_4 = zzzi.zzB((String)var2_2);
                break;
            }
            case 7: {
                var2_2 = (Boolean)var2_2;
                var2_2.getClass();
                var4_4 = 1;
                break;
            }
            case 6: {
                var2_2 = (Integer)var2_2;
                var2_2.getClass();
                break;
            }
            case 5: {
                var2_2 = (Long)var2_2;
                var2_2.getClass();
                ** GOTO lbl38
            }
            case 4: {
                var2_2 = (Integer)var2_2;
                var5_5 = var2_2.intValue();
                var6_9 = var5_5;
                var4_4 = zzzi.zzD(var6_9);
                break;
            }
            case 3: {
                var2_2 = (Long)var2_2;
                var6_10 = var2_2.longValue();
                var4_4 = zzzi.zzD(var6_10);
                break;
            }
            case 2: {
                var2_2 = (Long)var2_2;
                var6_11 = var2_2.longValue();
                var4_4 = zzzi.zzD(var6_11);
                break;
            }
            case 1: {
                var2_2 = (Float)var2_2;
                var2_2.getClass();
                break;
            }
            case 0: {
                var2_2 = (Double)var2_2;
                var2_2.getClass();
                ** continue;
            }
        }
        return var1_1 + var4_4;
    }

    public static int zzb(zzabu zzabu2, Object object) {
        zzaex zzaex2 = zzabu2.zzd();
        int n3 = zzabu2.zza();
        int n4 = zzabu2.zzg();
        if (n4 != 0) {
            object = (List)object;
            n4 = object.size();
            zzabu2.zzf();
            zzabu2 = null;
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Object e2 = object.get(i3);
                int n8 = zzabv.zza(zzaex2, n3, e2);
                n7 += n8;
            }
            return n7;
        }
        return zzabv.zza(zzaex2, n3, object);
    }

    public static zzabv zze() {
        return zzb;
    }

    private static Object zzn(Object object) {
        int n3 = object instanceof zzadq;
        if (n3 != 0) {
            return ((zzadq)object).zzc();
        }
        n3 = object instanceof byte[];
        if (n3 != 0) {
            object = (byte[])object;
            n3 = ((Object)object).length;
            byte[] byArray = new byte[n3];
            System.arraycopy(object, 0, byArray, 0, n3);
            return byArray;
        }
        return object;
    }

    private final void zzo(Map.Entry object) {
        zzaey zzaey2;
        zzabu zzabu2 = (zzabu)object.getKey();
        object = object.getValue();
        boolean bl2 = object instanceof zzacv;
        int n3 = zzabu2.zzg();
        if (n3 != 0) {
            if (!bl2) {
                ArrayList arrayList = this.zzf(zzabu2);
                object = (List)object;
                n3 = object.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(n3);
                }
                List<Object> list = arrayList;
                list = arrayList;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object2 = zzabv.zzn(object.get(i3));
                    list.add(object2);
                }
                this.zza.zzf(zzabu2, arrayList);
                return;
            }
            object = new IllegalStateException("Lazy fields can not be repeated");
            throw object;
        }
        Object object3 = zzabu2.zze();
        if (object3 == (zzaey2 = zzaey.zzi)) {
            object3 = this.zzf(zzabu2);
            if (object3 == null) {
                object3 = this.zza;
                object = zzabv.zzn(object);
                ((zzaef)object3).zzf(zzabu2, object);
                if (bl2) {
                    boolean bl3;
                    this.zzd = bl3 = true;
                }
                return;
            }
            if (!bl2) {
                bl2 = object3 instanceof zzadq;
                if (bl2) {
                    object3 = (zzadq)object3;
                    object = (zzadq)object;
                    object = zzabu2.zzc((zzadq)object3, (zzadq)object);
                } else {
                    object3 = (zzadl)object3;
                    zzadk zzadk2 = object3.zzaw();
                    object = (zzadl)object;
                    object = zzabu2.zzb(zzadk2, (zzadl)object).zzD();
                }
                this.zza.zzf(zzabu2, object);
                return;
            }
            throw null;
        }
        if (!bl2) {
            zzaef zzaef2 = this.zza;
            object = zzabv.zzn(object);
            zzaef2.zzf(zzabu2, object);
            return;
        }
        object = new IllegalStateException("Lazy fields must be message-valued");
        throw object;
    }

    private static boolean zzp(Map.Entry object) {
        zzaey zzaey2;
        zzabu zzabu2 = (zzabu)object.getKey();
        zzaey zzaey3 = zzabu2.zze();
        if (zzaey3 == (zzaey2 = zzaey.zzi)) {
            int n3 = zzabu2.zzg();
            if (n3 != 0) {
                object = (List)object.getValue();
                n3 = object.size();
                zzaey3 = null;
                zzaey2 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object e2 = object.get(i3);
                    boolean bl2 = zzabv.zzq(e2);
                    if (bl2) continue;
                    return false;
                }
            } else {
                return zzabv.zzq(object.getValue());
            }
        }
        return true;
    }

    private static boolean zzq(Object object) {
        boolean bl2 = object instanceof zzadm;
        if (bl2) {
            return ((zzadm)object).zzaz();
        }
        boolean bl3 = object instanceof zzacv;
        if (bl3) {
            return true;
        }
        object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final int zzr(Map.Entry object) {
        int n3;
        int n4;
        int n7;
        zzaey zzaey2;
        zzabu zzabu2 = (zzabu)object.getKey();
        Object object2 = object.getValue();
        zzaey zzaey3 = zzabu2.zze();
        if (zzaey3 != (zzaey2 = zzaey.zzi) || (n7 = zzabu2.zzg()) != 0) return zzabv.zzb(zzabu2, object2);
        zzabu2.zzf();
        int n8 = object2 instanceof zzacv;
        n7 = 24;
        int n10 = 16;
        int n14 = 8;
        if (n8 != 0) {
            object = (zzabu)object.getKey();
            n4 = object.zza();
            object2 = (zzacv)object2;
            n8 = zzzi.zzC(n14);
            n8 += n8;
            n10 = zzzi.zzC(n10);
            n4 = zzzi.zzC(n4) + n10;
            n7 = zzzi.zzC(n7);
            n3 = ((zzacw)object2).zza();
            n3 = d90_0.a(n3, n3, n7);
            return n8 + n4 + n3;
        }
        object = (zzabu)object.getKey();
        n4 = object.zza();
        object2 = (zzadl)object2;
        n8 = zzzi.zzC(n14);
        n8 += n8;
        n10 = zzzi.zzC(n10);
        n4 = zzzi.zzC(n4) + n10;
        n7 = zzzi.zzC(n7);
        n3 = zzzi.zzz((zzadl)object2) + n7;
        return n8 + n4 + n3;
    }

    private static final void zzs(zzabu object, Object object2) {
        Object object3;
        Object object4;
        block13: {
            block14: {
                object4 = object.zzd();
                object3 = zzaco.zzb;
                object2.getClass();
                object3 = (Object)zzaex.zza;
                object3 = (Object)zzaey.zza;
                object4 = ((zzaex)((Object)object4)).zza();
                int n3 = ((Enum)object4).ordinal();
                switch (n3) {
                    default: {
                        break block13;
                    }
                    case 8: {
                        n3 = object2 instanceof zzadl;
                        if (n3 == 0 && (n3 = object2 instanceof zzacv) == 0) break block13;
                        break block14;
                    }
                    case 7: {
                        n3 = object2 instanceof Integer;
                        if (n3 == 0 && (n3 = object2 instanceof zzach) == 0) break block13;
                        break block14;
                    }
                    case 6: {
                        n3 = object2 instanceof zzyx;
                        if (n3 == 0 && (n3 = object2 instanceof byte[]) == 0) break block13;
                        break block14;
                    }
                    case 5: {
                        n3 = object2 instanceof String;
                        break;
                    }
                    case 4: {
                        n3 = object2 instanceof Boolean;
                        break;
                    }
                    case 3: {
                        n3 = object2 instanceof Double;
                        break;
                    }
                    case 2: {
                        n3 = object2 instanceof Float;
                        break;
                    }
                    case 1: {
                        n3 = object2 instanceof Long;
                        break;
                    }
                    case 0: {
                        n3 = object2 instanceof Integer;
                    }
                }
                if (n3 == 0) break block13;
            }
            return;
        }
        object3 = object.zza();
        object = object.zzd().zza();
        object2 = object2.getClass().getName();
        Object[] objectArray = new Object[]{object3, object, object2};
        object = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", objectArray);
        object4 = new IllegalArgumentException((String)object);
        throw object4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzabv;
        if (!bl2) {
            return false;
        }
        object = (zzabv)object;
        zzaef zzaef2 = this.zza;
        object = ((zzabv)object).zza;
        return zzaef2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int n3;
        Object object = this.zza;
        int n4 = ((zzaef)object).zzc();
        Map.Entry entry = null;
        int n7 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry2 = this.zza.zzg(n3);
            int n8 = zzabv.zzr(entry2);
            n7 += n8;
        }
        object = this.zza.zzd().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            n3 = zzabv.zzr(entry);
            n7 += n3;
        }
        return n7;
    }

    public final zzabv zzd() {
        Object object;
        int n3;
        zzabv zzabv2 = new zzabv();
        Object object2 = this.zza;
        int n4 = ((zzaef)object2).zzc();
        Map.Entry entry = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object3 = object = this.zza.zzg(n3);
            object3 = (zzabu)((zzaeb)object).zza();
            object = object.getValue();
            zzabv2.zzk((zzabu)object3, object);
        }
        object2 = this.zza.zzd().iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object2.next();
            object = (zzabu)entry.getKey();
            entry = entry.getValue();
            zzabv2.zzk((zzabu)object, entry);
        }
        n4 = (int)(this.zzd ? 1 : 0);
        zzabv2.zzd = n4;
        return zzabv2;
    }

    public final Object zzf(zzabu object) {
        zzaef zzaef2 = this.zza;
        boolean bl2 = (object = zzaef2.get(object)) instanceof zzacv;
        if (!bl2) {
            return object;
        }
        throw null;
    }

    public final Iterator zzg() {
        Object object = this.zza;
        boolean bl2 = ((AbstractMap)object).isEmpty();
        if (bl2) {
            return Collections.emptyIterator();
        }
        bl2 = this.zzd;
        if (bl2) {
            object = this.zza;
            object = ((zzaef)object).entrySet().iterator();
            zzact zzact2 = new zzact((Iterator)object);
            return zzact2;
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzh(zzabu object, Object object2) {
        ArrayList<Object> arrayList = object;
        arrayList = (zzacd)object;
        boolean bl2 = ((zzacd)((Object)arrayList)).zzd;
        if (bl2) {
            zzabv.zzs((zzabu)object, object2);
            arrayList = this.zzf((zzabu)object);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
                zzaef zzaef2 = this.zza;
                zzaef2.zzf((Comparable)object, arrayList);
            } else {
                arrayList = arrayList;
            }
            arrayList.add(object2);
            return;
        }
        object = new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public final void zzi() {
        int n3;
        int n4 = this.zzc;
        if (n4 != 0) {
            return;
        }
        Object object = this.zza;
        n4 = ((zzaef)object).zzc();
        zzacf zzacf2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object2 = this.zza.zzg(n3).getValue();
            boolean bl2 = object2 instanceof zzacf;
            if (!bl2) continue;
            object2 = (zzacf)object2;
            ((zzacf)object2).zzam();
        }
        object = this.zza.zzd().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            zzacf2 = (zzacf)((Map.Entry)object.next()).getValue();
            boolean bl3 = zzacf2 instanceof zzacf;
            if (!bl3) continue;
            zzacf2 = zzacf2;
            zzacf2.zzam();
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzabv object) {
        Object object2 = ((zzabv)object).zza;
        int n3 = ((zzaef)object2).zzc();
        for (int i3 = 0; i3 < n3; ++i3) {
            Map.Entry entry = ((zzabv)object).zza.zzg(i3);
            this.zzo(entry);
        }
        object = ((zzabv)object).zza.zzd().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Map.Entry)object.next();
            this.zzo((Map.Entry)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzk(zzabu object, Object list) {
        int n3 = object.zzg();
        if (n3 != 0) {
            n3 = list instanceof List;
            if (n3 == 0) {
                object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                throw object;
            }
            n3 = list.size();
            ArrayList arrayList = new ArrayList(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Object e2 = list.get(i3);
                zzabv.zzs((zzabu)object, e2);
                arrayList.add(e2);
            }
            list = arrayList;
        } else {
            zzabv.zzs((zzabu)object, list);
        }
        n3 = list instanceof zzacv;
        if (n3 != 0) {
            n3 = 1;
            this.zzd = n3;
        }
        this.zza.zzf((Comparable)object, list);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        int n3;
        Object object = this.zza;
        int n4 = ((zzaef)object).zzc();
        Map.Entry entry = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry2 = this.zza.zzg(n3);
            boolean bl2 = zzabv.zzp(entry2);
            if (bl2) continue;
            return false;
        }
        object = this.zza.zzd().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            n3 = (int)(zzabv.zzp(entry) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }
}

