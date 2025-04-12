/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

public final class Document$OutputSettings$Syntax
extends Enum {
    private static final /* synthetic */ Document$OutputSettings$Syntax[] $VALUES;
    public static final /* enum */ Document$OutputSettings$Syntax html;
    public static final /* enum */ Document$OutputSettings$Syntax xml;

    private static /* synthetic */ Document$OutputSettings$Syntax[] $values() {
        Document$OutputSettings$Syntax document$OutputSettings$Syntax = html;
        document$OutputSettings$Syntax = xml;
        Document$OutputSettings$Syntax[] document$OutputSettings$SyntaxArray = new Document$OutputSettings$Syntax[]{document$OutputSettings$Syntax, document$OutputSettings$Syntax};
        return document$OutputSettings$SyntaxArray;
    }

    static {
        Document$OutputSettings$Syntax document$OutputSettings$Syntax;
        html = document$OutputSettings$Syntax = new Document$OutputSettings$Syntax("html", 0);
        xml = document$OutputSettings$Syntax = new Document$OutputSettings$Syntax("xml", 1);
        $VALUES = Document$OutputSettings$Syntax.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Document$OutputSettings$Syntax() {
        void var2_-1;
        void var1_-1;
    }

    public static Document$OutputSettings$Syntax valueOf(String string2) {
        return Enum.valueOf(Document$OutputSettings$Syntax.class, string2);
    }

    public static Document$OutputSettings$Syntax[] values() {
        return (Document$OutputSettings$Syntax[])$VALUES.clone();
    }
}

