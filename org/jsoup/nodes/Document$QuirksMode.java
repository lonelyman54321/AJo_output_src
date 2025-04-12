/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

public final class Document$QuirksMode
extends Enum {
    private static final /* synthetic */ Document$QuirksMode[] $VALUES;
    public static final /* enum */ Document$QuirksMode limitedQuirks;
    public static final /* enum */ Document$QuirksMode noQuirks;
    public static final /* enum */ Document$QuirksMode quirks;

    private static /* synthetic */ Document$QuirksMode[] $values() {
        Document$QuirksMode document$QuirksMode = noQuirks;
        document$QuirksMode = quirks;
        document$QuirksMode = limitedQuirks;
        Document$QuirksMode[] document$QuirksModeArray = new Document$QuirksMode[]{document$QuirksMode, document$QuirksMode, document$QuirksMode};
        return document$QuirksModeArray;
    }

    static {
        Document$QuirksMode document$QuirksMode;
        noQuirks = document$QuirksMode = new Document$QuirksMode("noQuirks", 0);
        quirks = document$QuirksMode = new Document$QuirksMode("quirks", 1);
        limitedQuirks = document$QuirksMode = new Document$QuirksMode("limitedQuirks", 2);
        $VALUES = Document$QuirksMode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Document$QuirksMode() {
        void var2_-1;
        void var1_-1;
    }

    public static Document$QuirksMode valueOf(String string2) {
        return Enum.valueOf(Document$QuirksMode.class, string2);
    }

    public static Document$QuirksMode[] values() {
        return (Document$QuirksMode[])$VALUES.clone();
    }
}

