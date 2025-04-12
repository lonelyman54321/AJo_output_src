/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public interface Person$Organizations
extends Freezable {
    public String getDepartment();

    public String getDescription();

    public String getEndDate();

    public String getLocation();

    public String getName();

    public String getStartDate();

    public String getTitle();

    public int getType();

    public boolean hasDepartment();

    public boolean hasDescription();

    public boolean hasEndDate();

    public boolean hasLocation();

    public boolean hasName();

    public boolean hasPrimary();

    public boolean hasStartDate();

    public boolean hasTitle();

    public boolean hasType();

    public boolean isPrimary();
}

