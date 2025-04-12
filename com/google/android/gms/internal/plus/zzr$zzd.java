/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person$Name;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zzd
extends FastSafeParcelableJsonResponse
implements Person$Name {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private String zzbw;
    private String zzbx;
    private String zzby;
    private String zzbz;
    private String zzca;
    private String zzcb;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "familyName";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 2);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "formatted";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 3);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "givenName";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 4);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "honorificPrefix";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 5);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "honorificSuffix";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 6);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "middleName";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 7);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzr$zzd() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zzd(Set set, int n3, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.zzap = set;
        this.zzw = n3;
        this.zzbw = string2;
        this.zzbx = string3;
        this.zzby = string4;
        this.zzbz = string5;
        this.zzca = string6;
        this.zzcb = string7;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zzd;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zzd)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zzd)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zzd)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zzd)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final String getFamilyName() {
        return this.zzbw;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzao;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        switch (n3) {
            default: {
                int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                object = tk3_2.a(38, n4, "Unknown safe parcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            case 7: {
                return this.zzcb;
            }
            case 6: {
                return this.zzca;
            }
            case 5: {
                return this.zzbz;
            }
            case 4: {
                return this.zzby;
            }
            case 3: {
                return this.zzbx;
            }
            case 2: 
        }
        return this.zzbw;
    }

    public final String getFormatted() {
        return this.zzbx;
    }

    public final String getGivenName() {
        return this.zzby;
    }

    public final String getHonorificPrefix() {
        return this.zzbz;
    }

    public final String getHonorificSuffix() {
        return this.zzca;
    }

    public final String getMiddleName() {
        return this.zzcb;
    }

    public final boolean hasFamilyName() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasFormatted() {
        Set set = this.zzap;
        Integer n3 = 3;
        return set.contains(n3);
    }

    public final boolean hasGivenName() {
        Set set = this.zzap;
        Integer n3 = 4;
        return set.contains(n3);
    }

    public final boolean hasHonorificPrefix() {
        Set set = this.zzap;
        Integer n3 = 5;
        return set.contains(n3);
    }

    public final boolean hasHonorificSuffix() {
        Set set = this.zzap;
        Integer n3 = 6;
        return set.contains(n3);
    }

    public final boolean hasMiddleName() {
        Set set = this.zzap;
        Integer n3 = 7;
        return set.contains(n3);
    }

    public final int hashCode() {
        boolean bl2;
        Iterator iterator = zzao.values().iterator();
        int n3 = 0;
        Object object = null;
        while (bl2 = iterator.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)iterator.next();
            int n4 = this.isFieldSet(fastJsonResponse$Field);
            if (n4 == 0) continue;
            n4 = fastJsonResponse$Field.getSafeParcelableFieldId() + n3;
            object = this.getFieldValue(fastJsonResponse$Field);
            n3 = object.hashCode() + n4;
        }
        return n3;
    }

    public final boolean isDataValid() {
        return true;
    }

    public final boolean isFieldSet(FastJsonResponse$Field object) {
        Set set = this.zzap;
        object = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        return set.contains(object);
    }

    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        switch (n3) {
            default: {
                object = oe2_0.a(54, n3, "Field with id=", " is not known to be a String.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 7: {
                this.zzcb = string2;
                break;
            }
            case 6: {
                this.zzca = string2;
                break;
            }
            case 5: {
                this.zzbz = string2;
                break;
            }
            case 4: {
                this.zzby = string2;
                break;
            }
            case 3: {
                this.zzbx = string2;
                break;
            }
            case 2: {
                this.zzbw = string2;
            }
        }
        object2 = this.zzap;
        object = n3;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        Object object;
        boolean bl3;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object2 = this.zzap;
        boolean bl4 = true;
        Integer n4 = (int)(bl4 ? 1 : 0);
        int n7 = object2.contains(n4);
        if (n7 != 0) {
            n7 = this.zzw;
            SafeParcelWriter.writeInt(parcel, (int)(bl4 ? 1 : 0), n7);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 2))) {
            object = this.zzbw;
            SafeParcelWriter.writeString(parcel, n7, (String)object, bl4);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 3))) {
            object = this.zzbx;
            SafeParcelWriter.writeString(parcel, n7, (String)object, bl4);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 4))) {
            object = this.zzby;
            SafeParcelWriter.writeString(parcel, n7, (String)object, bl4);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 5))) {
            object = this.zzbz;
            SafeParcelWriter.writeString(parcel, n7, (String)object, bl4);
        }
        if (bl3 = object2.contains(object = Integer.valueOf(n7 = 6))) {
            object = this.zzca;
            SafeParcelWriter.writeString(parcel, n7, (String)object, bl4);
        }
        if (bl2 = object2.contains(object = Integer.valueOf(n7 = 7))) {
            object2 = this.zzcb;
            SafeParcelWriter.writeString(parcel, n7, (String)object2, bl4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

