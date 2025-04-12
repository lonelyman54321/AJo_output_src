/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.AccountPicker$AccountChooserOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

public final class AccountPicker {
    private AccountPicker() {
    }

    public static Intent newChooseAccountIntent(Account account, ArrayList arrayList, String[] stringArray, boolean bl2, String string2, String string3, String[] stringArray2, Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", (Serializable)arrayList);
        intent.putExtra("allowableAccountTypes", stringArray);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", (Parcelable)account);
        intent.putExtra("alwaysPromptForAccount", bl2);
        intent.putExtra("descriptionTextOverride", string2);
        intent.putExtra("authTokenType", string3);
        intent.putExtra("addAccountRequiredFeatures", stringArray2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", null);
        return intent;
    }

    public static Intent newChooseAccountIntent(AccountPicker$AccountChooserOptions object) {
        Object object2;
        Intent intent = new Intent();
        AccountPicker$AccountChooserOptions.zzD((AccountPicker$AccountChooserOptions)object);
        AccountPicker$AccountChooserOptions.zze((AccountPicker$AccountChooserOptions)object);
        boolean bl2 = true;
        Preconditions.checkArgument(bl2, "We only support hostedDomain filter for account chip styled account picker");
        AccountPicker$AccountChooserOptions.zzd((AccountPicker$AccountChooserOptions)object);
        Preconditions.checkArgument(bl2, "Consent is only valid for account chip styled account picker");
        AccountPicker$AccountChooserOptions.zzB((AccountPicker$AccountChooserOptions)object);
        Preconditions.checkArgument(bl2, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        AccountPicker$AccountChooserOptions.zzD((AccountPicker$AccountChooserOptions)object);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        ArrayList arrayList = AccountPicker$AccountChooserOptions.zzi((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("allowableAccounts", (Serializable)arrayList);
        Object object3 = AccountPicker$AccountChooserOptions.zzh((AccountPicker$AccountChooserOptions)object);
        bl2 = false;
        arrayList = null;
        if (object3 != null) {
            object3 = AccountPicker$AccountChooserOptions.zzh((AccountPicker$AccountChooserOptions)object);
            object2 = new String[]{};
            object3 = object3.toArray((T[])object2);
            object2 = "allowableAccountTypes";
            intent.putExtra((String)object2, (String[])object3);
        }
        object3 = AccountPicker$AccountChooserOptions.zzc((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("addAccountOptions", (Bundle)object3);
        object3 = AccountPicker$AccountChooserOptions.zzb((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("selectedAccount", (Parcelable)object3);
        AccountPicker$AccountChooserOptions.zzB((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("selectedAccountIsNotClickable", false);
        boolean bl3 = AccountPicker$AccountChooserOptions.zzy((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("alwaysPromptForAccount", bl3);
        object3 = AccountPicker$AccountChooserOptions.zzg((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("descriptionTextOverride", (String)object3);
        AccountPicker$AccountChooserOptions.zzC((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("setGmsCoreAccount", false);
        AccountPicker$AccountChooserOptions.zzf((AccountPicker$AccountChooserOptions)object);
        object2 = null;
        intent.putExtra("realClientPackage", null);
        AccountPicker$AccountChooserOptions.zza((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("overrideTheme", 0);
        AccountPicker$AccountChooserOptions.zzD((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("overrideCustomTheme", 0);
        AccountPicker$AccountChooserOptions.zze((AccountPicker$AccountChooserOptions)object);
        intent.putExtra("hostedDomainFilter", null);
        object3 = new Bundle();
        AccountPicker$AccountChooserOptions.zzD((AccountPicker$AccountChooserOptions)object);
        AccountPicker$AccountChooserOptions.zzd((AccountPicker$AccountChooserOptions)object);
        AccountPicker$AccountChooserOptions.zzz((AccountPicker$AccountChooserOptions)object);
        AccountPicker$AccountChooserOptions.zzA((AccountPicker$AccountChooserOptions)object);
        boolean bl4 = object3.isEmpty();
        if (!bl4) {
            object = "first_party_options_bundle";
            intent.putExtra((String)object, (Bundle)object3);
        }
        return intent;
    }
}

