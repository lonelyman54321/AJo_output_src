/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.select.Evaluator;

public abstract class Evaluator$AttributeKeyPair
extends Evaluator {
    final String key;
    final String value;

    public Evaluator$AttributeKeyPair(String string2, String string3) {
        this(string2, string3, true);
    }

    public Evaluator$AttributeKeyPair(String string2, String string3, boolean bl2) {
        boolean bl3;
        Validate.notEmpty(string2);
        Validate.notEmpty(string3);
        this.key = string2 = Normalizer.normalize(string2);
        string2 = "'";
        int n3 = string3.startsWith(string2);
        int n4 = 1;
        if (n3 != 0 && (bl3 = string3.endsWith(string2)) || (n3 = string3.startsWith(string2 = "\"")) != 0 && (bl3 = string3.endsWith(string2))) {
            bl3 = true;
        } else {
            bl3 = false;
            string2 = null;
        }
        if (bl3) {
            n3 = string3.length() - n4;
            string3 = string3.substring(n4, n3);
        }
        string2 = bl2 ? Normalizer.normalize(string3) : Normalizer.normalize(string3, bl3);
        this.value = string2;
    }
}

