/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.AbstractSet;
import java.util.Iterator;
import org.jsoup.nodes.Attributes$1;
import org.jsoup.nodes.Attributes$Dataset;
import org.jsoup.nodes.Attributes$Dataset$DatasetIterator;

class Attributes$Dataset$EntrySet
extends AbstractSet {
    final /* synthetic */ Attributes$Dataset this$0;

    private Attributes$Dataset$EntrySet(Attributes$Dataset attributes$Dataset) {
        this.this$0 = attributes$Dataset;
    }

    public /* synthetic */ Attributes$Dataset$EntrySet(Attributes$Dataset attributes$Dataset, Attributes$1 attributes$1) {
        this(attributes$Dataset);
    }

    public Iterator iterator() {
        Attributes$Dataset attributes$Dataset = this.this$0;
        Attributes$Dataset$DatasetIterator attributes$Dataset$DatasetIterator = new Attributes$Dataset$DatasetIterator(attributes$Dataset, null);
        return attributes$Dataset$DatasetIterator;
    }

    public int size() {
        Attributes$Dataset attributes$Dataset = this.this$0;
        boolean bl2 = false;
        Attributes$Dataset$DatasetIterator attributes$Dataset$DatasetIterator = new Attributes$Dataset$DatasetIterator(attributes$Dataset, null);
        int n3 = 0;
        attributes$Dataset = null;
        while (bl2 = attributes$Dataset$DatasetIterator.hasNext()) {
            ++n3;
        }
        return n3;
    }
}

