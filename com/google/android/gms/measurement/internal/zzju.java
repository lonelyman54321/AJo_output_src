/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.SparseArray
 */
package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgg;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhd;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzjt;
import com.google.android.gms.measurement.internal.zzjw;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzka;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;
import com.google.android.gms.measurement.internal.zzkd;
import com.google.android.gms.measurement.internal.zzke;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzkh;
import com.google.android.gms.measurement.internal.zzkj;
import com.google.android.gms.measurement.internal.zzkk;
import com.google.android.gms.measurement.internal.zzkl;
import com.google.android.gms.measurement.internal.zzkm;
import com.google.android.gms.measurement.internal.zzkn;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzkr;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzkt;
import com.google.android.gms.measurement.internal.zzku;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzky;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzla;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.measurement.internal.zzlc;
import com.google.android.gms.measurement.internal.zzld;
import com.google.android.gms.measurement.internal.zzle;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzll;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzlv;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzod;
import com.google.android.gms.measurement.internal.zzoe;
import com.google.android.gms.measurement.internal.zzof;
import com.google.android.gms.measurement.internal.zzog;
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzor;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzu;
import com.google.android.gms.tagmanager.TagManagerService;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzju
extends zzf {
    final zzu zza;
    private zzlk zzb;
    private zzjq zzc;
    private final Set zzd;
    private boolean zze;
    private final AtomicReference zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzbb zzj;
    private zzbb zzk;
    private PriorityQueue zzl;
    private boolean zzm;
    private zzjj zzn;
    private final AtomicLong zzo;
    private long zzp;
    private boolean zzq;
    private zzbb zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzbb zzt;
    private final zzpp zzv;

    public zzju(zzic zzic2) {
        super(zzic2);
        int n3;
        Object object = new CopyOnWriteArraySet();
        this.zzd = object;
        this.zzg = object = new Object();
        this.zzh = false;
        this.zzi = n3 = 1;
        this.zzq = n3;
        this.zzv = object = new zzld(this);
        object = new AtomicReference();
        this.zzf = object;
        this.zzn = object = zzjj.zza;
        this.zzp = -1;
        this.zzo = object = new AtomicLong(0L);
        this.zza = object = new zzu(zzic2);
    }

    public static /* bridge */ /* synthetic */ int zza(zzju zzju2) {
        return zzju2.zzi;
    }

    public static /* synthetic */ int zza(zzju object, Throwable object2) {
        String string2 = ((Throwable)object2).getMessage();
        boolean bl2 = false;
        String string3 = null;
        ((zzju)object).zzm = false;
        if (string2 != null) {
            String string4;
            bl2 = object2 instanceof IllegalStateException;
            if (!(bl2 || (bl2 = string2.contains(string3 = "garbage collected")) || (bl2 = (string3 = object2.getClass().getSimpleName()).equals(string4 = "ServiceUnavailableException")))) {
                boolean bl3 = object2 instanceof SecurityException;
                if (bl3 && !(bl3 = string2.endsWith((String)(object = "READ_DEVICE_CONFIG")))) {
                    return 3;
                }
            } else {
                object2 = "Background";
                boolean bl4 = string2.contains((CharSequence)object2);
                int n3 = 1;
                if (bl4) {
                    ((zzju)object).zzm = n3;
                }
                return n3;
            }
        }
        return 2;
    }

    public static /* synthetic */ int zza(Long l2, Long l3) {
        long l4 = l2;
        long l7 = l3;
        return Long.compare(l4, l7);
    }

    public static int zza(String string2) {
        Preconditions.checkNotEmpty(string2);
        return 25;
    }

    public static /* synthetic */ Long zza(zzog zzog2) {
        return zzog2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(Bundle object, int n3, long l2) {
        String string2;
        Object object2;
        this.zzw();
        Object object3 = zzjj.zza((Bundle)object);
        if (object3 != null) {
            object2 = this.zzj().zzw();
            string2 = "Ignoring invalid consent setting";
            ((zzgq)object2).zza(string2, object3);
            object3 = this.zzj().zzw();
            object2 = "Valid consent values are 'granted', 'denied'";
            ((zzgq)object3).zza((String)object2);
        }
        object3 = this.zzl();
        boolean bl2 = ((zzhv)object3).zzm();
        object2 = zzjj.zza((Bundle)object, n3);
        boolean bl3 = ((zzjj)object2).zzi();
        if (bl3) {
            this.zza((zzjj)object2, bl2);
        }
        if (bl3 = ((zzbd)(object2 = zzbd.zza((Bundle)object, n3))).zzg()) {
            this.zza((zzbd)object2, bl2);
        }
        if ((object = zzbd.zza((Bundle)object)) != null) {
            int n4 = -30;
            String string3 = n3 == n4 ? "tcf" : "app";
            string2 = string3;
            if (bl2) {
                String string4 = ((Boolean)object).toString();
                object2 = this;
                this.zza(string3, "allow_personalized_ads", (Object)string4, l2);
                return;
            }
            String string5 = ((Boolean)object).toString();
            String string6 = "allow_personalized_ads";
            object2 = this;
            this.zza(string3, string6, string5, false, l2);
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzju zzju2, int n3) {
        zzju2.zzi = n3;
    }

    public static /* synthetic */ void zza(zzju object, SharedPreferences object2, String string2) {
        object2 = "IABTCF_TCString";
        boolean bl2 = ((String)object2).equals(string2);
        if (bl2) {
            object2 = ((zzju)object).zzj().zzq();
            string2 = "IABTCF_TCString change picked up in listener.";
            ((zzgq)object2).zza(string2);
            object = (zzbb)Preconditions.checkNotNull(((zzju)object).zzt);
            long l2 = 500L;
            ((zzbb)object).zza(l2);
        }
    }

    public static /* synthetic */ void zza(zzju zzf2, Bundle object) {
        Object object2;
        Bundle bundle;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            bundle = object;
        } else {
            String string2;
            int n3;
            object2 = ((zzju)zzf2).zzk().zzt.zza();
            bundle = new Bundle((Bundle)object2);
            object2 = object.keySet().iterator();
            while (true) {
                Object object3;
                boolean bl3;
                n3 = object2.hasNext();
                int n4 = 0;
                Object object4 = null;
                String string3 = null;
                if (n3 == 0) break;
                string2 = (String)object2.next();
                Object object5 = object.get(string2);
                if (!(object5 == null || (bl3 = object5 instanceof String) || (bl3 = object5 instanceof Long) || (bl3 = object5 instanceof Double))) {
                    ((zzju)zzf2).zzs();
                    bl3 = zzpn.zza(object5);
                    if (bl3) {
                        ((zzju)zzf2).zzs();
                        object3 = ((zzju)zzf2).zzv;
                        int n7 = 27;
                        zzpn.zza((zzpp)object3, n7, null, null, 0);
                    }
                    object4 = ((zzju)zzf2).zzj().zzw();
                    string3 = "Invalid default event parameter type. Name, value";
                    ((zzgq)object4).zza(string3, string2, object5);
                    continue;
                }
                bl3 = zzpn.zzf(string2);
                if (bl3) {
                    object4 = ((zzju)zzf2).zzj().zzw();
                    string3 = "Invalid default event parameter name. Name";
                    ((zzgq)object4).zza(string3, string2);
                    continue;
                }
                if (object5 == null) {
                    bundle.remove(string2);
                    continue;
                }
                object3 = ((zzju)zzf2).zzs();
                zzai zzai2 = ((zzju)zzf2).zze();
                n4 = zzai2.zza(null, false);
                string3 = "param";
                if ((n4 = (int)(((zzpn)object3).zza(string3, string2, n4, object5) ? 1 : 0)) == 0) continue;
                object4 = ((zzju)zzf2).zzs();
                ((zzpn)object4).zza(bundle, string2, object5);
            }
            ((zzju)zzf2).zzs();
            object2 = ((zzju)zzf2).zze();
            int n8 = ((zzai)object2).zzc();
            n8 = (int)(zzpn.zza(bundle, n8) ? 1 : 0);
            if (n8 != 0) {
                ((zzju)zzf2).zzs();
                object2 = ((zzju)zzf2).zzv;
                n3 = 26;
                zzpn.zza((zzpp)object2, n3, null, null, 0);
                object2 = ((zzju)zzf2).zzj().zzw();
                string2 = "Too many default event parameters set. Discarding beyond event parameter limit";
                ((zzgq)object2).zza(string2);
            }
        }
        object2 = ((zzju)zzf2).zzk().zzt;
        ((zzhc)object2).zza(bundle);
        boolean bl4 = object.isEmpty();
        if (!bl4 || (bl4 = ((zzai)(object = ((zzju)zzf2).zze())).zza((zzfx)(object2 = zzbn.zzcy)))) {
            zzf2 = ((zzju)zzf2).zzq();
            ((zzme)zzf2).zza(bundle);
        }
    }

    public static /* synthetic */ void zza(zzju zzju2, Bundle bundle, long l2) {
        String string2 = zzju2.zzg().zzah();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            zzju2.zza(bundle, 0, l2);
            return;
        }
        zzju2.zzj().zzw().zza("Using developer consent only; google app id found");
    }

    public static /* synthetic */ void zza(zzju object, zzjj atomicReference, long l2, boolean bl2, boolean bl3) {
        int n3;
        ((zzju)object).zzv();
        ((zzf)object).zzw();
        Object object2 = ((zzju)object).zzk().zzp();
        long l3 = ((zzju)object).zzp;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 <= 0) {
            n3 = ((zzjj)object2).zza();
            int n4 = ((zzjj)((Object)atomicReference)).zza();
            if ((n3 = (int)(zzjj.zza(n3, n4) ? 1 : 0)) != 0) {
                ((zzju)object).zzj().zzp().zza("Dropped out-of-date consent setting, proposed settings", atomicReference);
                return;
            }
        }
        if ((n3 = (int)(((zzha)(object2 = ((zzju)object).zzk())).zza((zzjj)((Object)atomicReference)) ? 1 : 0)) != 0) {
            object2 = ((zzju)object).zzj().zzq();
            String string2 = "Setting storage consent(FE)";
            ((zzgq)object2).zza(string2, atomicReference);
            ((zzju)object).zzp = l2;
            atomicReference = ((zzju)object).zzq();
            boolean bl4 = ((zzme)((Object)atomicReference)).zzao();
            if (bl4) {
                atomicReference = ((zzju)object).zzq();
                ((zzme)((Object)atomicReference)).zzb(bl2);
            } else {
                atomicReference = ((zzju)object).zzq();
                ((zzme)((Object)atomicReference)).zza(bl2);
            }
            if (bl3) {
                object = ((zzju)object).zzq();
                atomicReference = new AtomicReference();
                ((zzme)object).zza(atomicReference);
                return;
            }
        } else {
            object = ((zzju)object).zzj().zzp();
            int n7 = ((zzjj)((Object)atomicReference)).zza();
            atomicReference = n7;
            String string3 = "Lower precedence consent source ignored, proposed source";
            ((zzgq)object).zza(string3, atomicReference);
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzju zzju2, Boolean bl2, boolean bl3) {
        zzju2.zza(bl2, true);
    }

    public static /* synthetic */ void zza(zzju zzf2, String string2) {
        zzgg zzgg2 = ((zzju)zzf2).zzg();
        boolean bl2 = zzgg2.zzb(string2);
        if (bl2) {
            zzf2 = ((zzju)zzf2).zzg();
            ((zzgg)zzf2).zzaj();
        }
    }

    public static /* synthetic */ void zza(zzju zzju2, List object) {
        zzju2.zzv();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            SparseArray sparseArray = zzju2.zzk().zzm();
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                long l2;
                Serializable serializable;
                long l3;
                long l4;
                long l7;
                zzog zzog2 = (zzog)object.next();
                int n7 = zzog2.zzc;
                if ((n7 = (int)(tg3_1.b(sparseArray, n7) ? 1 : 0)) != 0 && (l7 = (l4 = (l3 = ((Long)(serializable = (Long)sparseArray.get(n7 = zzog2.zzc))).longValue()) - (l2 = zzog2.zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0) continue;
                serializable = zzju2.zzan();
                ((PriorityQueue)serializable).add(zzog2);
            }
            zzju2.zzav();
        }
    }

    public static /* synthetic */ void zza(zzju zzf2, AtomicReference atomicReference) {
        Bundle bundle = ((zzju)zzf2).zzk().zzi.zza();
        zzf2 = ((zzju)zzf2).zzq();
        if (bundle == null) {
            bundle = new Bundle();
        }
        ((zzme)zzf2).zza(atomicReference, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzju object, AtomicReference atomicReference, zzon object2, String string2, int n3, Throwable object3, byte[] object4, Map object5) {
        int n4;
        Object object6;
        Object object7;
        ((zzju)object).zzv();
        int n7 = 200;
        n7 = (n3 == n7 || n3 == (n7 = 204) || n3 == (n7 = 304)) && object3 == null ? 1 : 0;
        if (n7 != 0) {
            object7 = ((zzju)object).zzj().zzq();
            object3 = "[sgtm] Upload succeeded for row_id";
            long l2 = ((zzon)object2).zza;
            object4 = l2;
            ((zzgq)object7).zza((String)object3, object4);
        } else {
            object4 = ((zzju)object).zzj().zzr();
            object5 = "[sgtm] Upload failed for row_id. response, exception";
            long l3 = ((zzon)object2).zza;
            object6 = l3;
            object7 = n3;
            ((zzgq)object4).zza((String)object5, object6, object7, object3);
        }
        object7 = ((zzju)object).zzq();
        long l4 = ((zzon)object2).zza;
        if (n7 != 0) {
            object4 = zzlv.zza;
            n4 = ((zzlv)((Object)object4)).zza();
        } else {
            object4 = (Object)zzlv.zzb;
            n4 = ((zzlv)((Object)object4)).zza();
        }
        long l7 = ((zzon)object2).zze;
        object6 = object3;
        object3 = new zzae(l4, n4, l7);
        ((zzme)object7).zza((zzae)object3);
        object = ((zzju)object).zzj().zzq();
        object7 = "[sgtm] Updated status for row_id";
        long l8 = ((zzon)object2).zza;
        object2 = l8;
        object3 = n7 != 0 ? "SUCCESS" : "FAILURE";
        ((zzgq)object).zza((String)object7, object2, object3);
        synchronized (atomicReference) {
            object = n7 != 0;
            atomicReference.set(object);
            atomicReference.notifyAll();
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzju zzju2, boolean bl2) {
        zzju2.zzh = false;
    }

    private final void zza(Boolean bl2, boolean bl3) {
        boolean bl4;
        zzjh zzjh2;
        this.zzv();
        this.zzw();
        Object object = this.zzj().zzc();
        String string2 = "Setting app measurement enabled (FE)";
        ((zzgq)object).zza(string2, bl2);
        object = this.zzk();
        ((zzha)object).zza(bl2);
        if (bl3) {
            zzjh2 = this.zzk();
            ((zzha)zzjh2).zzb(bl2);
        }
        if ((bl3 = ((zzic)(zzjh2 = this.zzu)).zzaf()) || bl2 != null && !(bl4 = bl2.booleanValue())) {
            this.zzay();
        }
    }

    private final void zza(String string2, String string3, long l2, Object object) {
        zzhv zzhv2 = this.zzl();
        zzkt zzkt2 = new zzkt(this, string2, string3, object, l2);
        zzhv2.zzb(zzkt2);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final boolean zza(zzon object) {
        Serializable serializable;
        block14: {
            long l2;
            long l3;
            int n3;
            Object object2;
            URL uRL;
            Object object3;
            block13: {
                void var2_6;
                boolean bl2;
                object3 = ((zzon)object).zzc;
                serializable = new URI((String)object3);
                uRL = ((URI)serializable).toURL();
                serializable = new AtomicReference();
                String string2 = this.zzg().zzag();
                object3 = this.zzj().zzq();
                Object object4 = "[sgtm] Uploading data from app. row_id, url, uncompressed size";
                long l4 = ((zzon)object).zza;
                object2 = l4;
                Object object5 = ((zzon)object).zzc;
                n3 = ((zzon)object).zzb.length;
                Serializable serializable2 = Integer.valueOf(n3);
                ((zzgq)object3).zza((String)object4, object2, object5, serializable2);
                object3 = ((zzon)object).zzf;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl3) {
                    object3 = this.zzj().zzq();
                    object4 = "[sgtm] Uploading data from app. row_id";
                    l4 = ((zzon)object).zza;
                    object2 = l4;
                    object5 = ((zzon)object).zzf;
                    ((zzgq)object3).zza((String)object4, object2, object5);
                }
                serializable2 = new HashMap();
                object3 = ((zzon)object).zzd.keySet().iterator();
                while (bl2 = object3.hasNext()) {
                    object4 = (String)object3.next();
                    object2 = ((zzon)object).zzd.getString((String)object4);
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
                    if (bl4) continue;
                    ((HashMap)serializable2).put(object4, object2);
                }
                object2 = this.zzn();
                object5 = ((zzon)object).zzb;
                zzkc zzkc2 = new zzkc(this, (AtomicReference)serializable, (zzon)object);
                ((zzji)object2).zzad();
                Preconditions.checkNotNull(uRL);
                Preconditions.checkNotNull(object5);
                Preconditions.checkNotNull(zzkc2);
                object = ((zzlp)object2).zzl();
                object4 = object3;
                object3 = new zzlr((zzlp)object2, string2, uRL, (byte[])object5, (Map)((Object)serializable2), zzkc2);
                ((zzhv)object).zza((Runnable)object3);
                object = this.zzs();
                object3 = ((zzpn)object).zzb();
                l3 = object3.currentTimeMillis();
                l2 = 60000L;
                l3 += l2;
                // MONITORENTER : serializable
                break block13;
                catch (MalformedURLException malformedURLException) {
                }
                catch (URISyntaxException uRISyntaxException) {
                    // empty catch block
                }
                zzgq zzgq2 = this.zzj().zzg();
                String string3 = ((zzon)object).zzc;
                object = ((zzon)object).zza;
                zzgq2.zza("[sgtm] Bad upload url for row_id", string3, object, var2_6);
                return false;
            }
            try {
                long l7;
                long l8;
                while ((uRL = ((AtomicReference)serializable).get()) == null && (n3 = (int)((l8 = l2 - (l7 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) > 0) {
                    serializable.wait(l2);
                    object2 = ((zzpn)object).zzb();
                    l2 = object2.currentTimeMillis();
                    l2 = l3 - l2;
                }
                // MONITOREXIT : serializable
                break block14;
            }
            catch (Throwable throwable) {}
            try {
                throw throwable;
            }
            catch (InterruptedException interruptedException) {}
            object = this.zzj().zzr();
            object3 = "[sgtm] Interrupted waiting for uploading batch";
            ((zzgq)object).zza((String)object3);
        }
        object = ((AtomicReference)serializable).get();
        serializable = Boolean.TRUE;
        if (object != serializable) return false;
        return true;
    }

    private final void zzay() {
        boolean bl2;
        Object object;
        this.zzv();
        Object object2 = this.zzk().zzh.zza();
        if (object2 != null) {
            object = "unset";
            boolean bl3 = ((String)object).equals(object2);
            if (bl3) {
                object2 = this.zzb();
                long l2 = object2.currentTimeMillis();
                String string2 = "app";
                String string3 = "_npa";
                Object var8_9 = null;
                object = this;
                this.zza(string2, string3, (Object)null, l2);
            } else {
                object = "true";
                bl2 = ((String)object).equals(object2);
                long l3 = bl2 ? 1L : 0L;
                Long l4 = l3;
                object2 = this.zzb();
                long l7 = object2.currentTimeMillis();
                String string4 = "app";
                String string5 = "_npa";
                zzju zzju2 = this;
                this.zza(string4, string5, (Object)l4, l7);
            }
        }
        if ((bl2 = ((zzic)(object2 = this.zzu)).zzae()) && (bl2 = this.zzq)) {
            this.zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            this.zzap();
            this.zzr().zza.zza();
            object2 = this.zzl();
            object = new zzkp(this);
            ((zzhv)object2).zzb((Runnable)object);
            return;
        }
        this.zzj().zzc().zza("Updating Scion state (FE)");
        this.zzq().zzak();
    }

    public static /* bridge */ /* synthetic */ zzbb zzb(zzju zzju2) {
        return zzju2.zzr;
    }

    public static /* synthetic */ void zzb(zzju object, int n3) {
        zzbb zzbb2 = ((zzju)object).zzj;
        if (zzbb2 == null) {
            zzic zzic2 = ((zzjf)object).zzu;
            ((zzju)object).zzj = zzbb2 = new zzkn((zzju)object, zzic2);
        }
        object = ((zzju)object).zzj;
        long l2 = (long)n3 * 1000L;
        ((zzbb)object).zza(l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void zzb(zzju zzju2, Bundle bundle) {
        Object object;
        zzpm zzpm2;
        Object object2 = bundle;
        Object object3 = "creation_timestamp";
        String string2 = "app_id";
        zzju2.zzv();
        zzju2.zzw();
        Preconditions.checkNotNull(bundle);
        String string3 = Preconditions.checkNotEmpty(bundle.getString("name"));
        Object object4 = zzju2.zzu;
        boolean bl2 = ((zzic)object4).zzae();
        if (!bl2) {
            zzju2.zzj().zzq().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        String string4 = "";
        long l2 = 0L;
        object4 = zzpm2;
        zzpm2 = new zzpm(string3, l2, null, string4);
        try {
            object = zzju2.zzs();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        String string5 = bundle.getString(string2);
        object4 = "expired_event_name";
        String string6 = bundle.getString((String)object4);
        object4 = "expired_event_params";
        Bundle bundle2 = bundle.getBundle((String)object4);
        Object object5 = "";
        long l3 = bundle.getLong((String)object3);
        boolean bl3 = true;
        boolean bl4 = true;
        zzbl zzbl2 = ((zzpn)object).zza(string5, string6, bundle2, (String)object5, l3, bl3, bl4);
        string3 = bundle.getString(string2);
        long l4 = bundle.getLong((String)object3);
        boolean bl5 = bundle.getBoolean("active");
        object = bundle.getString("trigger_event_name");
        long l7 = bundle.getLong("trigger_timeout");
        string2 = "time_to_live";
        l3 = bundle.getLong(string2);
        String string7 = "";
        string5 = null;
        object4 = object5;
        object3 = object5;
        object5 = null;
        ((zzag)object4)(string3, string7, zzpm2, l4, bl5, (String)object, null, l7, null, l3, zzbl2);
        object2 = zzju2.zzq();
        ((zzme)object2).zza((zzag)object4);
    }

    public static /* synthetic */ void zzb(zzju zzf2, AtomicReference atomicReference) {
        zzf2 = ((zzju)zzf2).zzq();
        zzlu zzlu2 = zzlu.zzd;
        Object object = new zzlu[]{zzlu2};
        object = zzop.zza(object);
        ((zzme)zzf2).zza(atomicReference, (zzop)object);
    }

    private final void zzb(String string2, String string3, long l2, Bundle bundle, boolean bl2, boolean bl3, boolean bl4, String string4) {
        Bundle bundle2 = zzpn.zza(bundle);
        zzhv zzhv2 = this.zzl();
        zzkq zzkq2 = new zzkq(this, string2, string3, l2, bundle2, bl2, bl3, bl4, string4);
        zzhv2.zzb(zzkq2);
    }

    public static /* synthetic */ void zzc(zzju zzju2) {
        zzju2.zzay();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void zzc(zzju zzju2, Bundle bundle) {
        zzpm zzpm2;
        Object object = bundle;
        String string2 = "app_id";
        zzju2.zzv();
        zzju2.zzw();
        Preconditions.checkNotNull(bundle);
        Object object2 = bundle.getString("name");
        String string3 = bundle.getString("origin");
        Preconditions.checkNotEmpty((String)object2);
        Preconditions.checkNotEmpty(string3);
        Object object3 = "value";
        Preconditions.checkNotNull(bundle.get((String)object3));
        Object object4 = zzju2.zzu;
        boolean bl2 = ((zzic)object4).zzae();
        if (!bl2) {
            zzju2.zzj().zzq().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        object4 = "triggered_timestamp";
        long l2 = bundle.getLong((String)object4);
        Object object5 = bundle.get((String)object3);
        object3 = zzpm2;
        Object object6 = string3;
        zzpm2 = new zzpm((String)object2, l2, object5, string3);
        try {
            object4 = zzju2.zzs();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        String string4 = bundle.getString(string2);
        object3 = "triggered_event_name";
        object5 = bundle.getString((String)object3);
        object3 = "triggered_event_params";
        object6 = bundle.getBundle((String)object3);
        boolean bl3 = true;
        boolean bl4 = true;
        long l3 = 0L;
        zzbl zzbl2 = ((zzpn)object4).zza(string4, (String)object5, (Bundle)object6, string3, l3, bl3, bl4);
        object4 = zzju2.zzs();
        string4 = bundle.getString(string2);
        object3 = "timed_out_event_name";
        object5 = bundle.getString((String)object3);
        object3 = "timed_out_event_params";
        object6 = bundle.getBundle((String)object3);
        bl3 = true;
        bl4 = true;
        l3 = 0L;
        object3 = ((zzpn)object4).zza(string4, (String)object5, (Bundle)object6, string3, l3, bl3, bl4);
        object4 = zzju2.zzs();
        string4 = bundle.getString(string2);
        object2 = "expired_event_name";
        object5 = bundle.getString((String)object2);
        object2 = "expired_event_params";
        object6 = bundle.getBundle((String)object2);
        bl3 = true;
        bl4 = true;
        l3 = 0L;
        zzbl zzbl3 = ((zzpn)object4).zza(string4, (String)object5, (Bundle)object6, string3, l3, bl3, bl4);
        string4 = bundle.getString(string2);
        long l4 = bundle.getLong("creation_timestamp");
        String string5 = bundle.getString("trigger_event_name");
        long l7 = bundle.getLong("trigger_timeout");
        string2 = "time_to_live";
        long l8 = bundle.getLong(string2);
        object4 = object2;
        object5 = string3;
        object6 = zzpm2;
        long l12 = l7;
        l7 = l8;
        object2 = new zzag(string4, string3, zzpm2, l4, false, string5, (zzbl)object3, l12, zzbl2, l8, zzbl3);
        object = zzju2.zzq();
        ((zzme)object).zza((zzag)object2);
    }

    public final ArrayList zza(String arrayList, String string2) {
        AtomicReference atomicReference = this.zzl();
        boolean bl2 = ((zzhv)((Object)atomicReference)).zzm();
        zzhv zzhv2 = null;
        if (bl2) {
            this.zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            arrayList = new ArrayList(0);
            return arrayList;
        }
        bl2 = zzaf.zza();
        if (bl2) {
            this.zzj().zzg().zza("Cannot get conditional user properties from main thread");
            arrayList = new ArrayList(0);
            return arrayList;
        }
        atomicReference = new AtomicReference();
        zzhv2 = this.zzu.zzl();
        Object object = arrayList;
        zzky zzky2 = new zzky(this, atomicReference, null, (String)((Object)arrayList), string2);
        long l2 = 5000L;
        object = "get conditional user properties";
        zzhv2.zza(atomicReference, l2, (String)object, zzky2);
        arrayList = (List)atomicReference.get();
        if (arrayList == null) {
            this.zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            arrayList = new ArrayList();
            return arrayList;
        }
        return zzpn.zzb(arrayList);
    }

    public final List zza(boolean bl2) {
        this.zzw();
        Object object = this.zzj().zzq();
        Object object2 = "Getting user properties (FE)";
        ((zzgq)object).zza((String)object2);
        object = this.zzl();
        boolean bl3 = ((zzhv)object).zzm();
        if (bl3) {
            this.zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        bl3 = zzaf.zza();
        if (bl3) {
            this.zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        object = this.zzu.zzl();
        zzkv zzkv2 = new zzkv(this, atomicReference, bl2);
        long l2 = 5000L;
        String string2 = "get user properties";
        object2 = atomicReference;
        ((zzhv)object).zza(atomicReference, l2, string2, zzkv2);
        object = (List)atomicReference.get();
        if (object == null) {
            object = this.zzj().zzg();
            Boolean bl4 = bl2;
            ((zzgq)object).zza("Timed out waiting for get user properties, includeInternal", bl4);
            return Collections.emptyList();
        }
        return object;
    }

    public final Map zza(String iterator, String object, boolean bl2) {
        boolean bl3;
        zzlb zzlb2;
        Object object2 = this.zzl();
        boolean bl4 = ((zzhv)object2).zzm();
        if (bl4) {
            this.zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        bl4 = zzaf.zza();
        if (bl4) {
            this.zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzu.zzl();
        object2 = zzlb2;
        Object object3 = iterator;
        zzlb2 = new zzlb(this, atomicReference, null, (String)((Object)iterator), (String)object, bl2);
        long l2 = 5000L;
        object3 = "get user properties";
        object2 = zzhv2;
        zzhv2.zza(atomicReference, l2, (String)object3, zzlb2);
        iterator = (List)atomicReference.get();
        if (iterator == null) {
            iterator = this.zzj().zzg();
            object = bl2;
            ((zzgq)((Object)iterator)).zza("Timed out waiting for handle get user properties, includeInternal", object);
            return Collections.emptyMap();
        }
        int n3 = iterator.size();
        object = new a53(n3);
        iterator = iterator.iterator();
        while (bl3 = iterator.hasNext()) {
            Object object4 = (zzpm)iterator.next();
            object2 = ((zzpm)object4).zza();
            if (object2 == null) continue;
            object4 = ((zzpm)object4).zza;
            ((a53)object).put(object4, object2);
        }
        return object;
    }

    public final void zza(long l2) {
        this.zzb((String)null);
        zzhv zzhv2 = this.zzl();
        zzkx zzkx2 = new zzkx(this, l2);
        zzhv2.zzb(zzkx2);
    }

    public final void zza(Intent object) {
        String string2;
        boolean bl2;
        if ((object = object.getData()) == null) {
            this.zzj().zzp().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        Object object2 = object.getQueryParameter("sgtm_debug_enable");
        if (object2 != null && (bl2 = ((String)object2).equals(string2 = "1"))) {
            object2 = "sgtm_preview_key";
            bl2 = TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter((String)object2)));
            if (!bl2) {
                object2 = this.zzj().zzp();
                string2 = "Preview Mode was enabled. Using the sgtmPreviewKey: ";
                ((zzgq)object2).zza(string2, object);
                object2 = this.zze();
                ((zzai)object2).zzh((String)object);
            }
            return;
        }
        this.zzj().zzp().zza("Preview Mode was not enabled.");
        this.zze().zzh(null);
    }

    public final void zza(Bundle bundle) {
        long l2 = this.zzb().currentTimeMillis();
        this.zza(bundle, l2);
    }

    public final void zza(Bundle object, long l2) {
        String string2;
        Preconditions.checkNotNull(object);
        Object object2 = new Bundle((Bundle)object);
        object = "app_id";
        Object object3 = object2.getString((String)object);
        int n3 = TextUtils.isEmpty((CharSequence)object3);
        if (n3 == 0) {
            object3 = this.zzj().zzr();
            string2 = "Package name should be null when calling setConditionalUserProperty";
            ((zzgq)object3).zza(string2);
        }
        object2.remove((String)object);
        Preconditions.checkNotNull(object2);
        object3 = String.class;
        string2 = null;
        zzjk.zza((Bundle)object2, (String)object, object3, null);
        object = "origin";
        zzjk.zza((Bundle)object2, (String)object, object3, null);
        String string3 = "name";
        zzjk.zza((Bundle)object2, string3, object3, null);
        String string4 = "value";
        zzjk.zza((Bundle)object2, string4, Object.class, null);
        String string5 = "trigger_event_name";
        zzjk.zza((Bundle)object2, string5, object3, null);
        long l3 = 0L;
        Object object4 = l3;
        String string6 = "trigger_timeout";
        Class<Long> clazz = Long.class;
        zzjk.zza((Bundle)object2, string6, clazz, object4);
        zzjk.zza((Bundle)object2, "timed_out_event_name", object3, null);
        Class<Bundle> clazz2 = Bundle.class;
        zzjk.zza((Bundle)object2, "timed_out_event_params", clazz2, null);
        zzjk.zza((Bundle)object2, "triggered_event_name", object3, null);
        object4 = "triggered_event_params";
        zzjk.zza((Bundle)object2, (String)object4, clazz2, null);
        Object object5 = l3;
        String string7 = "time_to_live";
        zzjk.zza((Bundle)object2, string7, clazz, object5);
        object5 = "expired_event_name";
        zzjk.zza((Bundle)object2, (String)object5, object3, null);
        zzjk.zza((Bundle)object2, "expired_event_params", clazz2, null);
        object3 = object2.getString(string3);
        Preconditions.checkNotEmpty((String)object3);
        Preconditions.checkNotEmpty(object2.getString((String)object));
        Preconditions.checkNotNull(object2.get(string4));
        object2.putLong("creation_timestamp", l2);
        object = object2.getString(string3);
        Object object6 = object2.get(string4);
        Object object7 = this.zzs();
        int n4 = ((zzpn)object7).zzb((String)object);
        if (n4 != 0) {
            object6 = this.zzj().zzg();
            object = this.zzi().zzc((String)object);
            ((zzgq)object6).zza("Invalid conditional user property name", object);
            return;
        }
        object7 = this.zzs();
        n4 = ((zzpn)object7).zza((String)object, object6);
        if (n4 != 0) {
            object7 = this.zzj().zzg();
            object = this.zzi().zzc((String)object);
            ((zzgq)object7).zza("Invalid conditional user property value", object, object6);
            return;
        }
        object7 = this.zzs().zzc((String)object, object6);
        if (object7 == null) {
            object7 = this.zzj().zzg();
            object = this.zzi().zzc((String)object);
            ((zzgq)object7).zza("Unable to normalize conditional user property value", object, object6);
            return;
        }
        zzjk.zza((Bundle)object2, object7);
        l2 = object2.getLong(string6);
        object3 = object2.getString(string5);
        n3 = TextUtils.isEmpty((CharSequence)object3);
        long l4 = 1L;
        long l7 = 15552000000L;
        if (n3 == 0 && ((n3 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) > 0 || (n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) < 0)) {
            object2 = this.zzj().zzg();
            object = this.zzi().zzc((String)object);
            object6 = l2;
            ((zzgq)object2).zza("Invalid conditional user property timeout", object, object6);
            return;
        }
        l2 = object2.getLong(string7);
        long l8 = l2 - l7;
        n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
        if (n3 <= 0 && (n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1))) >= 0) {
            object = this.zzl();
            object6 = new zzkw(this, (Bundle)object2);
            ((zzhv)object).zzb((Runnable)object6);
            return;
        }
        object2 = this.zzj().zzg();
        object = this.zzi().zzc((String)object);
        object6 = l2;
        ((zzgq)object2).zza("Invalid conditional user property time to live", object, object6);
    }

    public final void zza(zzdq zzdq2) {
        zzhv zzhv2 = this.zzl();
        zzla zzla2 = new zzla(this, zzdq2);
        zzhv2.zzb(zzla2);
    }

    public final void zza(zzbd zzbd2, boolean bl2) {
        zzlg zzlg2 = new zzlg(this, zzbd2);
        if (bl2) {
            this.zzv();
            zzlg2.run();
            return;
        }
        this.zzl().zzb(zzlg2);
    }

    public final void zza(zzjj object) {
        boolean bl2;
        this.zzv();
        boolean bl3 = ((zzjj)object).zzh();
        if (bl3 && (bl2 = ((zzjj)object).zzg()) || (bl2 = ((zzme)(object = this.zzq())).zzan())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = this.zzu;
        bl3 = ((zzic)object2).zzaf();
        if (bl2 != bl3) {
            this.zzu.zzb(bl2);
            object2 = this.zzk().zzr();
            if (!bl2 || object2 == null || (bl3 = ((Boolean)object2).booleanValue())) {
                object = bl2;
                this.zza((Boolean)object, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzjj object, boolean n3) {
        Object object2;
        Object object3;
        this.zzw();
        int n4 = ((zzjj)object).zza();
        int n7 = -10;
        if (n4 != n7 && (object3 = ((zzjj)object).zzc()) == (object2 = zzjm.zza) && (object3 = ((zzjj)object).zzd()) == object2) {
            this.zzj().zzw().zza("Ignoring empty consent settings");
            return;
        }
        object3 = this.zzg;
        synchronized (object3) {
            try {
                boolean bl2;
                Object object4;
                object2 = this.zzn;
                int n8 = ((zzjj)object2).zza();
                n8 = (int)(zzjj.zza(n4, n8) ? 1 : 0);
                boolean bl3 = false;
                if (n8 != 0) {
                    object2 = this.zzn;
                    n8 = (int)(((zzjj)object).zzc((zzjj)object2) ? 1 : 0);
                    boolean bl4 = ((zzjj)object).zzh();
                    if (bl4 && !(bl4 = ((zzjj)(object4 = this.zzn)).zzh())) {
                        bl3 = true;
                    }
                    object4 = this.zzn;
                    this.zzn = object = ((zzjj)object).zzb((zzjj)object4);
                    object4 = object;
                    bl2 = bl3;
                    bl3 = true;
                } else {
                    object4 = object;
                    n8 = 0;
                    object2 = null;
                    bl2 = false;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl30 : MonitorExitStatement: MONITOREXIT : var5_6 /* !! */ 
                if (!bl3) {
                    this.zzj().zzp().zza("Ignoring lower-priority consent settings, proposed settings", object4);
                    return;
                }
                object = this.zzo;
                long l2 = ((AtomicLong)object).getAndIncrement();
                if (n8 != 0) {
                    this.zzb((String)null);
                    object2 = object;
                    object = new zzlj(this, (zzjj)object4, l2, bl2);
                    if (n3 != 0) {
                        this.zzv();
                        object.run();
                        return;
                    }
                    this.zzl().zzc((Runnable)object);
                    return;
                }
                object2 = object;
                object = new zzli(this, (zzjj)object4, l2, bl2);
                if (n3 != 0) {
                    this.zzv();
                    object.run();
                    return;
                }
                n3 = 30;
                if (n4 != n3 && n4 != n7) {
                    this.zzl().zzb((Runnable)object);
                    return;
                }
                this.zzl().zzc((Runnable)object);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zza(zzjq zzjq2) {
        zzjq zzjq3;
        this.zzv();
        this.zzw();
        if (zzjq2 != null && zzjq2 != (zzjq3 = this.zzc)) {
            boolean bl2;
            if (zzjq3 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                zzjq3 = null;
            }
            String string2 = "EventInterceptor already set.";
            Preconditions.checkState(bl2, string2);
        }
        this.zzc = zzjq2;
    }

    public final void zza(zzjt object) {
        this.zzw();
        Preconditions.checkNotNull(object);
        Object object2 = this.zzd;
        boolean bl2 = object2.add(object);
        if (!bl2) {
            object = this.zzj().zzr();
            object2 = "OnEventListener already registered";
            ((zzgq)object).zza((String)object2);
        }
    }

    public final void zza(Boolean bl2) {
        this.zzw();
        zzhv zzhv2 = this.zzl();
        zzlh zzlh2 = new zzlh(this, bl2);
        zzhv2.zzb(zzlh2);
    }

    public final void zza(Runnable runnable2) {
        Object object;
        Object object2 = this.zze();
        boolean bl2 = ((zzai)object2).zza((zzfx)(object = zzbn.zzcl));
        if (!bl2) {
            return;
        }
        this.zzw();
        object2 = this.zzl();
        bl2 = ((zzhv)object2).zzm();
        if (bl2) {
            this.zzj().zzg().zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        object2 = this.zzl();
        bl2 = ((zzhv)object2).zzg();
        if (bl2) {
            this.zzj().zzg().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        bl2 = zzaf.zza();
        if (bl2) {
            this.zzj().zzg().zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        this.zzj().zzq().zza("[sgtm] Started client-side batch upload work.");
        bl2 = false;
        object2 = null;
        int n3 = 0;
        object = null;
        int n4 = 0;
        Integer n7 = null;
        block0: while (!bl2) {
            int n8;
            Iterator iterator = this.zzj().zzq();
            Object object3 = "[sgtm] Getting upload batches from service (FE)";
            ((zzgq)((Object)iterator)).zza((String)object3);
            iterator = new Iterator();
            Object object4 = this.zzl();
            zzkd zzkd2 = new zzkd(this, (AtomicReference)((Object)iterator));
            long l2 = 10000L;
            String string2 = "[sgtm] Getting upload batches";
            Object object5 = iterator;
            ((zzhv)object4).zza((AtomicReference)((Object)iterator), l2, string2, zzkd2);
            iterator = (zzor)((AtomicReference)((Object)iterator)).get();
            if (iterator == null || (n8 = (object3 = ((zzor)((Object)iterator)).zza).isEmpty()) != 0) break;
            object3 = this.zzj().zzq();
            int n10 = ((zzor)((Object)iterator)).zza.size();
            object4 = n10;
            object5 = "[sgtm] Retrieved upload batches. count";
            ((zzgq)object3).zza((String)object5, object4);
            object3 = ((zzor)((Object)iterator)).zza;
            n8 = object3.size();
            n3 += n8;
            iterator = ((zzor)((Object)iterator)).zza.iterator();
            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object3 = (zzon)iterator.next();
                n8 = (int)(this.zza((zzon)object3) ? 1 : 0);
                if (n8 != 0) {
                    ++n4;
                    continue;
                }
                bl2 = true;
                continue block0;
            }
        }
        object2 = this.zzj().zzq();
        object = n3;
        n7 = n4;
        ((zzgq)object2).zza("[sgtm] Completed client-side batch upload work. total, success", object, n7);
        runnable2.run();
    }

    public final void zza(String string2, long l2) {
        boolean bl2;
        if (string2 != null && (bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            this.zzu.zzj().zzr().zza("User ID must be non-empty or null");
            return;
        }
        zzhv zzhv2 = this.zzl();
        zzjz zzjz2 = new zzjz(this, string2);
        zzhv2.zzb(zzjz2);
        this.zza(null, "_id", string2, true, l2);
    }

    public final void zza(String string2, String string3, long l2, Bundle bundle) {
        boolean bl2;
        boolean bl3;
        this.zzv();
        Object object = this.zzc;
        if (object != null && !(bl3 = zzpn.zzf(string3))) {
            bl3 = false;
            object = null;
            bl2 = false;
        } else {
            bl3 = true;
            bl2 = true;
        }
        object = this;
        this.zza(string2, string3, l2, bundle, true, bl2, true, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object, String string2, long l2, Bundle object2, boolean bl2, boolean bl3, boolean bl4, String string3) {
        String string4;
        long l3;
        int n3;
        long l4;
        long l7;
        void var9_10;
        int n4;
        int n7;
        void var8_9;
        void var6_6;
        long l8;
        Object object3;
        Object object4;
        Object object5;
        int n8;
        Object object6;
        zzju zzju2 = this;
        Object object10 = object;
        String string5 = string2;
        long l12 = l2;
        Object object9 = object2;
        int n14 = 0;
        ArrayList<Object> arrayList = null;
        boolean bl5 = true;
        Preconditions.checkNotEmpty((String)object);
        Preconditions.checkNotNull(object2);
        this.zzv();
        this.zzw();
        Object object8 = this.zzu;
        int n10 = ((zzic)object8).zzae();
        if (n10 == 0) {
            this.zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        object8 = this.zzg().zzai();
        if (object8 != null && (n10 = object8.contains(string2)) == 0) {
            this.zzj().zzc().zza("Dropping non-safelisted event. event name, origin", string2, object);
            return;
        }
        n10 = zzju2.zze;
        Object object7 = null;
        if (n10 == 0) {
            zzju2.zze = bl5;
            object8 = zzju2.zzu;
            n10 = ((zzic)object8).zzai();
            if (n10 == 0) {
                object8 = "com.google.android.gms.tagmanager.TagManagerService";
                object6 = this.zza();
                object6 = object6.getClassLoader();
                object8 = Class.forName((String)object8, bl5, (ClassLoader)object6);
            } else {
                object8 = TagManagerService.class;
                n8 = TagManagerService.a;
            }
            object6 = "initialize";
            try {
                object5 = new Class[bl5];
                object4 = Context.class;
                object5[0] = object4;
                object8 = ((Class)object8).getDeclaredMethod((String)object6, (Class<?>)object5);
                object6 = this.zza();
                object5 = new Object[bl5];
                object5[0] = object6;
                ((Method)object8).invoke(null, (Object[])object5);
            }
            catch (Exception exception) {
                try {
                    object6 = this.zzj();
                    object6 = ((zzgo)object6).zzr();
                    object5 = "Failed to invoke Tag Manager's initialize() method";
                    ((zzgq)object6).zza((String)object5, exception);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    object8 = this.zzj().zzp();
                    object6 = "Tag Manager is not found and thus will not be used";
                    ((zzgq)object8).zza((String)object6);
                }
            }
        }
        if ((n10 = ((String)(object8 = "_cmp")).equals(string5)) != 0 && (n8 = object9.containsKey((String)(object8 = "gclid"))) != 0) {
            object3 = object9.getString(object8);
            object8 = this.zzb();
            l8 = object8.currentTimeMillis();
            object5 = "auto";
            object4 = "_lgclid";
            object6 = this;
            this.zza((String)object5, (String)object4, object3, l8);
        }
        if (var6_6 != false && (n10 = (int)(zzpn.zzh(string2) ? 1 : 0)) != 0) {
            object8 = this.zzs();
            object6 = this.zzk().zzt.zza();
            ((zzpn)object8).zza((Bundle)object9, (Bundle)object6);
        }
        n10 = 40;
        if (var8_9 == false && (n8 = (int)(((String)(object6 = "_iap")).equals(string5) ? 1 : 0)) == 0) {
            object6 = zzju2.zzu.zzv();
            object5 = "event";
            n7 = ((zzpn)object6).zzc((String)object5, string5);
            n4 = 2;
            if (n7 != 0) {
                object4 = zzjp.zza;
                String[] stringArray = zzjp.zzb;
                n7 = ((zzpn)object6).zza((String)object5, (String[])object4, stringArray, string5);
                if (n7 == 0) {
                    n4 = 13;
                } else {
                    n8 = (int)(((zzpn)object6).zza((String)object5, n10, string5) ? 1 : 0);
                    if (n8 != 0) {
                        n4 = 0;
                        object3 = null;
                    }
                }
            }
            if (n4 != 0) {
                object6 = this.zzj().zzm();
                object5 = this.zzi().zza(string5);
                object4 = "Invalid public event name. Event will not be logged (FE)";
                ((zzgq)object6).zza((String)object4, object5);
                object6 = zzju2.zzu;
                ((zzic)object6).zzv();
                object8 = zzpn.zza(string5, n10, bl5);
                if (string5 != null) {
                    n14 = string2.length();
                }
                zzju2.zzu.zzv();
                zzpn.zza(zzju2.zzv, n4, "_ev", (String)object8, n14);
                return;
            }
        }
        object6 = this.zzp().zza(false);
        object5 = "_sc";
        if (object6 != null && (n7 = object9.containsKey((String)object5)) == 0) {
            ((zzlw)object6).zzd = bl5;
        }
        if (var6_6 != false && var8_9 == false) {
            n7 = 1;
        } else {
            n7 = 0;
            object4 = null;
        }
        zzpn.zza((zzlw)object6, (Bundle)object9, n7 != 0);
        object6 = "am";
        boolean bl6 = ((String)object6).equals(object10);
        n8 = (int)(zzpn.zzf(string2) ? 1 : 0);
        if (var6_6 != false && (object4 = zzju2.zzc) != null && n8 == 0 && !bl6) {
            object8 = this.zzj().zzc();
            object6 = this.zzi().zza(string5);
            object5 = this.zzi().zza((Bundle)object9);
            ((zzgq)object8).zza("Passing event to registered event handler (FE)", object6, object5);
            Preconditions.checkNotNull(zzju2.zzc);
            object6 = zzju2.zzc;
            object5 = object;
            object4 = string2;
            object3 = object2;
            l8 = l2;
            object6.interceptEvent((String)object, string2, (Bundle)object2, l2);
            return;
        }
        object6 = zzju2.zzu;
        n8 = (int)(((zzic)object6).zzah() ? 1 : 0);
        if (n8 == 0) {
            return;
        }
        object6 = this.zzs();
        n8 = ((zzpn)object6).zza(string5);
        if (n8 != 0) {
            object5 = this.zzj().zzm();
            object4 = this.zzi().zza(string5);
            object3 = "Invalid event name. Event will not be logged (FE)";
            ((zzgq)object5).zza((String)object3, object4);
            this.zzs();
            object8 = zzpn.zza(string5, n10, bl5);
            if (string5 != null) {
                n14 = string2.length();
            }
            zzju2.zzu.zzv();
            object = object5 = zzju2.zzv;
            string2 = var9_10;
            String string6 = "_ev";
            Object object11 = object8;
            int n15 = n14;
            zzpn.zza((zzpp)object5, (String)var9_10, n8, string6, (String)object8, n14);
            return;
        }
        String string7 = "_o";
        List list = CollectionUtils.listOf(string7, "_sn", object5, "_si");
        object6 = this.zzs();
        object5 = var9_10;
        object4 = string2;
        object3 = object2;
        object8 = string7;
        object9 = ((zzpn)object6).zza((String)var9_10, string2, (Bundle)object2, list, (boolean)var8_9);
        Preconditions.checkNotNull(object9);
        object6 = this.zzp().zza(false);
        String string8 = "_ae";
        if (object6 != null && (n8 = (int)(string8.equals(string5) ? 1 : 0)) != 0) {
            object6 = this.zzr().zzb;
            object5 = ((zzod)object6).zzb.zzb();
            long l14 = object5.elapsedRealtime();
            l7 = ((zzod)object6).zza;
            l4 = l14 - l7;
            ((zzod)object6).zza = l14;
            l14 = 0L;
            long l15 = l4 - l14;
            n8 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
            if (n8 > 0) {
                object6 = this.zzs();
                ((zzpn)object6).zza((Bundle)object9, l4);
            }
        }
        object6 = "auto";
        n8 = (int)(((String)object6).equals(object10) ? 1 : 0);
        object5 = "_ffr";
        if (n8 == 0 && (n8 = (int)(((String)(object6 = "_ssr")).equals(string5) ? 1 : 0)) != 0) {
            object6 = this.zzs();
            n7 = Strings.isEmptyOrWhitespace((String)(object5 = object9.getString((String)object5)));
            if (n7 != 0) {
                n3 = 0;
                object5 = null;
            } else if (object5 != null) {
                object5 = ((String)object5).trim();
            }
            object4 = ((zzpn)object6).zzk().zzq.zza();
            n7 = Objects.equals(object5, object4);
            if (n7 != 0) {
                ((zzpn)object6).zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                return;
            }
            object6 = ((zzpn)object6).zzk().zzq;
            ((zzhh)object6).zza((String)object5);
        } else {
            n8 = (int)(string8.equals(string5) ? 1 : 0);
            if (n8 != 0 && (n7 = TextUtils.isEmpty((CharSequence)(object6 = this.zzs().zzk().zzq.zza()))) == 0) {
                object9.putString((String)object5, (String)object6);
            }
        }
        arrayList = new ArrayList<Object>();
        arrayList.add(object9);
        object6 = this.zze();
        object5 = zzbn.zzcv;
        n8 = (int)(((zzai)object6).zza((zzfx)object5) ? 1 : 0);
        if (n8 != 0) {
            object6 = this.zzr();
            n8 = (int)(((zznx)object6).zzac() ? 1 : 0);
        } else {
            object6 = this.zzk().zzn;
            n8 = (int)(((zzhd)object6).zza() ? 1 : 0);
        }
        object5 = this.zzk().zzk;
        l4 = ((zzhf)object5).zza();
        long l16 = 0L;
        n4 = (int)(l4 == l16 ? 0 : (l4 < l16 ? -1 : 1));
        if (n4 > 0 && (n3 = ((zzha)(object5 = this.zzk())).zza(l12)) != 0 && n8 != 0) {
            this.zzj().zzq().zza("Current session is expired, remove the session number, ID, and engagement time");
            long l17 = this.zzb().currentTimeMillis();
            n4 = 0;
            object3 = null;
            object6 = this;
            l3 = l16;
            string4 = string8;
            l8 = l17;
            this.zza("auto", "_sid", (Object)null, l17);
            l8 = this.zzb().currentTimeMillis();
            object6 = this;
            this.zza("auto", "_sno", (Object)null, l8);
            l8 = this.zzb().currentTimeMillis();
            object5 = "auto";
            object4 = "_se";
            object6 = this;
            this.zza((String)object5, (String)object4, (Object)null, l8);
            object6 = this.zzk().zzl;
            ((zzhf)object6).zza(l16);
        } else {
            string4 = string8;
            l3 = l16;
        }
        object6 = "extend_session";
        long l18 = object9.getLong((String)object6, l3);
        l7 = 1L;
        long l19 = l18 == l7 ? 0 : (l18 < l7 ? -1 : 1);
        if (l19 == false) {
            object6 = this.zzj().zzq();
            object5 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session";
            ((zzgq)object6).zza((String)object5);
            object6 = zzju2.zzu.zzu().zza;
            n3 = 1;
            ((zzof)object6).zza(l12, n3 != 0);
        } else {
            n3 = 1;
        }
        object4 = object9.keySet();
        object6 = new ArrayList(object4);
        Collections.sort(object6);
        n7 = ((ArrayList)object6).size();
        n4 = 0;
        object3 = null;
        while (n4 < n7) {
            Object e2 = ((ArrayList)object6).get(n4);
            n4 += n3;
            String string9 = (String)e2;
            if (string9 != null) {
                this.zzs();
                object5 = zzpn.zzb(object9.get(string9));
                if (object5 != null) {
                    object9.putParcelableArray(string9, (Parcelable[])object5);
                }
            }
            n3 = 1;
        }
        object9 = null;
        for (int i3 = 0; i3 < (n8 = arrayList.size()); i3 += n8) {
            zzbl zzbl2;
            Object object12;
            void var7_8;
            object6 = (Bundle)arrayList.get(i3);
            object5 = i3 != 0 ? "_ep" : string5;
            object6.putString((String)object8, (String)object10);
            if (var7_8 != false) {
                object4 = this.zzs();
                bl5 = false;
                object12 = null;
                object6 = ((zzpn)object4).zza((Bundle)object6, (String)null);
            } else {
                bl5 = false;
                object12 = null;
            }
            object7 = object6;
            object4 = new zzbg((Bundle)object6);
            object6 = zzbl2;
            object3 = object;
            object12 = zzbl2;
            l8 = l2;
            zzbl2 = new zzbl((String)object5, (zzbg)object4, (String)object, l2);
            object6 = this.zzq();
            void var31_39 = var9_10;
            ((zzme)object6).zza((zzbl)object12, (String)var9_10);
            if (!bl6) {
                object6 = zzju2.zzd;
                object12 = object6.iterator();
                while ((n8 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
                    object6 = (zzjt)object12.next();
                    object3 = new Bundle((Bundle)object7);
                    object5 = object;
                    object4 = string2;
                    l8 = l2;
                    object6.onEvent((String)object, string2, (Bundle)object3, l2);
                    void var31_41 = var9_10;
                }
            }
            n8 = 1;
        }
        n8 = 1;
        object8 = this.zzp();
        n3 = 0;
        object5 = null;
        if ((object8 = ((zzlz)object8).zza(false)) == null) return;
        object8 = string4;
        n10 = (int)(string4.equals(string5) ? 1 : 0);
        if (n10 != 0) {
            object8 = this.zzr();
            object5 = this.zzb();
            l4 = object5.elapsedRealtime();
            ((zznx)object8).zza(n8 != 0, n8 != 0, l4);
        }
    }

    public final void zza(String object, String object2, Bundle bundle) {
        Clock clock = this.zzb();
        long l2 = clock.currentTimeMillis();
        Preconditions.checkNotEmpty((String)object);
        Bundle bundle2 = new Bundle();
        String string2 = "name";
        bundle2.putString(string2, (String)object);
        object = "creation_timestamp";
        bundle2.putLong((String)object, l2);
        if (object2 != null) {
            bundle2.putString("expired_event_name", (String)object2);
            object = "expired_event_params";
            bundle2.putBundle((String)object, bundle);
        }
        object = this.zzl();
        object2 = new zzkz(this, bundle2);
        ((zzhv)object).zzb((Runnable)object2);
    }

    public final void zza(String string2, String string3, Bundle bundle, long l2) {
        this.zza(string2, string3, bundle, true, false, l2);
    }

    public final void zza(String string2, String string3, Bundle bundle, String string4) {
        this.zzu();
        long l2 = this.zzb().currentTimeMillis();
        this.zzb(string2, string3, l2, bundle, false, true, true, string4);
    }

    public final void zza(String string2, String string3, Bundle bundle, boolean bl2, boolean bl3, long l2) {
        boolean bl4;
        boolean bl5;
        Object object;
        Object object2;
        String string4;
        Object object3;
        if (string2 == null) {
            object3 = "app";
            string4 = object3;
        } else {
            string4 = string2;
        }
        if (bundle == null) {
            object3 = new Bundle();
            object2 = object3;
        } else {
            object2 = bundle;
        }
        object3 = "screen_view";
        boolean bl6 = Objects.equals(string3, object3);
        if (bl6) {
            this.zzp().zza((Bundle)object2, l2);
            return;
        }
        object3 = this;
        if (bl3 && (object = this.zzc) != null && !(bl5 = zzpn.zzf(string3))) {
            bl5 = false;
            object = null;
            bl4 = false;
        } else {
            bl5 = true;
            bl4 = true;
        }
        object = this;
        this.zzb(string4, string3, l2, (Bundle)object2, bl3, bl4, bl2, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(String string2, String object, Object object2, long l2) {
        boolean bl2;
        block6: {
            String string3;
            Object object3;
            block9: {
                block8: {
                    block7: {
                        Preconditions.checkNotEmpty(string2);
                        Preconditions.checkNotEmpty((String)object);
                        this.zzv();
                        this.zzw();
                        object3 = "allow_personalized_ads";
                        boolean bl3 = ((String)object3).equals(object);
                        if (!bl3) break block6;
                        bl3 = object2 instanceof String;
                        string3 = "_npa";
                        if (!bl3) break block7;
                        object3 = object2;
                        object3 = (String)object2;
                        boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
                        if (bl4) break block7;
                        object = Locale.ENGLISH;
                        object = ((String)object3).toLowerCase((Locale)object);
                        object2 = "false";
                        bl2 = ((String)object2).equals(object);
                        long l3 = 1L;
                        long l4 = bl2 ? l3 : 0L;
                        object = l4;
                        object3 = this.zzk().zzh;
                        l4 = (Long)object;
                        long l7 = l4 - l3;
                        Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object4 == false) {
                            object2 = "true";
                        }
                        ((zzhh)object3).zza((String)object2);
                        object2 = object;
                        break block8;
                    }
                    if (object2 != null) break block9;
                    object = this.zzk().zzh;
                    object3 = "unset";
                    ((zzhh)object).zza((String)object3);
                }
                object = string3;
            }
            object3 = this.zzj().zzq();
            string3 = "Setting user property(FE)";
            String string4 = "non_personalized_ads(_npa)";
            ((zzgq)object3).zza(string3, string4, object2);
        }
        Object object5 = object;
        object = this.zzu;
        bl2 = ((zzic)object).zzae();
        if (!bl2) {
            this.zzj().zzq().zza("User property not set since app measurement is disabled");
            return;
        }
        object = this.zzu;
        bl2 = ((zzic)object).zzah();
        if (!bl2) {
            return;
        }
        object = new zzpm((String)object5, l2, object2, string2);
        this.zzq().zza((zzpm)object);
    }

    public final void zza(String string2, String string3, Object object, boolean bl2) {
        long l2 = this.zzb().currentTimeMillis();
        this.zza(string2, string3, object, bl2, l2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(String var1_1, String var2_2, Object var3_3, boolean var4_4, long var5_5) {
        if (var1_1 == null) {
            var1_1 = "app";
        }
        var7_6 = var1_1;
        var8_7 = 0;
        var1_1 = null;
        var9_8 = 24;
        if (var4_4) {
            var10_9 = this.zzs();
            var4_4 = var10_9.zzb(var2_2);
        } else {
            var10_9 = this.zzs();
            var12_11 = var10_9.zzc(var11_10 = "user property", var2_2);
            if (!var12_11) {
                while (true) {
                    var4_4 = 6;
                    break;
                }
            } else {
                var13_12 = zzjr.zza;
                var12_11 = var10_9.zza(var11_10, var13_12, var2_2);
                if (!var12_11) {
                    var4_4 = 15;
                } else {
                    if (!(var4_4 = var10_9.zza(var11_10, var9_8, var2_2))) ** continue;
                    var4_4 = false;
                    var10_9 = null;
                }
            }
        }
        var11_10 = "_ev";
        var12_11 = true;
        if (var4_4) {
            this.zzs();
            var3_3 = zzpn.zza(var2_2, var9_8, var12_11);
            if (var2_2 != null) {
                var8_7 = var2_2.length();
            }
            this.zzu.zzv();
            zzpn.zza(this.zzv, (int)var4_4, var11_10, (String)var3_3, var8_7);
            return;
        }
        if (var3_3 != null) {
            var10_9 = this.zzs();
            var4_4 = var10_9.zza(var2_2, var3_3);
            if (var4_4) {
                this.zzs();
                var2_2 = zzpn.zza(var2_2, var9_8, var12_11);
                var14_13 = var3_3 instanceof String;
                if (var14_13 || (var14_13 = var3_3 instanceof CharSequence)) {
                    var1_1 = String.valueOf(var3_3);
                    var8_7 = var1_1.length();
                }
                this.zzu.zzv();
                zzpn.zza(this.zzv, (int)var4_4, var11_10, var2_2, var8_7);
                return;
            }
            var1_1 = this.zzs();
            var15_14 = var1_1.zzc(var2_2, var3_3);
            if (var15_14 != null) {
                var11_10 = var2_2;
                this.zza(var7_6, var2_2, var5_5, var15_14);
            }
            return;
        }
        var11_10 = var2_2;
        this.zza(var7_6, var2_2, var5_5, (Object)null);
    }

    public final boolean zzab() {
        return false;
    }

    public final zzap zzac() {
        this.zzv();
        return this.zzq().zzac();
    }

    public final zzll zzad() {
        return this.zzb;
    }

    public final Boolean zzae() {
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzl();
        zzkg zzkg2 = new zzkg(this, atomicReference);
        return (Boolean)zzhv2.zza(atomicReference, 15000L, "boolean test flag value", zzkg2);
    }

    public final Double zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzl();
        zzle zzle2 = new zzle(this, atomicReference);
        return (Double)zzhv2.zza(atomicReference, 15000L, "double test flag value", zzle2);
    }

    public final Integer zzag() {
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzl();
        zzlf zzlf2 = new zzlf(this, atomicReference);
        return (Integer)zzhv2.zza(atomicReference, 15000L, "int test flag value", zzlf2);
    }

    public final Long zzah() {
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzl();
        zzlc zzlc2 = new zzlc(this, atomicReference);
        return (Long)zzhv2.zza(atomicReference, 15000L, "long test flag value", zzlc2);
    }

    public final String zzai() {
        return (String)this.zzf.get();
    }

    public final String zzaj() {
        zzlw zzlw2 = this.zzu.zzs().zzac();
        if (zzlw2 != null) {
            return zzlw2.zzb;
        }
        return null;
    }

    public final String zzak() {
        zzlw zzlw2 = this.zzu.zzs().zzac();
        if (zzlw2 != null) {
            return zzlw2.zza;
        }
        return null;
    }

    public final String zzal() {
        String string2 = this.zzu.zzw();
        if (string2 != null) {
            return this.zzu.zzw();
        }
        try {
            string2 = this.zza();
        }
        catch (IllegalStateException illegalStateException) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", illegalStateException);
            return null;
        }
        Object object = this.zzu;
        object = ((zzic)object).zzz();
        String string3 = "google_app_id";
        zzhw zzhw2 = new zzhw((Context)string2, (String)object);
        return zzhw2.zza(string3);
    }

    public final String zzam() {
        AtomicReference atomicReference = new AtomicReference();
        zzhv zzhv2 = this.zzl();
        zzks zzks2 = new zzks(this, atomicReference);
        return (String)zzhv2.zza(atomicReference, 15000L, "String test flag value", zzks2);
    }

    public final PriorityQueue zzan() {
        Object object = this.zzl;
        if (object == null) {
            object = new zzjx();
            zzjw zzjw2 = new zzjw();
            this.zzl = object = uk3_2.a(ro_0.b((zzjx)object, zzjw2));
        }
        return this.zzl;
    }

    public final void zzao() {
        int n3;
        int n4;
        this.zzv();
        this.zzw();
        zzjf zzjf2 = this.zzq();
        ((zzme)zzjf2).zzv();
        ((zzf)zzjf2).zzw();
        boolean n42 = ((zzme)zzjf2).zzap();
        if (!n42 || (n4 = ((zzpn)(zzjf2 = ((zzme)zzjf2).zzs())).zzg()) >= (n3 = 242600)) {
            zzjf2 = this.zzq();
            ((zzme)zzjf2).zzae();
        }
    }

    public final void zzap() {
        this.zzv();
        this.zzw();
        Object object = this.zzu;
        boolean bl2 = ((zzic)object).zzah();
        if (!bl2) {
            return;
        }
        object = this.zze();
        Object object2 = "google_analytics_deferred_deep_link_enabled";
        if ((object = ((zzai)object).zze((String)object2)) != null && (bl2 = ((Boolean)object).booleanValue())) {
            this.zzj().zzc().zza("Deferred Deep Link feature enabled.");
            object = this.zzl();
            object2 = new zzke(this);
            ((zzhv)object).zzb((Runnable)object2);
        }
        this.zzq().zzaf();
        bl2 = false;
        this.zzq = false;
        object = this.zzk().zzx();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            this.zzf().zzad();
            object2 = Build.VERSION.RELEASE;
            bl3 = ((String)object).equals(object2);
            if (!bl3) {
                object2 = new Bundle();
                object2.putString("_po", (String)object);
                object = "auto";
                String string2 = "_ou";
                this.zzc((String)object, string2, (Bundle)object2);
            }
        }
    }

    public final void zzaq() {
        this.zzv();
        zzbb zzbb2 = this.zzk;
        if (zzbb2 != null) {
            zzbb2.zza();
        }
    }

    public final void zzar() {
        Object object = this.zza().getApplicationContext();
        boolean bl2 = object instanceof Application;
        if (bl2 && (object = this.zzb) != null) {
            object = (Application)this.zza().getApplicationContext();
            zzlk zzlk2 = this.zzb;
            object.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)zzlk2);
        }
    }

    public final void zzas() {
        Object object;
        Object object2;
        boolean bl2 = zzoy.zza();
        if (bl2 && (bl2 = ((zzai)(object2 = this.zze())).zza((zzfx)(object = zzbn.zzcq)))) {
            object2 = this.zzl();
            bl2 = ((zzhv)object2).zzm();
            if (bl2) {
                this.zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            bl2 = zzaf.zza();
            if (bl2) {
                this.zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            this.zzw();
            object2 = this.zzj().zzq();
            object = "Getting trigger URIs (FE)";
            ((zzgq)object2).zza((String)object);
            object2 = new AtomicReference();
            Object object3 = this.zzl();
            zzjy zzjy2 = new zzjy(this, (AtomicReference)object2);
            long l2 = 10000L;
            String string2 = "get trigger URIs";
            ((zzhv)object3).zza((AtomicReference)object2, l2, string2, zzjy2);
            object2 = (List)((AtomicReference)object2).get();
            if (object2 == null) {
                this.zzj().zzg().zza("Timed out waiting for get trigger URIs");
                return;
            }
            object = this.zzl();
            object3 = new zzkb(this, (List)object2);
            ((zzhv)object).zzb((Runnable)object3);
        }
    }

    public final void zzat() {
        this.zzv();
        Object object = this.zzk().zzo;
        boolean bl2 = ((zzhd)object).zza();
        if (bl2) {
            this.zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        object = this.zzk().zzp;
        long l2 = ((zzhf)object).zza();
        zzhf zzhf2 = this.zzk().zzp;
        long l3 = 1L + l2;
        zzhf2.zza(l3);
        long l4 = 5;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 >= 0) {
            this.zzj().zzr().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            this.zzk().zzo.zza(true);
            return;
        }
        object = this.zzr;
        if (object == null) {
            zzic zzic2 = this.zzu;
            this.zzr = object = new zzku(this, zzic2);
        }
        this.zzr.zza(0L);
    }

    public final void zzau() {
        this.zzv();
        this.zzj().zzc().zza("Handle tcf update.");
        Object object = zzoe.zza(this.zzk().zzc());
        Object object2 = this.zzj().zzq();
        Object object3 = "Tcf preferences read";
        ((zzgq)object2).zza((String)object3, object);
        object2 = this.zzk();
        boolean bl2 = ((zzha)object2).zza((zzoe)object);
        if (bl2) {
            object2 = ((zzoe)object).zza();
            object3 = this.zzj().zzq();
            String string2 = "Consent generated from Tcf";
            ((zzgq)object3).zza(string2, object2);
            object3 = Bundle.EMPTY;
            if (object2 != object3) {
                object3 = this.zzb();
                long l2 = object3.currentTimeMillis();
                int n3 = -30;
                this.zza((Bundle)object2, n3, l2);
            }
            object2 = new Bundle();
            object = ((zzoe)object).zzb();
            object2.putString("_tcfd", (String)object);
            object = "auto";
            object3 = "_tcf";
            this.zzc((String)object, (String)object3, (Bundle)object2);
        }
    }

    public final void zzav() {
        this.zzv();
        zzkl zzkl2 = null;
        this.zzm = false;
        Object object = this.zzan();
        boolean bl2 = ((AbstractCollection)object).isEmpty();
        if (!bl2 && !(bl2 = this.zzh)) {
            boolean bl3;
            object = (zzog)this.zzan().poll();
            if (object == null) {
                return;
            }
            Object object2 = this.zzs().zzp();
            if (object2 == null) {
                return;
            }
            this.zzh = bl3 = true;
            Object object3 = this.zzj().zzq();
            String string2 = "Registering trigger URI";
            String string3 = ((zzog)object).zza;
            ((zzgq)object3).zza(string2, string3);
            object3 = Uri.parse((String)((zzog)object).zza);
            object2 = ((ml1_0)object2).d((Uri)object3);
            if (object2 == null) {
                this.zzh = false;
                this.zzan().add(object);
                return;
            }
            zzkl2 = new zzkl(this);
            object3 = new zzkk(this, (zzog)object);
            Futures.addCallback((ListenableFuture)object2, (FutureCallback)object3, zzkl2);
        }
    }

    public final void zzaw() {
        this.zzv();
        Object object = this.zzj().zzc();
        Object object2 = "Register tcfPrefChangeListener.";
        ((zzgq)object).zza((String)object2);
        object = this.zzs;
        if (object == null) {
            object2 = this.zzu;
            this.zzt = object = new zzkr(this, (zzjh)object2);
            object = new zzkh(this);
            this.zzs = object;
        }
        object = this.zzk().zzc();
        object2 = this.zzs;
        object.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)object2);
    }

    public final boolean zzax() {
        return this.zzm;
    }

    public final void zzb(long l2) {
        this.zzv();
        this.zzw();
        this.zzj().zzc().zza("Resetting analytics data (FE)");
        zzjh zzjh2 = this.zzr();
        ((zznx)zzjh2).zzv();
        ((zznx)zzjh2).zzb.zza();
        this.zzg().zzaj();
        zzjh2 = this.zzu;
        boolean bl2 = ((zzic)zzjh2).zzae();
        zzha zzha2 = this.zzk();
        zzhf zzhf2 = zzha2.zzc;
        zzhf2.zza(l2);
        Object object = zzha2.zzk().zzq.zza();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            object = zzha2.zzq;
            ((zzhh)object).zza(null);
        }
        object = zzha2.zzk;
        long l3 = 0L;
        ((zzhf)object).zza(l3);
        zzha2.zzl.zza(l3);
        object = zzha2.zze();
        bl3 = ((zzai)object).zzy();
        if (!bl3) {
            bl3 = bl2 ^ true;
            zzha2.zzb(bl3);
        }
        zzha2.zzr.zza(null);
        zzha2.zzs.zza(l3);
        zzha2.zzt.zza(null);
        this.zzq().zzai();
        this.zzr().zza.zza();
        this.zzq = bl3 = bl2 ^ true;
    }

    public final void zzb(Bundle bundle) {
        Object object;
        if (bundle == null) {
            bundle = new Bundle();
        } else {
            object = new Bundle(bundle);
            bundle = object;
        }
        object = this.zzl();
        zzka zzka2 = new zzka(this, bundle);
        ((zzhv)object).zzb(zzka2);
    }

    public final void zzb(Bundle bundle, long l2) {
        zzhv zzhv2 = this.zzl();
        zzkf zzkf2 = new zzkf(this, bundle, l2);
        zzhv2.zzc(zzkf2);
    }

    public final void zzb(zzjt object) {
        this.zzw();
        Preconditions.checkNotNull(object);
        Object object2 = this.zzd;
        boolean bl2 = object2.remove(object);
        if (!bl2) {
            object = this.zzj().zzr();
            object2 = "OnEventListener had not been registered";
            ((zzgq)object).zza((String)object2);
        }
    }

    public final void zzb(String string2) {
        this.zzf.set(string2);
    }

    public final void zzb(String string2, String string3, Bundle bundle) {
        long l2 = this.zzb().currentTimeMillis();
        this.zza(string2, string3, bundle, true, true, l2);
    }

    public final void zzb(boolean bl2) {
        Object object = this.zza().getApplicationContext();
        boolean bl3 = object instanceof Application;
        if (bl3) {
            object = (Application)this.zza().getApplicationContext();
            zzlk zzlk2 = this.zzb;
            if (zzlk2 == null) {
                this.zzb = zzlk2 = new zzlk(this);
            }
            if (bl2) {
                Object object2 = this.zzb;
                object.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
                object2 = this.zzb;
                object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
                object2 = this.zzj().zzq();
                object = "Registered activity lifecycle callback";
                ((zzgq)object2).zza((String)object);
            }
        }
    }

    public final void zzc(long l2) {
        this.zzv();
        zzbb zzbb2 = this.zzk;
        if (zzbb2 == null) {
            zzic zzic2 = this.zzu;
            this.zzk = zzbb2 = new zzkj(this, zzic2);
        }
        this.zzk.zza(l2);
    }

    public final void zzc(Bundle bundle, long l2) {
        this.zza(bundle, -20, l2);
    }

    public final void zzc(String string2, String string3, Bundle bundle) {
        this.zzv();
        long l2 = this.zzb().currentTimeMillis();
        this.zza(string2, string3, l2, bundle);
    }

    public final void zzc(boolean bl2) {
        this.zzw();
        zzhv zzhv2 = this.zzl();
        zzkm zzkm2 = new zzkm(this, bl2);
        zzhv2.zzb(zzkm2);
    }

    public final void zzd(long l2) {
        zzhv zzhv2 = this.zzl();
        zzko zzko2 = new zzko(this, l2);
        zzhv2.zzb(zzko2);
    }
}

