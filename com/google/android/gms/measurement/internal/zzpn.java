/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzpn
extends zzji {
    private static final String[] zza = new String[]{"firebase_", "google_", "ga_"};
    private static final String[] zzb = new String[]{"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private ml1_0 zzf;
    private Boolean zzg;
    private Integer zzh = null;

    public zzpn(zzic object) {
        super((zzic)object);
        this.zzd = object = new AtomicLong(0L);
    }

    private final int zza(String string2, String string3, String string4, Object bundle, Bundle bundle2, List list, boolean bl2, boolean bl3) {
        block15: {
            int n3;
            block22: {
                int n4;
                Object object;
                int n7;
                Object object2;
                Object object3;
                Object object4;
                int n8;
                String string5;
                Object object5;
                Object object62;
                String string6;
                block23: {
                    block21: {
                        boolean bl4;
                        block20: {
                            zzgq zzgq2;
                            block16: {
                                block17: {
                                    int n10;
                                    block19: {
                                        block18: {
                                            string6 = string4;
                                            object62 = bundle;
                                            object5 = bundle2;
                                            this.zzv();
                                            bl4 = zzpn.zza((Object)bundle);
                                            string5 = "param";
                                            n8 = 0;
                                            object4 = null;
                                            if (!bl4) break block16;
                                            if (!bl3) break block17;
                                            object3 = zzjo.zzc;
                                            bl4 = zzpn.zza(string4, (String[])object3);
                                            if (!bl4) {
                                                return 20;
                                            }
                                            object3 = this.zzu.zzt();
                                            bl4 = ((zzme)object3).zzam();
                                            if (!bl4) {
                                                return 25;
                                            }
                                            bl4 = bundle instanceof Parcelable[];
                                            if (!bl4) break block18;
                                            object2 = bundle;
                                            object2 = bundle;
                                            n10 = ((Parcelable[])object2).length;
                                            break block19;
                                        }
                                        n10 = bundle instanceof ArrayList;
                                        if (n10 == 0) break block16;
                                        object2 = bundle;
                                        object2 = (ArrayList)bundle;
                                        n10 = ((ArrayList)object2).size();
                                    }
                                    n7 = 200;
                                    if (n10 <= n7) break block16;
                                    zzgq2 = this.zzj().zzw();
                                    object2 = n10;
                                    object = "Parameter array is too long; discarded. Value kind, name, array length";
                                    zzgq2.zza((String)object, string5, string6, object2);
                                    if (bl4) {
                                        object3 = object62;
                                        object3 = (Parcelable[])object62;
                                        n10 = ((Object)object3).length;
                                        if (n10 > n7) {
                                            object3 = (Parcelable[])Arrays.copyOf(object3, n7);
                                            object5.putParcelableArray(string6, (Parcelable[])object3);
                                        }
                                    } else {
                                        bl4 = object62 instanceof ArrayList;
                                        if (bl4) {
                                            object3 = object62;
                                            object3 = (ArrayList)object62;
                                            n10 = ((ArrayList)object3).size();
                                            if (n10 > n7) {
                                                object3 = ((ArrayList)object3).subList(0, n7);
                                                object2 = new ArrayList(object3);
                                                object5.putParcelableArrayList(string6, (ArrayList)object2);
                                            }
                                        }
                                    }
                                    n4 = 17;
                                    n3 = 17;
                                    break block20;
                                }
                                return 21;
                            }
                            n3 = 0;
                            zzgq2 = null;
                        }
                        n4 = zzpn.zzf(string3);
                        bl4 = false;
                        object3 = null;
                        if (n4 == 0 && (n4 = zzpn.zzf(string4)) == 0) {
                            object5 = this.zze();
                            n4 = ((zzai)object5).zza(null, false);
                        } else {
                            object5 = this.zze();
                            n4 = ((zzai)object5).zzb(null, false);
                        }
                        n4 = (int)(this.zza(string5, string6, n4, object62) ? 1 : 0);
                        if (n4 != 0) {
                            return n3;
                        }
                        if (!bl3) break block15;
                        n4 = object62 instanceof Bundle;
                        if (n4 == 0) break block21;
                        object4 = object62;
                        object4 = (Bundle)object62;
                        object62 = this;
                        object5 = string2;
                        object3 = string3;
                        string5 = string4;
                        object2 = list;
                        n7 = (int)(bl2 ? 1 : 0);
                        this.zza(string2, string3, string4, (Bundle)object4, list, bl2);
                        break block22;
                    }
                    n4 = object62 instanceof Parcelable[];
                    if (n4 == 0) break block23;
                    object = object62;
                    for (Object object62 : (Bundle)object62) {
                        n4 = object62 instanceof Bundle;
                        if (n4 == 0) {
                            object5 = this.zzj().zzw();
                            object62 = object62.getClass();
                            object3 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                            ((zzgq)object5).zza((String)object3, object62, string6);
                            break block15;
                        }
                        object4 = object62;
                        object4 = object62;
                        object62 = this;
                        object5 = string2;
                        object3 = string3;
                        string5 = string4;
                        object2 = list;
                        n7 = (int)(bl2 ? 1 : 0);
                        this.zza(string2, string3, string4, (Bundle)object4, list, bl2);
                    }
                    break block22;
                }
                n4 = object62 instanceof ArrayList;
                if (n4 != 0) {
                    object = object62;
                    object = (ArrayList)object62;
                    int n14 = ((ArrayList)object).size();
                    while (n8 < n14) {
                        object62 = ((ArrayList)object).get(n8);
                        int n15 = n8 + 1;
                        n4 = object62 instanceof Bundle;
                        if (n4 == 0) {
                            object5 = this.zzj().zzw();
                            object62 = object62 != null ? object62.getClass() : "null";
                            object3 = "All ArrayList elements must be of type Bundle. Value type, name";
                            ((zzgq)object5).zza((String)object3, object62, string6);
                            break block15;
                        }
                        object4 = object62;
                        object4 = (Bundle)object62;
                        object62 = this;
                        object5 = string2;
                        object3 = string3;
                        string5 = string4;
                        object2 = list;
                        n7 = (int)(bl2 ? 1 : 0);
                        this.zza(string2, string3, string4, (Bundle)object4, list, bl2);
                        n8 = n15;
                    }
                }
                break block15;
            }
            return n3;
        }
        return 4;
    }

    public static long zza(long l2, long l3) {
        return (l3 * 60000L + l2) / 86400000L;
    }

    public static long zza(zzbg zzbg2) {
        int n3;
        long l2 = 0L;
        if (zzbg2 == null) {
            return l2;
        }
        Iterator iterator = zzbg2.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            Parcelable[] parcelableArray = (String)iterator.next();
            boolean bl2 = (parcelableArray = zzbg2.zzc((String)parcelableArray)) instanceof Parcelable[];
            if (!bl2) continue;
            parcelableArray = parcelableArray;
            n3 = parcelableArray.length;
            long l3 = n3;
            l2 += l3;
        }
        return l2;
    }

    public static long zza(byte[] byArray) {
        int n3;
        Preconditions.checkNotNull(byArray);
        int n4 = byArray.length;
        int n7 = 0;
        int n8 = 1;
        n4 = n4 > 0 ? 1 : 0;
        Preconditions.checkState(n4 != 0);
        long l2 = 0L;
        for (n4 = byArray.length - n8; n4 >= 0 && n4 >= (n3 = byArray.length + -8); n4 += -1) {
            n3 = byArray[n4];
            long l3 = n3;
            long l4 = 255L;
            l3 = (l3 & l4) << n7;
            l2 += l3;
            n7 += 8;
        }
        return l2;
    }

    public static Bundle zza(Bundle object) {
        int n3;
        if (object == null) {
            object = new Bundle();
            return object;
        }
        Bundle bundle = new Bundle((Bundle)object);
        object = bundle.keySet().iterator();
        while ((n3 = object.hasNext()) != 0) {
            Bundle bundle2;
            Bundle bundle3;
            Object object2 = (String)object.next();
            Object object3 = bundle.get((String)object2);
            int n4 = object3 instanceof Bundle;
            if (n4 != 0) {
                object3 = (Bundle)object3;
                bundle3 = new Bundle((Bundle)object3);
                bundle.putBundle((String)object2, bundle3);
                continue;
            }
            n3 = object3 instanceof Parcelable[];
            bundle3 = null;
            if (n3 != 0) {
                object3 = (Parcelable[])object3;
                for (n4 = 0; n4 < (n3 = ((Parcelable[])object3).length); ++n4) {
                    object2 = object3[n4];
                    n3 = object2 instanceof Bundle;
                    if (n3 == 0) continue;
                    bundle2 = (Bundle)object3[n4];
                    object3[n4] = object2 = new Bundle(bundle2);
                }
                continue;
            }
            n3 = object3 instanceof List;
            if (n3 == 0) continue;
            object3 = (List)object3;
            while (n4 < (n3 = object3.size())) {
                object2 = object3.get(n4);
                boolean bl2 = object2 instanceof Bundle;
                if (bl2) {
                    object2 = (Bundle)object2;
                    bundle2 = new Bundle((Bundle)object2);
                    object3.set(n4, bundle2);
                }
                ++n4;
            }
        }
        return bundle;
    }

    public static Bundle zza(List object) {
        boolean bl2;
        Bundle bundle = new Bundle();
        if (object == null) {
            return bundle;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzpm)object.next();
            Object object3 = ((zzpm)object2).zzd;
            if (object3 != null) {
                object2 = ((zzpm)object2).zza;
                bundle.putString((String)object2, (String)object3);
                continue;
            }
            object3 = ((zzpm)object2).zzc;
            if (object3 != null) {
                object2 = ((zzpm)object2).zza;
                long l2 = (Long)object3;
                bundle.putLong((String)object2, l2);
                continue;
            }
            object3 = ((zzpm)object2).zzf;
            if (object3 == null) continue;
            object2 = ((zzpm)object2).zza;
            double d2 = (Double)object3;
            bundle.putDouble((String)object2, d2);
        }
        return bundle;
    }

    private final Object zza(int n3, Object parcelableArray, boolean bl2, boolean bl3, String string2) {
        if (parcelableArray == null) {
            return null;
        }
        boolean bl4 = parcelableArray instanceof Long;
        if (!bl4 && !(bl4 = parcelableArray instanceof Double)) {
            bl4 = parcelableArray instanceof Integer;
            if (bl4) {
                return (long)((Integer)parcelableArray).intValue();
            }
            bl4 = parcelableArray instanceof Byte;
            if (bl4) {
                return (long)((Byte)parcelableArray).byteValue();
            }
            bl4 = parcelableArray instanceof Short;
            if (bl4) {
                return (long)((Short)parcelableArray).shortValue();
            }
            bl4 = parcelableArray instanceof Boolean;
            if (bl4) {
                n3 = (int)((parcelableArray = (Boolean)parcelableArray).booleanValue() ? 1 : 0);
                long l2 = n3 != 0 ? 1L : 0L;
                return l2;
            }
            bl4 = parcelableArray instanceof Float;
            if (bl4) {
                return ((Float)parcelableArray).doubleValue();
            }
            bl4 = parcelableArray instanceof String;
            if (!(bl4 || (bl4 = parcelableArray instanceof Character) || (bl4 = parcelableArray instanceof CharSequence))) {
                if (bl3 && ((n3 = parcelableArray instanceof Bundle[]) != 0 || (n3 = parcelableArray instanceof Parcelable[]) != 0)) {
                    ArrayList<Parcelable> arrayList = new ArrayList<Parcelable>();
                    for (Parcelable parcelable : (Parcelable[])parcelableArray) {
                        boolean bl5 = parcelable instanceof Bundle;
                        if (!bl5) continue;
                        parcelable = (Bundle)parcelable;
                        if ((parcelable = this.zza((Bundle)parcelable, (String)null)) == null || (bl5 = parcelable.isEmpty())) continue;
                        arrayList.add(parcelable);
                    }
                    parcelableArray = new Bundle[arrayList.size()];
                    return arrayList.toArray(parcelableArray);
                }
                return null;
            }
            return zzpn.zza(String.valueOf(parcelableArray), n3, bl2);
        }
        return parcelableArray;
    }

    public static String zza(String string2, int n3, boolean bl2) {
        if (string2 == null) {
            return null;
        }
        int n4 = string2.length();
        if ((n4 = string2.codePointCount(0, n4)) > n3) {
            if (bl2) {
                n3 = string2.offsetByCodePoints(0, n3);
                return Ft2.a(string2.substring(0, n3), "...");
            }
            return null;
        }
        return string2;
    }

    private static void zza(Bundle bundle, int n3, String string2, Object object) {
        if ((n3 = (int)(zzpn.zzb(bundle, n3) ? 1 : 0)) != 0) {
            n3 = 40;
            boolean bl2 = true;
            String string3 = zzpn.zza(string2, n3, bl2);
            string2 = "_ev";
            bundle.putString(string2, string3);
            if (object != null) {
                Preconditions.checkNotNull(bundle);
                n3 = object instanceof String;
                if (n3 != 0 || (n3 = object instanceof CharSequence) != 0) {
                    string3 = String.valueOf(object);
                    n3 = string3.length();
                    long l2 = n3;
                    object = "_el";
                    bundle.putLong((String)object, l2);
                }
            }
        }
    }

    public static void zza(zzlw zzlw2, Bundle bundle, boolean bl2) {
        boolean bl3;
        String string2 = "_si";
        String string3 = "_sn";
        String string4 = "_sc";
        if (bundle != null && zzlw2 != null && (!(bl3 = bundle.containsKey(string4)) || bl2)) {
            String string5 = zzlw2.zza;
            if (string5 != null) {
                bundle.putString(string3, string5);
            } else {
                bundle.remove(string3);
            }
            string5 = zzlw2.zzb;
            if (string5 != null) {
                bundle.putString(string4, string5);
            } else {
                bundle.remove(string4);
            }
            long l2 = zzlw2.zzc;
            bundle.putLong(string2, l2);
            return;
        }
        if (bundle != null && zzlw2 == null && bl2) {
            bundle.remove(string3);
            bundle.remove(string4);
            bundle.remove(string2);
        }
    }

    public static void zza(zzpp zzpp2, int n3, String string2, String string3, int n4) {
        zzpn.zza(zzpp2, null, n3, string2, string3, n4);
    }

    public static void zza(zzpp zzpp2, String string2, int n3, String string3, String string4, int n4) {
        int n7;
        Bundle bundle = new Bundle();
        zzpn.zzb(bundle, n3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string4))) {
            bundle.putString(string3, string4);
        }
        if (n3 == (n7 = 6) || n3 == (n7 = 7) || n3 == (n7 = 2)) {
            String string5 = "_el";
            long l2 = n4;
            bundle.putLong(string5, l2);
        }
        zzpp2.zza(string2, "_err", bundle);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(String string2, String string3, String string4, Bundle bundle, List list, boolean bl2) {
        float f5;
        int n3;
        boolean bl3;
        int n4;
        zzpn zzpn2 = this;
        String string5 = string3;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        zzpn zzpn3 = this.zze().zzs();
        int n7 = zzpn3.zza(n4 = 231100000, bl3 = true);
        if (n7 != 0) {
            n7 = 35;
            n3 = 35;
            f5 = 4.9E-44f;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        Object object = bundle.keySet();
        TreeSet treeSet = new TreeSet(object);
        Iterator iterator = treeSet.iterator();
        int n8 = 0;
        while (true) {
            String[] stringArray;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            float f6;
            int n10;
            float f7;
            int n14;
            block24: {
                block23: {
                    Object object6;
                    block22: {
                        Object e2;
                        if ((n7 = (int)(iterator.hasNext() ? 1 : 0)) == 0) {
                            return;
                        }
                        object6 = e2 = iterator.next();
                        object6 = (String)e2;
                        if (list2 != null && (n7 = (int)(list2.contains(object6) ? 1 : 0)) != 0) {
                            n7 = 0;
                            Object var11_15 = null;
                        } else {
                            if (!bl2) {
                                n7 = zzpn2.zzj((String)object6);
                            } else {
                                n7 = 0;
                                Object var11_16 = null;
                            }
                            if (n7 == 0) {
                                n7 = zzpn2.zzi((String)object6);
                            }
                        }
                        if (n7 == 0) break block22;
                        n14 = 3;
                        f7 = 4.2E-45f;
                        if (n7 == n14) {
                            object = object6;
                        } else {
                            n14 = 0;
                            f7 = 0.0f;
                            object = null;
                        }
                        zzpn.zza(bundle2, n7, object6, object);
                        bundle2.remove(object6);
                        n10 = n3;
                        f6 = f5;
                        break block23;
                    }
                    Object object7 = bundle2.get(object6);
                    n7 = (int)(zzpn.zza(object7) ? 1 : 0);
                    if (n7 != 0) {
                        zzgq zzgq2 = this.zzj().zzw();
                        object = "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name";
                        zzgq2.zza((String)object, string5, string4, object6);
                        n7 = 22;
                        object5 = object6;
                        n10 = n3;
                        f6 = f5;
                    } else {
                        object4 = bundle2.get(object6);
                        zzpn zzpn4 = this;
                        object = string2;
                        object3 = string3;
                        object2 = object6;
                        Bundle bundle3 = bundle;
                        object5 = object6;
                        n10 = n3;
                        f6 = f5;
                        n3 = 0;
                        f5 = 0.0f;
                        n7 = this.zza(string2, string3, (String)object6, object4, bundle, list, bl2, false);
                    }
                    if (n7 == 0 || (n14 = (int)(((String)(object = "_ev")).equals(object5) ? 1 : 0)) != 0) break block24;
                    object = bundle2.get(object5);
                    zzpn.zza(bundle2, n7, object5, object);
                    bundle2.remove(object5);
                }
                n3 = n10;
                f5 = f6;
                continue;
            }
            n7 = (int)(zzpn.zzg(object5) ? 1 : 0);
            if (n7 != 0 && (n7 = (int)(zzpn.zza(object5, stringArray = zzjo.zzd) ? 1 : 0)) == 0) {
                n7 = n8 + 1;
                n14 = (int)(zzpn2.zza(n4, bl3) ? 1 : 0);
                if (n14 == 0) {
                    object = this.zzj().zzm();
                    object3 = this.zzi().zza(string5);
                    object2 = this.zzi().zza(bundle2);
                    object4 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    ((zzgq)object).zza((String)object4, object3, object2);
                    zzpn.zzb(bundle2, 23);
                    bundle2.remove(object5);
                    n14 = n10;
                    f7 = f6;
                } else {
                    n14 = n10;
                    f7 = f6;
                    if (n7 > n10) {
                        object3 = this.zzj().zzm();
                        object2 = Gj0.b(n10, "Item can't contain more than ", " item-scoped custom params");
                        object4 = this.zzi().zza(string5);
                        String string6 = this.zzi().zza(bundle2);
                        ((zzgq)object3).zza((String)object2, object4, string6);
                        int n15 = 28;
                        zzpn.zzb(bundle2, n15);
                        bundle2.remove(object5);
                    }
                }
                n8 = n7;
            } else {
                n14 = n10;
                f7 = f6;
            }
            n3 = n14;
            f5 = f7;
        }
    }

    public static boolean zza(Context context) {
        block8: {
            String string2;
            PackageManager packageManager;
            Preconditions.checkNotNull(context);
            try {
                packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return false;
                }
                string2 = "com.google.android.gms.measurement.AppMeasurementReceiver";
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            ComponentName componentName = new ComponentName(context, string2);
            context = packageManager.getReceiverInfo(componentName, 0);
            if (context == null) break block8;
            boolean bl2 = context.enabled;
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    public static boolean zza(Context context, boolean n3) {
        Preconditions.checkNotNull(context);
        n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return zzpn.zzb(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzpn.zzb(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zza(Intent object) {
        boolean bl2;
        String string2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com";
        boolean bl3 = string2.equals(object = object.getStringExtra("android.intent.extra.REFERRER_NAME"));
        return bl3 || (bl3 = (string2 = "https://www.google.com").equals(object)) || (bl2 = (string2 = "android-app://com.google.appcrawler").equals(object));
        {
        }
    }

    public static boolean zza(Bundle bundle, int n3) {
        int n4;
        int n7 = bundle.size();
        int n8 = 0;
        if (n7 <= n3) {
            return false;
        }
        Object object = bundle.keySet();
        Object object2 = new TreeSet(object);
        object2 = ((TreeSet)object2).iterator();
        while (true) {
            boolean bl2 = object2.hasNext();
            n4 = 1;
            if (!bl2) break;
            object = (String)object2.next();
            if ((n8 += n4) <= n3) continue;
            bundle.remove((String)object);
        }
        return n4 != 0;
    }

    public static boolean zza(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Parcelable[];
        return bl3 || (bl3 = object instanceof ArrayList) || (bl2 = object instanceof Bundle);
        {
        }
    }

    public static boolean zza(String string2, String string3, String string4, String string5) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        boolean bl4 = true;
        if (!bl2 && !bl3) {
            Preconditions.checkNotNull(string2);
            boolean bl5 = string2.equals(string3);
            if (!bl5) {
                return bl4;
            }
            return false;
        }
        if (bl2 && bl3) {
            boolean bl6 = TextUtils.isEmpty((CharSequence)string4);
            if (!bl6 && !(bl6 = TextUtils.isEmpty((CharSequence)string5))) {
                bl6 = string4.equals(string5);
                if (!bl6) {
                    return bl4;
                }
                return false;
            }
            bl6 = TextUtils.isEmpty((CharSequence)string5);
            if (!bl6) {
                return bl4;
            }
            return false;
        }
        if (!bl2 && bl3) {
            boolean bl7 = TextUtils.isEmpty((CharSequence)string5);
            if (bl7) {
                return false;
            }
            bl7 = TextUtils.isEmpty((CharSequence)string4);
            if (!bl7 && (bl7 = string4.equals(string5))) {
                return false;
            }
            return bl4;
        }
        boolean bl8 = TextUtils.isEmpty((CharSequence)string4);
        if (!bl8 && (bl8 = string4.equals(string5))) {
            return false;
        }
        return bl4;
    }

    private static boolean zza(String string2, String[] stringArray) {
        Preconditions.checkNotNull(stringArray);
        for (String string3 : stringArray) {
            boolean bl2 = Objects.equals(string2, string3);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static byte[] zza(Parcelable object) {
        if (object == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        try {
            object.writeToParcel(parcel, 0);
            object = parcel.marshall();
            return object;
        }
        finally {
            parcel.recycle();
        }
    }

    public static ArrayList zzb(List object) {
        if (object == null) {
            object = new ArrayList(0);
            return object;
        }
        int n3 = object.size();
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2;
            AbstractSafeParcelable abstractSafeParcelable = (zzag)object.next();
            Bundle bundle = new Bundle();
            Object object2 = ((zzag)abstractSafeParcelable).zza;
            bundle.putString("app_id", (String)object2);
            String string3 = ((zzag)abstractSafeParcelable).zzb;
            bundle.putString("origin", string3);
            long l2 = ((zzag)abstractSafeParcelable).zzd;
            bundle.putLong("creation_timestamp", l2);
            object2 = ((zzag)abstractSafeParcelable).zzc.zza;
            string3 = "name";
            bundle.putString(string3, (String)object2);
            object2 = Preconditions.checkNotNull(((zzag)abstractSafeParcelable).zzc.zza());
            zzjk.zza(bundle, object2);
            boolean bl2 = ((zzag)abstractSafeParcelable).zze;
            bundle.putBoolean("active", bl2);
            object2 = ((zzag)abstractSafeParcelable).zzf;
            if (object2 != null) {
                string3 = "trigger_event_name";
                bundle.putString(string3, (String)object2);
            }
            if ((object2 = ((zzag)abstractSafeParcelable).zzg) != null) {
                string3 = ((zzbl)object2).zza;
                string2 = "timed_out_event_name";
                bundle.putString(string2, string3);
                object2 = ((zzbl)object2).zzb;
                if (object2 != null) {
                    string3 = "timed_out_event_params";
                    object2 = ((zzbg)object2).zzb();
                    bundle.putBundle(string3, (Bundle)object2);
                }
            }
            l2 = ((zzag)abstractSafeParcelable).zzh;
            bundle.putLong("trigger_timeout", l2);
            object2 = ((zzag)abstractSafeParcelable).zzi;
            if (object2 != null) {
                string3 = ((zzbl)object2).zza;
                string2 = "triggered_event_name";
                bundle.putString(string2, string3);
                object2 = ((zzbl)object2).zzb;
                if (object2 != null) {
                    string3 = "triggered_event_params";
                    object2 = ((zzbg)object2).zzb();
                    bundle.putBundle(string3, (Bundle)object2);
                }
            }
            long l3 = ((zzag)abstractSafeParcelable).zzc.zzb;
            string2 = "triggered_timestamp";
            bundle.putLong(string2, l3);
            object2 = "time_to_live";
            l2 = ((zzag)abstractSafeParcelable).zzj;
            bundle.putLong((String)object2, l2);
            abstractSafeParcelable = ((zzag)abstractSafeParcelable).zzk;
            if (abstractSafeParcelable != null) {
                object2 = ((zzbl)abstractSafeParcelable).zza;
                string3 = "expired_event_name";
                bundle.putString(string3, (String)object2);
                abstractSafeParcelable = ((zzbl)abstractSafeParcelable).zzb;
                if (abstractSafeParcelable != null) {
                    object2 = "expired_event_params";
                    abstractSafeParcelable = ((zzbg)abstractSafeParcelable).zzb();
                    bundle.putBundle((String)object2, (Bundle)abstractSafeParcelable);
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean zzb(Context context, String string2) {
        block8: {
            PackageManager packageManager;
            block7: {
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) break block7;
                    return false;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
            ComponentName componentName = new ComponentName(context, string2);
            context = packageManager.getServiceInfo(componentName, 0);
            if (context == null) break block8;
            boolean bl2 = context.enabled;
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzb(Bundle bundle, int n3) {
        long l2;
        if (bundle == null) {
            return false;
        }
        String string2 = "_err";
        long l3 = bundle.getLong(string2);
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l3 = n3;
            bundle.putLong(string2, l3);
            return true;
        }
        return false;
    }

    public static Bundle[] zzb(Object object) {
        int n3 = object instanceof Bundle;
        if (n3 != 0) {
            object = (Bundle)object;
            Bundle[] bundleArray = new Bundle[]{object};
            return bundleArray;
        }
        n3 = object instanceof Parcelable[];
        if (n3 != 0) {
            object = (Parcelable[])object;
            n3 = ((Parcelable[])object).length;
            return (Bundle[])Arrays.copyOf(object, n3, Bundle[].class);
        }
        n3 = object instanceof ArrayList;
        if (n3 != 0) {
            object = (ArrayList)object;
            Bundle[] bundleArray = new Bundle[((ArrayList)object).size()];
            return ((ArrayList)object).toArray(bundleArray);
        }
        return null;
    }

    public static int zzc() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4 && (n3 = C3.a()) > (n4 = 3)) {
            return g4.a();
        }
        return 0;
    }

    private final boolean zzc(Context object, String object2) {
        block15: {
            CertificateException certificateException2;
            Object object3;
            block17: {
                Object object4 = "CN=Android Debug,O=Android,C=US";
                object3 = new X500Principal((String)object4);
                object = Wrappers.packageManager((Context)object);
                int n3 = 64;
                object = ((PackageManagerWrapper)object).getPackageInfo((String)object2, n3);
                if (object == null) break block15;
                object = ((PackageInfo)object).signatures;
                if (object == null) break block15;
                int n4 = ((Object)object).length;
                if (n4 <= 0) break block15;
                n4 = 0;
                object2 = null;
                object = object[0];
                object2 = "X.509";
                object2 = CertificateFactory.getInstance((String)object2);
                object = object.toByteArray();
                object4 = new ByteArrayInputStream((byte[])object);
                object = ((CertificateFactory)object2).generateCertificate((InputStream)object4);
                object = (X509Certificate)object;
                object = ((X509Certificate)object).getSubjectX500Principal();
                try {
                    return ((X500Principal)object).equals(object3);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                }
                catch (CertificateException certificateException2) {
                    break block17;
                }
                object2 = this.zzj().zzg();
                object3 = "Package name not found";
                ((zzgq)object2).zza((String)object3, (Object)nameNotFoundException);
                break block15;
            }
            object2 = this.zzj().zzg();
            object3 = "Error obtaining certificate";
            ((zzgq)object2).zza((String)object3, certificateException2);
        }
        return true;
    }

    public static boolean zzd(String string2) {
        boolean bl2;
        String string3;
        Object object = (String)zzbn.zzbl.zza(null);
        boolean bl3 = ((String)object).equals(string3 = "*");
        return bl3 || (bl2 = (object = Arrays.asList(((String)object).split(string3 = ","))).contains(string2));
        {
        }
    }

    public static boolean zzf(String string2) {
        String string3;
        boolean bl2;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        return !bl3 && (bl2 = string2.startsWith(string3 = "_"));
    }

    public static boolean zzg(String string2) {
        String string3;
        boolean bl2;
        Preconditions.checkNotEmpty(string2);
        char c2 = string2.charAt(0);
        char c3 = '_';
        return c2 != c3 || (bl2 = string2.equals(string3 = "_ep"));
        {
        }
    }

    public static boolean zzh(String string2) {
        for (String string3 : zzb) {
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return false;
        }
        return true;
    }

    private final int zzi(String string2) {
        String string3 = "event param";
        int n3 = this.zzb(string3, string2);
        int n4 = 3;
        if (n3 == 0) {
            return n4;
        }
        n3 = this.zza(string3, null, string2);
        if (n3 == 0) {
            return 14;
        }
        n3 = 40;
        boolean bl2 = this.zza(string3, n3, string2);
        if (!bl2) {
            return n4;
        }
        return 0;
    }

    private final int zzj(String string2) {
        String string3 = "event param";
        int n3 = this.zzc(string3, string2);
        int n4 = 3;
        if (n3 == 0) {
            return n4;
        }
        n3 = this.zza(string3, null, string2);
        if (n3 == 0) {
            return 14;
        }
        n3 = 40;
        boolean bl2 = this.zza(string3, n3, string2);
        if (!bl2) {
            return n4;
        }
        return 0;
    }

    private static int zzk(String string2) {
        String string3 = "_ldl";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            return 2048;
        }
        string3 = "_id";
        bl2 = string3.equals(string2);
        if (bl2) {
            return 256;
        }
        string3 = "_lgclid";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            return 100;
        }
        return 36;
    }

    private static boolean zzl(String string2) {
        Preconditions.checkNotNull(string2);
        return string2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest zzr() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 2); ++i3) {
            Object object = "MD5";
            try {
                object = MessageDigest.getInstance((String)object);
                if (object == null) continue;
                return object;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzz() {
        block15: {
            block16: {
                block14: {
                    block13: {
                        var1_1 = this.zzg;
                        if (var1_1 != null) break block15;
                        var1_1 = this.zzp();
                        var2_2 = false;
                        var3_3 = null;
                        if (var1_1 == null) {
                            return false;
                        }
                        var1_1 = var1_1.b();
                        var4_12 = 0;
                        var5_13 = null;
                        try {
                            var6_14 /* !! */  = TimeUnit.MILLISECONDS;
                            var7_15 = 10000L;
                            var1_1 = var1_1.get(var7_15, var6_14 /* !! */ );
                            var1_1 = (Integer)var1_1;
                            if (var1_1 == null) break block13;
                        }
                        catch (TimeoutException var3_8) {
                            break block14;
                        }
                        catch (InterruptedException var3_9) {
                            break block14;
                        }
                        catch (ExecutionException var3_10) {
                            break block14;
                        }
                        catch (CancellationException var3_11) {
                            // empty catch block
                            break block14;
                        }
                        try {
                            var4_12 = var1_1.intValue();
                            var9_16 = 1;
                            if (var4_12 == var9_16) {
                                var2_2 = true;
                            }
                        }
                        catch (TimeoutException var3_4) lbl-1000:
                        // 4 sources

                        {
                            while (true) {
                                var5_13 = var1_1;
                                break block14;
                                break;
                            }
                        }
                        catch (InterruptedException var3_5) {
                            ** GOTO lbl-1000
                        }
                        catch (ExecutionException var3_6) {
                            ** GOTO lbl-1000
                        }
                        catch (CancellationException var3_7) {
                            ** continue;
                        }
                    }
                    var3_3 = var2_2;
                    this.zzg = var3_3;
                    break block16;
                }
                var1_1 = this.zzj().zzr();
                var6_14 /* !! */  = "Measurement manager api exception";
                var1_1.zza((String)var6_14 /* !! */ , var3_3);
                this.zzg = var1_1 = Boolean.FALSE;
                var1_1 = var5_13;
            }
            var3_3 = this.zzj().zzq();
            var5_13 = "Measurement manager api status result";
            var3_3.zza((String)var5_13, var1_1);
        }
        return this.zzg;
    }

    public final int zza(int n3) {
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        Context context = this.zza();
        return googleApiAvailabilityLight.isGooglePlayServicesAvailable(context, 12451000);
    }

    public final int zza(String string2) {
        String string3 = "event";
        int n3 = this.zzb(string3, string2);
        int n4 = 2;
        if (n3 == 0) {
            return n4;
        }
        String[] stringArray = zzjp.zza;
        String[] stringArray2 = zzjp.zzb;
        n3 = this.zza(string3, stringArray, stringArray2, string2);
        if (n3 == 0) {
            return 13;
        }
        n3 = 40;
        boolean bl2 = this.zza(string3, n3, string2);
        if (!bl2) {
            return n4;
        }
        return 0;
    }

    public final int zza(String string2, Object object) {
        boolean bl2;
        String string3 = "_ldl";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            string3 = "user property referrer";
            int n3 = zzpn.zzk(string2);
            bl2 = this.zza(string3, string2, n3, object);
        } else {
            string3 = "user property";
            int n4 = zzpn.zzk(string2);
            bl2 = this.zza(string3, string2, n4, object);
        }
        if (bl2) {
            return 0;
        }
        return 7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zza(Context object, String object2) {
        PackageManager.NameNotFoundException nameNotFoundException2;
        long l2;
        Object object3;
        block4: {
            this.zzv();
            Preconditions.checkNotNull(object);
            Preconditions.checkNotEmpty((String)object2);
            object3 = object.getPackageManager();
            MessageDigest messageDigest = zzpn.zzr();
            long l3 = -1;
            if (messageDigest == null) {
                object = this.zzj().zzg();
                object2 = "Could not get MD5 instance";
                object.zza((String)object2);
                return l3;
            }
            l2 = 0L;
            if (object3 == null) return l2;
            try {
                int n3 = this.zzc((Context)object, (String)object2);
                if (n3 != 0) return l2;
                object = Wrappers.packageManager(object);
                object2 = this.zza();
                object2 = object2.getPackageName();
                int n4 = 64;
                object = object.getPackageInfo((String)object2, n4);
                object = object.signatures;
                if (object != null && (n3 = ((Object)object).length) > 0) {
                    n3 = 0;
                    object2 = null;
                    object = object[0];
                    object = object.toByteArray();
                    object = messageDigest.digest((byte[])object);
                    return zzpn.zza((byte[])object);
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                break block4;
            }
            object = this.zzj();
            object = object.zzr();
            object2 = "Could not get signatures";
            object.zza((String)object2);
            return l3;
        }
        object2 = this.zzj().zzg();
        object3 = "Package name not found";
        ((zzgq)object2).zza((String)object3, (Object)nameNotFoundException2);
        return l2;
    }

    public final Bundle zza(Uri uri) {
        UnsupportedOperationException unsupportedOperationException2;
        block34: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            String string13;
            String string14;
            String string15;
            String string16;
            boolean bl5;
            Bundle bundle;
            Object object;
            block33: {
                block32: {
                    object = uri;
                    bundle = null;
                    if (uri == null) {
                        return null;
                    }
                    try {
                        bl5 = uri.isHierarchical();
                        string16 = "sfmc_id";
                        string15 = "srsltid";
                        string14 = "dclid";
                        string13 = "gbraid";
                        string12 = "gclid";
                        if (!bl5) break block32;
                        string11 = "utm_campaign";
                    }
                    catch (UnsupportedOperationException unsupportedOperationException2) {}
                    string11 = uri.getQueryParameter(string11);
                    string10 = "utm_source";
                    string10 = uri.getQueryParameter(string10);
                    string9 = "utm_medium";
                    string9 = uri.getQueryParameter(string9);
                    string8 = uri.getQueryParameter(string12);
                    string7 = uri.getQueryParameter(string13);
                    string6 = "utm_id";
                    string6 = uri.getQueryParameter(string6);
                    string5 = uri.getQueryParameter(string14);
                    string4 = uri.getQueryParameter(string15);
                    string3 = uri.getQueryParameter(string16);
                    break block33;
                    break block34;
                }
                bl5 = false;
                string11 = null;
                string10 = null;
                string9 = null;
                string8 = null;
                string7 = null;
                string6 = null;
                string5 = null;
                string4 = null;
                string3 = null;
            }
            boolean bl6 = TextUtils.isEmpty((CharSequence)string11);
            if (bl6 && (bl6 = TextUtils.isEmpty((CharSequence)string10)) && (bl6 = TextUtils.isEmpty((CharSequence)string9)) && (bl6 = TextUtils.isEmpty((CharSequence)string8)) && (bl6 = TextUtils.isEmpty((CharSequence)string7)) && (bl6 = TextUtils.isEmpty((CharSequence)string6)) && (bl6 = TextUtils.isEmpty((CharSequence)string5)) && (bl6 = TextUtils.isEmpty((CharSequence)string4)) && (bl6 = TextUtils.isEmpty((CharSequence)string3))) {
                return null;
            }
            bundle = new Bundle();
            bl6 = TextUtils.isEmpty((CharSequence)string11);
            if (!bl6) {
                string2 = string16;
                string16 = "campaign";
                bundle.putString(string16, string11);
            } else {
                string2 = string16;
            }
            bl5 = TextUtils.isEmpty((CharSequence)string10);
            if (!bl5) {
                string11 = "source";
                bundle.putString(string11, string10);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string9))) {
                string11 = "medium";
                bundle.putString(string11, string9);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string8))) {
                bundle.putString(string12, string8);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string7))) {
                bundle.putString(string13, string7);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(string16 = object.getQueryParameter(string11 = "gad_source"))))) {
                bundle.putString(string11, string16);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(string11 = object.getQueryParameter("utm_term"))))) {
                string16 = "term";
                bundle.putString(string16, string11);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(string11 = object.getQueryParameter("utm_content"))))) {
                string16 = "content";
                bundle.putString(string16, string11);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(string16 = object.getQueryParameter(string11 = "aclid"))))) {
                bundle.putString(string11, string16);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(string16 = object.getQueryParameter(string11 = "cp1"))))) {
                bundle.putString(string11, string16);
            }
            if (!(bl4 = TextUtils.isEmpty((CharSequence)(string16 = object.getQueryParameter(string11 = "anid"))))) {
                bundle.putString(string11, string16);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string6))) {
                string11 = "campaign_id";
                bundle.putString(string11, string6);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)string5))) {
                bundle.putString(string14, string5);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(string11 = object.getQueryParameter("utm_source_platform"))))) {
                string16 = "source_platform";
                bundle.putString(string16, string11);
            }
            if (!(bl3 = TextUtils.isEmpty((CharSequence)(string11 = object.getQueryParameter("utm_creative_format"))))) {
                string16 = "creative_format";
                bundle.putString(string16, string11);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter(string11 = "utm_marketing_tactic"))))) {
                string11 = "marketing_tactic";
                bundle.putString(string11, (String)object);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)string4))) {
                bundle.putString(string15, string4);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                object = string2;
                bundle.putString(string2, string3);
            }
            return bundle;
        }
        this.zzj().zzr().zza("Install referrer url isn't a hierarchical URI", unsupportedOperationException2);
        return null;
    }

    public final Bundle zza(Bundle bundle, String string2) {
        string2 = new Bundle();
        if (bundle != null) {
            boolean bl2;
            Iterator iterator = bundle.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                String string3 = (String)iterator.next();
                Object object = bundle.get(string3);
                if ((object = this.zzb(string3, object)) == null) {
                    object = this.zzj().zzw();
                    string3 = this.zzi().zzb(string3);
                    String string4 = "Param value can't be null";
                    ((zzgq)object).zza(string4, string3);
                    continue;
                }
                this.zza((Bundle)string2, string3, object);
            }
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bundle zza(String var1_1, String var2_2, Bundle var3_3, List var4_4, boolean var5_5) {
        block19: {
            block14: {
                var6_6 = this;
                var7_7 = var2_2;
                var8_8 = var3_3;
                var9_9 = var4_4;
                var10_10 /* !! */  = zzjp.zzd;
                var11_11 = zzpn.zza(var2_2, var10_10 /* !! */ );
                if (var3_3 == null) break block14;
                var12_12 = new Bundle(var3_3);
                var13_13 = this.zze().zzc();
                var14_14 = var3_3.keySet();
                var10_10 /* !! */  = new TreeSet(var14_14);
                var15_15 = var10_10 /* !! */ .iterator();
                var16_16 = 0;
                block0: while ((var17_17 = var15_15.hasNext()) != 0) {
                    block18: {
                        block16: {
                            block17: {
                                block15: {
                                    var18_18 /* !! */  = var10_10 /* !! */  = var15_15.next();
                                    var18_18 /* !! */  = (String)var10_10 /* !! */ ;
                                    if (var9_9 != null && (var17_17 = var9_9.contains(var18_18 /* !! */ )) != 0) {
                                        var17_17 = 0;
                                        var10_10 /* !! */  = null;
                                    } else {
                                        if (!var5_5) {
                                            var17_17 = var6_6.zzj((String)var18_18 /* !! */ );
                                        } else {
                                            var17_17 = 0;
                                            var10_10 /* !! */  = null;
                                        }
                                        if (var17_17 == 0) {
                                            var17_17 = var6_6.zzi((String)var18_18 /* !! */ );
                                        }
                                    }
                                    if (var17_17 == 0) break block15;
                                    var19_19 = 3;
                                    if (var17_17 == var19_19) {
                                        var14_14 = var18_18 /* !! */ ;
                                    } else {
                                        var19_19 = 0;
                                        var14_14 = null;
                                    }
                                    zzpn.zza((Bundle)var12_12, var17_17, (String)var18_18 /* !! */ , var14_14);
                                    var12_12.remove((String)var18_18 /* !! */ );
                                    var20_20 = var13_13;
                                    break block16;
                                }
                                var21_21 = var8_8.get((String)var18_18 /* !! */ );
                                var10_10 /* !! */  = this;
                                var14_14 = var1_1;
                                var22_22 = var2_2;
                                var23_23 /* !! */  = var18_18 /* !! */ ;
                                var24_24 /* !! */  = var18_18 /* !! */ ;
                                var20_20 = var13_13;
                                var13_13 = (int)var11_11;
                                var17_17 = this.zza(var1_1, var2_2, (String)var18_18 /* !! */ , var21_21, (Bundle)var12_12, var4_4, var5_5, var11_11);
                                if (var17_17 != (var19_19 = 17)) break block17;
                                var14_14 = Boolean.FALSE;
                                zzpn.zza((Bundle)var12_12, var17_17, (String)var18_18 /* !! */ , var14_14);
                                break block18;
                            }
                            if (var17_17 == 0 || (var19_19 = (int)(var14_14 = "_ev").equals(var18_18 /* !! */ )) != 0) break block18;
                            var19_19 = 21;
                            if (var17_17 == var19_19) {
                                var18_18 /* !! */  = var7_7;
                            }
                            var14_14 = var8_8.get((String)var24_24 /* !! */ );
                            zzpn.zza((Bundle)var12_12, var17_17, (String)var18_18 /* !! */ , var14_14);
                            var12_12.remove((String)var24_24 /* !! */ );
                        }
lbl62:
                        // 3 sources

                        while (true) {
                            var13_13 = var20_20;
                            var6_6 = this;
                            continue block0;
                            break;
                        }
                    }
                    if ((var17_17 = (int)zzpn.zzg((String)var24_24 /* !! */ )) == 0) ** GOTO lbl62
                    var17_17 = var16_16 + 1;
                    if (var17_17 > var20_20) {
                        var14_14 = Gj0.b(var20_20, "Event can't contain more than ", " params");
                        var22_22 = this.zzj().zzm();
                        var23_23 /* !! */  = this.zzi().zza(var7_7);
                        var21_21 = this.zzi().zza(var8_8);
                        var22_22.zza((String)var14_14, var23_23 /* !! */ , var21_21);
                        var19_19 = 5;
                        zzpn.zzb((Bundle)var12_12, var19_19);
                        var12_12.remove((String)var24_24 /* !! */ );
                    }
                    var16_16 = var17_17;
                    ** continue;
                }
                var24_24 /* !! */  = var12_12;
                break block19;
            }
            var24_24 /* !! */  = null;
        }
        return var24_24 /* !! */ ;
    }

    public final zzbl zza(String object, String string2, Bundle object2, String string3, long l2, boolean bl2, boolean bl3) {
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (bl4) {
            return null;
        }
        int n3 = this.zza(string2);
        if (n3 == 0) {
            Bundle bundle = object2 != null ? new Bundle((Bundle)object2) : new Bundle();
            object2 = "_o";
            bundle.putString((String)object2, string3);
            List list = CollectionUtils.listOf(object2);
            boolean bl5 = true;
            Object object3 = string2;
            object2 = this.zza((String)object, string2, bundle, list, bl5);
            if (bl2) {
                object2 = this.zza((Bundle)object2, (String)object);
            }
            Preconditions.checkNotNull(object2);
            object3 = new zzbg((Bundle)object2);
            object = new zzbl(string2, (zzbg)object3, string3, l2);
            return object;
        }
        object = this.zzj().zzg();
        string2 = this.zzi().zzc(string2);
        ((zzgq)object).zza("Invalid conditional property event name", string2);
        object = new IllegalArgumentException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final URL zza(long l2, String string2, String string3, long l3, String string4) {
        String string5;
        block5: {
            char c2;
            char c3;
            Object object;
            String string6;
            block4: {
                String string7 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=";
                String string8 = "v";
                try {
                    Preconditions.checkNotEmpty(string3);
                    Preconditions.checkNotEmpty(string2);
                    int n3 = this.zzg();
                    StringBuilder stringBuilder = new StringBuilder(string8);
                    stringBuilder.append(l2);
                    string6 = ".";
                    stringBuilder.append(string6);
                    stringBuilder.append(n3);
                    string6 = stringBuilder.toString();
                    object = new StringBuilder(string7);
                    ((StringBuilder)object).append(string6);
                    string6 = "&rdid=";
                    ((StringBuilder)object).append(string6);
                    ((StringBuilder)object).append(string3);
                    string6 = "&bundleid=";
                    ((StringBuilder)object).append(string6);
                    ((StringBuilder)object).append(string2);
                    string6 = "&retry=";
                    ((StringBuilder)object).append(string6);
                    ((StringBuilder)object).append(l3);
                    string6 = ((StringBuilder)object).toString();
                    object = this.zze();
                    object = ((zzai)object).zzq();
                    c3 = string2.equals(object);
                    if (c3 == '\u0000') break block4;
                    object = "&ddl_test=1";
                    string6 = string6.concat((String)object);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block5;
                }
                catch (MalformedURLException malformedURLException) {
                    break block5;
                }
            }
            if ((c3 = string4.isEmpty()) != '\u0000') return new URL(string6);
            c3 = '\u0000';
            object = null;
            c3 = string4.charAt(0);
            if (c3 != (c2 = '&')) {
                object = "&";
                string6 = string6.concat((String)object);
            }
            string6 = string6.concat(string4);
            return new URL(string6);
        }
        zzgq zzgq2 = this.zzj().zzg();
        string5 = ((Throwable)((Object)string5)).getMessage();
        zzgq2.zza("Failed to create BOW URL for Deferred Deep Link. exception", string5);
        return null;
    }

    public final void zza(Bundle bundle, long l2) {
        long l3;
        String string2 = "_et";
        long l4 = bundle.getLong(string2);
        long l7 = l4 - (l3 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            zzgq zzgq2 = this.zzj().zzr();
            Long l8 = l4;
            String string3 = "Params already contained engagement";
            zzgq2.zza(string3, l8);
        }
        bundle.putLong(string2, l2 += l4);
    }

    public final void zza(Bundle bundle, Bundle bundle2) {
        boolean bl2;
        if (bundle2 == null) {
            return;
        }
        Iterator iterator = bundle2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            boolean bl3 = bundle.containsKey(string2);
            if (bl3) continue;
            zzpn zzpn2 = this.zzs();
            Object object = bundle2.get(string2);
            zzpn2.zza(bundle, string2, object);
        }
    }

    public final void zza(Bundle object, String string2, Object object2) {
        if (object == null) {
            return;
        }
        boolean bl2 = object2 instanceof Long;
        if (bl2) {
            long l2 = (Long)object2;
            object.putLong(string2, l2);
            return;
        }
        bl2 = object2 instanceof String;
        if (bl2) {
            object2 = String.valueOf(object2);
            object.putString(string2, (String)object2);
            return;
        }
        bl2 = object2 instanceof Double;
        if (bl2) {
            double d2 = (Double)object2;
            object.putDouble(string2, d2);
            return;
        }
        bl2 = object2 instanceof Bundle[];
        if (bl2) {
            object2 = (Bundle[])object2;
            object.putParcelableArray(string2, (Parcelable[])object2);
            return;
        }
        if (string2 != null) {
            object = object2 != null ? object2.getClass().getSimpleName() : null;
            object2 = this.zzj().zzw();
            string2 = this.zzi().zzb(string2);
            String string3 = "Not putting event parameter. Invalid value type. name, type";
            ((zzgq)object2).zza(string3, string2, object);
        }
    }

    public final void zza(zzdq zzdq2, int n3) {
        String string2 = "r";
        Bundle bundle = dk0.a(n3, string2);
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning int value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, long l2) {
        Bundle bundle = new Bundle();
        String string2 = "r";
        bundle.putLong(string2, l2);
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning long value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, Bundle bundle) {
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, String string2) {
        String string3 = "r";
        string2 = E1.a(string3, string2);
        try {
            zzdq2.zza((Bundle)string2);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning string value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        String string2 = "r";
        bundle.putParcelableArrayList(string2, arrayList);
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning bundle list to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, boolean bl2) {
        Bundle bundle = new Bundle();
        String string2 = "r";
        bundle.putBoolean(string2, bl2);
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning boolean value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzdq zzdq2, byte[] byArray) {
        Bundle bundle = new Bundle();
        String string2 = "r";
        bundle.putByteArray(string2, byArray);
        try {
            zzdq2.zza(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.zzu.zzj().zzr().zza("Error returning byte array to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void zza(zzgs zzgs2, int n3) {
        boolean bl2;
        Set set = zzgs2.zzc.keySet();
        Object object = new TreeSet(set);
        object = ((TreeSet)object).iterator();
        int n4 = 0;
        set = null;
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            boolean bl3 = zzpn.zzg(string2);
            if (!bl3 || ++n4 <= n3) continue;
            String string3 = Gj0.b(n3, "Event can't contain more than ", " params");
            zzgq zzgq2 = this.zzj().zzm();
            Object object2 = this.zzi();
            Object object3 = zzgs2.zza;
            object2 = ((zzgl)object2).zza((String)object3);
            object3 = this.zzi();
            Bundle bundle = zzgs2.zzc;
            object3 = ((zzgl)object3).zza(bundle);
            zzgq2.zza(string3, object2, object3);
            string3 = zzgs2.zzc;
            int n7 = 5;
            zzpn.zzb((Bundle)string3, n7);
            string3 = zzgs2.zzc;
            string3.remove(string2);
        }
    }

    public final void zza(Parcelable[] parcelableArray, int n3) {
        Preconditions.checkNotNull(parcelableArray);
        int n4 = parcelableArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            boolean bl2;
            Bundle bundle = (Bundle)parcelableArray[i3];
            Set set = bundle.keySet();
            Object object = new TreeSet(set);
            object = ((TreeSet)object).iterator();
            int n7 = 0;
            set = null;
            while (bl2 = object.hasNext()) {
                Object object2;
                String string2 = (String)object.next();
                int n8 = zzpn.zzg(string2);
                if (n8 == 0 || (n8 = zzpn.zza(string2, (String[])(object2 = zzjo.zzd))) != 0 || ++n7 <= n3) continue;
                object2 = this.zzj().zzm();
                String string3 = Gj0.b(n3, "Param can't contain more than ", " item-scoped custom parameters");
                String string4 = this.zzi().zzb(string2);
                String string5 = this.zzi().zza(bundle);
                ((zzgq)object2).zza(string3, string4, string5);
                n8 = 28;
                zzpn.zzb(bundle, n8);
                bundle.remove(string2);
            }
        }
    }

    public final boolean zza(int n3, boolean bl2) {
        Boolean bl3 = this.zzu.zzt().zzad();
        int n4 = this.zzg();
        return n4 >= (n3 /= 1000) || bl3 != null && (n3 = (int)(bl3.booleanValue() ? 1 : 0)) == 0;
        {
        }
    }

    public final boolean zza(String string2, double d2) {
        String string3;
        Context context;
        try {
            context = this.zza();
            string3 = "google.analytics.deferred.deeplink.prefs";
        }
        catch (RuntimeException runtimeException) {
            this.zzj().zzg().zza("Failed to persist Deferred Deep Link. exception", runtimeException);
            return false;
        }
        context = context.getSharedPreferences(string3, 0);
        context = context.edit();
        string3 = "deeplink";
        context.putString(string3, string2);
        string2 = "timestamp";
        long l2 = Double.doubleToRawLongBits(d2);
        context.putLong(string2, l2);
        return context.commit();
    }

    public final boolean zza(String string2, int n3, String string3) {
        if (string3 == null) {
            this.zzj().zzm().zza("Name is required and can't be null. Type", string2);
            return false;
        }
        int n4 = string3.length();
        if ((n4 = string3.codePointCount(0, n4)) > n3) {
            zzgq zzgq2 = this.zzj().zzm();
            Integer n7 = n3;
            zzgq2.zza("Name is too long. Type, maximum supported length, name", string2, n7, string3);
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zza(String object, String object2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            boolean bl3 = zzpn.zzl((String)object);
            if (bl3) return true;
            object2 = this.zzu;
            bl3 = ((zzic)object2).zzag();
            if (!bl3) return false;
            object2 = this.zzj().zzm();
            String string2 = "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id";
            object = zzgo.zza((String)object);
            ((zzgq)object2).zza(string2, object);
            return false;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl4) {
            bl4 = zzpn.zzl((String)object2);
            if (bl4) return true;
            object = this.zzj().zzm();
            object2 = zzgo.zza((String)object2);
            ((zzgq)object).zza("Invalid admob_app_id. Analytics disabled.", object2);
            return false;
        }
        object = this.zzu;
        bl4 = ((zzic)object).zzag();
        if (!bl4) return false;
        object = this.zzj().zzm();
        object2 = "Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI";
        ((zzgq)object).zza((String)object2);
        return false;
    }

    public final boolean zza(String string2, String string3, int n3, Object object) {
        boolean bl2 = true;
        if (object == null) {
            return bl2;
        }
        int n4 = object instanceof Long;
        if (n4 == 0 && (n4 = object instanceof Float) == 0 && (n4 = object instanceof Integer) == 0 && (n4 = object instanceof Byte) == 0 && (n4 = object instanceof Short) == 0 && (n4 = object instanceof Boolean) == 0 && (n4 = object instanceof Double) == 0) {
            n4 = object instanceof String;
            if (n4 == 0 && (n4 = object instanceof Character) == 0 && (n4 = object instanceof CharSequence) == 0) {
                return false;
            }
            object = String.valueOf(object);
            n4 = ((String)object).length();
            if ((n4 = ((String)object).codePointCount(0, n4)) > n3) {
                zzgq zzgq2 = this.zzj().zzw();
                object = ((String)object).length();
                zzgq2.zza("Value is too long; discarded. Value kind, name, value length", string2, string3, object);
                return false;
            }
        }
        return bl2;
    }

    public final boolean zza(String string2, String[] stringArray, String string3) {
        return this.zza(string2, stringArray, null, string3);
    }

    public final boolean zza(String string2, String[] stringArray, String[] stringArray2, String string3) {
        boolean bl2;
        if (string3 == null) {
            this.zzj().zzm().zza("Name is required and can't be null. Type", string2);
            return false;
        }
        Preconditions.checkNotNull(string3);
        for (String string4 : zza) {
            boolean bl3 = string3.startsWith(string4);
            if (!bl3) continue;
            this.zzj().zzm().zza("Name starts with reserved prefix. Type, name", string2, string3);
            return false;
        }
        if (stringArray != null && (bl2 = zzpn.zza(string3, stringArray)) && (stringArray2 == null || !(bl2 = zzpn.zza(string3, stringArray2)))) {
            this.zzj().zzm().zza("Name is reserved. Type, name", string2, string3);
            return false;
        }
        return true;
    }

    public final void zzab() {
        long l2;
        long l3;
        this.zzv();
        Object object = new SecureRandom();
        long l4 = ((Random)object).nextLong();
        long l7 = 0L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false && (l3 = (l2 = (l4 = ((Random)object).nextLong()) - l7) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
            object = this.zzj().zzr();
            String string2 = "Utils falling back to Random for random id";
            ((zzgq)object).zza(string2);
        }
        this.zzd.set(l4);
    }

    public final int zzb(String string2) {
        String string3 = "user property";
        int n3 = this.zzb(string3, string2);
        int n4 = 6;
        if (n3 == 0) {
            return n4;
        }
        String[] stringArray = zzjr.zza;
        n3 = this.zza(string3, stringArray, string2);
        if (n3 == 0) {
            return 15;
        }
        n3 = 24;
        boolean bl2 = this.zza(string3, n3, string2);
        if (!bl2) {
            return n4;
        }
        return 0;
    }

    public final Object zzb(String object, Object object2) {
        Object object3 = "_ev";
        boolean bl2 = ((String)object3).equals(object);
        if (bl2) {
            int n3 = this.zze().zzb(null, false);
            return this.zza(n3, object2, true, true, null);
        }
        int n4 = zzpn.zzf((String)object);
        if (n4 != 0) {
            object = this.zze();
            n4 = ((zzai)object).zzb(null, false);
        } else {
            object = this.zze();
            n4 = ((zzai)object).zza(null, false);
        }
        object3 = this;
        return this.zza(n4, object2, false, true, null);
    }

    public final boolean zzb(String string2, String string3) {
        int n3;
        if (string3 == null) {
            this.zzj().zzm().zza("Name is required and can't be null. Type", string2);
            return false;
        }
        int n4 = string3.length();
        if (n4 == 0) {
            this.zzj().zzm().zza("Name is required and can't be empty. Type", string2);
            return false;
        }
        n4 = string3.codePointAt(0);
        int n7 = Character.isLetter(n4);
        int n8 = 95;
        if (n7 == 0 && n4 != n8) {
            this.zzj().zzm().zza("Name must start with a letter or _ (underscore). Type, name", string2, string3);
            return false;
        }
        n7 = string3.length();
        for (n4 = Character.charCount(n4); n4 < n7; n4 += n3) {
            boolean bl2;
            n3 = string3.codePointAt(n4);
            if (n3 != n8 && !(bl2 = Character.isLetterOrDigit(n3))) {
                this.zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", string2, string3);
                return false;
            }
            n3 = Character.charCount(n3);
        }
        return true;
    }

    public final long zzc(String string2) {
        int n3;
        block6: {
            PackageManager packageManager = this.zza().getPackageManager();
            if (packageManager == null) {
                return 0L;
            }
            n3 = 0;
            packageManager = null;
            Object object = this.zza();
            object = Wrappers.packageManager((Context)object);
            object = ((PackageManagerWrapper)object).getApplicationInfo(string2, 0);
            if (object == null) break block6;
            try {
                n3 = ((ApplicationInfo)object).targetSdkVersion;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = this.zzj().zzp();
                String string3 = "PackageManager failed to find running app: app_id";
                ((zzgq)object).zza(string3, string2);
            }
        }
        return n3;
    }

    public final Object zzc(String string2, Object object) {
        Object object2 = "_ldl";
        boolean bl2 = ((String)object2).equals(string2);
        if (bl2) {
            int n3 = zzpn.zzk(string2);
            return this.zza(n3, object, true, false, null);
        }
        int n4 = zzpn.zzk(string2);
        object2 = this;
        return this.zza(n4, object, false, false, null);
    }

    public final boolean zzc(String string2, String string3) {
        int n3;
        if (string3 == null) {
            this.zzj().zzm().zza("Name is required and can't be null. Type", string2);
            return false;
        }
        int n4 = string3.length();
        if (n4 == 0) {
            this.zzj().zzm().zza("Name is required and can't be empty. Type", string2);
            return false;
        }
        n4 = string3.codePointAt(0);
        int n7 = Character.isLetter(n4);
        if (n7 == 0) {
            this.zzj().zzm().zza("Name must start with a letter. Type, name", string2, string3);
            return false;
        }
        n7 = string3.length();
        for (n4 = Character.charCount(n4); n4 < n7; n4 += n3) {
            int n8;
            n3 = string3.codePointAt(n4);
            if (n3 != (n8 = 95) && (n8 = (int)(Character.isLetterOrDigit(n3) ? 1 : 0)) == 0) {
                this.zzj().zzm().zza("Name must consist of letters, digits or _ (underscores). Type, name", string2, string3);
                return false;
            }
            n3 = Character.charCount(n3);
        }
        return true;
    }

    public final boolean zzd(String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            return true;
        }
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        return this.zze().zzp().equals(string2);
    }

    public final boolean zze(String string2) {
        this.zzv();
        PackageManagerWrapper packageManagerWrapper = Wrappers.packageManager(this.zza());
        int n3 = packageManagerWrapper.checkCallingOrSelfPermission(string2);
        if (n3 == 0) {
            return true;
        }
        this.zzj().zzc().zza("Permission not granted", string2);
        return false;
    }

    public final int zzg() {
        Object object = this.zzh;
        if (object == null) {
            object = GoogleApiAvailabilityLight.getInstance();
            Context context = this.zza();
            int n3 = ((GoogleApiAvailabilityLight)object).getApkVersion(context) / 1000;
            this.zzh = object = Integer.valueOf(n3);
        }
        return this.zzh;
    }

    public final boolean zzh() {
        return true;
    }

    public final long zzm() {
        long l2;
        Integer n3;
        this.zzv();
        String string2 = this.zzu.zzh().zzaf();
        int n4 = zzpn.zzd(string2);
        long l3 = 0L;
        if (n4 == 0) {
            return l3;
        }
        n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        long l4 = n4 < n7 ? (long)4 : ((n4 = C3.a()) < (n7 = 4) ? (long)8 : ((n4 = zzpn.zzc()) < (n7 = (n3 = (Integer)zzbn.zzbf.zza(null)).intValue()) ? (long)16 : l3));
        string2 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION";
        n4 = (int)(this.zze(string2) ? 1 : 0);
        if (n4 == 0) {
            l2 = 2;
            l4 |= l2;
        }
        if ((n4 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1))) == 0 && (n4 = (int)(this.zzz() ? 1 : 0)) == 0) {
            l2 = 64;
            l4 |= l2;
        }
        if ((n4 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1))) == 0) {
            return 1L;
        }
        return l4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzo() {
        long l2;
        AtomicLong atomicLong = this.zzd;
        long l3 = atomicLong.get();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            atomicLong = this.zzd;
            synchronized (atomicLong) {
                int n3;
                l2 = System.nanoTime();
                Clock clock = this.zzb();
                long l7 = clock.currentTimeMillis();
                Random random = new Random(l2 ^= l7);
                long l8 = random.nextLong();
                this.zze = n3 = this.zze + 1;
                long l12 = n3;
                return l8 += l12;
            }
        }
        atomicLong = this.zzd;
        synchronized (atomicLong) {
            AtomicLong atomicLong2 = this.zzd;
            l2 = -1;
            long l14 = 1L;
            atomicLong2.compareAndSet(l2, l14);
            atomicLong2 = this.zzd;
            return atomicLong2.getAndIncrement();
        }
    }

    public final ml1_0 zzp() {
        ml1_0 ml1_02 = this.zzf;
        if (ml1_02 == null) {
            this.zzf = ml1_02 = ml1_0.a(this.zza());
        }
        return this.zzf;
    }

    public final String zzq() {
        Object[] objectArray = new byte[16];
        this.zzw().nextBytes((byte[])objectArray);
        Locale locale = Locale.US;
        int n3 = 1;
        BigInteger bigInteger = new BigInteger(n3, (byte[])objectArray);
        objectArray = new Object[n3];
        objectArray[0] = (byte)bigInteger;
        return String.format(locale, "%032x", objectArray);
    }

    public final SecureRandom zzw() {
        this.zzv();
        SecureRandom secureRandom = this.zzc;
        if (secureRandom == null) {
            this.zzc = secureRandom = new SecureRandom();
        }
        return this.zzc;
    }

    public final boolean zzx() {
        this.zzv();
        long l2 = this.zzm();
        long l3 = 1L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        return l4 == false;
    }

    public final boolean zzy() {
        Object object;
        try {
            object = this.zza();
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        object = object.getClassLoader();
        String string2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig";
        ((ClassLoader)object).loadClass(string2);
        return true;
    }
}

