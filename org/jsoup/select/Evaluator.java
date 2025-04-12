/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.function.Predicate;
import org.jsoup.nodes.Element;

public abstract class Evaluator {
    public static /* synthetic */ boolean a(Evaluator evaluator, Element element, Element element2) {
        return evaluator.lambda$asPredicate$0(element, element2);
    }

    private /* synthetic */ boolean lambda$asPredicate$0(Element element, Element element2) {
        return this.matches(element, element2);
    }

    public Predicate asPredicate(Element element) {
        zb0_2 zb0_22 = new zb0_2(this, element);
        return zb0_22;
    }

    public int cost() {
        return 5;
    }

    public abstract boolean matches(Element var1, Element var2);

    public void reset() {
    }
}

