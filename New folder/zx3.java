/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class zx3 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    public final String f;

    public zx3(String string2, String string3, long l2, long l3, int n3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "normalizedEventName");
        Intrinsics.checkNotNullParameter(string4, "deviceID");
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = l3;
        this.e = n3;
        this.f = string4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof zx3;
        if (object2 == 0) {
            return false;
        }
        object = (zx3)object;
        String string2 = this.a;
        String string3 = ((zx3)object).a;
        object2 = Intrinsics.areEqual(string2, string3);
        if (object2 == 0) {
            return false;
        }
        string3 = this.b;
        string2 = ((zx3)object).b;
        object2 = Intrinsics.areEqual(string3, string2);
        if (object2 == 0) {
            return false;
        }
        long l2 = this.c;
        long l3 = ((zx3)object).c;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        l2 = this.d;
        l3 = ((zx3)object).d;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        object2 = this.e;
        int n3 = ((zx3)object).e;
        if (object2 != n3) {
            return false;
        }
        string3 = this.f;
        object = ((zx3)object).f;
        boolean bl3 = Intrinsics.areEqual(string3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        long l2 = this.c;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        l2 = this.d;
        long l4 = l2 >>> n4;
        n7 = (int)(l2 ^ l4);
        n3 = (n3 + n7) * 31;
        int n8 = this.e;
        n3 = (n3 + n8) * 31;
        return this.f.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserEventLog(eventName=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", normalizedEventName=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", firstTs=");
        long l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", lastTs=");
        l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", countOfEvents=");
        int n3 = this.e;
        stringBuilder.append(n3);
        stringBuilder.append(", deviceID=");
        string2 = this.f;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

