/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Renamed from XN1
 */
public final class xn1_1
implements n {
    public final /* synthetic */ ZN1 a;
    public final /* synthetic */ i$b b;
    public final /* synthetic */ fo1_0 c;

    public /* synthetic */ xn1_1(ZN1 zN1, i$b i$b, fo1_0 fo1_02) {
        this.a = zN1;
        this.b = i$b;
        this.c = fo1_02;
    }

    public final void k(mu1_1 object, i$a i$a) {
        object = this.a;
        object.getClass();
        i$b i$b = this.b;
        i$a i$a2 = i$a.upTo(i$b);
        Runnable runnable2 = ((ZN1)object).a;
        CopyOnWriteArrayList copyOnWriteArrayList = ((ZN1)object).b;
        fo1_0 fo1_02 = this.c;
        if (i$a == i$a2) {
            copyOnWriteArrayList.add(fo1_02);
            runnable2.run();
        } else {
            i$a2 = i$a.ON_DESTROY;
            if (i$a == i$a2) {
                ((ZN1)object).c(fo1_02);
            } else {
                object = i$a.downFrom(i$b);
                if (i$a == object) {
                    copyOnWriteArrayList.remove(fo1_02);
                    runnable2.run();
                }
            }
        }
    }
}

