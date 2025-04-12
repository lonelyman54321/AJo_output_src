/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class y61 {
    public static final gh3_2 a;
    public static final gh3_2 b;
    public static final gh3_2 c;
    public static final gh3_2 d;
    public static final gh3_2 e;
    public static final yy0_2 f;
    public static final yy0_2 g;

    static {
        Object object = new gh3_2("COMPLETING_ALREADY");
        a = object;
        object = new gh3_2("COMPLETING_WAITING_CHILDREN");
        b = object;
        object = new gh3_2("COMPLETING_RETRY");
        c = object;
        object = new gh3_2("TOO_LATE_TO_CANCEL");
        d = object;
        object = new gh3_2("SEALED");
        e = object;
        f = object = new yy0_2(false);
        g = object = new yy0_2(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(re3_0 re3_02, re3_0 re3_03, Rv1 rv1) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(re3_02, "<this>");
        String string2 = "loadType";
        Intrinsics.checkNotNullParameter((Object)rv1, string2);
        boolean bl2 = true;
        if (re3_03 == null || (n4 = re3_03 instanceof rE3$b) != 0 && (n4 = re3_02 instanceof rE3$a) != 0) return bl2;
        n4 = re3_02 instanceof rE3$b;
        if (n4 != 0 && (n4 = re3_03 instanceof rE3$a) != 0) {
            return false;
        }
        n4 = re3_02.c;
        int n7 = re3_03.c;
        if (n4 != n7 || (n4 = re3_02.d) != (n7 = re3_03.d)) return bl2;
        int n8 = re3_03.a(rv1);
        if (n8 > (n3 = re3_02.a(rv1))) return bl2;
        return false;
    }

    public static final Object b(Object object) {
        Object object2;
        boolean bl2 = object instanceof cg1_2;
        if (bl2) {
            object2 = object;
            object2 = (cg1_2)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && (object2 = ((cg1_2)object2).a) != null) {
            object = object2;
        }
        return object;
    }
}

