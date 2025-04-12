/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;

public class ParseSettings {
    public static final ParseSettings htmlDefault;
    public static final ParseSettings preserveCase;
    private final boolean preserveAttributeCase;
    private final boolean preserveTagCase;

    static {
        ParseSettings parseSettings;
        htmlDefault = parseSettings = new ParseSettings(false, false);
        boolean bl2 = true;
        preserveCase = parseSettings = new ParseSettings(bl2, bl2);
    }

    public ParseSettings(ParseSettings parseSettings) {
        boolean bl2 = parseSettings.preserveTagCase;
        boolean bl3 = parseSettings.preserveAttributeCase;
        this(bl2, bl3);
    }

    public ParseSettings(boolean bl2, boolean bl3) {
        this.preserveTagCase = bl2;
        this.preserveAttributeCase = bl3;
    }

    public static String normalName(String string2) {
        return Normalizer.lowerCase(string2.trim());
    }

    public String normalizeAttribute(String string2) {
        string2 = string2.trim();
        boolean bl2 = this.preserveAttributeCase;
        if (!bl2) {
            string2 = Normalizer.lowerCase(string2);
        }
        return string2;
    }

    public Attributes normalizeAttributes(Attributes attributes) {
        boolean bl2;
        if (attributes != null && !(bl2 = this.preserveAttributeCase)) {
            attributes.normalize();
        }
        return attributes;
    }

    public String normalizeTag(String string2) {
        string2 = string2.trim();
        boolean bl2 = this.preserveTagCase;
        if (!bl2) {
            string2 = Normalizer.lowerCase(string2);
        }
        return string2;
    }

    public boolean preserveAttributeCase() {
        return this.preserveAttributeCase;
    }

    public boolean preserveTagCase() {
        return this.preserveTagCase;
    }
}

