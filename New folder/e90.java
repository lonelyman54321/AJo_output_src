/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

public final class e90
extends Lambda
implements gx0_2 {
    public final /* synthetic */ i72 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ql3_0 e;
    public final /* synthetic */ Sk3 f;
    public final /* synthetic */ Vt1 g;

    public e90(i72 i722, boolean bl2, ql3_0 ql3_02, Sk3 sk3, Vt1 vt1) {
        this.c = i722;
        this.d = bl2;
        this.e = ql3_02;
        this.f = sk3;
        this.g = vt1;
        super(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        Object object4;
        Number number;
        Number number2 = (Number)object;
        int n4 = number2.intValue();
        number = number;
        int n7 = number.intValue();
        object4 = (Boolean)object4;
        boolean bl2 = (Boolean)object4;
        Object object5 = this.c;
        if (!bl2) {
            n4 = object5.a(n4);
        }
        if (!bl2) {
            n7 = object5.a(n7);
        }
        boolean bl3 = this.d;
        boolean bl4 = false;
        ql3_0 ql3_02 = null;
        if (!bl3) {
            return bl4;
        }
        object5 = this.e;
        long l2 = ((ql3_0)object5).b;
        int n8 = mm3.c;
        n8 = 32;
        long l3 = l2 >> n8;
        int n10 = (int)l3;
        if (n4 == n10 && n7 == (n3 = (int)(l2 &= (l3 = 0xFFFFFFFFL)))) {
            return bl4;
        }
        int n14 = Math.min(n4, n7);
        Sk3 sk3 = this.f;
        if (n14 >= 0) {
            n14 = Math.max(n4, n7);
            object5 = ((ql3_0)object5).a;
            String string2 = ((Sl)object5).a;
            n8 = string2.length();
            if (n14 <= n8) {
                n14 = 1;
                if (!bl2 && n4 != n7) {
                    sk3.h(n14 != 0);
                } else {
                    sk3.t(false);
                    object4 = x21_0.None;
                    sk3.r((x21_0)((Object)object4));
                }
                object4 = this.g.t;
                long l4 = nm3.a(n4, n7);
                n3 = 0;
                sk3 = null;
                ql3_02 = new ql3_0((Sl)object5, l4, null);
                ((Vt1$b)object4).invoke(ql3_02);
                bl4 = true;
                return bl4;
            }
        }
        sk3.t(false);
        x21_0 x21_02 = x21_0.None;
        sk3.r(x21_02);
        return bl4;
    }
}

