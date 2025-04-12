/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.stacktrace;

import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.util.AbstractCollection;
import java.util.Stack;

public class TrimmedThrowableData {
    public final TrimmedThrowableData cause;
    public final String className;
    public final String localizedMessage;
    public final StackTraceElement[] stacktrace;

    private TrimmedThrowableData(String string2, String string3, StackTraceElement[] stackTraceElementArray, TrimmedThrowableData trimmedThrowableData) {
        this.localizedMessage = string2;
        this.className = string3;
        this.stacktrace = stackTraceElementArray;
        this.cause = trimmedThrowableData;
    }

    public static TrimmedThrowableData makeTrimmedThrowableData(Throwable object, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        boolean bl2;
        Stack<Throwable> stack = new Stack<Throwable>();
        while (object != null) {
            stack.push((Throwable)object);
            object = ((Throwable)object).getCause();
        }
        object = null;
        while (!(bl2 = ((AbstractCollection)stack).isEmpty())) {
            StackTraceElement[] stackTraceElementArray = (StackTraceElement[])stack.pop();
            String string2 = stackTraceElementArray.getLocalizedMessage();
            String string3 = stackTraceElementArray.getClass().getName();
            stackTraceElementArray = stackTraceElementArray.getStackTrace();
            stackTraceElementArray = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArray);
            TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(string2, string3, stackTraceElementArray, (TrimmedThrowableData)object);
            object = trimmedThrowableData;
        }
        return object;
    }
}

