/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import java.util.AbstractCollection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public final class Evaluator$IsOnlyChild
extends Evaluator {
    public boolean matches(Element cloneable, Element element) {
        boolean bl2;
        cloneable = element.parent();
        if (cloneable != null && !(bl2 = cloneable instanceof Document) && (bl2 = ((AbstractCollection)((Object)(cloneable = element.siblingElements()))).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            cloneable = null;
        }
        return bl2;
    }

    public String toString() {
        return ":only-child";
    }
}

