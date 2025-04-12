/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferClient;
import com.google.android.gms.auth.api.accounttransfer.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.auth.zzao;

public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    public static final Api zza;
    public static final zzao zzb;
    public static final zzao zzc;
    private static final Api$ClientKey zzd;
    private static final Api$AbstractClientBuilder zze;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zzd = object;
        zza zza2 = new zza();
        zze = zza2;
        zza = api = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zza2, (Api$ClientKey)object);
        zzb = object = new zzao();
        zzc = object = new zzao();
    }

    private AccountTransfer() {
    }

    public static AccountTransferClient getAccountTransferClient(Activity activity) {
        AccountTransferClient accountTransferClient = new AccountTransferClient(activity, null);
        return accountTransferClient;
    }

    public static AccountTransferClient getAccountTransferClient(Context context) {
        AccountTransferClient accountTransferClient = new AccountTransferClient(context, null);
        return accountTransferClient;
    }
}

