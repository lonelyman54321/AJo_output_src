/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ql3
 */
public final class ql3_0 {
    public final Sl a;
    public final long b;
    public final mm3 c;

    public ql3_0(Sl charSequence, long l2, mm3 mm32) {
        mm3 mm33;
        this.a = charSequence;
        String string2 = ((Sl)charSequence).a;
        int n3 = string2.length();
        this.b = l2 = nm3.b(n3, l2);
        if (mm32 != null) {
            charSequence = ((Sl)charSequence).a;
            int n4 = ((String)charSequence).length();
            l2 = mm32.a;
            long l3 = nm3.b(n4, l2);
            mm33 = new mm3(l3);
        } else {
            mm33 = null;
        }
        this.c = mm33;
    }

    public ql3_0(String string2, long l2, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = "";
        }
        if ((n3 &= 2) != 0) {
            l2 = mm3.b;
        }
        Sl sl = new Sl(6, string2, null);
        this(sl, l2, null);
    }

    public static ql3_0 a(ql3_0 ql3_02, Sl sl, long l2, int n3) {
        mm3 mm32;
        int n4 = n3 & 1;
        if (n4 != 0) {
            sl = ql3_02.a;
        }
        if ((n4 = n3 & 2) != 0) {
            l2 = ql3_02.b;
        }
        if ((n3 &= 4) != 0) {
            mm32 = ql3_02.c;
        } else {
            n3 = 0;
            mm32 = null;
        }
        ql3_02.getClass();
        ql3_02 = new ql3_0(sl, l2, mm32);
        return ql3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        mm3 mm32;
        Object object2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof ql3_0;
        if (!bl4) {
            return false;
        }
        object = (ql3_0)object;
        long l2 = this.b;
        long l3 = ((ql3_0)object).b;
        bl4 = mm3.a(l2, l3);
        if (!(bl4 && (bl4 = Intrinsics.areEqual(object2 = this.c, mm32 = ((ql3_0)object).c)) && (bl2 = Intrinsics.areEqual(object2 = this.a, object = ((ql3_0)object).a)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = mm3.c;
        long l2 = this.b;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = ((int)(l2 ^= l3) + n3) * 31;
        mm3 mm32 = this.c;
        if (mm32 != null) {
            long l4 = mm32.a;
            long l7 = l4 >>> n7;
            n4 = (int)(l4 ^= l7);
        } else {
            n4 = 0;
        }
        return n8 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextFieldValue(text='");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append("', selection=");
        object = mm3.g(this.b);
        stringBuilder.append(object);
        stringBuilder.append(", composition=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

