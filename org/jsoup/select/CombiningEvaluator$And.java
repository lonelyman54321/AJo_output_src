/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.Arrays;
import java.util.Collection;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;

public final class CombiningEvaluator$And
extends CombiningEvaluator {
    public CombiningEvaluator$And(Collection collection) {
        super(collection);
    }

    public CombiningEvaluator$And(Evaluator ... object) {
        object = Arrays.asList(object);
        this((Collection)object);
    }

    public boolean matches(Element element, Element element2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.num); ++i3) {
            Evaluator evaluator = (Evaluator)this.sortedEvaluators.get(i3);
            n3 = (int)(evaluator.matches(element, element2) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return StringUtil.join(this.evaluators, "");
    }
}

