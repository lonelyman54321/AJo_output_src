/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rs0
 */
public final class rs0_1 {
    public final Bitmap a;
    public final rs0$a_0 b;
    public final long c;
    public final byte[] d;

    public rs0_1(Bitmap bitmap, rs0$a_0 rs0$a_0, long l2, byte[] byArray) {
        Intrinsics.checkNotNullParameter((Object)rs0$a_0, "status");
        this.a = bitmap;
        this.b = rs0$a_0;
        this.c = l2;
        this.d = byArray;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null) {
            object3 = object.getClass();
        } else {
            object2 = false;
            object3 = null;
        }
        object2 = Intrinsics.areEqual(rs0_1.class, object3);
        if (!object2) {
            return false;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.clevertap.android.sdk.network.DownloadedBitmap");
        object = (rs0_1)object;
        object3 = this.a;
        Object object4 = ((rs0_1)object).a;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.b;
        object4 = ((rs0_1)object).b;
        if (object3 != object4) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((rs0_1)object).c;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.d;
        object = ((rs0_1)object).d;
        boolean bl3 = Arrays.equals((byte[])object3, (byte[])object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            n3 = bitmap.hashCode();
        } else {
            n3 = 0;
            bitmap = null;
        }
        int n4 = (((Object)((Object)this.b)).hashCode() + (n3 *= 31)) * 31;
        long l2 = this.c;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^ l3);
        n4 = (n4 + n3) * 31;
        return Arrays.hashCode(this.d) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DownloadedBitmap(bitmap=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", status=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", downloadTime=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", bytes=");
        object = Arrays.toString(this.d);
        stringBuilder.append((String)object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

