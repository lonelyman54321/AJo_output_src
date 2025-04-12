/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.common.zzak;
import java.util.ArrayList;
import java.util.List;

public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    public static SafeParcelable deserializeFromBytes(byte[] object, Parcelable.Creator creator) {
        Preconditions.checkNotNull(creator);
        Parcel parcel = Parcel.obtain();
        int n3 = ((byte[])object).length;
        parcel.unmarshall(object, 0, n3);
        parcel.setDataPosition(0);
        object = (SafeParcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return object;
    }

    public static SafeParcelable deserializeFromIntentExtra(Intent object, String string2, Parcelable.Creator creator) {
        if ((object = (Object)object.getByteArrayExtra(string2)) == null) {
            return null;
        }
        return SafeParcelableSerializer.deserializeFromBytes((byte[])object, creator);
    }

    public static SafeParcelable deserializeFromString(String string2, Parcelable.Creator creator) {
        return SafeParcelableSerializer.deserializeFromBytes(Base64Utils.decodeUrlSafe(string2), creator);
    }

    public static ArrayList deserializeIterableFromBundle(Bundle object, String arrayList, Parcelable.Creator creator) {
        if ((object = (ArrayList)object.getSerializable((String)((Object)arrayList))) == null) {
            return null;
        }
        int n3 = ((ArrayList)object).size();
        arrayList = new ArrayList<SafeParcelable>(n3);
        n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            SafeParcelable safeParcelable = SafeParcelableSerializer.deserializeFromBytes((byte[])object.get(i3), creator);
            arrayList.add(safeParcelable);
        }
        return arrayList;
    }

    public static ArrayList deserializeIterableFromBundleSafe(Bundle bundle, String string2, Parcelable.Creator creator) {
        return SafeParcelableSerializer.deserializeIterableFromBytes(bundle.getByteArray(string2), creator);
    }

    public static ArrayList deserializeIterableFromBytes(byte[] object, Parcelable.Creator creator) {
        if (object == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        int n3 = ((byte[])object).length;
        parcel.unmarshall(object, 0, n3);
        parcel.setDataPosition(0);
        try {
            object = new ArrayList;
            object();
            parcel.readTypedList((List)object, creator);
            return object;
        }
        finally {
            parcel.recycle();
        }
    }

    public static ArrayList deserializeIterableFromIntentExtra(Intent object, String arrayList, Parcelable.Creator creator) {
        if ((object = (ArrayList)object.getSerializableExtra((String)((Object)arrayList))) == null) {
            return null;
        }
        int n3 = ((ArrayList)object).size();
        arrayList = new ArrayList<SafeParcelable>(n3);
        n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            SafeParcelable safeParcelable = SafeParcelableSerializer.deserializeFromBytes((byte[])object.get(i3), creator);
            arrayList.add(safeParcelable);
        }
        return arrayList;
    }

    public static ArrayList deserializeIterableFromIntentExtraSafe(Intent intent, String string2, Parcelable.Creator creator) {
        return SafeParcelableSerializer.deserializeIterableFromBytes(intent.getByteArrayExtra(string2), creator);
    }

    public static void serializeIterableToBundle(Iterable object, Bundle bundle, String string2) {
        boolean bl2;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            byte[] byArray = SafeParcelableSerializer.serializeToBytes((SafeParcelable)object.next());
            arrayList.add(byArray);
        }
        bundle.putSerializable(string2, arrayList);
    }

    public static void serializeIterableToBundleSafe(Iterable object, Bundle bundle, String string2) {
        object = SafeParcelableSerializer.serializeIterableToBytes((Iterable)object);
        bundle.putByteArray(string2, (byte[])object);
    }

    public static byte[] serializeIterableToBytes(Iterable object) {
        Parcel parcel = Parcel.obtain();
        try {
            object = zzak.zzj((Iterable)object);
            parcel.writeTypedList((List)object);
            object = parcel.marshall();
            return object;
        }
        finally {
            parcel.recycle();
        }
    }

    public static void serializeIterableToIntentExtra(Iterable object, Intent intent, String string2) {
        boolean bl2;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            byte[] byArray = SafeParcelableSerializer.serializeToBytes((SafeParcelable)object.next());
            arrayList.add(byArray);
        }
        intent.putExtra(string2, arrayList);
    }

    public static void serializeIterableToIntentExtraSafe(Iterable object, Intent intent, String string2) {
        object = SafeParcelableSerializer.serializeIterableToBytes((Iterable)object);
        intent.putExtra(string2, (byte[])object);
    }

    public static byte[] serializeToBytes(SafeParcelable object) {
        Parcel parcel = Parcel.obtain();
        object.writeToParcel(parcel, 0);
        object = parcel.marshall();
        parcel.recycle();
        return object;
    }

    public static void serializeToIntentExtra(SafeParcelable object, Intent intent, String string2) {
        object = SafeParcelableSerializer.serializeToBytes((SafeParcelable)object);
        intent.putExtra(string2, (byte[])object);
    }

    public static String serializeToString(SafeParcelable safeParcelable) {
        return Base64Utils.encodeUrlSafe(SafeParcelableSerializer.serializeToBytes(safeParcelable));
    }
}

