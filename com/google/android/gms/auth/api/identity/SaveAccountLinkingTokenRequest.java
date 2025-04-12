/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder;
import com.google.android.gms.auth.api.identity.zbp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collection;
import java.util.List;

public class SaveAccountLinkingTokenRequest
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final String EXTRA_TOKEN = "extra_token";
    public static final String TOKEN_TYPE_AUTH_CODE = "auth_code";
    private final PendingIntent zba;
    private final String zbb;
    private final String zbc;
    private final List zbd;
    private final String zbe;
    private final int zbf;

    static {
        zbp zbp2 = new zbp();
        CREATOR = zbp2;
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String string2, String string3, List list, String string4, int n3) {
        this.zba = pendingIntent;
        this.zbb = string2;
        this.zbc = string3;
        this.zbd = list;
        this.zbe = string4;
        this.zbf = n3;
    }

    public static SaveAccountLinkingTokenRequest$Builder builder() {
        SaveAccountLinkingTokenRequest$Builder saveAccountLinkingTokenRequest$Builder = new SaveAccountLinkingTokenRequest$Builder();
        return saveAccountLinkingTokenRequest$Builder;
    }

    public static SaveAccountLinkingTokenRequest$Builder zba(SaveAccountLinkingTokenRequest object) {
        Preconditions.checkNotNull(object);
        SaveAccountLinkingTokenRequest$Builder saveAccountLinkingTokenRequest$Builder = SaveAccountLinkingTokenRequest.builder();
        Object object2 = ((SaveAccountLinkingTokenRequest)object).getScopes();
        saveAccountLinkingTokenRequest$Builder.setScopes((List)object2);
        object2 = ((SaveAccountLinkingTokenRequest)object).getServiceId();
        saveAccountLinkingTokenRequest$Builder.setServiceId((String)object2);
        object2 = ((SaveAccountLinkingTokenRequest)object).getConsentPendingIntent();
        saveAccountLinkingTokenRequest$Builder.setConsentPendingIntent((PendingIntent)object2);
        object2 = ((SaveAccountLinkingTokenRequest)object).getTokenType();
        saveAccountLinkingTokenRequest$Builder.setTokenType((String)object2);
        int n3 = ((SaveAccountLinkingTokenRequest)object).zbf;
        saveAccountLinkingTokenRequest$Builder.zbb(n3);
        object = ((SaveAccountLinkingTokenRequest)object).zbe;
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 == 0) {
            saveAccountLinkingTokenRequest$Builder.zba((String)object);
        }
        return saveAccountLinkingTokenRequest$Builder;
    }

    public boolean equals(Object object) {
        int n3;
        Object object2;
        int n4;
        int n7 = object instanceof SaveAccountLinkingTokenRequest;
        if (n7 == 0) {
            return false;
        }
        object = (SaveAccountLinkingTokenRequest)object;
        Object object3 = this.zbd;
        n7 = object3.size();
        return n7 == (n4 = (object2 = ((SaveAccountLinkingTokenRequest)object).zbd).size()) && (n7 = (int)((object3 = this.zbd).containsAll((Collection<?>)(object2 = ((SaveAccountLinkingTokenRequest)object).zbd)) ? 1 : 0)) != 0 && (n7 = (int)(Objects.equal(object3 = this.zba, object2 = ((SaveAccountLinkingTokenRequest)object).zba) ? 1 : 0)) != 0 && (n7 = (int)(Objects.equal(object3 = this.zbb, object2 = ((SaveAccountLinkingTokenRequest)object).zbb) ? 1 : 0)) != 0 && (n7 = (int)(Objects.equal(object3 = this.zbc, object2 = ((SaveAccountLinkingTokenRequest)object).zbc) ? 1 : 0)) != 0 && (n7 = (int)(Objects.equal(object3 = this.zbe, object2 = ((SaveAccountLinkingTokenRequest)object).zbe) ? 1 : 0)) != 0 && (n7 = this.zbf) == (n3 = ((SaveAccountLinkingTokenRequest)object).zbf);
    }

    public PendingIntent getConsentPendingIntent() {
        return this.zba;
    }

    public List getScopes() {
        return this.zbd;
    }

    public String getServiceId() {
        return this.zbc;
    }

    public String getTokenType() {
        return this.zbb;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.zba;
        String string2 = this.zbb;
        String string3 = this.zbc;
        List list = this.zbd;
        String string4 = this.zbe;
        Object[] objectArray = new Object[]{pendingIntent, string2, string3, list, string4};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getConsentPendingIntent();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        object = this.getTokenType();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.getServiceId();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.getScopes();
        SafeParcelWriter.writeStringList(parcel, 4, (List)object, false);
        object = this.zbe;
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        int n7 = this.zbf;
        SafeParcelWriter.writeInt(parcel, 6, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

