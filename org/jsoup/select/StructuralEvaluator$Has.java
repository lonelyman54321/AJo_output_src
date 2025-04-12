/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;

class StructuralEvaluator$Has
extends StructuralEvaluator {
    final NodeIterator it;

    public StructuralEvaluator$Has(Evaluator object) {
        super((Evaluator)object);
        Element element = new Element("html");
        this.it = object = new NodeIterator(element, Element.class);
    }

    public int cost() {
        return this.evaluator.cost() * 10;
    }

    public boolean matches(Element object, Element element) {
        boolean bl2;
        object = this.it;
        ((NodeIterator)object).restart(element);
        while (bl2 = ((NodeIterator)(object = this.it)).hasNext()) {
            Evaluator evaluator;
            object = (Element)this.it.next();
            if (object == element || !(bl2 = (evaluator = this.evaluator).matches(element, (Element)object))) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        Evaluator evaluator = this.evaluator;
        Object[] objectArray = new Object[]{evaluator};
        return String.format(":has(%s)", objectArray);
    }
}

