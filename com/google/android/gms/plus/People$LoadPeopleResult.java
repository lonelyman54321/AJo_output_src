/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.people.PersonBuffer;

public interface People$LoadPeopleResult
extends Releasable,
Result {
    public String getNextPageToken();

    public PersonBuffer getPersonBuffer();
}

