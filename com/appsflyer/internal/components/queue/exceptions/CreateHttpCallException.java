/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal.components.queue.exceptions;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class CreateHttpCallException
extends NoSuchElementException {
    public CreateHttpCallException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        super(string2);
    }
}

