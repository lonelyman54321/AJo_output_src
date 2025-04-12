/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.analytics.events.PlpListViewEvents;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vv2$a$a
 */
public final class vv2$a$a_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ vv2$a_2 b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ vv2_1 d;

    public vv2$a$a_0(vv2$a_2 vv2$a_2, RecyclerView recyclerView, vv2_1 vv2_12, f80_0 f80_02) {
        this.b = vv2$a_2;
        this.c = recyclerView;
        this.d = vv2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        RecyclerView recyclerView = this.c;
        vv2_1 vv2_12 = this.d;
        vv2$a_2 vv2$a_2 = this.b;
        object = new vv2$a$a_0(vv2$a_2, recyclerView, vv2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vv2$a$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vv2$a$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            long l2 = this.b.b;
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = this.c;
        int n7 = ig2_2.a((RecyclerView)object);
        int n8 = -1;
        if (n7 == n8) return Unit.a;
        vv2_1 vv2_12 = this.d;
        n3 = vv2_12.Q0;
        if (n3 != n7) {
            PlpListViewEvents plpListViewEvents = PlpListViewEvents.Companion.getInstance();
            n4 = vv2_12.Q0;
            Product product = vv2_12.N0;
            plpListViewEvents.logImageInteractEvents(n7, n4, product);
            vv2_12.Q0 = n7;
        }
        return Unit.a;
    }
}

