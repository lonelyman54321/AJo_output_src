/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public interface People {
    public Person getCurrentPerson(GoogleApiClient var1);

    public PendingResult load(GoogleApiClient var1, Collection var2);

    public PendingResult load(GoogleApiClient var1, String ... var2);

    public PendingResult loadConnected(GoogleApiClient var1);

    public PendingResult loadVisible(GoogleApiClient var1, int var2, String var3);

    public PendingResult loadVisible(GoogleApiClient var1, String var2);
}

