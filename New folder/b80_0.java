/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from b80
 */
public final class b80_0 {
    public static final void a(Sk3 sk3, u10 u102, b30_0 object, int n3) {
        int n4;
        object = object.g(-1985516685);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(sk3) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x13) == (n4 = 18) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2;
            Object object3;
            Object object4 = ((j30_0)object).v();
            if (object4 == (object3 = b30$a.a)) {
                object2 = null;
                object4 = new P70(0);
                ((j30_0)object).o(object4);
            }
            object4 = (P70)object4;
            object2 = ((j30_0)object).v();
            if (object2 == object3) {
                n4 = 0;
                object3 = null;
                object2 = new y70_0(object4, 0);
                ((j30_0)object).o(object2);
            }
            object3 = object2;
            object3 = (Function0)object2;
            object2 = new Yk3((P70)object4, sk3);
            boolean bl2 = sk3.j();
            n7 = n7 << 12 & 0x70000;
            int n10 = n7 | 0x36;
            C70.b((P70)object4, (Function0)object3, (Yk3)object2, null, bl2, u102, (b30_0)object, n10);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            Z70 z70 = new Z70(sk3, u102, n3);
            ((CF2)object).d = z70;
        }
    }
}

