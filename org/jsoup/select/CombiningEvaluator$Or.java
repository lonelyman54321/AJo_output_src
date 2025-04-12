/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.CombiningEvaluator$And;
import org.jsoup.select.Evaluator;

public final class CombiningEvaluator$Or
extends CombiningEvaluator {
    public CombiningEvaluator$Or() {
    }

    public CombiningEvaluator$Or(Collection collection) {
        int n3 = this.num;
        int n4 = 1;
        if (n3 > n4) {
            ArrayList arrayList = this.evaluators;
            CombiningEvaluator$And combiningEvaluator$And = new CombiningEvaluator$And(collection);
            arrayList.add(combiningEvaluator$And);
        } else {
            ArrayList arrayList = this.evaluators;
            arrayList.addAll(collection);
        }
        this.updateEvaluators();
    }

    public CombiningEvaluator$Or(Evaluator ... object) {
        object = Arrays.asList(object);
        this((Collection)object);
    }

    public void add(Evaluator evaluator) {
        this.evaluators.add(evaluator);
        this.updateEvaluators();
    }

    public boolean matches(Element element, Element element2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.num); ++i3) {
            Evaluator evaluator = (Evaluator)this.sortedEvaluators.get(i3);
            n3 = (int)(evaluator.matches(element, element2) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        return StringUtil.join(this.evaluators, ", ");
    }
}

