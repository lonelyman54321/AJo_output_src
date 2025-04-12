/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.io.Serializable;
import java.util.IdentityHashMap;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

abstract class StructuralEvaluator
extends Evaluator {
    final Evaluator evaluator;
    final ThreadLocal threadMemo;

    public StructuralEvaluator(Evaluator evaluator) {
        Object object;
        this.threadMemo = object = ve3_1.a((we3_1)object);
        this.evaluator = evaluator;
    }

    public boolean memoMatches(Element element, Element element2) {
        Serializable serializable = (IdentityHashMap)this.threadMemo.get();
        IdentityHashMap<Element, Serializable> identityHashMap = (IdentityHashMap<Element, Serializable>)((IdentityHashMap)serializable).get(element);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap<Element, Serializable>();
            ((IdentityHashMap)serializable).put(element, identityHashMap);
        }
        if ((serializable = (Boolean)identityHashMap.get(element2)) == null) {
            boolean bl2 = this.evaluator.matches(element, element2);
            serializable = Boolean.valueOf(bl2);
            identityHashMap.put(element2, serializable);
        }
        return (Boolean)serializable;
    }

    public void reset() {
        ((IdentityHashMap)this.threadMemo.get()).clear();
        super.reset();
    }
}

