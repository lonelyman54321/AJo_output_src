/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from W31
 */
public final class w31_0 {
    public static final ff_2 d = ff$a_0.c(":");
    public static final ff_2 e = ff$a_0.c(":status");
    public static final ff_2 f = ff$a_0.c(":method");
    public static final ff_2 g = ff$a_0.c(":path");
    public static final ff_2 h = ff$a_0.c(":scheme");
    public static final ff_2 i = ff$a_0.c(":authority");
    public final ff_2 a;
    public final ff_2 b;
    public final int c;

    public w31_0(ff_2 ff_22, ff_2 ff_23) {
        int n3;
        Intrinsics.checkNotNullParameter(ff_22, "name");
        Intrinsics.checkNotNullParameter(ff_23, "value");
        this.a = ff_22;
        this.b = ff_23;
        int n4 = ff_22.d() + 32;
        this.c = n3 = ff_23.d() + n4;
    }

    public w31_0(ff_2 ff_22, String object) {
        Intrinsics.checkNotNullParameter(ff_22, "name");
        Intrinsics.checkNotNullParameter(object, "value");
        object = ff$a_0.c((String)object);
        this(ff_22, (ff_2)object);
    }

    public w31_0(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(object2, "value");
        object = ff$a_0.c((String)object);
        object2 = ff$a_0.c((String)object2);
        this((ff_2)object, (ff_2)object2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof w31_0;
        if (!bl3) {
            return false;
        }
        object = (w31_0)object;
        ff_2 ff_22 = this.a;
        ff_2 ff_23 = ((w31_0)object).a;
        bl3 = Intrinsics.areEqual(ff_22, ff_23);
        if (!bl3) {
            return false;
        }
        ff_23 = this.b;
        object = ((w31_0)object).b;
        boolean bl4 = Intrinsics.areEqual(ff_23, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a.q();
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        string2 = this.b.q();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

