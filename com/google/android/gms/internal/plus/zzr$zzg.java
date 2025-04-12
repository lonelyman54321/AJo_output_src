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
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person$Urls;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zzg
extends FastSafeParcelableJsonResponse
implements Person$Urls {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private String mValue;
    private final Set zzap;
    private int zzcj;
    private String zzck;
    private final int zzcl;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        Object object = "label";
        int n3 = 5;
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forString((String)object, n3);
        hashMap.put((String)object, fastJsonResponse$Field);
        object = new StringToIntConverter();
        object = ((StringToIntConverter)object).add("home", 0).add("work", 1).add("blog", 2).add("profile", 3);
        int n4 = 4;
        object = ((StringToIntConverter)object).add("other", n4).add("otherProfile", n3);
        int n7 = 6;
        object = ((StringToIntConverter)object).add("contributor", n7).add("website", 7);
        Object object2 = "type";
        object = FastJsonResponse$Field.withConverter((String)object2, n7, (FastJsonResponse$FieldConverter)object, false);
        hashMap.put((String)object2, (FastJsonResponse$Field)object);
        object = "value";
        object2 = FastJsonResponse$Field.forString((String)object, n4);
        hashMap.put((String)object, (FastJsonResponse$Field)object2);
    }

    public zzr$zzg() {
        HashSet hashSet;
        this.zzcl = 4;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zzg(Set set, int n3, String string2, int n4, String string3, int n7) {
        this.zzcl = 4;
        this.zzap = set;
        this.zzw = n3;
        this.zzck = string2;
        this.zzcj = n4;
        this.mValue = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zzg;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zzg)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zzg)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zzg)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zzg)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzao;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 4)) {
            n3 = 5;
            if (n4 != n3) {
                n3 = 6;
                if (n4 == n3) {
                    return this.zzcj;
                }
                int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                object = tk3_2.a(38, n7, "Unknown safe parcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            return this.zzck;
        }
        return this.mValue;
    }

    public final String getLabel() {
        return this.zzck;
    }

    public final int getType() {
        return this.zzcj;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final boolean hasLabel() {
        Set set = this.zzap;
        Integer n3 = 5;
        return set.contains(n3);
    }

    public final boolean hasType() {
        Set set = this.zzap;
        Integer n3 = 6;
        return set.contains(n3);
    }

    public final boolean hasValue() {
        Set set = this.zzap;
        Integer n3 = 4;
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

    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 == (n4 = 6)) {
            this.zzcj = n3;
            object2 = this.zzap;
            object = n7;
            object2.add(object);
            return;
        }
        object = oe2_0.a(52, n7, "Field with id=", " is not known to be an int.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 4)) {
            n3 = 5;
            if (n4 != n3) {
                object = oe2_0.a(54, n4, "Field with id=", " is not known to be a String.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzck = string2;
        } else {
            this.mValue = string2;
        }
        object2 = this.zzap;
        object = n4;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        int n7 = 1;
        Object object = n7;
        int n8 = set.contains(object);
        if (n8 != 0) {
            n8 = this.zzw;
            SafeParcelWriter.writeInt(parcel, n7, n8);
        }
        n8 = 3;
        Object object2 = n8;
        boolean bl2 = set.contains(object2);
        int n10 = 4;
        if (bl2) {
            SafeParcelWriter.writeInt(parcel, n8, n10);
        }
        if ((n8 = (int)(set.contains(object = Integer.valueOf(n10)) ? 1 : 0)) != 0) {
            object = this.mValue;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object2 = Integer.valueOf(n8 = 5))) {
            object2 = this.zzck;
            SafeParcelWriter.writeString(parcel, n8, (String)object2, n7 != 0);
        }
        if ((n4 = set.contains(object = Integer.valueOf(n7 = 6))) != 0) {
            n4 = this.zzcj;
            SafeParcelWriter.writeInt(parcel, n7, n4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

