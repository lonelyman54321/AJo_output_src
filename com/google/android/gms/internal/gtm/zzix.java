/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.RemoteException
 *  android.util.Pair
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzik;
import com.google.android.gms.internal.gtm.zzim;
import com.google.android.gms.internal.gtm.zzin;
import com.google.android.gms.internal.gtm.zzip;
import com.google.android.gms.internal.gtm.zzir;
import com.google.android.gms.internal.gtm.zzis;
import com.google.android.gms.internal.gtm.zzit;
import com.google.android.gms.internal.gtm.zzjd;
import com.google.android.gms.internal.gtm.zzjf;
import com.google.android.gms.internal.gtm.zzjg;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzce;
import com.google.android.gms.tagmanager.zzch;
import com.google.android.gms.tagmanager.zzck;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzix {
    private static final Pattern zza = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static volatile zzix zzb;
    private final Context zzc;
    private final zzck zzd;
    private final zzjg zze;
    private final ExecutorService zzf;
    private final ScheduledExecutorService zzg;
    private final zzhp zzh;
    private final zzit zzi;
    private final Object zzj;
    private String zzk;
    private String zzl;
    private int zzm;
    private final Queue zzn;
    private volatile boolean zzo;
    private volatile boolean zzp;

    public zzix(Context context, zzck zzck2, zzcb linkedList, zzjg zzjg2, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzhp zzhp2, zzit zzit2) {
        linkedList = new LinkedList();
        this.zzj = linkedList;
        this.zzm = 1;
        this.zzn = linkedList = new LinkedList();
        this.zzo = false;
        this.zzp = false;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(zzck2);
        this.zzc = context;
        this.zzd = zzck2;
        this.zze = zzjg2;
        this.zzf = executorService;
        this.zzg = scheduledExecutorService;
        this.zzh = zzhp2;
        this.zzi = zzit2;
    }

    public static /* bridge */ /* synthetic */ int zza(zzix zzix2) {
        return zzix2.zzm;
    }

    public static /* bridge */ /* synthetic */ Context zzb(zzix zzix2) {
        return zzix2.zzc;
    }

    public static /* bridge */ /* synthetic */ Pair zzc(zzix zzix2, String[] stringArray) {
        return zzix2.zzp(null);
    }

    public static /* bridge */ /* synthetic */ zzck zzd(zzix zzix2) {
        return zzix2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzhp zze(zzix zzix2) {
        return zzix2.zzh;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzix zzf(Context context, zzck zzck2, zzcb zzcb2) {
        Preconditions.checkNotNull(context);
        zzix zzix2 = zzb;
        if (zzix2 != null) return zzix2;
        Class<zzix> clazz = zzix.class;
        synchronized (clazz) {
            try {
                zzix2 = zzb;
                if (zzix2 != null) return zzix2;
                Object object = ConnectionTracker.getInstance();
                zzjg zzjg2 = new zzjg(context, (ConnectionTracker)object);
                ExecutorService executorService = zzjd.zza(context);
                ScheduledExecutorService scheduledExecutorService = zzjf.zza();
                zzhp zzhp2 = zzhp.zza();
                zzit zzit2 = new zzit(context);
                object = zzix2;
                zzb = zzix2 = new zzix(context, zzck2, zzcb2, zzjg2, executorService, scheduledExecutorService, zzhp2, zzit2);
                return zzix2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ zzjg zzg(zzix zzix2) {
        return zzix2.zze;
    }

    public static /* bridge */ /* synthetic */ Object zzh(zzix zzix2) {
        return zzix2.zzj;
    }

    public static /* bridge */ /* synthetic */ Queue zzi(zzix zzix2) {
        return zzix2.zzn;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zzj(zzix zzix2) {
        return zzix2.zzf;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzix zzix2, boolean bl2) {
        zzix2.zzo = false;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzix zzix2, int n3) {
        zzix2.zzm = n3;
    }

    public static /* bridge */ /* synthetic */ boolean zzo(zzix zzix2) {
        return zzix2.zzo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Pair zzp(String[] object) {
        int n3;
        CharSequence charSequence;
        String string2;
        String string3;
        boolean bl2;
        Object object2;
        int n4;
        int n7;
        Object object3;
        object = "containers";
        zzhi.zzd("Looking up container asset.");
        String string4 = this.zzk;
        if (string4 != null && (object3 = this.zzl) != null) {
            return Pair.create((Object)string4, (Object)object3);
        }
        boolean bl3 = false;
        string4 = null;
        try {
            object3 = this.zzi;
            object3 = ((zzit)object3).zzb((String)object);
            n7 = 0;
            n4 = 0;
            object2 = null;
            bl2 = false;
            string3 = null;
        }
        catch (IOException iOException) {
            zzhi.zzb("Failed to enumerate assets in folder containers", iOException);
            return Pair.create(null, null);
        }
        while (true) {
            int n8 = ((String[])object3).length;
            string2 = "Extra container asset found, will not be loaded: ";
            charSequence = "Asset found for container ";
            n3 = 1;
            if (n4 >= n8) break;
            Object object4 = zza;
            Object object5 = object3[n4];
            boolean bl4 = ((Matcher)(object5 = ((Pattern)object4).matcher((CharSequence)object5))).matches();
            if (bl4) {
                if (!bl2) {
                    this.zzk = string3 = ((Matcher)object5).group(n3);
                    string3 = File.separator;
                    object4 = object3[n4];
                    this.zzl = string3 = cP.a((String)object, string3, (String)object4);
                    string3 = String.valueOf(this.zzk);
                    string3 = ((String)charSequence).concat(string3);
                    zzhi.zzd(string3);
                } else {
                    string3 = String.valueOf(object3[n4]);
                    string3 = string2.concat(string3);
                    zzhi.zze(string3);
                }
                bl2 = true;
            } else {
                string2 = object3[n4];
                object4 = ((Pattern)object4).pattern();
                String string5 = "Ignoring container asset ";
                charSequence = new StringBuilder(string5);
                ((StringBuilder)charSequence).append(string2);
                string2 = " (does not match ";
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append((String)object4);
                ((StringBuilder)charSequence).append(")");
                object4 = ((StringBuilder)charSequence).toString();
                zzhi.zze((String)object4);
            }
            ++n4;
        }
        if (!bl2) {
            int n10;
            object = "No container asset found in /assets/containers. Checking top level /assets directory for container assets.";
            zzhi.zze((String)object);
            try {
                object = this.zzi;
                object = ((zzit)object).zza();
                bl3 = false;
                string4 = null;
            }
            catch (IOException iOException) {
                zzhi.zzb("Failed to enumerate assets.", iOException);
                return Pair.create(null, null);
            }
            while (n7 < (n10 = ((Object)object).length)) {
                object3 = zza;
                object2 = object[n7];
                n4 = (int)(((Matcher)(object3 = ((Pattern)object3).matcher((CharSequence)object2))).matches() ? 1 : 0);
                if (n4 != 0) {
                    if (!bl3) {
                        this.zzk = string4 = ((Matcher)object3).group(n3);
                        this.zzl = object3 = object[n7];
                        string4 = String.valueOf(string4);
                        zzhi.zzd(((String)charSequence).concat(string4));
                        string4 = "Loading container assets from top level /assets directory. Please move the container asset to /assets/containers";
                        zzhi.zze(string4);
                        bl3 = true;
                    } else {
                        object3 = String.valueOf(object[n7]);
                        object3 = string2.concat((String)object3);
                        zzhi.zze((String)object3);
                    }
                }
                ++n7;
            }
        }
        object = this.zzk;
        string4 = this.zzl;
        return Pair.create((Object)object, (Object)string4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(String[] object) {
        object = "Loading container ";
        String string2 = "Initializing Tag Manager.";
        zzhi.zzd(string2);
        long l2 = System.currentTimeMillis();
        Object object2 = this.zzj;
        synchronized (object2) {
            Throwable throwable3;
            block20: {
                Throwable throwable22;
                boolean bl2;
                block17: {
                    try {
                        bl2 = this.zzo;
                        if (bl2) {
                            return;
                        }
                        bl2 = true;
                    }
                    catch (Throwable throwable3) {}
                    try {
                        block16: {
                            block19: {
                                block18: {
                                    Object object3;
                                    Object object4;
                                    Object object5 = this.zzc;
                                    Object object6 = "com.google.android.gms.tagmanager.TagManagerService";
                                    try {
                                        object4 = object5.getPackageManager();
                                        object5 = object5.getPackageName();
                                        object3 = new ComponentName((String)object5, (String)object6);
                                        boolean bl3 = false;
                                        object5 = null;
                                        object5 = object4.getServiceInfo(object3, 0);
                                        if (object5 == null || !(bl3 = object5.enabled)) break block16;
                                        bl3 = false;
                                        object5 = null;
                                        object6 = this.zzp(null);
                                        object4 = ((Pair)object6).first;
                                    }
                                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                                    object4 = (String)object4;
                                    object6 = ((Pair)object6).second;
                                    object6 = (String)object6;
                                    if (object4 == null || object6 == null) break block18;
                                    object = ((String)object).concat((String)object4);
                                    zzhi.zzc((String)object);
                                    object = this.zzf;
                                    object3 = new zzin(this, (String)object4, (String)object6, null);
                                    object.execute((Runnable)object3);
                                    object = this.zzg;
                                    object5 = new zzip(this);
                                    object6 = TimeUnit.MILLISECONDS;
                                    long l3 = 5000L;
                                    object.schedule((Runnable)object5, l3, (TimeUnit)((Object)object6));
                                    boolean bl4 = this.zzp;
                                    if (!bl4) {
                                        object = "Installing Tag Manager event handler.";
                                        zzhi.zzc((String)object);
                                        this.zzp = bl2;
                                        try {
                                            object = this.zzd;
                                            object5 = new zzik(this);
                                            object.zze((zzch)object5);
                                        }
                                        catch (RemoteException remoteException) {
                                            object5 = "Error communicating with measurement proxy: ";
                                            object6 = this.zzc;
                                            zzgp.zzb((String)object5, remoteException, (Context)object6);
                                        }
                                        try {
                                            object = this.zzd;
                                            object5 = new zzim(this);
                                            object.zzd((zzce)object5);
                                        }
                                        catch (RemoteException remoteException) {
                                            object5 = "Error communicating with measurement proxy: ";
                                            object6 = this.zzc;
                                            zzgp.zzb((String)object5, remoteException, (Context)object6);
                                        }
                                        object = this.zzc;
                                        object5 = new zzir(this);
                                        object.registerComponentCallbacks((ComponentCallbacks)object5);
                                        object = "Tag Manager event handler installed.";
                                        zzhi.zzc((String)object);
                                    }
                                    break block19;
                                }
                                object = "Tag Manager's event handler WILL NOT be installed (no container loaded)";
                                zzhi.zze((String)object);
                            }
                            this.zzo = bl2;
                            // MONITOREXIT @DISABLED, blocks:[1, 5, 8] lbl76 : MonitorExitStatement: MONITOREXIT : var5_8
                            long l4 = System.currentTimeMillis() - l2;
                            object = new StringBuilder("Tag Manager initialization took ");
                            ((StringBuilder)object).append(l4);
                            ((StringBuilder)object).append("ms");
                            zzhi.zzc(((StringBuilder)object).toString());
                            return;
                        }
                        object = "Tag Manager fails to initialize (TagManagerService not enabled in the manifest)";
                        zzhi.zze((String)object);
                    }
                    catch (Throwable throwable22) {
                        break block17;
                    }
                    this.zzo = bl2;
                    return;
                    break block20;
                }
                this.zzo = bl2;
                throw throwable22;
            }
            throw throwable3;
        }
    }

    public final void zzn(Uri uri) {
        zzis zzis2 = new zzis(this, uri);
        this.zzf.execute(zzis2);
    }
}

