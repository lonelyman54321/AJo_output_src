/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class CorruptionException
extends IOException {
    public CorruptionException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2, null);
    }
}

