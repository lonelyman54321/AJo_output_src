/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class gk1 {
    public final Function1 a;
    public final Function0 b;
    public final ReentrantLock c;
    public final ArrayList d;
    public boolean e;

    public gk1(Function1 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "callbackInvoker");
        this.a = arrayList;
        this.b = null;
        arrayList = new ArrayList();
        this.c = arrayList;
        this.d = arrayList = new ArrayList();
    }

    public final boolean a() {
        Object object;
        ArrayList arrayList;
        boolean bl2 = this.e;
        boolean bl3 = false;
        Object var3_3 = null;
        if (bl2) {
            return false;
        }
        Object object2 = this.c;
        ((ReentrantLock)object2).lock();
        boolean bl4 = this.e;
        if (bl4) {
            ((ReentrantLock)object2).unlock();
            return false;
        }
        bl3 = true;
        try {
            this.e = bl3;
            arrayList = this.d;
            object = CollectionsKt.k0(arrayList);
            arrayList.clear();
            object = (Iterable)object;
            object2 = object.iterator();
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            ((ReentrantLock)object2).unlock();
        }
        while (bl4 = object2.hasNext()) {
            arrayList = object2.next();
            object = this.a;
            object.invoke(arrayList);
        }
        return bl3;
    }
}

