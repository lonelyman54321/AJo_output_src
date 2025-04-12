/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Comparator;

public final class zab
implements Comparator {
    public static final /* synthetic */ zab zaa;

    static {
        zab zab2;
        zaa = zab2 = new zab();
    }

    private /* synthetic */ zab() {
    }

    public final int compare(Object object, Object object2) {
        int n3;
        String string2;
        object = (Feature)object;
        object2 = (Feature)object2;
        Object object3 = ApiFeatureRequest.CREATOR;
        object3 = ((Feature)object).getName();
        boolean bl2 = ((String)object3).equals(string2 = ((Feature)object2).getName());
        if (!bl2) {
            object = ((Feature)object).getName();
            object2 = ((Feature)object2).getName();
            n3 = ((String)object).compareTo((String)object2);
        } else {
            long l2 = ((Feature)object).getVersion();
            long l3 = ((Feature)object2).getVersion();
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        }
        return n3;
    }
}

