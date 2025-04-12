/*
 * Decompiled with CFR 0.152.
 */
public final class Gb1
extends n23 {
    public final String createQuery() {
        return "DELETE FROM transactions WHERE requestDate <= ?";
    }
}

