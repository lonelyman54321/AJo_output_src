/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public interface MediationAdRequest {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = 255;

    public Date getBirthday();

    public int getGender();

    public Set getKeywords();

    public Location getLocation();

    public boolean isDesignedForFamilies();

    public boolean isTesting();

    public int taggedForChildDirectedTreatment();
}

