/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.NetworkRequest
 *  android.os.Build$VERSION
 */
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class b60 {
    public static final b60 j;
    public final lV1 a;
    public final dv1_0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    static {
        b60 b602;
        j = b602 = new b60();
    }

    public b60() {
        long l2;
        lV1 lV12 = lV1.NOT_REQUIRED;
        Object object = "requiredNetworkType";
        Intrinsics.checkNotNullParameter((Object)lV12, (String)object);
        Intrinsics.checkNotNullParameter((Object)lV12, (String)object);
        vz0_2 vz0_22 = vz0_2.a;
        Intrinsics.checkNotNullParameter((Object)lV12, (String)object);
        Intrinsics.checkNotNullParameter(vz0_22, "contentUriTriggers");
        this.b = object = new dv1_0(null);
        this.a = lV12;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = l2 = (long)-1;
        this.h = l2;
        this.i = vz0_22;
    }

    public b60(b60 b602) {
        long l2;
        Object object;
        boolean bl2;
        Intrinsics.checkNotNullParameter(b602, "other");
        this.c = bl2 = b602.c;
        this.d = bl2 = b602.d;
        this.b = object = b602.b;
        object = b602.a;
        this.a = object;
        this.e = bl2 = b602.e;
        this.f = bl2 = b602.f;
        object = b602.i;
        this.i = object;
        this.g = l2 = b602.g;
        this.h = l2 = b602.h;
    }

    public b60(dv1_0 dv1_02, lV1 lV12, boolean bl2, boolean bl3, boolean bl4, boolean bl5, long l2, long l3, Set set) {
        Intrinsics.checkNotNullParameter(dv1_02, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter((Object)lV12, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(set, "contentUriTriggers");
        this.b = dv1_02;
        this.a = lV12;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = bl5;
        this.g = l2;
        this.h = l3;
        this.i = set;
    }

    public final long a() {
        return this.h;
    }

    public final long b() {
        return this.g;
    }

    public final Set c() {
        return this.i;
    }

    public final NetworkRequest d() {
        return (NetworkRequest)this.b.a;
    }

    public final lV1 e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2;
        if (this == object) {
            return true;
        }
        boolean bl3 = false;
        Set set = null;
        if (object != null && (bl2 = Intrinsics.areEqual(object3 = b60.class, object2 = object.getClass()))) {
            object = (b60)object;
            bl2 = this.c;
            boolean bl4 = ((b60)object).c;
            if (bl2 != bl4) {
                return false;
            }
            bl2 = this.d;
            bl4 = ((b60)object).d;
            if (bl2 != bl4) {
                return false;
            }
            bl2 = this.e;
            bl4 = ((b60)object).e;
            if (bl2 != bl4) {
                return false;
            }
            bl2 = this.f;
            bl4 = ((b60)object).f;
            if (bl2 != bl4) {
                return false;
            }
            long l2 = this.g;
            long l3 = ((b60)object).g;
            long l4 = l2 - l3;
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 != false) {
                return false;
            }
            l2 = this.h;
            l3 = ((b60)object).h;
            long l7 = l2 - l3;
            object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 != false) {
                return false;
            }
            object2 = this.d();
            bl2 = Intrinsics.areEqual(object2, object3 = ((b60)object).d());
            if (!bl2) {
                return false;
            }
            object2 = this.a;
            object3 = ((b60)object).a;
            if (object2 == object3) {
                set = this.i;
                object = ((b60)object).i;
                bl3 = Intrinsics.areEqual(set, object);
            }
        }
        return bl3;
    }

    public final boolean f() {
        Collection collection;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        int n7 = 1;
        if (n3 >= n4 && (n3 = (collection = (Collection)this.i).isEmpty() ^ n7) == 0) {
            n7 = 0;
        }
        return n7 != 0;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode() * 31;
        int n4 = this.c;
        n3 = (n3 + n4) * 31;
        int n7 = this.d;
        n3 = (n3 + n7) * 31;
        int n8 = this.e;
        n3 = (n3 + n8) * 31;
        int n10 = this.f;
        n3 = (n3 + n10) * 31;
        long l2 = this.g;
        int n14 = 32;
        long l3 = l2 >>> n14;
        int n15 = (int)(l2 ^ l3);
        n3 = (n3 + n15) * 31;
        l2 = this.h;
        long l4 = l2 >>> n14;
        n15 = (int)(l2 ^= l4);
        n3 = (n3 + n15) * 31;
        Set set = this.i;
        int n16 = (((Object)set).hashCode() + n3) * 31;
        NetworkRequest networkRequest = this.d();
        if (networkRequest != null) {
            n3 = networkRequest.hashCode();
        } else {
            n3 = 0;
            networkRequest = null;
        }
        return n16 + n3;
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Constraints{requiredNetworkType=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", requiresCharging=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", requiresDeviceIdle=");
        bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", requiresBatteryNotLow=");
        bl2 = this.e;
        stringBuilder.append(bl2);
        stringBuilder.append(", requiresStorageNotLow=");
        bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", contentTriggerUpdateDelayMillis=");
        long l2 = this.g;
        stringBuilder.append(l2);
        stringBuilder.append(", contentTriggerMaxDelayMillis=");
        l2 = this.h;
        stringBuilder.append(l2);
        stringBuilder.append(", contentUriTriggers=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", }");
        return stringBuilder.toString();
    }
}

