/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ox
 */
public final class ox_0 {
    public final String a;
    public final boolean b;
    public final Context c;
    public final CleverTapInstanceConfig d;
    public final long e;
    public final int f;

    public ox_0(String string2, boolean bl2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long l2, int n3) {
        this.a = string2;
        this.b = bl2;
        this.c = context;
        this.d = cleverTapInstanceConfig;
        this.e = l2;
        this.f = n3;
    }

    public /* synthetic */ ox_0(String string2, boolean bl2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long l2, int n3, int n4) {
        long l3;
        boolean bl3;
        int n7 = n3 & 2;
        if (n7 != 0) {
            n7 = 0;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n7 = n3 & 4;
        Context context2 = n7 != 0 ? null : context;
        n7 = n3 & 8;
        CleverTapInstanceConfig cleverTapInstanceConfig2 = n7 != 0 ? null : cleverTapInstanceConfig;
        n7 = n3 & 0x10;
        long l4 = n7 != 0 ? (l3 = (long)-1) : l2;
        this(string2, bl3, context2, cleverTapInstanceConfig2, l4, -1);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof ox_0;
        if (object2 == 0) {
            return false;
        }
        object = (ox_0)object;
        Object object3 = this.a;
        Object object4 = ((ox_0)object).a;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object2 = this.b;
        Object object5 = ((ox_0)object).b;
        if (object2 != object5) {
            return false;
        }
        object4 = this.c;
        object3 = ((ox_0)object).c;
        object2 = Intrinsics.areEqual(object4, object3);
        if (object2 == 0) {
            return false;
        }
        object4 = this.d;
        object3 = ((ox_0)object).d;
        object2 = Intrinsics.areEqual(object4, object3);
        if (object2 == 0) {
            return false;
        }
        long l2 = this.e;
        long l3 = ((ox_0)object).e;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        object2 = this.f;
        int n3 = ((ox_0)object).f;
        if (object2 != n3) {
            return false;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final int hashCode() {
        void var4_8;
        int n3;
        int n32;
        int n4 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n32 = 0;
            string2 = null;
        } else {
            n32 = string2.hashCode();
        }
        n32 *= 31;
        boolean n7 = this.b;
        if (n7) {
            n3 = 1;
        }
        n32 = (n32 + n3) * 31;
        Object object = this.c;
        if (object == null) {
            boolean bl2 = false;
            object = null;
        } else {
            int n8 = object.hashCode();
        }
        n32 = (n32 + var4_8) * 31;
        object = this.d;
        if (object != null) {
            n4 = object.hashCode();
        }
        n32 = (n32 + n4) * 31;
        long l2 = this.e;
        long l3 = l2 >>> 32;
        n4 = (int)(l2 ^ l3);
        n32 = (n32 + n4) * 31;
        n4 = this.f;
        return n32 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmapDownloadRequest(bitmapPath=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", fallbackToAppIcon=");
        int n3 = this.b;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", context=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", instanceConfig=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", downloadTimeLimitInMillis=");
        long l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(", downloadSizeLimitInBytes=");
        n3 = this.f;
        return tu.a(stringBuilder, n3, ')');
    }
}

