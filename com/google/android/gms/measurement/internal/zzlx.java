/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public final class zzlx {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object zza(Object object) {
        void var1_5;
        ObjectOutputStream objectOutputStream;
        block19: {
            if (object == null) {
                return null;
            }
            Object object2 = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream((OutputStream)object2);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            object2 = ((ByteArrayOutputStream)object2).toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object2);
            object = new ObjectInputStream(byteArrayInputStream);
            try {
                object2 = ((ObjectInputStream)object).readObject();
            }
            catch (Throwable throwable) {
                break block19;
            }
            objectOutputStream.close();
            ((ObjectInputStream)object).close();
            return object2;
            catch (Throwable throwable) {
                object = null;
            }
            break block19;
            catch (Throwable throwable) {
                object = null;
                objectOutputStream = null;
            }
        }
        if (objectOutputStream != null) {
            objectOutputStream.close();
        }
        if (object == null) throw var1_5;
        try {
            ((ObjectInputStream)object).close();
            throw var1_5;
        }
        catch (IOException | ClassNotFoundException exception) {
            return null;
        }
    }

    public static String zza(String string2, String[] stringArray, String[] stringArray2) {
        Preconditions.checkNotNull(stringArray);
        Preconditions.checkNotNull(stringArray2);
        int n3 = stringArray.length;
        int n4 = stringArray2.length;
        n3 = Math.min(n3, n4);
        n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            String string3 = stringArray[i3];
            if (string2 == null && string3 == null) {
                bl2 = true;
            } else if (string2 == null) {
                bl2 = false;
                string3 = null;
            } else {
                bl2 = string2.equals(string3);
            }
            if (!bl2) continue;
            return stringArray2[i3];
        }
        return null;
    }
}

