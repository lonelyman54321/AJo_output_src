/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

public class JsonException
extends SerializationException {
    public JsonException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }
}

