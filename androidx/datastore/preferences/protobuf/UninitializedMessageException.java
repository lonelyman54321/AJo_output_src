/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public class UninitializedMessageException
extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

