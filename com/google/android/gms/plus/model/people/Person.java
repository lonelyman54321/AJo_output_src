/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.plus.model.people.Person$AgeRange;
import com.google.android.gms.plus.model.people.Person$Cover;
import com.google.android.gms.plus.model.people.Person$Image;
import com.google.android.gms.plus.model.people.Person$Name;
import java.util.List;

public interface Person
extends Freezable {
    public String getAboutMe();

    public Person$AgeRange getAgeRange();

    public String getBirthday();

    public String getBraggingRights();

    public int getCircledByCount();

    public Person$Cover getCover();

    public String getCurrentLocation();

    public String getDisplayName();

    public int getGender();

    public String getId();

    public Person$Image getImage();

    public String getLanguage();

    public Person$Name getName();

    public String getNickname();

    public int getObjectType();

    public List getOrganizations();

    public List getPlacesLived();

    public int getPlusOneCount();

    public int getRelationshipStatus();

    public String getTagline();

    public String getUrl();

    public List getUrls();

    public boolean hasAboutMe();

    public boolean hasAgeRange();

    public boolean hasBirthday();

    public boolean hasBraggingRights();

    public boolean hasCircledByCount();

    public boolean hasCover();

    public boolean hasCurrentLocation();

    public boolean hasDisplayName();

    public boolean hasGender();

    public boolean hasId();

    public boolean hasImage();

    public boolean hasIsPlusUser();

    public boolean hasLanguage();

    public boolean hasName();

    public boolean hasNickname();

    public boolean hasObjectType();

    public boolean hasOrganizations();

    public boolean hasPlacesLived();

    public boolean hasPlusOneCount();

    public boolean hasRelationshipStatus();

    public boolean hasTagline();

    public boolean hasUrl();

    public boolean hasUrls();

    public boolean hasVerified();

    public boolean isPlusUser();

    public boolean isVerified();
}

