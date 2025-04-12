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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person$Organizations;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zze
extends FastSafeParcelableJsonResponse
implements Person$Organizations {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private String mName;
    private final Set zzap;
    private String zzcc;
    private String zzcd;
    private String zzce;
    private String zzcf;
    private boolean zzcg;
    private String zzch;
    private String zzci;
    private int zzcj;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "department";
        AbstractSafeParcelable abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 2);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "description";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 3);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "endDate";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 4);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "location";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 5);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "name";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 6);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "primary";
        abstractSafeParcelable = FastJsonResponse$Field.forBoolean(string2, 7);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "startDate";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 8);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "title";
        abstractSafeParcelable = FastJsonResponse$Field.forString(string2, 9);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        abstractSafeParcelable = new StringToIntConverter();
        abstractSafeParcelable = ((StringToIntConverter)abstractSafeParcelable).add("work", 0).add("school", 1);
        string2 = "type";
        abstractSafeParcelable = FastJsonResponse$Field.withConverter(string2, 10, (FastJsonResponse$FieldConverter)((Object)abstractSafeParcelable), false);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
    }

    public zzr$zze() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zze(Set set, int n3, String string2, String string3, String string4, String string5, String string6, boolean bl2, String string7, String string8, int n4) {
        this.zzap = set;
        this.zzw = n3;
        this.zzcc = string2;
        this.zzcd = string3;
        this.zzce = string4;
        this.zzcf = string5;
        this.mName = string6;
        this.zzcg = bl2;
        this.zzch = string7;
        this.zzci = string8;
        this.zzcj = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zze;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zze)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zze)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zze)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zze)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final String getDepartment() {
        return this.zzcc;
    }

    public final String getDescription() {
        return this.zzcd;
    }

    public final String getEndDate() {
        return this.zzce;
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
            case 10: {
                return this.zzcj;
            }
            case 9: {
                return this.zzci;
            }
            case 8: {
                return this.zzch;
            }
            case 7: {
                return this.zzcg;
            }
            case 6: {
                return this.mName;
            }
            case 5: {
                return this.zzcf;
            }
            case 4: {
                return this.zzce;
            }
            case 3: {
                return this.zzcd;
            }
            case 2: 
        }
        return this.zzcc;
    }

    public final String getLocation() {
        return this.zzcf;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getStartDate() {
        return this.zzch;
    }

    public final String getTitle() {
        return this.zzci;
    }

    public final int getType() {
        return this.zzcj;
    }

    public final boolean hasDepartment() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasDescription() {
        Set set = this.zzap;
        Integer n3 = 3;
        return set.contains(n3);
    }

    public final boolean hasEndDate() {
        Set set = this.zzap;
        Integer n3 = 4;
        return set.contains(n3);
    }

    public final boolean hasLocation() {
        Set set = this.zzap;
        Integer n3 = 5;
        return set.contains(n3);
    }

    public final boolean hasName() {
        Set set = this.zzap;
        Integer n3 = 6;
        return set.contains(n3);
    }

    public final boolean hasPrimary() {
        Set set = this.zzap;
        Integer n3 = 7;
        return set.contains(n3);
    }

    public final boolean hasStartDate() {
        Set set = this.zzap;
        Integer n3 = 8;
        return set.contains(n3);
    }

    public final boolean hasTitle() {
        Set set = this.zzap;
        Integer n3 = 9;
        return set.contains(n3);
    }

    public final boolean hasType() {
        Set set = this.zzap;
        Integer n3 = 10;
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

    public final boolean isPrimary() {
        return this.zzcg;
    }

    public final void setBooleanInternal(FastJsonResponse$Field object, String object2, boolean bl2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 7)) {
            this.zzcg = bl2;
            object2 = this.zzap;
            object = n4;
            object2.add(object);
            return;
        }
        object = oe2_0.a(55, n4, "Field with id=", " is not known to be a boolean.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 == (n4 = 10)) {
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

    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        switch (n3) {
            default: {
                object = oe2_0.a(54, n3, "Field with id=", " is not known to be a String.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            case 9: {
                this.zzci = string2;
                break;
            }
            case 8: {
                this.zzch = string2;
                break;
            }
            case 6: {
                this.mName = string2;
                break;
            }
            case 5: {
                this.zzcf = string2;
                break;
            }
            case 4: {
                this.zzce = string2;
                break;
            }
            case 3: {
                this.zzcd = string2;
                break;
            }
            case 2: {
                this.zzcc = string2;
            }
        }
        object2 = this.zzap;
        object = n3;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        Object object;
        boolean bl2;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        int n7 = 1;
        Integer n8 = n7;
        int n10 = set.contains(n8);
        if (n10 != 0) {
            n10 = this.zzw;
            SafeParcelWriter.writeInt(parcel, n7, n10);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 2))) {
            object = this.zzcc;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 3))) {
            object = this.zzcd;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 4))) {
            object = this.zzce;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 5))) {
            object = this.zzcf;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 6))) {
            object = this.mName;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 7))) {
            bl2 = this.zzcg;
            SafeParcelWriter.writeBoolean(parcel, n10, bl2);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 8))) {
            object = this.zzch;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n10 = 9))) {
            object = this.zzci;
            SafeParcelWriter.writeString(parcel, n10, (String)object, n7 != 0);
        }
        if ((n4 = set.contains(n8 = Integer.valueOf(n7 = 10))) != 0) {
            n4 = this.zzcj;
            SafeParcelWriter.writeInt(parcel, n7, n4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

