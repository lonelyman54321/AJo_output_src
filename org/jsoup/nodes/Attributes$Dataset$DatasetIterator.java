/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.Iterator;
import java.util.Map;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attributes$1;
import org.jsoup.nodes.Attributes$Dataset;

class Attributes$Dataset$DatasetIterator
implements Iterator {
    private Attribute attr;
    private Iterator attrIter;
    final /* synthetic */ Attributes$Dataset this$0;

    private Attributes$Dataset$DatasetIterator(Attributes$Dataset object) {
        this.this$0 = object;
        this.attrIter = object = Attributes$Dataset.access$600((Attributes$Dataset)object).iterator();
    }

    public /* synthetic */ Attributes$Dataset$DatasetIterator(Attributes$Dataset dataset, Attributes$1 attributes$1) {
        this(dataset);
    }

    public boolean hasNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.attrIter).hasNext()) {
            this.attr = object = (Attribute)this.attrIter.next();
            bl2 = ((Attribute)object).isDataAttribute();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public Map.Entry next() {
        String string2 = ((String)this.attr.getKey()).substring(5);
        Object object = this.attr.getValue();
        Attribute attribute = new Attribute(string2, (String)object);
        return attribute;
    }

    public void remove() {
        Attributes attributes = Attributes$Dataset.access$600(this.this$0);
        Object object = this.attr.getKey();
        attributes.remove((String)object);
    }
}

