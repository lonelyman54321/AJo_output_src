/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.zba;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

public class Credential
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private final String zba;
    private final String zbb;
    private final Uri zbc;
    private final List zbd;
    private final String zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;

    static {
        zba zba2 = new zba();
        CREATOR = zba2;
    }

    public Credential(String object, String list, Uri uri, List list2, String string2, String string3, String string4, String string5) {
        boolean bl2;
        object = ((String)Preconditions.checkNotNull(object, "credential identifier cannot be null")).trim();
        Object object2 = "credential identifier cannot be empty";
        Preconditions.checkNotEmpty((String)object, object2);
        if (string2 != null && (bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = new IllegalArgumentException("Password must not be empty if set");
            throw object;
        }
        if (string3 != null) {
            bl2 = TextUtils.isEmpty((CharSequence)string3);
            if (bl2) {
                object2 = Boolean.FALSE;
            } else {
                String string6;
                object2 = Uri.parse((String)string3);
                boolean bl3 = object2.isAbsolute();
                if (bl3 && (bl3 = object2.isHierarchical()) && !(bl3 = TextUtils.isEmpty((CharSequence)(string6 = object2.getScheme()))) && !(bl3 = TextUtils.isEmpty((CharSequence)(string6 = object2.getAuthority())))) {
                    string6 = object2.getScheme();
                    String string7 = "http";
                    bl3 = string7.equalsIgnoreCase(string6);
                    boolean bl4 = true;
                    if (!bl3 && !(bl2 = (string6 = "https").equalsIgnoreCase((String)(object2 = object2.getScheme())))) {
                        bl4 = false;
                        string7 = null;
                    }
                    object2 = bl4;
                } else {
                    object2 = Boolean.FALSE;
                }
            }
            bl2 = (Boolean)object2;
            if (!bl2) {
                object = new IllegalArgumentException("Account type must be a valid Http/Https URI");
                throw object;
            }
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string3)) && !(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = new IllegalArgumentException("Password and AccountType are mutually exclusive");
            throw object;
        }
        if (list != null && (bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((String)((Object)list)).trim())))) {
            list = null;
        }
        this.zbb = list;
        this.zbc = uri;
        list = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zbd = list;
        this.zba = object;
        this.zbe = string2;
        this.zbf = string3;
        this.zbg = string4;
        this.zbh = string5;
    }

    public static /* bridge */ /* synthetic */ Uri zba(Credential credential) {
        return credential.zbc;
    }

    public static /* bridge */ /* synthetic */ String zbb(Credential credential) {
        return credential.zbf;
    }

    public static /* bridge */ /* synthetic */ String zbc(Credential credential) {
        return credential.zbh;
    }

    public static /* bridge */ /* synthetic */ String zbd(Credential credential) {
        return credential.zbg;
    }

    public static /* bridge */ /* synthetic */ String zbe(Credential credential) {
        return credential.zba;
    }

    public static /* bridge */ /* synthetic */ String zbf(Credential credential) {
        return credential.zbb;
    }

    public static /* bridge */ /* synthetic */ String zbg(Credential credential) {
        return credential.zbe;
    }

    public static /* bridge */ /* synthetic */ List zbh(Credential credential) {
        return credential.zbd;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof Credential;
        if (!bl4) {
            return false;
        }
        object = (Credential)object;
        String string2 = this.zba;
        String string3 = ((Credential)object).zba;
        bl4 = TextUtils.equals((CharSequence)string2, (CharSequence)string3);
        if (bl4 && (bl4 = TextUtils.equals((CharSequence)(string2 = this.zbb), (CharSequence)(string3 = ((Credential)object).zbb))) && (bl4 = Objects.equal(string2 = this.zbc, string3 = ((Credential)object).zbc)) && (bl4 = TextUtils.equals((CharSequence)(string2 = this.zbe), (CharSequence)(string3 = ((Credential)object).zbe))) && (bl2 = TextUtils.equals((CharSequence)(string2 = this.zbf), (CharSequence)(object = ((Credential)object).zbf)))) {
            return bl3;
        }
        return false;
    }

    public String getAccountType() {
        return this.zbf;
    }

    public String getFamilyName() {
        return this.zbh;
    }

    public String getGivenName() {
        return this.zbg;
    }

    public String getId() {
        return this.zba;
    }

    public List getIdTokens() {
        return this.zbd;
    }

    public String getName() {
        return this.zbb;
    }

    public String getPassword() {
        return this.zbe;
    }

    public Uri getProfilePictureUri() {
        return this.zbc;
    }

    public int hashCode() {
        String string2 = this.zba;
        String string3 = this.zbb;
        Uri uri = this.zbc;
        String string4 = this.zbe;
        String string5 = this.zbf;
        Object[] objectArray = new Object[]{string2, string3, uri, string4, string5};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getId();
        SafeParcelWriter.writeString(parcel, 1, (String)object, false);
        String string2 = this.getName();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        string2 = this.getProfilePictureUri();
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)string2, n3, false);
        object = this.getIdTokens();
        SafeParcelWriter.writeTypedList(parcel, 4, (List)object, false);
        object = this.getPassword();
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        object = this.getAccountType();
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.getGivenName();
        SafeParcelWriter.writeString(parcel, 9, (String)object, false);
        object = this.getFamilyName();
        SafeParcelWriter.writeString(parcel, 10, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

