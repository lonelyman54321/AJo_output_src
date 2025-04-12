/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Evaluator;

public final class Evaluator$AttributeWithValueMatching
extends Evaluator {
    final String key;
    final Pattern pattern;

    public Evaluator$AttributeWithValueMatching(String string2, Pattern pattern) {
        this.key = string2 = Normalizer.normalize(string2);
        this.pattern = pattern;
    }

    public int cost() {
        return 8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean matches(Element object, Element object2) {
        object = this.key;
        boolean bl2 = ((Node)object2).hasAttr((String)object);
        if (!bl2) return false;
        object = this.pattern;
        String string2 = this.key;
        bl2 = ((Matcher)(object = ((Pattern)object).matcher((CharSequence)(object2 = ((Node)object2).attr(string2))))).find();
        if (!bl2) return false;
        return true;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.pattern.toString();
        return uc0_0.a("[", string2, "~=", string3, "]");
    }
}

