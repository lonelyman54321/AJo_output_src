/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.plus;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.internal.plus.zzr$zzc;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person$AgeRange;
import com.google.android.gms.plus.model.people.Person$Cover;
import com.google.android.gms.plus.model.people.Person$Image;
import com.google.android.gms.plus.model.people.Person$Name;

public final class zzac
extends DataBufferRef
implements Person {
    public zzac(DataHolder dataHolder, int n3) {
        super(dataHolder, n3);
    }

    public final /* synthetic */ Object freeze() {
        zzr zzr2;
        Freezable freezable;
        String string2 = this.getDisplayName();
        String string3 = this.getId();
        Person$Image person$Image = freezable = this.getImage();
        person$Image = (zzr$zzc)freezable;
        int n3 = this.getObjectType();
        String string4 = this.getUrl();
        freezable = zzr2;
        zzr2 = new zzr(string2, string3, (zzr$zzc)person$Image, n3, string4);
        return zzr2;
    }

    public final String getAboutMe() {
        return null;
    }

    public final Person$AgeRange getAgeRange() {
        return null;
    }

    public final String getBirthday() {
        return null;
    }

    public final String getBraggingRights() {
        return null;
    }

    public final int getCircledByCount() {
        return 0;
    }

    public final Person$Cover getCover() {
        return null;
    }

    public final String getCurrentLocation() {
        return null;
    }

    public final String getDisplayName() {
        return this.getString("displayName");
    }

    public final int getGender() {
        return 0;
    }

    public final String getId() {
        return this.getString("personId");
    }

    public final Person$Image getImage() {
        String string2 = this.getString("image");
        zzr$zzc zzr$zzc = new zzr$zzc(string2);
        return zzr$zzc;
    }

    public final String getLanguage() {
        return null;
    }

    public final Person$Name getName() {
        return null;
    }

    public final String getNickname() {
        return null;
    }

    public final int getObjectType() {
        Object object;
        String string2 = this.getString("objectType");
        boolean bl2 = string2.equals(object = "person");
        if (bl2) {
            return 0;
        }
        object = "page";
        bl2 = string2.equals(object);
        if (bl2) {
            return 1;
        }
        int n3 = string2.length();
        String string3 = "Unknown objectType string: ";
        string2 = n3 != 0 ? string3.concat(string2) : new String(string3);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final int getPlusOneCount() {
        return 0;
    }

    public final int getRelationshipStatus() {
        return 0;
    }

    public final String getTagline() {
        return null;
    }

    public final String getUrl() {
        return this.getString("url");
    }

    public final boolean hasAboutMe() {
        return false;
    }

    public final boolean hasAgeRange() {
        return false;
    }

    public final boolean hasBirthday() {
        return false;
    }

    public final boolean hasBraggingRights() {
        return false;
    }

    public final boolean hasCircledByCount() {
        return false;
    }

    public final boolean hasCover() {
        return false;
    }

    public final boolean hasCurrentLocation() {
        return false;
    }

    public final boolean hasDisplayName() {
        return true;
    }

    public final boolean hasGender() {
        return false;
    }

    public final boolean hasId() {
        return true;
    }

    public final boolean hasImage() {
        return true;
    }

    public final boolean hasIsPlusUser() {
        return false;
    }

    public final boolean hasLanguage() {
        return false;
    }

    public final boolean hasName() {
        return false;
    }

    public final boolean hasNickname() {
        return false;
    }

    public final boolean hasObjectType() {
        return true;
    }

    public final boolean hasOrganizations() {
        return false;
    }

    public final boolean hasPlacesLived() {
        return false;
    }

    public final boolean hasPlusOneCount() {
        return false;
    }

    public final boolean hasRelationshipStatus() {
        return false;
    }

    public final boolean hasTagline() {
        return false;
    }

    public final boolean hasUrl() {
        return true;
    }

    public final boolean hasUrls() {
        return false;
    }

    public final boolean hasVerified() {
        return false;
    }

    public final boolean isPlusUser() {
        return false;
    }

    public final boolean isVerified() {
        return false;
    }
}

