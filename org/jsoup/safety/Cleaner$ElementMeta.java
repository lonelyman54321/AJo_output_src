/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.safety;

import org.jsoup.nodes.Element;

class Cleaner$ElementMeta {
    Element el;
    int numAttribsDiscarded;

    public Cleaner$ElementMeta(Element element, int n3) {
        this.el = element;
        this.numAttribsDiscarded = n3;
    }
}

