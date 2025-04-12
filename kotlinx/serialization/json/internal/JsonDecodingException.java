/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonException;

public final class JsonDecodingException
extends JsonException {
    public JsonDecodingException(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }
}

