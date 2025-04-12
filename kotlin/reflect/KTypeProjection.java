/*
 * Decompiled with CFR 0.152.
 */
package kotlin.reflect;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection$a;
import kotlin.reflect.KTypeProjection$b;

public final class KTypeProjection {
    public static final KTypeProjection$a c;
    public static final KTypeProjection d;
    public final nn1_1 a;
    public final kn1_1 b;

    static {
        Object object = new KTypeProjection$a(null);
        c = object;
        d = object = new KTypeProjection(null, null);
    }

    public KTypeProjection(nn1_1 object, kn1_1 object2) {
        this.a = object;
        this.b = object2;
        boolean bl2 = false;
        String string2 = null;
        boolean bl3 = object == null;
        if (object2 == null) {
            bl2 = true;
        }
        if (bl3 == bl2) {
            return;
        }
        if (object == null) {
            object = "Star projection must have no type specified.";
        } else {
            string2 = "The projection variance ";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" requires type to be specified.");
            object = ((StringBuilder)object2).toString();
        }
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KTypeProjection;
        if (!bl3) {
            return false;
        }
        object = (KTypeProjection)object;
        nn1_1 nn1_12 = this.a;
        Object object2 = ((KTypeProjection)object).a;
        if (nn1_12 != object2) {
            return false;
        }
        object2 = this.b;
        object = ((KTypeProjection)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        nn1_1 nn1_12 = this.a;
        if (nn1_12 == null) {
            n3 = 0;
            nn1_12 = null;
        } else {
            n3 = ((Object)((Object)nn1_12)).hashCode();
        }
        n3 *= 31;
        kn1_1 kn1_12 = this.b;
        if (kn1_12 != null) {
            n4 = kn1_12.hashCode();
        }
        return n3 + n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        CharSequence charSequence;
        int n3;
        int n4 = -1;
        nn1_1 nn1_12 = this.a;
        if (nn1_12 == null) {
            n3 = -1;
        } else {
            int[] nArray = KTypeProjection$b.$EnumSwitchMapping$0;
            n3 = nn1_12.ordinal();
            n3 = nArray[n3];
        }
        if (n3 == n4) return "*";
        n4 = 1;
        kn1_1 kn1_12 = this.b;
        if (n3 == n4) return String.valueOf(kn1_12);
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 == n4) {
                String string2 = "out ";
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append(kn1_12);
                return ((StringBuilder)charSequence).toString();
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        String string3 = "in ";
        charSequence = new StringBuilder(string3);
        ((StringBuilder)charSequence).append(kn1_12);
        return ((StringBuilder)charSequence).toString();
    }
}

