/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nP0
 */
public final class np0_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ np0_1(dr0_0 dr0_02, String string2, String string3, int n3) {
        this.a = 0;
        this.b = dr0_02;
        this.d = string2;
        this.e = string3;
        this.c = n3;
    }

    public /* synthetic */ np0_1(yT1 yT12, pq_0 pq_02, dr0_0 dr0_02, int n3) {
        this.a = 1;
        this.d = yT12;
        this.e = pq_02;
        this.b = dr0_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                yT1 yT12 = (yT1)this.d;
                Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
                dr0_0 dr0_02 = this.b;
                Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
                int n4 = Me3.b(this.c | 1);
                pq_0 pq_02 = (pq_0)this.e;
                la3_1.b(yT12, pq_02, dr0_02, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        dr0_0 dr0_03 = this.b;
        Intrinsics.checkNotNullParameter(dr0_03, "$fleekViewModel");
        String string2 = (String)this.d;
        Intrinsics.checkNotNullParameter(string2, "$action");
        int n7 = Me3.b(this.c | 1);
        String string3 = (String)this.e;
        pp0_1.e(dr0_03, string2, string3, (b30_0)object, n7);
        return Unit.a;
    }
}

