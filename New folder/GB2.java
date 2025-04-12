/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j_0;
import androidx.datastore.preferences.protobuf.k_0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s$a;
import androidx.datastore.preferences.protobuf.s$b;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import java.util.concurrent.ConcurrentHashMap;

public final class GB2 {
    public static final GB2 c;
    public final JG1 a;
    public final ConcurrentHashMap b;

    static {
        GB2 gB2;
        c = gB2 = new GB2();
    }

    public GB2() {
        Object object = new ConcurrentHashMap();
        this.b = object;
        this.a = object = new JG1();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final st2_0 a(Class object) {
        void var3_19;
        p.a(object, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        st2_0 st2_02 = (st2_0)concurrentHashMap.get(object);
        if (st2_02 == null) {
            void var3_17;
            Object object2;
            JG1 jG1 = this.a;
            jG1.getClass();
            Class clazz = E.a;
            Class<n> clazz2 = n.class;
            boolean bl2 = clazz2.isAssignableFrom((Class<?>)object);
            if (!bl2 && (object2 = E.a) != null && !(bl2 = ((Class)object2).isAssignableFrom((Class<?>)object))) {
                object = new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                throw object;
            }
            uO1 uO12 = jG1.a;
            object2 = uO12.messageInfoFor((Class)object);
            boolean bl3 = object2.isMessageSetWireFormat();
            Object object3 = "Protobuf runtime is not correctly loaded.";
            if (bl3) {
                bl3 = clazz2.isAssignableFrom((Class<?>)object);
                if (bl3) {
                    j_0 j_02 = E.d;
                    k_0 k_02 = LH0.a;
                    object2 = object2.getDefaultInstance();
                    object3 = new A(j_02, k_02, (wo1_1)object2);
                } else {
                    H h3 = E.b;
                    j j3 = LH0.b;
                    if (j3 == null) {
                        object = new IllegalStateException((String)object3);
                        throw object;
                    }
                    object2 = object2.getDefaultInstance();
                    object3 = new A(h3, j3, (wo1_1)object2);
                }
                Object object4 = object3;
            } else {
                bl3 = clazz2.isAssignableFrom((Class<?>)object);
                if (bl3) {
                    FB2 fB2;
                    FB2 fB22 = object2.getSyntax();
                    if (fB22 == (fB2 = FB2.PROTO2)) {
                        object3 = lZ1.b;
                        s$b s$b = s.b;
                        j_0 j_03 = E.d;
                        k_0 k_03 = LH0.a;
                        x x5 = WG1.b;
                        z z5 = z.q((tO1)object2, (kZ1)object3, s$b, j_03, k_03, x5);
                    } else {
                        object3 = lZ1.b;
                        s$b s$b = s.b;
                        j_0 j_04 = E.d;
                        x x8 = WG1.b;
                        Object var11_39 = null;
                        z z6 = z.q((tO1)object2, (kZ1)object3, s$b, j_04, null, x8);
                    }
                } else {
                    FB2 fB2;
                    FB2 fB23 = object2.getSyntax();
                    if (fB23 == (fB2 = FB2.PROTO2)) {
                        kZ1 kZ12 = lZ1.a;
                        s$a s$a = s.a;
                        H h5 = E.b;
                        j j5 = LH0.b;
                        if (j5 == null) {
                            object = new IllegalStateException((String)object3);
                            throw object;
                        }
                        w w4 = WG1.a;
                        object3 = kZ12;
                        z z8 = z.q((tO1)object2, kZ12, s$a, h5, j5, w4);
                    } else {
                        object3 = lZ1.a;
                        s$a s$a = s.a;
                        H h7 = E.c;
                        w w5 = WG1.a;
                        Object var11_41 = null;
                        z z14 = z.q((tO1)object2, (kZ1)object3, s$a, h7, null, w5);
                    }
                }
            }
            object = (st2_0)concurrentHashMap.putIfAbsent(object, var3_17);
            if (object != null) {
                Object object5 = object;
            }
        }
        return var3_19;
    }
}

