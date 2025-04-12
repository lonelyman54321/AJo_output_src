/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.os.Trace
 */
package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.media3.exoplayer.upstream.Loader$a;
import androidx.media3.exoplayer.upstream.Loader$c;
import java.io.IOException;

final class Loader$LoadTask
extends Handler
implements Runnable {
    public final int a;
    public final Loader$c b;
    public final long c;
    public Loader$a d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ Loader j;

    public Loader$LoadTask(Loader loader, Looper looper, Loader$c c2, Loader$a a2, int n3, long l2) {
        this.j = loader;
        super(looper);
        this.b = c2;
        this.d = a2;
        this.a = n3;
        this.c = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(boolean bl2) {
        Object object;
        this.i = bl2;
        this.e = null;
        int n3 = 1;
        boolean bl3 = this.hasMessages(n3);
        if (bl3) {
            this.h = n3;
            this.removeMessages(n3);
            if (!bl2) {
                n3 = 2;
                this.sendEmptyMessage(n3);
            }
        } else {
            // MONITORENTER : this
            this.h = n3;
            object = this.b;
            object.b();
            object = this.g;
            if (object != null) {
                ((Thread)object).interrupt();
            }
        }
        if (!bl2) return;
        Loader loader = this.j;
        loader.b = null;
        long l2 = SystemClock.elapsedRealtime();
        object = this.d;
        object.getClass();
        Loader$c loader$c = this.b;
        long l3 = this.c;
        l3 = l2 - l3;
        boolean bl4 = true;
        object.r(loader$c, l2, l3, bl4);
        this.d = null;
    }

    public final void b() {
        SystemClock.elapsedRealtime();
        this.d.getClass();
        this.e = null;
        Object object = this.j;
        gi2_0 gi2_02 = ((Loader)object).a;
        object = ((Loader)object).b;
        object.getClass();
        gi2_02.execute((Runnable)object);
    }

    public final void handleMessage(Message object) {
        int n3 = this.i;
        if (n3 != 0) {
            return;
        }
        n3 = object.what;
        int n4 = 1;
        if (n3 == n4) {
            this.b();
            return;
        }
        int n7 = 4;
        if (n3 != n7) {
            Object object2 = this.j;
            n7 = 0;
            ((Loader)object2).b = null;
            long l2 = SystemClock.elapsedRealtime();
            long l3 = this.c;
            long l4 = l2 - l3;
            Loader$a loader$a = this.d;
            loader$a.getClass();
            n3 = (int)(this.h ? 1 : 0);
            if (n3 != 0) {
                Loader$c loader$c = this.b;
                loader$a.r(loader$c, l2, l4, false);
                return;
            }
            n3 = object.what;
            n7 = 2;
            if (n3 != n7) {
                int n8 = 3;
                if (n3 == n8) {
                    int n10;
                    Object object3 = object = object.obj;
                    object3 = (IOException)object;
                    this.e = object3;
                    int n14 = this.f;
                    this.f = n10 = n14 + 1;
                    Loader$c loader$c = this.b;
                    object = loader$a.c(loader$c, l2, l4, (IOException)object3, n10);
                    n3 = object.a;
                    if (n3 == n8) {
                        object = this.j;
                        object.c = object2 = this.e;
                    } else if (n3 != n7) {
                        long l7;
                        long l8;
                        if (n3 == n4) {
                            this.f = n4;
                        }
                        if ((n14 = (int)((l8 = (l3 = object.b) - (l7 = -9223372036854775807L)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                            n14 = (this.f - n4) * 1000;
                            n3 = 5000;
                            n14 = Math.min(n14, n3);
                            l3 = n14;
                        }
                        object = this.j;
                        object2 = object.b;
                        if (object2 == null) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        ct3.f(n3 != 0);
                        object.b = this;
                        l7 = 0L;
                        n14 = (int)(l3 == l7 ? 0 : (l3 < l7 ? -1 : 1));
                        if (n14 > 0) {
                            this.sendEmptyMessageDelayed(n4, l3);
                        } else {
                            this.b();
                        }
                    }
                }
            } else {
                Loader$c loader$c = this.b;
                try {
                    loader$a.m(loader$c, l2, l4);
                }
                catch (RuntimeException runtimeException) {
                    Cx.d("Unexpected exception handling load completed", runtimeException);
                    object2 = this.j;
                    Loader$UnexpectedLoaderException loader$UnexpectedLoaderException = new Loader$UnexpectedLoaderException(runtimeException);
                    ((Loader)object2).c = loader$UnexpectedLoaderException;
                }
            }
            return;
        }
        throw (Error)object.obj;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        IOException iOException22;
        boolean bl2;
        int n3;
        block24: {
            Exception exception22;
            Object object;
            block23: {
                OutOfMemoryError outOfMemoryError22;
                block22: {
                    Thread thread2;
                    Object object2 = "load:";
                    n3 = 3;
                    bl2 = this.h ^ true;
                    this.g = thread2 = Thread.currentThread();
                    // MONITOREXIT : this
                    if (bl2) {
                        object = this.b;
                        object = object.getClass();
                        object = ((Class)object).getSimpleName();
                        object2 = ((String)object2).concat((String)object);
                        Trace.beginSection((String)object2);
                        object2 = this.b;
                        object2.a();
                        {
                            catch (Throwable throwable) {
                                Trace.endSection();
                                throw throwable;
                            }
                        }
                        Trace.endSection();
                        // MONITORENTER : this
                    }
                    int n4 = 0;
                    object2 = null;
                    this.g = null;
                    Thread.interrupted();
                    // MONITOREXIT : this
                    try {
                        n4 = this.i;
                        if (n4 != 0) return;
                        n4 = 2;
                        this.sendEmptyMessage(n4);
                        return;
                    }
                    catch (Error error) {
                    }
                    catch (OutOfMemoryError outOfMemoryError22) {
                        break block22;
                    }
                    catch (Exception exception22) {
                        break block23;
                    }
                    catch (IOException iOException22) {
                        break block24;
                    }
                    n3 = (int)(this.i ? 1 : 0);
                    if (n3 != 0) throw error;
                    Cx.d("Unexpected error loading stream", error);
                    n3 = 4;
                    Message message = this.obtainMessage(n3, error);
                    message.sendToTarget();
                    throw error;
                }
                bl2 = this.i;
                if (bl2) return;
                Cx.d("OutOfMemory error loading stream", outOfMemoryError22);
                object = new Loader$UnexpectedLoaderException(outOfMemoryError22);
                Message message = this.obtainMessage(n3, object);
                message.sendToTarget();
                return;
            }
            bl2 = this.i;
            if (bl2) return;
            Cx.d("Unexpected exception loading stream", exception22);
            object = new Loader$UnexpectedLoaderException(exception22);
            Message message = this.obtainMessage(n3, object);
            message.sendToTarget();
            return;
        }
        bl2 = this.i;
        if (bl2) return;
        Message message = this.obtainMessage(n3, iOException22);
        message.sendToTarget();
    }
}

