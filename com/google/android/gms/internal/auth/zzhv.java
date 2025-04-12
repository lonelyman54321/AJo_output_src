/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 */
package com.google.android.gms.internal.auth;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.auth.zzcr;
import com.google.android.gms.internal.auth.zzcz;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzhr;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhu;

public final class zzhv
implements zzht {
    public static final zzdc zza;
    public static final zzdc zzb;
    public static final zzdc zzc;
    public static final zzdc zzd;
    public static final zzdc zze;
    public static final zzdc zzf;
    public static final zzdc zzg;
    public static final zzdc zzh;
    public static final zzdc zzi;
    public static final zzdc zzj;
    public static final zzdc zzk;
    public static final zzdc zzl;
    public static final zzdc zzm;
    public static final zzdc zzn;

    static {
        Object object = zzcr.zza("com.google.android.gms.auth_account");
        zzcz zzcz2 = new zzcz((Uri)object);
        zzcz2 = zzcz2.zzb().zza();
        double d2 = 0.0;
        zza = zzcz2.zzc("getTokenRefactor__account_data_service_sample_percentage", d2);
        boolean bl2 = true;
        zzb = zzcz2.zze("getTokenRefactor__account_data_service_tokenAPI_usable", bl2);
        long l2 = 20;
        zzc = zzcz2.zzd("getTokenRefactor__account_manager_timeout_seconds", l2);
        long l3 = 0L;
        zzd = zzcz2.zzd("getTokenRefactor__android_id_shift", l3);
        zze = zzcz2.zze("getTokenRefactor__authenticator_logic_improved", false);
        object = "getTokenRefactor__blocked_packages";
        Object object2 = "ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n";
        int n3 = 3;
        try {
            object2 = Base64.decode((String)object2, (int)n3);
        }
        catch (Exception exception) {
            object = new AssertionError((Object)exception);
            throw object;
        }
        object2 = zzhr.zzk((byte[])object2);
        zzhu zzhu2 = zzhu.zza;
        object = zzcz2.zzf((String)object, object2, zzhu2);
        zzf = object;
        zzg = zzcz2.zze("getTokenRefactor__chimera_get_token_evolved", bl2);
        zzh = zzcz2.zzd("getTokenRefactor__clear_token_timeout_seconds", l2);
        zzi = zzcz2.zzd("getTokenRefactor__default_task_timeout_seconds", l2);
        zzj = zzcz2.zze("getTokenRefactor__gaul_accounts_api_evolved", false);
        zzk = zzcz2.zze("getTokenRefactor__gaul_token_api_evolved", false);
        zzl = zzcz2.zzd("getTokenRefactor__get_token_timeout_seconds", 120);
        zzm = zzcz2.zze("getTokenRefactor__gms_account_authenticator_evolved", bl2);
        zzn = zzcz2.zzc("getTokenRefactor__gms_account_authenticator_sample_percentage", d2);
    }

    public final zzhr zza() {
        return (zzhr)zzf.zzb();
    }

    public final boolean zzb() {
        return (Boolean)zzj.zzb();
    }

    public final boolean zzc() {
        return (Boolean)zzk.zzb();
    }
}

