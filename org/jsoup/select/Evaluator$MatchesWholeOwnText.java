/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.regex.Pattern;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$MatchesWholeOwnText
extends Evaluator {
    private final Pattern pattern;

    public Evaluator$MatchesWholeOwnText(Pattern pattern) {
        this.pattern = pattern;
    }

    public int cost() {
        return 7;
    }

    public boolean matches(Element object, Element object2) {
        object = this.pattern;
        object2 = ((Element)object2).wholeOwnText();
        return ((Pattern)object).matcher((CharSequence)object2).find();
    }

    public String toString() {
        Pattern pattern = this.pattern;
        StringBuilder stringBuilder = new StringBuilder(":matchesWholeOwnText(");
        stringBuilder.append(pattern);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

