/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfd;
import com.google.android.gms.internal.vision.zzfe$zza;
import com.google.android.gms.internal.vision.zzfh;
import com.google.android.gms.internal.vision.zzfj;
import java.io.PrintStream;
import java.lang.reflect.Field;

public final class zzfe {
    private static final zzfd zza;
    private static final int zzb;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Integer n3;
        int n4;
        block8: {
            block7: {
                int n7;
                block6: {
                    n4 = 1;
                    try {
                        n3 = zzfe.zza();
                        if (n3 == null) break block6;
                    }
                    catch (Throwable throwable) {
                        n3 = null;
                        break block7;
                    }
                    try {
                        n7 = n3;
                        int n8 = 19;
                        if (n7 < n8) break block6;
                        object = new zzfj();
                        break block8;
                    }
                    catch (Throwable throwable) {
                        break block7;
                    }
                }
                object = (n7 = Boolean.getBoolean((String)(object = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) ^ n4) != 0 ? new zzfh() : new zzfe$zza();
                break block8;
            }
            PrintStream printStream = System.err;
            String string2 = zzfe$zza.class.getName();
            int n10 = string2.length() + 133;
            StringBuilder stringBuilder = new StringBuilder(n10);
            String string3 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ";
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            stringBuilder.append("will be used. The error is: ");
            string2 = stringBuilder.toString();
            printStream.println(string2);
            ((Throwable)object).printStackTrace(printStream);
            object = new zzfe$zza();
        }
        zza = object;
        if (n3 != null) {
            n4 = n3;
        }
        zzb = n4;
    }

    private static Integer zza() {
        Object object;
        Object object2 = "android.os.Build$VERSION";
        try {
            object2 = Class.forName((String)object2);
            object = "SDK_INT";
        }
        catch (Exception exception) {
            object = System.err;
            ((PrintStream)object).println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            exception.printStackTrace((PrintStream)object);
            return null;
        }
        object2 = ((Class)object2).getField((String)object);
        object2 = ((Field)object2).get(null);
        return (Integer)object2;
    }

    public static void zza(Throwable throwable) {
        zza.zza(throwable);
    }

    public static void zza(Throwable throwable, Throwable throwable2) {
        zza.zza(throwable, throwable2);
    }
}

