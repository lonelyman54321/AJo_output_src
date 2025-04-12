/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from cS2
 */
public final class cs2_1
implements bs2_1 {
    public static final ds2_0 d;
    public final Map a;
    public final LinkedHashMap b;
    public iS2 c;

    static {
        ds2_0 ds2_02 = CS2.a;
        cs2$a_1 cs2$a_1 = cs2$a_1.c;
        cs2$b_0 cs2$b_0 = cs2$b_0.c;
        d = ds2_02 = new ds2_0(cs2$a_1, cs2$b_0);
    }

    public cs2_1() {
        this(0);
    }

    public /* synthetic */ cs2_1(int n3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this(linkedHashMap);
    }

    public cs2_1(Map map2) {
        this.a = map2;
        this.b = map2;
    }

    public final void c(Object object, u10 object2, b30_0 object3, int n3) {
        Object object4;
        int n4;
        object3 = object3.g(-1198538093);
        int n7 = n3 & 6;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object3).x(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n8 = n3 & 0x30;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object3).x(object2) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n3 & 0x180) == 0) {
            n8 = (int)(((j30_0)object3).x(this) ? 1 : 0);
            n8 = n8 != 0 ? 256 : 128;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x93) == (n4 = 146) && (n8 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            ((j30_0)object3).y(object);
            Object object5 = ((j30_0)object3).v();
            b30$a$a b30$a$a = b30$a.a;
            if (object5 == b30$a$a) {
                object5 = this.c;
                n8 = object5 != null ? (int)(object5.a(object) ? 1 : 0) : 1;
                if (n8 != 0) {
                    object5 = new cS2$c(this, object);
                    ((j30_0)object3).o(object5);
                } else {
                    object2 = new StringBuilder("Type of the key ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    object = ((StringBuilder)object2).toString();
                    object = object.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
            }
            object5 = (cS2$c)object5;
            Object object6 = kS2.a;
            Object object7 = ((cS2$c)object5).c;
            object6 = ((vc3_1)object6).c(object7);
            n7 = n7 & 0x70 | 8;
            L30.a((MB2)object6, (Function2)object2, (b30_0)object3, n7);
            object4 = Unit.a;
            boolean bl2 = ((j30_0)object3).x(this);
            boolean bl3 = ((j30_0)object3).x(object);
            bl2 |= bl3;
            bl3 = ((j30_0)object3).x(object5);
            object7 = ((j30_0)object3).v();
            if ((bl2 |= bl3) || object7 == b30$a$a) {
                object7 = new es2_0((cS2$c)object5, this, object);
                ((j30_0)object3).o(object7);
            }
            object7 = (Function1)object7;
            ly0_0.b(object4, (Function1)object7, (b30_0)object3);
            ((j30_0)object3).t();
        }
        object3 = ((j30_0)object3).X();
        if (object3 != null) {
            object4 = new fs2_0(this, object, (u10)object2, n3);
            ((CF2)object3).d = object4;
        }
    }

    public final void d(Object object) {
        Object object2 = (cS2$c)this.b.get(object);
        if (object2 != null) {
            object = null;
            ((cS2$c)object2).b = false;
        } else {
            object2 = this.a;
            object2.remove(object);
        }
    }
}

