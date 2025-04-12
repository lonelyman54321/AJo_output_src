/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final cU1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public b(cU1 object, boolean bl2) {
        String string2 = "type";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl3 = ((cU1)object).a;
        if (!bl3 && bl2) {
            object = ((cU1)object).b().concat(" does not allow nullable values");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        this.a = object;
        this.b = bl2;
        this.e = null;
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null && (bl2 = Intrinsics.areEqual(object3 = b.class, object2 = object.getClass()))) {
            object = (b)object;
            bl2 = this.b;
            boolean bl4 = ((b)object).b;
            if (bl2 != bl4) {
                return false;
            }
            bl2 = this.c;
            bl4 = ((b)object).c;
            if (bl2 != bl4) {
                return false;
            }
            object2 = this.a;
            object3 = ((b)object).a;
            bl2 = Intrinsics.areEqual(object2, object3);
            if (!bl2) {
                return false;
            }
            object = ((b)object).e;
            object2 = this.e;
            if (object2 != null) {
                bl3 = Intrinsics.areEqual(object2, object);
            } else if (object != null) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public final int hashCode() {
        void var3_7;
        cU1 cU12 = this.a;
        int n3 = cU12.hashCode() * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        int n7 = this.c;
        n3 = (n3 + n7) * 31;
        Object object = this.e;
        if (object != null) {
            int n8 = object.hashCode();
        } else {
            boolean bl2 = false;
            object = null;
        }
        return n3 + var3_7;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder();
        CharSequence charSequence2 = b.class.getSimpleName();
        ((StringBuilder)charSequence).append((String)charSequence2);
        charSequence2 = new StringBuilder(" Type: ");
        Object object = this.a;
        ((StringBuilder)charSequence2).append(object);
        charSequence2 = ((StringBuilder)charSequence2).toString();
        ((StringBuilder)charSequence).append((String)charSequence2);
        object = " Nullable: ";
        charSequence2 = new StringBuilder((String)object);
        boolean bl2 = this.b;
        ((StringBuilder)charSequence2).append(bl2);
        charSequence2 = ((StringBuilder)charSequence2).toString();
        ((StringBuilder)charSequence).append((String)charSequence2);
        boolean bl3 = this.c;
        if (bl3) {
            charSequence2 = new StringBuilder(" DefaultValue: ");
            object = this.e;
            ((StringBuilder)charSequence2).append(object);
            charSequence2 = ((StringBuilder)charSequence2).toString();
            ((StringBuilder)charSequence).append((String)charSequence2);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

