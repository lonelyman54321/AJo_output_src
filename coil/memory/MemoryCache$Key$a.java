/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache$Key;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class MemoryCache$Key$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        String string2 = object.readString();
        Intrinsics.checkNotNull(string2);
        int n3 = object.readInt();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = object.readString();
            Intrinsics.checkNotNull(string3);
            String string4 = object.readString();
            Intrinsics.checkNotNull(string4);
            linkedHashMap.put(string3, string4);
        }
        object = new MemoryCache$Key(string2, linkedHashMap);
        return object;
    }

    public final Object[] newArray(int n3) {
        return new MemoryCache$Key[n3];
    }
}

