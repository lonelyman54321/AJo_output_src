/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

public final class GmsLogger {
    private final String zza;
    private final String zzb;

    public GmsLogger(String string2) {
        this(string2, null);
    }

    public GmsLogger(String string2, String string3) {
        String string4 = "log tag cannot be null";
        Preconditions.checkNotNull(string2, string4);
        int n3 = string2.length();
        int n4 = 23;
        Integer n7 = n4;
        int n8 = 2;
        Object[] objectArray = new Object[n8];
        boolean bl2 = false;
        objectArray[0] = string2;
        int n10 = 1;
        objectArray[n10] = n7;
        if (n3 <= n4) {
            bl2 = true;
        }
        string4 = "tag \"%s\" is longer than the %d character maximum";
        Preconditions.checkArgument(bl2, string4, objectArray);
        this.zza = string2;
        string2 = null;
        if (string3 == null || (n3 = string3.length()) <= 0) {
            string3 = null;
        }
        this.zzb = string3;
    }

    private final String zza(String string2) {
        String string3 = this.zzb;
        if (string3 == null) {
            return string2;
        }
        return string3.concat(string2);
    }

    private final String zzb(String string2, Object ... objectArray) {
        String string3 = this.zzb;
        string2 = String.format(string2, objectArray);
        if (string3 == null) {
            return string2;
        }
        return string3.concat(string2);
    }

    public boolean canLog(int n3) {
        return Log.isLoggable((String)this.zza, (int)n3);
    }

    public boolean canLogPii() {
        return false;
    }

    public void d(String string2, String string3) {
        boolean bl2 = this.canLog(3);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void d(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(3);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void e(String string2, String string3) {
        boolean bl2 = this.canLog(6);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void e(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(6);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void efmt(String string2, String string3, Object ... objectArray) {
        boolean bl2 = this.canLog(6);
        if (bl2) {
            this.zzb(string3, objectArray);
        }
    }

    public void i(String string2, String string3) {
        boolean bl2 = this.canLog(4);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void i(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(4);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void pii(String string2, String string3) {
    }

    public void pii(String string2, String string3, Throwable throwable) {
    }

    public void v(String string2, String string3) {
        boolean bl2 = this.canLog(2);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void v(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(2);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void w(String string2, String string3) {
        boolean bl2 = this.canLog(5);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void w(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(5);
        if (bl2) {
            this.zza(string3);
        }
    }

    public void wfmt(String string2, String string3, Object ... objectArray) {
        boolean bl2 = this.canLog(5);
        if (bl2) {
            this.zzb(string3, objectArray);
        }
    }

    public void wtf(String string2, String string3, Throwable throwable) {
        boolean bl2 = this.canLog(7);
        if (bl2) {
            this.zza(string3);
            string3 = this.zza(string3);
            Log.wtf((String)string2, (String)string3, (Throwable)throwable);
        }
    }
}

