/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public final class ScopeUtil {
    private ScopeUtil() {
    }

    public static String[] toScopeString(Set scopeArray) {
        int n3;
        String[] stringArray = "scopes can't be null.";
        Preconditions.checkNotNull(scopeArray, stringArray);
        Scope[] scopeArray2 = new Scope[scopeArray.size()];
        scopeArray = scopeArray.toArray(scopeArray2);
        Preconditions.checkNotNull(scopeArray, stringArray);
        int n4 = scopeArray.length;
        stringArray = new String[n4];
        scopeArray2 = null;
        for (int i3 = 0; i3 < (n3 = scopeArray.length); ++i3) {
            String string2;
            stringArray[i3] = string2 = scopeArray[i3].getScopeUri();
        }
        return stringArray;
    }
}

