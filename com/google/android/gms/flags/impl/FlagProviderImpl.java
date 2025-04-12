/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.impl.zzb;
import com.google.android.gms.flags.impl.zzd;
import com.google.android.gms.flags.impl.zzf;
import com.google.android.gms.flags.impl.zzh;
import com.google.android.gms.flags.impl.zzj;

public class FlagProviderImpl
extends com.google.android.gms.flags.zzd {
    private boolean zzu = false;
    private SharedPreferences zzv;

    public boolean getBooleanFlagValue(String string2, boolean bl2, int n3) {
        n3 = (int)(this.zzu ? 1 : 0);
        if (n3 == 0) {
            return bl2;
        }
        SharedPreferences sharedPreferences2 = this.zzv;
        Boolean bl3 = bl2;
        return zzb.zza(sharedPreferences2, string2, bl3);
    }

    public int getIntFlagValue(String string2, int n3, int n4) {
        n4 = (int)(this.zzu ? 1 : 0);
        if (n4 == 0) {
            return n3;
        }
        SharedPreferences sharedPreferences2 = this.zzv;
        Integer n7 = n3;
        return zzd.zza(sharedPreferences2, string2, n7);
    }

    public long getLongFlagValue(String string2, long l2, int n3) {
        n3 = (int)(this.zzu ? 1 : 0);
        if (n3 == 0) {
            return l2;
        }
        SharedPreferences sharedPreferences2 = this.zzv;
        Long l3 = l2;
        return zzf.zza(sharedPreferences2, string2, l3);
    }

    public String getStringFlagValue(String string2, String string3, int n3) {
        n3 = (int)(this.zzu ? 1 : 0);
        if (n3 == 0) {
            return string3;
        }
        return zzh.zza(this.zzv, string2, string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void init(IObjectWrapper object) {
        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
        int n3 = this.zzu;
        if (n3 != 0) {
            return;
        }
        String string2 = "com.google.android.gms";
        object = object.createPackageContext(string2, 0);
        object = zzj.zza((Context)object);
        this.zzv = object;
        boolean bl2 = true;
        try {
            this.zzu = bl2;
            return;
        }
        catch (Exception exception) {
            object = String.valueOf(exception.getMessage());
            n3 = ((String)object).length();
            if (n3 != 0) {
                string2 = "Could not retrieve sdk flags, continuing with defaults: ";
                string2.concat((String)object);
            }
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
    }
}

