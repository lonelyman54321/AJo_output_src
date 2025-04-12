/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzgc$zza;
import com.google.android.gms.internal.measurement.zzgf$zza;
import com.google.android.gms.internal.measurement.zzgf$zza$zza;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzgf$zzh$zza;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzgf$zzj$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgf$zzo;
import com.google.android.gms.internal.measurement.zzgf$zzo$zza;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzgf$zzp$zza;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzog;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzlv;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzoe;
import com.google.android.gms.measurement.internal.zzoi;
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzor;
import com.google.android.gms.measurement.internal.zzos;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou$zzb;
import com.google.android.gms.measurement.internal.zzou$zzc;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.measurement.internal.zzow;
import com.google.android.gms.measurement.internal.zzox;
import com.google.android.gms.measurement.internal.zzoy;
import com.google.android.gms.measurement.internal.zzoz;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpa;
import com.google.android.gms.measurement.internal.zzpb;
import com.google.android.gms.measurement.internal.zzpd;
import com.google.android.gms.measurement.internal.zzpe;
import com.google.android.gms.measurement.internal.zzpf;
import com.google.android.gms.measurement.internal.zzpi;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzpo;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzou
implements zzjh {
    private static volatile zzou zza;
    private List zzaa;
    private long zzab;
    private final Map zzac;
    private final Map zzad;
    private final Map zzae;
    private final Map zzaf;
    private zzlw zzag;
    private String zzah;
    private zzbb zzai;
    private long zzaj;
    private final zzpp zzak;
    private zzhm zzb;
    private zzgv zzc;
    private zzar zzd;
    private zzgy zze;
    private zzoi zzf;
    private zzx zzg;
    private final zzpj zzh;
    private zzlt zzi;
    private zznp zzj;
    private final zzos zzk;
    private zzhj zzl;
    private final zzic zzm;
    private boolean zzn = false;
    private boolean zzo;
    private long zzp;
    private List zzq;
    private final Deque zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;

    private zzou(zzpf zzpf2) {
        this(zzpf2, null);
    }

    private zzou(zzpf zzpf2, zzic object) {
        object = new LinkedList();
        this.zzr = object;
        this.zzaf = object;
        this.zzak = object = new zzpd(this);
        Preconditions.checkNotNull(zzpf2);
        this.zzm = object = zzic.zza(zzpf2.zza, null, null);
        this.zzab = -1;
        this.zzk = object = new zzos(this);
        object = new zzpj(this);
        ((zzot)object).zzan();
        this.zzh = object;
        object = new zzgv(this);
        ((zzot)object).zzan();
        this.zzc = object;
        object = new zzhm(this);
        ((zzot)object).zzan();
        this.zzb = object;
        object = new HashMap();
        this.zzac = object;
        object = new HashMap();
        this.zzad = object;
        object = new HashMap();
        this.zzae = object;
        object = this.zzl();
        zzow zzow2 = new zzow(this, zzpf2);
        ((zzhv)object).zzb(zzow2);
    }

    private final int zza(String object, zzan object2) {
        Enum enum_;
        Object object3 = this.zzb.zzb((String)object);
        int n3 = 1;
        if (object3 == null) {
            object = zzjj$zza.zzd;
            object3 = zzam.zzi;
            ((zzan)object2).zza((zzjj$zza)((Object)object), (zzam)((Object)object3));
            return n3;
        }
        object3 = this.zzf().zzd((String)object);
        if (object3 != null && (object3 = com.google.android.gms.measurement.internal.zzd.zza(((zzh)object3).zzak()).zza()) == (enum_ = zzjm.zzb)) {
            zzjm zzjm2;
            object3 = this.zzb;
            enum_ = zzjj$zza.zzd;
            if ((object3 = ((zzhm)object3).zza((String)object, (zzjj$zza)enum_)) != (zzjm2 = zzjm.zza)) {
                object = zzam.zzh;
                ((zzan)object2).zza((zzjj$zza)enum_, (zzam)((Object)object));
                object = zzjm.zzd;
                if (object3 == object) {
                    return 0;
                }
                return n3;
            }
        }
        object3 = zzjj$zza.zzd;
        enum_ = zzam.zzb;
        ((zzan)object2).zza((zzjj$zza)((Object)object3), (zzam)enum_);
        object2 = this.zzb;
        boolean bl2 = ((zzhm)object2).zzc((String)object, (zzjj$zza)((Object)object3));
        if (bl2) {
            return 0;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int zza(FileChannel object) {
        int n3;
        this.zzl().zzv();
        int n4 = 0;
        if (object != null && (n3 = ((AbstractInterruptibleChannel)object).isOpen()) != 0) {
            IOException iOException2;
            Object object2;
            block4: {
                n3 = 4;
                object2 = ByteBuffer.allocate(n3);
                long l2 = 0L;
                try {
                    ((FileChannel)object).position(l2);
                    int n7 = ((FileChannel)object).read((ByteBuffer)object2);
                    if (n7 != n3) {
                        n3 = -1;
                        if (n7 == n3) return 0;
                        Object object3 = this.zzj();
                        object3 = ((zzgo)object3).zzr();
                        object2 = "Unexpected data length. Bytes read";
                        object = n7;
                        ((zzgq)object3).zza((String)object2, object);
                        return 0;
                    }
                }
                catch (IOException iOException2) {
                    break block4;
                }
                ((ByteBuffer)object2).flip();
                return ((ByteBuffer)object2).getInt();
            }
            zzgq zzgq2 = this.zzj().zzg();
            object2 = "Failed to read from channel";
            zzgq2.zza((String)object2, iOException2);
            return n4;
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return 0;
    }

    private final Bundle zza(String object, zzbl object2) {
        boolean bl2;
        Bundle bundle = new Bundle();
        object2 = ((zzbl)object2).zzb;
        String string2 = "_sid";
        long l2 = ((zzbg)object2).zzb(string2);
        bundle.putLong(string2, l2);
        object2 = this.zzf();
        string2 = "_sno";
        object = ((zzar)object2).zze((String)object, string2);
        if (object != null && (bl2 = (object = ((zzpo)object).zze) instanceof Long)) {
            object = (Long)object;
            long l3 = (Long)object;
            bundle.putLong(string2, l3);
        }
        return bundle;
    }

    /*
     * WARNING - void declaration
     */
    private final zzbd zza(String object, zzbd object2, zzjj object3, zzan object4) {
        boolean bl2;
        void var5_45;
        boolean bl3;
        zzjm zzjm2;
        zzjm zzjm3;
        Boolean bl4;
        void var2_9;
        zzgc$zza zzgc$zza = this.zzi().zzb((String)object);
        String string2 = "-";
        int n3 = 90;
        if (zzgc$zza == null) {
            zzjm zzjm4;
            zzjm zzjm5 = var2_9.zzc();
            if (zzjm5 == (zzjm4 = zzjm.zzc)) {
                n3 = var2_9.zza();
                zzjj$zza zzjj$zza = zzjj$zza.zzc;
                ((zzan)((Object)bl4)).zza(zzjj$zza, n3);
            } else {
                zzjj$zza zzjj$zza = zzjj$zza.zzc;
                zzam zzam2 = zzam.zzi;
                ((zzan)((Object)bl4)).zza(zzjj$zza, zzam2);
            }
            Boolean bl5 = Boolean.FALSE;
            Boolean bl6 = Boolean.TRUE;
            zzbd zzbd2 = new zzbd(bl5, n3, bl6, string2);
            return zzbd2;
        }
        zzjm zzjm6 = var2_9.zzc();
        if (zzjm6 != (zzjm3 = zzjm.zzd) && zzjm6 != (zzjm2 = zzjm.zzc)) {
            zzjm zzjm7;
            zzjj$zza zzjj$zza;
            zzhm zzhm2;
            zzjm zzjm8;
            zzjm zzjm9 = zzjm.zzb;
            if (zzjm6 == zzjm9 && (zzjm8 = (zzhm2 = this.zzb).zza((String)object, zzjj$zza = zzjj$zza.zzc)) != (zzjm7 = zzjm.zza)) {
                zzam zzam3 = zzam.zzh;
                ((zzan)((Object)bl4)).zza(zzjj$zza, zzam3);
                zzjm zzjm10 = zzjm8;
            } else {
                boolean bl7;
                void var3_26;
                zzhm zzhm3 = this.zzb;
                zzjj$zza zzjj$zza2 = zzjj$zza.zzc;
                zzjj$zza zzjj$zza3 = zzhm3.zzb((String)object, zzjj$zza2);
                zzjm zzjm11 = var3_26.zzc();
                if (zzjm11 != zzjm3 && zzjm11 != zzjm2) {
                    bl7 = false;
                    zzjm7 = null;
                } else {
                    bl7 = true;
                }
                zzjj$zza zzjj$zza4 = zzjj$zza.zza;
                if (zzjj$zza3 == zzjj$zza4 && bl7) {
                    zzam zzam4 = zzam.zzc;
                    ((zzan)((Object)bl4)).zza(zzjj$zza2, zzam4);
                    zzjm zzjm12 = zzjm11;
                } else {
                    zzam zzam5 = zzam.zzb;
                    ((zzan)((Object)bl4)).zza(zzjj$zza2, zzam5);
                    zzhm zzhm4 = this.zzb;
                    bl3 = zzhm4.zzc((String)object, zzjj$zza2);
                    if (bl3) {
                        zzjm zzjm13 = zzjm3;
                    } else {
                        zzjm zzjm14 = zzjm2;
                    }
                }
            }
        } else {
            n3 = var2_9.zza();
            zzjj$zza zzjj$zza = zzjj$zza.zzc;
            ((zzan)((Object)bl4)).zza(zzjj$zza, n3);
        }
        zzhm zzhm5 = this.zzb;
        bl3 = zzhm5.zzm((String)object);
        SortedSet sortedSet = this.zzi().zzh((String)object);
        zzjm zzjm15 = zzjm.zzc;
        if (var5_45 != zzjm15 && !(bl2 = sortedSet.isEmpty())) {
            bl4 = Boolean.TRUE;
            Boolean bl8 = bl3;
            string2 = "";
            if (bl3) {
                string2 = TextUtils.join((CharSequence)string2, (Iterable)sortedSet);
            }
            zzbd zzbd3 = new zzbd(bl4, n3, bl8, string2);
            return zzbd3;
        }
        Boolean bl9 = Boolean.FALSE;
        Boolean bl10 = bl3;
        zzbd zzbd4 = new zzbd(bl9, n3, bl10, string2);
        return zzbd4;
    }

    public static /* bridge */ /* synthetic */ zzic zza(zzou zzou2) {
        return zzou2.zzm;
    }

    private static zzot zza(zzot object) {
        if (object != null) {
            boolean bl2 = ((zzot)object).zzao();
            if (bl2) {
                return object;
            }
            object = String.valueOf(object.getClass());
            object = "Component not initialized: ".concat((String)object);
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        object = new IllegalStateException("Upload Component not created");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzou zza(Context object) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object.getApplicationContext());
        Object object2 = zza;
        if (object2 != null) return zza;
        object2 = zzou.class;
        synchronized (object2) {
            try {
                Object object3 = zza;
                if (object3 != null) return zza;
                object3 = new zzpf((Context)object);
                object = Preconditions.checkNotNull(object3);
                object = (zzpf)object;
                zza = object3 = new zzou((zzpf)object);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Boolean zza(zzh object) {
        try {
            long l2 = ((zzh)object).zze();
            long l3 = 0x80000000L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 != false) {
                long l7;
                Object object2 = this.zzm;
                object2 = ((zzic)object2).zza();
                object2 = Wrappers.packageManager((Context)object2);
                String string2 = ((zzh)object).zzac();
                object2 = ((PackageManagerWrapper)object2).getPackageInfo(string2, 0);
                int n3 = ((PackageInfo)object2).versionCode;
                long l8 = ((zzh)object).zze();
                long l12 = l8 - (l7 = (long)n3);
                Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object3 != false) return Boolean.FALSE;
                return Boolean.TRUE;
            } else {
                boolean bl2;
                Object object4 = this.zzm;
                object4 = ((zzic)object4).zza();
                object4 = Wrappers.packageManager((Context)object4);
                String string3 = ((zzh)object).zzac();
                object4 = ((PackageManagerWrapper)object4).getPackageInfo(string3, 0);
                object4 = ((PackageInfo)object4).versionName;
                if ((object = ((zzh)object).zzaf()) == null || !(bl2 = ((String)object).equals(object4))) return Boolean.FALSE;
                return Boolean.TRUE;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    private final String zza(zzjj objectArray) {
        int n3 = 1;
        boolean bl2 = objectArray.zzh();
        if (bl2) {
            objectArray = new byte[16];
            this.zzq().zzw().nextBytes((byte[])objectArray);
            Locale locale = Locale.US;
            BigInteger bigInteger = new BigInteger(n3, (byte[])objectArray);
            objectArray = new Object[n3];
            objectArray[0] = bigInteger;
            return String.format(locale, "%032x", objectArray);
        }
        return null;
    }

    private static String zza(Map object, String string2) {
        boolean bl2;
        if (object == null) {
            return null;
        }
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            String string3 = (String)entry.getKey();
            boolean bl3 = string2.equalsIgnoreCase(string3);
            if (!bl3) continue;
            object = (List)entry.getValue();
            boolean bl4 = object.isEmpty();
            if (bl4) {
                return null;
            }
            return (String)((List)entry.getValue()).get(0);
        }
        return null;
    }

    private static void zza(zzgf$zzf$zza zzgf$zzf$zza, int n3, String object) {
        String string2;
        Object object2 = zzgf$zzf$zza.zzf();
        int n4 = 0;
        while (true) {
            int n7 = object2.size();
            string2 = "_err";
            if (n4 >= n7) break;
            String string3 = ((zzgf$zzh)object2.get(n4)).zzg();
            n7 = (int)(string2.equals(string3) ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            ++n4;
        }
        object2 = zzgf$zzh.zze().zza(string2);
        long l2 = n3;
        zzgf$zzh zzgf$zzh = (zzgf$zzh)((zzkg)((zzgf$zzh$zza)object2).zza(l2).zzaj());
        object = (zzgf$zzh)((zzkg)zzgf$zzh.zze().zza("_ev").zzb((String)object).zzaj());
        zzgf$zzf$zza.zza(zzgf$zzh).zza((zzgf$zzh)object);
    }

    private static void zza(zzgf$zzf$zza zzgf$zzf$zza, String string2) {
        int n3;
        List list = zzgf$zzf$zza.zzf();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            String string3 = ((zzgf$zzh)list.get(i3)).zzg();
            n3 = (int)(string2.equals(string3) ? 1 : 0);
            if (n3 == 0) continue;
            zzgf$zzf$zza.zza(i3);
            return;
        }
    }

    private final void zza(zzgf$zzk$zza object, long l2, boolean bl2) {
        zzpo zzpo2;
        String string2 = bl2 ? "_se" : "_lte";
        Object object2 = this.zzf();
        Object object3 = ((zzgf$zzk$zza)object).zzu();
        if ((object2 = ((zzar)object2).zze((String)object3, string2)) != null && (object3 = ((zzpo)object2).zze) != null) {
            object3 = ((zzgf$zzk$zza)object).zzu();
            long l3 = this.zzb().currentTimeMillis();
            long l4 = (Long)((zzpo)object2).zze + l2;
            Long l7 = l4;
            String string3 = "auto";
            object2 = zzpo2;
            zzpo2 = new zzpo((String)object3, string3, string2, l3, l7);
        } else {
            object3 = ((zzgf$zzk$zza)object).zzu();
            long l8 = this.zzb().currentTimeMillis();
            Long l12 = l2;
            String string4 = "auto";
            object2 = zzpo2;
            zzpo2 = new zzpo((String)object3, string4, string2, l8, l12);
        }
        object2 = zzgf$zzp.zze().zza(string2);
        long l14 = this.zzb().currentTimeMillis();
        object2 = ((zzgf$zzp$zza)object2).zzb(l14);
        object3 = (Long)zzpo2.zze;
        l14 = (Long)object3;
        object2 = (zzgf$zzp)((zzkg)((zzgf$zzp$zza)object2).zza(l14).zzaj());
        int n3 = zzpj.zza((zzgf$zzk$zza)object, string2);
        if (n3 >= 0) {
            ((zzgf$zzk$zza)object).zza(n3, (zzgf$zzp)object2);
        } else {
            ((zzgf$zzk$zza)object).zza((zzgf$zzp)object2);
        }
        long l15 = 0L;
        long l16 = l2 == l15 ? 0 : (l2 < l15 ? -1 : 1);
        if (l16 > 0) {
            object = this.zzf();
            ((zzar)object).zza(zzpo2);
            object = bl2 ? "session-scoped" : "lifetime";
            zzgq zzgq2 = this.zzj().zzq();
            String string5 = "Updated engagement user property. scope, value";
            Object object4 = zzpo2.zze;
            zzgq2.zza(string5, object, object4);
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzou zzou2, long l2) {
        zzou2.zzaj = l2;
    }

    public static /* synthetic */ void zza(zzou zzou2, zzpf object) {
        zzou2.zzl().zzv();
        zzou2.zzl = object = new zzhj(zzou2);
        object = new zzar(zzou2);
        ((zzot)object).zzan();
        zzou2.zzd = object;
        object = zzou2.zze();
        Object object2 = (zzak)Preconditions.checkNotNull(zzou2.zzb);
        ((zzai)object).zza((zzak)object2);
        object = new zznp(zzou2);
        ((zzot)object).zzan();
        zzou2.zzj = object;
        object = new zzx(zzou2);
        ((zzot)object).zzan();
        zzou2.zzg = object;
        object = new zzlt(zzou2);
        ((zzot)object).zzan();
        zzou2.zzi = object;
        object = new zzoi(zzou2);
        ((zzot)object).zzan();
        zzou2.zzf = object;
        object = new zzgy(zzou2);
        zzou2.zze = object;
        int n3 = zzou2.zzs;
        int n4 = zzou2.zzt;
        if (n3 != n4) {
            object = zzou2.zzj().zzg();
            n4 = zzou2.zzs;
            object2 = n4;
            int n7 = zzou2.zzt;
            Integer n8 = n7;
            String string2 = "Not all upload components initialized";
            ((zzgq)object).zza(string2, object2, n8);
        }
        zzou2.zzn = true;
    }

    public static /* synthetic */ void zza(zzou zzou2, String string2, int n3, Throwable throwable, byte[] byArray, Map map2) {
        zzou2.zza(string2, n3, throwable, byArray, map2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zza(String var1_1, int var2_4, Throwable var3_5, byte[] var4_6, Map var5_7) {
        block24: {
            block19: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                this.zzl().zzv();
                                this.zzt();
                                Preconditions.checkNotEmpty((String)var1_1);
                                if (var4_6 /* !! */  != null) ** GOTO lbl8
                                try {
                                    var4_6 /* !! */  = new byte[]{};
lbl8:
                                    // 2 sources

                                    var6_8 = this.zzj();
                                    var6_8 = var6_8.zzq();
                                    var7_9 = "onConfigFetched. Response size";
                                    var8_10 = var4_6 /* !! */ .length;
                                    var9_11 = var8_10;
                                    var6_8.zza((String)var7_9, var9_11);
                                    var6_8 = this.zzf();
                                    var6_8.zzq();
                                }
                                catch (Throwable var1_2) {}
                                var6_8 = this.zzf();
                                var6_8 = var6_8.zzd((String)var1_1);
                                var10_12 = 200;
                                var8_10 = 304;
                                if ((var2_4 == var10_12 || var2_4 == (var10_12 = 204) || var2_4 == var8_10) && var3_5 == null) {
                                    var10_12 = 1;
                                } else {
                                    var10_12 = 0;
                                    var7_9 = null;
                                }
                                if (var6_8 == null) {
                                    var11_13 = this.zzj();
                                    var11_13 = var11_13.zzr();
                                    var3_5 = "App does not exist in onConfigFetched. appId";
                                    var1_1 = zzgo.zza((String)var1_1);
                                    var11_13.zza((String)var3_5, var1_1);
                                    break block19;
                                }
                                var12_17 = 404;
                                if (var10_12 == 0 && var2_4 != var12_17) {
                                    var4_6 /* !! */  = (byte[])this.zzb();
                                    var13_18 = var4_6 /* !! */ .currentTimeMillis();
                                    var6_8.zzm(var13_18);
                                    var4_6 /* !! */  = this.zzf();
                                    var4_6 /* !! */ .zza((zzh)var6_8, false, false);
                                    var4_6 /* !! */  = this.zzj();
                                    var4_6 /* !! */  = var4_6 /* !! */ .zzq();
                                    var5_7 = "Fetching config failed. code, error";
                                    var6_8 = var2_4;
                                    var4_6 /* !! */ .zza((String)var5_7, var6_8, var3_5);
                                    var3_5 = this.zzi();
                                    var3_5.zzi((String)var1_1);
                                    var1_1 = this.zzj;
                                    var1_1 = var1_1.zze;
                                    var3_5 = this.zzb();
                                    var15_19 = var3_5.currentTimeMillis();
                                    var1_1.zza(var15_19);
                                    var17_20 = 503;
                                    if (var2_4 == var17_20 || var2_4 == (var17_20 = 429)) {
                                        var1_1 = this.zzj;
                                        var1_1 = var1_1.zzc;
                                        var11_14 = this.zzb();
                                        var18_22 = var11_14.currentTimeMillis();
                                        var1_1.zza(var18_22);
                                    }
                                    this.zzaf();
                                    break block19;
                                }
                                var3_5 = "Last-Modified";
                                var3_5 = zzou.zza((Map)var5_7, (String)var3_5);
                                var7_9 = "ETag";
                                var5_7 = zzou.zza((Map)var5_7, (String)var7_9);
                                if (var2_4 == var12_17 || var2_4 == var8_10) break block20;
                                var7_9 = this.zzi();
                                var20_23 = var7_9.zza((String)var1_1, var4_6 /* !! */ , (String)var3_5, (String)var5_7);
                                if (var20_23) break block21;
                                var1_1 = this.zzf();
                                var1_1.zzr();
                                this.zzu = false;
                                this.zzac();
                                return;
                            }
                            var3_5 = this.zzi();
                            var3_5 = var3_5.zzc((String)var1_1);
                            if (var3_5 != null) break block21;
                            var3_5 = this.zzi();
                            var5_7 = null;
                            var20_24 = var3_5.zza((String)var1_1, null, null, null);
                            if (var20_24) break block21;
                            var1_1 = this.zzf();
                            var1_1.zzr();
                            this.zzu = false;
                            this.zzac();
                            return;
                        }
                        try {
                            var3_5 = this.zzb();
                            var21_25 = var3_5.currentTimeMillis();
                            var6_8.zzd(var21_25);
                            var3_5 = this.zzf();
                            var3_5.zza((zzh)var6_8, false, false);
                            if (var2_4 != var12_17) break block22;
                            var11_15 = this.zzj();
                            var11_15 = var11_15.zzw();
                            var3_5 = "Config not found. Using empty config. appId";
                            var11_15.zza((String)var3_5, var1_1);
                            break block23;
                        }
                        catch (Throwable var1_3) {}
                        break block24;
                    }
                    var1_1 = this.zzj();
                    var1_1 = var1_1.zzq();
                    var3_5 = "Successfully fetched config. Got network response. code, size";
                    var11_15 = var2_4;
                    var23_26 = var4_6 /* !! */ .length;
                    var4_6 /* !! */  = var23_26;
                    var1_1.zza((String)var3_5, var11_15, var4_6 /* !! */ );
                }
                var1_1 = this.zzh();
                var17_21 = var1_1.zzr();
                if (var17_21 && (var17_21 = this.zzag())) {
                    this.zzx();
                } else {
                    var1_1 = this.zze();
                    var17_21 = var1_1.zza((zzfx)(var11_15 = zzbn.zzch));
                    if (var17_21 && (var17_21 = (var1_1 = this.zzh()).zzr()) && (var17_21 = (var1_1 = this.zzf()).zzq((String)(var11_15 = var6_8.zzac())))) {
                        var1_1 = var6_8.zzac();
                        this.zze((String)var1_1);
                    } else {
                        this.zzaf();
                    }
                }
            }
            var1_1 = this.zzf();
            var1_1.zzx();
            var1_1 = this.zzf();
            var1_1.zzr();
            this.zzu = false;
            this.zzac();
            return;
        }
        var11_16 = this.zzf();
        var11_16.zzr();
        throw var1_3;
        this.zzu = false;
        this.zzac();
        throw var1_2;
    }

    private final void zza(String string2, long l2) {
        zzou zzou2 = this;
        String string3 = string2;
        long l3 = l2;
        Object object = this.zze();
        Object object2 = zzbn.zzg;
        int n3 = ((zzai)object).zzb(string2, (zzfx)object2);
        object2 = this.zze();
        Object object3 = zzbn.zzh;
        int n4 = ((zzai)object2).zzb(string2, (zzfx)object3);
        boolean n7 = false;
        object3 = null;
        n4 = Math.max(0, n4);
        Object object4 = this.zzf();
        object = ((zzar)object4).zza(string2, n3, n4);
        n4 = (int)(object.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            boolean bl2;
            Object object5;
            Object object6;
            zzai zzai2;
            float f5;
            int n8;
            Object object7;
            Object object8;
            Object object9;
            int n10;
            object2 = this.zzb(string2);
            n4 = (int)(((zzjj)object2).zzg() ? 1 : 0);
            if (n4 != 0) {
                block48: {
                    object2 = object.iterator();
                    while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object9 = (zzgf$zzk)((Pair)object2.next()).first;
                        object8 = ((zzgf$zzk)object9).zzap();
                        boolean bl3 = ((String)object8).isEmpty();
                        if (bl3) continue;
                        object2 = ((zzgf$zzk)object9).zzap();
                        break block48;
                    }
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    int n14;
                    object9 = null;
                    for (n10 = 0; n10 < (n14 = object.size()); ++n10) {
                        object8 = (zzgf$zzk)((Pair)object.get((int)n10)).first;
                        object7 = ((zzgf$zzk)object8).zzap();
                        n8 = (int)(((String)object7).isEmpty() ? 1 : 0);
                        if (n8 != 0 || (n14 = (int)(((String)(object8 = ((zzgf$zzk)object8).zzap())).equals(object2) ? 1 : 0)) != 0) continue;
                        object = object.subList(0, n10);
                        break;
                    }
                }
            }
            object2 = zzgf$zzj.zzb();
            n10 = object.size();
            n8 = object.size();
            object8 = new ArrayList(n8);
            object7 = this.zze();
            n8 = (int)(((zzai)object7).zzj(string3) ? 1 : 0);
            if (n8 != 0 && (n8 = (int)(((zzjj)(object7 = this.zzb(string2))).zzg() ? 1 : 0)) != 0) {
                n8 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n8 = 0;
                f5 = 0.0f;
                object7 = null;
            }
            Object object10 = this.zzb(string2);
            boolean bl4 = ((zzjj)object10).zzg();
            Object object11 = this.zzb(string2);
            boolean bl5 = ((zzjj)object11).zzh();
            boolean bl6 = com.google.android.gms.internal.measurement.zzpf.zza();
            if (bl6 && (bl6 = (zzai2 = this.zze()).zze(string3, (zzfx)(object6 = zzbn.zzcg)))) {
                bl6 = true;
            } else {
                bl6 = false;
                zzai2 = null;
            }
            object6 = zzou2.zzk.zza(string3);
            int n15 = 0;
            object4 = null;
            while (n15 < n10) {
                boolean bl7;
                boolean bl8;
                float f6;
                int n16;
                int n17;
                Object object12;
                boolean bl9;
                boolean bl10;
                Object e2;
                object5 = e2 = object.get(n15);
                object5 = (zzgf$zzk$zza)((zzgf$zzk)((Pair)e2).first).zzch();
                e2 = object.get(n15);
                object3 = e2;
                object3 = (Long)((Pair)e2).second;
                ((ArrayList)object8).add(object3);
                this.zze();
                int n18 = n15;
                long l4 = 114010L;
                object3 = ((zzgf$zzk$zza)object5).zzm(l4).zzl(l3);
                n15 = 0;
                object4 = null;
                ((zzgf$zzk$zza)object3).zzd(false);
                if (n8 == 0) {
                    ((zzgf$zzk$zza)object5).zzk();
                }
                if (!bl4) {
                    ((zzgf$zzk$zza)object5).zzq();
                    ((zzgf$zzk$zza)object5).zzn();
                }
                if (!bl5) {
                    ((zzgf$zzk$zza)object5).zzh();
                }
                zzou2.zza(string3, (zzgf$zzk$zza)object5);
                if (!bl6) {
                    ((zzgf$zzk$zza)object5).zzr();
                }
                if (!bl5) {
                    ((zzgf$zzk$zza)object5).zzi();
                }
                if (!(bl10 = TextUtils.isEmpty((CharSequence)(object3 = ((zzgf$zzk$zza)object5).zzaa()))) && !(bl9 = ((String)object3).equals(object4 = "00000000-0000-0000-0000-000000000000"))) {
                    object12 = object;
                    n17 = n10;
                    n16 = n8;
                    f6 = f5;
                    bl8 = bl4;
                    bl7 = bl5;
                } else {
                    object4 = ((zzgf$zzk$zza)object5).zzab();
                    object3 = new ArrayList(object4);
                    object4 = ((ArrayList)object3).iterator();
                    object12 = object;
                    n17 = n10;
                    n3 = 0;
                    object = null;
                    n10 = 0;
                    object9 = null;
                    boolean bl11 = false;
                    boolean bl12 = false;
                    while (bl8 = object4.hasNext()) {
                        Object e5 = object4.next();
                        n16 = n8;
                        f6 = f5;
                        object7 = e5;
                        object7 = (zzgf$zzf)e5;
                        bl8 = bl4;
                        object10 = ((zzgf$zzf)object7).zzg();
                        bl7 = bl5;
                        object11 = "_fx";
                        bl4 = ((String)object11).equals(object10);
                        if (bl4) {
                            object4.remove();
                            bl4 = bl8;
                            bl11 = true;
                            bl12 = true;
                            continue;
                        }
                        object10 = "_f";
                        object11 = ((zzgf$zzf)object7).zzg();
                        bl4 = ((String)object10).equals(object11);
                        if (bl4) {
                            long l7;
                            this.zzp();
                            object10 = zzpj.zza((zzgf$zzf)object7, "_pfo");
                            if (object10 != null) {
                                l7 = ((zzgf$zzh)object10).zzd();
                                object = l7;
                            }
                            this.zzp();
                            object10 = "_uwa";
                            object7 = zzpj.zza((zzgf$zzf)object7, (String)object10);
                            if (object7 != null) {
                                l7 = ((zzgf$zzh)object7).zzd();
                                object9 = l7;
                            }
                            bl12 = true;
                        }
                        bl4 = bl8;
                        n8 = n16;
                        f5 = f6;
                        bl5 = bl7;
                    }
                    n16 = n8;
                    f6 = f5;
                    bl8 = bl4;
                    bl7 = bl5;
                    if (bl11) {
                        ((zzgf$zzk$zza)object5).zzl();
                        ((zzgf$zzk$zza)object5).zzb((Iterable)object3);
                    }
                    if (bl12) {
                        object3 = ((zzgf$zzk$zza)object5).zzu();
                        n15 = 1;
                        zzou2.zza((String)object3, n15 != 0, (Long)object, (Long)object9);
                    }
                }
                n3 = ((zzgf$zzk$zza)object5).zzc();
                if (n3 != 0) {
                    object = this.zze();
                    n3 = (int)(((zzai)object).zze(string3, (zzfx)(object3 = zzbn.zzbw)) ? 1 : 0);
                    if (n3 != 0) {
                        object = ((zzgf$zzk)((zzkg)((zzkg$zza)object5).zzaj())).zzce();
                        object3 = this.zzp();
                        l4 = ((zzpj)object3).zza((byte[])object);
                        ((zzgf$zzk$zza)object5).zzb(l4);
                    }
                    if ((n3 = (int)(((zzai)(object = this.zze())).zza((zzfx)(object3 = zzbn.zzcj)) ? 1 : 0)) != 0 && (object = ((zzov)object6).zzb()) != null) {
                        ((zzgf$zzk$zza)object5).zza((zzgf$zzo)object);
                    }
                    ((zzgf$zzj$zzb)object2).zza((zzgf$zzk$zza)object5);
                }
                n15 = n18 + 1;
                object = object12;
                n10 = n17;
                bl4 = bl8;
                n8 = n16;
                f5 = f6;
                bl5 = bl7;
                bl9 = false;
                object3 = null;
            }
            n3 = ((zzgf$zzj$zzb)object2).zza();
            if (n3 == 0) {
                zzou2.zza((List)object8);
                object9 = Collections.emptyList();
                zzou zzou3 = this;
                object4 = string2;
                this.zza(false, 204, null, null, string2, (List)object9);
                return;
            }
            object = (zzgf$zzj)((zzkg)((zzkg$zza)object2).zzaj());
            object9 = new ArrayList();
            object3 = this.zze();
            boolean bl13 = ((zzai)object3).zza((zzfx)(object4 = zzbn.zzcj));
            if (bl13 && (object3 = ((zzov)object6).zza()) == (object4 = zzlu.zzd)) {
                n15 = 1;
            } else {
                n15 = 0;
                object4 = null;
            }
            object3 = ((zzov)object6).zza();
            object7 = zzlu.zzc;
            if (object3 != object7 && n15 == 0) {
                boolean bl14 = false;
                object5 = null;
            } else {
                block49: {
                    boolean bl15;
                    object = ((zzgf$zzj)((zzkg)((zzkg$zza)object2).zzaj())).zzf().iterator();
                    while (bl15 = object.hasNext()) {
                        object3 = (zzgf$zzk)object.next();
                        bl15 = ((zzgf$zzk)object3).zzbk();
                        if (!bl15) continue;
                        object = UUID.randomUUID().toString();
                        break block49;
                    }
                    n3 = 0;
                    object = null;
                }
                object3 = (zzgf$zzj)((zzkg)((zzkg$zza)object2).zzaj());
                this.zzl().zzv();
                this.zzt();
                object7 = zzgf$zzj.zza((zzgf$zzj)object3);
                boolean bl16 = TextUtils.isEmpty((CharSequence)object);
                if (!bl16) {
                    ((zzgf$zzj$zzb)object7).zza((String)object);
                }
                if (!(bl4 = TextUtils.isEmpty((CharSequence)(object5 = this.zzi().zzf(string3))))) {
                    ((zzgf$zzj$zzb)object7).zzb((String)object5);
                }
                object5 = new Object();
                object3 = ((zzgf$zzj)object3).zzf().iterator();
                while (bl4 = object3.hasNext()) {
                    object10 = zzgf$zzk.zza((zzgf$zzk)object3.next());
                    ((zzgf$zzk$zza)object10).zzk();
                    object10 = (zzgf$zzk)((zzkg)((zzkg$zza)object10).zzaj());
                    ((ArrayList)object5).add(object10);
                }
                ((zzgf$zzj$zzb)object7).zzb();
                ((zzgf$zzj$zzb)object7).zza((Iterable)object5);
                object3 = this.zze();
                object5 = zzbn.zzci;
                boolean bl17 = ((zzai)object3).zza((zzfx)object5);
                if (bl17) {
                    object3 = this.zzj().zzq();
                    bl4 = TextUtils.isEmpty((CharSequence)object);
                    object10 = bl4 ? "null" : ((zzgf$zzj$zzb)object7).zzc();
                    object11 = "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ";
                    ((zzgq)object3).zza((String)object11, object10);
                } else {
                    object3 = this.zzj().zzq();
                    object10 = "[sgtm] Processed MeasurementBatch for sGTM.";
                    ((zzgq)object3).zza((String)object10);
                }
                object3 = (zzgf$zzj)((zzkg)((zzkg$zza)object7).zzaj());
                n8 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n8 == 0 && (n8 = (int)(((zzai)(object7 = this.zze())).zza((zzfx)object5) ? 1 : 0)) != 0) {
                    object2 = (zzgf$zzj)((zzkg)((zzkg$zza)object2).zzaj());
                    this.zzl().zzv();
                    this.zzt();
                    object7 = zzgf$zzj.zzb();
                    object5 = this.zzj().zzq();
                    object10 = "Processing Google Signal, sgtmJoinId:";
                    ((zzgq)object5).zza((String)object10, object);
                    ((zzgf$zzj$zzb)object7).zza((String)object);
                    object = ((zzgf$zzj)object2).zzf().iterator();
                    while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        object2 = (zzgf$zzk)object.next();
                        object5 = zzgf$zzk.zzx();
                        object10 = ((zzgf$zzk)object2).zzaj();
                        object5 = ((zzgf$zzk$zza)object5).zzj((String)object10);
                        n4 = ((zzgf$zzk)object2).zzd();
                        object2 = ((zzgf$zzk$zza)object5).zzg(n4);
                        ((zzgf$zzj$zzb)object7).zza((zzgf$zzk$zza)object2);
                    }
                    object = (zzgf$zzj)((zzkg)((zzkg$zza)object7).zzaj());
                    object2 = zzou2.zzk.zzm().zzf(string3);
                    n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n8 == 0) {
                        object7 = zzbn.zzr;
                        bl16 = false;
                        object7 = Uri.parse((String)((String)((zzfx)object7).zza(null)));
                        object5 = object7.buildUpon();
                        object7 = object7.getAuthority();
                        object10 = new StringBuilder();
                        ((StringBuilder)object10).append((String)object2);
                        ((StringBuilder)object10).append(".");
                        ((StringBuilder)object10).append((String)object7);
                        object2 = ((StringBuilder)object10).toString();
                        object5.authority((String)object2);
                        object7 = object5.build().toString();
                        object5 = n15 != 0 ? zzlu.zze : zzlu.zzb;
                        object2 = new zzov((String)object7, (zzlu)((Object)object5));
                        bl16 = false;
                        object5 = null;
                    } else {
                        object7 = zzbn.zzr;
                        bl16 = false;
                        object5 = null;
                        object7 = (String)((zzfx)object7).zza(null);
                        object10 = n15 != 0 ? zzlu.zze : zzlu.zzb;
                        object2 = new zzov((String)object7, (zzlu)((Object)object10));
                    }
                    object = Pair.create((Object)object, (Object)object2);
                    ((ArrayList)object9).add(object);
                } else {
                    bl16 = false;
                    object5 = null;
                }
                if (n15 != 0) {
                    object = (zzgf$zzj$zzb)((zzkg)object3).zzch();
                    object2 = null;
                    for (n4 = 0; n4 < (n15 = ((zzgf$zzj)object3).zza()); ++n4) {
                        object4 = ((zzgf$zzk$zza)((zzgf$zzj)object3).zza(n4).zzch()).zzt().zza(l3);
                        ((zzgf$zzj$zzb)object).zza(n4, (zzgf$zzk$zza)object4);
                    }
                    Object object13 = Pair.create((Object)((zzgf$zzj)((zzkg)((zzkg$zza)object).zzaj())), (Object)object6);
                    ((ArrayList)object9).add(object13);
                    zzou2.zza((List)object8);
                    n4 = 0;
                    object2 = null;
                    boolean bl18 = false;
                    object3 = null;
                    boolean bl19 = false;
                    Context context = null;
                    n3 = 204;
                    object13 = this;
                    object4 = string2;
                    this.zza(false, n3, null, null, string2, (List)object9);
                    object13 = ((zzov)object6).zzc();
                    boolean bl20 = zzou2.zzf((String)object13);
                    if (bl20) {
                        this.zzj().zzq().zza("[sgtm] Sending sgtm batches available notification to app", string3);
                        object13 = new Intent();
                        object13.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        object13.setPackage(string3);
                        context = zzou2.zzm.zza();
                        context.sendBroadcast((Intent)object13);
                    }
                    return;
                }
                object = object3;
            }
            object2 = this.zzj();
            int n19 = 2;
            n4 = (int)(((zzgo)object2).zza(n19) ? 1 : 0);
            if (n4 != 0) {
                object2 = this.zzp();
                object4 = ((zzpj)object2).zza((zzgf$zzj)object);
            } else {
                n15 = 0;
                object4 = null;
            }
            this.zzp();
            object2 = ((zzio)object).zzce();
            zzou2.zza((List)object8);
            object3 = zzou2.zzj.zze;
            ((zzhf)object3).zza(l3);
            Object object14 = this.zzj().zzq();
            int n20 = ((Object)object2).length;
            Object object15 = n20;
            object2 = "Uploading data. app, uncompressed size, data";
            ((zzgq)object14).zza((String)object2, string3, object15, object4);
            zzou2.zzv = bl2 = true;
            object14 = this.zzh();
            object15 = new zzoz(zzou2, string3, (List)object9);
            ((zzgv)object14).zza(string3, (zzov)object6, (zzgf$zzj)object, (zzgu)object15);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(String object, zzgf$zzh$zza zzgf$zzh$zza, Bundle bundle, String object2) {
        boolean bl2;
        int n3;
        String string2 = "_o";
        String string3 = "_sn";
        Object object3 = CollectionUtils.listOf(string2, string3, "_sc", "_si");
        String string4 = zzgf$zzh$zza.zzf();
        int n4 = zzpn.zzf(string4);
        boolean bl3 = true;
        if (n4 == 0 && (n3 = zzpn.zzf((String)object)) == 0) {
            object = this.zze();
            n3 = ((zzai)object).zza((String)object2, bl3);
        } else {
            object = this.zze();
            n3 = ((zzai)object).zzb((String)object2, bl3);
        }
        long l2 = n3;
        object = zzgf$zzh$zza.zzg();
        string4 = zzgf$zzh$zza.zzg();
        n4 = string4.length();
        n3 = ((String)object).codePointCount(0, n4);
        long l3 = n3;
        this.zzq();
        object = zzgf$zzh$zza.zzf();
        this.zze();
        object = zzpn.zza((String)object, 40, bl3);
        n4 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n4 > 0 && !(bl2 = object3.contains(string4 = zzgf$zzh$zza.zzf()))) {
            string4 = "_ev";
            object3 = zzgf$zzh$zza.zzf();
            bl2 = string4.equals(object3);
            if (bl2) {
                this.zzq();
                object = zzgf$zzh$zza.zzg();
                int n7 = this.zze().zzb((String)object2, bl3);
                object = zzpn.zza((String)object, n7, bl3);
                bundle.putString(string4, (String)object);
                return;
            }
            object2 = this.zzj().zzw();
            object3 = l3;
            string2 = "Param value is too long; discarded. Name, value length";
            ((zzgq)object2).zza(string2, object, object3);
            object2 = "_err";
            long l4 = bundle.getLong((String)object2);
            long l7 = 0L;
            bl2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (!bl2) {
                l4 = 4;
                bundle.putLong((String)object2, l4);
                object2 = bundle.getString(string4);
                if (object2 == null) {
                    bundle.putString(string4, (String)object);
                    object = "_el";
                    bundle.putLong((String)object, l3);
                }
            }
            object = zzgf$zzh$zza.zzf();
            bundle.remove((String)object);
        }
    }

    private final void zza(String string2, zzjj zzjj2) {
        this.zzl().zzv();
        this.zzt();
        this.zzac.put(string2, zzjj2);
        this.zzf().zzb(string2, zzjj2);
    }

    private final void zza(String object, boolean bl2, Long l2, Long l3) {
        zzar zzar2 = this.zzf();
        object = zzar2.zzd((String)object);
        if (object != null) {
            ((zzh)object).zzd(bl2);
            ((zzh)object).zza(l2);
            ((zzh)object).zzb(l3);
            bl2 = ((zzh)object).zzas();
            if (bl2) {
                zzar zzar3 = this.zzf();
                l2 = null;
                zzar3.zza((zzh)object, false, false);
            }
        }
    }

    private final void zza(List list) {
        boolean bl2 = list.isEmpty() ^ true;
        Preconditions.checkArgument(bl2);
        ArrayList arrayList = this.zzz;
        if (arrayList != null) {
            this.zzj().zzg().zza("Set uploading progress before finishing the previous upload");
            return;
        }
        this.zzz = arrayList = new ArrayList(list);
    }

    private final boolean zza(int n3, FileChannel object) {
        block9: {
            IOException iOException2;
            block11: {
                block10: {
                    int n4;
                    this.zzl().zzv();
                    if (object == null || (n4 = ((AbstractInterruptibleChannel)object).isOpen()) == 0) break block9;
                    n4 = 4;
                    Object object2 = ByteBuffer.allocate(n4);
                    ((ByteBuffer)object2).putInt(n3);
                    ((ByteBuffer)object2).flip();
                    long l2 = 0L;
                    try {
                        ((FileChannel)object).truncate(l2);
                    }
                    catch (IOException iOException2) {}
                    ((FileChannel)object).write((ByteBuffer)object2);
                    n3 = 1;
                    ((FileChannel)object).force(n3 != 0);
                    long l3 = ((FileChannel)object).size();
                    long l4 = 4;
                    long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                    if (l7 == false) break block10;
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzg();
                    String string2 = "Error writing to channel. Bytes written";
                    l4 = ((FileChannel)object).size();
                    object = l4;
                    ((zzgq)object2).zza(string2, object);
                    break block11;
                }
                return n3 != 0;
            }
            this.zzj().zzg().zza("Failed to write to channel", iOException2);
            return false;
        }
        this.zzj().zzg().zza("Bad channel to read from");
        return false;
    }

    private final boolean zza(zzgf$zzf$zza zzgf$zzf$zza, zzgf$zzf$zza object) {
        Object object2 = zzgf$zzf$zza.zze();
        String string2 = "_e";
        boolean bl2 = string2.equals(object2);
        Preconditions.checkArgument(bl2);
        this.zzp();
        object2 = zzpj.zza((zzgf$zzf)((zzkg)zzgf$zzf$zza.zzaj()), "_sc");
        boolean bl3 = false;
        String string3 = null;
        if (object2 == null) {
            bl2 = false;
            object2 = null;
        } else {
            object2 = ((zzgf$zzh)object2).zzh();
        }
        this.zzp();
        zzkg zzkg2 = (zzgf$zzf)((zzkg)((zzkg$zza)object).zzaj());
        String string4 = "_pc";
        zzkg2 = zzpj.zza((zzgf$zzf)zzkg2, string4);
        if (zzkg2 != null) {
            string3 = ((zzgf$zzh)zzkg2).zzh();
        }
        if (string3 != null && (bl2 = string3.equals(object2))) {
            long l2;
            long l3;
            long l4;
            long l7;
            object2 = zzgf$zzf$zza.zze();
            bl2 = string2.equals(object2);
            Preconditions.checkArgument(bl2);
            this.zzp();
            object2 = (zzgf$zzf)((zzkg)zzgf$zzf$zza.zzaj());
            string2 = "_et";
            object2 = zzpj.zza((zzgf$zzf)object2, string2);
            if (object2 != null && (bl3 = ((zzgf$zzh)object2).zzl()) && (l7 = (l4 = (l3 = ((zzgf$zzh)object2).zzd()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                long l8;
                long l12;
                long l14;
                l3 = ((zzgf$zzh)object2).zzd();
                this.zzp();
                object2 = zzpj.zza((zzgf$zzf)((zzkg)((zzkg$zza)object).zzaj()), string2);
                if (object2 != null && (l14 = (l12 = (l8 = ((zzgf$zzh)object2).zzd()) - l2) == 0L ? 0 : (l12 < 0L ? -1 : 1)) > 0) {
                    l2 = ((zzgf$zzh)object2).zzd();
                    l3 += l2;
                }
                this.zzp();
                object2 = l3;
                zzpj.zza((zzgf$zzf$zza)object, string2, object2);
                this.zzp();
                long l15 = 1L;
                object = l15;
                object2 = "_fr";
                zzpj.zza(zzgf$zzf$zza, (String)object2, object);
            }
            return true;
        }
        return false;
    }

    private final boolean zza(String object, String string2) {
        long l2;
        long l3;
        long l4;
        long l7;
        zzar zzar2 = this.zzf();
        object = zzar2.zzd((String)object, string2);
        return object == null || (l7 = (l4 = (l3 = ((zzbh)object).zzc) - (l2 = 1L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0;
        {
        }
    }

    private final zzgy zzaa() {
        Object object = this.zze;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Network broadcast receiver not created");
        throw object;
    }

    private final zzoi zzab() {
        return (zzoi)zzou.zza(this.zzf);
    }

    private final void zzac() {
        Iterator iterator = this.zzl();
        ((zzhv)((Object)iterator)).zzv();
        boolean bl2 = this.zzu;
        if (!(bl2 || (bl2 = this.zzv) || (bl2 = this.zzw))) {
            boolean bl3;
            iterator = this.zzj().zzq();
            Object object = "Stopping uploading service(s)";
            ((zzgq)((Object)iterator)).zza((String)object);
            iterator = this.zzq;
            if (iterator == null) {
                return;
            }
            iterator = iterator.iterator();
            while (bl3 = iterator.hasNext()) {
                object = (Runnable)iterator.next();
                object.run();
            }
            ((List)Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        iterator = this.zzj().zzq();
        Boolean bl4 = this.zzu;
        Boolean bl5 = this.zzv;
        Boolean bl6 = this.zzw;
        ((zzgq)((Object)iterator)).zza("Not stopping services. fetch, network, upload", bl4, bl5, bl6);
    }

    private final void zzad() {
        this.zzl().zzv();
        Iterator iterator = zzbn.zzbv;
        boolean bl2 = false;
        String string2 = null;
        iterator = (Integer)((zzfx)((Object)iterator)).zza(null);
        int n3 = (Integer)((Object)iterator);
        if (n3 > 0) {
            this.zzae();
            return;
        }
        iterator = this.zzr.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            zzai zzai2;
            string2 = (String)iterator.next();
            boolean bl3 = com.google.android.gms.internal.measurement.zzoy.zza();
            if (!bl3 || !(bl3 = (zzai2 = this.zze()).zze(string2, (zzfx)(object = zzbn.zzcp)))) continue;
            this.zzj().zzc().zza("Notifying app that trigger URIs are available. App ID", string2);
            zzai2 = new Intent();
            object = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE";
            zzai2.setAction((String)object);
            zzai2.setPackage(string2);
            string2 = this.zzm.zza();
            string2.sendBroadcast((Intent)zzai2);
        }
        this.zzr.clear();
    }

    private final void zzae() {
        this.zzl().zzv();
        Object object = this.zzr;
        boolean bl2 = object.isEmpty();
        if (!bl2 && !(bl2 = ((zzbb)(object = this.zzz())).zzc())) {
            object = this.zzb();
            long l2 = object.elapsedRealtime();
            long l3 = this.zzaj;
            l2 -= l3;
            int n3 = (Integer)zzbn.zzbv.zza(null);
            l3 = (long)n3 - l2;
            l2 = Math.max(0L, l3);
            Object object2 = this.zzj().zzq();
            Long l4 = l2;
            String string2 = "Scheduling notify next app runnable, delay in ms";
            ((zzgq)object2).zza(string2, l4);
            object2 = this.zzz();
            ((zzbb)object2).zza(l2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzaf() {
        var1_1 = this;
        var2_2 = this.zzl();
        var2_2.zzv();
        this.zzt();
        var3_3 = this.zzp;
        var5_4 = 0L;
        var7_5 = var3_3 == var5_4 ? 0 : (var3_3 < var5_4 ? -1 : 1);
        if (var7_5 > 0) {
            var2_2 = this.zzb();
            var3_3 = var2_2.elapsedRealtime();
            var8_6 = this.zzp;
            cfr_temp_0 = (var8_6 = 3600000L - (var3_3 = Math.abs(var3_3 - var8_6))) - var5_4;
            var10_7 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var10_7 /* !! */  > 0) {
                var2_2 = this.zzj().zzq();
                var11_8 = var8_6;
                var2_2.zza("Upload has been suspended. Will update scheduling later in approximately ms", var11_8);
                this.zzaa().zzb();
                this.zzab().zzr();
                return;
            }
            this.zzp = var5_4;
        }
        if ((var10_7 /* !! */  = (var2_2 = var1_1.zzm).zzah()) != 0 && (var10_7 /* !! */  = this.zzag()) != 0) {
            var2_2 = this.zzb();
            var3_3 = var2_2.currentTimeMillis();
            this.zze();
            var12_10 = zzbn.zzaj;
            var13_11 = 0;
            var14_12 = null;
            var15_13 = (Long)var12_10.zza(null);
            var15_13 = Math.max(var5_4, var15_13);
            var12_10 = this.zzf();
            var7_5 = (long)var12_10.zzaa();
            if (var7_5 == false && (var7_5 = (long)(var12_10 = this.zzf()).zzz()) == false) {
                var7_5 = 0;
                var12_10 = null;
            } else {
                var7_5 = 1;
            }
            if (var7_5 != false) {
                var17_14 = this.zze().zzp();
                var18_15 = TextUtils.isEmpty((CharSequence)var17_14);
                if (!var18_15 && !(var20_17 = (var19_16 = ".none.").equals(var17_14))) {
                    this.zze();
                    var17_14 = (Long)zzbn.zzae.zza(null);
                    var21_18 = var17_14.longValue();
                    var21_18 = Math.max(var5_4, var21_18);
                } else {
                    this.zze();
                    var17_14 = (Long)zzbn.zzad.zza(null);
                    var21_18 = var17_14.longValue();
                    var21_18 = Math.max(var5_4, var21_18);
                }
            } else {
                this.zze();
                var17_14 = (Long)zzbn.zzac.zza(null);
                var21_18 = var17_14.longValue();
                var21_18 = Math.max(var5_4, var21_18);
            }
            var23_19 = var1_1.zzj.zzd;
            var24_20 = var23_19.zza();
            var26_21 = var1_1.zzj.zze;
            var27_22 = var26_21.zza();
            var29_23 = this.zzf();
            var30_24 = var21_18;
            var32_25 = var29_23.d_();
            var19_16 = this.zzf();
            var34_26 = var19_16.e_();
            var34_26 = Math.max(var32_25, var34_26);
            var36_27 = var34_26 == var5_4 ? 0 : (var34_26 < var5_4 ? -1 : 1);
            if (var36_27 == false) {
                while (true) {
                    var21_18 = var5_4;
                    break;
                }
            } else {
                var34_26 = Math.abs(var34_26 - var3_3);
                var34_26 = var3_3 - var34_26;
                var37_30 = Math.abs(var24_20 -= var3_3);
                var37_30 = var3_3 - var37_30;
                var21_18 = Math.abs(var27_22 -= var3_3);
                var37_30 = Math.max(var37_30, var3_3 -= var21_18);
                var21_18 = var34_26 + var15_13;
                if (var7_5 != false && (var7_5 = var37_30 == var5_4 ? 0 : (var37_30 < var5_4 ? -1 : 1)) > 0) {
                    var21_18 = Math.min(var34_26, var37_30) + var30_24;
                }
                var12_10 = this.zzp();
                var24_20 = var30_24;
                var7_5 = (long)var12_10.zza(var37_30, var30_24);
                if (var7_5 == false) {
                    var21_18 = var37_30 + var30_24;
                }
                if ((var7_5 = var3_3 == var5_4 ? 0 : (var3_3 < var5_4 ? -1 : 1)) != false && (var7_5 = var3_3 == var34_26 ? 0 : (var3_3 < var34_26 ? -1 : 1)) >= 0) {
                    var7_5 = 0;
                    var12_10 = null;
                    while (true) {
                        this.zze();
                        var14_12 = zzbn.zzal;
                        var39_28 = false;
                        var40_29 = null;
                        var14_12 = (Integer)var14_12.zza(null);
                        var13_11 = var14_12.intValue();
                        var36_27 = 0;
                        var13_11 = Math.max(0, var13_11);
                        if (var7_5 >= (var13_11 = Math.min(var41_31 = 20, var13_11))) ** continue;
                        var24_20 = 1L << var7_5;
                        this.zze();
                        var14_12 = (Long)zzbn.zzak.zza(null);
                        var34_26 = var14_12.longValue();
                        var34_26 = Math.max(var5_4, var34_26) * var24_20;
                        cfr_temp_1 = (var21_18 += var34_26) - var3_3;
                        var13_11 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var13_11 > 0) break;
                        ++var7_5;
                    }
                }
            }
            var10_7 /* !! */  = (int)(var21_18 == var5_4 ? 0 : (var21_18 < var5_4 ? -1 : 1));
            if (var10_7 /* !! */  == 0) {
                this.zzj().zzq().zza("Next upload time is 0");
                this.zzaa().zzb();
                this.zzab().zzr();
                return;
            }
            var2_2 = this.zzh();
            var10_7 /* !! */  = (int)var2_2.zzr();
            if (var10_7 /* !! */  == 0) {
                this.zzj().zzq().zza("No network");
                this.zzaa().zza();
                this.zzab().zzr();
                return;
            }
            var2_2 = var1_1.zzj.zzc;
            var3_3 = var2_2.zza();
            this.zze();
            var12_10 = zzbn.zzaa;
            var13_11 = 0;
            var14_12 = null;
            var12_10 = (Long)var12_10.zza(null);
            var8_6 = var12_10.longValue();
            var8_6 = Math.max(var5_4, var8_6);
            var40_29 = this.zzp();
            var39_28 = var40_29.zza(var3_3, var8_6);
            if (!var39_28) {
                var21_18 = Math.max(var21_18, var3_3 += var8_6);
            }
            this.zzaa().zzb();
            var2_2 = this.zzb();
            var3_3 = var2_2.currentTimeMillis();
            cfr_temp_2 = (var21_18 -= var3_3) - var5_4;
            var10_7 /* !! */  = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
            if (var10_7 /* !! */  <= 0) {
                this.zze();
                var3_3 = (Long)zzbn.zzaf.zza(null);
                var21_18 = Math.max(var5_4, var3_3);
                var2_2 = var1_1.zzj.zzd;
                var11_9 = this.zzb();
                var42_32 = var11_9.currentTimeMillis();
                var2_2.zza(var42_32);
            }
            var2_2 = this.zzj().zzq();
            var11_9 = var21_18;
            var2_2.zza("Upload scheduled in approximately ms", var11_9);
            this.zzab().zza(var21_18);
            return;
        }
        this.zzj().zzq().zza("Nothing to upload or uploading impossible");
        this.zzaa().zzb();
        this.zzab().zzr();
    }

    private final boolean zzag() {
        this.zzl().zzv();
        this.zzt();
        Object object = this.zzf();
        boolean bl2 = ((zzar)object).zzy();
        return bl2 || !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.zzf().g_())));
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzah() {
        FileNotFoundException fileNotFoundException2;
        String string2;
        block8: {
            IOException iOException2;
            block7: {
                OverlappingFileLockException overlappingFileLockException2;
                block6: {
                    boolean bl2;
                    this.zzl().zzv();
                    Object object = this.zzx;
                    boolean bl3 = true;
                    string2 = "Storage concurrent access okay";
                    if (object != null && (bl2 = ((FileLock)object).isValid())) {
                        this.zzj().zzq().zza(string2);
                        return bl3;
                    }
                    object = this.zzm.zza().getFilesDir();
                    Object object2 = zzcf.zza();
                    String string3 = "google_app_measurement.db";
                    object = object2.zza((File)object, string3);
                    File file = new File((String)object);
                    try {
                        object2 = "rw";
                        object = new RandomAccessFile(file, (String)object2);
                        this.zzy = object = ((RandomAccessFile)object).getChannel();
                        this.zzx = object = ((FileChannel)object).tryLock();
                        if (object != null) {
                            object = this.zzj();
                            object = ((zzgo)object).zzq();
                            ((zzgq)object).zza(string2);
                            return bl3;
                        }
                    }
                    catch (OverlappingFileLockException overlappingFileLockException2) {
                        break block6;
                    }
                    catch (IOException iOException2) {
                        break block7;
                    }
                    catch (FileNotFoundException fileNotFoundException2) {
                        break block8;
                    }
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    String string4 = "Storage concurrent data access panic";
                    ((zzgq)object).zza(string4);
                    return false;
                }
                zzgq zzgq2 = this.zzj().zzr();
                string2 = "Storage lock already acquired";
                zzgq2.zza(string2, overlappingFileLockException2);
                return false;
            }
            zzgq zzgq3 = this.zzj().zzg();
            string2 = "Failed to access storage lock file";
            zzgq3.zza(string2, iOException2);
            return false;
        }
        zzgq zzgq4 = this.zzj().zzg();
        string2 = "Failed to acquire storage lock";
        zzgq4.zza(string2, fileNotFoundException2);
        return false;
    }

    public static /* bridge */ /* synthetic */ Deque zzb(zzou zzou2) {
        return zzou2.zzr;
    }

    private final void zzb(zzbl object, zzp zzp2) {
        String string2;
        Preconditions.checkNotEmpty(zzp2.zza);
        object = zzgs.zza((zzbl)object);
        Object object2 = this.zzq();
        Object object3 = ((zzgs)object).zzc;
        Object object4 = this.zzf();
        String string3 = zzp2.zza;
        object4 = ((zzar)object4).zzc(string3);
        ((zzpn)object2).zza((Bundle)object3, (Bundle)object4);
        object2 = this.zzq();
        object3 = this.zze();
        object4 = zzp2.zza;
        int n3 = ((zzai)object3).zzb((String)object4);
        ((zzpn)object2).zza((zzgs)object, n3);
        object = ((zzgs)object).zza();
        object2 = ((zzbl)object).zza;
        object3 = "_cmp";
        boolean bl2 = ((String)object3).equals(object2);
        if (bl2 && (bl2 = ((String)(object3 = "referrer API v2")).equals(object2 = ((zzbl)object).zzb.zzd("_cis"))) && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((zzbg)(object2 = ((zzbl)object).zzb)).zzd((String)(object3 = "gclid")))))) {
            long l2 = ((zzbl)object).zzd;
            String string4 = "auto";
            string3 = "_lgclid";
            object4 = object2;
            object2 = new zzpm(string3, l2, string2, string4);
            this.zza((zzpm)object2, zzp2);
        }
        this.zza((zzbl)object, zzp2);
    }

    private final void zzb(zzh object) {
        Object object2;
        Object object3;
        this.zzl().zzv();
        Object object4 = ((zzh)object).zzah();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object4);
        if (bl2 && (bl2 = TextUtils.isEmpty((CharSequence)(object4 = ((zzh)object).zzaa())))) {
            Object object5 = object = Preconditions.checkNotNull(((zzh)object).zzac());
            object5 = (String)object;
            object4 = this;
            this.zza((String)object5, 204, (Throwable)null, (byte[])null, (Map)null);
            return;
        }
        object4 = (String)Preconditions.checkNotNull(((zzh)object).zzac());
        this.zzj().zzq().zza("Fetching remote configuration", object4);
        Object object6 = this.zzi().zzc((String)object4);
        Object object7 = this.zzi().zze((String)object4);
        Object object8 = null;
        if (object6 != null) {
            boolean bl3 = TextUtils.isEmpty((CharSequence)object7);
            if (!bl3) {
                object6 = new Jp();
                object3 = "If-Modified-Since";
                ((a53)object6).put(object3, object7);
            } else {
                bl3 = false;
                object6 = null;
            }
            object7 = this.zzi();
            object4 = ((zzhm)object7).zzd((String)object4);
            boolean bl4 = TextUtils.isEmpty((CharSequence)object4);
            if (!bl4) {
                if (object6 == null) {
                    object6 = new Jp();
                }
                object7 = "If-None-Match";
                object6.put(object7, object4);
            }
            object2 = object6;
        } else {
            object2 = null;
        }
        this.zzu = bl2 = true;
        object4 = this.zzh();
        zzox zzox2 = new zzox(this);
        ((zzgv)object4).zzv();
        ((zzot)object4).zzam();
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(zzox2);
        object6 = new Uri.Builder();
        object7 = ((zzh)object).zzah();
        boolean bl5 = TextUtils.isEmpty((CharSequence)object7);
        if (bl5) {
            object7 = ((zzh)object).zzaa();
        }
        object3 = (String)zzbn.zze.zza(null);
        object3 = object6.scheme((String)object3);
        object8 = (String)zzbn.zzf.zza(null);
        object8 = object3.encodedAuthority((String)object8);
        Object object9 = "config/app/";
        object3 = new StringBuilder((String)object9);
        ((StringBuilder)object3).append((String)object7);
        object7 = ((StringBuilder)object3).toString();
        object7 = object8.path((String)object7).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "114010");
        object8 = "runtime_version";
        object3 = "0";
        object7.appendQueryParameter((String)object8, (String)object3);
        object6 = object6.build().toString();
        object7 = new URI((String)object6);
        URL uRL = ((URI)object7).toURL();
        object7 = ((zzgv)object4).zzl();
        String string2 = ((zzh)object).zzac();
        object3 = object8;
        object9 = object4;
        object8 = new zzgw((zzgv)object4, string2, uRL, null, (Map)object2, zzox2);
        try {
            ((zzhv)object7).zza((Runnable)object8);
            return;
        }
        catch (IllegalArgumentException | MalformedURLException | URISyntaxException exception) {
            object4 = ((zzgv)object4).zzj().zzg();
            object = zzgo.zza(((zzh)object).zzac());
            ((zzgq)object4).zza("Failed to parse config URL. Not fetching. appId", object, object6);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private final boolean zzb(String var1_1, long var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [18, 17 : 192->196)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private final zzp zzc(String string2) {
        Object object;
        boolean bl2;
        Object object2 = string2;
        zzh zzh2 = this.zzf().zzd(string2);
        if (zzh2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = zzh2.zzaf())))) {
            object = this.zza(zzh2);
            if (object != null && !(bl2 = ((Boolean)object).booleanValue())) {
                object = this.zzj().zzg();
                object2 = zzgo.zza(string2);
                ((zzgq)object).zza("App version does not match; dropping. appId", object2);
                return null;
            }
            object = zzh2.zzah();
            String string3 = zzh2.zzaf();
            long l2 = zzh2.zze();
            String string4 = zzh2.zzae();
            long l3 = zzh2.zzq();
            long l4 = zzh2.zzn();
            boolean bl3 = zzh2.zzar();
            String string5 = zzh2.zzag();
            boolean bl4 = zzh2.zzaq();
            String string6 = zzh2.zzaa();
            Boolean bl5 = zzh2.zzx();
            long l7 = zzh2.zzo();
            List list = zzh2.zzan();
            String string7 = this.zzb(string2).zzf();
            boolean bl6 = zzh2.zzat();
            long l8 = zzh2.zzw();
            int n3 = this.zzb(string2).zza();
            String string8 = this.zzd(string2).zzf();
            int n4 = zzh2.zza();
            long l12 = zzh2.zzf();
            String string9 = zzh2.zzam();
            String string10 = zzh2.zzak();
            int n7 = zzh2.zzb();
            long l14 = 0L;
            object2 = string2;
            zzp zzp2 = new zzp(string2, (String)object, string3, l2, string4, l3, l4, null, bl3, false, string5, l14, 0, bl4, false, string6, bl5, l7, list, null, string7, "", null, bl6, l8, n3, string8, n4, l12, string9, string10, 0L, n7);
            return zzp2;
        }
        this.zzj().zzc().zza("No app data available; dropping", object2);
        return null;
    }

    /*
     * Exception decompiling
     */
    private final void zzc(zzbl var1_1, zzp var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 830->835)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void zzc(zzou zzou2) {
        zzou2.zzae();
    }

    private final zzbd zzd(String string2) {
        this.zzl().zzv();
        this.zzt();
        zzbd zzbd2 = (zzbd)this.zzad.get(string2);
        if (zzbd2 == null) {
            zzbd2 = this.zzf().zzf(string2);
            Map map2 = this.zzad;
            map2.put(string2, zzbd2);
        }
        return zzbd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(String object) {
        zzgf$zzj zzgf$zzj;
        Throwable throwable2;
        long l2;
        Object object2;
        boolean bl2;
        Object object3;
        block16: {
            block15: {
                block14: {
                    boolean bl3;
                    block13: {
                        block12: {
                            object3 = this.zzl();
                            ((zzhv)object3).zzv();
                            this.zzt();
                            this.zzw = bl2 = true;
                            try {
                                object2 = this.zzm;
                                object2 = ((zzic)object2).zzt();
                                object2 = ((zzme)object2).zzad();
                                if (object2 == null) {
                                    object = this.zzj();
                                    object = ((zzgo)object).zzr();
                                    object3 = "Upload data called on the client side before use of service was decided";
                                    ((zzgq)object).zza((String)object3);
                                    this.zzw = false;
                                    this.zzac();
                                    return;
                                }
                                bl3 = (Boolean)object2;
                                if (bl3) {
                                    object = this.zzj();
                                    object = ((zzgo)object).zzg();
                                    object3 = "Upload called in the client side when service should be used";
                                    ((zzgq)object).zza((String)object3);
                                    this.zzw = false;
                                    this.zzac();
                                    return;
                                }
                                long l3 = this.zzp;
                                long l4 = 0L;
                                l2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                                if (l2 <= 0) break block12;
                                this.zzaf();
                                this.zzw = false;
                                this.zzac();
                                return;
                            }
                            catch (Throwable throwable2) {}
                        }
                        object2 = this.zzh();
                        bl3 = ((zzgv)object2).zzr();
                        if (bl3) break block13;
                        object = this.zzj();
                        object = ((zzgo)object).zzq();
                        object3 = "Network not connected, ignoring upload request";
                        ((zzgq)object).zza((String)object3);
                        this.zzaf();
                        this.zzw = false;
                        this.zzac();
                        return;
                    }
                    object2 = this.zzf();
                    bl3 = ((zzar)object2).zzq((String)object);
                    if (bl3) break block14;
                    object3 = this.zzj();
                    object3 = ((zzgo)object3).zzq();
                    object2 = "Upload queue has no batches for appId";
                    ((zzgq)object3).zza((String)object2, object);
                    this.zzw = false;
                    this.zzac();
                    return;
                }
                object2 = this.zzf();
                object2 = ((zzar)object2).zzi((String)object);
                if (object2 != null) break block15;
                this.zzw = false;
                this.zzac();
                return;
            }
            zzgf$zzj = ((zzpi)object2).zzd();
            if (zzgf$zzj != null) break block16;
            this.zzw = false;
            this.zzac();
            return;
        }
        Object object4 = zzgf$zzj.zzce();
        Object object5 = this.zzj();
        l2 = 2;
        boolean bl4 = ((zzgo)object5).zza((int)l2);
        if (bl4) {
            object5 = this.zzp();
            object5 = ((zzpj)object5).zza(zzgf$zzj);
            Object object6 = this.zzj();
            object6 = ((zzgo)object6).zzq();
            String string2 = "Uploading data from upload queue. appId, uncompressed size, data";
            int n3 = ((byte[])object4).length;
            object4 = n3;
            ((zzgq)object6).zza(string2, object, object4, object5);
        }
        this.zzv = bl2;
        object3 = this.zzh();
        object4 = ((zzpi)object2).zzc();
        object5 = new zzoy(this, (String)object, (zzpi)object2);
        ((zzgv)object3).zza((String)object, (zzov)object4, zzgf$zzj, (zzgu)object5);
        this.zzw = false;
        this.zzac();
        return;
        this.zzw = false;
        this.zzac();
        throw throwable2;
    }

    private final boolean zzf(String object) {
        Map map2 = this.zzaf;
        if ((object = (zzou$zzb)map2.get(object)) == null) {
            return true;
        }
        return ((zzou$zzb)object).zzb();
    }

    private static Boolean zzh(zzp object) {
        Boolean bl2;
        block0: {
            block1: {
                block2: {
                    block3: {
                        bl2 = ((zzp)object).zzq;
                        Object object2 = ((zzp)object).zzad;
                        Object object3 = TextUtils.isEmpty((CharSequence)object2);
                        if (object3 != 0) break block0;
                        object = com.google.android.gms.measurement.internal.zzd.zza(((zzp)object).zzad).zza();
                        object2 = zzpe.zza;
                        Object object4 = ((Enum)object).ordinal();
                        object3 = 1;
                        if ((object4 = (Object)object2[object4]) == object3) break block1;
                        object3 = 2;
                        if (object4 == object3) break block2;
                        object3 = 3;
                        if (object4 == object3) break block3;
                        object3 = 4;
                        if (object4 == object3) break block1;
                        break block0;
                    }
                    bl2 = Boolean.TRUE;
                    break block0;
                }
                bl2 = Boolean.FALSE;
                break block0;
            }
            bl2 = null;
        }
        return bl2;
    }

    private static boolean zzi(zzp object) {
        boolean bl2;
        String string2 = ((zzp)object).zzb;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        return !bl3 || !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((zzp)object).zzp)));
        {
        }
    }

    private final long zzy() {
        Clock clock = this.zzb();
        long l2 = clock.currentTimeMillis();
        Object object = this.zzj;
        ((zzot)object).zzam();
        ((zznp)object).zzv();
        Object object2 = ((zznp)object).zzf;
        long l3 = ((zzhf)object2).zza();
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 == false) {
            object2 = ((zznp)object).zzs().zzw();
            int n3 = 86400000;
            int n4 = ((Random)object2).nextInt(n3);
            l3 = n4;
            l4 = 1L;
            object = ((zznp)object).zzf;
            ((zzhf)object).zza(l3 += l4);
        }
        l2 = (l2 + l3) / 1000L;
        long l8 = 60;
        return l2 / l8 / l8 / (long)24;
    }

    private final zzbb zzz() {
        zzbb zzbb2 = this.zzai;
        if (zzbb2 == null) {
            zzic zzic2 = this.zzm;
            this.zzai = zzbb2 = new zzpb(this, zzic2);
        }
        return this.zzai;
    }

    public final Context zza() {
        return this.zzm.zza();
    }

    public final Bundle zza(String object) {
        int n3;
        this.zzl().zzv();
        this.zzt();
        zzgc$zza zzgc$zza = this.zzi().zzb((String)object);
        if (zzgc$zza == null) {
            return null;
        }
        zzgc$zza = new Bundle();
        Object object2 = this.zzb((String)object);
        Object object3 = ((zzjj)object2).zzb();
        zzgc$zza.putAll((Bundle)object3);
        object3 = this.zzd((String)object);
        zzan zzan2 = new zzan();
        object2 = this.zza((String)object, (zzbd)object3, (zzjj)object2, zzan2).zzb();
        zzgc$zza.putAll((Bundle)object2);
        object2 = this.zzf();
        object3 = "_npa";
        object2 = ((zzar)object2).zze((String)object, (String)object3);
        if (object2 != null) {
            object = ((zzpo)object2).zze;
            long l2 = 1L;
            object2 = l2;
            n3 = (int)(object.equals(object2) ? 1 : 0);
        } else {
            object2 = new zzan();
            n3 = this.zza((String)object, (zzan)object2);
        }
        int n4 = 1;
        object = n3 == n4 ? "denied" : "granted";
        zzgc$zza.putString("ad_personalization", (String)object);
        return zzgc$zza;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final zzh zza(zzp object) {
        int n3;
        long l2;
        long l3;
        long l4;
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3;
        Object object4;
        int n4;
        Object object5;
        block26: {
            Object object6;
            block23: {
                block24: {
                    block25: {
                        boolean bl4;
                        block22: {
                            String string2;
                            this.zzl().zzv();
                            this.zzt();
                            Preconditions.checkNotNull(object);
                            Preconditions.checkNotEmpty(((zzp)object).zza);
                            object5 = ((zzp)object).zzu;
                            boolean bl5 = ((String)object5).isEmpty();
                            n4 = 0;
                            object4 = null;
                            if (!bl5) {
                                object5 = this.zzae;
                                object6 = ((zzp)object).zza;
                                string2 = ((zzp)object).zzu;
                                object3 = new zzou$zzc(this, string2, null);
                                object5.put(object6, object3);
                            }
                            object5 = this.zzf();
                            object6 = ((zzp)object).zza;
                            object5 = ((zzar)object5).zzd((String)object6);
                            object6 = ((zzp)object).zza;
                            object6 = this.zzb((String)object6);
                            object3 = zzjj.zzb(((zzp)object).zzt);
                            bl3 = ((zzjj)(object6 = ((zzjj)object6).zza((zzjj)object3))).zzg();
                            if (bl3) {
                                object3 = this.zzj;
                                string2 = ((zzp)object).zza;
                                bl4 = ((zzp)object).zzn;
                                object3 = ((zznp)object3).zza(string2, bl4);
                            } else {
                                object3 = "";
                            }
                            string2 = null;
                            if (object5 != null) break block22;
                            object2 = this.zzm;
                            String string3 = ((zzp)object).zza;
                            object5 = new zzh((zzic)object2, string3);
                            bl4 = ((zzjj)object6).zzh();
                            if (bl4) {
                                object2 = this.zza((zzjj)object6);
                                ((zzh)object5).zzb((String)object2);
                            }
                            if (bl2 = ((zzjj)object6).zzg()) {
                                ((zzh)object5).zzh((String)object3);
                            }
                            break block23;
                        }
                        bl4 = ((zzjj)object6).zzg();
                        if (!bl4 || object3 == null || (bl4 = ((String)object3).equals(object2 = ((zzh)object5).zzaj()))) break block24;
                        object2 = ((zzh)object5).zzaj();
                        bl4 = TextUtils.isEmpty((CharSequence)object2);
                        ((zzh)object5).zzh((String)object3);
                        bl3 = ((zzp)object).zzn;
                        if (!bl3) break block25;
                        object3 = this.zzj;
                        String string4 = ((zzp)object).zza;
                        string4 = "00000000-0000-0000-0000-000000000000";
                        object3 = ((zznp)object3).zza((String)string4, (zzjj)object6).first;
                        bl3 = string4.equals(object3);
                        if (bl3 || bl4) break block25;
                        bl3 = ((zzjj)object6).zzh();
                        if (bl3) {
                            object6 = this.zza((zzjj)object6);
                            ((zzh)object5).zzb((String)object6);
                            bl2 = false;
                            object6 = null;
                        } else {
                            bl2 = true;
                        }
                        object3 = this.zzf();
                        object2 = ((zzp)object).zza;
                        string4 = "_id";
                        object3 = ((zzar)object3).zze((String)object2, string4);
                        if (object3 != null) {
                            object3 = this.zzf();
                            object2 = ((zzp)object).zza;
                            string4 = "_lair";
                            if ((object3 = ((zzar)object3).zze((String)object2, string4)) == null) {
                                long l7 = this.zzb().currentTimeMillis();
                                string4 = ((zzp)object).zza;
                                l4 = 1L;
                                Long l8 = l4;
                                String string5 = "auto";
                                String string6 = "_lair";
                                object2 = object3;
                                object3 = new zzpo(string4, string5, string6, l7, l8);
                                object2 = this.zzf();
                                ((zzar)object2).zza((zzpo)object3);
                            }
                        }
                        break block26;
                    }
                    if ((bl3 = TextUtils.isEmpty((CharSequence)(object3 = ((zzh)object5).zzad()))) && (bl3 = ((zzjj)object6).zzh())) {
                        object6 = this.zza((zzjj)object6);
                        ((zzh)object5).zzb((String)object6);
                    }
                    break block23;
                }
                object3 = ((zzh)object5).zzad();
                bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (bl3 && (bl3 = ((zzjj)object6).zzh())) {
                    object6 = this.zza((zzjj)object6);
                    ((zzh)object5).zzb((String)object6);
                }
            }
            bl2 = false;
            object6 = null;
        }
        object3 = ((zzp)object).zzb;
        ((zzh)object5).zzf((String)object3);
        object3 = ((zzp)object).zzp;
        ((zzh)object5).zza((String)object3);
        object3 = ((zzp)object).zzk;
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = ((zzp)object).zzk;
            ((zzh)object5).zze((String)object3);
        }
        if (bl3 = (l3 = (l2 = ((zzp)object).zze) - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) {
            ((zzh)object5).zzn(l2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(object3 = ((zzp)object).zzc)))) {
            object3 = ((zzp)object).zzc;
            ((zzh)object5).zzd((String)object3);
        }
        l2 = ((zzp)object).zzj;
        ((zzh)object5).zzb(l2);
        object3 = ((zzp)object).zzd;
        if (object3 != null) {
            ((zzh)object5).zzc((String)object3);
        }
        l2 = ((zzp)object).zzf;
        ((zzh)object5).zzk(l2);
        bl3 = ((zzp)object).zzh;
        ((zzh)object5).zzb(bl3);
        object3 = ((zzp)object).zzg;
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = ((zzp)object).zzg;
            ((zzh)object5).zzg((String)object3);
        }
        bl3 = ((zzp)object).zzn;
        ((zzh)object5).zza(bl3);
        object3 = ((zzp)object).zzq;
        ((zzh)object5).zza((Boolean)object3);
        l2 = ((zzp)object).zzr;
        ((zzh)object5).zzl(l2);
        object3 = ((zzp)object).zzv;
        ((zzh)object5).zzj((String)object3);
        bl3 = zzog.zza();
        if (bl3 && (bl3 = ((zzai)(object3 = this.zze())).zza((zzfx)(object2 = zzbn.zzcf)))) {
            object4 = ((zzp)object).zzs;
            ((zzh)object5).zza((List)object4);
        } else {
            bl3 = zzog.zza();
            if (bl3 && (bl3 = ((zzai)(object3 = this.zze())).zza((zzfx)(object2 = zzbn.zzce)))) {
                ((zzh)object5).zza((List)null);
            }
        }
        n4 = ((zzp)object).zzw;
        ((zzh)object5).zzc(n4 != 0);
        object4 = ((zzp)object).zzac;
        ((zzh)object5).zzk((String)object4);
        n4 = com.google.android.gms.internal.measurement.zzoy.zza();
        if (n4 != 0 && (n4 = ((zzai)(object4 = this.zze())).zza((zzfx)(object3 = zzbn.zzcp))) != 0) {
            n4 = ((zzp)object).zzaa;
            ((zzh)object5).zza(n4);
        }
        l2 = ((zzp)object).zzx;
        ((zzh)object5).zzt(l2);
        object4 = ((zzp)object).zzad;
        ((zzh)object5).zzi((String)object4);
        object4 = this.zze();
        object3 = zzbn.zzcj;
        n4 = (int)(((zzai)object4).zza((zzfx)object3) ? 1 : 0);
        if (n4 != 0) {
            n3 = ((zzp)object).zzaf;
            ((zzh)object5).zzb(n3);
        }
        if ((n3 = (int)(((zzh)object5).zzas() ? 1 : 0)) != 0 || bl2) {
            object = this.zzf();
            ((zzar)object).zza((zzh)object5, bl2, false);
        }
        return object5;
    }

    public final zzor zza(String object, zzop iterator) {
        Object object2;
        Object object3 = this.zze();
        boolean bl2 = ((zzai)object3).zza((zzfx)(object2 = zzbn.zzcj));
        if (!bl2) {
            iterator = Collections.emptyList();
            object = new zzor((List)((Object)iterator));
            return object;
        }
        this.zzl().zzv();
        this.zzt();
        object3 = this.zzf();
        object2 = zzbn.zzw;
        boolean bl3 = false;
        Object object4 = null;
        object2 = (Integer)((zzfx)object2).zza(null);
        int n3 = (Integer)object2;
        iterator = ((zzar)object3).zza((String)object, (zzop)((Object)iterator), n3);
        object3 = new Object();
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            block28: {
                int n4;
                object2 = (zzpi)iterator.next();
                object4 = ((zzpi)object2).zze();
                bl3 = this.zzf((String)object4);
                if (!bl3) continue;
                object2 = ((zzpi)object2).zzb();
                object4 = zzgf$zzj.zzb();
                Object object5 = ((zzon)object2).zzb;
                object4 = zzpj.zza((zzlp)object4, (byte[])object5);
                object4 = (zzgf$zzj$zzb)object4;
                int n7 = 0;
                object5 = null;
                while (true) {
                    n4 = ((zzgf$zzj$zzb)object4).zza();
                    if (n7 >= n4) break;
                    zzlo zzlo2 = ((zzgf$zzj$zzb)object4).zza(n7);
                    zzlo2 = ((zzkg)zzlo2).zzch();
                    zzlo2 = (zzgf$zzk$zza)zzlo2;
                    Clock clock = this.zzb();
                    long l2 = clock.currentTimeMillis();
                    zzlo2 = ((zzgf$zzk$zza)zzlo2).zzl(l2);
                    ((zzgf$zzj$zzb)object4).zza(n7, (zzgf$zzk$zza)zzlo2);
                    ++n7;
                    continue;
                    break;
                }
                try {
                    object5 = ((zzkg$zza)object4).zzaj();
                }
                catch (zzkp zzkp2) {
                    object2 = this.zzj().zzr();
                    object4 = "Failed to parse queued batch. appId";
                    ((zzgq)object2).zza((String)object4, object);
                    continue;
                }
                object5 = (zzkg)object5;
                object5 = (zzgf$zzj)object5;
                object5 = ((zzio)object5).zzce();
                ((zzon)object2).zzb = object5;
                object5 = this.zzj();
                n4 = 2;
                n7 = (int)(((zzgo)object5).zza(n4) ? 1 : 0);
                if (n7 == 0) break block28;
                object5 = this.zzp();
                object4 = ((zzkg$zza)object4).zzaj();
                object4 = (zzkg)object4;
                object4 = (zzgf$zzj)object4;
                object4 = ((zzpj)object5).zza((zzgf$zzj)object4);
                ((zzon)object2).zzf = object4;
            }
            ((ArrayList)object3).add(object2);
        }
        object = new zzor((List)object3);
        return object;
    }

    public final List zza(zzp object, Bundle object2) {
        Object object3;
        String string2;
        Object object4 = this.zzl();
        ((zzhv)object4).zzv();
        boolean bl2 = com.google.android.gms.internal.measurement.zzoy.zza();
        if (bl2 && (bl2 = ((zzai)(object4 = this.zze())).zze(string2 = ((zzp)object).zza, (zzfx)(object3 = zzbn.zzcp))) && (object4 = ((zzp)object).zza) != null) {
            if (object2 != null) {
                object4 = object2.getIntArray("uriSources");
                string2 = "uriTimestamps";
                object2 = object2.getLongArray(string2);
                if (object4 != null) {
                    int n3;
                    int n4;
                    if (object2 != null && (n4 = ((Bundle)object2).length) == (n3 = ((Object)object4).length)) {
                        string2 = null;
                        for (n4 = 0; n4 < (n3 = ((Object)object4).length); ++n4) {
                            object3 = this.zzf();
                            Object object5 = ((zzp)object).zza;
                            Object object6 = object4[n4];
                            Object object7 = object2[n4];
                            Preconditions.checkNotEmpty((String)object5);
                            ((zzjf)object3).zzv();
                            ((zzot)object3).zzam();
                            Object object8 = ((zzar)object3).f_();
                            Object object9 = "trigger_uris";
                            CharSequence charSequence = "app_id=? and source=? and timestamp_millis<=?";
                            Object object10 = String.valueOf((int)object6);
                            String string3 = String.valueOf((long)object7);
                            object10 = new String[]{object5, object10, string3};
                            int n7 = object8.delete((String)object9, (String)charSequence, object10);
                            object9 = ((zzjf)object3).zzj();
                            object9 = ((zzgo)object9).zzq();
                            object10 = "Pruned ";
                            charSequence = new StringBuilder((String)object10);
                            ((StringBuilder)charSequence).append(n7);
                            object8 = " trigger URIs. appId, source, timestamp";
                            ((StringBuilder)charSequence).append((String)object8);
                            object8 = ((StringBuilder)charSequence).toString();
                            Integer n8 = (int)object6;
                            Object object11 = (long)object7;
                            try {
                                ((zzgq)object9).zza((String)object8, object5, n8, object11);
                                continue;
                            }
                            catch (SQLiteException sQLiteException) {
                                object3 = ((zzjf)object3).zzj().zzg();
                                object11 = "Error pruning trigger URIs. appId";
                                object5 = zzgo.zza((String)object5);
                                ((zzgq)object3).zza((String)object11, object5, (Object)sQLiteException);
                            }
                        }
                    } else {
                        object2 = this.zzj().zzg();
                        object4 = "Uri sources and timestamps do not match";
                        ((zzgq)object2).zza((String)object4);
                    }
                }
            }
            object2 = this.zzf();
            object = ((zzp)object).zza;
            return ((zzar)object2).zzj((String)object);
        }
        object = new ArrayList();
        return object;
    }

    public final void zza(zzag zzag2) {
        Object object = (String)Preconditions.checkNotNull(zzag2.zza);
        if ((object = this.zzc((String)object)) != null) {
            this.zza(zzag2, (zzp)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzag object, zzp object2) {
        Throwable throwable2;
        block9: {
            block10: {
                Object object3;
                Object object4;
                Object object5;
                block7: {
                    boolean bl2;
                    Object object6;
                    Object object7;
                    Object object8;
                    block8: {
                        Preconditions.checkNotNull(object);
                        Preconditions.checkNotEmpty(((zzag)object).zza);
                        Preconditions.checkNotNull(((zzag)object).zzc);
                        Preconditions.checkNotEmpty(((zzag)object).zzc.zza);
                        object5 = this.zzl();
                        ((zzhv)object5).zzv();
                        this.zzt();
                        boolean bl3 = zzou.zzi((zzp)object2);
                        if (!bl3) {
                            return;
                        }
                        bl3 = ((zzp)object2).zzh;
                        if (!bl3) {
                            this.zza((zzp)object2);
                            return;
                        }
                        object5 = this.zzf();
                        ((zzar)object5).zzq();
                        try {
                            this.zza((zzp)object2);
                            object5 = ((zzag)object).zza;
                            object4 = object5 = Preconditions.checkNotNull(object5);
                            object4 = (String)object5;
                            object5 = this.zzf();
                            object3 = ((zzag)object).zzc;
                            object3 = ((zzpm)object3).zza;
                            object5 = ((zzar)object5).zzc((String)object4, (String)object3);
                            if (object5 == null) break block7;
                            object3 = this.zzj();
                            object3 = ((zzgo)object3).zzc();
                            object8 = "Removing conditional user property";
                            object7 = ((zzag)object).zza;
                            object6 = this.zzm;
                            object6 = ((zzic)object6).zzk();
                            Object object9 = ((zzag)object).zzc;
                            object9 = ((zzpm)object9).zza;
                            object6 = ((zzgl)object6).zzc((String)object9);
                            ((zzgq)object3).zza((String)object8, object7, object6);
                            object3 = this.zzf();
                            object8 = ((zzag)object).zzc;
                            object8 = ((zzpm)object8).zza;
                            ((zzar)object3).zza((String)object4, (String)object8);
                            bl2 = ((zzag)object5).zze;
                            if (!bl2) break block8;
                            object3 = this.zzf();
                            object8 = ((zzag)object).zzc;
                            object8 = ((zzpm)object8).zza;
                            ((zzar)object3).zzh((String)object4, (String)object8);
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    if ((object3 = ((zzag)object).zzk) != null) {
                        object3 = ((zzbl)object3).zzb;
                        if (object3 != null) {
                            object3 = ((zzbg)object3).zzb();
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                        object7 = object3;
                        object3 = this.zzq();
                        object8 = ((zzag)object).zzk;
                        object8 = Preconditions.checkNotNull(object8);
                        object8 = (zzbl)object8;
                        object8 = ((zzbl)object8).zza;
                        object6 = ((zzag)object5).zzb;
                        object = ((zzag)object).zzk;
                        long l2 = ((zzbl)object).zzd;
                        boolean bl4 = true;
                        boolean bl5 = true;
                        object = ((zzpn)object3).zza((String)object4, (String)object8, (Bundle)object7, (String)object6, l2, bl4, bl5);
                        object = Preconditions.checkNotNull(object);
                        object = (zzbl)object;
                        this.zzc((zzbl)object, (zzp)object2);
                    }
                    break block10;
                }
                object2 = this.zzj();
                object2 = ((zzgo)object2).zzr();
                object5 = "Conditional user property doesn't exist";
                object3 = ((zzag)object).zza;
                object3 = zzgo.zza((String)object3);
                object4 = this.zzm;
                object4 = ((zzic)object4).zzk();
                object = ((zzag)object).zzc;
                object = ((zzpm)object).zza;
                object = ((zzgl)object4).zzc((String)object);
                ((zzgq)object2).zza((String)object5, object3, object);
            }
            object = this.zzf();
            ((zzar)object).zzx();
            this.zzf().zzr();
            return;
        }
        this.zzf().zzr();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzbl zzbl2, zzp zzp2) {
        Throwable throwable2;
        block30: {
            Object object;
            Object object2;
            Object object3;
            long l2;
            boolean bl2;
            Object object4;
            Object object5;
            long l3;
            Object object6;
            Object object7;
            long l4;
            int n3;
            Object object8;
            int n4;
            Object object9;
            Object object10;
            Object object11;
            Object object12;
            ArrayList<Object> arrayList;
            Object object13;
            Object object14;
            zzou zzou2;
            block28: {
                block29: {
                    long l7;
                    zzou2 = this;
                    object14 = zzp2;
                    object13 = "_s";
                    arrayList = "_sid";
                    Preconditions.checkNotNull(zzp2);
                    Preconditions.checkNotEmpty(zzp2.zza);
                    this.zzl().zzv();
                    this.zzt();
                    object12 = zzp2.zza;
                    object11 = zzbl2;
                    long l8 = zzbl2.zzd;
                    object11 = zzgs.zza(zzbl2);
                    this.zzl().zzv();
                    object10 = this.zzag;
                    object9 = null;
                    if (object10 != null && (object10 = this.zzah) != null && (n4 = ((String)object10).equals(object12)) != 0) {
                        object10 = this.zzag;
                    } else {
                        n4 = 0;
                        object10 = null;
                    }
                    object8 = ((zzgs)object11).zzc;
                    n3 = 0;
                    zzpn.zza((zzlw)object10, (Bundle)object8, false);
                    object11 = ((zzgs)object11).zza();
                    this.zzp();
                    n4 = zzpj.zza((zzbl)object11, (zzp)object14);
                    if (n4 == 0) {
                        return;
                    }
                    n4 = ((zzp)object14).zzh;
                    if (n4 == 0) {
                        zzou2.zza((zzp)object14);
                        return;
                    }
                    object10 = ((zzp)object14).zzs;
                    if (object10 != null) {
                        object8 = ((zzbl)object11).zza;
                        n4 = object10.contains(object8);
                        if (n4 == 0) {
                            object14 = this.zzj().zzc();
                            object13 = ((zzbl)object11).zza;
                            arrayList = ((zzbl)object11).zzc;
                            ((zzgq)object14).zza("Dropping non-safelisted event. appId, event name, origin", object12, object13, arrayList);
                            return;
                        }
                        object10 = ((zzbl)object11).zzb.zzb();
                        l4 = 1L;
                        object10.putLong("ga_safelisted", l4);
                        object7 = ((zzbl)object11).zza;
                        object6 = new zzbg((Bundle)object10);
                        object10 = ((zzbl)object11).zzc;
                        l3 = l8;
                        long l12 = ((zzbl)object11).zzd;
                        object5 = object8;
                        object4 = object8 = new zzbl((String)object7, (zzbg)object6, (String)object10, l12);
                    } else {
                        l3 = l8;
                        object4 = object11;
                    }
                    object11 = this.zzf();
                    ((zzar)object11).zzq();
                    try {
                        bl2 = com.google.android.gms.internal.measurement.zzpe.zza();
                        l2 = 0L;
                        if (!bl2 || !(bl2 = ((zzai)(object11 = this.zze())).zza((zzfx)(object10 = zzbn.zzde))) || !(bl2 = ((String)object13).equals(object11 = ((zzbl)object4).zza)) || (object3 = ((zzar)(object11 = this.zzf())).zzi((String)object12, (String)object13)) != 0) break block28;
                        object13 = ((zzbl)object4).zzb;
                        long l14 = (Long)(object13 = ((zzbg)object13).zzb((String)((Object)arrayList)));
                        long l15 = l14 - l2;
                        object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object3 == 0) break block28;
                        object13 = this.zzf();
                        object3 = ((zzar)object13).zzi((String)object12, (String)(object11 = "_f"));
                        if (object3 != 0 || (object3 = ((zzar)(object13 = this.zzf())).zzi((String)object12, (String)(object11 = "_v"))) != 0) break block29;
                        object13 = this.zzf();
                        object11 = this.zzb();
                        l14 = object11.currentTimeMillis();
                        l7 = 15000L;
                    }
                    catch (Throwable throwable2) {
                        break block30;
                    }
                    object11 = l14 -= l7;
                    object10 = ((zzp)object14).zza;
                    object10 = zzou2.zza((String)object10, (zzbl)object4);
                    ((zzar)object13).zza((String)object12, (Long)object11, (String)((Object)arrayList), (Bundle)object10);
                    break block28;
                }
                object13 = this.zzf();
                object11 = ((zzp)object14).zza;
                object11 = zzou2.zza((String)object11, (zzbl)object4);
                ((zzar)object13).zza((String)object12, null, (String)((Object)arrayList), (Bundle)object11);
            }
            object13 = this.zzf();
            Preconditions.checkNotEmpty((String)object12);
            ((zzjf)object13).zzv();
            ((zzot)object13).zzam();
            long l16 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l16 < 0) {
                object13 = ((zzjf)object13).zzj();
                object13 = ((zzgo)object13).zzr();
                object11 = "Invalid time querying timed out conditional properties";
                object10 = zzgo.zza((String)object12);
                object9 = l3;
                ((zzgq)object13).zza((String)object11, object10, object9);
                object13 = Collections.emptyList();
            } else {
                object11 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout";
                object10 = String.valueOf(l3);
                object10 = new String[]{object12, object10};
                object13 = ((zzar)object13).zza((String)object11, (String[])object10);
            }
            object13 = object13.iterator();
            while (bl2 = object13.hasNext()) {
                object11 = object13.next();
                if ((object11 = (zzag)object11) == null) continue;
                object10 = this.zzj();
                object10 = ((zzgo)object10).zzq();
                object9 = "User property timed out";
                object8 = ((zzag)object11).zza;
                object7 = zzou2.zzm;
                object7 = ((zzic)object7).zzk();
                object6 = ((zzag)object11).zzc;
                object6 = ((zzpm)object6).zza;
                object7 = ((zzgl)object7).zzc((String)object6);
                object6 = ((zzag)object11).zzc;
                object6 = ((zzpm)object6).zza();
                ((zzgq)object10).zza((String)object9, object8, object7, object6);
                object10 = ((zzag)object11).zzg;
                if (object10 != null) {
                    object9 = ((zzag)object11).zzg;
                    l4 = l3;
                    object10 = new zzbl((zzbl)object9, l3);
                    zzou2.zzc((zzbl)object10, (zzp)object14);
                } else {
                    l4 = l3;
                }
                object10 = this.zzf();
                object11 = ((zzag)object11).zzc;
                object11 = ((zzpm)object11).zza;
                ((zzar)object10).zza((String)object12, (String)object11);
                l3 = l4;
            }
            l4 = l3;
            object13 = this.zzf();
            Preconditions.checkNotEmpty((String)object12);
            ((zzjf)object13).zzv();
            ((zzot)object13).zzam();
            if (l16 < 0) {
                object13 = ((zzjf)object13).zzj();
                object13 = ((zzgo)object13).zzr();
                object11 = "Invalid time querying expired conditional properties";
                object10 = zzgo.zza((String)object12);
                object9 = l3;
                ((zzgq)object13).zza((String)object11, object10, object9);
                object13 = Collections.emptyList();
            } else {
                object11 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live";
                object10 = String.valueOf(l3);
                object10 = new String[]{object12, object10};
                object13 = ((zzar)object13).zza((String)object11, (String[])object10);
            }
            n4 = object13.size();
            object11 = new ArrayList(n4);
            object13 = object13.iterator();
            while ((n4 = (int)(object13.hasNext() ? 1 : 0)) != 0) {
                object10 = object13.next();
                if ((object10 = (zzag)object10) == null) continue;
                object9 = this.zzj();
                object9 = ((zzgo)object9).zzq();
                object8 = "User property expired";
                object2 = ((zzag)object10).zza;
                object = zzou2.zzm;
                object = ((zzic)object).zzk();
                object5 = ((zzag)object10).zzc;
                object5 = ((zzpm)object5).zza;
                object = ((zzgl)object).zzc((String)object5);
                object5 = ((zzag)object10).zzc;
                object5 = ((zzpm)object5).zza();
                ((zzgq)object9).zza((String)object8, object2, object, object5);
                object9 = this.zzf();
                object8 = ((zzag)object10).zzc;
                object8 = ((zzpm)object8).zza;
                ((zzar)object9).zzh((String)object12, (String)object8);
                object9 = ((zzag)object10).zzk;
                if (object9 != null) {
                    ((ArrayList)object11).add(object9);
                }
                object9 = this.zzf();
                object10 = ((zzag)object10).zzc;
                object10 = ((zzpm)object10).zza;
                ((zzar)object9).zza((String)object12, (String)object10);
            }
            object3 = ((ArrayList)object11).size();
            object10 = null;
            for (n4 = 0; n4 < object3; ++n4) {
                object9 = ((ArrayList)object11).get(n4);
                object9 = (zzbl)object9;
                object8 = new zzbl((zzbl)object9, l4);
                zzou2.zzc((zzbl)object8, (zzp)object14);
            }
            object13 = this.zzf();
            object11 = ((zzbl)object4).zza;
            Preconditions.checkNotEmpty((String)object12);
            Preconditions.checkNotEmpty((String)object11);
            ((zzjf)object13).zzv();
            ((zzot)object13).zzam();
            if (l16 < 0) {
                arrayList = ((zzjf)object13).zzj();
                arrayList = ((zzgo)((Object)arrayList)).zzr();
                object10 = "Invalid time querying triggered conditional properties";
                object12 = zzgo.zza((String)object12);
                object13 = ((zzjf)object13).zzi();
                object13 = ((zzgl)object13).zza((String)object11);
                object11 = l4;
                ((zzgq)((Object)arrayList)).zza((String)object10, object12, object13, object11);
                object13 = Collections.emptyList();
            } else {
                arrayList = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout";
                object10 = String.valueOf(l4);
                object12 = new String[]{object12, object11, object10};
                object13 = ((zzar)object13).zza((String)((Object)arrayList), (String[])object12);
            }
            int n7 = object13.size();
            arrayList = new ArrayList<Object>(n7);
            object13 = object13.iterator();
            while ((n7 = (int)(object13.hasNext() ? 1 : 0)) != 0) {
                object12 = object13.next();
                if ((object12 = (zzag)object12) == null) continue;
                object11 = object12.zzc;
                object10 = object12.zza;
                object10 = Preconditions.checkNotNull(object10);
                object10 = (String)object10;
                object9 = object12.zzb;
                object8 = ((zzpm)object11).zza;
                object11 = ((zzpm)object11).zza();
                object2 = Preconditions.checkNotNull(object11);
                object11 = object;
                l3 = l4;
                object = new zzpo((String)object10, (String)object9, (String)object8, l4, object2);
                object11 = this.zzf();
                bl2 = ((zzar)object11).zza((zzpo)object);
                if (bl2) {
                    object11 = this.zzj();
                    object11 = ((zzgo)object11).zzq();
                    object10 = "User property triggered";
                    object9 = object12.zza;
                    object8 = zzou2.zzm;
                    object8 = ((zzic)object8).zzk();
                    object7 = ((zzpo)object).zzc;
                    object8 = ((zzgl)object8).zzc((String)object7);
                    object7 = ((zzpo)object).zze;
                    ((zzgq)object11).zza((String)object10, object9, object8, object7);
                } else {
                    object11 = this.zzj();
                    object11 = ((zzgo)object11).zzg();
                    object10 = "Too many active user properties, ignoring";
                    object9 = object12.zza;
                    object9 = zzgo.zza((String)object9);
                    object8 = zzou2.zzm;
                    object8 = ((zzic)object8).zzk();
                    object7 = ((zzpo)object).zzc;
                    object8 = ((zzgl)object8).zzc((String)object7);
                    object7 = ((zzpo)object).zze;
                    ((zzgq)object11).zza((String)object10, object9, object8, object7);
                }
                object11 = object12.zzi;
                if (object11 != null) {
                    arrayList.add(object11);
                }
                object12.zzc = object11 = new zzpm((zzpo)object);
                object12.zze = bl2 = true;
                object11 = this.zzf();
                ((zzar)object11).zza((zzag)object12);
                l4 = l3;
            }
            l3 = l4;
            zzou2.zzc((zzbl)object4, (zzp)object14);
            object3 = arrayList.size();
            while (true) {
                if (n3 >= object3) {
                    object14 = this.zzf();
                    ((zzar)object14).zzx();
                    this.zzf().zzr();
                    return;
                }
                object12 = arrayList.get(n3);
                ++n3;
                object12 = (zzbl)object12;
                object11 = new zzbl((zzbl)object12, l3);
                zzou2.zzc((zzbl)object11, (zzp)object14);
            }
        }
        this.zzf().zzr();
        throw throwable2;
    }

    public final void zza(zzbl zzbl2, String string2) {
        boolean bl2;
        zzou zzou2 = this;
        Object object = zzbl2;
        Object object2 = string2;
        Object object3 = this.zzf();
        zzh zzh2 = ((zzar)object3).zzd(string2);
        if (zzh2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = zzh2.zzaf())))) {
            zzp zzp2;
            Object object4;
            String string3;
            object3 = this.zza(zzh2);
            if (object3 == null) {
                object3 = "_ui";
                string3 = zzbl2.zza;
                bl2 = ((String)object3).equals(string3);
                if (!bl2) {
                    object3 = this.zzj().zzr();
                    string3 = "Could not find package. appId";
                    object4 = zzgo.zza(string2);
                    ((zzgq)object3).zza(string3, object4);
                }
            } else {
                bl2 = (Boolean)object3;
                if (!bl2) {
                    object = this.zzj().zzg();
                    object2 = zzgo.zza(string2);
                    ((zzgq)object).zza("App version does not match; dropping event. appId", object2);
                    return;
                }
            }
            object3 = zzp2;
            string3 = zzh2.zzah();
            object4 = zzh2.zzaf();
            long l2 = zzh2.zze();
            String string4 = zzh2.zzae();
            long l3 = zzh2.zzq();
            long l4 = zzh2.zzn();
            boolean bl3 = zzh2.zzar();
            String string5 = zzh2.zzag();
            boolean bl4 = zzh2.zzaq();
            String string6 = zzh2.zzaa();
            Boolean bl5 = zzh2.zzx();
            long l7 = zzh2.zzo();
            List list = zzh2.zzan();
            String string7 = zzou2.zzb((String)object2).zzf();
            boolean bl6 = zzh2.zzat();
            long l8 = zzh2.zzw();
            int n3 = zzou2.zzb((String)object2).zza();
            String string8 = zzou2.zzd((String)object2).zzf();
            int n4 = zzh2.zza();
            long l12 = zzh2.zzf();
            String string9 = zzh2.zzam();
            String string10 = zzh2.zzak();
            int n7 = zzh2.zzb();
            object2 = string2;
            zzp2 = new zzp(string2, string3, (String)object4, l2, string4, l3, l4, null, bl3, false, string5, 0L, 0, bl4, false, string6, bl5, l7, list, null, string7, "", null, bl6, l8, n3, string8, n4, l12, string9, string10, 0L, n7);
            zzou2.zzb((zzbl)object, zzp2);
            return;
        }
        this.zzj().zzc().zza("No app data available; dropping event", object2);
    }

    public final void zza(zzh object, zzgf$zzk$zza zzgf$zzk$zza) {
        Object object2;
        Object object3;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        block25: {
            block24: {
                zzam zzam2;
                this.zzl().zzv();
                this.zzt();
                object7 = zzan.zza(zzgf$zzk$zza.zzw());
                object6 = ((zzh)object).zzac();
                this.zzl().zzv();
                this.zzt();
                object6 = this.zzb((String)object6);
                object5 = zzpe.zza;
                object4 = ((zzjj)object6).zzc();
                n10 = ((Enum)object4).ordinal();
                n10 = object5[n10];
                n8 = 3;
                int n14 = 2;
                n7 = 1;
                if (n10 != n7) {
                    if (n10 != n14 && n10 != n8) {
                        object4 = zzjj$zza.zza;
                        zzam2 = zzam.zzi;
                        ((zzan)object7).zza((zzjj$zza)((Object)object4), zzam2);
                    } else {
                        object4 = zzjj$zza.zza;
                        int n15 = ((zzjj)object6).zza();
                        ((zzan)object7).zza((zzjj$zza)((Object)object4), n15);
                    }
                } else {
                    object4 = zzjj$zza.zza;
                    zzam2 = zzam.zzh;
                    ((zzan)object7).zza((zzjj$zza)((Object)object4), zzam2);
                }
                object4 = ((zzjj)object6).zzd();
                n10 = ((Enum)object4).ordinal();
                n4 = object5[n10];
                if (n4 != n7) {
                    if (n4 != n14 && n4 != n8) {
                        object6 = zzjj$zza.zzb;
                        object5 = (Object)zzam.zzi;
                        ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                    } else {
                        object5 = (Object)zzjj$zza.zzb;
                        n3 = ((zzjj)object6).zza();
                        ((zzan)object7).zza((zzjj$zza)((Object)object5), n3);
                    }
                } else {
                    object6 = zzjj$zza.zzb;
                    object5 = (Object)zzam.zzh;
                    ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                }
                object6 = ((zzh)object).zzac();
                this.zzl().zzv();
                this.zzt();
                object5 = this.zzd((String)object6);
                object4 = this.zzb((String)object6);
                object6 = this.zza((String)object6, (zzbd)object5, (zzjj)object4, (zzan)object7);
                n4 = (int)(((Boolean)Preconditions.checkNotNull(((zzbd)object6).zzd())).booleanValue() ? 1 : 0);
                zzgf$zzk$zza.zzb(n4 != 0);
                object5 = ((zzbd)object6).zze();
                n4 = TextUtils.isEmpty((CharSequence)object5);
                if (n4 == 0) {
                    object6 = ((zzbd)object6).zze();
                    zzgf$zzk$zza.zzh((String)object6);
                }
                this.zzl().zzv();
                this.zzt();
                object6 = zzgf$zzk$zza.zzac().iterator();
                do {
                    n4 = object6.hasNext();
                    object4 = "_npa";
                    if (n4 == 0) break block24;
                } while ((n8 = (int)(((String)object4).equals(object3 = (object5 = (Object)((zzgf$zzp)object6.next())).zzg()) ? 1 : 0)) == 0);
                break block25;
            }
            n4 = 0;
            object5 = null;
        }
        if (object5 != null) {
            object6 = zzjj$zza.zzd;
            object3 = ((zzan)object7).zza((zzjj$zza)((Object)object6));
            if (object3 == (object2 = zzam.zza)) {
                object3 = this.zzf();
                object4 = ((zzar)object3).zze((String)(object2 = ((zzh)object).zzac()), (String)object4);
                if (object4 != null) {
                    object5 = "tcf";
                    object3 = ((zzpo)object4).zzb;
                    n4 = object5.equals(object3);
                    if (n4 != 0) {
                        object5 = zzam.zzg;
                        ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                    } else {
                        object5 = "app";
                        object4 = ((zzpo)object4).zzb;
                        n4 = object5.equals(object4);
                        if (n4 != 0) {
                            object5 = (Object)zzam.zzf;
                            ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                        } else {
                            object5 = (Object)zzam.zzd;
                            ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                        }
                    }
                } else {
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    long l8;
                    long l12;
                    object4 = ((zzh)object).zzx();
                    if (!(object4 == null || object4 == (object3 = Boolean.TRUE) && (l12 = (l8 = (l7 = object5.zzc()) - (l4 = 1L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false || object4 == (object3 = Boolean.FALSE) && (n7 = (int)((l3 = (l2 = object5.zzc()) - (l7 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0)) {
                        object5 = zzam.zzd;
                        ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                    } else {
                        object5 = zzam.zzf;
                        ((zzan)object7).zza((zzjj$zza)((Object)object6), (zzam)((Object)object5));
                    }
                }
            }
        } else {
            object6 = ((zzh)object).zzac();
            n3 = this.zza((String)object6, (zzan)object7);
            object5 = zzgf$zzp.zze().zza((String)object4);
            long l14 = this.zzb().currentTimeMillis();
            object5 = object5.zzb(l14);
            l14 = n3;
            object5 = (zzgf$zzp)((zzkg)object5.zza(l14).zzaj());
            zzgf$zzk$zza.zza((zzgf$zzp)object5);
            object5 = this.zzj().zzq();
            object6 = n3;
            object4 = "Setting user property";
            object3 = "non_personalized_ads(_npa)";
            object5.zza((String)object4, object3, object6);
        }
        object7 = ((zzan)object7).toString();
        zzgf$zzk$zza.zzf((String)object7);
        object7 = this.zzb;
        object = ((zzh)object).zzac();
        boolean bl2 = ((zzhm)object7).zzm((String)object);
        object7 = zzgf$zzk$zza.zzab();
        n3 = 0;
        object6 = null;
        object5 = null;
        for (n4 = 0; n4 < (n10 = object7.size()); ++n4) {
            object3 = "_tcf";
            object4 = ((zzgf$zzf)object7.get(n4)).zzg();
            n10 = (int)(object3.equals(object4) ? 1 : 0);
            if (n10 == 0) continue;
            object7 = (zzgf$zzf$zza)((zzgf$zzf)object7.get(n4)).zzch();
            object4 = ((zzgf$zzf$zza)object7).zzf();
            while (n3 < (n8 = object4.size())) {
                object2 = "_tcfd";
                object3 = ((zzgf$zzh)object4.get(n3)).zzg();
                n8 = (int)(((String)object2).equals(object3) ? 1 : 0);
                if (n8 != 0) {
                    object = zzoe.zza(((zzgf$zzh)object4.get(n3)).zzh(), bl2);
                    object4 = zzgf$zzh.zze().zza((String)object2);
                    object = ((zzgf$zzh$zza)object4).zzb((String)object);
                    ((zzgf$zzf$zza)object7).zza(n3, (zzgf$zzh$zza)object);
                    break;
                }
                ++n3;
            }
            zzgf$zzk$zza.zza(n4, (zzgf$zzf$zza)object7);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzpm object, zzp zzp2) {
        Throwable throwable2;
        block22: {
            boolean bl2;
            String string2;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            int n3;
            Object object6;
            boolean bl3;
            Object object7;
            Object object8;
            block21: {
                Object object9;
                Object object10;
                object8 = "_id";
                object7 = this.zzl();
                ((zzhv)object7).zzv();
                this.zzt();
                bl3 = zzou.zzi(zzp2);
                if (!bl3) {
                    return;
                }
                bl3 = zzp2.zzh;
                if (!bl3) {
                    this.zza(zzp2);
                    return;
                }
                object7 = this.zzq();
                object6 = ((zzpm)object).zza;
                n3 = ((zzpn)object7).zzb((String)object6);
                bl3 = true;
                int n4 = 24;
                int n7 = 0;
                object5 = null;
                if (n3 != 0) {
                    int n8;
                    this.zzq();
                    object8 = ((zzpm)object).zza;
                    this.zze();
                    String string3 = zzpn.zza((String)object8, n4, bl3);
                    object = ((zzpm)object).zza;
                    if (object != null) {
                        int n10;
                        n8 = n10 = ((String)object).length();
                    } else {
                        n8 = 0;
                        Object var14_19 = null;
                    }
                    this.zzq();
                    object5 = this.zzak;
                    String string4 = zzp2.zza;
                    zzpn.zza((zzpp)object5, string4, n3, "_ev", string3, n8);
                    return;
                }
                object4 = this.zzq();
                int n14 = ((zzpn)object4).zza((String)(object10 = ((zzpm)object).zza), object3 = ((zzpm)object).zza());
                if (n14 != 0) {
                    int n15;
                    boolean bl4;
                    this.zzq();
                    object8 = ((zzpm)object).zza;
                    this.zze();
                    String string5 = zzpn.zza((String)object8, n4, bl3);
                    object = ((zzpm)object).zza();
                    if (object != null && ((bl4 = object instanceof String) || (bl4 = object instanceof CharSequence))) {
                        object = String.valueOf(object);
                        n15 = n7 = ((String)object).length();
                    } else {
                        n15 = 0;
                    }
                    this.zzq();
                    zzpp zzpp2 = this.zzak;
                    String string6 = zzp2.zza;
                    zzpn.zza(zzpp2, string6, n14, "_ev", string5, n15);
                    return;
                }
                object7 = this.zzq();
                object6 = ((zzpm)object).zza;
                object4 = ((zzpm)object).zza();
                if ((object7 = ((zzpn)object7).zzc((String)object6, object4)) == null) {
                    return;
                }
                object4 = "_sid";
                object6 = ((zzpm)object).zza;
                n4 = (int)(((String)object4).equals(object6) ? 1 : 0);
                if (n4 != 0) {
                    Object object11;
                    long l2;
                    long l3 = ((zzpm)object).zzb;
                    String string7 = ((zzpm)object).zze;
                    object6 = (String)Preconditions.checkNotNull(zzp2.zza);
                    object10 = this.zzf();
                    object3 = "_sno";
                    if ((object10 = ((zzar)object10).zze((String)object6, (String)object3)) != null && (n14 = (object3 = ((zzpo)object10).zze) instanceof Long) != 0) {
                        object3 = (Long)object3;
                        l2 = (Long)object3;
                    } else {
                        if (object10 != null) {
                            object3 = this.zzj().zzr();
                            object11 = "Retrieved last session number from database does not contain a valid (long) value";
                            object10 = ((zzpo)object10).zze;
                            ((zzgq)object3).zza((String)object11, object10);
                        }
                        if ((object6 = ((zzar)(object10 = this.zzf())).zzd((String)object6, (String)(object3 = "_s"))) != null) {
                            l2 = ((zzbh)object6).zzc;
                            object6 = this.zzj().zzq();
                            object11 = l2;
                            object9 = "Backfill the session number. Last used session number";
                            ((zzgq)object6).zza((String)object9, object11);
                        } else {
                            l2 = 0L;
                        }
                    }
                    long l4 = 1L;
                    object11 = l2 += l4;
                    object3 = "_sno";
                    object10 = object6;
                    object6 = new zzpm((String)object3, l3, object11, string7);
                    this.zza((zzpm)object6, zzp2);
                }
                object3 = object10 = Preconditions.checkNotNull(zzp2.zza);
                object3 = (String)object10;
                object2 = object10 = Preconditions.checkNotNull(((zzpm)object).zze);
                object2 = (String)object10;
                string2 = ((zzpm)object).zza;
                long l7 = ((zzpm)object).zzb;
                object10 = object6;
                object9 = object7;
                object6 = new zzpo((String)object3, (String)object2, string2, l7, object7);
                object10 = this.zzj().zzq();
                object3 = this.zzm.zzk();
                object2 = ((zzpo)object6).zzc;
                object3 = ((zzgl)object3).zzc((String)object2);
                object2 = "Setting user property";
                ((zzgq)object10).zza((String)object2, object3, object7);
                object7 = this.zzf();
                ((zzar)object7).zzq();
                try {
                    object7 = ((zzpo)object6).zzc;
                    bl3 = ((String)object8).equals(object7);
                    if (!bl3 || (object8 = ((zzar)(object7 = this.zzf())).zze((String)(object10 = zzp2.zza), (String)object8)) == null || (bl2 = (object7 = ((zzpo)object6).zze).equals(object8 = ((zzpo)object8).zze))) break block21;
                    object8 = this.zzf();
                    object7 = zzp2.zza;
                    object10 = "_lair";
                    ((zzar)object8).zzh((String)object7, (String)object10);
                }
                catch (Throwable throwable2) {
                    break block22;
                }
            }
            this.zza(zzp2);
            object8 = this.zzf();
            bl2 = ((zzar)object8).zza((zzpo)object6);
            object = ((zzpm)object).zza;
            boolean bl5 = ((String)object4).equals(object);
            if (bl5) {
                object = this.zzp();
                object7 = zzp2.zzv;
                long l8 = ((zzpj)object).zza((String)object7);
                object = this.zzf();
                object7 = zzp2.zza;
                if ((object = ((zzar)object).zzd((String)object7)) != null) {
                    ((zzh)object).zzs(l8);
                    bl3 = ((zzh)object).zzas();
                    if (bl3) {
                        object7 = this.zzf();
                        ((zzar)object7).zza((zzh)object, false, false);
                    }
                }
            }
            object = this.zzf();
            ((zzar)object).zzx();
            if (!bl2) {
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object8 = "Too many unique user properties are set. Ignoring user property";
                object7 = this.zzm;
                object7 = ((zzic)object7).zzk();
                object5 = ((zzpo)object6).zzc;
                object7 = ((zzgl)object7).zzc((String)object5);
                object6 = ((zzpo)object6).zze;
                ((zzgq)object).zza((String)object8, object7, object6);
                this.zzq();
                object5 = this.zzak;
                object4 = zzp2.zza;
                object2 = null;
                boolean bl6 = false;
                string2 = null;
                n3 = 9;
                object3 = null;
                zzpn.zza((zzpp)object5, (String)object4, n3, null, null, 0);
            }
            this.zzf().zzr();
            return;
        }
        this.zzf().zzr();
        throw throwable2;
    }

    public final void zza(Runnable runnable2) {
        this.zzl().zzv();
        ArrayList arrayList = this.zzq;
        if (arrayList == null) {
            this.zzq = arrayList = new ArrayList();
        }
        this.zzq.add(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object, int n3, Throwable object2, byte[] object3, zzpi zzpi2) {
        Throwable throwable2;
        block10: {
            int n4;
            this.zzl().zzv();
            this.zzt();
            if (object3 == null) {
                try {
                    object3 = new byte[]{};
                }
                catch (Throwable throwable2) {
                    break block10;
                }
            }
            if ((n3 == (n4 = 200) || n3 == (n4 = 204)) && object2 == null) {
                if (zzpi2 != null) {
                    object2 = this.zzf();
                    long l2 = zzpi2.zza();
                    object3 = l2;
                    ((zzar)object2).zza((Long)object3);
                }
                object2 = this.zzj();
                object2 = ((zzgo)object2).zzq();
                object3 = "Successfully uploaded batch from upload queue. appId, status";
                Object object4 = n3;
                ((zzgq)object2).zza((String)object3, object, object4);
                object4 = this.zze();
                object2 = zzbn.zzch;
                n3 = (int)(((zzai)object4).zza((zzfx)object2) ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(((zzgv)(object4 = this.zzh())).zzr() ? 1 : 0)) != 0 && (n3 = (int)(((zzar)(object4 = this.zzf())).zzq((String)object) ? 1 : 0)) != 0) {
                    this.zze((String)object);
                } else {
                    this.zzaf();
                }
            } else {
                Object object5 = StandardCharsets.UTF_8;
                Object object6 = new String((byte[])object3, (Charset)object5);
                int n7 = ((String)object6).length();
                int n8 = 32;
                n7 = Math.min(n8, n7);
                object3 = ((String)object6).substring(0, n7);
                object6 = this.zzj();
                object6 = ((zzgo)object6).zzw();
                object5 = "Network upload failed. Will retry later. appId, status, error";
                Number number = n3;
                if (object2 == null) {
                    object2 = object3;
                }
                ((zzgq)object6).zza((String)object5, object, number, object2);
                if (zzpi2 != null) {
                    object = this.zzf();
                    long l3 = zzpi2.zza();
                    number = l3;
                    ((zzar)object).zzb((Long)number);
                }
                this.zzaf();
            }
            this.zzv = false;
            this.zzac();
            return;
        }
        this.zzv = false;
        this.zzac();
        throw throwable2;
    }

    public final void zza(String string2, zzgf$zzk$zza zzgf$zzk$zza) {
        boolean bl2;
        Object object;
        block9: {
            block11: {
                Object object2;
                int n3;
                block10: {
                    zzfx zzfx2;
                    boolean bl3;
                    boolean bl4;
                    int n4;
                    boolean bl5;
                    zzai zzai2;
                    String string3;
                    int n7;
                    boolean n74;
                    object = this.zzi().zzg(string2);
                    if (object != null) {
                        zzgf$zzk$zza.zzd((Iterable)object);
                    }
                    if (n74 = ((zzhm)(object = this.zzi())).zzp(string2)) {
                        zzgf$zzk$zza.zzj();
                    }
                    object = this.zzi();
                    boolean bl6 = ((zzhm)object).zzs(string2);
                    n3 = -1;
                    if (bl6 && (n7 = TextUtils.isEmpty((CharSequence)(object = zzgf$zzk$zza.zzz()))) == 0 && (n7 = ((String)object).indexOf(string3 = ".")) != n3) {
                        zzai2 = null;
                        object = ((String)object).substring(0, n7);
                        zzgf$zzk$zza.zzo((String)object);
                    }
                    if ((bl5 = ((zzhm)(object = this.zzi())).zzt(string2)) && (n4 = zzpj.zza(zzgf$zzk$zza, (String)(object = "_id"))) != n3) {
                        zzgf$zzk$zza.zzc(n4);
                    }
                    if (bl4 = ((zzhm)(object = this.zzi())).zzr(string2)) {
                        zzgf$zzk$zza.zzk();
                    }
                    if (!(bl3 = ((zzhm)(object = this.zzi())).zzo(string2))) break block9;
                    zzgf$zzk$zza.zzh();
                    object = this.zzb(string2);
                    boolean bl7 = ((zzjj)object).zzh();
                    if (!bl7) break block9;
                    object = (zzou$zzc)this.zzae.get(string2);
                    if (object == null) break block10;
                    long l2 = ((zzou$zzc)object).zzb;
                    zzai2 = this.zze();
                    long l3 = zzai2.zzc(string2, zzfx2 = zzbn.zzbe) + l2;
                    long l4 = l3 - (l2 = (object2 = this.zzb()).elapsedRealtime());
                    Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 >= 0) break block11;
                }
                n3 = 0;
                object = new zzou$zzc(this, null);
                object2 = this.zzae;
                object2.put(string2, object);
            }
            object = ((zzou$zzc)object).zza;
            zzgf$zzk$zza.zzk((String)object);
        }
        if (bl2 = ((zzhm)(object = this.zzi())).zzq(string2)) {
            zzgf$zzk$zza.zzr();
        }
    }

    public final void zza(String object, zzae object2) {
        block19: {
            Object object3;
            Object object4;
            block18: {
                block20: {
                    SQLiteException sQLiteException22;
                    long l2;
                    block21: {
                        block17: {
                            String string2;
                            object4 = this.zze();
                            boolean n3 = ((zzai)object4).zza((zzfx)(object3 = zzbn.zzcj));
                            if (!n3) {
                                return;
                            }
                            this.zzl().zzv();
                            this.zzt();
                            object4 = this.zzf();
                            l2 = ((zzae)object2).zza;
                            object4 = ((zzar)object4).zza(l2);
                            if (object4 == null) {
                                object4 = this.zzj().zzr();
                                object2 = ((zzae)object2).zza;
                                ((zzgq)object4).zza("Queued batch doesn't exist. appId, rowId", object, object2);
                                return;
                            }
                            object4 = ((zzpi)object4).zze();
                            int n4 = ((zzae)object2).zzb;
                            zzlv zzlv2 = zzlv.zza;
                            int n7 = zzlv2.zza();
                            if (n4 != n7) break block18;
                            Object object5 = this.zzaf;
                            n4 = (int)(object5.containsKey(object4) ? 1 : 0);
                            if (n4 != 0) {
                                object5 = this.zzaf;
                                object5.remove(object4);
                            }
                            object4 = this.zzf();
                            object5 = ((zzae)object2).zza;
                            ((zzar)object4).zza((Long)object5);
                            l2 = ((zzae)object2).zzc;
                            long l3 = 0L;
                            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (l4 <= 0) break block19;
                            object4 = this.zzf();
                            l2 = ((zzae)object2).zzc;
                            object2 = ((zzjf)object4).zze();
                            boolean bl2 = ((zzai)object2).zza((zzfx)object3);
                            if (!bl2) break block20;
                            ((zzjf)object4).zzv();
                            ((zzot)object4).zzam();
                            Preconditions.checkNotNull(l2);
                            object2 = new ContentValues();
                            int n8 = zzlu.zzb.zza();
                            object3 = n8;
                            object2.put("upload_type", (Integer)object3);
                            l3 = ((zzjf)object4).zzb().currentTimeMillis();
                            object3 = l3;
                            Object object6 = "creation_timestamp";
                            object2.put((String)object6, (Long)object3);
                            try {
                                object3 = ((zzar)object4).f_();
                                object6 = "upload_queue";
                                string2 = "rowid=? AND app_id=? AND upload_type=?";
                            }
                            catch (SQLiteException sQLiteException22) {}
                            String[] stringArray = String.valueOf(l2);
                            Object object7 = zzlu.zze;
                            int n10 = object7.zza();
                            object7 = String.valueOf(n10);
                            stringArray = new String[]{stringArray, object, object7};
                            l3 = object3.update((String)object6, (ContentValues)object2, string2, stringArray);
                            long l7 = 1L;
                            bl2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
                            if (!bl2) break block17;
                            object2 = ((zzjf)object4).zzj();
                            object2 = ((zzgo)object2).zzr();
                            object3 = "Google Signal pending batch not updated. appId, rowId";
                            object6 = l2;
                            ((zzgq)object2).zza((String)object3, object, object6);
                            break block21;
                        }
                        return;
                    }
                    object4 = ((zzjf)object4).zzj().zzg();
                    object3 = l2;
                    ((zzgq)object4).zza("Failed to update google Signal pending batch. appid, rowId", object, object3, (Object)sQLiteException22);
                    throw sQLiteException22;
                }
                return;
            }
            object = (zzou$zzb)this.zzaf.get(object4);
            if (object == null) {
                object = this.zzaf;
                object3 = new zzou$zzb(this);
                object.put(object4, object3);
            } else {
                ((zzou$zzb)object).zza();
            }
            object = this.zzf();
            long l8 = ((zzae)object2).zza;
            object2 = l8;
            ((zzar)object).zzb((Long)object2);
        }
    }

    public final void zza(String string2, zzlw zzlw2) {
        boolean bl2;
        this.zzl().zzv();
        String string3 = this.zzah;
        if (string3 == null || (bl2 = string3.equals(string2)) || zzlw2 != null) {
            this.zzah = string2;
            this.zzag = zzlw2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object, zzp object2) {
        Throwable throwable2;
        block6: {
            Object object3;
            Object object4;
            block5: {
                object4 = this.zzl();
                ((zzhv)object4).zzv();
                this.zzt();
                boolean bl2 = zzou.zzi((zzp)object2);
                if (!bl2) {
                    return;
                }
                bl2 = ((zzp)object2).zzh;
                if (!bl2) {
                    this.zza((zzp)object2);
                    return;
                }
                object4 = zzou.zzh((zzp)object2);
                object3 = "_npa";
                boolean bl3 = ((String)object3).equals(object);
                if (bl3 && object4 != null) {
                    this.zzj().zzc().zza("Falling back to manifest metadata value for ad personalization");
                    object3 = this.zzb();
                    long l2 = object3.currentTimeMillis();
                    bl2 = (Boolean)object4;
                    long l3 = bl2 ? 1L : 0L;
                    Long l4 = l3;
                    Object object5 = object;
                    object = new zzpm("_npa", l2, l4, "auto");
                    this.zza((zzpm)object, (zzp)object2);
                    return;
                }
                object4 = this.zzj().zzc();
                object3 = this.zzm.zzk().zzc((String)object);
                String string2 = "Removing user property";
                ((zzgq)object4).zza(string2, object3);
                object4 = this.zzf();
                ((zzar)object4).zzq();
                try {
                    this.zza((zzp)object2);
                    object4 = "_id";
                    bl2 = ((String)object4).equals(object);
                    if (!bl2) break block5;
                    object4 = this.zzf();
                    object3 = ((zzp)object2).zza;
                    object3 = Preconditions.checkNotNull(object3);
                    object3 = (String)object3;
                    string2 = "_lair";
                    ((zzar)object4).zzh((String)object3, string2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            object4 = this.zzf();
            object2 = ((zzp)object2).zza;
            object2 = Preconditions.checkNotNull(object2);
            object2 = (String)object2;
            ((zzar)object4).zzh((String)object2, (String)object);
            object2 = this.zzf();
            ((zzar)object2).zzx();
            object2 = this.zzj();
            object2 = ((zzgo)object2).zzc();
            object4 = "User property removed";
            object3 = this.zzm;
            object3 = ((zzic)object3).zzk();
            object = ((zzgl)object3).zzc((String)object);
            ((zzgq)object2).zza((String)object4, object);
            this.zzf().zzr();
            return;
        }
        this.zzf().zzr();
        throw throwable2;
    }

    public final void zza(boolean bl2) {
        this.zzaf();
    }

    /*
     * Exception decompiling
     */
    public final void zza(boolean var1_1, int var2_2, Throwable var3_3, byte[] var4_4, String var5_5, List var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 50->55)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Clock zzb() {
        return ((zzic)Preconditions.checkNotNull(this.zzm)).zzb();
    }

    public final zzjj zzb(String string2) {
        this.zzl().zzv();
        this.zzt();
        zzjj zzjj2 = (zzjj)this.zzac.get(string2);
        if (zzjj2 == null) {
            zzjj2 = this.zzf().zzh(string2);
            if (zzjj2 == null) {
                zzjj2 = zzjj.zza;
            }
            this.zza(string2, zzjj2);
        }
        return zzjj2;
    }

    /*
     * WARNING - void declaration
     */
    public final String zzb(zzp object) {
        void var2_6;
        Object object2 = this.zzl();
        Object object3 = new zzpa(this, (zzp)object);
        object2 = ((zzhv)object2).zza((Callable)object3);
        object3 = TimeUnit.MILLISECONDS;
        long l2 = 30000L;
        object2 = object2.get(l2, (TimeUnit)((Object)object3));
        try {
            return (String)object2;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (TimeoutException timeoutException) {
            // empty catch block
        }
        object3 = this.zzj().zzg();
        object = zzgo.zza(((zzp)object).zza);
        ((zzgq)object3).zza("Failed to get app instance id. appId", object, var2_6);
        return null;
    }

    public final void zzb(zzag zzag2) {
        Object object = (String)Preconditions.checkNotNull(zzag2.zza);
        if ((object = this.zzc((String)object)) != null) {
            this.zzb(zzag2, (zzp)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzag object, zzp object2) {
        Throwable throwable2;
        block14: {
            boolean bl2;
            Object object3;
            Object object4;
            long l2;
            Object object5;
            Object object6;
            Object object7;
            boolean bl3;
            Object object8;
            Object object9;
            Object object10;
            boolean bl4;
            Object object11;
            block13: {
                Preconditions.checkNotNull(object);
                Preconditions.checkNotEmpty(((zzag)object).zza);
                Preconditions.checkNotNull(((zzag)object).zzb);
                Preconditions.checkNotNull(((zzag)object).zzc);
                Preconditions.checkNotEmpty(((zzag)object).zzc.zza);
                object11 = this.zzl();
                ((zzhv)object11).zzv();
                this.zzt();
                boolean bl5 = zzou.zzi((zzp)object2);
                if (!bl5) {
                    return;
                }
                bl5 = ((zzp)object2).zzh;
                if (!bl5) {
                    this.zza((zzp)object2);
                    return;
                }
                object11 = new zzag((zzag)object);
                bl4 = false;
                object = null;
                ((zzag)object11).zze = false;
                object10 = this.zzf();
                ((zzar)object10).zzq();
                try {
                    object10 = this.zzf();
                    object9 = ((zzag)object11).zza;
                    object9 = Preconditions.checkNotNull(object9);
                    object9 = (String)object9;
                    object8 = ((zzag)object11).zzc;
                    object8 = ((zzpm)object8).zza;
                    object10 = ((zzar)object10).zzc((String)object9, (String)object8);
                    if (object10 == null || (bl3 = ((String)(object9 = ((zzag)object10).zzb)).equals(object8 = ((zzag)object11).zzb))) break block13;
                    object9 = this.zzj();
                    object9 = ((zzgo)object9).zzr();
                    object8 = "Updating a conditional user property with different origin. name, origin, origin (from DB)";
                    object7 = this.zzm;
                    object7 = ((zzic)object7).zzk();
                    object6 = ((zzag)object11).zzc;
                    object6 = ((zzpm)object6).zza;
                    object7 = ((zzgl)object7).zzc((String)object6);
                    object6 = ((zzag)object11).zzb;
                    object5 = ((zzag)object10).zzb;
                    ((zzgq)object9).zza((String)object8, object7, object6, object5);
                }
                catch (Throwable throwable2) {
                    break block14;
                }
            }
            if (object10 != null && (bl3 = ((zzag)object10).zze)) {
                long l3;
                ((zzag)object11).zzb = object8 = ((zzag)object10).zzb;
                ((zzag)object11).zzd = l3 = ((zzag)object10).zzd;
                ((zzag)object11).zzh = l3 = ((zzag)object10).zzh;
                ((zzag)object11).zzf = object8 = ((zzag)object10).zzf;
                ((zzag)object11).zzi = object8 = ((zzag)object10).zzi;
                ((zzag)object11).zze = bl3;
                object8 = ((zzag)object11).zzc;
                object6 = ((zzpm)object8).zza;
                object7 = ((zzag)object10).zzc;
                l2 = ((zzpm)object7).zzb;
                object4 = ((zzpm)object8).zza();
                object10 = ((zzag)object10).zzc;
                object3 = ((zzpm)object10).zze;
                object7 = object9;
                ((zzag)object11).zzc = object9 = new zzpm((String)object6, l2, object4, (String)object3);
            } else {
                object10 = ((zzag)object11).zzf;
                bl2 = TextUtils.isEmpty((CharSequence)object10);
                if (bl2) {
                    object10 = ((zzag)object11).zzc;
                    object8 = ((zzpm)object10).zza;
                    long l4 = ((zzag)object11).zzd;
                    object5 = ((zzpm)object10).zza();
                    object10 = ((zzag)object11).zzc;
                    String string2 = ((zzpm)object10).zze;
                    object9 = object;
                    ((zzag)object11).zzc = object = new zzpm((String)object8, l4, object5, string2);
                    ((zzag)object11).zze = bl4 = true;
                }
            }
            bl2 = ((zzag)object11).zze;
            if (bl2) {
                object10 = ((zzag)object11).zzc;
                object9 = ((zzag)object11).zza;
                object8 = object9 = Preconditions.checkNotNull(object9);
                object8 = (String)object9;
                object7 = ((zzag)object11).zzb;
                object6 = ((zzpm)object10).zza;
                l2 = ((zzpm)object10).zzb;
                object10 = ((zzpm)object10).zza();
                object4 = Preconditions.checkNotNull(object10);
                object9 = object3;
                object3 = new zzpo((String)object8, (String)object7, (String)object6, l2, object4);
                object10 = this.zzf();
                bl2 = ((zzar)object10).zza((zzpo)object3);
                if (bl2) {
                    object10 = this.zzj();
                    object10 = ((zzgo)object10).zzc();
                    object9 = "User property updated immediately";
                    object8 = ((zzag)object11).zza;
                    object7 = this.zzm;
                    object7 = ((zzic)object7).zzk();
                    object6 = ((zzpo)object3).zzc;
                    object7 = ((zzgl)object7).zzc((String)object6);
                    object6 = ((zzpo)object3).zze;
                    ((zzgq)object10).zza((String)object9, object8, object7, object6);
                } else {
                    object10 = this.zzj();
                    object10 = ((zzgo)object10).zzg();
                    object9 = "(2)Too many active user properties, ignoring";
                    object8 = ((zzag)object11).zza;
                    object8 = zzgo.zza((String)object8);
                    object7 = this.zzm;
                    object7 = ((zzic)object7).zzk();
                    object6 = ((zzpo)object3).zzc;
                    object7 = ((zzgl)object7).zzc((String)object6);
                    object6 = ((zzpo)object3).zze;
                    ((zzgq)object10).zza((String)object9, object8, object7, object6);
                }
                if (bl4 && (object = ((zzag)object11).zzi) != null) {
                    object10 = ((zzag)object11).zzi;
                    long l7 = ((zzag)object11).zzd;
                    object = new zzbl((zzbl)object10, l7);
                    this.zzc((zzbl)object, (zzp)object2);
                }
            }
            if (bl4 = ((zzar)(object = this.zzf())).zza((zzag)object11)) {
                object = this.zzj();
                object = ((zzgo)object).zzc();
                object2 = "Conditional property added";
                object10 = ((zzag)object11).zza;
                object9 = this.zzm;
                object9 = ((zzic)object9).zzk();
                object8 = ((zzag)object11).zzc;
                object8 = ((zzpm)object8).zza;
                object9 = ((zzgl)object9).zzc((String)object8);
                object11 = ((zzag)object11).zzc;
                object11 = ((zzpm)object11).zza();
                ((zzgq)object).zza((String)object2, object10, object9, object11);
            } else {
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object2 = "Too many conditional properties, ignoring";
                object10 = ((zzag)object11).zza;
                object10 = zzgo.zza((String)object10);
                object9 = this.zzm;
                object9 = ((zzic)object9).zzk();
                object8 = ((zzag)object11).zzc;
                object8 = ((zzpm)object8).zza;
                object9 = ((zzgl)object9).zzc((String)object8);
                object11 = ((zzag)object11).zzc;
                object11 = ((zzpm)object11).zza();
                ((zzgq)object).zza((String)object2, object10, object9, object11);
            }
            object = this.zzf();
            ((zzar)object).zzx();
            this.zzf().zzr();
            return;
        }
        this.zzf().zzr();
        throw throwable2;
    }

    public final void zzb(zzh zzh2, zzgf$zzk$zza object) {
        Object object2;
        String string2;
        Object object3;
        this.zzl().zzv();
        this.zzt();
        Object object4 = zzgf$zza.zzc();
        Object object5 = zzh2.zzav();
        if (object5 != null) {
            object5 = zzpj.zza((zzlp)object4, (byte[])object5);
            try {
                object4 = object5 = (zzgf$zza$zza)object5;
            }
            catch (zzkp zzkp2) {
                object5 = this.zzj().zzr();
                object3 = zzgo.zza(zzh2.zzac());
                string2 = "Failed to parse locally stored ad campaign info. appId";
                ((zzgq)object5).zza(string2, object3);
            }
        }
        object5 = ((zzgf$zzk$zza)object).zzab().iterator();
        while ((object2 = object5.hasNext()) != 0) {
            String string3;
            object3 = (zzgf$zzf)object5.next();
            string2 = ((zzgf$zzf)object3).zzg();
            boolean bl2 = string2.equals(string3 = "_cmp");
            if (!bl2) continue;
            string3 = "";
            string2 = (String)zzpj.zza((zzgf$zzf)object3, "gclid", (Object)string3);
            String string4 = (String)zzpj.zza((zzgf$zzf)object3, "gbraid", (Object)string3);
            String string5 = "gad_source";
            string3 = (String)zzpj.zza((zzgf$zzf)object3, string5, (Object)string3);
            boolean bl3 = string2.isEmpty();
            if (bl3 && (bl3 = string4.isEmpty())) continue;
            long l2 = 0L;
            Long l3 = l2;
            String string6 = "click_timestamp";
            long l4 = l3 = (Long)zzpj.zza((zzgf$zzf)object3, string6, (Object)l3);
            long l7 = l4 - l2;
            Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object6 <= 0) {
                l4 = ((zzgf$zzf)object3).zzd();
            }
            if ((object2 = (string5 = "referrer API v2").equals(object3 = zzpj.zzb((zzgf$zzf)object3, "_cis"))) != 0) {
                l2 = ((zzgf$zza$zza)object4).zzb();
                long l8 = l4 - l2;
                object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 <= 0) continue;
                object2 = string2.isEmpty();
                if (object2 != 0) {
                    ((zzgf$zza$zza)object4).zzh();
                } else {
                    ((zzgf$zza$zza)object4).zzf(string2);
                }
                object2 = string4.isEmpty();
                if (object2 != 0) {
                    ((zzgf$zza$zza)object4).zzg();
                } else {
                    ((zzgf$zza$zza)object4).zze(string4);
                }
                object2 = string3.isEmpty();
                if (object2 != 0) {
                    ((zzgf$zza$zza)object4).zzf();
                } else {
                    ((zzgf$zza$zza)object4).zzd(string3);
                }
                ((zzgf$zza$zza)object4).zzb(l4);
                continue;
            }
            l2 = ((zzgf$zza$zza)object4).zza();
            long l12 = l4 - l2;
            object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 <= 0) continue;
            object2 = string2.isEmpty();
            if (object2 != 0) {
                ((zzgf$zza$zza)object4).zze();
            } else {
                ((zzgf$zza$zza)object4).zzc(string2);
            }
            object2 = string4.isEmpty();
            if (object2 != 0) {
                ((zzgf$zza$zza)object4).zzd();
            } else {
                ((zzgf$zza$zza)object4).zzb(string4);
            }
            object2 = string3.isEmpty();
            if (object2 != 0) {
                ((zzgf$zza$zza)object4).zzc();
            } else {
                ((zzgf$zza$zza)object4).zza(string3);
            }
            ((zzgf$zza$zza)object4).zza(l4);
        }
        object5 = (zzgf$zza)((zzkg)((zzkg$zza)object4).zzaj());
        boolean bl4 = ((zzkg)object5).equals(object3 = zzgf$zza.zze());
        if (!bl4) {
            object5 = (zzgf$zza)((zzkg)((zzkg$zza)object4).zzaj());
            ((zzgf$zzk$zza)object).zza((zzgf$zza)object5);
        }
        object = ((zzgf$zza)((zzkg)((zzkg$zza)object4).zzaj())).zzce();
        zzh2.zza((byte[])object);
        boolean bl5 = zzh2.zzas();
        if (bl5) {
            object = this.zzf();
            object4 = null;
            ((zzar)object).zza(zzh2, false, false);
        }
    }

    public final zzx zzc() {
        return (zzx)zzou.zza(this.zzg);
    }

    public final void zzc(zzp object) {
        int n3;
        zzgf$zzo$zza zzgf$zzo$zza;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n4;
        this.zzl().zzv();
        this.zzt();
        Preconditions.checkNotNull(object);
        Preconditions.checkNotEmpty(((zzp)object).zza);
        Object object2 = this.zze();
        Object object3 = zzbn.zzbt;
        boolean n7 = ((zzai)object2).zza((zzfx)object3);
        object3 = null;
        if (n7) {
            boolean bl5;
            long l2 = this.zzb().currentTimeMillis();
            object2 = this.zze();
            zzfx zzfx2 = zzbn.zzbc;
            int n8 = ((zzai)object2).zzb(null, zzfx2);
            this.zze();
            long l3 = com.google.android.gms.measurement.internal.zzai.zzg();
            l2 -= l3;
            for (n4 = 0; n4 < n8 && (bl5 = this.zzb(null, l2)); ++n4) {
            }
        } else {
            long l4;
            long l7;
            long l8;
            this.zze();
            long l12 = com.google.android.gms.measurement.internal.zzai.zzh();
            while ((l8 = (l7 = (l4 = (long)n4) - l12) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0 && (l8 = (long)this.zzb((String)(object2 = ((zzp)object).zza), l4 = 0L)) != false) {
                ++n4;
            }
        }
        if (bl4 = ((zzai)(object2 = this.zze())).zza((zzfx)(object3 = zzbn.zzbu))) {
            this.zzad();
        }
        if ((bl3 = ((zzai)(object2 = this.zze())).zza((zzfx)(object3 = zzbn.zzck))) && (bl2 = ((zzos)(object2 = this.zzk)).zza((String)(object3 = ((zzp)object).zza), zzgf$zzo$zza = zzgf$zzo$zza.zza(n3 = ((zzp)object).zzaf)))) {
            object = ((zzp)object).zza;
            object2 = this.zzb();
            long l14 = object2.currentTimeMillis();
            this.zza((String)object, l14);
        }
    }

    public final zzaf zzd() {
        return this.zzm.zzd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzp zzp2) {
        Throwable throwable2;
        block57: {
            Object object;
            block64: {
                String string2;
                int n3;
                Object object2;
                Object object3;
                long l2;
                Object object4;
                Object object5;
                zzp zzp3;
                zzou zzou2;
                block53: {
                    long l3;
                    String string3;
                    Long l4;
                    Object object6;
                    Object object7;
                    Object object8;
                    block54: {
                        long l7;
                        int n4;
                        boolean bl2;
                        String string4;
                        Object object9;
                        Object object10;
                        Object object11;
                        Object object12;
                        String string5;
                        Object object13;
                        block60: {
                            block56: {
                                block62: {
                                    block63: {
                                        RuntimeException runtimeException2;
                                        block58: {
                                            boolean bl3;
                                            boolean bl4;
                                            int n7;
                                            Object object14;
                                            block61: {
                                                block59: {
                                                    block55: {
                                                        String string6;
                                                        boolean bl5;
                                                        zzou2 = this;
                                                        zzp3 = zzp2;
                                                        object5 = "_sysu";
                                                        object4 = "_sys";
                                                        object13 = "_pfo";
                                                        object8 = "com.android.vending";
                                                        object = "_npa";
                                                        string5 = "_uwa";
                                                        object14 = "app_id=?";
                                                        this.zzl().zzv();
                                                        this.zzt();
                                                        Preconditions.checkNotNull(zzp2);
                                                        object12 = zzp2.zza;
                                                        Preconditions.checkNotEmpty((String)object12);
                                                        object7 = zzou.zzi(zzp2);
                                                        if (object7 == 0) {
                                                            return;
                                                        }
                                                        object12 = this.zzf();
                                                        object11 = zzp2.zza;
                                                        object12 = ((zzar)object12).zzd((String)object11);
                                                        boolean bl6 = false;
                                                        object11 = null;
                                                        long l8 = 0L;
                                                        if (object12 != null && (bl5 = TextUtils.isEmpty((CharSequence)(string6 = ((zzh)object12).zzah()))) && !(bl5 = TextUtils.isEmpty((CharSequence)(string6 = zzp2.zzb)))) {
                                                            ((zzh)object12).zzd(l8);
                                                            this.zzf().zza((zzh)object12, false, false);
                                                            object12 = this.zzi();
                                                            string6 = zzp2.zza;
                                                            ((zzhm)object12).zzj(string6);
                                                        }
                                                        if ((object7 = zzp3.zzh) == 0) {
                                                            this.zza(zzp2);
                                                            return;
                                                        }
                                                        l2 = zzp3.zzl;
                                                        long l12 = l2 - l8;
                                                        object7 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                                        if (object7 == 0) {
                                                            object12 = this.zzb();
                                                            l2 = object12.currentTimeMillis();
                                                        }
                                                        object12 = zzou2.zzm.zzg();
                                                        ((zzbf)object12).zzv();
                                                        object7 = zzp3.zzm;
                                                        n7 = 1;
                                                        if (object7 != 0 && object7 != n7) {
                                                            object3 = this.zzj();
                                                            object2 = ((zzgo)object3).zzr();
                                                            object10 = zzgo.zza(zzp3.zza);
                                                            object12 = object7;
                                                            object6 = "Incorrect app type, assuming installed app. appId, appType";
                                                            ((zzgq)object2).zza((String)object6, object10, object12);
                                                            object7 = 0;
                                                            object12 = null;
                                                        }
                                                        object10 = this.zzf();
                                                        ((zzar)object10).zzq();
                                                        try {
                                                            long l14;
                                                            long l15;
                                                            object10 = this.zzf();
                                                            object6 = zzp3.zza;
                                                            object10 = ((zzar)object10).zze((String)object6, (String)object);
                                                            object6 = zzou.zzh(zzp2);
                                                            object9 = object5;
                                                            string4 = object4;
                                                            if (object10 != null && !(bl6 = ((String)(object2 = "auto")).equals(object11 = ((zzpo)object10).zzb))) {
                                                                bl6 = true;
                                                            } else if (object6 != null) {
                                                                object3 = "_npa";
                                                                bl6 = (Boolean)object6;
                                                                long l16 = bl6 ? 1L : 0L;
                                                                l4 = l16;
                                                                string3 = "auto";
                                                                bl6 = true;
                                                                object2 = object;
                                                                object = new zzpm((String)object3, l2, l4, string3);
                                                                if (object10 == null || !(bl2 = (object10 = ((zzpo)object10).zze).equals(object6 = ((zzpm)object).zzc))) {
                                                                    zzou2.zza((zzpm)object, zzp3);
                                                                }
                                                            } else {
                                                                bl6 = true;
                                                                if (object10 != null) {
                                                                    zzou2.zza((String)object, zzp3);
                                                                }
                                                            }
                                                            object = this.zzf();
                                                            object10 = zzp3.zza;
                                                            object10 = Preconditions.checkNotNull(object10);
                                                            object10 = (String)object10;
                                                            object = ((zzar)object).zzd((String)object10);
                                                            if (object != null) {
                                                                this.zzq();
                                                                object6 = zzp3.zzb;
                                                                object2 = ((zzh)object).zzah();
                                                                object10 = zzp3.zzp;
                                                                object5 = ((zzh)object).zzaa();
                                                                n4 = (int)(zzpn.zza((String)object6, (String)object2, (String)object10, (String)object5) ? 1 : 0);
                                                                if (n4 != 0) {
                                                                    object5 = this.zzj();
                                                                    object5 = ((zzgo)object5).zzr();
                                                                    object4 = "New GMP App Id passed in. Removing cached database data. appId";
                                                                    object10 = ((zzh)object).zzac();
                                                                    object10 = zzgo.zza((String)object10);
                                                                    ((zzgq)object5).zza((String)object4, object10);
                                                                    object5 = this.zzf();
                                                                    object4 = ((zzh)object).zzac();
                                                                    ((zzot)object5).zzam();
                                                                    ((zzjf)object5).zzv();
                                                                    Preconditions.checkNotEmpty((String)object4);
                                                                    try {
                                                                        object = ((zzar)object5).f_();
                                                                        object10 = new String[]{object4};
                                                                        object6 = "events";
                                                                        l15 = object.delete((String)object6, (String)object14, (String[])object10);
                                                                        object2 = "user_attributes";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "conditional_properties";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "apps";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "raw_events";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "raw_events_metadata";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "event_filters";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "property_filters";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "audience_filter_values";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "consent_settings";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "default_event_params";
                                                                        n7 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        l15 += n7;
                                                                        object2 = "trigger_uris";
                                                                        n3 = object.delete((String)object2, (String)object14, (String[])object10);
                                                                        if ((l15 += n3) > 0) {
                                                                            object = ((zzjf)object5).zzj();
                                                                            object = ((zzgo)object).zzq();
                                                                            object14 = "Deleted application data. app, records";
                                                                            object10 = (int)l15;
                                                                            ((zzgq)object).zza((String)object14, object4, object10);
                                                                        }
                                                                    }
                                                                    catch (SQLiteException sQLiteException) {
                                                                        object5 = ((zzjf)object5).zzj();
                                                                        object5 = ((zzgo)object5).zzg();
                                                                        object14 = "Error deleting application data. appId, error";
                                                                        object4 = zzgo.zza((String)object4);
                                                                        ((zzgq)object5).zza((String)object14, object4, (Object)sQLiteException);
                                                                    }
                                                                    n3 = 0;
                                                                    object = null;
                                                                }
                                                            }
                                                            if (object != null) {
                                                                long l17;
                                                                l7 = ((zzh)object).zze();
                                                                long l18 = l7 - (l8 = 0x80000000L);
                                                                Object object15 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                                                                if (object15 != false && (l15 = (l17 = (l7 = ((zzh)object).zze()) - (l3 = zzp3.zzj)) == 0L ? 0 : (l17 < 0L ? -1 : 1)) != false) {
                                                                    n4 = 1;
                                                                } else {
                                                                    n4 = 0;
                                                                    object5 = null;
                                                                }
                                                                object4 = ((zzh)object).zzaf();
                                                                l3 = ((zzh)object).zze();
                                                                l14 = 0x80000000L;
                                                                n3 = l3 == l14 ? 0 : (l3 < l14 ? -1 : 1);
                                                                if (n3 == 0 && object4 != null && (n3 = (int)(((String)object4).equals(object = zzp3.zzc) ? 1 : 0)) == 0) {
                                                                    n7 = 1;
                                                                } else {
                                                                    n7 = 0;
                                                                    object2 = null;
                                                                }
                                                                n3 = n4 | n7;
                                                                if (n3 != 0) {
                                                                    object = new Bundle();
                                                                    object5 = "_pv";
                                                                    object.putString((String)object5, (String)object4);
                                                                    object3 = "_au";
                                                                    object4 = new zzbg((Bundle)object);
                                                                    string2 = "auto";
                                                                    object2 = object5;
                                                                    object5 = new zzbl((String)object3, (zzbg)object4, string2, l2);
                                                                    zzou2.zza((zzbl)object5, zzp3);
                                                                }
                                                            }
                                                            this.zza(zzp2);
                                                            if (object7 == 0) {
                                                                object = this.zzf();
                                                                object5 = zzp3.zza;
                                                                object4 = "_f";
                                                                object = ((zzar)object).zzd((String)object5, (String)object4);
                                                            } else {
                                                                n4 = 1;
                                                                if (object7 == n4) {
                                                                    object = this.zzf();
                                                                    object5 = zzp3.zza;
                                                                    object4 = "_v";
                                                                    object = ((zzar)object).zzd((String)object5, (String)object4);
                                                                } else {
                                                                    n3 = 0;
                                                                    object = null;
                                                                }
                                                            }
                                                            if (object != null) break block53;
                                                            l7 = 3600000L;
                                                            l3 = l2 / l7;
                                                            l14 = 1L;
                                                            l3 = (l3 + l14) * l7;
                                                            object5 = "_dac";
                                                            object4 = "_et";
                                                            object6 = "_r";
                                                            object2 = "_c";
                                                            if (object7 != 0) break block54;
                                                            object3 = "_fot";
                                                            l4 = l3;
                                                            string3 = "auto";
                                                            object12 = object2;
                                                            object2 = object;
                                                            object = new zzpm((String)object3, l2, l4, string3);
                                                            zzou2.zza((zzpm)object, zzp3);
                                                            object = this.zzl();
                                                            ((zzhv)object).zzv();
                                                            object = zzou2.zzl;
                                                            object11 = object = Preconditions.checkNotNull(object);
                                                            object11 = (zzhj)object;
                                                            object = zzp3.zza;
                                                            if (object != null && !(bl2 = ((String)object).isEmpty())) break block55;
                                                            break block56;
                                                        }
                                                        catch (Throwable throwable2) {
                                                            break block57;
                                                        }
                                                    }
                                                    object10 = ((zzhj)object11).zza;
                                                    object10 = ((zzic)object10).zzl();
                                                    ((zzhv)object10).zzv();
                                                    bl2 = ((zzhj)object11).zza();
                                                    if (bl2) break block59;
                                                    object = ((zzhj)object11).zza;
                                                    object = ((zzic)object).zzj();
                                                    object = ((zzgo)object).zzp();
                                                    object8 = "Install Referrer Reporter is not available";
                                                    ((zzgq)object).zza((String)object8);
                                                    break block60;
                                                }
                                                object10 = new zzhi((zzhj)object11, (String)object);
                                                object = ((zzhj)object11).zza;
                                                object = ((zzic)object).zzl();
                                                ((zzhv)object).zzv();
                                                object2 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
                                                object = new Intent((String)object2);
                                                object14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
                                                object2 = new ComponentName((String)object8, (String)object14);
                                                object.setComponent((ComponentName)object2);
                                                object14 = ((zzhj)object11).zza;
                                                object14 = ((zzic)object14).zza();
                                                object14 = object14.getPackageManager();
                                                if (object14 != null) break block61;
                                                object = ((zzhj)object11).zza;
                                                object = ((zzic)object).zzj();
                                                object = ((zzgo)object).zzx();
                                                object8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                                                ((zzgq)object).zza((String)object8);
                                                break block60;
                                            }
                                            n7 = 0;
                                            object2 = null;
                                            if ((object14 = object14.queryIntentServices((Intent)object, 0)) == null || (bl4 = object14.isEmpty())) break block62;
                                            object14 = object14.get(0);
                                            object14 = (ResolveInfo)object14;
                                            object14 = ((ResolveInfo)object14).serviceInfo;
                                            if (object14 == null) break block60;
                                            object2 = ((ServiceInfo)object14).packageName;
                                            object14 = ((ServiceInfo)object14).name;
                                            if (object14 == null || !(bl3 = ((String)object8).equals(object2)) || !(bl3 = ((zzhj)object11).zza())) break block63;
                                            object8 = new Intent((Intent)object);
                                            try {
                                                object = ConnectionTracker.getInstance();
                                                object14 = ((zzhj)object11).zza;
                                                object14 = ((zzic)object14).zza();
                                                n7 = 1;
                                                n3 = (int)(((ConnectionTracker)object).bindService((Context)object14, (Intent)object8, (ServiceConnection)object10, n7) ? 1 : 0);
                                                object8 = ((zzhj)object11).zza;
                                                object8 = ((zzic)object8).zzj();
                                                object8 = ((zzgo)object8).zzq();
                                                object10 = "Install Referrer Service is";
                                                object = n3 != 0 ? "available" : "not available";
                                            }
                                            catch (RuntimeException runtimeException2) {
                                                break block58;
                                            }
                                            ((zzgq)object8).zza((String)object10, object);
                                            break block60;
                                        }
                                        object8 = ((zzhj)object11).zza;
                                        object8 = ((zzic)object8).zzj();
                                        object8 = ((zzgo)object8).zzg();
                                        object11 = "Exception occurred while binding to Install Referrer Service";
                                        object = runtimeException2.getMessage();
                                        ((zzgq)object8).zza((String)object11, object);
                                        break block60;
                                    }
                                    object = ((zzhj)object11).zza;
                                    object = ((zzic)object).zzj();
                                    object = ((zzgo)object).zzr();
                                    object8 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                    ((zzgq)object).zza((String)object8);
                                    break block60;
                                }
                                object = ((zzhj)object11).zza;
                                object = ((zzic)object).zzj();
                                object = ((zzgo)object).zzp();
                                object8 = "Play Service for fetching Install Referrer is unavailable on device";
                                ((zzgq)object).zza((String)object8);
                                break block60;
                            }
                            object = ((zzhj)object11).zza;
                            object = ((zzic)object).zzj();
                            object = ((zzgo)object).zzx();
                            object8 = "Install Referrer Reporter was called with invalid app package name";
                            ((zzgq)object).zza((String)object8);
                        }
                        object = this.zzl();
                        ((zzhv)object).zzv();
                        this.zzt();
                        object8 = new Bundle();
                        l3 = 1L;
                        object8.putLong((String)object12, l3);
                        object8.putLong((String)object6, l3);
                        long l19 = 0L;
                        object8.putLong(string5, l19);
                        object8.putLong((String)object13, l19);
                        object6 = string4;
                        object8.putLong(string4, l19);
                        object2 = object9;
                        object8.putLong((String)object9, l19);
                        object8.putLong((String)object4, l3);
                        n3 = (int)(zzp3.zzo ? 1 : 0);
                        if (n3 != 0) {
                            object8.putLong((String)object5, l3);
                        }
                        object = zzp3.zza;
                        object5 = object = Preconditions.checkNotNull(object);
                        object5 = (String)object;
                        object = this.zzf();
                        Preconditions.checkNotEmpty((String)object5);
                        ((zzjf)object).zzv();
                        ((zzot)object).zzam();
                        object4 = "first_open_count";
                        l19 = ((zzar)object).zzb((String)object5, (String)object4);
                        object = zzou2.zzm;
                        object = ((zzic)object).zza();
                        object = object.getPackageManager();
                        if (object == null) {
                            object = this.zzj();
                            object = ((zzgo)object).zzg();
                            object4 = "PackageManager is null, first open report might be inaccurate. appId";
                            object5 = zzgo.zza((String)object5);
                            ((zzgq)object).zza((String)object4, object5);
                            object9 = object13;
                        } else {
                            long l20;
                            long l21;
                            boolean bl7;
                            try {
                                object = zzou2.zzm;
                                object = ((zzic)object).zza();
                                object = Wrappers.packageManager((Context)object);
                                bl7 = false;
                                object4 = null;
                                object = ((PackageManagerWrapper)object).getPackageInfo((String)object5, 0);
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                object4 = this.zzj();
                                object4 = ((zzgo)object4).zzg();
                                object11 = "Package info is null, first open report might be inaccurate. appId";
                                object10 = zzgo.zza((String)object5);
                                ((zzgq)object4).zza((String)object11, object10, (Object)nameNotFoundException);
                                n3 = 0;
                                object = null;
                            }
                            if (object != null && (bl7 = (l21 = (l3 = ((PackageInfo)object).firstInstallTime) - (l20 = 0L)) == 0L ? 0 : (l21 < 0L ? -1 : 1))) {
                                object9 = object13;
                                long l22 = ((PackageInfo)object).lastUpdateTime;
                                long l23 = l3 - l22;
                                n3 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1));
                                if (n3 != 0) {
                                    object = this.zze();
                                    n3 = (int)(((zzai)object).zza((zzfx)(object4 = zzbn.zzcc)) ? 1 : 0);
                                    if (n3 != 0) {
                                        l22 = 0L;
                                        long l24 = l19 - l22;
                                        n3 = (int)(l24 == 0L ? 0 : (l24 < 0L ? -1 : 1));
                                        if (n3 == 0) {
                                            l22 = 1L;
                                            object8.putLong(string5, l22);
                                        }
                                    } else {
                                        l22 = 1L;
                                        object8.putLong(string5, l22);
                                    }
                                    n3 = 0;
                                    object = null;
                                } else {
                                    n3 = 1;
                                }
                                object3 = "_fi";
                                l3 = n3 != 0 ? 1L : 0L;
                                l4 = l3;
                                string3 = "auto";
                                object13 = object2;
                                object2 = object4;
                                object4 = new zzpm((String)object3, l2, l4, string3);
                                zzou2.zza((zzpm)object4, zzp3);
                            } else {
                                object9 = object13;
                                object13 = object2;
                            }
                            try {
                                object = zzou2.zzm;
                                object = ((zzic)object).zza();
                                object = Wrappers.packageManager((Context)object);
                                bl7 = false;
                                object4 = null;
                                object10 = ((PackageManagerWrapper)object).getApplicationInfo((String)object5, 0);
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                object4 = this.zzj();
                                object4 = ((zzgo)object4).zzg();
                                string5 = "Application info is null, first open report might be inaccurate. appId";
                                object5 = zzgo.zza((String)object5);
                                ((zzgq)object4).zza(string5, object5, (Object)nameNotFoundException);
                                bl2 = false;
                                object10 = null;
                            }
                            if (object10 != null) {
                                n3 = ((ApplicationInfo)object10).flags;
                                n4 = 1;
                                if ((n3 &= n4) != 0) {
                                    l7 = 1L;
                                    object8.putLong((String)object6, l7);
                                } else {
                                    l7 = 1L;
                                }
                                if ((n3 = ((ApplicationInfo)object10).flags & 0x80) != 0) {
                                    object8.putLong((String)object13, l7);
                                }
                            }
                        }
                        l7 = 0L;
                        n3 = (int)(l19 == l7 ? 0 : (l19 < l7 ? -1 : 1));
                        if (n3 >= 0) {
                            object5 = object9;
                            object8.putLong((String)object9, l19);
                        }
                        object3 = "_f";
                        object5 = new zzbg((Bundle)object8);
                        string2 = "auto";
                        object2 = object;
                        object = new zzbl((String)object3, (zzbg)object5, string2, l2);
                        zzou2.zzb((zzbl)object, zzp3);
                        break block64;
                    }
                    object8 = object2;
                    int n8 = 1;
                    if (object7 == n8) {
                        object3 = "_fvt";
                        l4 = l3;
                        string3 = "auto";
                        object2 = object;
                        object = new zzpm((String)object3, l2, l4, string3);
                        zzou2.zza((zzpm)object, zzp3);
                        object = this.zzl();
                        ((zzhv)object).zzv();
                        this.zzt();
                        object = new Bundle();
                        long l25 = 1L;
                        object.putLong((String)object8, l25);
                        object.putLong((String)object6, l25);
                        object.putLong((String)object4, l25);
                        boolean bl8 = zzp3.zzo;
                        if (bl8) {
                            object.putLong((String)object5, l25);
                        }
                        object3 = "_v";
                        object4 = new zzbg((Bundle)object);
                        string2 = "auto";
                        object2 = object5;
                        object5 = new zzbl((String)object3, (zzbg)object4, string2, l2);
                        zzou2.zzb((zzbl)object5, zzp3);
                    }
                    break block64;
                }
                n3 = zzp3.zzi;
                if (n3 != 0) {
                    object = new Bundle();
                    object3 = "_cd";
                    object4 = new zzbg((Bundle)object);
                    string2 = "auto";
                    object2 = object5;
                    object5 = new zzbl((String)object3, (zzbg)object4, string2, l2);
                    zzou2.zzb((zzbl)object5, zzp3);
                }
            }
            object = this.zzf();
            ((zzar)object).zzx();
            this.zzf().zzr();
            return;
        }
        this.zzf().zzr();
        throw throwable2;
    }

    public final zzai zze() {
        return ((zzic)Preconditions.checkNotNull(this.zzm)).zzf();
    }

    public final void zze(zzp zzp2) {
        int n3;
        block22: {
            Object object;
            Object object2 = "app_id=?";
            ArrayList arrayList = this.zzz;
            if (arrayList != null) {
                this.zzaa = arrayList = new ArrayList();
                object = this.zzz;
                arrayList.addAll(object);
            }
            arrayList = this.zzf();
            object = (String)Preconditions.checkNotNull(zzp2.zza);
            Preconditions.checkNotEmpty((String)object);
            ((zzjf)((Object)arrayList)).zzv();
            ((zzot)((Object)arrayList)).zzam();
            Object object3 = ((zzar)((Object)arrayList)).f_();
            Object object4 = new String[]{object};
            String string2 = "apps";
            int n4 = object3.delete(string2, (String)object2, object4);
            String string3 = "events";
            int n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "events_snapshot";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "user_attributes";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "conditional_properties";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "raw_events";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "raw_events_metadata";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "queue";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "audience_filter_values";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "main_event_params";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "default_event_params";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "trigger_uris";
            n7 = object3.delete(string3, (String)object2, object4);
            n4 += n7;
            string3 = "upload_queue";
            n3 = object3.delete(string3, (String)object2, object4);
            if ((n4 += n3) <= 0) break block22;
            object2 = ((zzjf)((Object)arrayList)).zzj();
            object2 = ((zzgo)object2).zzq();
            object3 = "Reset analytics data. app, records";
            object4 = n4;
            try {
                ((zzgq)object2).zza((String)object3, object, object4);
            }
            catch (SQLiteException sQLiteException) {
                arrayList = ((zzjf)((Object)arrayList)).zzj().zzg();
                object3 = "Error resetting analytics data. appId, error";
                object = zzgo.zza((String)object);
                ((zzgq)((Object)arrayList)).zza((String)object3, object, (Object)sQLiteException);
            }
        }
        if ((n3 = zzp2.zzh) != 0) {
            this.zzd(zzp2);
        }
    }

    public final zzar zzf() {
        return (zzar)zzou.zza(this.zzd);
    }

    public final void zzf(zzp zzp2) {
        int n3;
        zzjm zzjm2;
        zzou zzou2 = this;
        Object object = zzp2;
        this.zzl().zzv();
        this.zzt();
        Preconditions.checkNotEmpty(zzp2.zza);
        Object object2 = zzbd.zza(zzp2.zzz);
        Object object3 = this.zzj().zzq();
        Object object4 = zzp2.zza;
        ((zzgq)object3).zza("Setting DMA consent for package", object4, object2);
        object = zzp2.zza;
        this.zzl().zzv();
        this.zzt();
        object3 = this.zza((String)object);
        int n4 = 100;
        object3 = zzbd.zza((Bundle)object3, n4).zzc();
        this.zzad.put(object, object2);
        this.zzf().zza((String)object, (zzbd)object2);
        object2 = zzbd.zza(this.zza((String)object), n4).zzc();
        this.zzl().zzv();
        this.zzt();
        Object object5 = zzjm.zzc;
        int n7 = 0;
        object4 = null;
        if (object3 == object5 && object2 == (zzjm2 = zzjm.zzd)) {
            n3 = 1;
        } else {
            n3 = 0;
            zzjm2 = null;
        }
        zzjm zzjm3 = zzjm.zzd;
        if (object3 == zzjm3 && object2 == object5) {
            n7 = 1;
        }
        if (n3 != 0 || n7 != 0) {
            this.zzj().zzq().zza("Generated _dcu event for", object);
            object2 = new Bundle();
            Object object6 = this.zzf();
            long l2 = this.zzy();
            boolean bl2 = false;
            object3 = ((zzar)object6).zza(l2, (String)object, false, false, false, false, false, false, false);
            long l3 = ((zzas)object3).zzf;
            object4 = this.zze();
            object6 = zzbn.zzbg;
            n7 = ((zzai)object4).zzb((String)object, (zzfx)object6);
            long l4 = n7;
            n3 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (n3 < 0) {
                long l7 = 1L;
                object2.putLong("_r", l7);
                object6 = this.zzf();
                l2 = this.zzy();
                bl2 = true;
                object3 = ((zzar)object6).zza(l2, (String)object, false, false, false, false, false, bl2, false);
                object5 = this.zzj().zzq();
                l4 = ((zzas)object3).zzf;
                object3 = l4;
                object4 = "_dcu realtime event count";
                ((zzgq)object5).zza((String)object4, object, object3);
            }
            object3 = zzou2.zzak;
            object5 = "_dcu";
            object3.zza((String)object, (String)object5, (Bundle)object2);
        }
    }

    public final zzgl zzg() {
        return this.zzm.zzk();
    }

    public final void zzg(zzp object) {
        this.zzl().zzv();
        this.zzt();
        Preconditions.checkNotEmpty(((zzp)object).zza);
        int n3 = ((zzp)object).zzy;
        zzjj zzjj2 = zzjj.zza(((zzp)object).zzt, n3);
        Object object2 = ((zzp)object).zza;
        this.zzb((String)object2);
        object2 = this.zzj().zzq();
        String string2 = ((zzp)object).zza;
        ((zzgq)object2).zza("Setting storage consent for package", string2, zzjj2);
        object = ((zzp)object).zza;
        this.zza((String)object, zzjj2);
    }

    public final zzgv zzh() {
        return (zzgv)zzou.zza(this.zzc);
    }

    public final zzhm zzi() {
        return (zzhm)zzou.zza(this.zzb);
    }

    public final zzgo zzj() {
        return ((zzic)Preconditions.checkNotNull(this.zzm)).zzj();
    }

    public final zzic zzk() {
        return this.zzm;
    }

    public final zzhv zzl() {
        return ((zzic)Preconditions.checkNotNull(this.zzm)).zzl();
    }

    public final zzlt zzm() {
        return (zzlt)zzou.zza(this.zzi);
    }

    public final zznp zzn() {
        return this.zzj;
    }

    public final zzos zzo() {
        return this.zzk;
    }

    public final zzpj zzp() {
        return (zzpj)zzou.zza(this.zzh);
    }

    public final zzpn zzq() {
        return ((zzic)Preconditions.checkNotNull(this.zzm)).zzv();
    }

    public final void zzr() {
        this.zzl().zzv();
    }

    public final void zzs() {
        Object object = this.zzl();
        ((zzhv)object).zzv();
        this.zzt();
        int n3 = this.zzo;
        if (n3 == 0) {
            this.zzo = true;
            n3 = this.zzah();
            if (n3 != 0) {
                object = this.zzy;
                n3 = this.zza((FileChannel)object);
                Object object2 = this.zzm.zzh();
                int n4 = ((zzgg)object2).zzad();
                Object object3 = this.zzl();
                ((zzhv)object3).zzv();
                if (n3 > n4) {
                    object3 = this.zzj().zzg();
                    object = n3;
                    object2 = n4;
                    String string2 = "Panic: can't downgrade version. Previous, current version";
                    ((zzgq)object3).zza(string2, object, object2);
                } else if (n3 < n4) {
                    object3 = this.zzy;
                    boolean bl2 = this.zza(n4, (FileChannel)object3);
                    if (bl2) {
                        object3 = this.zzj().zzq();
                        object = n3;
                        object2 = n4;
                        String string3 = "Storage version upgraded. Previous, current version";
                        ((zzgq)object3).zza(string3, object, object2);
                    } else {
                        object3 = this.zzj().zzg();
                        object = n3;
                        object2 = n4;
                        String string4 = "Storage version upgrade failed. Previous, current version";
                        ((zzgq)object3).zza(string4, object, object2);
                    }
                }
            }
        }
    }

    public final void zzt() {
        boolean bl2 = this.zzn;
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("UploadController is not initialized");
        throw illegalStateException;
    }

    public final void zzu() {
        int n3;
        this.zzt = n3 = this.zzt + 1;
    }

    public final void zzv() {
        int n3;
        this.zzs = n3 = this.zzs + 1;
    }

    public final void zzw() {
        long l2;
        long l3;
        boolean bl2;
        Object object;
        this.zzl().zzv();
        this.zzf().zzw();
        Object object2 = this.zzf();
        ((zzjf)object2).zzv();
        ((zzot)object2).zzam();
        boolean n3 = ((zzar)object2).zzab();
        long l4 = 0L;
        if (n3) {
            object = zzbn.zzbp;
            bl2 = false;
            String string2 = null;
            Long l7 = (Long)object.zza(null);
            long l8 = l7;
            long l12 = l8 - l4;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 != false) {
                l7 = ((zzar)object2).f_();
                long l14 = ((zzjf)object2).zzb().currentTimeMillis();
                String string3 = String.valueOf(l14);
                object = String.valueOf(object.zza(null));
                string2 = "trigger_uris";
                string3 = "abs(timestamp_millis - ?) > cast(? as integer)";
                int n4 = l7.delete(string2, string3, (String[])(object = new String[]{string3, object}));
                if (n4 > 0) {
                    object2 = ((zzjf)object2).zzj().zzq();
                    object = n4;
                    string2 = "Deleted stale trigger uris. rowsDeleted";
                    ((zzgq)object2).zza(string2, object);
                }
            }
        }
        if (!(bl2 = (l3 = (l2 = ((zzhf)(object2 = this.zzj.zzd)).zza()) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1))) {
            object2 = this.zzj.zzd;
            object = this.zzb();
            long l15 = object.currentTimeMillis();
            ((zzhf)object2).zza(l15);
        }
        this.zzaf();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzx() {
        block15: {
            block16: {
                this.zzl().zzv();
                this.zzt();
                this.zzw = true;
                try {
                    var1_1 = this.zzm;
                    var1_1 = var1_1.zzt();
                    var1_1 = var1_1.zzad();
                    if (var1_1 == null) {
                        var1_1 = this.zzj();
                        var1_1 = var1_1.zzr();
                        var2_3 = "Upload data called on the client side before use of service was decided";
                        var1_1.zza(var2_3);
                        this.zzw = false;
                        this.zzac();
                        return;
                    }
                }
                catch (Throwable var1_2) {
                    break block15;
                }
                {
                    var3_8 = var1_1.booleanValue();
                    if (!var3_8) ** GOTO lbl-1000
                    var1_1 = this.zzj();
                    var1_1 = var1_1.zzg();
                    var2_4 = "Upload called in the client side when service should be used";
                    var1_1.zza(var2_4);
                    this.zzw = false;
                    this.zzac();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var4_9 = this.zzp;
                    var6_10 = 0L;
                    cfr_temp_0 = var4_9 - var6_10;
                    var8_11 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var8_11 /* !! */  <= 0) ** GOTO lbl-1000
                    this.zzaf();
                    this.zzw = false;
                    this.zzac();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var1_1 = this.zzl();
                    var1_1.zzv();
                    var1_1 = this.zzz;
                    if (var1_1 == null) ** GOTO lbl-1000
                    var1_1 = this.zzj();
                    var1_1 = var1_1.zzq();
                    var2_5 = "Uploading requested multiple times";
                    var1_1.zza(var2_5);
                    this.zzw = false;
                    this.zzac();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var1_1 = this.zzh();
                    var3_8 = var1_1.zzr();
                    if (var3_8) ** GOTO lbl-1000
                    var1_1 = this.zzj();
                    var1_1 = var1_1.zzq();
                    var2_6 = "Network not connected, ignoring upload request";
                    var1_1.zza(var2_6);
                    this.zzaf();
                    this.zzw = false;
                    this.zzac();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var1_1 = this.zzb();
                    var4_9 = var1_1.currentTimeMillis();
                    var9_12 = this.zze();
                    var10_13 = zzbn.zzbc;
                    var11_14 /* !! */  = false;
                    var8_11 /* !! */  = var9_12.zzb(null, var10_13);
                    this.zze();
                    var12_15 = com.google.android.gms.measurement.internal.zzai.zzg();
                    var12_15 = var4_9 - var12_15;
                    var10_13 = null;
                }
                {
                    for (var14_16 = 0; var14_16 < var8_11 /* !! */  && (var15_17 = this.zzb(null, var12_15)); ++var14_16) {
                    }
                    var8_11 /* !! */  = (long)com.google.android.gms.internal.measurement.zzoy.zza();
                    if (var8_11 /* !! */  != false) {
                        this.zzad();
                    }
                    var9_12 = this.zzj;
                    var9_12 = var9_12.zzd;
                    var16_18 = var9_12.zza();
                    cfr_temp_1 = var16_18 - var6_10;
                    var11_14 /* !! */  = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                    if (!var11_14 /* !! */ ) ** GOTO lbl88
                    var18_19 = this.zzj();
                    var18_19 = var18_19.zzc();
                    var19_20 = "Uploading events. Elapsed time since last upload attempt (ms)";
                    var16_18 = var4_9 - var16_18;
                }
                {
                    var16_18 = Math.abs(var16_18);
                    var9_12 = var16_18;
                    var18_19.zza((String)var19_20, var9_12);
lbl88:
                    // 2 sources

                    var18_19 = this.zzf();
                    var18_19 = var18_19.g_();
                    var20_21 /* !! */  = TextUtils.isEmpty((CharSequence)var18_19);
                    var16_18 = -1;
                    if (!var20_21 /* !! */ ) {
                        var21_22 = this.zzab;
                        cfr_temp_2 = var21_22 - var16_18;
                        var20_21 /* !! */  = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                        if (!var20_21 /* !! */ ) {
                            var19_20 = this.zzf();
                            this.zzab = var23_23 = var19_20.c_();
                        }
                        this.zza((String)var18_19, var4_9);
                        break block16;
                    }
                    this.zzab = var16_18;
                    var18_19 = this.zzf();
                    this.zze();
                    var23_24 = com.google.android.gms.measurement.internal.zzai.zzg();
                }
                {
                    var1_1 = var18_19.zzb(var4_9 -= var23_24);
                    var25_25 = TextUtils.isEmpty((CharSequence)var1_1);
                    if (var25_25 || (var1_1 = (var2_7 = this.zzf()).zzd((String)var1_1)) == null) break block16;
                    this.zzb((zzh)var1_1);
                }
            }
            this.zzw = false;
            this.zzac();
            return;
        }
        this.zzw = false;
        this.zzac();
        throw var1_2;
    }
}

