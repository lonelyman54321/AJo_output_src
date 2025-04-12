/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

class Attributes$1
implements Iterator {
    int expectedSize;
    int i;
    final /* synthetic */ Attributes this$0;

    public Attributes$1(Attributes attributes) {
        int n3;
        this.this$0 = attributes;
        this.expectedSize = n3 = Attributes.access$000(attributes);
        this.i = 0;
    }

    private void checkModified() {
        int n3;
        Object object = this.this$0;
        int n4 = Attributes.access$000((Attributes)object);
        if (n4 == (n3 = this.expectedSize)) {
            return;
        }
        object = new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        throw object;
    }

    public boolean hasNext() {
        int n3;
        int n4;
        Attributes attributes;
        int n7;
        this.checkModified();
        while (true) {
            n7 = this.i;
            attributes = this.this$0;
            n4 = Attributes.access$000(attributes);
            n3 = 1;
            if (n7 >= n4) break;
            Object object = this.this$0.keys;
            n4 = this.i;
            n7 = (int)(Attributes.isInternalKey((String)(object = object[n4])) ? 1 : 0);
            if (n7 == 0) break;
            this.i = n7 = this.i + n3;
        }
        if ((n7 = this.i) >= (n4 = Attributes.access$000(attributes = this.this$0))) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public Attribute next() {
        this.checkModified();
        int n3 = this.i;
        Attributes attributes = this.this$0;
        int n4 = Attributes.access$000(attributes);
        if (n3 < n4) {
            attributes = this.this$0;
            Object object = attributes.keys;
            int n7 = this.i;
            object = object[n7];
            String string2 = (String)attributes.vals[n7];
            Attribute attribute = new Attribute((String)object, string2, attributes);
            this.i = n4 = this.i + 1;
            return attribute;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        int n3;
        int n4;
        Attributes attributes = this.this$0;
        this.i = n4 = this.i + -1;
        Attributes.access$100(attributes, n4);
        this.expectedSize = n3 = this.expectedSize + -1;
    }
}

