/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface Person$Urls
extends Freezable {
    public String getLabel();

    public int getType();

    public String getValue();

    public boolean hasLabel();

    public boolean hasType();

    public boolean hasValue();
}

