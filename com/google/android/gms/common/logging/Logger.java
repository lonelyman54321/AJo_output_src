/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    public Logger(String string2, String ... object) {
        int n3;
        int n4;
        int n7 = ((String[])object).length;
        if (n7 == 0) {
            object = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('[');
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8;
                String string3 = object[i3];
                int n10 = stringBuilder.length();
                if (n10 > (n8 = 1)) {
                    String string4 = ",";
                    stringBuilder.append(string4);
                }
                stringBuilder.append(string3);
            }
            stringBuilder.append("] ");
            object = stringBuilder.toString();
        }
        this.zzb = object;
        this.zza = string2;
        super(string2);
        this.zzc = object;
        for (n4 = 2; n4 <= (n3 = 7) && (n3 = (int)(Log.isLoggable((String)(object = this.zza), (int)n4) ? 1 : 0)) == 0; ++n4) {
        }
        this.zzd = n4;
    }

    public void d(String string2, Object ... objectArray) {
        boolean bl2 = this.isLoggable(3);
        if (bl2) {
            this.format(string2, objectArray);
        }
    }

    public void e(String string2, Throwable throwable, Object ... objectArray) {
        this.format(string2, objectArray);
    }

    public void e(String string2, Object ... objectArray) {
        this.format(string2, objectArray);
    }

    public String format(String string2, Object ... objectArray) {
        int n3;
        if (objectArray != null && (n3 = objectArray.length) > 0) {
            Locale locale = Locale.US;
            string2 = String.format(locale, string2, objectArray);
        }
        return this.zzb.concat(string2);
    }

    public String getTag() {
        return this.zza;
    }

    public void i(String string2, Object ... objectArray) {
        this.format(string2, objectArray);
    }

    public boolean isLoggable(int n3) {
        int n4 = this.zzd;
        return n4 <= n3;
    }

    public void v(String string2, Throwable throwable, Object ... objectArray) {
        boolean bl2 = this.isLoggable(2);
        if (bl2) {
            this.format(string2, objectArray);
        }
    }

    public void v(String string2, Object ... objectArray) {
        boolean bl2 = this.isLoggable(2);
        if (bl2) {
            this.format(string2, objectArray);
        }
    }

    public void w(String string2, Object ... objectArray) {
        this.format(string2, objectArray);
    }

    public void wtf(String string2, Throwable throwable, Object ... objectArray) {
        String string3 = this.zza;
        string2 = this.format(string2, objectArray);
        Log.wtf((String)string3, (String)string2, (Throwable)throwable);
    }

    public void wtf(Throwable throwable) {
        Log.wtf((String)this.zza, (Throwable)throwable);
    }
}

