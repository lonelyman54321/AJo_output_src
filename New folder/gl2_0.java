/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from gl2
 */
public final class gl2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Cl2 d;
    public final /* synthetic */ i90_0 e;

    public gl2_0(boolean bl2, hm0_0 hm0_02, c80 c802) {
        this.c = bl2;
        this.d = hm0_02;
        this.e = c802;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        boolean bl2 = this.c;
        Object object2 = this.e;
        Object object3 = this.d;
        if (bl2) {
            object3 = (hm0_0)object3;
            object2 = (c80)object2;
            Lambda lambda = new cl2_0((hm0_0)object3, (c80)object2);
            Object object4 = RY2.a;
            object4 = yY2.w;
            H1 h1 = new H1(null, lambda);
            object.a((TY2)object4, h1);
            lambda = new dl2((hm0_0)object3, (c80)object2);
            object2 = yY2.y;
            object3 = new H1(null, lambda);
            object.a((TY2)object2, object3);
        } else {
            object3 = (hm0_0)object3;
            object2 = (c80)object2;
            Lambda lambda = new el2_0((hm0_0)object3, (c80)object2);
            Object object5 = RY2.a;
            object5 = yY2.x;
            H1 h1 = new H1(null, lambda);
            object.a((TY2)object5, h1);
            object5 = null;
            lambda = new fl2(0, object3, object2);
            object2 = yY2.z;
            object3 = new H1(null, lambda);
            object.a((TY2)object2, object3);
        }
        return Unit.a;
    }
}

