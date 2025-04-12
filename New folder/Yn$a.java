/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Yn$a {
    public final String a;
    public final String b;
    public final String c;

    public Yn$a(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "datasetID");
        Intrinsics.checkNotNullParameter(string3, "cloudBridgeURL");
        Intrinsics.checkNotNullParameter(string4, "accessKey");
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Yn$a;
        if (!bl3) {
            return false;
        }
        object = (Yn$a)object;
        String string2 = this.a;
        String string3 = ((Yn$a)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((Yn$a)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        object = ((Yn$a)object).c;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        return this.c.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CloudBridgeCredentials(datasetID=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", cloudBridgeURL=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", accessKey=");
        string2 = this.c;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

