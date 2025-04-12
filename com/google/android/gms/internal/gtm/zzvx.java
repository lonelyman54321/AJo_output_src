/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.util.Comparator;
import java.util.Map;

final class zzvx
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (String)((Map.Entry)object).getKey();
        object2 = (String)((Map.Entry)object2).getKey();
        return ((String)object).compareTo((String)object2);
    }
}

