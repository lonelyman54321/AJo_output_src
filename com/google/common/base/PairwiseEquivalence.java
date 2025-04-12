/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import java.io.Serializable;

final class PairwiseEquivalence
extends Equivalence
implements Serializable {
    private static final long serialVersionUID = 1L;
    final Equivalence elementEquivalence;

    public PairwiseEquivalence(Equivalence equivalence) {
        this.elementEquivalence = equivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
    }

    public boolean doEquivalent(Iterable object, Iterable object2) {
        boolean bl2;
        block2: {
            Object e2;
            Object e5;
            Equivalence equivalence;
            boolean bl3;
            object = object.iterator();
            object2 = object2.iterator();
            do {
                bl3 = object.hasNext();
                bl2 = false;
                if (!bl3 || !(bl3 = object2.hasNext())) break block2;
            } while (bl3 = (equivalence = this.elementEquivalence).equivalent(e5 = object.next(), e2 = object2.next()));
            return false;
        }
        boolean bl4 = object.hasNext();
        if (!bl4 && !(bl4 = object2.hasNext())) {
            bl2 = true;
        }
        return bl2;
    }

    public int doHash(Iterable object) {
        int n3;
        object = object.iterator();
        int n4 = 78721;
        while ((n3 = object.hasNext()) != 0) {
            Object e2 = object.next();
            n4 *= 24943;
            Equivalence equivalence = this.elementEquivalence;
            n3 = equivalence.hash(e2);
            n4 += n3;
        }
        return n4;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof PairwiseEquivalence;
        if (bl2) {
            object = (PairwiseEquivalence)object;
            Equivalence equivalence = this.elementEquivalence;
            object = ((PairwiseEquivalence)object).elementEquivalence;
            return equivalence.equals(object);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 0x46A3EB07;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Equivalence equivalence = this.elementEquivalence;
        stringBuilder.append(equivalence);
        stringBuilder.append(".pairwise()");
        return stringBuilder.toString();
    }
}

