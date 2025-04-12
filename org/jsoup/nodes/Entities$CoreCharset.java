/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

final class Entities$CoreCharset
extends Enum {
    private static final /* synthetic */ Entities$CoreCharset[] $VALUES;
    public static final /* enum */ Entities$CoreCharset ascii;
    public static final /* enum */ Entities$CoreCharset fallback;
    public static final /* enum */ Entities$CoreCharset utf;

    private static /* synthetic */ Entities$CoreCharset[] $values() {
        Entities$CoreCharset entities$CoreCharset = ascii;
        entities$CoreCharset = utf;
        entities$CoreCharset = fallback;
        Entities$CoreCharset[] entities$CoreCharsetArray = new Entities$CoreCharset[]{entities$CoreCharset, entities$CoreCharset, entities$CoreCharset};
        return entities$CoreCharsetArray;
    }

    static {
        Entities$CoreCharset entities$CoreCharset;
        ascii = entities$CoreCharset = new Entities$CoreCharset("ascii", 0);
        utf = entities$CoreCharset = new Entities$CoreCharset("utf", 1);
        fallback = entities$CoreCharset = new Entities$CoreCharset("fallback", 2);
        $VALUES = Entities$CoreCharset.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Entities$CoreCharset() {
        void var2_-1;
        void var1_-1;
    }

    public static Entities$CoreCharset byName(String string2) {
        String string3 = "US-ASCII";
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            return ascii;
        }
        string3 = "UTF-";
        boolean bl3 = string2.startsWith(string3);
        if (bl3) {
            return utf;
        }
        return fallback;
    }

    public static Entities$CoreCharset valueOf(String string2) {
        return Enum.valueOf(Entities$CoreCharset.class, string2);
    }

    public static Entities$CoreCharset[] values() {
        return (Entities$CoreCharset[])$VALUES.clone();
    }
}

