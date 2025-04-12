/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager$NetworkCallback
 *  android.net.NetworkRequest
 */
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fV1
 */
public final class fv1_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b60 c;
    public final /* synthetic */ gv1_0 d;

    public fv1_1(b60 b602, gv1_0 gv1_02, f80_0 f80_02) {
        this.c = b602;
        this.d = gv1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        b60 b602 = this.c;
        gv1_0 gv1_02 = this.d;
        fv1_1 fv1_12 = new fv1_1(b602, gv1_02, f80_02);
        fv1_12.b = object;
        return fv1_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (fv1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fv1_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (pz2_2)this.b;
        NetworkRequest networkRequest = this.c.d();
        Object object2 = null;
        if (networkRequest == null) {
            object.z().q(null);
            return Unit.a;
        }
        gv1_0 gv1_02 = this.d;
        fV1$b fV1$b = new fV1$b(gv1_02, (pz2_2)object, null);
        object2 = Ae3.d((i90_0)object, null, null, fV1$b, 3);
        fV1$c fV1$c = new fV1$c((mb3_2)object2, (pz2_2)object);
        object2 = qx1.a();
        object2.getClass();
        object2 = gv1_02.a;
        object2.registerNetworkCallback(networkRequest, (ConnectivityManager.NetworkCallback)fV1$c);
        fV1$a fV1$a = new fV1$a(gv1_02, fV1$c);
        this.a = n4;
        object = lz2_1.a((pz2_2)object, fV1$a, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

