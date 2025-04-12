/*
 * Decompiled with CFR 0.152.
 */
package coil.request;

public final class NullRequestDataException
extends RuntimeException {
    public NullRequestDataException() {
        super("The request's data is null.");
    }
}

