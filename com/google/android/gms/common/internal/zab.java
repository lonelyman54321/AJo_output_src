/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;

public final class zab {
    public final Set zaa;

    public zab(Set set) {
        Preconditions.checkNotNull(set);
        this.zaa = set = Collections.unmodifiableSet(set);
    }
}

