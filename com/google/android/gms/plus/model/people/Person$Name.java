/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface Person$Name
extends Freezable {
    public String getFamilyName();

    public String getFormatted();

    public String getGivenName();

    public String getHonorificPrefix();

    public String getHonorificSuffix();

    public String getMiddleName();

    public boolean hasFamilyName();

    public boolean hasFormatted();

    public boolean hasGivenName();

    public boolean hasHonorificPrefix();

    public boolean hasHonorificSuffix();

    public boolean hasMiddleName();
}

