/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RN1
 */
public final class rn1_1 {
    public final long a;
    public final long b;
    public final long c;
    public final File d;

    public rn1_1(long l2, long l3, File file) {
        Intrinsics.checkNotNullParameter(file, "diskDirectory");
        this.a = l2;
        this.b = l3;
        this.c = 5120L;
        this.d = file;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof rn1_1;
        if (!object2) {
            return false;
        }
        object = (rn1_1)object;
        long l2 = this.a;
        long l3 = ((rn1_1)object).a;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l3 = this.b;
        l2 = ((rn1_1)object).b;
        long l7 = l3 - l2;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l3 = this.c;
        l2 = ((rn1_1)object).c;
        long l8 = l3 - l2;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        File file = this.d;
        object = ((rn1_1)object).d;
        boolean bl3 = Intrinsics.areEqual(file, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = this.c;
        l4 = l3 >>> n3;
        n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        return this.d.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MemoryConfig(minInMemorySizeKB=");
        long l2 = this.a;
        stringBuilder.append(l2);
        stringBuilder.append(", optimistic=");
        l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", maxDiskSizeKB=");
        l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", diskDirectory=");
        File file = this.d;
        stringBuilder.append(file);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

