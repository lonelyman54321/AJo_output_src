/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.audio;

public final class a {
    public static String a(Exception stackTraceElementArray, StringBuilder stringBuilder) {
        stackTraceElementArray = stackTraceElementArray.getStackTrace();
        stringBuilder.append(stackTraceElementArray);
        return stringBuilder.toString();
    }
}

