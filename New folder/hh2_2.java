/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.databinding.ItemRowAjiogramProductsPdpBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Hh2
 */
public final class hh2_2
extends qg3_2
implements Function2 {
    public ItemRowAjiogramProductsPdpBinding a;
    public int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public hh2_2(Ref$ObjectRef ref$ObjectRef, f80_0 f80_02) {
        this.c = ref$ObjectRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.c;
        object = new hh2_2(ref$ObjectRef, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hh2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hh2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        block11: {
            Object object2;
            int n3;
            long l2;
            j90_0 j90_02;
            block13: {
                int n4;
                int n7;
                Unit unit;
                int n8;
                block10: {
                    block12: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n10 = this.b;
                        l2 = 1000L;
                        n3 = 3;
                        n8 = 2;
                        unit = null;
                        n7 = 1;
                        if (n10 == 0) break block10;
                        if (n10 == n7) break block11;
                        if (n10 == n8) break block12;
                        if (n10 != n3) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        break block11;
                    }
                    object2 = this.a;
                    vl2_2.b(object);
                    break block13;
                }
                vl2_2.b(object);
                object = this.c;
                object2 = ((ih2_1)((Ref$ObjectRef)object).element).g;
                if (object2 == null) return unit;
                RecyclerView$o recyclerView$o = ((ItemRowAjiogramProductsPdpBinding)object2).rvAjiogramProducts.getLayoutManager();
                int n14 = recyclerView$o instanceof LinearLayoutManager;
                if (n14 != 0) {
                    recyclerView$o = (LinearLayoutManager)recyclerView$o;
                } else {
                    n4 = 0;
                    recyclerView$o = null;
                }
                if (recyclerView$o != null) {
                    n4 = ((LinearLayoutManager)recyclerView$o).findLastCompletelyVisibleItemPosition();
                } else {
                    n4 = 0;
                    recyclerView$o = null;
                }
                Object object3 = ((ItemRowAjiogramProductsPdpBinding)object2).rvAjiogramProducts;
                n14 = object3.canScrollHorizontally(n7);
                if (n14 != 0) {
                    object3 = ((ih2_1)((Ref$ObjectRef)object).element).h;
                    if (object3 != null) {
                        object3 = ((ch2_2)object3).a;
                        n14 = object3.size();
                    } else {
                        n14 = 0;
                        object3 = null;
                    }
                    if (n4 < (n14 -= n7)) {
                        object2 = ((ItemRowAjiogramProductsPdpBinding)object2).rvAjiogramProducts;
                        ih2_1 ih2_12 = (ih2_1)((Ref$ObjectRef)object).element;
                        int n15 = ih2_12.m;
                        ((RecyclerView)object2).smoothScrollBy(n15, 0);
                        long l3 = ((ih2_1)((Ref$ObjectRef)object).element).l;
                        this.b = n7;
                        object = bo0_2.a(l3, this);
                        if (object != j90_02) return Unit.a;
                        return j90_02;
                    }
                }
                this.a = object2;
                this.b = n8;
                object = bo0_2.a(l2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            ((ItemRowAjiogramProductsPdpBinding)object2).rvAjiogramProducts.smoothScrollToPosition(0);
            this.a = null;
            this.b = n3;
            object = bo0_2.a(l2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        vl2_2.b(object);
        return Unit.a;
    }
}

