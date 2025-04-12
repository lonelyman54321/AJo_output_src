/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YM0
 */
public final class ym0_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ym0_2(Object object, int n3, int n4, Object object2) {
        this.a = n4;
        this.c = object;
        this.d = object2;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                String string2 = (String)this.c;
                Intrinsics.checkNotNullParameter(string2, "$title");
                String string3 = (String)this.d;
                Intrinsics.checkNotNullParameter(string3, "$desc");
                int n4 = Me3.b(this.b | 1);
                ro3_0.b(string2, string3, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        ob0_1 ob0_12 = (ob0_1)this.c;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        yT1 yT12 = (yT1)this.d;
        Intrinsics.checkNotNullParameter(yT12, "$navController");
        int n7 = Me3.b(this.b | 1);
        gn0_2.a(ob0_12, yT12, (b30_0)object, n7);
        return Unit.a;
    }
}

