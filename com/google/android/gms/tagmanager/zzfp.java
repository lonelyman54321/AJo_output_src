/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzacf;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzfp {
    private static final Long zza;
    private static final Double zzb;
    private static final zzfo zzc;
    private static final String zzd;
    private static final Boolean zze;
    private static final zzap zzf;

    static {
        Boolean bl2;
        long l2 = 0L;
        Object object = new Long(l2);
        zza = object;
        object = new Double(0.0);
        zzb = object;
        zzc = zzfo.zzd(l2);
        zzd = object = new String("");
        zze = bl2 = new Boolean(false);
        new ArrayList(0);
        new HashMap();
        zzf = zzfp.zzb(object);
    }

    public static zzap zza() {
        return zzf;
    }

    public static zzap zzb(Object object) {
        block18: {
            int n3;
            zzak zzak2;
            block13: {
                int n4;
                block17: {
                    block16: {
                        int n7;
                        block15: {
                            boolean bl2;
                            block14: {
                                boolean bl3;
                                block12: {
                                    zzak2 = zzap.zzg();
                                    n4 = 1;
                                    zzak2.zzt(n4);
                                    n7 = object instanceof zzap;
                                    if (n7 != 0) {
                                        return (zzap)object;
                                    }
                                    n7 = object instanceof String;
                                    n3 = 0;
                                    if (n7 == 0) break block12;
                                    zzak2.zzt(n4);
                                    object = (String)object;
                                    zzak2.zzs((String)object);
                                    break block13;
                                }
                                n7 = object instanceof List;
                                if (n7 == 0) break block14;
                                n7 = 2;
                                zzak2.zzt(n7);
                                object = (List)object;
                                int n8 = object.size();
                                ArrayList<zzap> arrayList = new ArrayList<zzap>(n8);
                                object = object.iterator();
                                n8 = 0;
                                Object var7_9 = null;
                                while (bl3 = object.hasNext()) {
                                    zzap zzap2;
                                    zzap zzap3 = zzfp.zzb(object.next());
                                    if (zzap3 == (zzap2 = zzf)) {
                                        return zzap2;
                                    }
                                    if (n8 != 0 || (n8 = (int)(zzap3.zzN() ? 1 : 0)) != 0) {
                                        n8 = 1;
                                    } else {
                                        n8 = 0;
                                        var7_9 = null;
                                    }
                                    arrayList.add(zzap3);
                                }
                                zzak2.zzj();
                                zzak2.zzb(arrayList);
                                n3 = n8;
                                break block13;
                            }
                            n7 = object instanceof Map;
                            if (n7 == 0) break block15;
                            n7 = 3;
                            zzak2.zzt(n7);
                            object = ((Map)object).entrySet();
                            int n10 = object.size();
                            ArrayList<zzap> arrayList = new ArrayList<zzap>(n10);
                            int n14 = object.size();
                            ArrayList<Object> arrayList2 = new ArrayList<Object>(n14);
                            object = object.iterator();
                            n14 = 0;
                            Object var9_14 = null;
                            while (bl2 = object.hasNext()) {
                                Object object2 = (Map.Entry)object.next();
                                zzap zzap4 = zzfp.zzb(object2.getKey());
                                object2 = zzfp.zzb(object2.getValue());
                                zzap zzap5 = zzf;
                                if (zzap4 != zzap5 && object2 != zzap5) {
                                    if (n14 != 0 || (n14 = (int)(zzap4.zzN() ? 1 : 0)) != 0 || (n14 = (int)(((zzap)object2).zzN() ? 1 : 0)) != 0) {
                                        n14 = 1;
                                    } else {
                                        n14 = 0;
                                        var9_14 = null;
                                    }
                                    arrayList.add(zzap4);
                                    arrayList2.add(object2);
                                    continue;
                                }
                                return zzap5;
                            }
                            zzak2.zzk();
                            zzak2.zzc(arrayList);
                            zzak2.zzl();
                            zzak2.zzd(arrayList2);
                            n3 = n14;
                            break block13;
                        }
                        n7 = (int)(zzfp.zzq(object) ? 1 : 0);
                        if (n7 == 0) break block16;
                        zzak2.zzt(n4);
                        object = object.toString();
                        zzak2.zzs((String)object);
                        break block13;
                    }
                    n4 = (int)(zzfp.zzr(object) ? 1 : 0);
                    if (n4 == 0) break block17;
                    n4 = 6;
                    zzak2.zzt(n4);
                    long l2 = zzfp.zzo(object);
                    zzak2.zzq(l2);
                    break block13;
                }
                n4 = object instanceof Boolean;
                if (n4 == 0) break block18;
                n4 = 8;
                zzak2.zzt(n4);
                object = (Boolean)object;
                boolean bl4 = (Boolean)object;
                zzak2.zzn(bl4);
            }
            zzak2.zzo(n3 != 0);
            return (zzap)zzak2.zzB();
        }
        object = object == null ? "null" : object.getClass().toString();
        object = String.valueOf(object);
        "Converting to Value from unknown object type: ".concat((String)object);
        return zzf;
    }

    public static zzfo zzc() {
        return zzc;
    }

    public static zzfo zzd(Object object) {
        boolean bl2 = object instanceof zzfo;
        if (bl2) {
            return (zzfo)object;
        }
        bl2 = zzfp.zzr(object);
        if (bl2) {
            return zzfo.zzd(zzfp.zzo(object));
        }
        bl2 = zzfp.zzq(object);
        if (bl2) {
            return zzfo.zzc(zzfp.zzn(object));
        }
        return zzfp.zzp(zzfp.zzm(object));
    }

    public static Boolean zze() {
        return zze;
    }

    public static Boolean zzf(Object object) {
        boolean bl2;
        String string2;
        boolean bl3 = object instanceof Boolean;
        object = bl3 ? (Boolean)object : ((bl3 = (string2 = "true").equalsIgnoreCase((String)(object = zzfp.zzm(object)))) ? Boolean.TRUE : ((bl2 = (string2 = "false").equalsIgnoreCase((String)object)) ? Boolean.FALSE : zze));
        return object;
    }

    public static Double zzg() {
        return zzb;
    }

    public static Double zzh(Object object) {
        zzfo zzfo2;
        boolean bl2 = zzfp.zzq(object);
        if (bl2) {
            double d2 = zzfp.zzn(object);
            object = d2;
        } else if ((object = zzfp.zzp(zzfp.zzm(object))) == (zzfo2 = zzc)) {
            object = zzb;
        } else {
            double d5 = ((zzfo)object).doubleValue();
            object = d5;
        }
        return object;
    }

    public static Long zzi() {
        return zza;
    }

    public static Long zzj(Object object) {
        zzfo zzfo2;
        boolean bl2 = zzfp.zzr(object);
        if (bl2) {
            long l2 = zzfp.zzo(object);
            object = l2;
        } else if ((object = zzfp.zzp(zzfp.zzm(object))) == (zzfo2 = zzc)) {
            object = zza;
        } else {
            long l3 = ((zzfo)object).zzb();
            object = l3;
        }
        return object;
    }

    public static Object zzk(zzap iterator) {
        if (iterator == null) {
            return null;
        }
        int n3 = ((zzap)((Object)iterator)).zzO();
        switch (n3) {
            default: {
                return ((zzap)((Object)iterator)).zzM();
            }
            case 7: {
                boolean bl2;
                StringBuilder stringBuilder = new StringBuilder();
                iterator = ((zzap)((Object)iterator)).zzs().iterator();
                while (bl2 = iterator.hasNext()) {
                    String string2;
                    String string3 = zzfp.zzm(zzfp.zzk((zzap)iterator.next()));
                    if (string3 == (string2 = zzd)) {
                        return null;
                    }
                    stringBuilder.append(string3);
                }
                return stringBuilder.toString();
            }
            case 6: {
                return ((zzap)((Object)iterator)).zzf();
            }
            case 4: 
            case 5: {
                return null;
            }
            case 3: {
                int n4;
                n3 = ((zzap)((Object)iterator)).zzc();
                int n7 = ((zzap)((Object)iterator)).zzd();
                if (n3 != n7) {
                    iterator = ((zzacf)((Object)iterator)).toString();
                    "Converting an invalid value to object: ".concat((String)((Object)iterator));
                    return null;
                }
                n7 = ((zzap)((Object)iterator)).zzd();
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>(n7);
                Object var4_9 = null;
                for (n7 = 0; n7 < (n4 = ((zzap)((Object)iterator)).zzc()); ++n7) {
                    Object object = zzfp.zzk(((zzap)((Object)iterator)).zzk(n7));
                    Object object2 = zzfp.zzk(((zzap)((Object)iterator)).zzl(n7));
                    if (object != null && object2 != null) {
                        hashMap.put(object, object2);
                        continue;
                    }
                    return null;
                }
                return hashMap;
            }
            case 2: {
                int n8 = ((zzap)((Object)iterator)).zza();
                ArrayList<Object> arrayList = new ArrayList<Object>(n8);
                iterator = ((zzap)((Object)iterator)).zzr().iterator();
                while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Object object = zzfp.zzk((zzap)iterator.next());
                    if (object == null) {
                        return null;
                    }
                    arrayList.add(object);
                }
                return arrayList;
            }
            case 1: 
        }
        return ((zzap)((Object)iterator)).zzp();
    }

    public static String zzl() {
        return zzd;
    }

    public static String zzm(Object object) {
        object = object == null ? zzd : object.toString();
        return object;
    }

    private static double zzn(Object object) {
        boolean bl2 = object instanceof Number;
        if (bl2) {
            return ((Number)object).doubleValue();
        }
        return 0.0;
    }

    private static long zzo(Object object) {
        boolean bl2 = object instanceof Number;
        if (bl2) {
            return ((Number)object).longValue();
        }
        return 0L;
    }

    private static zzfo zzp(String string2) {
        try {
            return zzfo.zze(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return zzc;
        }
    }

    private static boolean zzq(Object object) {
        boolean bl2 = object instanceof Double;
        boolean bl3 = true;
        if (!bl2 && !(bl2 = object instanceof Float)) {
            bl2 = object instanceof zzfo;
            if (bl2) {
                boolean bl4 = ((zzfo)(object = (zzfo)object)).zzf();
                if (!bl4) {
                    return false;
                }
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }

    private static boolean zzr(Object object) {
        boolean bl2 = object instanceof Byte;
        boolean bl3 = true;
        if (!(bl2 || (bl2 = object instanceof Short) || (bl2 = object instanceof Integer) || (bl2 = object instanceof Long))) {
            bl2 = object instanceof zzfo;
            if (bl2) {
                boolean bl4 = ((zzfo)(object = (zzfo)object)).zzg();
                if (!bl4) {
                    return false;
                }
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }
}

