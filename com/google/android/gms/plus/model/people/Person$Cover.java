/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.plus.model.people.Person$Cover$CoverInfo;
import com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto;

public interface Person$Cover
extends Freezable {
    public Person$Cover$CoverInfo getCoverInfo();

    public Person$Cover$CoverPhoto getCoverPhoto();

    public int getLayout();

    public boolean hasCoverInfo();

    public boolean hasCoverPhoto();

    public boolean hasLayout();
}

