/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.AbstractMap;
import java.util.Set;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attributes$1;
import org.jsoup.nodes.Attributes$Dataset$EntrySet;

class Attributes$Dataset
extends AbstractMap {
    private final Attributes attributes;

    private Attributes$Dataset(Attributes attributes) {
        this.attributes = attributes;
    }

    public /* synthetic */ Attributes$Dataset(Attributes attributes, Attributes$1 attributes$1) {
        this(attributes);
    }

    public static /* synthetic */ Attributes access$600(Attributes$Dataset attributes$Dataset) {
        return attributes$Dataset.attributes;
    }

    public Set entrySet() {
        Attributes$Dataset$EntrySet attributes$Dataset$EntrySet = new Attributes$Dataset$EntrySet(this, null);
        return attributes$Dataset$EntrySet;
    }

    public String put(String string2, String string3) {
        Object object = this.attributes;
        boolean bl2 = ((Attributes)object).hasKey(string2 = Attributes.access$400(string2));
        if (bl2) {
            object = this.attributes.get(string2);
        } else {
            bl2 = false;
            object = null;
        }
        this.attributes.put(string2, string3);
        return object;
    }
}

