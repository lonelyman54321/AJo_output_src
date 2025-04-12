/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzyb
implements Comparator {
    public final int compare(Object object, Object object2) {
        block5: {
            int n3;
            block4: {
                int n4;
                int n7;
                block2: {
                    block3: {
                        object = (Integer)object;
                        object2 = (Integer)object2;
                        n7 = (Integer)object;
                        if (n7 != (n4 = -1)) break block2;
                        n3 = (Integer)object2;
                        if (n3 != n4) break block3;
                        n3 = 0;
                        object = null;
                        break block4;
                    }
                    return n4;
                }
                n7 = (Integer)object2;
                if (n7 != n4) break block5;
                n3 = 1;
            }
            return n3;
        }
        int n8 = (Integer)object;
        int n10 = (Integer)object2;
        return n8 - n10;
    }
}

