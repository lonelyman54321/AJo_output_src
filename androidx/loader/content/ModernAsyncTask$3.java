/*
 * Decompiled with CFR 0.152.
 */
package androidx.loader.content;

import androidx.loader.content.ModernAsyncTask;
import androidx.loader.content.ModernAsyncTask$b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

class ModernAsyncTask$3
extends FutureTask {
    public final /* synthetic */ ModernAsyncTask a;

    public ModernAsyncTask$3(ModernAsyncTask modernAsyncTask, ModernAsyncTask$b modernAsyncTask$b) {
        this.a = modernAsyncTask;
        super(modernAsyncTask$b);
    }

    public final void done() {
        block9: {
            Object object = "An error occurred while executing doInBackground()";
            ModernAsyncTask modernAsyncTask = this.a;
            Object object2 = this.get();
            AtomicBoolean atomicBoolean = modernAsyncTask.e;
            boolean bl2 = atomicBoolean.get();
            if (bl2) break block9;
            try {
                modernAsyncTask.d(object2);
            }
            catch (Throwable throwable) {
                object2 = new Object((String)object, throwable);
                throw object2;
            }
            catch (CancellationException cancellationException) {
                object = modernAsyncTask.e;
                boolean bl3 = ((AtomicBoolean)object).get();
                if (!bl3) {
                    bl3 = false;
                    object = null;
                    modernAsyncTask.d(null);
                }
            }
            catch (ExecutionException executionException) {
                Throwable throwable = executionException.getCause();
                object2 = new Object((String)object, throwable);
                throw object2;
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

