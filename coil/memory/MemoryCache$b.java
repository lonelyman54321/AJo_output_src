/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class MemoryCache$b {
    public final Bitmap a;
    public final Map b;

    public MemoryCache$b(Bitmap bitmap, Map map2) {
        this.a = bitmap;
        this.b = map2;
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
                boolean bl4 = object instanceof MemoryCache$b;
                if (!bl4) break block4;
                object = (MemoryCache$b)object;
                Bitmap bitmap = this.a;
                Object object2 = ((MemoryCache$b)object).a;
                bl4 = Intrinsics.areEqual(bitmap, object2);
                if (bl4 && (bl3 = Intrinsics.areEqual(object2 = this.b, object = ((MemoryCache$b)object).b))) break block5;
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
        StringBuilder stringBuilder = new StringBuilder("Value(bitmap=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", extras=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

