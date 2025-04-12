/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public final class K$d
extends IllegalArgumentException {
    public K$d(int n3, int n4) {
        String string2 = D70.b(n3, n4, "Unpaired surrogate at index ", " of ");
        super(string2);
    }
}

