/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

public final class MissingFieldException
extends SerializationException {
    public final List a;

    public MissingFieldException() {
        throw null;
    }

    public MissingFieldException(ArrayList arrayList, String string2, MissingFieldException missingFieldException) {
        Intrinsics.checkNotNullParameter(arrayList, "missingFields");
        super(string2, missingFieldException);
        this.a = arrayList;
    }
}

