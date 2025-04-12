/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Gu1$a
extends Gu1 {
    public final String a;
    public final gm3_0 b;

    public Gu1$a(String string2, gm3_0 gm3_02) {
        this.a = string2;
        this.b = gm3_02;
    }

    public final gm3_0 a() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Gu1$a;
        if (!bl3) {
            return false;
        }
        object = (Gu1$a)object;
        Object object2 = this.a;
        Object object3 = ((Gu1$a)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((Gu1$a)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object.getClass();
        object = null;
        boolean bl4 = Intrinsics.areEqual(null, null);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        gm3_0 gm3_02 = this.b;
        if (gm3_02 != null) {
            n3 = gm3_02.hashCode();
        } else {
            n3 = 0;
            gm3_02 = null;
        }
        return (n4 + n3) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkAnnotation.Clickable(tag=");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

