/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

import org.jsoup.select.Evaluator$IsNthLastOfType;

public final class Evaluator$IsLastOfType
extends Evaluator$IsNthLastOfType {
    public Evaluator$IsLastOfType() {
        super(0, 1);
    }

    public String toString() {
        return ":last-of-type";
    }
}

