/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache$Key$a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class MemoryCache$Key
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Map b;

    static {
        MemoryCache$Key$a memoryCache$Key$a = new Object();
        CREATOR = memoryCache$Key$a;
    }

    public MemoryCache$Key(String string2, Map map2) {
        this.a = string2;
        this.b = map2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof MemoryCache$Key;
                if (!bl4) break block4;
                object = (MemoryCache$Key)object;
                String string2 = this.a;
                Object object2 = ((MemoryCache$Key)object).a;
                bl4 = Intrinsics.areEqual(string2, object2);
                if (bl4 && (bl3 = Intrinsics.areEqual(object2 = this.b, object = ((MemoryCache$Key)object).b))) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return ((Object)this.b).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Key(key=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", extras=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Iterator iterator = this.a;
        parcel.writeString((String)((Object)iterator));
        iterator = this.b;
        int n4 = iterator.size();
        parcel.writeInt(n4);
        iterator = iterator.entrySet().iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = iterator.next();
            String string2 = (String)object.getKey();
            object = (String)object.getValue();
            parcel.writeString(string2);
            parcel.writeString((String)object);
        }
    }
}

