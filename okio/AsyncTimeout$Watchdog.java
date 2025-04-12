/*
 * Decompiled with CFR 0.152.
 */
package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import okio.AsyncTimeout;
import okio.AsyncTimeout$a;

final class AsyncTimeout$Watchdog
extends Thread {
    public AsyncTimeout$Watchdog() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }

    /*
     * Loose catch block
     */
    public final void run() {
        while (true) {
            Object object;
            AsyncTimeout asyncTimeout;
            ReentrantLock reentrantLock;
            block13: {
                reentrantLock = AsyncTimeout.h;
                {
                    catch (InterruptedException interruptedException) {
                        continue;
                    }
                }
                reentrantLock.lock();
                asyncTimeout = AsyncTimeout$a.a();
                object = AsyncTimeout.l;
                if (asyncTimeout != object) break block13;
                asyncTimeout = null;
                AsyncTimeout.l = null;
                reentrantLock.unlock();
                return;
            }
            object = Unit.a;
            reentrantLock.unlock();
            if (asyncTimeout == null) continue;
            asyncTimeout.k();
            continue;
            catch (Throwable throwable) {
                reentrantLock.unlock();
                throw throwable;
            }
            break;
        }
    }
}

