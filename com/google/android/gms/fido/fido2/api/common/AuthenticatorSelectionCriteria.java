/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzax;
import com.google.android.gms.fido.fido2.api.common.zzay;
import com.google.android.gms.fido.fido2.api.common.zzm;

public class AuthenticatorSelectionCriteria
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final Attachment zza;
    private final Boolean zzb;
    private final zzay zzc;
    private final ResidentKeyRequirement zzd;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    /*
     * WARNING - void declaration
     */
    public AuthenticatorSelectionCriteria(String object, Boolean serializable, String string2, String string3) {
        void var1_5;
        ResidentKeyRequirement residentKeyRequirement;
        block14: {
            block13: {
                block12: {
                    residentKeyRequirement = null;
                    if (object == null) {
                        object = null;
                    } else {
                        object = Attachment.fromString(object);
                    }
                    this.zza = object;
                    this.zzb = serializable;
                    if (string2 != null) break block12;
                    object = null;
                    break block13;
                }
                object = zzay.zza(string2);
            }
            this.zzc = object;
            if (string3 == null) break block14;
            residentKeyRequirement = ResidentKeyRequirement.fromString(string3);
        }
        try {
            this.zzd = residentKeyRequirement;
            return;
        }
        catch (ResidentKeyRequirement$UnsupportedResidentKeyRequirementException residentKeyRequirement$UnsupportedResidentKeyRequirementException) {
        }
        catch (zzax zzax2) {
        }
        catch (Attachment$UnsupportedAttachmentException attachment$UnsupportedAttachmentException) {
            // empty catch block
        }
        super((Throwable)var1_5);
        throw serializable;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthenticatorSelectionCriteria;
        if (!bl3) {
            return false;
        }
        object = (AuthenticatorSelectionCriteria)object;
        Object object2 = this.zza;
        Object object3 = ((AuthenticatorSelectionCriteria)object).zza;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = this.zzb, object3 = ((AuthenticatorSelectionCriteria)object).zzb)) && (bl3 = Objects.equal(object2 = this.zzc, object3 = ((AuthenticatorSelectionCriteria)object).zzc)) && (bl2 = Objects.equal(object2 = this.zzd, object = ((AuthenticatorSelectionCriteria)object).zzd));
    }

    public Attachment getAttachment() {
        return this.zza;
    }

    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public ResidentKeyRequirement getResidentKeyRequirement() {
        return this.zzd;
    }

    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        Attachment attachment = this.zza;
        Boolean bl2 = this.zzb;
        zzay zzay2 = this.zzc;
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        Object[] objectArray = new Object[]{attachment, bl2, zzay2, residentKeyRequirement};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getAttachmentAsString();
        int n4 = 2;
        SafeParcelWriter.writeString(parcel, n4, (String)object, false);
        int n7 = 3;
        Object object2 = this.getRequireResidentKey();
        SafeParcelWriter.writeBooleanObject(parcel, n7, (Boolean)object2, false);
        object = this.zzc;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            object = ((zzay)((Object)object)).toString();
        }
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object2 = this.getResidentKeyRequirementAsString();
        SafeParcelWriter.writeString(parcel, 5, (String)object2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

