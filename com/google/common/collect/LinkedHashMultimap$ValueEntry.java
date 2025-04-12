/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.LinkedHashMultimap$ValueSetLink;
import java.util.Objects;

final class LinkedHashMultimap$ValueEntry
extends ImmutableEntry
implements LinkedHashMultimap$ValueSetLink {
    LinkedHashMultimap$ValueEntry nextInValueBucket;
    LinkedHashMultimap$ValueEntry predecessorInMultimap;
    LinkedHashMultimap$ValueSetLink predecessorInValueSet;
    final int smearedValueHash;
    LinkedHashMultimap$ValueEntry successorInMultimap;
    LinkedHashMultimap$ValueSetLink successorInValueSet;

    public LinkedHashMultimap$ValueEntry(Object object, Object object2, int n3, LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry) {
        super(object, object2);
        this.smearedValueHash = n3;
        this.nextInValueBucket = linkedHashMultimap$ValueEntry;
    }

    public static LinkedHashMultimap$ValueEntry newHeader() {
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = new LinkedHashMultimap$ValueEntry(null, null, 0, null);
        return linkedHashMultimap$ValueEntry;
    }

    public LinkedHashMultimap$ValueEntry getPredecessorInMultimap() {
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = this.predecessorInMultimap;
        Objects.requireNonNull(linkedHashMultimap$ValueEntry);
        return linkedHashMultimap$ValueEntry;
    }

    public LinkedHashMultimap$ValueSetLink getPredecessorInValueSet() {
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = this.predecessorInValueSet;
        Objects.requireNonNull(linkedHashMultimap$ValueSetLink);
        return linkedHashMultimap$ValueSetLink;
    }

    public LinkedHashMultimap$ValueEntry getSuccessorInMultimap() {
        LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry = this.successorInMultimap;
        Objects.requireNonNull(linkedHashMultimap$ValueEntry);
        return linkedHashMultimap$ValueEntry;
    }

    public LinkedHashMultimap$ValueSetLink getSuccessorInValueSet() {
        LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink = this.successorInValueSet;
        Objects.requireNonNull(linkedHashMultimap$ValueSetLink);
        return linkedHashMultimap$ValueSetLink;
    }

    public boolean matchesValue(Object object, int n3) {
        Object object2;
        boolean bl2;
        int n4 = this.smearedValueHash;
        if (n4 == n3 && (bl2 = com.google.common.base.Objects.equal(object2 = this.getValue(), object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public void setPredecessorInMultimap(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry) {
        this.predecessorInMultimap = linkedHashMultimap$ValueEntry;
    }

    public void setPredecessorInValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        this.predecessorInValueSet = linkedHashMultimap$ValueSetLink;
    }

    public void setSuccessorInMultimap(LinkedHashMultimap$ValueEntry linkedHashMultimap$ValueEntry) {
        this.successorInMultimap = linkedHashMultimap$ValueEntry;
    }

    public void setSuccessorInValueSet(LinkedHashMultimap$ValueSetLink linkedHashMultimap$ValueSetLink) {
        this.successorInValueSet = linkedHashMultimap$ValueSetLink;
    }
}

