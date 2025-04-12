/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import java.util.Arrays;

class CharMatcher$RangesMatcher
extends CharMatcher {
    private final String description;
    private final char[] rangeEnds;
    private final char[] rangeStarts;

    public CharMatcher$RangesMatcher(String string2, char[] cArray, char[] cArray2) {
        this.description = string2;
        this.rangeStarts = cArray;
        this.rangeEnds = cArray2;
        int n3 = cArray.length;
        int n4 = cArray2.length;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        Preconditions.checkArgument(n3 != 0);
        n3 = 0;
        string2 = null;
        while (n3 < (n4 = cArray.length)) {
            n4 = cArray[n3];
            int n7 = cArray2[n3];
            n4 = n4 <= n7 ? 1 : 0;
            Preconditions.checkArgument(n4 != 0);
            n4 = n3 + 1;
            n7 = cArray.length;
            if (n4 < n7) {
                n7 = cArray[n4];
                if ((n3 = cArray2[n3]) < n7) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    string2 = null;
                }
                Preconditions.checkArgument(n3 != 0);
            }
            n3 = n4;
        }
    }

    public boolean matches(char c2) {
        char[] cArray;
        char[] cArray2 = this.rangeStarts;
        int n3 = Arrays.binarySearch(cArray2, c2);
        int n4 = 1;
        if (n3 >= 0) {
            return n4 != 0;
        }
        if ((n3 = ~n3 - n4) < 0 || c2 > (n3 = (cArray = this.rangeEnds)[n3])) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public String toString() {
        return this.description;
    }
}

