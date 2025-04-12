/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sc
 */
public final class sc_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sc_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (da1_2)object;
                Intrinsics.checkNotNullParameter(object, "$this$install");
                Object object2 = nn0_2.a;
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Object object3 = ((da1_2)object).f;
                Object object4 = ib1_2.i;
                int n4 = 3;
                Object object5 = new qg3_2(n4, null);
                ((hs2_2)object3).g((ks2_2)object4, (gx0_2)object5);
                object3 = nb1_2.g;
                object4 = new mn0_2((da1_2)object, null);
                object5 = ((da1_2)object).g;
                ((hs2_2)object5).g((ks2_2)object3, (gx0_2)object4);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = new qg3_2(n4, null);
                ((hs2_2)object5).g((ks2_2)object3, (gx0_2)object);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

