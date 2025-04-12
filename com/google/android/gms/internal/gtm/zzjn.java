/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;
import java.util.List;

public final class zzjn {
    public static double zza(zzqo zzqo2) {
        double d2 = zzjn.zzb(zzqo2);
        Object object = Double.isNaN(d2);
        double d5 = 0.0;
        if (object) {
            return d5;
        }
        object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object && object && !(object = Double.isInfinite(d2))) {
            d5 = Math.signum(d2);
            d2 = Math.floor(Math.abs(d2)) * d5;
        }
        return d2;
    }

    public static double zzb(zzqo object) {
        Object object2;
        boolean bl2;
        boolean bl3 = false;
        Object object3 = null;
        int n3 = 1;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        Preconditions.checkArgument(bl2);
        object2 = zzqs.zze;
        double d2 = 0.0 / 0.0;
        if (object == object2) {
            return d2;
        }
        object2 = zzqs.zzd;
        double d5 = 0.0;
        if (object == object2) {
            return d5;
        }
        bl2 = object instanceof zzqp;
        if (bl2) {
            boolean bl4 = (Boolean)(object = ((zzqp)object).zzi());
            if (bl4) {
                return 1.0;
            }
            return d5;
        }
        bl2 = object instanceof zzqq;
        if (bl2) {
            return ((zzqq)object).zzi();
        }
        bl2 = object instanceof zzqv;
        if (bl2) {
            object2 = object;
            object2 = (zzqv)object;
            List list = ((zzqv)object2).zzk();
            boolean bl5 = list.isEmpty();
            if (bl5) {
                return d5;
            }
            List list2 = ((zzqv)object2).zzk();
            int n4 = list2.size();
            if (n4 == n3) {
                object3 = zzjn.zzd(((zzqv)object2).zzi(0));
                object = new zzqz((String)object3);
                return zzjn.zzb((zzqo)object);
            }
        } else {
            bl3 = object instanceof zzqz;
            if (bl3) {
                object3 = ((zzqz)(object = (zzqz)object)).zzk();
                bl3 = ((String)object3).isEmpty();
                if (bl3) {
                    return d5;
                }
                try {
                    object = ((zzqz)object).zzk();
                }
                catch (NumberFormatException numberFormatException) {
                    return d2;
                }
                return Double.parseDouble((String)object);
            }
        }
        bl3 = zzjn.zzj((zzqo)object);
        if (!bl3) {
            return d2;
        }
        object = zzjn.zzk((zzqo)object, "Illegal type given to numberEquivalent: ");
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static double zzc(zzqo zzqo2, zzqo zzqo3) {
        boolean bl2 = false;
        Object object = zzqo2 != null;
        Preconditions.checkArgument(object);
        if (zzqo3 != null) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        double d2 = zzjn.zzb(zzqo2);
        double d5 = zzjn.zzb(zzqo3);
        object = Double.isNaN(d2);
        double d7 = 0.0 / 0.0;
        if (!object && !(object = Double.isNaN(d5))) {
            double d9 = -1.0 / 0.0;
            double d12 = 1.0 / 0.0;
            double d13 = d2 - d12;
            object = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            if (!object && !(object = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1)) || !(object = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1)) && !(object = d5 == d12 ? 0 : (d5 > d12 ? 1 : -1))) {
                return d7;
            }
            object = Double.isInfinite(d2);
            if (object && !(object = Double.isInfinite(d5))) {
                return d2;
            }
            object = Double.isInfinite(d2);
            if (!object && (object = Double.isInfinite(d5))) {
                return d5;
            }
            return d2 + d5;
        }
        return d7;
    }

    /*
     * WARNING - void declaration
     */
    public static String zzd(zzqo object) {
        void var4_13;
        Object object2;
        int n4 = 0;
        Object object3 = null;
        int n7 = 1;
        if (object != null) {
            boolean bl2 = true;
        } else {
            boolean bl3 = false;
            object2 = null;
        }
        Preconditions.checkArgument((boolean)var4_13);
        object2 = zzqs.zze;
        if (object == object2) {
            return "undefined";
        }
        object2 = zzqs.zzd;
        if (object == object2) {
            return "null";
        }
        boolean bl4 = object instanceof zzqp;
        if (bl4) {
            int n3 = (int)(((Boolean)(object = ((zzqp)object).zzi())).booleanValue() ? 1 : 0);
            if (n7 != n3) {
                return "false";
            }
            return "true";
        }
        boolean bl5 = object instanceof zzqq;
        String string2 = "";
        if (bl5) {
            double d2 = ((zzqq)object).zzi();
            object = Double.toString(d2);
            object2 = "E";
            int n8 = ((String)object).indexOf((String)object2);
            String string3 = "0";
            if (n8 > 0) {
                int n10 = n8 + 1;
                int n14 = ((String)object).length();
                String string4 = ((String)object).substring(n10, n14);
                n10 = Integer.parseInt(string4);
                String string5 = ".";
                if (n10 < 0) {
                    int n15 = -7;
                    if (n10 > n15) {
                        object = ((String)object).substring(0, n8).replace(string5, string2);
                        object2 = "0.";
                        object3 = new StringBuilder((String)object2);
                        while ((n10 += n7) < 0) {
                            ((StringBuilder)object3).append(string3);
                        }
                        ((StringBuilder)object3).append((String)object);
                        object = ((StringBuilder)object3).toString();
                    } else {
                        object3 = "e";
                        object = ((String)object).replace((CharSequence)object2, (CharSequence)object3);
                    }
                } else {
                    int n16 = 21;
                    if (n10 < n16) {
                        object = ((String)object).substring(0, n8).replace(string5, string2);
                        n10 += n7;
                        int n17 = ((String)object).length();
                        int n18 = ((String)object).startsWith("-");
                        int n19 = n17 - n18;
                        object2 = new StringBuilder();
                        if ((n10 -= n19) < 0) {
                            int n20 = ((String)object).length() + n10;
                            object3 = ((String)object).substring(0, n20);
                            ((StringBuilder)object2).append((String)object3);
                            ((StringBuilder)object2).append(string5);
                            n4 = ((String)object).length();
                            object = ((String)object).substring(n20, n4);
                            ((StringBuilder)object2).append((String)object);
                        } else {
                            ((StringBuilder)object2).append((String)object);
                            while (n10 > 0) {
                                ((StringBuilder)object2).append(string3);
                                n10 += -1;
                            }
                        }
                        object = ((StringBuilder)object2).toString();
                    } else {
                        object3 = "e+";
                        object = ((String)object).replace((CharSequence)object2, (CharSequence)object3);
                    }
                }
            } else {
                int n21;
                String string6 = ".0";
                boolean bl6 = ((String)object).endsWith(string6);
                if (bl6 && (n4 = ((String)(object = ((String)object).substring(0, n21 = ((String)object).length() + -2))).equals(object3 = "-0")) != 0) {
                    return string3;
                }
            }
            return object;
        }
        n4 = object instanceof zzqr;
        if (n4 != 0) {
            object3 = object;
            object3 = ((zzqr)object).zzi();
            boolean bl7 = object3 instanceof zzjl;
            if (bl7) {
                return ((zzjl)object3).zzb();
            }
        } else {
            n4 = object instanceof zzqv;
            if (n4 != 0) {
                boolean bl8;
                object3 = new ArrayList();
                object = ((zzqv)object).zzk().iterator();
                while (bl8 = object.hasNext()) {
                    Object object4 = (zzqo)object.next();
                    if (object4 != (object2 = zzqs.zzd) && object4 != (object2 = zzqs.zze)) {
                        object4 = zzjn.zzd((zzqo)object4);
                        ((ArrayList)object3).add(object4);
                        continue;
                    }
                    ((ArrayList)object3).add(string2);
                }
                return TextUtils.join((CharSequence)",", (Iterable)object3);
            }
            n4 = object instanceof zzqw;
            if (n4 != 0) {
                return "[object Object]";
            }
            n4 = object instanceof zzqz;
            if (n4 != 0) {
                return ((zzqz)object).zzk();
            }
        }
        n4 = zzjn.zzj((zzqo)object);
        if (n4 != 0) {
            object3 = "Illegal type given to stringEquivalent: ";
            object = zzjn.zzk((zzqo)object, (String)object3);
        } else {
            object = "Unknown type in stringEquivalent.";
        }
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public static boolean zze(zzqo object, zzqo object2) {
        String string2;
        block28: {
            block29: {
                zzqs zzqs2;
                String string3;
                String string4;
                String string5;
                String string6;
                String string7;
                int n3;
                zzqo zzqo2;
                block30: {
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    int n14;
                    block31: {
                        zzqo2 = null;
                        n3 = 1;
                        if (object != null) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            string7 = null;
                        }
                        Preconditions.checkArgument(n14 != 0);
                        if (object2 != null) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            string7 = null;
                        }
                        Preconditions.checkArgument(n14 != 0);
                        n14 = zzjn.zzj((zzqo)object);
                        string2 = "Illegal type given to abstractEqualityCompare: ";
                        if (n14) break block28;
                        n14 = zzjn.zzj((zzqo)object2);
                        if (n14) break block29;
                        string7 = zzjn.zzi((zzqo)object);
                        string2 = zzjn.zzi((zzqo)object2);
                        n10 = string7.equals(string2);
                        string6 = "Object";
                        string5 = "Boolean";
                        string4 = "Number";
                        string3 = "String";
                        if (n10 == 0) break block30;
                        int n15 = string7.hashCode();
                        n10 = 2;
                        n8 = 5;
                        n7 = 3;
                        n4 = 4;
                        switch (n15) {
                            default: {
                                break;
                            }
                            case 1729365000: {
                                n14 = (int)(string7.equals(string5) ? 1 : 0);
                                if (!n14) break;
                                n14 = 4;
                                break block31;
                            }
                            case 965837104: {
                                string2 = "Undefined";
                                n14 = (int)(string7.equals(string2) ? 1 : 0);
                                if (!n14) break;
                                n14 = 0;
                                string7 = null;
                                break block31;
                            }
                            case 2439591: {
                                string2 = "Null";
                                n14 = (int)(string7.equals(string2) ? 1 : 0);
                                if (!n14) break;
                                n14 = 1;
                                break block31;
                            }
                            case -1808118735: {
                                n14 = (int)(string7.equals(string3) ? 1 : 0);
                                if (!n14) break;
                                n14 = 3;
                                break block31;
                            }
                            case -1939501217: {
                                n14 = (int)(string7.equals(string6) ? 1 : 0);
                                if (!n14) break;
                                n14 = 5;
                                break block31;
                            }
                            case -1950496919: {
                                n14 = (int)(string7.equals(string4) ? 1 : 0);
                                if (!n14) break;
                                n14 = 2;
                                break block31;
                            }
                        }
                        n14 = -1;
                    }
                    if (n14 && n14 != n3) {
                        if (n14 != n10) {
                            if (n14 != n7) {
                                if (n14 != n4) {
                                    if (n14 != n8) {
                                        return false;
                                    }
                                    if (object == object2) {
                                        return n3;
                                    }
                                    return false;
                                }
                                object = ((zzqp)object).zzi();
                                object2 = ((zzqp)object2).zzi();
                                return ((Boolean)object).equals(object2);
                            }
                            object = ((zzqz)object).zzk();
                            object2 = ((zzqz)object2).zzk();
                            return ((String)object).equals(object2);
                        }
                        double d2 = ((zzqq)object).zzi();
                        object2 = (zzqq)object2;
                        object = ((zzqq)object2).zzi();
                        double d5 = (Double)object;
                        n10 = (int)(Double.isNaN(d2) ? 1 : 0);
                        if (n10 == 0 && (n10 = (int)(Double.isNaN(d5) ? 1 : 0)) == 0 && (n10 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1))) == 0) {
                            return n3;
                        }
                        return false;
                    }
                    return n3;
                }
                zzqs zzqs3 = zzqs.zze;
                if (object != zzqs3 && object != (zzqs2 = zzqs.zzd) || object2 != zzqs3 && object2 != (zzqs3 = zzqs.zzd)) {
                    n3 = string7.equals(string4);
                    if (n3 && (n3 = string2.equals(string3))) {
                        object2 = zzjn.zzb((zzqo)object2);
                        zzqo2 = new zzqq((Double)object2);
                        return zzjn.zze((zzqo)object, zzqo2);
                    }
                    n3 = string7.equals(string3);
                    if (n3 && (n3 = (int)(string2.equals(string4) ? 1 : 0))) {
                        object = zzjn.zzb((zzqo)object);
                        zzqo2 = new zzqq((Double)object);
                        return zzjn.zze(zzqo2, (zzqo)object2);
                    }
                    n3 = (int)(string7.equals(string5) ? 1 : 0);
                    if (n3) {
                        object = zzjn.zzb((zzqo)object);
                        zzqo2 = new zzqq((Double)object);
                        return zzjn.zze(zzqo2, (zzqo)object2);
                    }
                    n3 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n3) {
                        object2 = zzjn.zzb((zzqo)object2);
                        zzqo2 = new zzqq((Double)object2);
                        return zzjn.zze((zzqo)object, zzqo2);
                    }
                    n3 = string7.equals(string3);
                    if (!n3 && !(n3 = string7.equals(string4)) || !(n3 = string2.equals(string6))) {
                        n3 = string7.equals(string6);
                        if (n3 && ((n3 = string2.equals(string3)) || (n3 = string2.equals(string4)))) {
                            object = zzjn.zzd((zzqo)object);
                            zzqo2 = new zzqz((String)object);
                            return zzjn.zze(zzqo2, (zzqo)object2);
                        }
                        return false;
                    }
                    object2 = zzjn.zzd((zzqo)object2);
                    zzqo2 = new zzqz((String)object2);
                    return zzjn.zze((zzqo)object, zzqo2);
                }
                return n3;
            }
            object2 = zzjn.zzk((zzqo)object2, string2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = zzjn.zzk((zzqo)object, string2);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static boolean zzf(zzqo object, zzqo object2) {
        zzqz zzqz2;
        boolean bl2;
        boolean bl3 = true;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqz2 = null;
        }
        Preconditions.checkArgument(bl2);
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            zzqz2 = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = zzjn.zzj((zzqo)object);
        String string2 = "Illegal type given to abstractRelationalCompare: ";
        if (!bl2) {
            bl2 = zzjn.zzj((zzqo)object2);
            if (!bl2) {
                bl2 = object instanceof zzqw;
                if (bl2 || (bl2 = object instanceof zzqv) || (bl2 = object instanceof zzqr)) {
                    object = zzjn.zzd((zzqo)object);
                    zzqz2 = new zzqz((String)object);
                    object = zzqz2;
                }
                if ((bl2 = object2 instanceof zzqw) || (bl2 = object2 instanceof zzqv) || (bl2 = object2 instanceof zzqr)) {
                    object2 = zzjn.zzd((zzqo)object2);
                    zzqz2 = new zzqz((String)object2);
                    object2 = zzqz2;
                }
                if ((bl2 = object instanceof zzqz) && (bl2 = object2 instanceof zzqz)) {
                    int n3 = ((String)(object = ((zzqz)object).zzk())).compareTo((String)(object2 = ((zzqz)object2).zzk()));
                    if (n3 < 0) {
                        return bl3;
                    }
                    return false;
                }
                double d2 = zzjn.zzb((zzqo)object);
                double d5 = zzjn.zzb((zzqo)object2);
                boolean bl4 = Double.isNaN(d2);
                if (!bl4 && !(bl4 = Double.isNaN(d5))) {
                    double d7;
                    double d9 = 0.0;
                    double d12 = d2 - d9;
                    Object object3 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                    if (object3 == false && (d7 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1)) == false || object3 == false && (object3 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1)) == false) {
                        return false;
                    }
                    d9 = 1.0 / 0.0;
                    double d13 = d2 - d9;
                    object3 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                    if (object3 == false) {
                        return false;
                    }
                    object3 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1);
                    if (object3 == false) {
                        return bl3;
                    }
                    d9 = -1.0 / 0.0;
                    double d14 = d5 - d9;
                    object3 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    if (object3 == false) {
                        return false;
                    }
                    object3 = d2 == d9 ? 0 : (d2 > d9 ? 1 : -1);
                    if (object3 == false) {
                        return bl3;
                    }
                    int n4 = Double.compare(d2, d5);
                    if (n4 < 0) {
                        return bl3;
                    }
                }
                return false;
            }
            object2 = zzjn.zzk((zzqo)object2, string2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = zzjn.zzk((zzqo)object, string2);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static boolean zzg(zzqo object) {
        block9: {
            block13: {
                boolean bl2;
                block11: {
                    boolean bl3;
                    block12: {
                        boolean bl4;
                        block10: {
                            boolean bl5;
                            double d2;
                            double d5;
                            Object object2;
                            bl2 = true;
                            bl3 = false;
                            if (object != null) {
                                bl4 = true;
                            } else {
                                bl4 = false;
                                object2 = null;
                            }
                            Preconditions.checkArgument(bl4);
                            object2 = zzqs.zze;
                            if (object == object2 || object == (object2 = zzqs.zzd)) break block9;
                            bl4 = object instanceof zzqp;
                            if (bl4) {
                                return ((zzqp)object).zzi();
                            }
                            bl4 = object instanceof zzqq;
                            if (!bl4) break block10;
                            object2 = ((zzqq)(object = (zzqq)object)).zzi();
                            double d7 = (Double)object2;
                            double d9 = d7 - (d5 = 0.0);
                            Object object3 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                            if (object3 == false || (object3 = (d2 = (d7 = ((Double)(object2 = ((zzqq)object).zzi())).doubleValue()) - d5) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) == false || (bl5 = Double.isNaN(d7 = ((Double)(object = ((zzqq)object).zzi())).doubleValue()))) {
                                return false;
                            }
                            break block11;
                        }
                        bl4 = object instanceof zzqz;
                        if (!bl4) break block12;
                        boolean bl6 = ((String)(object = ((zzqz)object).zzk())).isEmpty();
                        if (bl6) {
                            return false;
                        }
                        break block11;
                    }
                    bl3 = zzjn.zzj((zzqo)object);
                    if (bl3) break block13;
                }
                return bl2;
            }
            object = zzjn.zzk((zzqo)object, "Illegal type given to isTruthy: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        return false;
    }

    public static boolean zzh(zzqo object, zzqo object2) {
        String string2;
        block19: {
            block20: {
                int n3;
                int n4;
                int n7;
                int n8;
                int n10;
                block21: {
                    String string3;
                    n10 = 1;
                    if (object != null) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        string3 = null;
                    }
                    Preconditions.checkArgument(n8 != 0);
                    if (object2 != null) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        string3 = null;
                    }
                    Preconditions.checkArgument(n8 != 0);
                    n8 = zzjn.zzj((zzqo)object);
                    string2 = "Illegal type given to strictEqualityCompare: ";
                    if (n8) break block19;
                    n8 = zzjn.zzj((zzqo)object2);
                    if (n8) break block20;
                    string3 = zzjn.zzi((zzqo)object);
                    int n14 = string3.equals(string2 = zzjn.zzi((zzqo)object2));
                    if (n14 == 0) {
                        return false;
                    }
                    n14 = string3.hashCode();
                    n7 = 2;
                    n4 = 3;
                    n3 = 4;
                    switch (n14) {
                        default: {
                            break;
                        }
                        case 1729365000: {
                            string2 = "Boolean";
                            n8 = (int)(string3.equals(string2) ? 1 : 0);
                            if (!n8) break;
                            n8 = 4;
                            break block21;
                        }
                        case 965837104: {
                            string2 = "Undefined";
                            n8 = (int)(string3.equals(string2) ? 1 : 0);
                            if (!n8) break;
                            n8 = 0;
                            string3 = null;
                            break block21;
                        }
                        case 2439591: {
                            string2 = "Null";
                            n8 = (int)(string3.equals(string2) ? 1 : 0);
                            if (!n8) break;
                            n8 = 1;
                            break block21;
                        }
                        case -1808118735: {
                            string2 = "String";
                            n8 = (int)(string3.equals(string2) ? 1 : 0);
                            if (!n8) break;
                            n8 = 3;
                            break block21;
                        }
                        case -1950496919: {
                            string2 = "Number";
                            n8 = (int)(string3.equals(string2) ? 1 : 0);
                            if (!n8) break;
                            n8 = 2;
                            break block21;
                        }
                    }
                    n8 = -1;
                }
                if (n8 && n8 != n10) {
                    if (n8 != n7) {
                        if (n8 != n4) {
                            if (n8 != n3) {
                                if (object == object2) {
                                    return n10;
                                }
                                return false;
                            }
                            object = ((zzqp)object).zzi();
                            object2 = ((zzqp)object2).zzi();
                            return ((Boolean)object).equals(object2);
                        }
                        boolean bl2 = ((String)(object = ((zzqz)object).zzk())).equals(object2 = ((zzqz)object2).zzk());
                        if (bl2) {
                            return n10;
                        }
                        return false;
                    }
                    double d2 = ((zzqq)object).zzi();
                    object2 = (zzqq)object2;
                    object = ((zzqq)object2).zzi();
                    double d5 = (Double)object;
                    n7 = (int)(Double.isNaN(d2) ? 1 : 0);
                    if (n7 == 0 && (n7 = (int)(Double.isNaN(d5) ? 1 : 0)) == 0 && (n7 = (int)(d2 == d5 ? 0 : (d2 > d5 ? 1 : -1))) == 0) {
                        return n10;
                    }
                    return false;
                }
                return n10;
            }
            object2 = zzjn.zzk((zzqo)object2, string2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = zzjn.zzk((zzqo)object, string2);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private static String zzi(zzqo zzqo2) {
        zzqs zzqs2 = zzqs.zze;
        if (zzqo2 == zzqs2) {
            return "Undefined";
        }
        zzqs2 = zzqs.zzd;
        if (zzqo2 == zzqs2) {
            return "Null";
        }
        boolean bl2 = zzqo2 instanceof zzqp;
        if (bl2) {
            return "Boolean";
        }
        bl2 = zzqo2 instanceof zzqq;
        if (bl2) {
            return "Number";
        }
        boolean bl3 = zzqo2 instanceof zzqz;
        if (bl3) {
            return "String";
        }
        return "Object";
    }

    private static boolean zzj(zzqo zzqo2) {
        boolean bl2 = zzqo2 instanceof zzqx;
        boolean bl3 = true;
        if (!bl2) {
            zzqs zzqs2;
            bl2 = zzqo2 instanceof zzqs;
            if (bl2 && zzqo2 != (zzqs2 = zzqs.zze)) {
                zzqs2 = zzqs.zzd;
                if (zzqo2 == zzqs2) {
                    return false;
                }
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }

    private static /* synthetic */ String zzk(zzqo object, String string2) {
        object = ((zzqo)object).toString();
        return n1.a(string2, (String)object, ".");
    }
}

