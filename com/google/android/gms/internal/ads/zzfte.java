/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzfsl;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhcd;
import java.io.File;
import java.util.HashSet;

public final class zzfte {
    private static final Object zza;
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfsl zze;
    private boolean zzf = false;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzfte(Context context, zzazw object, zzfsl zzfsl2, boolean bl2) {
        this.zzb = context;
        this.zzd = object = Integer.toString(((zzazw)object).zza());
        context = context.getSharedPreferences("pcvmspf", 0);
        this.zzc = context;
        this.zze = zzfsl2;
        this.zzf = bl2;
    }

    private final File zze(String string2) {
        File file = this.zzb.getDir("pccache", 0);
        String string3 = this.zzd;
        File file2 = new File(file, string3);
        File file3 = new File(file2, string2);
        return file3;
    }

    private static String zzf(zzazz zzazz2) {
        zzbab zzbab2 = zzbac.zze();
        String string2 = zzazz2.zzd().zzk();
        zzbab2.zze(string2);
        string2 = zzazz2.zzd().zzj();
        zzbab2.zza(string2);
        long l2 = zzazz2.zzd().zza();
        zzbab2.zzb(l2);
        l2 = zzazz2.zzd().zzd();
        zzbab2.zzd(l2);
        l2 = zzazz2.zzd().zzc();
        zzbab2.zzc(l2);
        return Hex.bytesToStringLowercase(((zzbac)zzbab2.zzbn()).zzaV());
    }

    private final String zzg() {
        String string2 = String.valueOf(this.zzd);
        return "FBAMTD".concat(string2);
    }

    private final String zzh() {
        String string2 = String.valueOf(this.zzd);
        return "LATMTD".concat(string2);
    }

    private final void zzi(int n3, long l2) {
        this.zze.zza(n3, l2);
    }

