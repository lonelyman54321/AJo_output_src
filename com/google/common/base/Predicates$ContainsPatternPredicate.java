/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CommonPattern;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;

class Predicates$ContainsPatternPredicate
implements Predicate,
Serializable {
    private static final long serialVersionUID;
    final CommonPattern pattern;

    public Predicates$ContainsPatternPredicate(CommonPattern commonPattern) {
        this.pattern = commonPattern = (CommonPattern)Preconditions.checkNotNull(commonPattern);
    }

    public boolean apply(CharSequence charSequence) {
        return this.pattern.matcher(charSequence).find();
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Predicates$ContainsPatternPredicate;
        boolean bl2 = false;
        if (n3 != 0) {
            int n4;
            String string2;
            object = (Predicates$ContainsPatternPredicate)object;
            Object object2 = this.pattern.pattern();
            n3 = Objects.equal(object2, string2 = ((Predicates$ContainsPatternPredicate)object).pattern.pattern());
            if (n3 != 0 && (n3 = ((CommonPattern)(object2 = this.pattern)).flags()) == (n4 = ((CommonPattern)(object = ((Predicates$ContainsPatternPredicate)object).pattern)).flags())) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        String string2 = this.pattern.pattern();
        Integer n3 = this.pattern.flags();
        Object[] objectArray = new Object[]{string2, n3};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        Object object = MoreObjects.toStringHelper(this.pattern);
        String string2 = this.pattern.pattern();
        object = ((MoreObjects$ToStringHelper)object).add("pattern", string2);
        int n3 = this.pattern.flags();
        object = ((MoreObjects$ToStringHelper)object).add("pattern.flags", n3).toString();
        return cP.a("Predicates.contains(", (String)object, ")");
    }
}

