/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gW
 */
public final class gw_2 {
    public HashMap a = null;
    public List b = null;
    public final String c;
    public int d = 0;
    public boolean e = false;
    public long f = -1;

    public gw_2() {
        this(null);
    }

    public gw_2(Object object) {
        this.c = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof gw_2;
        if (n3 == 0) {
            return false;
        }
        object = (gw_2)object;
        Object object2 = this.a;
        Object object3 = ((gw_2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.b;
        object3 = ((gw_2)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.c;
        object3 = ((gw_2)object).c;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.d;
        int n4 = ((gw_2)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = (int)(this.e ? 1 : 0);
        n4 = (int)(((gw_2)object).e ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        long l2 = this.f;
        long l3 = ((gw_2)object).f;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        HashMap hashMap = this.a;
        int n7 = 0;
        if (hashMap == null) {
            n4 = 0;
            hashMap = null;
        } else {
            n4 = ((Object)hashMap).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = this.d;
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.e ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        long l2 = this.f;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^ l3);
        return n4 + n3;
    }

    public final String toString() {
        Object object = this.a;
        List list = this.b;
        int n3 = this.d;
        boolean bl2 = this.e;
        long l2 = this.f;
        StringBuilder stringBuilder = new StringBuilder("ClosetCmsData(closetItemsPrice=");
        stringBuilder.append(object);
        stringBuilder.append(", closetCardItems=");
        stringBuilder.append(list);
        stringBuilder.append(", title=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", closetCount=");
        stringBuilder.append(n3);
        stringBuilder.append(", isClosetDataComplete=");
        stringBuilder.append(bl2);
        stringBuilder.append(", closetLatestMillis=");
        stringBuilder.append(l2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

