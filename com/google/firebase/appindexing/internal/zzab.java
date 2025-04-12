/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import java.util.Comparator;

final class zzab
implements Comparator {
    static final Comparator zza;

    static {
        zzab zzab2 = new zzab();
        zza = zzab2;
    }

    private zzab() {
    }

    public final int compare(Object object, Object object2) {
        block5: {
            int n3;
            block4: {
                block2: {
                    block3: {
                        object = (String)object;
                        object2 = (String)object2;
                        if (object != null) break block2;
                        if (object2 == null) break block3;
                        n3 = -1;
                        break block4;
                    }
                    return 0;
                }
                if (object2 != null) break block5;
                n3 = 1;
            }
            return n3;
        }
        return ((String)object).compareTo((String)object2);
    }
}

