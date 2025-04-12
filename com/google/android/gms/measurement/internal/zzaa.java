/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfw$zzd$zza;
import com.google.android.gms.internal.measurement.zzfw$zzf;
import com.google.android.gms.internal.measurement.zzfw$zzf$zza;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzw;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class zzaa {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    public zzaa(String string2, int n3) {
        this.zza = string2;
        this.zzb = n3;
    }

    public static Boolean zza(double d2, zzfw$zzd zzfw$zzd) {
        BigDecimal bigDecimal;
        try {
            bigDecimal = new BigDecimal(d2);
            d2 = Math.ulp(d2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return zzaa.zza(bigDecimal, zzfw$zzd, d2);
    }

    public static Boolean zza(long l2, zzfw$zzd zzfw$zzd) {
        double d2;
        BigDecimal bigDecimal;
        try {
            bigDecimal = new BigDecimal(l2);
            l2 = 0L;
            d2 = 0.0;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return zzaa.zza(bigDecimal, zzfw$zzd, d2);
    }

    public static Boolean zza(Boolean bl2, boolean bl3) {
        if (bl2 == null) {
            return null;
        }
        boolean bl4 = bl2;
        if (bl4 != bl3) {
            bl4 = true;
        } else {
            bl4 = false;
            bl2 = null;
        }
        return bl4;
    }

    public static Boolean zza(String string2, zzfw$zzd zzfw$zzd) {
        double d2;
        BigDecimal bigDecimal;
        boolean bl2 = zzpj.zzb(string2);
        if (!bl2) {
            return null;
        }
        try {
            bigDecimal = new BigDecimal(string2);
            d2 = 0.0;
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return zzaa.zza(bigDecimal, zzfw$zzd, d2);
    }

    private static Boolean zza(String object, zzfw$zzf$zza object2, boolean bl2, String string2, List list, String string3, zzgo zzgo2) {
        boolean bl3;
        if (object == null) {
            return null;
        }
        Object object3 = zzfw$zzf$zza.zzg;
        if (object2 == object3 ? list == null || (bl3 = list.isEmpty()) : string2 == null) {
            return null;
        }
        if (!bl2 && object2 != (object3 = zzfw$zzf$zza.zzb)) {
            object3 = Locale.ENGLISH;
            object = ((String)object).toUpperCase((Locale)object3);
        }
        object3 = zzw.zza;
        Object object4 = ((Enum)object2).ordinal();
        object4 = object3[object4];
        switch (object4) {
            default: {
                return null;
            }
            case 6: {
                if (list == null) {
                    return null;
                }
                return list.contains(object);
            }
            case 5: {
                return ((String)object).equals(string2);
            }
            case 4: {
                return ((String)object).contains(string2);
            }
            case 3: {
                return ((String)object).endsWith(string2);
            }
            case 2: {
                return ((String)object).startsWith(string2);
            }
            case 1: 
        }
        if (string3 == null) {
            return null;
        }
        if (bl2) {
            object4 = 0;
            object2 = null;
        } else {
            object4 = 66;
        }
        try {
            object2 = Pattern.compile(string3, object4);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            if (zzgo2 != null) {
                object = zzgo2.zzr();
                object2 = "Invalid regular expression in REGEXP audience filter. expression";
                ((zzgq)object).zza((String)object2, string3);
            }
            return null;
        }
        object = ((Pattern)object2).matcher((CharSequence)object);
        boolean bl4 = ((Matcher)object).matches();
        return bl4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Boolean zza(String string2, zzfw$zzf object, zzgo zzgo2) {
        Object object2;
        Iterator iterator;
        Object object3;
        Preconditions.checkNotNull(object);
        if (string2 == null) {
            return null;
        }
        int n3 = ((zzfw$zzf)object).zzj();
        if (n3 == 0) return null;
        Object object4 = ((zzfw$zzf)object).zzb();
        if (object4 == (object3 = zzfw$zzf$zza.zza)) {
            return null;
        }
        object4 = ((zzfw$zzf)object).zzb();
        if (object4 == (object3 = zzfw$zzf$zza.zzg) ? (n3 = ((zzfw$zzf)object).zza()) == 0 : (n3 = (int)(((zzfw$zzf)object).zzi() ? 1 : 0)) == 0) {
            return null;
        }
        zzfw$zzf$zza zzfw$zzf$zza = ((zzfw$zzf)object).zzb();
        boolean bl2 = ((zzfw$zzf)object).zzg();
        if (!bl2 && zzfw$zzf$zza != (object4 = zzfw$zzf$zza.zzb) && zzfw$zzf$zza != object3) {
            object4 = ((zzfw$zzf)object).zze();
            object3 = Locale.ENGLISH;
            object4 = ((String)object4).toUpperCase((Locale)object3);
        } else {
            object4 = ((zzfw$zzf)object).zze();
        }
        ArrayList<Object> arrayList = object4;
        n3 = ((zzfw$zzf)object).zza();
        if (n3 == 0) {
            iterator = null;
        } else {
            object = ((zzfw$zzf)object).zzf();
            if (!bl2) {
                int n4 = object.size();
                object4 = new Object(n4);
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = (String)object.next();
                    object2 = Locale.ENGLISH;
                    object3 = ((String)object3).toUpperCase((Locale)object2);
                    ((ArrayList)object4).add(object3);
                }
                object = Collections.unmodifiableList(object4);
            }
            iterator = object;
        }
        object = zzfw$zzf$zza.zzb;
        ArrayList<Object> arrayList2 = zzfw$zzf$zza == object ? arrayList : null;
        object2 = string2;
        return zzaa.zza(string2, zzfw$zzf$zza, bl2, arrayList, iterator, arrayList2, zzgo2);
    }

    private static Boolean zza(BigDecimal bigDecimal, zzfw$zzd object, double d2) {
        block36: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block38: {
                block37: {
                    block35: {
                        Preconditions.checkNotNull(object);
                        object7 = ((zzfw$zzd)object).zzh();
                        if (object7 == 0 || (object6 = ((zzfw$zzd)object).zza()) == (object5 = zzfw$zzd$zza.zza)) break block36;
                        object6 = ((zzfw$zzd)object).zza();
                        if (object6 == (object5 = zzfw$zzd$zza.zze) ? (object7 = ((zzfw$zzd)object).zzl()) == 0 || (object7 = ((zzfw$zzd)object).zzk()) == 0 : (object7 = ((zzfw$zzd)object).zzi()) == 0) {
                            return null;
                        }
                        object6 = ((zzfw$zzd)object).zza();
                        object4 = ((zzfw$zzd)object).zza();
                        if (object4 == object5) {
                            object4 = ((zzfw$zzd)object).zzf();
                            boolean bl2 = zzpj.zzb((String)object4);
                            if (bl2 && (bl2 = zzpj.zzb((String)(object4 = ((zzfw$zzd)object).zze())))) {
                                try {
                                    object3 = ((zzfw$zzd)object).zzf();
                                }
                                catch (NumberFormatException numberFormatException) {}
                                object4 = new BigDecimal((String)object3);
                                object = ((zzfw$zzd)object).zze();
                                object3 = new BigDecimal((String)object);
                                object = object4;
                                bl2 = false;
                                object4 = null;
                                break block35;
                            }
                            return null;
                        }
                        object4 = ((zzfw$zzd)object).zzd();
                        boolean bl3 = zzpj.zzb((String)object4);
                        if (!bl3) {
                            return null;
                        }
                        try {
                            object = ((zzfw$zzd)object).zzd();
                        }
                        catch (NumberFormatException numberFormatException) {}
                        object4 = new BigDecimal((String)object);
                        object2 = 0;
                        object = null;
                        object3 = null;
                    }
                    if (object6 != object5) break block37;
                    if (object == null) {
                        return null;
                    }
                    break block38;
                }
                if (object4 == null) break block36;
            }
            object5 = zzw.zzb;
            object7 = ((Enum)object6).ordinal();
            object7 = object5[object7];
            boolean bl4 = false;
            object5 = null;
            Object object8 = 1;
            if (object7 != object8) {
                Object object9 = 2;
                if (object7 != object9) {
                    Object object10 = 3;
                    if (object7 != object10) {
                        Object object11 = 4;
                        if (object7 == object11) {
                            int n3;
                            if (object == null) {
                                return null;
                            }
                            object2 = bigDecimal.compareTo((BigDecimal)object);
                            if (object2 >= 0 && (n3 = bigDecimal.compareTo((BigDecimal)object3)) <= 0) {
                                bl4 = true;
                            }
                            return bl4;
                        }
                    } else if (object4 != null) {
                        double d5 = 0.0;
                        double d7 = d2 - d5;
                        object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                        if (object2 != 0) {
                            object = new BigDecimal(d2);
                            object6 = new BigDecimal((int)object9);
                            object = ((BigDecimal)object).multiply((BigDecimal)object6);
                            object2 = bigDecimal.compareTo((BigDecimal)(object = ((BigDecimal)object4).subtract((BigDecimal)object)));
                            if (object2 > 0) {
                                object = new BigDecimal(d2);
                                BigDecimal bigDecimal2 = new BigDecimal((int)object9);
                                object = ((BigDecimal)object).multiply(bigDecimal2);
                                int n4 = bigDecimal.compareTo((BigDecimal)(object = ((BigDecimal)object4).add((BigDecimal)object)));
                                if (n4 < 0) {
                                    bl4 = true;
                                }
                            }
                            return bl4;
                        }
                        int n7 = bigDecimal.compareTo((BigDecimal)object4);
                        if (n7 == 0) {
                            bl4 = true;
                        }
                        return bl4;
                    }
                } else if (object4 != null) {
                    int n8 = bigDecimal.compareTo((BigDecimal)object4);
                    if (n8 > 0) {
                        bl4 = true;
                    }
                    return bl4;
                }
            } else if (object4 != null) {
                int n10 = bigDecimal.compareTo((BigDecimal)object4);
                if (n10 < 0) {
                    bl4 = true;
                }
                return bl4;
            }
        }
        return null;
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}

