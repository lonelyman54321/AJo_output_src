/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.util.Base64
 */
package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzan;
import com.google.android.gms.internal.clearcut.zzao;
import java.io.IOException;

final class zzal
extends zzae {
    private final Object lock;
    private String zzec;
    private Object zzed;
    private final /* synthetic */ zzan zzee;

    public zzal(zzao object, String string2, Object object2, zzan zzan2) {
        this.zzee = zzan2;
        super((zzao)object, string2, object2, null);
        this.lock = object = new Object();
    }

    public final Object zza(SharedPreferences object) {
        String string2;
        String string3;
        try {
            string3 = this.zzds;
            string2 = "";
        }
        catch (ClassCastException classCastException) {
            object = String.valueOf(this.zzds);
            int n3 = ((String)object).length();
            if (n3 != 0) {
                string3 = "Invalid byte[] value in SharedPreferences for ";
                string3.concat((String)object);
            }
            return null;
        }
        object = object.getString(string3, string2);
        return this.zzb((String)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzb(String string2) {
        Object object;
        block6: {
            try {
                object = this.lock;
                synchronized (object) {
                }
            }
            catch (IOException | IllegalArgumentException exception) {
                break block6;
            }
            {
                try {
                    Object object2 = this.zzec;
                    boolean bl2 = string2.equals(object2);
                    if (bl2) return this.zzed;
                    object2 = this.zzee;
                    int n3 = 3;
                    byte[] byArray = Base64.decode((String)string2, (int)n3);
                    object2 = object2.zzb(byArray);
                    this.zzec = string2;
                    this.zzed = object2;
                    return this.zzed;
                }
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
        }
        object = this.zzds;
        int n4 = lE2.a(lE2.a(27, (String)object), string2);
        new StringBuilder(n4);
        return null;
    }
}

