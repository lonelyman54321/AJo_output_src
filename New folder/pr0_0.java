/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Pr0
 */
public final class pr0_0
implements RK2 {
    public static final int b(long l2, long l3) {
        long l4 = 0xFFFFFFFFL;
        long l7 = l2 & l4;
        int n3 = (int)l7;
        int n4 = 0;
        int n7 = 1;
        n3 = n3 != 0 ? 1 : 0;
        int n8 = (int)(l4 &= l3);
        if (n8 != 0) {
            n4 = 1;
        }
        if (n3 != n4) {
            if (n3 != 0) {
                n7 = -1;
            }
            return n7;
        }
        int n10 = 32;
        float f5 = Float.intBitsToFloat((int)(l2 >> n10));
        float f6 = Float.intBitsToFloat((int)(l3 >> n10));
        return (int)Math.signum(f5 - f6);
    }

    public static final qp0_2 c(l1_0 l1_02, s30_0 object, String string2) {
        Intrinsics.checkNotNullParameter(l1_02, "<this>");
        String string3 = "decoder";
        Intrinsics.checkNotNullParameter(object, string3);
        object = l1_02.a((s30_0)object, string2);
        if (object != null) {
            return object;
        }
        m1_0.a(l1_02.c(), string2);
        throw null;
    }

    public static final b03_0 d(l1_0 object, Encoder object2, Object object3) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "encoder");
        String string2 = "value";
        Intrinsics.checkNotNullParameter(object3, string2);
        object2 = ((l1_0)object).b((Encoder)object2, object3);
        if (object2 == null) {
            object2 = Reflection.getOrCreateKotlinClass(object3.getClass());
            object = ((l1_0)object).c();
            Intrinsics.checkNotNullParameter(object2, "subClass");
            Intrinsics.checkNotNullParameter(object, "baseClass");
            object3 = object2.getSimpleName();
            if (object3 == null) {
                object3 = String.valueOf(object2);
            }
            m1_0.a((yn1_2)object, (String)object3);
            throw null;
        }
        return object2;
    }

    public wk2_0 a(wk2_0 object, Z92 object2) {
        int n3;
        int n4;
        Object object3;
        boolean bl2;
        object = ((yz0_2)object.get()).a.a.a.getData().asReadOnlyBuffer();
        Object object4 = hf_0.a;
        boolean n42 = ((Buffer)object).isReadOnly();
        if (!n42 && (bl2 = ((ByteBuffer)object).hasArray())) {
            object3 = ((ByteBuffer)object).array();
            int n7 = ((ByteBuffer)object).arrayOffset();
            int n8 = ((Buffer)object).limit();
            object4 = new hF$b((byte[])object3, n7, n8);
        } else {
            boolean bl3 = false;
            object4 = null;
        }
        if (object4 != null && (n4 = ((hF$b)object4).a) == 0 && (n3 = ((hF$b)object4).b) == (n4 = ((byte[])(object3 = ((hF$b)object4).c)).length)) {
            object = ((ByteBuffer)object).array();
        } else {
            object = ((ByteBuffer)object).asReadOnlyBuffer();
            int n10 = ((Buffer)object).limit();
            object4 = new byte[n10];
            n4 = 0;
            object3 = (ByteBuffer)((ByteBuffer)object).position(0);
            ((ByteBuffer)object).get((byte[])object4);
            object = object4;
        }
        object2 = new nf_1((byte[])object);
        return object2;
    }
}

