/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzbx
extends RuntimeException {
    private zzbx(Exception exception) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exception);
    }

    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        }
        catch (Exception exception) {
            zzbx zzbx2 = new zzbx(exception);
            throw zzbx2;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Exception zza() {
        synchronized (this) {
            Throwable throwable = super.getCause();
            throwable.getClass();
            return (Exception)throwable;
        }
    }

    public final Exception zzb(Class object) {
        int n3 = 2;
        int n4 = 1;
        Object object2 = new Class[n4];
        int n7 = 0;
        Object object3 = null;
        object2[0] = object;
        StringBuilder stringBuilder = null;
        for (int i3 = 0; i3 <= 0; i3 += n4) {
            int n8;
            Object object4;
            int n10;
            Class<RuntimeException> clazz = RuntimeException.class;
            Object object5 = object2[i3];
            int n14 = clazz.isAssignableFrom((Class<?>)object5) ^ n4;
            if (n14 != 0) continue;
            object2 = new Object[n3];
            object2[0] = "getCause";
            object2[n4] = object5;
            stringBuilder = null;
            for (i3 = 0; i3 < n3; i3 += n4) {
                object5 = object2[i3];
                if (object5 == null) {
                    object5 = "null";
                } else {
                    try {
                        object5 = object5.toString();
                    }
                    catch (Exception exception) {
                        clazz = object5.getClass().getName();
                        n10 = System.identityHashCode(object5);
                        object5 = Integer.toHexString(n10);
                        object5 = n1.a((String)((Object)clazz), "@", (String)object5);
                        clazz = Logger.getLogger("com.google.common.base.Strings");
                        object4 = Level.WARNING;
                        String string2 = "Exception during lenientFormat for ".concat((String)object5);
                        ((Logger)((Object)clazz)).logp((Level)object4, "com.google.common.base.Strings", "lenientToString", string2, exception);
                        clazz = exception.getClass().getName();
                        object4 = "<";
                        String string3 = " threw ";
                        String string4 = ">";
                        object5 = uc0_0.a((String)object4, (String)object5, string3, (String)((Object)clazz), string4);
                    }
                }
                object2[i3] = object5;
            }
            stringBuilder = new StringBuilder(118);
            n10 = 0;
            object5 = null;
            while (true) {
                int n15;
                clazz = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s";
                if (n7 >= n3 || (n8 = ((String)((Object)clazz)).indexOf((String)(object4 = "%s"), n10)) == (n15 = -1)) break;
                stringBuilder.append((CharSequence)((Object)clazz), n10, n8);
                n10 = n7 + 1;
                object3 = object2[n7];
                stringBuilder.append(object3);
                n7 = n8 + 2;
                int n16 = n10;
                n10 = n7;
                n7 = n16;
            }
            n8 = 86;
            stringBuilder.append((CharSequence)((Object)clazz), n10, n8);
            if (n7 < n3) {
                object5 = " [";
                stringBuilder.append((String)object5);
                n10 = n7 + 1;
                object3 = object2[n7];
                stringBuilder.append(object3);
                while (n10 < n3) {
                    object3 = ", ";
                    stringBuilder.append((String)object3);
                    n7 = n10 + '\u0001';
                    object5 = object2[n10];
                    stringBuilder.append(object5);
                    n10 = n7;
                }
                n3 = 93;
                stringBuilder.append((char)n3);
            }
            String string5 = stringBuilder.toString();
            object = new IllegalArgumentException(string5);
            throw object;
        }
        Exception exception = this.zza();
        n3 = (int)(((Class)object).isInstance(exception) ? 1 : 0);
        if (n3 != 0) {
            exception = this.zza();
            return (Exception)((Class)object).cast(exception);
        }
        exception = this.zza();
        object2 = new StringBuilder("getCause(");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(") doesn't match underlying exception");
        object = ((StringBuilder)object2).toString();
        ClassCastException classCastException = new ClassCastException((String)object);
        classCastException.initCause(exception);
        throw classCastException;
    }
}

