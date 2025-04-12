/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 */
package com.google.android.gms.common;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.AccountPicker$AccountChooserOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public class AccountPicker$AccountChooserOptions$Builder {
    private Account zza;
    private ArrayList zzb;
    private ArrayList zzc;
    private boolean zzd = false;
    private String zze;
    private Bundle zzf;

    public AccountPicker$AccountChooserOptions build() {
        boolean bl2 = true;
        Preconditions.checkArgument(bl2, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(bl2, "Consent is only valid for account chip styled account picker");
        AccountPicker$AccountChooserOptions accountPicker$AccountChooserOptions = new AccountPicker$AccountChooserOptions();
        Object object = this.zzc;
        AccountPicker$AccountChooserOptions.zzj(accountPicker$AccountChooserOptions, (ArrayList)object);
        object = this.zzb;
        AccountPicker$AccountChooserOptions.zzk(accountPicker$AccountChooserOptions, (ArrayList)object);
        bl2 = this.zzd;
        AccountPicker$AccountChooserOptions.zzl(accountPicker$AccountChooserOptions, bl2);
        AccountPicker$AccountChooserOptions.zzm(accountPicker$AccountChooserOptions, null);
        AccountPicker$AccountChooserOptions.zzp(accountPicker$AccountChooserOptions, null);
        Bundle bundle = this.zzf;
        AccountPicker$AccountChooserOptions.zzq(accountPicker$AccountChooserOptions, bundle);
        bundle = this.zza;
        AccountPicker$AccountChooserOptions.zzs(accountPicker$AccountChooserOptions, (Account)bundle);
        AccountPicker$AccountChooserOptions.zzt(accountPicker$AccountChooserOptions, false);
        AccountPicker$AccountChooserOptions.zzu(accountPicker$AccountChooserOptions, false);
        AccountPicker$AccountChooserOptions.zzr(accountPicker$AccountChooserOptions, null);
        AccountPicker$AccountChooserOptions.zzv(accountPicker$AccountChooserOptions, 0);
        object = this.zze;
        AccountPicker$AccountChooserOptions.zzw(accountPicker$AccountChooserOptions, (String)object);
        AccountPicker$AccountChooserOptions.zzx(accountPicker$AccountChooserOptions, false);
        AccountPicker$AccountChooserOptions.zzn(accountPicker$AccountChooserOptions, false);
        AccountPicker$AccountChooserOptions.zzo(accountPicker$AccountChooserOptions, false);
        return accountPicker$AccountChooserOptions;
    }

    public AccountPicker$AccountChooserOptions$Builder setAllowableAccounts(List arrayList) {
        ArrayList arrayList2;
        arrayList = arrayList == null ? null : (arrayList2 = new ArrayList(arrayList));
        this.zzb = arrayList;
        return this;
    }

    public AccountPicker$AccountChooserOptions$Builder setAllowableAccountsTypes(List arrayList) {
        ArrayList arrayList2;
        arrayList = arrayList == null ? null : (arrayList2 = new ArrayList(arrayList));
        this.zzc = arrayList;
        return this;
    }

    public AccountPicker$AccountChooserOptions$Builder setAlwaysShowAccountPicker(boolean bl2) {
        this.zzd = bl2;
        return this;
    }

    public AccountPicker$AccountChooserOptions$Builder setOptionsForAddingAccount(Bundle bundle) {
        this.zzf = bundle;
        return this;
    }

    public AccountPicker$AccountChooserOptions$Builder setSelectedAccount(Account account) {
        this.zza = account;
        return this;
    }

    public AccountPicker$AccountChooserOptions$Builder setTitleOverrideText(String string2) {
        this.zze = string2;
        return this;
    }
}

