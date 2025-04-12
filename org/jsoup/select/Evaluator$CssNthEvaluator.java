/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

public abstract class Evaluator$CssNthEvaluator
extends Evaluator {
    protected final int a;
    protected final int b;

    public Evaluator$CssNthEvaluator(int n3) {
        this(0, n3);
    }

    public Evaluator$CssNthEvaluator(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public abstract int calculatePosition(Element var1, Element var2);

    public abstract String getPseudoClass();

    public boolean matches(Element element, Element element2) {
        boolean bl2;
        Element element3 = element2.parent();
        boolean bl3 = false;
        if (element3 != null && !(bl2 = element3 instanceof Document)) {
            int n3 = this.calculatePosition(element, element2);
            int n4 = this.a;
            bl2 = true;
            if (n4 == 0) {
                n4 = this.b;
                if (n3 == n4) {
                    bl3 = true;
                }
                return bl3;
            }
            int n7 = this.b;
            int n8 = (n3 - n7) * n4;
            if (n8 >= 0 && (n3 = (n3 - n7) % n4) == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public String toString() {
        int n3 = 1;
        int n4 = 2;
        int n7 = this.a;
        if (n7 == 0) {
            String string2 = this.getPseudoClass();
            Integer n8 = this.b;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = n8;
            return String.format(":%s(%d)", objectArray);
        }
        n7 = this.b;
        if (n7 == 0) {
            String string3 = this.getPseudoClass();
            Integer n10 = this.a;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string3;
            objectArray[n3] = n10;
            return String.format(":%s(%dn)", objectArray);
        }
        String string4 = this.getPseudoClass();
        Integer n14 = this.a;
        Integer n15 = this.b;
        Object[] objectArray = new Object[3];
        objectArray[0] = string4;
        objectArray[n3] = n14;
        objectArray[n4] = n15;
        return String.format(":%s(%dn%+d)", objectArray);
    }
}

