/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.escape.CharEscaper;
import com.google.common.escape.UnicodeEscaper;

class Escapers$2
extends UnicodeEscaper {
    final /* synthetic */ CharEscaper val$escaper;

    public Escapers$2(CharEscaper charEscaper) {
        this.val$escaper = charEscaper;
    }

    public char[] escape(int n3) {
        Object object = 65536;
        if (n3 < object) {
            CharEscaper charEscaper = this.val$escaper;
            n3 = (char)n3;
            return charEscaper.escape((char)n3);
        }
        object = 2;
        char[] cArray = new char[object];
        int n4 = 0;
        Character.toChars(n3, cArray, 0);
        Object object2 = this.val$escaper;
        char c2 = cArray[0];
        object2 = ((CharEscaper)object2).escape(c2);
        Object object3 = this.val$escaper;
        int n7 = 1;
        int n8 = cArray[n7];
        object3 = ((CharEscaper)object3).escape((char)n8);
        if (object2 == null && object3 == null) {
            return null;
        }
        n8 = object2 != null ? ((Object)object2).length : 1;
        int n10 = object3 != null ? ((Object)object3).length : 1;
        char[] cArray2 = new char[n10 += n8];
        if (object2 != null) {
            Object object4;
            for (int i3 = 0; i3 < (object4 = ((Object)object2).length); ++i3) {
                cArray2[i3] = object4 = (Object)object2[i3];
            }
        } else {
            cArray2[0] = n3 = cArray[0];
        }
        if (object3 != null) {
            while (n4 < (n3 = ((Object)object3).length)) {
                n3 = n8 + n4;
                cArray2[n3] = object = (Object)object3[n4];
                ++n4;
            }
        } else {
            cArray2[n8] = n3 = cArray[n7];
        }
        return cArray2;
    }
}

