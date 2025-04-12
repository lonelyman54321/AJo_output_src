/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport;

public final class Encoding {
    private final String name;

    private Encoding(String object) {
        if (object != null) {
            this.name = object;
            return;
        }
        object = new NullPointerException("name is null");
        throw object;
    }

    public static Encoding of(String string2) {
        Encoding encoding = new Encoding(string2);
        return encoding;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof Encoding;
        if (!bl2) {
            return false;
        }
        String string2 = this.name;
        object = ((Encoding)object).name;
        return string2.equals(object);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Encoding{name=\"");
        String string2 = this.name;
        return h30_0.a(stringBuilder, string2, "\"}");
    }
}

