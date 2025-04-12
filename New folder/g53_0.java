/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.Functions$a;
import io.reactivex.internal.functions.Functions$d;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;

/*
 * Renamed from G53
 */
public abstract class g53_0
implements q63_0 {
    public static h53_0 b(v53_0 v53_02) {
        x03_0.b(v53_02, "source is null");
        h53_0 h53_02 = new h53_0(v53_02);
        return h53_02;
    }

    public static m53_0 c(Throwable object) {
        x03_0.b(object, "exception is null");
        Object object2 = Functions.a;
        object2 = new Functions$d(object);
        object = new m53_0((Functions$d)object2);
        return object;
    }

    public static p53_0 d(Object object) {
        x03_0.b(object, "item is null");
        p53_0 p53_02 = new p53_0(object);
        return p53_02;
    }

    public static s63_0 i(g53_0 g53_02, g53_0 g53_03, dx_0 q63_0Array) {
        x03_0.b(g53_02, "source1 is null");
        x03_0.b(g53_03, "source2 is null");
        Object object = Functions.a;
        object = new Functions$a((dx_0)q63_0Array);
        q63_0Array = new q63_0[]{g53_02, g53_03};
        g53_02 = new s63_0(q63_0Array, (Functions$a)object);
        return g53_02;
    }

    public final void a(t53_0 t53_02) {
        Object object = "observer is null";
        x03_0.b(t53_02, (String)object);
        try {
            this.g(t53_02);
            return;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            object = new NullPointerException("subscribeActual failed");
            ((Throwable)object).initCause(throwable);
            throw object;
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    public final SingleObserveOn e(Scheduler scheduler) {
        x03_0.b(scheduler, "scheduler is null");
        SingleObserveOn singleObserveOn = new SingleObserveOn(this, scheduler);
        return singleObserveOn;
    }

    public final q60_0 f(o60_0 o60_02, o60_0 o60_03) {
        x03_0.b(o60_02, "onSuccess is null");
        x03_0.b(o60_03, "onError is null");
        q60_0 q60_02 = new q60_0(o60_02, o60_03);
        this.a(q60_02);
        return q60_02;
    }

    public abstract void g(t53_0 var1);

    public final SingleSubscribeOn h(Scheduler scheduler) {
        x03_0.b(scheduler, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(this, scheduler);
        return singleSubscribeOn;
    }
}

