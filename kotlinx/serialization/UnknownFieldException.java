/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization;

import kotlinx.serialization.SerializationException;

public final class UnknownFieldException
extends SerializationException {
    public UnknownFieldException(int n3) {
        String string2 = hj0_0.a(n3, "An unknown field for index ");
        super(string2);
    }
}

