/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from IA3
 */
public final class ia3_2 {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public final CharSequence j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    public ia3_2() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 262143);
    }

    public ia3_2(Integer n3, Integer n4, Integer n7, Integer n8, String string2, Integer n10, Integer n14, Integer n15, Integer n16, Integer n17, Integer n18, Integer n19, Integer n20, int n21) {
        Integer n22;
        Integer n24;
        Integer n25;
        Integer n26;
        Integer n27;
        Integer n28;
        Integer n29;
        Integer n30;
        Object object;
        Integer n32;
        Integer n34;
        Integer n35;
        Integer n36;
        ia3_2 ia3_22 = this;
        int n37 = n21;
        int n38 = n21 & 1;
        if (n38 != 0) {
            n38 = 0;
            n36 = null;
        } else {
            n36 = n3;
        }
        int n39 = n37 & 2;
        if (n39 != 0) {
            n39 = 0;
            n35 = null;
        } else {
            n35 = n4;
        }
        int n41 = n37 & 4;
        if (n41 != 0) {
            n41 = 0;
            n34 = null;
        } else {
            n34 = n7;
        }
        int n42 = n37 & 8;
        if (n42 != 0) {
            n42 = 0;
            n32 = null;
        } else {
            n32 = n8;
        }
        int n43 = n37 & 0x200;
        if (n43 != 0) {
            object = StringCompanionObject.INSTANCE;
            object = "";
        } else {
            object = string2;
        }
        int n44 = n37 & 0x400;
        if (n44 != 0) {
            n44 = 0;
            n30 = null;
        } else {
            n30 = n10;
        }
        int n45 = n37 & 0x800;
        if (n45 != 0) {
            n45 = 0;
            n29 = null;
        } else {
            n29 = n14;
        }
        int n46 = n37 & 0x1000;
        if (n46 != 0) {
            n46 = 0;
            n28 = null;
        } else {
            n28 = n15;
        }
        int n47 = n37 & 0x2000;
        if (n47 != 0) {
            n47 = 0;
            n27 = null;
        } else {
            n27 = n16;
        }
        int n48 = n37 & 0x4000;
        if (n48 != 0) {
            n48 = 0;
            n26 = null;
        } else {
            n26 = n17;
        }
        int n49 = 0x8000 & n37;
        if (n49 != 0) {
            n49 = 0;
            n25 = null;
        } else {
            n25 = n18;
        }
        int n50 = 0x10000 & n37;
        if (n50 != 0) {
            n50 = 0;
            n24 = null;
        } else {
            n24 = n19;
        }
        int n51 = 131072;
        if ((n37 &= n51) != 0) {
            n37 = 0;
            n22 = null;
        } else {
            n22 = n20;
        }
        Intrinsics.checkNotNullParameter(object, "contentDescription");
        ia3_22.a = n36;
        ia3_22.b = n35;
        ia3_22.c = n34;
        ia3_22.d = n32;
        ia3_22.e = null;
        ia3_22.f = null;
        ia3_22.g = null;
        ia3_22.h = null;
        ia3_22.i = false;
        ia3_22.j = object;
        ia3_22.k = n30;
        ia3_22.l = n29;
        ia3_22.m = n28;
        ia3_22.n = n27;
        ia3_22.o = n26;
        ia3_22.p = n25;
        ia3_22.q = n24;
        ia3_22.r = n22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ia3_2;
        if (!bl3) {
            return false;
        }
        object = (ia3_2)object;
        Object object2 = this.a;
        Object object3 = ((ia3_2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((ia3_2)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((ia3_2)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((ia3_2)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((ia3_2)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((ia3_2)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((ia3_2)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.h;
        object3 = ((ia3_2)object).h;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.i;
        boolean bl4 = ((ia3_2)object).i;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.j;
        object3 = ((ia3_2)object).j;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.k;
        object3 = ((ia3_2)object).k;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.l;
        object3 = ((ia3_2)object).l;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.m;
        object3 = ((ia3_2)object).m;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.n;
        object3 = ((ia3_2)object).n;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.o;
        object3 = ((ia3_2)object).o;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.p;
        object3 = ((ia3_2)object).p;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.q;
        object3 = ((ia3_2)object).q;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.r;
        object = ((ia3_2)object).r;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.a;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.i ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        n3 = (object.hashCode() + n4) * 31;
        n7 = this.k;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.l;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.m;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.n;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.o;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.p;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.q;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        n7 = this.r;
        if (n7 != null) {
            n8 = ((Object)n7).hashCode();
        }
        return n3 + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VectorTextViewParams(drawableStartRes=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", drawableEndRes=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", drawableBottomRes=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", drawableTopRes=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", drawableStart=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", drawableEnd=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", drawableBottom=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", drawableTop=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", isRtlLayout=");
        boolean bl2 = this.i;
        stringBuilder.append(bl2);
        stringBuilder.append(", contentDescription=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", compoundDrawablePadding=");
        object = this.k;
        stringBuilder.append(object);
        stringBuilder.append(", iconWidth=");
        object = this.l;
        stringBuilder.append(object);
        stringBuilder.append(", iconHeight=");
        object = this.m;
        stringBuilder.append(object);
        stringBuilder.append(", compoundDrawablePaddingRes=");
        object = this.n;
        stringBuilder.append(object);
        stringBuilder.append(", tintColor=");
        object = this.o;
        stringBuilder.append(object);
        stringBuilder.append(", widthRes=");
        object = this.p;
        stringBuilder.append(object);
        stringBuilder.append(", heightRes=");
        object = this.q;
        stringBuilder.append(object);
        stringBuilder.append(", squareSizeRes=");
        object = this.r;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

