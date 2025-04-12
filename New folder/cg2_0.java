/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cG2
 */
public final class cg2_0
implements ug1_1 {
    public static d93_0 c(byte[] object) {
        int n3 = ((byte[])object).length;
        Intrinsics.checkNotNullParameter(object, "content");
        ee_2 ee_22 = new ee_2();
        ee_22.n((byte[])object, 0, n3);
        Intrinsics.checkNotNullParameter(ee_22, "source");
        object = new d93_0;
        object(ee_22);
        return object;
    }

    public static final aG2 d(long l2, long l3) {
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        float f7 = e72.d(l2);
        float f8 = C63.d(l3) + f7;
        float f11 = e72.e(l2);
        float f12 = C63.b(l3) + f11;
        aG2 aG22 = new aG2(f5, f6, f8, f12);
        return aG22;
    }

    public Map a() {
        return null;
    }

    public void b(Map map2) {
    }

    public void clear() {
    }
}

