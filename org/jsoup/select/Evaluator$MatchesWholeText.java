/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.regex.Pattern;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$MatchesWholeText
extends Evaluator {
    private final Pattern pattern;

    public Evaluator$MatchesWholeText(Pattern pattern) {
        this.pattern = pattern;
    }

    public int cost() {
        return 8;
    }

    public boolean matches(Element object, Element object2) {
        object = this.pattern;
        object2 = ((Element)object2).wholeText();
        return ((Pattern)object).matcher((CharSequence)object2).find();
    }

    public String toString() {
        Pattern pattern = this.pattern;
        StringBuilder stringBuilder = new StringBuilder(":matchesWholeText(");
        stringBuilder.append(pattern);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

