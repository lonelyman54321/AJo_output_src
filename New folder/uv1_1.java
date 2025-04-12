/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.c$a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/*
 * Renamed from uv1
 */
public final class uv1_1
implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vv1$a c;

    public /* synthetic */ uv1_1(CopyOnWriteArraySet copyOnWriteArraySet, int n3, vv1$a vv1$a) {
        this.a = copyOnWriteArraySet;
        this.b = n3;
        this.c = vv1$a;
    }

    public final void run() {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            Object object2 = (vv1$c)iterator.next();
            int n3 = ((vv1$c)object2).d;
            if (n3 != 0) continue;
            int n4 = this.b;
            n3 = -1;
            if (n4 != n3) {
                object = ((vv1$c)object2).b;
                ((c$a)object).a(n4);
            }
            n3 = 1;
            ((vv1$c)object2).c = n3;
            object2 = ((vv1$c)object2).a;
            object = this.c;
            object.invoke(object2);
        }
    }
}

