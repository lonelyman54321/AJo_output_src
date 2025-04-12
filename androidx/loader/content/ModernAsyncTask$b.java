/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Process
 */
package androidx.loader.content;

import android.os.Binder;
import android.os.Process;
import androidx.loader.content.ModernAsyncTask;
import androidx.loader.content.ModernAsyncTask$g;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ModernAsyncTask$b
extends ModernAsyncTask$g {
    public final /* synthetic */ ModernAsyncTask b;

    public ModernAsyncTask$b(ModernAsyncTask modernAsyncTask) {
        this.b = modernAsyncTask;
    }

    public final Object call() {
        ModernAsyncTask modernAsyncTask = this.b;
        AtomicBoolean atomicBoolean = modernAsyncTask.e;
        boolean bl2 = true;
        atomicBoolean.set(bl2);
        int n3 = 10;
        Object object = null;
        try {
            Process.setThreadPriority((int)n3);
            object = modernAsyncTask.a();
        }
        catch (Throwable throwable) {
            AtomicBoolean atomicBoolean2;
            try {
                atomicBoolean2 = modernAsyncTask.d;
            }
            catch (Throwable throwable2) {
                modernAsyncTask.d(object);
                throw throwable2;
            }
            atomicBoolean2.set(bl2);
            throw throwable;
        }
        Binder.flushPendingCommands();
        modernAsyncTask.d(object);
        return object;
    }
}

