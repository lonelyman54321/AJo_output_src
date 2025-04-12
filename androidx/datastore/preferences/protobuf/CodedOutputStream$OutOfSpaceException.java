/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class CodedOutputStream$OutOfSpaceException
extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public CodedOutputStream$OutOfSpaceException(String string2, IndexOutOfBoundsException indexOutOfBoundsException) {
        string2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(string2);
        super(string2, indexOutOfBoundsException);
    }
}

