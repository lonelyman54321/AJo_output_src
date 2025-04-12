/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.pdp.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.pdp.data.ZoomExtras$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ZoomExtras
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final ArrayList b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final String f;
    public final Long g;

    static {
        ZoomExtras$a zoomExtras$a = new Object();
        CREATOR = zoomExtras$a;
    }

    public ZoomExtras(int n3, ArrayList arrayList, String string2, ArrayList arrayList2, String string3, String string4, Long l2) {
        Intrinsics.checkNotNullParameter(arrayList2, "imageList");
        this.a = n3;
        this.b = arrayList;
        this.c = string2;
        this.d = arrayList2;
        this.e = string3;
        this.f = string4;
        this.g = l2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ZoomExtras;
        if (n3 == 0) {
            return false;
        }
        object = (ZoomExtras)object;
        int n4 = this.a;
        n3 = ((ZoomExtras)object).a;
        if (n4 != n3) {
            return false;
        }
        Object object2 = this.b;
        Object object3 = ((ZoomExtras)object).b;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.c;
        object3 = ((ZoomExtras)object).c;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.d;
        object3 = ((ZoomExtras)object).d;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.e;
        object3 = ((ZoomExtras)object).e;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.f;
        object3 = ((ZoomExtras)object).f;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.g;
        object = ((ZoomExtras)object).g;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        int n7 = 0;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        n3 = (((ArrayList)object).hashCode() + n4) * 31;
        Object object2 = this.e;
        if (object2 == null) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = ((String)object2).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object2 = this.f;
        if (object2 == null) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = ((String)object2).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object2 = this.g;
        if (object2 != null) {
            n7 = object2.hashCode();
        }
        return n3 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ZoomExtras(currentPosition=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", listUrls=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", videoUrl=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", imageList=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", productId=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", productName=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", currentPlayTime=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n4 = this.a;
        parcel.writeInt(n4);
        Iterator iterator = this.b;
        parcel.writeStringList((List)((Object)iterator));
        iterator = this.c;
        parcel.writeString((String)((Object)iterator));
        iterator = this.d;
        int n7 = ((ArrayList)((Object)iterator)).size();
        parcel.writeInt(n7);
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Parcelable parcelable = (Parcelable)iterator.next();
            parcel.writeParcelable(parcelable, n3);
        }
        Object object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeString((String)object);
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
            parcel.writeInt(0);
        } else {
            n4 = 1;
            parcel.writeInt(n4);
            long l2 = (Long)object;
            parcel.writeLong(l2);
        }
    }
}

