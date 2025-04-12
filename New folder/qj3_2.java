/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from qJ3
 */
public final class qj3_2 {
    public static final SerialDescriptor a(SerialDescriptor object, i0_0 object2) {
        Object object3 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "module");
        Object object4 = object.getKind();
        Object object5 = XZ2$a.a;
        boolean bl2 = Intrinsics.areEqual(object4, object5);
        if (bl2) {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            Intrinsics.checkNotNullParameter(object, "descriptor");
            object3 = s70_0.b((SerialDescriptor)object);
            bl2 = false;
            object4 = null;
            if (object3 != null && (object3 = ((i0_0)object2).K((yn1_2)object3, (List)(object5 = mz0_2.a))) != null) {
                object4 = object3.getDescriptor();
            }
            if (object4 != null && (object2 = qj3_2.a((SerialDescriptor)object4, (i0_0)object2)) != null) {
                object = object2;
            }
        } else {
            boolean bl3 = object.isInline();
            if (bl3) {
                bl3 = false;
                object3 = null;
                object = qj3_2.a(object.g(0), (i0_0)object2);
            }
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final pj3_2 b(ml1_2 object, SerialDescriptor serialDescriptor) {
        void var0_7;
        SerialDescriptor serialDescriptor2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor2, "desc");
        Object object2 = serialDescriptor2.getKind();
        boolean bl2 = object2 instanceof nw2_2;
        if (bl2) {
            pj3_2 pj3_22 = pj3_2.POLY_OBJ;
            return var0_7;
        } else {
            Ye3$b ye3$b = Ye3$b.a;
            bl2 = Intrinsics.areEqual(object2, ye3$b);
            if (bl2) {
                pj3_2 pj3_23 = pj3_2.LIST;
                return var0_7;
            } else {
                Ye3$c ye3$c = Ye3$c.a;
                boolean bl3 = Intrinsics.areEqual(object2, ye3$c);
                if (bl3) {
                    XZ2$b xZ2$b;
                    bl3 = false;
                    serialDescriptor2 = serialDescriptor2.g(0);
                    object2 = object.b;
                    bl2 = (object2 = (serialDescriptor2 = qj3_2.a(serialDescriptor2, (i0_0)object2)).getKind()) instanceof wz2_2;
                    if (!bl2 && !(bl3 = Intrinsics.areEqual(object2, xZ2$b = XZ2$b.a))) {
                        sl1_2 sl1_22 = object.a;
                        boolean bl4 = sl1_22.d;
                        if (!bl4) throw HT2.b(serialDescriptor2);
                        pj3_2 pj3_24 = pj3_2.LIST;
                        return var0_7;
                    } else {
                        pj3_2 pj3_25 = pj3_2.MAP;
                    }
                    return var0_7;
                } else {
                    pj3_2 pj3_26 = pj3_2.OBJ;
                }
            }
        }
        return var0_7;
    }
}

