/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.b;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

class AbstractExecutionThreadService$1
extends AbstractService {
    final /* synthetic */ AbstractExecutionThreadService this$0;

    public AbstractExecutionThreadService$1(AbstractExecutionThreadService abstractExecutionThreadService) {
        this.this$0 = abstractExecutionThreadService;
    }

    public static /* synthetic */ String a(AbstractExecutionThreadService$1 abstractExecutionThreadService$1) {
        return abstractExecutionThreadService$1.lambda$doStart$0();
    }

    public static /* synthetic */ void b(AbstractExecutionThreadService$1 abstractExecutionThreadService$1) {
        abstractExecutionThreadService$1.lambda$doStart$1();
    }

    private /* synthetic */ String lambda$doStart$0() {
        return this.this$0.serviceName();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$doStart$1() {
        Throwable throwable222;
        block9: {
            AbstractExecutionThreadService abstractExecutionThreadService;
            block7: {
                abstractExecutionThreadService = this.this$0;
                abstractExecutionThreadService.startUp();
                this.notifyStarted();
                boolean bl2 = this.isRunning();
                if (!bl2) break block7;
                {
                    catch (Throwable throwable222) {}
                }
                try {
                    abstractExecutionThreadService = this.this$0;
                    abstractExecutionThreadService.run();
                }
                catch (Throwable throwable3) {
                    block8: {
                        Platform.restoreInterruptIfIsInterruptedException(throwable3);
                        AbstractExecutionThreadService abstractExecutionThreadService2 = this.this$0;
                        abstractExecutionThreadService2.shutDown();
                        break block8;
                        break block9;
                        catch (Exception exception) {
                            Platform.restoreInterruptIfIsInterruptedException(exception);
                            Logger logger = AbstractExecutionThreadService.access$000();
                            Level level = Level.WARNING;
                            String string2 = "Error while attempting to shut down the service after failure.";
                            logger.log(level, string2, exception);
                        }
                    }
                    this.notifyFailed(throwable3);
                    return;
                }
            }
            abstractExecutionThreadService = this.this$0;
            abstractExecutionThreadService.shutDown();
            this.notifyStopped();
            return;
        }
        Platform.restoreInterruptIfIsInterruptedException(throwable222);
        this.notifyFailed(throwable222);
    }

    public final void doStart() {
        Executor executor = this.this$0.executor();
        Object object = new a(this);
        executor = MoreExecutors.renamingDecorator(executor, (Supplier)object);
        object = new b(this);
        executor.execute((Runnable)object);
    }

    public void doStop() {
        this.this$0.triggerShutdown();
    }

    public String toString() {
        return this.this$0.toString();
    }
}

