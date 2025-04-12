/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Iterator;

public abstract class FastSafeParcelableJsonResponse
extends FastJsonResponse
implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        Class<?> clazz = this.getClass();
        boolean bl4 = clazz.isInstance(object);
        if (!bl4) {
            return false;
        }
        object = (FastJsonResponse)object;
        clazz = this.getFieldMappings().values().iterator();
        while (bl2 = clazz.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)clazz.next();
            boolean bl5 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl5 ? !(bl5 = ((FastJsonResponse)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = Objects.equal(object2 = this.getFieldValue((FastJsonResponse$Field)object3), object3 = ((FastJsonResponse)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((FastJsonResponse)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public Object getValueObject(String string2) {
        return null;
    }

    public int hashCode() {
        int n3;
        Iterator iterator = this.getFieldMappings().values().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Object object = (FastJsonResponse$Field)iterator.next();
            boolean bl2 = this.isFieldSet((FastJsonResponse$Field)object);
            if (!bl2) continue;
            n4 *= 31;
            object = Preconditions.checkNotNull(this.getFieldValue((FastJsonResponse$Field)object));
            n3 = object.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public boolean isPrimitiveFieldSet(String string2) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel parcel = Parcel.obtain();
        this.writeToParcel(parcel, 0);
        byte[] byArray = parcel.marshall();
        parcel.recycle();
        return byArray;
    }
}

