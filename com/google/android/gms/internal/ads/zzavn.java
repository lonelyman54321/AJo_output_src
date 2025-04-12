/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

public abstract class zzavn {
    private static final String zza = "zzavn";

    public static HashMap zza(String object) {
        block8: {
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) break block8;
            object = ((String)object).getBytes();
            object = Base64.decode((byte[])object, (int)0);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            object = new ObjectInputStream(byteArrayInputStream);
            object = ((ObjectInputStream)object).readObject();
            try {
                return (HashMap)object;
            }
            catch (IOException | ClassNotFoundException exception) {}
        }
        return null;
    }

    public final String toString() {
        Object object;
        try {
            object = new ByteArrayOutputStream();
        }
        catch (IOException iOException) {
            return null;
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)object);
        HashMap hashMap = this.zzb();
        objectOutputStream.writeObject(hashMap);
        objectOutputStream.close();
        object = ((ByteArrayOutputStream)object).toByteArray();
        objectOutputStream = null;
        return Base64.encodeToString((byte[])object, (int)0);
    }

    public abstract HashMap zzb();
}

