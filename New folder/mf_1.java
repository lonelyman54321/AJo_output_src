/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MF
 */
public final class mf_1 {
    public static Object a(gf_2 object, i72_0 object2, f80_0 f80_02) {
        int n3;
        ux2_2 ux2_22;
        block9: {
            block8: {
                String string2;
                byte[] byArray;
                int n4;
                ee_2 ee_22;
                block7: {
                    ee_22 = object.b();
                    ee_22.getClass();
                    n4 = 1;
                    ux2_22 = ee_22.h(n4);
                    int n7 = ux2_22.c;
                    byArray = ux2_22.a;
                    int n8 = byArray.length - n7;
                    ByteBuffer byteBuffer = ByteBuffer.wrap(byArray, n7, n8);
                    Intrinsics.checkNotNull(byteBuffer);
                    ((i72_0)object2).invoke(byteBuffer);
                    n3 = byteBuffer.position() - n7;
                    string2 = "data";
                    if (n3 != n4) break block7;
                    Intrinsics.checkNotNullParameter(byArray, string2);
                    ux2_22.c = n4 = ux2_22.c + n3;
                    long l2 = ee_22.c;
                    long l3 = n3;
                    ee_22.c = l2 += l3;
                    break block8;
                }
                if (n3 < 0 || n3 > (n4 = ux2_22.a())) break block9;
                if (n3 != 0) {
                    Intrinsics.checkNotNullParameter(byArray, string2);
                    ux2_22.c = n4 = ux2_22.c + n3;
                    long l4 = ee_22.c;
                    long l7 = n3;
                    ee_22.c = l4 += l7;
                } else {
                    n3 = (int)(yx2_2.a(ux2_22) ? 1 : 0);
                    if (n3 != 0) {
                        ee_22.c();
                    }
                }
            }
            object = object.d(f80_02);
            object2 = j90_0.COROUTINE_SUSPENDED;
            if (object != object2) {
                object = Unit.a;
            }
            return object;
        }
        object = wk0_0.a(n3, "Invalid number of bytes written: ", ". Should be in 0..");
        n3 = ux2_22.a();
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

