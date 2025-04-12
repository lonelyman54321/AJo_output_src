/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

final class QuantizerWsmeans$Distance
implements Comparable {
    double distance = -1.0;
    int index = -1;

    public int compareTo(QuantizerWsmeans$Distance comparable) {
        Double d2 = this.distance;
        comparable = Double.valueOf(comparable.distance);
        return d2.compareTo((Double)comparable);
    }
}

