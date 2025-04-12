/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Lx {
    public long a;
    public long b;
    public long[] c;

    public final boolean a(int object) {
        Object object2;
        if (object >= 0) {
            object2 = this.c;
            int n3 = 128;
            int n4 = 64;
            boolean object3 = object2 != null ? (((Object)object2).length + 2) * 64 : 128 != 0;
            if (object < object3) {
                object3 = true;
                long l2 = 0L;
                long l3 = 1L;
                if (object < n4) {
                    long l4 = this.a;
                    long l7 = (l4 &= (l3 <<= object)) - l2;
                    if ((object = (reference)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1))) == false) {
                        object3 = false;
                    }
                    return object3;
                }
                if (object < n3) {
                    long l8 = this.b;
                    object -= n4;
                    long l12 = (l8 &= (l3 <<= object)) - l2;
                    if ((object = (reference)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1))) == false) {
                        object3 = false;
                    }
                    return object3;
                }
                if (object2 == null) {
                    return false;
                }
                n3 = (int)(object / 64 + -2);
                int n7 = ((Object)object2).length;
                if (n3 >= n7) {
                    return false;
                }
                object %= n4;
                Object object4 = object2[n3];
                reference var10_10 = object4 & (l3 <<= object);
                reference cfr_temp_2 = var10_10 - l2;
                if ((object = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1)) == false) {
                    object3 = false;
                }
                return object3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Index ");
        stringBuilder.append((int)object);
        stringBuilder.append(" out of bound");
        String string2 = stringBuilder.toString().toString();
        object2 = new IllegalStateException(string2);
        throw object2;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("BitVector [");
        long[] lArray = this.c;
        int n3 = lArray != null ? (lArray.length + 2) * 64 : 128;
        boolean bl2 = true;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            boolean bl3 = this.a(i3);
            if (!bl3) continue;
            if (!bl2) {
                string2 = ", ";
                ((StringBuilder)charSequence).append(string2);
            }
            ((StringBuilder)charSequence).append(i3);
            bl2 = false;
            string2 = null;
        }
        ((StringBuilder)charSequence).append(']');
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

