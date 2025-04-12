/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzaru
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (byte[])object;
        object2 = (byte[])object2;
        int n3 = ((Object)object).length;
        int n4 = ((Object)object2).length;
        return n3 - n4;
    }
}

