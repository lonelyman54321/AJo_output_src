/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Predicates$ObjectPredicate;

final class Predicates$ObjectPredicate$3
extends Predicates$ObjectPredicate {
    public boolean apply(Object object) {
        boolean bl2;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public String toString() {
        return "Predicates.isNull()";
    }
}

