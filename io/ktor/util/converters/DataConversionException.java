/*
 * Decompiled with CFR 0.152.
 */
package io.ktor.util.converters;

import kotlin.jvm.internal.Intrinsics;

public class DataConversionException
extends Exception {
    public DataConversionException() {
        String string2 = "Invalid data format";
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }
}

