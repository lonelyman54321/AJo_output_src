/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$f$a;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.b_0;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k$e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public abstract class Ql2
extends RecyclerView$f {
    public boolean a;
    public final Cq b;
    public final es0_2 c;

    public Ql2(k$e object) {
        Cq cq2;
        c c2 = ir0_2.a;
        c2 = bg1_1.a;
        wm0_2 wm0_22 = ir0_2.a;
        Intrinsics.checkNotNullParameter(object, "diffCallback");
        Intrinsics.checkNotNullParameter(c2, "mainDispatcher");
        Intrinsics.checkNotNullParameter(wm0_22, "workerDispatcher");
        b_0 b_02 = new b_0(this);
        this.b = cq2 = new Cq((k$e)object, b_02, c2, wm0_22);
        object = RecyclerView$f$a.PREVENT;
        super.setStateRestorationPolicy((RecyclerView$f$a)((Object)object));
        super(this);
        this.registerAdapterDataObserver((RecyclerView$h)object);
        super(this);
        this.g((Function1)object);
        object = cq2.j;
        this.c = object;
    }

    public final void g(Function1 function1) {
        Object object = "listener";
        Intrinsics.checkNotNullParameter(function1, (String)object);
        Cq cq2 = this.b;
        cq2.getClass();
        Intrinsics.checkNotNullParameter(function1, (String)object);
        Object object2 = cq2.l;
        Object object3 = ((AtomicReference)object2).get();
        if (object3 == null) {
            object3 = cq2.n;
            Intrinsics.checkNotNullParameter(object3, (String)object);
            ((AtomicReference)object2).set(object3);
            object2 = cq2.h;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object3, (String)object);
            object2 = ((Sl2)object2).d;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object3, (String)object);
            ((mr1_1)object2).a.add(object3);
            object = (wZ)((mr1_1)object2).b.getValue();
            if (object != null) {
                ((yq)object3).invoke(object);
            }
        }
        cq2.m.add(function1);
    }

    public final int getItemCount() {
        int n3;
        Object object = this.b;
        us2_0 us2_02 = (us2_0)((Cq)object).g.get();
        if (us2_02 != null) {
            n3 = us2_02.getSize();
        } else {
            object = ((Cq)object).h.c;
            n3 = ((pk2_0)object).getSize();
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object h(int n3) {
        Throwable throwable2;
        int n4;
        Object object;
        kb3_2 kb3_22;
        Object object2;
        block11: {
            Object object3;
            block10: {
                block9: {
                    object2 = this.b;
                    kb3_22 = ((Cq)object2).e;
                    try {
                        Object object4;
                        int n7;
                        do {
                            object4 = object = kb3_22.getValue();
                            object4 = (Boolean)object;
                            object4.getClass();
                        } while ((n7 = kb3_22.j(object, object4 = Boolean.TRUE)) == 0);
                        ((Cq)object2).f = n3;
                        object = ((Cq)object2).g;
                        object = ((AtomicReference)object).get();
                        if ((object = (us2_0)object) == null) break block9;
                        if (n3 >= 0 && n3 < (n4 = object.getSize())) {
                            n4 = object.b();
                            if ((n3 -= n4) >= 0 && n3 < (n4 = object.a())) {
                                object3 = object.getItem(n3);
                                break block10;
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            break block10;
                        }
                        object4 = "Index: ";
                        String string2 = ", Size: ";
                        CharSequence charSequence = wk0_0.a(n3, (String)object4, string2);
                        n7 = object.getSize();
                        charSequence.append(n7);
                        charSequence = charSequence.toString();
                        object2 = new IndexOutOfBoundsException((String)charSequence);
                        throw object2;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                object2 = ((Cq)object2).h;
                object3 = ((Sl2)object2).b(n3);
            }
            do {
                object = object2 = kb3_22.getValue();
                ((Boolean)object2).getClass();
            } while ((n4 = (int)(kb3_22.j(object2, object = Boolean.FALSE) ? 1 : 0)) == 0);
            return object3;
        }
        do {
            object = object2 = kb3_22.getValue();
            ((Boolean)object2).getClass();
        } while ((n4 = kb3_22.j(object2, object = Boolean.FALSE)) == 0);
        throw throwable2;
    }

    public final Object i(Ml2 object, f80_0 object2) {
        Object object3 = this.b;
        ((Cq)object3).i.incrementAndGet();
        object3 = ((Cq)object3).h;
        object3.getClass();
        ul2_0 ul2_02 = new ul2_0((Sl2)object3, (Ml2)object, null);
        object3 = ((Sl2)object3).f;
        object = ((l63_0)object3).a(0, ul2_02, (f80_0)object2);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object != object2) {
            object = Unit.a;
        }
        if (object != object2) {
            object = Unit.a;
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public final d j(yl2_1 yl2_12) {
        Intrinsics.checkNotNullParameter(yl2_12, "footer");
        Object object = new Pl2(yl2_12);
        this.g((Function1)object);
        RecyclerView$f[] recyclerView$fArray = new RecyclerView$f[]{this, yl2_12};
        object = new d(recyclerView$fArray);
        return object;
    }

    public final void setHasStableIds(boolean bl2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
        throw unsupportedOperationException;
    }

    public final void setStateRestorationPolicy(RecyclerView$f$a recyclerView$f$a) {
        Intrinsics.checkNotNullParameter((Object)recyclerView$f$a, "strategy");
        this.a = true;
        super.setStateRestorationPolicy(recyclerView$f$a);
    }
}

