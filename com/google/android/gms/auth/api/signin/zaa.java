/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class zaa
implements Comparator {
    public static final /* synthetic */ zaa zaa;

    static {
        zaa zaa2;
        zaa = zaa2 = new zaa();
    }

    private /* synthetic */ zaa() {
    }

    public final int compare(Object object, Object object2) {
        object = (Scope)object;
        object2 = (Scope)object2;
        object = ((Scope)object).getScopeUri();
        object2 = ((Scope)object2).getScopeUri();
        return ((String)object).compareTo((String)object2);
    }
}

