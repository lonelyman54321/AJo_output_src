/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from xU0
 */
public final class xu0_0 {
    public final nr1_1 a;
    public final WR1 b;
    public boolean c;

    public xu0_0() {
        Object object = et2_1.d();
        this.a = object;
        Object[] objectArray = new Function0[16];
        this.b = object = new WR1(objectArray);
    }

    public static final void a(xu0_0 object) {
        ((xu0_0)object).a.c();
        int n3 = 0;
        ((xu0_0)object).c = false;
        object = ((xu0_0)object).b;
        int n4 = ((WR1)object).c;
        if (n4 > 0) {
            Object[] objectArray = ((WR1)object).a;
            do {
                Function0 function0 = (Function0)objectArray[n3];
                function0.invoke();
            } while (++n3 < n4);
        }
        ((WR1)object).g();
    }

    public static final void b(xu0_0 xu0_02) {
        xu0_0 xu0_03 = xu0_02;
        nr1_1 nr1_12 = xu0_02.a;
        Object[] objectArray = nr1_12.b;
        long[] lArray = nr1_12.a;
        int n3 = lArray.length + -2;
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                long l2 = lArray[n4];
                long l3 = l2 ^ (long)-1;
                int n7 = 7;
                l3 = l3 << n7 & l2;
                long l4 = -9187201950435737472L;
                long l7 = (l3 &= l4) - l4;
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object != false) {
                    int n8 = ~(n4 - n3) >>> 31;
                    int n10 = 8;
                    n8 = 8 - n8;
                    for (n7 = 0; n7 < n8; ++n7) {
                        long l8 = 0xFFL & l2;
                        long l12 = 128L;
                        long l14 = l8 - l12;
                        Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object2 < 0) {
                            int n14 = (n4 << 3) + n7;
                            FocusTargetNode focusTargetNode = (FocusTargetNode)objectArray[n14];
                            focusTargetNode.getClass();
                            uu0_1 uu0_12 = (uu0_1)go0.g((fo0)focusTargetNode).getFocusOwner().c().a.b(focusTargetNode);
                            if (uu0_12 != null) {
                                focusTargetNode.p = uu0_12;
                            } else {
                                bh1_1.d("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                        }
                        l2 >>= n10;
                    }
                    if (n8 != n10) break;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        nr1_12.c();
        xu0_03.c = false;
        xu0_03.b.g();
    }
}

