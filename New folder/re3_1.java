/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Re3
 */
public final class re3_1
extends Qt0 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final li e;

    public re3_1(float f5, float f6, int n3, int n4, li li2, int n7) {
        int n8 = n7 & 2;
        if (n8 != 0) {
            f6 = 4.0f;
        }
        if ((n8 = n7 & 4) != 0) {
            n3 = 0;
        }
        if ((n8 = n7 & 8) != 0) {
            n4 = 0;
        }
        if ((n7 &= 0x10) != 0) {
            li2 = null;
        }
        this.a = f5;
        this.b = f6;
        this.c = n3;
        this.d = n4;
        this.e = li2;
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof re3_1;
        if (object2 == 0) {
            return false;
        }
        object = (re3_1)object;
        float f6 = this.a;
        float f7 = ((re3_1)object).a;
        float f8 = f6 - f7;
        object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object2 == 0 && (object2 = (f5 = (f7 = this.b) - (f6 = ((re3_1)object).b)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) == 0) {
            object2 = this.c;
            int n3 = ((re3_1)object).c;
            if ((object2 = (Object)Se3.a(object2, n3)) == 0) {
                return false;
            }
            object2 = this.d;
            n3 = ((re3_1)object).d;
            if ((object2 = (Object)Ue3.b(object2, n3)) == 0) {
                return false;
            }
            li li2 = this.e;
            object = ((re3_1)object).e;
            boolean bl3 = Intrinsics.areEqual(li2, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        float f5 = this.a;
        int n3 = Float.floatToIntBits(f5);
        int n4 = 31;
        n3 *= 31;
        float f6 = this.b;
        n3 = UR0.a(f6, n3, n4);
        int n7 = this.c;
        n3 = (n3 + n7) * 31;
        n7 = this.d;
        n3 = (n3 + n7) * 31;
        li li2 = this.e;
        if (li2 != null) {
            n4 = li2.hashCode();
        } else {
            n4 = 0;
            li2 = null;
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Stroke(width=");
        float f5 = this.a;
        stringBuilder.append(f5);
        stringBuilder.append(", miter=");
        f5 = this.b;
        stringBuilder.append(f5);
        Object object = ", cap=";
        stringBuilder.append((String)object);
        int n3 = this.c;
        boolean bl2 = false;
        boolean bl3 = Se3.a(n3, 0);
        String string2 = "Unknown";
        int n4 = 2;
        String string3 = "Round";
        int n7 = 1;
        object = bl3 ? "Butt" : ((bl3 = Se3.a(n3, n7)) ? string3 : ((n3 = (int)(Se3.a(n3, n4) ? 1 : 0)) != 0 ? "Square" : string2));
        stringBuilder.append(object);
        object = ", join=";
        stringBuilder.append((String)object);
        n3 = this.d;
        bl2 = Ue3.b(n3, 0);
        if (bl2) {
            string2 = "Miter";
        } else {
            bl2 = Ue3.b(n3, n7);
            if (bl2) {
                string2 = string3;
            } else if ((n3 = (int)(Ue3.b(n3, n4) ? 1 : 0)) != 0) {
                string2 = "Bevel";
            }
        }
        stringBuilder.append((Object)string2);
        stringBuilder.append(", pathEffect=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

