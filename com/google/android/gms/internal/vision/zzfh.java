/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfd;
import com.google.android.gms.internal.vision.zzfg;
import java.io.PrintStream;

final class zzfh
extends zzfd {
    private final zzfg zza;

    public zzfh() {
        zzfg zzfg2;
        this.zza = zzfg2 = new zzfg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        object.getClass();
        Object object2 = this.zza;
        boolean bl2 = false;
        Throwable throwable = null;
        object = ((zzfg)object2).zza((Throwable)object, false);
        if (object == null) {
            return;
        }
        synchronized (object) {
            try {
                object2 = object.iterator();
                while (true) {
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    throwable = (Throwable)object2.next();
                    throwable = throwable;
                    PrintStream printStream = System.err;
                    String string2 = "Suppressed: ";
                    printStream.print(string2);
                    throwable.getClass();
                }
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public final void zza(Throwable throwable, Throwable throwable2) {
        if (throwable2 != throwable) {
            if (throwable2 != null) {
                this.zza.zza(throwable, true).add(throwable2);
                return;
            }
            throwable = new NullPointerException("The suppressed exception cannot be null.");
            throw throwable;
        }
        throwable = new IllegalArgumentException("Self suppression is not allowed.", throwable2);
        throw throwable;
    }
}

