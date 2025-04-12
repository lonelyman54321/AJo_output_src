/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.plus.Plus$PlusOptions;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder {
    String zzg;
    final Set zzh;

    public Plus$PlusOptions$Builder() {
        HashSet hashSet;
        this.zzh = hashSet = new HashSet();
    }

    public final Plus$PlusOptions$Builder addActivityTypes(String ... stringArray) {
        int n3;
        Preconditions.checkNotNull(stringArray, "activityTypes may not be null.");
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            Set set = this.zzh;
            String string2 = stringArray[i3];
            set.add(string2);
        }
        return this;
    }

    public final Plus$PlusOptions build() {
        Plus$PlusOptions plus$PlusOptions = new Plus$PlusOptions(this, null);
        return plus$PlusOptions;
    }

    public final Plus$PlusOptions$Builder setServerClientId(String string2) {
        this.zzg = string2;
        return this;
    }
}

