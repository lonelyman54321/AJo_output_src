/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.window.extensions.layout.WindowLayoutInfo
 */
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MH0$a
implements Consumer {
    public final Activity a;
    public final ReentrantLock b;
    public gH3 c;
    public final LinkedHashSet d;

    public MH0$a(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        this.a = object;
        this.b = object;
        super();
        this.d = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(gg3_0 gg3_02) {
        Intrinsics.checkNotNullParameter(gg3_02, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Object object = this.c;
            if (object != null) {
                gg3_02.accept(object);
            }
            object = this.d;
            object.add(gg3_02);
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void accept(Object object) {
        object = (WindowLayoutInfo)object;
        Intrinsics.checkNotNullParameter(object, "value");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Object object2 = this.a;
            this.c = object = bI0.b((Activity)object2, (WindowLayoutInfo)object);
            object = this.d;
            object = object.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object = Unit.a;
                    reentrantLock.unlock();
                    return;
                }
                object2 = object.next();
                object2 = (p60_0)object2;
                gH3 gH32 = this.c;
                object2.accept(gH32);
            }
        }
        catch (Throwable throwable) {}
        reentrantLock.unlock();
        throw throwable;
    }

    public final boolean b() {
        return this.d.isEmpty();
    }

    public final void c(p60_0 p60_02) {
        Intrinsics.checkNotNullParameter(p60_02, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            LinkedHashSet linkedHashSet = this.d;
            linkedHashSet.remove(p60_02);
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }
}

