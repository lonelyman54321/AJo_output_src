/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfw$zzb;
import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zzd;
import com.google.android.gms.internal.measurement.zzfw$zze;
import com.google.android.gms.internal.measurement.zzfw$zzf;
import com.google.android.gms.internal.measurement.zzgf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzc;
import com.google.android.gms.internal.measurement.zzgf$zzd;
import com.google.android.gms.internal.measurement.zzgf$zze;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzgf$zzh$zza;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgf$zzm;
import com.google.android.gms.internal.measurement.zzgf$zzn;
import com.google.android.gms.internal.measurement.zzgf$zzo;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzgf$zzp$zza;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzog;
import com.google.android.gms.measurement.internal.zzos;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpn;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class zzpj
extends zzot {
    public zzpj(zzou zzou2) {
        super(zzou2);
    }

    public static int zza(zzgf$zzk$zza zzgf$zzk$zza, String string2) {
        int n3;
        int n4 = -1;
        if (zzgf$zzk$zza == null) {
            return n4;
        }
        for (int i3 = 0; i3 < (n3 = zzgf$zzk$zza.zzd()); ++i3) {
            String string3 = zzgf$zzk$zza.zzk(i3).zzg();
            n3 = (int)(string2.equals(string3) ? 1 : 0);
            if (n3 == 0) continue;
            return i3;
        }
        return n4;
    }

    public static Bundle zza(List object) {
        boolean bl2;
        Bundle bundle = new Bundle();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzgf$zzh)object.next();
            String string2 = ((zzgf$zzh)object2).zzg();
            boolean bl3 = ((zzgf$zzh)object2).zzj();
            if (bl3) {
                double d2 = ((zzgf$zzh)object2).zza();
                bundle.putDouble(string2, d2);
                continue;
            }
            bl3 = ((zzgf$zzh)object2).zzk();
            if (bl3) {
                float f5 = ((zzgf$zzh)object2).zzb();
                bundle.putFloat(string2, f5);
                continue;
            }
            bl3 = ((zzgf$zzh)object2).zzn();
            if (bl3) {
                object2 = ((zzgf$zzh)object2).zzh();
                bundle.putString(string2, (String)object2);
                continue;
            }
            bl3 = ((zzgf$zzh)object2).zzl();
            if (!bl3) continue;
            long l2 = ((zzgf$zzh)object2).zzd();
            bundle.putLong(string2, l2);
        }
        return bundle;
    }

    private final Bundle zza(Map map2, boolean bl2) {
        boolean bl3;
        Bundle bundle = new Bundle();
        Iterator iterator = map2.keySet().iterator();
        while (bl3 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = map2.get(string2);
            if (object == null) {
                object = null;
                bundle.putString(string2, null);
                continue;
            }
            boolean bl4 = object instanceof Long;
            if (bl4) {
                object = (Long)object;
                long l2 = (Long)object;
                bundle.putLong(string2, l2);
                continue;
            }
            bl4 = object instanceof Double;
            if (bl4) {
                object = (Double)object;
                double d2 = (Double)object;
                bundle.putDouble(string2, d2);
                continue;
            }
            bl4 = object instanceof ArrayList;
            if (bl4) {
                if (!bl2) continue;
                object = (ArrayList)object;
                ArrayList arrayList = new ArrayList();
                int n3 = ((ArrayList)object).size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object2 = ((ArrayList)object).get(i3);
                    object2 = (Map)object2;
                    object2 = this.zza((Map)object2, false);
                    arrayList.add(object2);
                }
                object = new Parcelable[]{};
                object = (Parcelable[])arrayList.toArray((T[])object);
                bundle.putParcelableArray(string2, (Parcelable[])object);
                continue;
            }
            object = object.toString();
            bundle.putString(string2, (String)object);
        }
        return bundle;
    }

    public static zzgf$zzh zza(zzgf$zzf object, String string2) {
        boolean bl2;
        object = ((zzgf$zzf)object).zzh().iterator();
        while (bl2 = object.hasNext()) {
            zzgf$zzh zzgf$zzh = (zzgf$zzh)object.next();
            String string3 = zzgf$zzh.zzg();
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            return zzgf$zzh;
        }
        return null;
    }

    public static zzlp zza(zzlp zzlp2, byte[] byArray) {
        zzjt zzjt2 = zzjt.zza();
        if (zzjt2 != null) {
            return zzlp2.zza(byArray, zzjt2);
        }
        return zzlp2.zza(byArray);
    }

    public static Object zza(zzgf$zzf object, String string2, Object object2) {
        if ((object = zzpj.zzb((zzgf$zzf)object, string2)) == null) {
            return object2;
        }
        return object;
    }

    private static String zza(boolean bl2, boolean bl3, boolean bl4) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        if (bl2) {
            string2 = "Dynamic ";
            stringBuilder.append(string2);
        }
        if (bl3) {
            string2 = "Sequence ";
            stringBuilder.append(string2);
        }
        if (bl4) {
            string2 = "Session-Scoped ";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static List zza(BitSet bitSet) {
        int n3 = bitSet.length() + 63;
        int n4 = 64;
        ArrayList<Long> arrayList = new ArrayList<Long>(n3 /= n4);
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            int n8;
            long l2 = 0L;
            for (int i8 = 0; i8 < n4 && (n8 = (i3 << 6) + i8) < (n7 = bitSet.length()); ++i8) {
                if ((n8 = (int)(bitSet.get(n8) ? 1 : 0)) == 0) continue;
                long l3 = 1L << i8;
                l2 |= l3;
            }
            Long l4 = l2;
            arrayList.add(l4);
        }
        return arrayList;
    }

    private static void zza(Uri.Builder builder, String string2, String string3, Set set) {
        boolean bl2 = set.contains(string2);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            builder.appendQueryParameter(string2, string3);
        }
    }

    private static void zza(Uri.Builder builder, String[] stringArray, Bundle bundle, Set set) {
        int n3;
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            Object object = stringArray[i3].split(",");
            String string2 = object[0];
            int n4 = ((String[])object).length + -1;
            object = object[n4];
            if ((string2 = bundle.getString(string2)) == null) continue;
            zzpj.zza(builder, (String)object, string2, set);
        }
    }

    public static void zza(zzgf$zzf$zza zzgf$zzf$zza, String object, Object object2) {
        int n3;
        Object object3;
        block8: {
            int n4;
            object3 = zzgf$zzf$zza.zzf();
            for (n3 = 0; n3 < (n4 = object3.size()); ++n3) {
                String string2 = ((zzgf$zzh)object3.get(n3)).zzg();
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) {
                    continue;
                }
                break block8;
            }
            n3 = -1;
        }
        object3 = zzgf$zzh.zze();
        object = ((zzgf$zzh$zza)object3).zza((String)object);
        boolean bl2 = object2 instanceof Long;
        if (bl2) {
            object2 = (Long)object2;
            long l2 = (Long)object2;
            ((zzgf$zzh$zza)object).zza(l2);
        } else {
            bl2 = object2 instanceof String;
            if (bl2) {
                object2 = (String)object2;
                ((zzgf$zzh$zza)object).zzb((String)object2);
            } else {
                bl2 = object2 instanceof Double;
                if (bl2) {
                    object2 = (Double)object2;
                    double d2 = (Double)object2;
                    ((zzgf$zzh$zza)object).zza(d2);
                }
            }
        }
        if (n3 >= 0) {
            zzgf$zzf$zza.zza(n3, (zzgf$zzh$zza)object);
            return;
        }
        zzgf$zzf$zza.zza((zzgf$zzh$zza)object);
    }

    private static void zza(StringBuilder stringBuilder, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = "  ";
            stringBuilder.append(string2);
        }
    }

    private final void zza(StringBuilder stringBuilder, int n3, zzfw$zzc zzkg2) {
        Object object;
        String string2;
        if (zzkg2 == null) {
            return;
        }
        zzpj.zza(stringBuilder, n3);
        Object object2 = "filter {\n";
        stringBuilder.append((String)object2);
        int n4 = ((zzfw$zzc)zzkg2).zzg();
        if (n4 != 0) {
            n4 = ((zzfw$zzc)zzkg2).zzf();
            object2 = n4 != 0;
            string2 = "complement";
            zzpj.zza(stringBuilder, n3, string2, object2);
        }
        if ((n4 = ((zzfw$zzc)zzkg2).zzi()) != 0) {
            object2 = this.zzi();
            string2 = ((zzfw$zzc)zzkg2).zze();
            object2 = ((zzgl)object2).zzb(string2);
            string2 = "param_name";
            zzpj.zza(stringBuilder, n3, string2, object2);
        }
        n4 = ((zzfw$zzc)zzkg2).zzj();
        string2 = "}\n";
        if (n4 != 0) {
            n4 = n3 + 1;
            object = ((zzfw$zzc)zzkg2).zzd();
            if (object != null) {
                int n7;
                boolean bl2;
                boolean bl3;
                String string3;
                zzpj.zza(stringBuilder, n4);
                stringBuilder.append("string_filter");
                Object object3 = " {\n";
                stringBuilder.append((String)object3);
                boolean n74 = ((zzfw$zzf)object).zzj();
                if (n74) {
                    object3 = ((zzfw$zzf)object).zzb().name();
                    string3 = "match_type";
                    zzpj.zza(stringBuilder, n4, string3, object3);
                }
                if (bl3 = ((zzfw$zzf)object).zzi()) {
                    object3 = "expression";
                    string3 = ((zzfw$zzf)object).zze();
                    zzpj.zza(stringBuilder, n4, (String)object3, string3);
                }
                if (bl2 = ((zzfw$zzf)object).zzh()) {
                    boolean bl4 = ((zzfw$zzf)object).zzg();
                    object3 = bl4;
                    string3 = "case_sensitive";
                    zzpj.zza(stringBuilder, n4, string3, object3);
                }
                if ((n7 = ((zzfw$zzf)object).zza()) > 0) {
                    boolean bl5;
                    int n8 = n3 + 2;
                    zzpj.zza(stringBuilder, n8);
                    object3 = "expression_list {\n";
                    stringBuilder.append((String)object3);
                    object = ((zzfw$zzf)object).zzf().iterator();
                    while (bl5 = object.hasNext()) {
                        object3 = (String)object.next();
                        int n10 = n3 + 3;
                        zzpj.zza(stringBuilder, n10);
                        stringBuilder.append((String)object3);
                        object3 = "\n";
                        stringBuilder.append((String)object3);
                    }
                    stringBuilder.append(string2);
                }
                zzpj.zza(stringBuilder, n4);
                stringBuilder.append(string2);
            }
        }
        if ((n4 = ((zzfw$zzc)zzkg2).zzh()) != 0) {
            n4 = n3 + 1;
            object = "number_filter";
            zzkg2 = ((zzfw$zzc)zzkg2).zzc();
            zzpj.zza(stringBuilder, n4, (String)object, (zzfw$zzd)zzkg2);
        }
        zzpj.zza(stringBuilder, n3);
        stringBuilder.append(string2);
    }

    private static void zza(StringBuilder stringBuilder, int n3, String object, zzfw$zzd object2) {
        String string2;
        if (object2 == null) {
            return;
        }
        zzpj.zza(stringBuilder, n3);
        stringBuilder.append((String)object);
        object = " {\n";
        stringBuilder.append((String)object);
        boolean bl2 = ((zzfw$zzd)object2).zzh();
        if (bl2) {
            object = ((zzfw$zzd)object2).zza().name();
            string2 = "comparison_type";
            zzpj.zza(stringBuilder, n3, string2, object);
        }
        if (bl2 = ((zzfw$zzd)object2).zzj()) {
            bl2 = ((zzfw$zzd)object2).zzg();
            object = bl2;
            string2 = "match_as_float";
            zzpj.zza(stringBuilder, n3, string2, object);
        }
        if (bl2 = ((zzfw$zzd)object2).zzi()) {
            object = "comparison_value";
            string2 = ((zzfw$zzd)object2).zzd();
            zzpj.zza(stringBuilder, n3, (String)object, string2);
        }
        if (bl2 = ((zzfw$zzd)object2).zzl()) {
            object = "min_comparison_value";
            string2 = ((zzfw$zzd)object2).zzf();
            zzpj.zza(stringBuilder, n3, (String)object, string2);
        }
        if (bl2 = ((zzfw$zzd)object2).zzk()) {
            object = "max_comparison_value";
            object2 = ((zzfw$zzd)object2).zze();
            zzpj.zza(stringBuilder, n3, (String)object, object2);
        }
        zzpj.zza(stringBuilder, n3);
        stringBuilder.append("}\n");
    }

    private static void zza(StringBuilder stringBuilder, int n3, String iterator, zzgf$zzm object) {
        Object object2;
        int n4;
        Object object3;
        int n7;
        int n8;
        if (object == null) {
            return;
        }
        n3 = 3;
        zzpj.zza(stringBuilder, n3);
        stringBuilder.append((String)((Object)iterator));
        iterator = " {\n";
        stringBuilder.append((String)((Object)iterator));
        int n10 = ((zzgf$zzm)object).zzb();
        char c2 = '\n';
        int n14 = 4;
        String string2 = ", ";
        if (n10 != 0) {
            zzpj.zza(stringBuilder, n14);
            stringBuilder.append("results: ");
            iterator = ((zzgf$zzm)object).zzi().iterator();
            n8 = 0;
            while ((n7 = iterator.hasNext()) != 0) {
                object3 = (Long)iterator.next();
                n4 = n8 + 1;
                if (n8 != 0) {
                    stringBuilder.append(string2);
                }
                stringBuilder.append(object3);
                n8 = n4;
            }
            stringBuilder.append(c2);
        }
        if ((n10 = ((zzgf$zzm)object).zzd()) != 0) {
            zzpj.zza(stringBuilder, n14);
            stringBuilder.append("status: ");
            iterator = ((zzgf$zzm)object).zzk().iterator();
            n8 = 0;
            while ((n7 = iterator.hasNext()) != 0) {
                object3 = (Long)iterator.next();
                n4 = n8 + 1;
                if (n8 != 0) {
                    stringBuilder.append(string2);
                }
                stringBuilder.append(object3);
                n8 = n4;
            }
            stringBuilder.append(c2);
        }
        n10 = ((zzgf$zzm)object).zza();
        String string3 = "}\n";
        n8 = 0;
        if (n10 != 0) {
            zzpj.zza(stringBuilder, n14);
            stringBuilder.append("dynamic_filter_timestamps: {");
            iterator = ((zzgf$zzm)object).zzh().iterator();
            n7 = 0;
            object3 = null;
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (zzgf$zze)iterator.next();
                int n15 = n7 + 1;
                if (n7 != 0) {
                    stringBuilder.append(string2);
                }
                if ((n7 = (int)(((zzgf$zze)object2).zzf() ? 1 : 0)) != 0) {
                    n7 = ((zzgf$zze)object2).zza();
                    object3 = n7;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                stringBuilder.append(object3);
                object3 = ":";
                stringBuilder.append((String)object3);
                n7 = (int)(((zzgf$zze)object2).zze() ? 1 : 0);
                if (n7 != 0) {
                    long l2 = ((zzgf$zze)object2).zzb();
                    object3 = l2;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                stringBuilder.append(object3);
                n7 = n15;
            }
            stringBuilder.append(string3);
        }
        if ((n10 = ((zzgf$zzm)object).zzc()) != 0) {
            zzpj.zza(stringBuilder, n14);
            stringBuilder.append("sequence_filter_timestamps: {");
            iterator = ((zzgf$zzm)object).zzj().iterator();
            int n16 = 0;
            object = null;
            while ((n14 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                zzgf$zzn zzgf$zzn = (zzgf$zzn)iterator.next();
                n7 = n16 + 1;
                if (n16 != 0) {
                    stringBuilder.append(string2);
                }
                if ((n16 = (int)(zzgf$zzn.zzf() ? 1 : 0)) != 0) {
                    n16 = zzgf$zzn.zzb();
                    object = n16;
                } else {
                    n16 = 0;
                    object = null;
                }
                stringBuilder.append(object);
                stringBuilder.append(": [");
                object = zzgf$zzn.zze().iterator();
                n14 = 0;
                zzgf$zzn = null;
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = (Long)object.next();
                    long l3 = (Long)object2;
                    int n17 = n14 + 1;
                    if (n14 != 0) {
                        stringBuilder.append(string2);
                    }
                    stringBuilder.append(l3);
                    n14 = n17;
                }
                object = "]";
                stringBuilder.append((String)object);
                n16 = n7;
            }
            stringBuilder.append(string3);
        }
        zzpj.zza(stringBuilder, n3);
        stringBuilder.append(string3);
    }

    private static void zza(StringBuilder stringBuilder, int n3, String string2, Object object) {
        if (object == null) {
            return;
        }
        zzpj.zza(stringBuilder, ++n3);
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(object);
        stringBuilder.append('\n');
    }

    private final void zza(StringBuilder stringBuilder, int n3, List object) {
        boolean bl2;
        if (object == null) {
            return;
        }
        ++n3;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            Object object2 = (zzgf$zzh)object.next();
            if (object2 == null) continue;
            zzpj.zza(stringBuilder, n3);
            Object object3 = "param {\n";
            stringBuilder.append((String)object3);
            int n4 = ((zzgf$zzh)object2).zzm();
            Double d2 = null;
            if (n4 != 0) {
                object3 = this.zzi();
                string2 = ((zzgf$zzh)object2).zzg();
                object3 = ((zzgl)object3).zzb(string2);
            } else {
                n4 = 0;
                object3 = null;
            }
            string2 = "name";
            zzpj.zza(stringBuilder, n3, string2, object3);
            n4 = ((zzgf$zzh)object2).zzn();
            if (n4 != 0) {
                object3 = ((zzgf$zzh)object2).zzh();
            } else {
                n4 = 0;
                object3 = null;
            }
            string2 = "string_value";
            zzpj.zza(stringBuilder, n3, string2, object3);
            n4 = ((zzgf$zzh)object2).zzl();
            if (n4 != 0) {
                long l2 = ((zzgf$zzh)object2).zzd();
                object3 = l2;
            } else {
                n4 = 0;
                object3 = null;
            }
            string2 = "int_value";
            zzpj.zza(stringBuilder, n3, string2, object3);
            n4 = ((zzgf$zzh)object2).zzj();
            if (n4 != 0) {
                double d5 = ((zzgf$zzh)object2).zza();
                d2 = d5;
            }
            object3 = "double_value";
            zzpj.zza(stringBuilder, n3, (String)object3, d2);
            n4 = ((zzgf$zzh)object2).zzc();
            if (n4 > 0) {
                object2 = ((zzgf$zzh)object2).zzi();
                this.zza(stringBuilder, n3, (List)object2);
            }
            zzpj.zza(stringBuilder, n3);
            object2 = "}\n";
            stringBuilder.append((String)object2);
        }
    }

    public static boolean zza(zzbl object, zzp zzp2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(zzp2);
        object = zzp2.zzb;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        return !bl2 || !(bl2 = TextUtils.isEmpty((CharSequence)(object = zzp2.zzp)));
    }

    public static boolean zza(List object, int n3) {
        int n4 = object.size() << 6;
        if (n3 < n4) {
            n4 = n3 / 64;
            object = (Long)object.get(n4);
            long l2 = (Long)object;
            long l3 = 1L;
            long l4 = l3 << (n3 %= 64) & l2;
            long l7 = l4 - (l2 = 0L);
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 != false) {
                return true;
            }
        }
        return false;
    }

    public static Object zzb(zzgf$zzf zzkg2, String string2) {
        if ((zzkg2 = zzpj.zza((zzgf$zzf)zzkg2, string2)) != null) {
            boolean n3 = ((zzgf$zzh)zzkg2).zzn();
            if (n3) {
                return ((zzgf$zzh)zzkg2).zzh();
            }
            boolean bl2 = ((zzgf$zzh)zzkg2).zzl();
            if (bl2) {
                return ((zzgf$zzh)zzkg2).zzd();
            }
            boolean bl3 = ((zzgf$zzh)zzkg2).zzj();
            if (bl3) {
                return ((zzgf$zzh)zzkg2).zza();
            }
            int n4 = ((zzgf$zzh)zzkg2).zzc();
            if (n4 > 0) {
                return zzpj.zzb(((zzgf$zzh)zzkg2).zzi());
            }
        }
        return null;
    }

    public static boolean zzb(String string2) {
        int n3;
        String string3;
        int n4;
        return string2 != null && (n4 = string2.matches(string3 = "([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) != 0 && (n3 = string2.length()) <= (n4 = 310);
    }

    public static Bundle[] zzb(List bundleArray) {
        boolean bl2;
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>();
        bundleArray = bundleArray.iterator();
        while (bl2 = bundleArray.hasNext()) {
            boolean bl3;
            Object object = (zzgf$zzh)bundleArray.next();
            if (object == null) continue;
            Bundle bundle = new Bundle();
            object = ((zzgf$zzh)object).zzi().iterator();
            while (bl3 = object.hasNext()) {
                String string2;
                Object object2 = (zzgf$zzh)object.next();
                boolean bl4 = ((zzgf$zzh)object2).zzn();
                if (bl4) {
                    string2 = ((zzgf$zzh)object2).zzg();
                    object2 = ((zzgf$zzh)object2).zzh();
                    bundle.putString(string2, (String)object2);
                    continue;
                }
                bl4 = ((zzgf$zzh)object2).zzl();
                if (bl4) {
                    string2 = ((zzgf$zzh)object2).zzg();
                    long l2 = ((zzgf$zzh)object2).zzd();
                    bundle.putLong(string2, l2);
                    continue;
                }
                bl4 = ((zzgf$zzh)object2).zzj();
                if (!bl4) continue;
                string2 = ((zzgf$zzh)object2).zzg();
                double d2 = ((zzgf$zzh)object2).zza();
                bundle.putDouble(string2, d2);
            }
            bl2 = bundle.isEmpty();
            if (bl2) continue;
            arrayList.add(bundle);
        }
        bundleArray = new Bundle[arrayList.size()];
        return arrayList.toArray(bundleArray);
    }

    public final long zza(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return 0L;
        }
        Charset charset = Charset.forName("UTF-8");
        object = ((String)object).getBytes(charset);
        return this.zza((byte[])object);
    }

    public final long zza(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        this.zzs().zzv();
        MessageDigest messageDigest = zzpn.zzr();
        if (messageDigest == null) {
            this.zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zzpn.zza(messageDigest.digest(byArray));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Parcelable zza(byte[] object, Parcelable.Creator object2) {
        Throwable throwable2222222;
        Parcel parcel;
        block5: {
            if (object == null) {
                return null;
            }
            parcel = Parcel.obtain();
            int n3 = ((byte[])object).length;
            parcel.unmarshall((byte[])object, 0, n3);
            parcel.setDataPosition(0);
            object = object2.createFromParcel(parcel);
            object = (Parcelable)object;
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (SafeParcelReader$ParseException safeParcelReader$ParseException) {}
                {
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    object2 = "Failed to load parcelable from buffer";
                    ((zzgq)object).zza((String)object2);
                }
                parcel.recycle();
                return null;
            }
            parcel.recycle();
            return object;
        }
        parcel.recycle();
        throw throwable2222222;
    }

    public final zzgf$zzf zza(zzbe object) {
        Object object2;
        boolean bl2;
        zzgf$zzf$zza zzgf$zzf$zza = zzgf$zzf.zze();
        long l2 = ((zzbe)object).zze;
        zzgf$zzf$zza = zzgf$zzf$zza.zza(l2);
        Object object3 = ((zzbe)object).zzf.iterator();
        while (bl2 = object3.hasNext()) {
            object2 = (String)object3.next();
            zzgf$zzh$zza zzgf$zzh$zza = zzgf$zzh.zze().zza((String)object2);
            zzbg zzbg2 = ((zzbe)object).zzf;
            object2 = zzbg2.zzc((String)object2);
            Preconditions.checkNotNull(object2);
            this.zza(zzgf$zzh$zza, object2);
            zzgf$zzf$zza.zza(zzgf$zzh$zza);
        }
        object3 = ((zzbe)object).zzc;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = ((zzbe)object).zzf;
            object2 = "_o";
            if ((object3 = ((zzbg)object3).zzc((String)object2)) == null) {
                object3 = zzgf$zzh.zze().zza((String)object2);
                object = ((zzbe)object).zzc;
                object = (zzgf$zzh)((zzkg)((zzgf$zzh$zza)object3).zzb((String)object).zzaj());
                zzgf$zzf$zza.zza((zzgf$zzh)object);
            }
        }
        return (zzgf$zzf)((zzkg)zzgf$zzf$zza.zzaj());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzbl zza(zzad zzad2) {
        Object object;
        Map map2 = zzad2.zzc();
        boolean bl2 = true;
        boolean bl3 = (map2 = this.zza(map2, bl2)).containsKey((String)(object = "_o"));
        object = bl3 && (object = map2.get((String)object)) != null ? object.toString() : "app";
        Object object2 = object;
        object = zzjp.zzb(zzad2.zzb());
        if (object == null) {
            object = zzad2.zzb();
        }
        Object object3 = object;
        zzbg zzbg2 = new zzbg((Bundle)map2);
        long l2 = zzad2.zza();
        return new zzbl((String)object3, zzbg2, (String)object2, l2);
    }

    public final zzog zza(String object, zzgf$zzk$zza object2, zzgf$zzf$zza object3, String string2) {
        zzfx zzfx2;
        Object object4;
        boolean bl2 = zzoy.zza();
        if (bl2 && (bl2 = ((zzai)(object4 = this.zze())).zze((String)object, zzfx2 = zzbn.zzcp))) {
            boolean bl3;
            Object object5;
            object4 = this.zzb();
            long l2 = object4.currentTimeMillis();
            Object object6 = this.zze();
            Object object7 = zzbn.zzbo;
            object6 = object6.zzd((String)object, (zzfx)object7).split(",");
            int n3 = ((String[])object6).length;
            object7 = new HashSet(n3);
            n3 = ((String[])object6).length;
            boolean bl4 = false;
            float f5 = 0.0f;
            Object object8 = null;
            Uri.Builder builder = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                object5 = object6[i3];
                Objects.requireNonNull(object5);
                bl3 = ((HashSet)object7).add(object5);
                if (bl3) {
                    continue;
                }
                object2 = new StringBuilder("duplicate element: ");
                ((StringBuilder)object2).append(object5);
                object2 = ((StringBuilder)object2).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object6 = Collections.unmodifiableSet(object7);
            object7 = this.zzp();
            Object object9 = ((zzos)object7).zzm().zzf((String)object);
            builder = new Uri.Builder();
            object5 = ((zzos)object7).zze();
            Object object10 = zzbn.zzbh;
            object5 = ((zzai)object5).zzd((String)object, (zzfx)object10);
            builder.scheme((String)object5);
            int n4 = TextUtils.isEmpty((CharSequence)object9);
            object10 = ".";
            if (n4 == 0) {
                object5 = ((zzos)object7).zze();
                Object object11 = zzbn.zzbi;
                object5 = ((zzai)object5).zzd((String)object, (zzfx)object11);
                object11 = new StringBuilder();
                ((StringBuilder)object11).append((String)object9);
                ((StringBuilder)object11).append((String)object10);
                ((StringBuilder)object11).append((String)object5);
                object9 = ((StringBuilder)object11).toString();
                builder.authority((String)object9);
            } else {
                object9 = ((zzos)object7).zze();
                object5 = zzbn.zzbi;
                object9 = ((zzai)object9).zzd((String)object, (zzfx)object5);
                builder.authority((String)object9);
            }
            object7 = ((zzos)object7).zze();
            object9 = zzbn.zzbj;
            object7 = ((zzai)object7).zzd((String)object, (zzfx)object9);
            builder.path((String)object7);
            object7 = ((zzgf$zzk$zza)object2).zzy();
            zzpj.zza(builder, "gmp_app_id", (String)object7, (Set)object6);
            zzpj.zza(builder, "gmp_version", "114010", (Set)object6);
            object7 = ((zzgf$zzk$zza)object2).zzv();
            object9 = this.zze();
            object5 = zzbn.zzcs;
            n3 = (int)(((zzai)object9).zze((String)object, (zzfx)object5) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((zzhm)(object9 = this.zzm())).zzo((String)object) ? 1 : 0)) != 0) {
                object7 = "";
            }
            zzpj.zza(builder, "app_instance_id", (String)object7, (Set)object6);
            object9 = ((zzgf$zzk$zza)object2).zzaa();
            zzpj.zza(builder, "rdid", (String)object9, (Set)object6);
            object9 = ((zzgf$zzk$zza)object2).zzu();
            zzpj.zza(builder, "bundle_id", (String)object9, (Set)object6);
            object7 = ((zzgf$zzf$zza)object3).zze();
            object9 = zzjp.zza((String)object7);
            boolean bl5 = TextUtils.isEmpty((CharSequence)object9);
            if (!bl5) {
                object7 = object9;
            }
            zzpj.zza(builder, "app_event_name", (String)object7, (Set)object6);
            int n7 = ((zzgf$zzk$zza)object2).zzb();
            object7 = String.valueOf(n7);
            zzpj.zza(builder, "app_version", (String)object7, (Set)object6);
            object7 = ((zzgf$zzk$zza)object2).zzz();
            object9 = this.zze();
            n3 = (int)(((zzai)object9).zze((String)object, (zzfx)object5) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((zzhm)(object9 = this.zzm())).zzs((String)object) ? 1 : 0)) != 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0)) == 0 && (n3 = ((String)object7).indexOf((String)object10)) != (n4 = -1)) {
                object7 = ((String)object7).substring(0, n3);
            }
            zzpj.zza(builder, "os_version", (String)object7, (Set)object6);
            long l3 = ((zzgf$zzf$zza)object3).zzc();
            object7 = String.valueOf(l3);
            zzpj.zza(builder, "timestamp", (String)object7, (Set)object6);
            n7 = (int)(((zzgf$zzk$zza)object2).zzae() ? 1 : 0);
            object9 = "1";
            if (n7 != 0) {
                object7 = "lat";
                zzpj.zza(builder, (String)object7, (String)object9, (Set)object6);
            }
            n7 = ((zzgf$zzk$zza)object2).zza();
            object7 = String.valueOf(n7);
            zzpj.zza(builder, "privacy_sandbox_version", (String)object7, (Set)object6);
            zzpj.zza(builder, "trigger_uri_source", (String)object9, (Set)object6);
            object8 = String.valueOf(l2);
            zzpj.zza(builder, "trigger_uri_timestamp", (String)object8, (Set)object6);
            object7 = "request_uuid";
            zzpj.zza(builder, (String)object7, string2, (Set)object6);
            object3 = ((zzgf$zzf$zza)object3).zzf();
            string2 = new Bundle();
            object3 = object3.iterator();
            while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object7 = (zzgf$zzh)object3.next();
                object8 = ((zzgf$zzh)object7).zzg();
                n4 = (int)(((zzgf$zzh)object7).zzj() ? 1 : 0);
                if (n4 != 0) {
                    double d2 = ((zzgf$zzh)object7).zza();
                    object7 = String.valueOf(d2);
                    string2.putString((String)object8, (String)object7);
                    continue;
                }
                n4 = (int)(((zzgf$zzh)object7).zzk() ? 1 : 0);
                if (n4 != 0) {
                    float f6 = ((zzgf$zzh)object7).zzb();
                    object7 = String.valueOf(f6);
                    string2.putString((String)object8, (String)object7);
                    continue;
                }
                n4 = (int)(((zzgf$zzh)object7).zzn() ? 1 : 0);
                if (n4 != 0) {
                    object7 = ((zzgf$zzh)object7).zzh();
                    string2.putString((String)object8, (String)object7);
                    continue;
                }
                n4 = (int)(((zzgf$zzh)object7).zzl() ? 1 : 0);
                if (n4 == 0) continue;
                long l4 = ((zzgf$zzh)object7).zzd();
                object7 = String.valueOf(l4);
                string2.putString((String)object8, (String)object7);
            }
            object3 = this.zze();
            object7 = zzbn.zzbn;
            object3 = ((zzai)object3).zzd((String)object, (zzfx)object7);
            object7 = "\\|";
            object3 = ((String)object3).split((String)object7);
            zzpj.zza(builder, (String[])object3, (Bundle)string2, (Set)object6);
            object3 = ((zzgf$zzk$zza)object2).zzac();
            string2 = new Bundle();
            object3 = object3.iterator();
            while (bl4 = object3.hasNext()) {
                object8 = (zzgf$zzp)object3.next();
                object5 = ((zzgf$zzp)object8).zzg();
                bl3 = ((zzgf$zzp)object8).zzi();
                if (bl3) {
                    double d5 = ((zzgf$zzp)object8).zza();
                    object8 = String.valueOf(d5);
                    string2.putString((String)object5, (String)object8);
                    continue;
                }
                bl3 = ((zzgf$zzp)object8).zzj();
                if (bl3) {
                    f5 = ((zzgf$zzp)object8).zzb();
                    object8 = String.valueOf(f5);
                    string2.putString((String)object5, (String)object8);
                    continue;
                }
                bl3 = ((zzgf$zzp)object8).zzm();
                if (bl3) {
                    object8 = ((zzgf$zzp)object8).zzh();
                    string2.putString((String)object5, (String)object8);
                    continue;
                }
                bl3 = ((zzgf$zzp)object8).zzk();
                if (!bl3) continue;
                long l7 = ((zzgf$zzp)object8).zzc();
                object8 = String.valueOf(l7);
                string2.putString((String)object5, (String)object8);
            }
            object3 = this.zze();
            object8 = zzbn.zzbm;
            object = ((zzai)object3).zzd((String)object, (zzfx)object8).split((String)object7);
            zzpj.zza(builder, (String[])object, (Bundle)string2, (Set)object6);
            boolean bl6 = ((zzgf$zzk$zza)object2).zzad();
            if (!bl6) {
                object9 = "0";
            }
            zzpj.zza(builder, "dma", (String)object9, (Set)object6);
            object = ((zzgf$zzk$zza)object2).zzx();
            bl6 = ((String)object).isEmpty();
            if (!bl6) {
                object = "dma_cps";
                object3 = ((zzgf$zzk$zza)object2).zzx();
                zzpj.zza(builder, (String)object, (String)object3, (Set)object6);
            }
            if ((bl6 = ((zzai)(object = this.zze())).zza((zzfx)(object3 = zzbn.zzcu))) && (bl6 = ((zzgf$zzk$zza)object2).zzaf())) {
                long l8;
                long l12;
                long l14;
                long l15;
                object = ((zzgf$zzk$zza)object2).zzg();
                boolean bl7 = ((String)(object2 = ((zzgf$zza)object).zzh())).isEmpty();
                if (!bl7) {
                    object2 = "dl_gclid";
                    object3 = ((zzgf$zza)object).zzh();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if (!(bl7 = ((String)(object2 = ((zzgf$zza)object).zzg())).isEmpty())) {
                    object2 = "dl_gbraid";
                    object3 = ((zzgf$zza)object).zzg();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if (!(bl7 = ((String)(object2 = ((zzgf$zza)object).zzf())).isEmpty())) {
                    object2 = "dl_gs";
                    object3 = ((zzgf$zza)object).zzf();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if ((l15 = (l14 = (l12 = ((zzgf$zza)object).zza()) - (l3 = 0L)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) > 0) {
                    l12 = ((zzgf$zza)object).zza();
                    object2 = String.valueOf(l12);
                    object3 = "dl_ss_ts";
                    zzpj.zza(builder, (String)object3, (String)object2, (Set)object6);
                }
                if (!(bl7 = ((String)(object2 = ((zzgf$zza)object).zzk())).isEmpty())) {
                    object2 = "mr_gclid";
                    object3 = ((zzgf$zza)object).zzk();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if (!(bl7 = ((String)(object2 = ((zzgf$zza)object).zzj())).isEmpty())) {
                    object2 = "mr_gbraid";
                    object3 = ((zzgf$zza)object).zzj();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if (!(bl7 = ((String)(object2 = ((zzgf$zza)object).zzi())).isEmpty())) {
                    object2 = "mr_gs";
                    object3 = ((zzgf$zza)object).zzi();
                    zzpj.zza(builder, (String)object2, (String)object3, (Set)object6);
                }
                if ((l15 = (l8 = (l12 = ((zzgf$zza)object).zzb()) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1)) > 0) {
                    long l16 = ((zzgf$zza)object).zzb();
                    object = String.valueOf(l16);
                    object2 = "mr_click_ts";
                    zzpj.zza(builder, (String)object2, (String)object, (Set)object6);
                }
            }
            object2 = builder.build().toString();
            object = new zzog((String)object2, l2, 1);
            return object;
        }
        return null;
    }

    public final String zza(zzfw$zzb object) {
        int n3;
        Object object2;
        Object object3;
        if (object == null) {
            return "null";
        }
        StringBuilder stringBuilder = Ex0.a("\nevent_filter {\n");
        boolean n32 = ((zzfw$zzb)((Object)object)).zzl();
        int n4 = 0;
        if (n32) {
            int n7 = ((zzfw$zzb)((Object)object)).zzb();
            object3 = n7;
            object2 = "filter_id";
            zzpj.zza(stringBuilder, 0, (String)object2, object3);
        }
        object3 = this.zzi();
        object2 = ((zzfw$zzb)((Object)object)).zzf();
        object3 = ((zzgl)object3).zza((String)object2);
        object2 = "event_name";
        zzpj.zza(stringBuilder, 0, (String)object2, object3);
        boolean bl2 = ((zzfw$zzb)((Object)object)).zzh();
        boolean bl3 = ((zzfw$zzb)((Object)object)).zzi();
        boolean bl4 = ((zzfw$zzb)((Object)object)).zzj();
        object3 = zzpj.zza(bl2, bl3, bl4);
        boolean bl5 = ((String)object3).isEmpty();
        if (!bl5) {
            object2 = "filter_type";
            zzpj.zza(stringBuilder, 0, (String)object2, object3);
        }
        boolean bl6 = ((zzfw$zzb)((Object)object)).zzk();
        n4 = 1;
        if (bl6) {
            object3 = "event_count_filter";
            object2 = ((zzfw$zzb)((Object)object)).zze();
            zzpj.zza(stringBuilder, n4, (String)object3, (zzfw$zzd)object2);
        }
        if ((n3 = ((zzfw$zzb)((Object)object)).zza()) > 0) {
            boolean bl7;
            object3 = "  filters {\n";
            stringBuilder.append((String)object3);
            object = ((zzfw$zzb)((Object)object)).zzg().iterator();
            while (bl7 = object.hasNext()) {
                object3 = (zzfw$zzc)object.next();
                int n8 = 2;
                this.zza(stringBuilder, n8, (zzfw$zzc)object3);
            }
        }
        zzpj.zza(stringBuilder, n4);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    public final String zza(zzfw$zze zzkg2) {
        String string2;
        Object object;
        if (zzkg2 == null) {
            return "null";
        }
        StringBuilder stringBuilder = Ex0.a("\nproperty_filter {\n");
        boolean bl2 = ((zzfw$zze)zzkg2).zzi();
        if (bl2) {
            int n3 = ((zzfw$zze)zzkg2).zza();
            object = n3;
            string2 = "filter_id";
            zzpj.zza(stringBuilder, 0, string2, object);
        }
        object = this.zzi();
        string2 = ((zzfw$zze)zzkg2).zze();
        object = ((zzgl)object).zzc(string2);
        string2 = "property_name";
        zzpj.zza(stringBuilder, 0, string2, object);
        boolean bl3 = ((zzfw$zze)zzkg2).zzf();
        boolean bl4 = ((zzfw$zze)zzkg2).zzg();
        boolean bl5 = ((zzfw$zze)zzkg2).zzh();
        object = zzpj.zza(bl3, bl4, bl5);
        bl4 = ((String)object).isEmpty();
        if (!bl4) {
            string2 = "filter_type";
            zzpj.zza(stringBuilder, 0, string2, object);
        }
        zzkg2 = ((zzfw$zze)zzkg2).zzb();
        this.zza(stringBuilder, 1, (zzfw$zzc)zzkg2);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public final String zza(zzgf$zzj object) {
        Object object2;
        Object object3;
        if (object == null) {
            return "";
        }
        StringBuilder stringBuilder = Ex0.a("\nbatch {\n");
        boolean bl2 = ((zzgf$zzj)((Object)object)).zzh();
        int n3 = 0;
        if (bl2) {
            object3 = "upload_subdomain";
            object2 = ((zzgf$zzj)((Object)object)).zze();
            zzpj.zza(stringBuilder, 0, (String)object3, object2);
        }
        if (bl2 = ((zzgf$zzj)((Object)object)).zzg()) {
            object3 = "sgtm_join_id";
            object2 = ((zzgf$zzj)((Object)object)).zzd();
            zzpj.zza(stringBuilder, 0, (String)object3, object2);
        }
        object = ((zzgf$zzj)((Object)object)).zzf().iterator();
        while (bl2 = object.hasNext()) {
            Object object4;
            boolean bl3;
            Object object5;
            int n4;
            long l2;
            boolean bl4;
            Object object6;
            Object object7;
            long l3;
            zzfx zzfx2;
            String string2;
            object3 = (zzgf$zzk)object.next();
            if (object3 == null) continue;
            n3 = 1;
            zzpj.zza(stringBuilder, n3);
            object2 = "bundle {\n";
            stringBuilder.append((String)object2);
            boolean bl5 = ((zzgf$zzk)object3).zzbs();
            if (bl5) {
                bl5 = ((zzgf$zzk)object3).zzf();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "protocol_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if ((bl5 = zzpf.zza()) && (bl5 = (boolean)((zzai)(object2 = this.zze())).zze(string2 = ((zzgf$zzk)object3).zzab(), zzfx2 = zzbn.zzcg)) && (bl5 = (boolean)((zzgf$zzk)object3).zzbv())) {
                object2 = "session_stitching_token";
                string2 = ((zzgf$zzk)object3).zzaq();
                zzpj.zza(stringBuilder, n3, (String)object2, string2);
            }
            object2 = "platform";
            string2 = ((zzgf$zzk)object3).zzao();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzbn();
            if (bl5) {
                l3 = ((zzgf$zzk)object3).zzo();
                object2 = l3;
                string2 = "gmp_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzcb()) {
                l3 = ((zzgf$zzk)object3).zzu();
                object2 = l3;
                string2 = "uploading_gmp_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbl()) {
                l3 = ((zzgf$zzk)object3).zzm();
                object2 = l3;
                string2 = "dynamite_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbe()) {
                l3 = ((zzgf$zzk)object3).zzk();
                object2 = l3;
                string2 = "config_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            string2 = ((zzgf$zzk)object3).i_();
            zzpj.zza(stringBuilder, n3, "gmp_app_id", string2);
            string2 = ((zzgf$zzk)object3).zzaa();
            zzpj.zza(stringBuilder, n3, "admob_app_id", string2);
            string2 = ((zzgf$zzk)object3).zzab();
            zzpj.zza(stringBuilder, n3, "app_id", string2);
            object2 = "app_version";
            string2 = ((zzgf$zzk)object3).zzae();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzba();
            if (bl5) {
                bl5 = ((zzgf$zzk)object3).zzb();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "app_version_major";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            object2 = "firebase_instance_id";
            string2 = ((zzgf$zzk)object3).zzak();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzbj();
            if (bl5) {
                l3 = ((zzgf$zzk)object3).zzl();
                object2 = l3;
                string2 = "dev_cert_hash";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            object2 = "app_store";
            string2 = ((zzgf$zzk)object3).zzad();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzca();
            if (bl5) {
                l3 = ((zzgf$zzk)object3).zzt();
                object2 = l3;
                string2 = "upload_timestamp_millis";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbx()) {
                l3 = ((zzgf$zzk)object3).zzr();
                object2 = l3;
                string2 = "start_timestamp_millis";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbm()) {
                l3 = ((zzgf$zzk)object3).zzn();
                object2 = l3;
                string2 = "end_timestamp_millis";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbr()) {
                l3 = ((zzgf$zzk)object3).zzq();
                object2 = l3;
                string2 = "previous_bundle_start_timestamp_millis";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbq()) {
                l3 = ((zzgf$zzk)object3).zzp();
                object2 = l3;
                string2 = "previous_bundle_end_timestamp_millis";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            string2 = ((zzgf$zzk)object3).zzac();
            zzpj.zza(stringBuilder, n3, "app_instance_id", string2);
            string2 = ((zzgf$zzk)object3).zzap();
            zzpj.zza(stringBuilder, n3, "resettable_device_id", string2);
            object2 = "ds_id";
            string2 = ((zzgf$zzk)object3).zzaj();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzbp();
            if (bl5) {
                bl5 = ((zzgf$zzk)object3).zzax();
                object2 = bl5;
                string2 = "limited_ad_tracking";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            string2 = ((zzgf$zzk)object3).zzan();
            zzpj.zza(stringBuilder, n3, "os_version", string2);
            string2 = ((zzgf$zzk)object3).zzai();
            zzpj.zza(stringBuilder, n3, "device_model", string2);
            object2 = "user_default_language";
            string2 = ((zzgf$zzk)object3).zzar();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzbz();
            if (bl5) {
                bl5 = ((zzgf$zzk)object3).zzh();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "time_zone_offset_minutes";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbd()) {
                bl5 = ((zzgf$zzk)object3).zzc();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "bundle_sequential_index";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbi()) {
                bl5 = ((zzgf$zzk)object3).zzd();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "delivery_index";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbu()) {
                bl5 = ((zzgf$zzk)object3).zzay();
                object2 = bl5;
                string2 = "service_upload";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            object2 = "health_monitor";
            string2 = ((zzgf$zzk)object3).zzam();
            zzpj.zza(stringBuilder, n3, (String)object2, string2);
            bl5 = ((zzgf$zzk)object3).zzbt();
            if (bl5) {
                bl5 = ((zzgf$zzk)object3).zzg();
                object2 = (int)(bl5 ? 1 : 0);
                string2 = "retry_counter";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbg()) {
                object2 = "consent_signals";
                string2 = ((zzgf$zzk)object3).zzag();
                zzpj.zza(stringBuilder, n3, (String)object2, string2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbo()) {
                bl5 = ((zzgf$zzk)object3).zzaw();
                object2 = bl5;
                string2 = "is_dma_region";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            if (bl5 = (boolean)((zzgf$zzk)object3).zzbh()) {
                object2 = "core_platform_services";
                string2 = ((zzgf$zzk)object3).zzah();
                zzpj.zza(stringBuilder, n3, (String)object2, string2);
            }
            if (bl5 = ((zzgf$zzk)object3).zzbf()) {
                object2 = "consent_diagnostics";
                string2 = ((zzgf$zzk)object3).zzaf();
                zzpj.zza(stringBuilder, n3, (String)object2, string2);
            }
            if (bl5 = ((zzgf$zzk)object3).zzby()) {
                l3 = ((zzgf$zzk)object3).zzs();
                object2 = l3;
                string2 = "target_os_version";
                zzpj.zza(stringBuilder, n3, string2, object2);
            }
            bl5 = zzoy.zza();
            string2 = "}\n";
            int n7 = 2;
            if (bl5 && (bl5 = ((zzai)(object2 = this.zze())).zze((String)(object7 = ((zzgf$zzk)object3).zzab()), (zzfx)(object6 = zzbn.zzcp)))) {
                object2 = ((zzgf$zzk)object3).zza();
                object7 = "ad_services_version";
                zzpj.zza(stringBuilder, n3, (String)object7, object2);
                bl5 = ((zzgf$zzk)object3).zzbb();
                if (bl5 && (object2 = ((zzgf$zzk)object3).zzw()) != null) {
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append("attribution_eligibility_status {\n");
                    object7 = ((zzgf$zzc)object2).zzf();
                    zzpj.zza(stringBuilder, n7, "eligible", object7);
                    object7 = ((zzgf$zzc)object2).zzh();
                    zzpj.zza(stringBuilder, n7, "no_access_adservices_attribution_permission", object7);
                    object7 = ((zzgf$zzc)object2).zzi();
                    zzpj.zza(stringBuilder, n7, "pre_r", object7);
                    object7 = ((zzgf$zzc)object2).zzj();
                    zzpj.zza(stringBuilder, n7, "r_extensions_too_old", object7);
                    object7 = ((zzgf$zzc)object2).zze();
                    zzpj.zza(stringBuilder, n7, "adservices_extension_too_old", object7);
                    bl4 = ((zzgf$zzc)object2).zzd();
                    object7 = bl4;
                    object6 = "ad_storage_not_allowed";
                    zzpj.zza(stringBuilder, n7, (String)object6, object7);
                    bl5 = ((zzgf$zzc)object2).zzg();
                    object2 = bl5;
                    object7 = "measurement_manager_disabled";
                    zzpj.zza(stringBuilder, n7, (String)object7, object2);
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append(string2);
                }
            }
            if (bl5 = ((zzgf$zzk)object3).zzaz()) {
                object2 = ((zzgf$zzk)object3).zzv();
                zzpj.zza(stringBuilder, n7);
                object7 = "ad_campaign_info {\n";
                stringBuilder.append((String)object7);
                bl4 = ((zzgf$zza)object2).zzn();
                if (bl4) {
                    object7 = "deep_link_gclid";
                    object6 = ((zzgf$zza)object2).zzh();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzm()) {
                    object7 = "deep_link_gbraid";
                    object6 = ((zzgf$zza)object2).zzg();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzl()) {
                    object7 = "deep_link_gad_source";
                    object6 = ((zzgf$zza)object2).zzf();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzo()) {
                    l2 = ((zzgf$zza)object2).zza();
                    object7 = l2;
                    object6 = "deep_link_session_millis";
                    zzpj.zza(stringBuilder, n7, (String)object6, object7);
                }
                if (bl4 = ((zzgf$zza)object2).zzs()) {
                    object7 = "market_referrer_gclid";
                    object6 = ((zzgf$zza)object2).zzk();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzr()) {
                    object7 = "market_referrer_gbraid";
                    object6 = ((zzgf$zza)object2).zzj();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzq()) {
                    object7 = "market_referrer_gad_source";
                    object6 = ((zzgf$zza)object2).zzi();
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                }
                if (bl4 = ((zzgf$zza)object2).zzp()) {
                    l2 = ((zzgf$zza)object2).zzb();
                    object2 = l2;
                    object7 = "market_referrer_click_millis";
                    zzpj.zza(stringBuilder, n7, (String)object7, object2);
                }
                zzpj.zza(stringBuilder, n7);
                stringBuilder.append(string2);
            }
            if (bl5 = ((zzgf$zzk)object3).zzbc()) {
                l2 = ((zzgf$zzk)object3).zzj();
                object2 = l2;
                object7 = "batching_timestamp_millis";
                zzpj.zza(stringBuilder, n3, (String)object7, object2);
            }
            if (bl5 = ((zzgf$zzk)object3).zzbw()) {
                object2 = ((zzgf$zzk)object3).zzz();
                zzpj.zza(stringBuilder, n7);
                stringBuilder.append("sgtm_diagnostics {\n");
                object7 = ((zzgf$zzo)object2).zzd().name();
                zzpj.zza(stringBuilder, n7, "upload_type", object7);
                object7 = ((zzgf$zzo)object2).zzb().name();
                object6 = "client_upload_eligibility";
                zzpj.zza(stringBuilder, n7, (String)object6, object7);
                object2 = ((zzgf$zzo)object2).zzc().name();
                object7 = "service_upload_eligibility";
                zzpj.zza(stringBuilder, n7, (String)object7, object2);
                zzpj.zza(stringBuilder, n7);
                stringBuilder.append(string2);
            }
            object2 = ((zzgf$zzk)object3).zzau();
            object7 = "name";
            if (object2 != null) {
                object2 = object2.iterator();
                while ((n4 = object2.hasNext()) != 0) {
                    long l4;
                    object6 = (zzgf$zzp)object2.next();
                    if (object6 == null) continue;
                    zzpj.zza(stringBuilder, n7);
                    object5 = "user_property {\n";
                    stringBuilder.append((String)object5);
                    bl3 = ((zzgf$zzp)object6).zzl();
                    object4 = null;
                    if (bl3) {
                        l4 = ((zzgf$zzp)object6).zzd();
                        object5 = l4;
                    } else {
                        bl3 = false;
                        object5 = null;
                    }
                    zzpj.zza(stringBuilder, n7, "set_timestamp_millis", object5);
                    object5 = this.zzi();
                    String string3 = ((zzgf$zzp)object6).zzg();
                    object5 = ((zzgl)object5).zzc(string3);
                    zzpj.zza(stringBuilder, n7, (String)object7, object5);
                    object5 = "string_value";
                    string3 = ((zzgf$zzp)object6).zzh();
                    zzpj.zza(stringBuilder, n7, (String)object5, string3);
                    bl3 = ((zzgf$zzp)object6).zzk();
                    if (bl3) {
                        l4 = ((zzgf$zzp)object6).zzc();
                        object5 = l4;
                    } else {
                        bl3 = false;
                        object5 = null;
                    }
                    string3 = "int_value";
                    zzpj.zza(stringBuilder, n7, string3, object5);
                    bl3 = ((zzgf$zzp)object6).zzi();
                    if (bl3) {
                        double d2 = ((zzgf$zzp)object6).zza();
                        object4 = d2;
                    }
                    object6 = "double_value";
                    zzpj.zza(stringBuilder, n7, (String)object6, object4);
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append(string2);
                }
            }
            object2 = ((zzgf$zzk)object3).zzas();
            ((zzgf$zzk)object3).zzab();
            if (object2 != null) {
                object2 = object2.iterator();
                while ((n4 = object2.hasNext()) != 0) {
                    object6 = (zzgf$zzd)object2.next();
                    if (object6 == null) continue;
                    zzpj.zza(stringBuilder, n7);
                    object5 = "audience_membership {\n";
                    stringBuilder.append((String)object5);
                    bl3 = ((zzgf$zzd)object6).zzg();
                    if (bl3) {
                        bl3 = ((zzgf$zzd)object6).zza();
                        object5 = (int)(bl3 ? 1 : 0);
                        object4 = "audience_id";
                        zzpj.zza(stringBuilder, n7, (String)object4, object5);
                    }
                    if (bl3 = (boolean)((zzgf$zzd)object6).zzh()) {
                        bl3 = ((zzgf$zzd)object6).zzf();
                        object5 = bl3;
                        object4 = "new_audience";
                        zzpj.zza(stringBuilder, n7, (String)object4, object5);
                    }
                    object5 = "current_data";
                    object4 = ((zzgf$zzd)object6).zzd();
                    zzpj.zza(stringBuilder, n7, (String)object5, (zzgf$zzm)object4);
                    bl3 = ((zzgf$zzd)object6).zzi();
                    if (bl3) {
                        object5 = "previous_data";
                        object6 = ((zzgf$zzd)object6).zze();
                        zzpj.zza(stringBuilder, n7, (String)object5, (zzgf$zzm)object6);
                    }
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append(string2);
                }
            }
            if ((object3 = ((zzgf$zzk)object3).zzat()) != null) {
                object3 = object3.iterator();
                while (bl5 = object3.hasNext()) {
                    long l7;
                    object2 = (zzgf$zzf)object3.next();
                    if (object2 == null) continue;
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append("event {\n");
                    object6 = this.zzi();
                    object5 = ((zzgf$zzf)object2).zzg();
                    object6 = ((zzgl)object6).zza((String)object5);
                    zzpj.zza(stringBuilder, n7, (String)object7, object6);
                    n4 = ((zzgf$zzf)object2).zzk();
                    if (n4 != 0) {
                        l7 = ((zzgf$zzf)object2).zzd();
                        object6 = l7;
                        object5 = "timestamp_millis";
                        zzpj.zza(stringBuilder, n7, (String)object5, object6);
                    }
                    if ((n4 = ((zzgf$zzf)object2).zzj()) != 0) {
                        l7 = ((zzgf$zzf)object2).zzc();
                        object6 = l7;
                        object5 = "previous_timestamp_millis";
                        zzpj.zza(stringBuilder, n7, (String)object5, object6);
                    }
                    if ((n4 = ((zzgf$zzf)object2).zzi()) != 0) {
                        n4 = ((zzgf$zzf)object2).zza();
                        object6 = n4;
                        object5 = "count";
                        zzpj.zza(stringBuilder, n7, (String)object5, object6);
                    }
                    if ((n4 = ((zzgf$zzf)object2).zzb()) != 0) {
                        object2 = ((zzgf$zzf)object2).zzh();
                        this.zza(stringBuilder, n7, (List)object2);
                    }
                    zzpj.zza(stringBuilder, n7);
                    stringBuilder.append(string2);
                }
            }
            zzpj.zza(stringBuilder, n3);
            stringBuilder.append(string2);
        }
        stringBuilder.append("} // End-of-batch\n");
        return stringBuilder.toString();
    }

    public final List zza(List object, List object2) {
        Object object3;
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>((Collection<Object>)object);
        object = object2.iterator();
        while ((n3 = object.hasNext()) != 0) {
            int n4;
            Object object4;
            object2 = (Integer)object.next();
            int n7 = (Integer)object2;
            if (n7 < 0) {
                object3 = this.zzj().zzr();
                object4 = "Ignoring negative bit index to be cleared";
                ((zzgq)object3).zza((String)object4, object2);
                continue;
            }
            n7 = (Integer)object2 / 64;
            if (n7 >= (n4 = arrayList.size())) {
                object3 = this.zzj().zzr();
                n4 = arrayList.size();
                object4 = n4;
                String string2 = "Ignoring bit index greater than bitSet size";
                ((zzgq)object3).zza(string2, object2, object4);
                continue;
            }
            object4 = (Long)arrayList.get(n7);
            long l2 = (Long)object4;
            n3 = (Integer)object2 % 64;
            long l3 = 1L << n3 ^ (long)-1;
            object2 = l2 &= l3;
            arrayList.set(n7, object2);
        }
        int n8 = arrayList.size();
        n3 = arrayList.size() + -1;
        while (true) {
            long l4;
            long l7;
            long l8;
            long l12;
            int n10 = n3;
            n3 = n8;
            n8 = n10;
            if (n10 < 0 || (l12 = (l8 = (l7 = ((Long)(object3 = (Long)arrayList.get(n10))).longValue()) - (l4 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) break;
            n3 = n10 + -1;
        }
        return arrayList.subList(0, n3);
    }

    public final Map zza(Bundle bundle, boolean bl2) {
        boolean bl3;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = bundle.keySet().iterator();
        while (bl3 = iterator.hasNext()) {
            boolean bl4;
            boolean bl5;
            String string2 = (String)iterator.next();
            Object object = bundle.get(string2);
            int n3 = object instanceof Parcelable[];
            if (n3 == 0 && !(bl5 = object instanceof ArrayList) && !(bl5 = object instanceof Bundle)) {
                if (object == null) continue;
                hashMap.put(string2, object);
                continue;
            }
            if (!bl2) continue;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (n3 != 0) {
                for (Parcelable parcelable : (Parcelable[])object) {
                    bl4 = parcelable instanceof Bundle;
                    if (!bl4) continue;
                    Bundle bundle2 = (Bundle)parcelable;
                    Map map2 = this.zza(bundle2, false);
                    arrayList.add(map2);
                }
            } else {
                n3 = object instanceof ArrayList;
                if (n3 != 0) {
                    object = (ArrayList)object;
                    n3 = ((ArrayList)object).size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object e2 = ((ArrayList)object).get(i3);
                        bl4 = e2 instanceof Bundle;
                        if (!bl4) continue;
                        Bundle bundle3 = (Bundle)e2;
                        Map map3 = this.zza(bundle3, false);
                        arrayList.add(map3);
                    }
                } else {
                    n3 = object instanceof Bundle;
                    if (n3 != 0) {
                        object = (Bundle)object;
                        object = this.zza((Bundle)object, false);
                        arrayList.add(object);
                    }
                }
            }
            hashMap.put(string2, arrayList);
        }
        return hashMap;
    }

    public final void zza(zzgf$zzh$zza zzgf$zzh$zza, Object bundleArray) {
        Preconditions.checkNotNull(bundleArray);
        Cloneable cloneable = zzgf$zzh$zza.zze().zzc().zzb();
        ((zzgf$zzh$zza)cloneable).zzd();
        boolean bl2 = bundleArray instanceof String;
        if (bl2) {
            bundleArray = (String)bundleArray;
            zzgf$zzh$zza.zzb((String)bundleArray);
            return;
        }
        bl2 = bundleArray instanceof Long;
        if (bl2) {
            long l2 = (Long)bundleArray;
            zzgf$zzh$zza.zza(l2);
            return;
        }
        bl2 = bundleArray instanceof Double;
        if (bl2) {
            double d2 = (Double)bundleArray;
            zzgf$zzh$zza.zza(d2);
            return;
        }
        bl2 = bundleArray instanceof Bundle[];
        if (bl2) {
            bundleArray = bundleArray;
            cloneable = new ArrayList();
            for (Object object : bundleArray) {
                boolean bl3;
                if (object == null) continue;
                zzgf$zzh$zza zzgf$zzh$zza2 = zzgf$zzh.zze();
                Iterator iterator = object.keySet().iterator();
                while (bl3 = iterator.hasNext()) {
                    Object object2 = (String)iterator.next();
                    zzgf$zzh$zza zzgf$zzh$zza3 = zzgf$zzh.zze().zza((String)object2);
                    boolean bl4 = (object2 = object.get((String)object2)) instanceof Long;
                    if (bl4) {
                        object2 = (Long)object2;
                        long l3 = (Long)object2;
                        zzgf$zzh$zza3.zza(l3);
                    } else {
                        bl4 = object2 instanceof String;
                        if (bl4) {
                            object2 = (String)object2;
                            zzgf$zzh$zza3.zzb((String)object2);
                        } else {
                            bl4 = object2 instanceof Double;
                            if (!bl4) continue;
                            object2 = (Double)object2;
                            double d5 = (Double)object2;
                            zzgf$zzh$zza3.zza(d5);
                        }
                    }
                    zzgf$zzh$zza2.zza(zzgf$zzh$zza3);
                }
                int n3 = zzgf$zzh$zza2.zza();
                if (n3 <= 0) continue;
                object = (zzgf$zzh)((zzkg)zzgf$zzh$zza2.zzaj());
                ((ArrayList)cloneable).add(object);
            }
            zzgf$zzh$zza.zza((Iterable)((Object)cloneable));
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) event param value", bundleArray);
    }

    public final void zza(zzgf$zzp$zza zzgf$zzp$zza, Object object) {
        Preconditions.checkNotNull(object);
        zzgf$zzp$zza zzgf$zzp$zza2 = zzgf$zzp$zza.zzc().zzb();
        zzgf$zzp$zza2.zza();
        boolean bl2 = object instanceof String;
        if (bl2) {
            object = (String)object;
            zzgf$zzp$zza.zzb((String)object);
            return;
        }
        bl2 = object instanceof Long;
        if (bl2) {
            long l2 = (Long)object;
            zzgf$zzp$zza.zza(l2);
            return;
        }
        bl2 = object instanceof Double;
        if (bl2) {
            double d2 = (Double)object;
            zzgf$zzp$zza.zza(d2);
            return;
        }
        this.zzj().zzg().zza("Ignoring invalid (type) user attribute value", object);
    }

    public final boolean zza(long l2, long l3) {
        Clock clock;
        long l4;
        long l7;
        long l8 = 0L;
        long l12 = l2 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        return object == false || (object = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1)) <= 0 || (l7 = (l4 = (l2 = Math.abs(l8 = (clock = this.zzb()).currentTimeMillis() - l2)) - l3) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0;
        {
        }
    }

    public final byte[] zzb(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        catch (IOException iOException) {
            this.zzj().zzg().zza("Failed to gzip content", iOException);
            throw iOException;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        ((OutputStream)gZIPOutputStream).write(byArray);
        ((OutputStream)gZIPOutputStream).close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean zzc() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zzc(byte[] object) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            object = new GZIPInputStream;
            ((GZIPInputStream)object)(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int n3 = 1024;
            byte[] byArray = new byte[n3];
            while (true) {
                int n4;
                if ((n4 = ((InputStream)object).read(byArray)) <= 0) {
                    ((GZIPInputStream)object).close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(byArray, 0, n4);
            }
        }
        catch (IOException iOException) {}
        this.zzj().zzg().zza("Failed to ungzip content", iOException);
        throw iOException;
    }

    public final List zzr() {
        boolean bl2;
        Object object = zzbn.zza(this.zzg.zza());
        if (object != null && !(bl2 = object.isEmpty())) {
            boolean bl3;
            int n3;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Integer n4 = (Integer)zzbn.zzaz.zza(null);
            int n7 = n4;
            object = object.entrySet().iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object2;
                Object object3 = (Map.Entry)object.next();
                Object object4 = (String)object3.getKey();
                boolean bl4 = ((String)object4).startsWith((String)(object2 = "measurement.id."));
                if (!bl4) continue;
                try {
                    object3 = object3.getValue();
                }
                catch (NumberFormatException numberFormatException) {
                    object4 = this.zzj().zzr();
                    object2 = "Experiment ID NumberFormatException";
                    ((zzgq)object4).zza((String)object2, numberFormatException);
                    continue;
                }
                object3 = (String)object3;
                n3 = Integer.parseInt((String)object3);
                if (n3 == 0) continue;
                object3 = n3;
                arrayList.add(object3);
                n3 = arrayList.size();
                if (n3 < n7) continue;
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzr();
                object4 = "Too many experiment IDs. Number of IDs";
                int n8 = arrayList.size();
                object2 = n8;
                ((zzgq)object3).zza((String)object4, object2);
                break;
            }
            if (bl3 = arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }
}

