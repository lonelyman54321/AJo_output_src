/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.select.Evaluator$IsNthOfType;

public final class Evaluator$IsFirstOfType
extends Evaluator$IsNthOfType {
    public Evaluator$IsFirstOfType() {
        super(0, 1);
    }

    public String toString() {
        return ":first-of-type";
    }
}

