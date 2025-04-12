/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.ArrayList;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

class StructuralEvaluator$ImmediateParentRun
extends Evaluator {
    int cost;
    final ArrayList evaluators;

    public StructuralEvaluator$ImmediateParentRun(Evaluator evaluator) {
        int n3;
        ArrayList<Evaluator> arrayList;
        this.evaluators = arrayList = new ArrayList<Evaluator>();
        this.cost = 2;
        arrayList.add(evaluator);
        int n4 = this.cost;
        this.cost = n3 = evaluator.cost() + n4;
    }

    public void add(Evaluator evaluator) {
        int n3;
        this.evaluators.add(evaluator);
        int n4 = this.cost;
        this.cost = n3 = evaluator.cost() + n4;
    }

    public int cost() {
        return this.cost;
    }

    public boolean matches(Element element, Element element2) {
        if (element2 == element) {
            return false;
        }
        ArrayList arrayList = this.evaluators;
        int n3 = arrayList.size();
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0) {
            if (element2 == null) {
                return false;
            }
            Evaluator evaluator = (Evaluator)this.evaluators.get(n3);
            boolean bl2 = evaluator.matches(element, element2);
            if (!bl2) {
                return false;
            }
            element2 = element2.parent();
            n3 += -1;
        }
        return n4 != 0;
    }

    public String toString() {
        return StringUtil.join(this.evaluators, " > ");
    }
}

