/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class vr3 {
    public final OI0 a;
    public final d73_0 b;
    public final BR c;
    public final boolean d;
    public final Map e;

    public vr3() {
        this(null, null, null, null, false, null, 63);
    }

    public /* synthetic */ vr3(OI0 object, d73_0 object2, BR object3, hs2_0 object4, boolean bl2, LinkedHashMap map2, int n3) {
        boolean bl3;
        OI0 oI0;
        int n4 = n3 & 1;
        hs2_0 hs2_02 = null;
        if (n4 != 0) {
            n4 = 0;
            oI0 = null;
        } else {
            oI0 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        if (n7 == 0) {
            hs2_02 = object4;
        }
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        n7 = n3 & 0x20;
        if (n7 != 0) {
            map2 = fh1_2.f();
        }
        object = this;
        object2 = oI0;
        object3 = object5;
        object4 = object6;
        this(oI0, (d73_0)object5, (BR)object6, hs2_02, bl3, map2);
    }

    public vr3(OI0 oI0, d73_0 d73_02, BR bR, hs2_0 hs2_02, boolean bl2, Map map2) {
        this.a = oI0;
        this.b = d73_02;
        this.c = bR;
        this.d = bl2;
        this.e = map2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof vr3;
        if (!bl3) {
            return false;
        }
        object = (vr3)object;
        Object object2 = this.a;
        Object object3 = ((vr3)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((vr3)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((vr3)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = null;
        boolean bl4 = false;
        object2 = null;
        object.getClass();
        bl3 = Intrinsics.areEqual(null, null);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        bl4 = ((vr3)object).d;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.e;
        object = ((vr3)object).e;
        boolean bl5 = Intrinsics.areEqual(object3, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        OI0 oI0 = this.a;
        if (oI0 == null) {
            n4 = 0;
            oI0 = null;
        } else {
            n4 = oI0.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((d73_0)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((BR)object).hashCode();
        }
        n4 = ((n4 + n3) * 31 + 0) * 31;
        n7 = this.d;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        return ((Object)this.e).hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransitionData(fade=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", slide=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", changeSize=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", scale=");
        stringBuilder.append((Object)null);
        stringBuilder.append(", hold=");
        boolean bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", effectsMap=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

