/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.jsoup.select.Evaluator;

public abstract class CombiningEvaluator
extends Evaluator {
    private static final Comparator costComparator;
    int cost = 0;
    final ArrayList evaluators;
    int num = 0;
    final ArrayList sortedEvaluators;

    static {
        yz_2 yz_22 = new Object();
        costComparator = yz_22;
    }

    public CombiningEvaluator() {
        ArrayList arrayList;
        this.evaluators = arrayList = new ArrayList();
        this.sortedEvaluators = arrayList = new ArrayList();
    }

    public CombiningEvaluator(Collection collection) {
        this();
        this.evaluators.addAll(collection);
        this.updateEvaluators();
    }

    public static /* synthetic */ int b(Evaluator evaluator, Evaluator evaluator2) {
        return CombiningEvaluator.lambda$static$0(evaluator, evaluator2);
    }

    private static /* synthetic */ int lambda$static$0(Evaluator evaluator, Evaluator evaluator2) {
        int n3 = evaluator.cost();
        int n4 = evaluator2.cost();
        return n3 - n4;
    }

    public int cost() {
        return this.cost;
    }

    public void replaceRightMostEvaluator(Evaluator evaluator) {
        ArrayList arrayList = this.evaluators;
        int n3 = this.num + -1;
        arrayList.set(n3, evaluator);
        this.updateEvaluators();
    }

    public void reset() {
        boolean bl2;
        Iterator iterator = this.evaluators.iterator();
        while (bl2 = iterator.hasNext()) {
            Evaluator evaluator = (Evaluator)iterator.next();
            evaluator.reset();
        }
        super.reset();
    }

    public Evaluator rightMostEvaluator() {
        Evaluator evaluator;
        int n3 = this.num;
        if (n3 > 0) {
            ArrayList arrayList = this.evaluators;
            evaluator = (Evaluator)arrayList.get(n3 += -1);
        } else {
            n3 = 0;
            evaluator = null;
        }
        return evaluator;
    }

    public void updateEvaluators() {
        Object object;
        int n3;
        int n4;
        this.num = n4 = this.evaluators.size();
        n4 = 0;
        this.cost = 0;
        Object object2 = this.evaluators.iterator();
        while ((n3 = object2.hasNext()) != 0) {
            object = (Evaluator)object2.next();
            int n7 = this.cost;
            this.cost = n3 = ((Evaluator)object).cost() + n7;
        }
        this.sortedEvaluators.clear();
        object2 = this.sortedEvaluators;
        object = this.evaluators;
        ((ArrayList)object2).addAll(object);
        object2 = this.sortedEvaluators;
        object = costComparator;
        Collections.sort(object2, object);
    }
}

