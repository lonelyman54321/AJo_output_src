/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/*
 * Renamed from vG1
 */
public final class vg1_2
extends a
implements xm3_0 {
    public static final vg1$a_0 b;
    public final Map a;

    static {
        vg1$a_0 vg1$a_0;
        b = vg1$a_0 = new Object();
    }

    public vg1_2() {
        this((Object)null);
    }

    public vg1_2(Object object) {
        object = tg1_1.a;
        if (object != null) {
            object = object.a();
            vg1$a_0 vg1$a_0 = b;
            super(vg1$a_0);
            this.a = object;
            return;
        }
        object = new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        throw object;
    }

    public static void J0(Map object) {
        String string2;
        block5: {
            block4: {
                block2: {
                    block3: {
                        string2 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";
                        if (object != null) break block2;
                        object = tg1_1.a;
                        if (object == null) break block3;
                        object.clear();
                        break block4;
                    }
                    object = new IllegalStateException(string2);
                    throw object;
                }
                ug1_1 ug1_12 = tg1_1.a;
                if (ug1_12 == null) break block5;
                ug1_12.b((Map)object);
            }
            return;
        }
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Object G0(CoroutineContext object) {
        object = tg1_1.a;
        if (object != null) {
            object = object.a();
            vg1_2.J0(this.a);
            return object;
        }
        object = new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        throw object;
    }

    public final void P(Object object) {
        vg1_2.J0((Map)object);
    }
}

