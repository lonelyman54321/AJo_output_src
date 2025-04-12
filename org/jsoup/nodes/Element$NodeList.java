/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.nodes.Element;

final class Element$NodeList
extends ChangeNotifyingArrayList {
    private final Element owner;

    public Element$NodeList(Element element, int n3) {
        super(n3);
        this.owner = element;
    }

    public void onContentsChanged() {
        this.owner.nodelistChanged();
    }
}

