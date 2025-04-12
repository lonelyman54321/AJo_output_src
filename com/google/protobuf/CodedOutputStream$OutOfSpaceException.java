/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import java.io.IOException;

public class CodedOutputStream$OutOfSpaceException
extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    public CodedOutputStream$OutOfSpaceException() {
        super(MESSAGE);
    }

    public CodedOutputStream$OutOfSpaceException(String string2) {
        string2 = kp1_0.c("CodedOutputStream was writing to a flat byte array and ran out of space.: ", string2);
        super(string2);
    }

    public CodedOutputStream$OutOfSpaceException(String string2, Throwable throwable) {
        string2 = kp1_0.c("CodedOutputStream was writing to a flat byte array and ran out of space.: ", string2);
        super(string2, throwable);
    }

    public CodedOutputStream$OutOfSpaceException(Throwable throwable) {
        super(MESSAGE, throwable);
    }
}

