/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class y7 {
    public final String a;
    public final int b;
    public final P81 c;
    public final boolean d;
    public final ArrayList e;

    public y7(String string2, int n3, P81 p81, boolean bl2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "page");
        Intrinsics.checkNotNullParameter(p81, "scrollInfo");
        this.a = string2;
        this.b = n3;
        this.c = p81;
        this.d = bl2;
        this.e = arrayList;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof y7;
        if (n3 == 0) {
            return false;
        }
        object = (y7)object;
        Object object2 = this.a;
        Object object3 = ((y7)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((y7)object).b;
        if (n3 != n4) {
            return false;
        }
        object3 = this.c;
        object2 = ((y7)object).c;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.d ? 1 : 0);
        n4 = (int)(((y7)object).d ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object3 = this.e;
        object = ((y7)object).e;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        Object object = this.a;
        int n3 = ((String)object).hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        P81 p81 = this.c;
        n4 = (p81.hashCode() + n3) * 31;
        n3 = (int)(this.d ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AjioGramStateManagement(page=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", topBarPos=");
        int bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", scrollInfo=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", isHomeBase=");
        boolean bl3 = this.d;
        stringBuilder.append(bl3);
        stringBuilder.append(", topBarResponse=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

