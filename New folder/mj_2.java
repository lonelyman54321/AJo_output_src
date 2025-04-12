/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.exceptions.CompositeException;

/*
 * Renamed from MJ
 */
public final class mj_2
extends t62_0 {
    public final jj_2 a;

    public mj_2(v72_0 v72_02) {
        this.a = v72_02;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(e62_0 e62_02) {
        void var3_7;
        Throwable[] throwableArray;
        int n3;
        Object object;
        block9: {
            boolean bl2;
            block8: {
                int n4 = 1;
                Object object2 = this.a.clone();
                object = new mj$a_2((jj_2)object2);
                e62_02.a((yr0_2)object);
                n3 = ((mj$a_2)object).b;
                if (n3 != 0) {
                    return;
                }
                try {
                    object2 = object2.execute();
                    n3 = ((mj$a_2)object).b;
                    if (n3 != 0) break block8;
                    e62_02.b(object2);
                }
                catch (Throwable throwable) {
                    n3 = 0;
                    throwableArray = null;
                    break block9;
                }
            }
            if (bl2 = ((mj$a_2)object).b) return;
            try {
                e62_02.onComplete();
                return;
            }
            catch (Throwable throwable) {
                n3 = 1;
            }
        }
        mm0.h((Throwable)var3_7);
        if (n3 != 0) {
            dr2_2.b((Throwable)var3_7);
            return;
        }
        boolean bl3 = ((mj$a_2)object).b;
        if (bl3) return;
        try {
            e62_02.onError((Throwable)var3_7);
            return;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            n3 = 2;
            throwableArray = new Throwable[n3];
            throwableArray[0] = var3_7;
            throwableArray[n4] = throwable;
            object = new CompositeException(throwableArray);
            dr2_2.b((Throwable)object);
        }
    }
}

