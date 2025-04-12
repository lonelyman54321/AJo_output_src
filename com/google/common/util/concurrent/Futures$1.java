/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Futures$1
implements Future {
    final /* synthetic */ Function val$function;
    final /* synthetic */ Future val$input;

    public Futures$1(Future future, Function function) {
        this.val$input = future;
        this.val$function = function;
    }

    /*
     * WARNING - void declaration
     */
    private Object applyTransformation(Object object) {
        void var1_4;
        Object object2 = this.val$function;
        try {
            return object2.apply(object);
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        object2 = new ExecutionException((Throwable)var1_4);
        throw object2;
    }

    public boolean cancel(boolean bl2) {
        return this.val$input.cancel(bl2);
    }

    public Object get() {
        Object v4 = this.val$input.get();
        return this.applyTransformation(v4);
    }

    public Object get(long l2, TimeUnit timeUnit) {
        Object v4 = this.val$input.get(l2, timeUnit);
        return this.applyTransformation(v4);
    }

    public boolean isCancelled() {
        return this.val$input.isCancelled();
    }

    public boolean isDone() {
        return this.val$input.isDone();
    }
}

