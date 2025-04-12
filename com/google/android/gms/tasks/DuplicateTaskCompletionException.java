/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Task;

public final class DuplicateTaskCompletionException
extends IllegalStateException {
    private DuplicateTaskCompletionException(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public static IllegalStateException of(Task object) {
        Object object2;
        boolean bl2 = ((Task)object).isComplete();
        if (!bl2) {
            object = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            return object;
        }
        Exception exception = ((Task)object).getException();
        if (exception != null) {
            object = "failure";
        } else {
            boolean bl3 = ((Task)object).isSuccessful();
            if (bl3) {
                object = String.valueOf(((Task)object).getResult());
                object2 = "result ";
                object = ((String)object2).concat((String)object);
            } else {
                boolean bl4 = ((Task)object).isCanceled();
                object = bl4 ? "cancellation" : "unknown issue";
            }
        }
        object = "Complete with: ".concat((String)object);
        object2 = new DuplicateTaskCompletionException((String)object, exception);
        return object2;
    }
}

