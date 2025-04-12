/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Binder
 *  android.os.RemoteException
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;

public class AccountAccessor
extends IAccountAccessor$Stub {
    /*
     * Unable to fully structure code
     */
    public static Account getAccountBinderSafe(IAccountAccessor var0) {
        var1_2 = null;
        if (var0 != null) {
            var2_3 = Binder.clearCallingIdentity();
            try {
                var1_2 = var0.zzb();
            }
            catch (Throwable var0_1) {
                Binder.restoreCallingIdentity((long)var2_3);
                throw var0_1;
            }
lbl6:
            // 2 sources

            while (true) {
                Binder.restoreCallingIdentity((long)var2_3);
                break;
            }
        }
        return var1_2;
        catch (RemoteException v0) {
            ** continue;
        }
    }

    public final boolean equals(Object object) {
        throw null;
    }

    public final Account zzb() {
        throw null;
    }
}

