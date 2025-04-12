/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;

public class Collector {
    private Collector() {
    }

    public static Elements collect(Evaluator object, Element object2) {
        ((Evaluator)object).reset();
        Stream stream = ((Element)object2).stream();
        object = ((Evaluator)object).asPredicate((Element)object2);
        object = ix_1.a(stream, (Predicate)object);
        object2 = new Object();
        object2 = lx_2.a((nx_2)object2);
        return (Elements)mx_2.a((Stream)object, (java.util.stream.Collector)object2);
    }

    public static Element findFirst(Evaluator object, Element element) {
        ((Evaluator)object).reset();
        Stream stream = element.stream();
        object = ((Evaluator)object).asPredicate(element);
        return (Element)kx_1.c(jx_0.a(ix_1.a(stream, (Predicate)object)));
    }
}

