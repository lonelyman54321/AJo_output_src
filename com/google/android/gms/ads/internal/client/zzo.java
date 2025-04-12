/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import java.util.List;

public final class zzo
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        List list = RequestConfiguration.zza;
        int n3 = list.indexOf(object);
        int n4 = list.indexOf(object2);
        return n3 - n4;
    }
}

