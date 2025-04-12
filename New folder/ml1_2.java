/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Ml1
 */
public abstract class ml1_2
implements ge3_1 {
    public static final ml1$a_0 d;
    public final sl1_2 a;
    public final i0_0 b;
    public final pp0_2 c;

    static {
        ml1$a_0 ml1$a_0;
        Object object;
        su_1 su_12 = su_1.POLYMORPHIC;
        sl1_2 sl1_22 = object;
        object = new sl1_2(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, su_12);
        object = p03.a;
        d = ml1$a_0 = new ml1_2(sl1_22, (yz2_2)object);
    }

    public ml1_2(sl1_2 object, yz2_2 yz2_22) {
        this.a = object;
        this.b = yz2_22;
        this.c = object = new pp0_2();
    }

    public final i0_0 a() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String b(b03_0 object, Object object2) {
        void var8_14;
        void var8_12;
        Intrinsics.checkNotNullParameter(object, "serializer");
        lm1_2 lm1_22 = new Object();
        cs_2 cs_22 = cs_2.c;
        // MONITORENTER : cs_22
        Object object3 = cs_22.a;
        int n3 = ((fp_2)object3).isEmpty();
        int n4 = 0;
        Object var8_10 = null;
        object3 = n3 != 0 ? null : ((fp_2)object3).removeLast();
        object3 = (char[])object3;
        if (object3 != null) {
            n3 = cs_22.b;
            n4 = ((Object)object3).length;
            cs_22.b = n3 -= n4;
            Object object4 = object3;
        }
        if (var8_12 == null) {
            int n7 = 128;
            char[] cArray = new char[n7];
        }
        lm1_22.a = var8_14;
        try {
            jm1_1.a(this, lm1_22, (b03_0)object, object2);
            object = lm1_22.toString();
            return object;
        }
        finally {
            lm1_22.e();
        }
    }

    public final Object c(qp0_2 object, String object2) {
        Intrinsics.checkNotNullParameter(object, "deserializer");
        Intrinsics.checkNotNullParameter(object2, "string");
        object2 = ke3_1.a(this, (String)object2);
        pj3_2 pj3_22 = pj3_2.OBJ;
        SerialDescriptor serialDescriptor = object.getDescriptor();
        ce3_2 ce3_22 = new ce3_2(this, pj3_22, (q0_0)object2, serialDescriptor, null);
        object = ce3_22.e((qp0_2)object);
        ((q0_0)object2).p();
        return object;
    }

    public final JsonElement f(b03_0 object, Serializable serializable) {
        Object object2 = "serializer";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(this, "json");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = new Ref$ObjectRef();
        int n3 = 1;
        A12 a12 = new A12(object2, n3);
        nm1_2 nm1_22 = new nm1_2(this, a12);
        nm1_22.B((b03_0)object, serializable);
        object = ((Ref$ObjectRef)object2).element;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("result");
            object = null;
        } else {
            object = (JsonElement)object;
        }
        return object;
    }

    public final JsonElement g(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        im1_2 im1_22 = im1_2.a;
        return (JsonElement)this.c(im1_22, string2);
    }
}

