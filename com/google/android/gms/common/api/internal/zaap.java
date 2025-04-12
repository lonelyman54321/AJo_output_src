/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.internal.zaav;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Set;

final class zaap
extends zaav {
    final /* synthetic */ zaaw zaa;
    private final ArrayList zac;

    public zaap(zaaw zaaw2, ArrayList arrayList) {
        this.zaa = zaaw2;
        super(zaaw2, null);
        this.zac = arrayList;
    }

    public final void zaa() {
        Object object = this.zaa;
        zabe zabe2 = zaaw.zak((zaaw)object).zag;
        zabe2.zad = object = zaaw.zao((zaaw)object);
        object = this.zac;
        int n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Api$Client api$Client = (Api$Client)object.get(i3);
            Object object2 = this.zaa;
            IAccountAccessor iAccountAccessor = zaaw.zam((zaaw)object2);
            object2 = zaaw.zak((zaaw)object2).zag.zad;
            api$Client.getRemoteService(iAccountAccessor, (Set)object2);
        }
    }
}