    private final void zzj(int n3, long l2, String string2) {
        this.zze.zzb(n3, l2, string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzbac zzk(int n3) {
        void var3_7;
        Object object;
        int n4 = 1;
        if (n3 == n4) {
            SharedPreferences sharedPreferences2 = this.zzc;
            object = this.zzh();
            String string2 = sharedPreferences2.getString((String)object, null);
        } else {
            SharedPreferences sharedPreferences3 = this.zzc;
            object = this.zzg();
            String string3 = sharedPreferences3.getString((String)object, null);
        }
        if (var3_7 == null) {
            return null;
        }
        long l2 = System.currentTimeMillis();
        try {
            byte[] byArray = Hex.stringToBytes((String)var3_7);
            object = zzhac.zzb;
            n4 = byArray.length;
            zzhac zzhac2 = zzhac.zzv(byArray, 0, n4);
            n4 = (int)(this.zzf ? 1 : 0);
            if (n4 != 0) {
                object = zzhay.zza();
                return zzbac.zzi(zzhac2, (zzhay)object);
            }
            object = zzhay.zzb();
            return zzbac.zzi(zzhac2, (zzhay)object);
        }
        catch (RuntimeException runtimeException) {
            n3 = 2032;
            this.zzi(n3, l2);
            return null;
        }
        catch (NullPointerException nullPointerException) {
            n3 = 2029;
            this.zzi(n3, l2);
            return null;
        }
        catch (zzhcd zzhcd2) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza(zzazz object) {
        long l2 = System.currentTimeMillis();
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object3;
                Object object4;
                try {
                    object4 = ((zzazz)object).zzd();
                    object4 = ((zzbac)object4).zzk();
                    object4 = this.zze((String)object4);
                    String string2 = "pcbc";
                    object3 = new File((File)object4, string2);
                    object4 = ((zzazz)object).zze();
                    object4 = ((zzhac)object4).zzB();
                    n3 = zzfsy.zze((File)object3, (byte[])object4);
                    if (n3 == 0) {
                        int n4 = 4020;
                        this.zzi(n4, l2);
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = zzfte.zzf((zzazz)object);
                object4 = this.zzc;
                object4 = object4.edit();
                object3 = this.zzh();
                object4.putString((String)object3, (String)object);
                boolean bl2 = object4.commit();
                if (bl2) {
                    n3 = 5015;
                    this.zzi(n3, l2);
                } else {
                    n3 = 4021;
                    this.zzi(n3, l2);
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb(zzazz zzazz2, zzftd zzftd2) {
        zzfte zzfte2 = this;
        HashSet<File[]> hashSet = zzftd2;
        Object object = "d:";
        long l2 = System.currentTimeMillis();
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block20: {
                int n3;
                int n4;
                int n7;
                int n8;
                Object object3;
                Object object4;
                int n10 = 1;
                try {
                    object4 = this.zzk(n10);
                    object3 = zzazz2.zzd();
                    object3 = ((zzbac)object3).zzk();
                    n8 = 0;
                    if (object4 != null && (n7 = ((String)(object4 = ((zzbac)object4).zzk())).equals(object3)) != 0) {
                        int n14 = 4014;
                        this.zzi(n14, l2);
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block20;
                }
                long l3 = System.currentTimeMillis();
                object4 = zzfte2.zze((String)object3);
                int n15 = ((File)object4).exists();
                int n16 = 4015;
                if (n15) {
                    n15 = ((File)object4).isDirectory();
                    String string2 = "1";
                    String string3 = "0";
                    if (n10 != n15) {
                        string2 = string3;
                    }
                    n7 = ((File)object4).isFile();
                    String string4 = "1";
                    string3 = "0";
                    if (n10 != n7) {
                        string4 = string3;
                    }
                    object4 = new StringBuilder((String)object);
                    ((StringBuilder)object4).append(string2);
                    object = ",f:";
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(string4);
                    object = ((StringBuilder)object4).toString();
                    n7 = 4023;
                    zzfte2.zzj(n7, l3, (String)object);
                    zzfte2.zzi(n16, l3);
                } else {
                    n4 = ((File)object4).mkdirs();
                    if (n4 == 0) {
                        int n17 = ((File)object4).canWrite();
                        object = "1";
                        String string5 = "0";
                        if (n10 != n17) {
                            object = string5;
                        }
                        hashSet = "cw:";
                        hashSet = ((String)((Object)hashSet)).concat((String)object);
                        n4 = 4024;
                        zzfte2.zzj(n4, l3, (String)((Object)hashSet));
                        zzfte2.zzi(n16, l3);
                        return false;
                    }
                }
                object = zzfte2.zze((String)object3);
                object3 = "pcam.jar";
                object4 = new File((File)object, (String)object3);
                Object object5 = "pcbc";
                object3 = new File((File)object, (String)object5);
                object5 = zzazz2.zzf();
                object5 = ((zzhac)object5).zzB();
                boolean bl2 = zzfsy.zze((File)object4, (byte[])object5);
                if (!bl2) {
                    int n18 = 4016;
                    zzfte2.zzi(n18, l2);
                    return false;
                }
                object5 = zzazz2.zze();
                boolean bl3 = zzfsy.zze((File)object3, (byte[])(object5 = (Object)((zzhac)object5).zzB()));
                if (!bl3) {
                    int n19 = 4017;
                    zzfte2.zzi(n19, l2);
                    return false;
                }
                if (hashSet != null && (n3 = hashSet.zza((File)object4)) == 0) {
                    n3 = 4018;
                    zzfte2.zzi(n3, l2);
                    zzfsy.zzd((File)object);
                    return false;
                }
                hashSet = zzfte.zzf(zzazz2);
                long l4 = System.currentTimeMillis();
                object = zzfte2.zzc;
                object5 = this.zzh();
                String string6 = null;
                object = object.getString((String)object5, null);
                object5 = zzfte2.zzc;
                object5 = object5.edit();
                string6 = this.zzh();
                object5.putString(string6, (String)((Object)hashSet));
                if (object != null) {
                    hashSet = this.zzg();
                    object5.putString((String)((Object)hashSet), (String)object);
                }
                if ((n3 = (int)(object5.commit() ? 1 : 0)) == 0) {
                    n3 = 4019;
                    zzfte2.zzi(n3, l4);
                    return false;
                }
                hashSet = new HashSet<File[]>();
                object = zzfte2.zzk(n10);
                if (object != null) {
                    object = object.zzk();
                    hashSet.add((File[])object);
                }
                if ((object = zzfte2.zzk(n4 = 2)) != null) {
                    object = object.zzk();
                    hashSet.add((File[])object);
                }
                object4 = zzfte2.zzb;
                object3 = "pccache";
                object4 = object4.getDir((String)object3, 0);
                object3 = zzfte2.zzd;
                object = new File((File)object4, (String)object3);
                object = object.listFiles();
                n7 = ((File[])object).length;
                while (true) {
                    if (n8 >= n7) {
                        n3 = 5014;
                        zzfte2.zzi(n3, l2);
                        return n10;
                    }
                    object3 = object[n8];
                    object5 = ((File)object3).getName();
                    bl2 = hashSet.contains(object5);
                    if (!bl2) {
                        zzfsy.zzd((File)object3);
                    }
                    ++n8;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfsw zzc(int n3) {
        long l2 = System.currentTimeMillis();
        Object object = zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                zzbac zzbac2;
                int n4 = 1;
                try {
                    zzbac2 = this.zzk(n4);
                    if (zzbac2 == null) {
                        n4 = 4022;
                        this.zzi(n4, l2);
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Object object3 = zzbac2.zzk();
                File file = new File((File)(object3 = this.zze((String)object3)), (String)(object2 = "pcam.jar"));
                boolean bl2 = file.exists();
                if (!bl2) {
                    object2 = "pcam";
                    file = new File((File)object3, (String)object2);
                }
                Object object4 = "pcbc";
                object2 = new File((File)object3, (String)object4);
                String string2 = "pcopt";
                object4 = new File((File)object3, string2);
                int n7 = 5016;
                this.zzi(n7, l2);
                return new zzfsw(zzbac2, file, (File)object2, (File)object4);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(int n3) {
        long l2 = System.currentTimeMillis();
        Object object = zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                String string2;
                Object object2;
                boolean bl2 = true;
                try {
                    object2 = this.zzk((int)(bl2 ? 1 : 0));
                    if (object2 == null) {
                        bl2 = 4025 != 0;
                        this.zzi((int)(bl2 ? 1 : 0), l2);
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object2 = ((zzbac)object2).zzk();
                File file = new File((File)(object2 = this.zze((String)object2)), string2 = "pcam.jar");
                boolean bl3 = file.exists();
                if (!bl3) {
                    bl2 = 4026 != 0;
                    this.zzi((int)(bl2 ? 1 : 0), l2);
                    return false;
                }
                string2 = "pcbc";
                file = new File((File)object2, string2);
                int n4 = file.exists();
                if (n4 == 0) {
                    bl2 = 4027 != 0;
                    this.zzi((int)(bl2 ? 1 : 0), l2);
                    return false;
                }
                n4 = 5019;
                this.zzi(n4, l2);
                return bl2;
            }
            throw throwable2;
        }
    }
}

