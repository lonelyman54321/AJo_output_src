/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.phenotype;

import com.google.android.gms.phenotype.zzi;
import java.util.Comparator;

final class zzj
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (zzi)object;
        object2 = (zzi)object2;
        int n3 = ((zzi)object).zzah;
        int n4 = ((zzi)object2).zzah;
        if (n3 == n4) {
            object = ((zzi)object).name;
            object2 = ((zzi)object2).name;
            return ((String)object).compareTo((String)object2);
        }
        return n3 - n4;
    }
}

