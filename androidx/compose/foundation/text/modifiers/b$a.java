/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.Intrinsics;

public final class b$a {
    public final Sl a;
    public Sl b;
    public boolean c;
    public UQ1 d;

    public b$a(Sl sl, Sl sl2) {
        this.a = sl;
        this.b = sl2;
        this.c = false;
        this.d = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b$a;
        if (!bl3) {
            return false;
        }
        object = (b$a)object;
        Sl sl = this.a;
        Object object2 = ((b$a)object).a;
        bl3 = Intrinsics.areEqual(sl, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        sl = ((b$a)object).b;
        bl3 = Intrinsics.areEqual(object2, sl);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((b$a)object).c;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.d;
        object = ((b$a)object).d;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        Object object = this.a;
        int n3 = ((Sl)object).hashCode() * 31;
        Sl sl = this.b;
        int n4 = (sl.hashCode() + n3) * 31;
        n3 = (int)(this.c ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextSubstitutionValue(original=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", substitution=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", isShowingSubstitution=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", layoutCache=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

