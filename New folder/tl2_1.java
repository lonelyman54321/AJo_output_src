/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TL2
 */
public final class tl2_1
implements gx0_2 {
    public final /* synthetic */ pl2_1 a;

    public tl2_1(pl2_1 pl2_12) {
        this.a = pl2_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        object = (rZ)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$ResultScreen";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
            return Unit.a;
        }
        object = this.a;
        object3 = (am2_2)pl2_1.Pa((pl2_1)object).c.getValue();
        object4 = Unit.a;
        ql2_1 ql2_12 = null;
        Object object5 = new rl2_1((am2_2)object3, (pl2_1)object, null);
        ly0_0.d((b30_0)object2, object4, (Function2)object5);
        object5 = am2$c_0.a;
        int n7 = Intrinsics.areEqual(object3, object5);
        if (n7 == 0 && (n7 = Intrinsics.areEqual(object3, object5 = am2$b_0.a)) == 0) {
            n7 = object3 instanceof am2$a_0;
            if (n7 != 0) {
                int n8 = -1051986745;
                object2.K(n8);
                object3 = (am2$a_0)object3;
                n7 = 1;
                object4 = new bX1((Fragment)object, n7);
                n4 = 8;
                el2_2.a((am2$a_0)object3, (bX1)object4, (b30_0)object2, n4);
                object2.E();
                return Unit.a;
            }
            n7 = object3 instanceof aM2$d;
            if (n7 != 0) {
                n7 = -1051544220;
                object2.K(n7);
                object5 = new sl2_2((pl2_1)object, null);
                ly0_0.d((b30_0)object2, object4, (Function2)object5);
                object4 = object3;
                object4 = (aM2$d)object3;
                n3 = 1;
                object5 = new sz_1(object, n3);
                ql2_12 = new ql2_1((pl2_1)object);
                nj0_1 nj0_12 = new nj0_1((Fragment)object, n3);
                int n10 = 8;
                tm2_1.a((aM2$d)object4, (sz_1)object5, ql2_12, nj0_12, (b30_0)object2, n10);
                object2.E();
                return Unit.a;
            }
            object2.K(-726674528);
            object2.E();
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        n4 = -1052083062;
        object2.K(n4);
        object2.E();
        return Unit.a;
    }
}

