/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.window.extensions.layout.WindowLayoutComponent
 */
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MH0
implements YF3 {
    public final WindowLayoutComponent a;
    public final ReentrantLock b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public MH0(WindowLayoutComponent object) {
        Intrinsics.checkNotNullParameter(object, "component");
        this.a = object;
        this.b = object;
        super();
        this.c = object;
        super();
        this.d = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(p60_0 object) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block6: {
            Object object2;
            block7: {
                Intrinsics.checkNotNullParameter(object, "callback");
                reentrantLock = this.b;
                reentrantLock.lock();
                try {
                    object2 = this.d;
                    object2 = ((LinkedHashMap)object2).get(object);
                    object2 = (Activity)object2;
                    if (object2 == null) {
                        reentrantLock.unlock();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    LinkedHashMap linkedHashMap = this.c;
                    object2 = linkedHashMap.get(object2);
                    object2 = (MH0$a)object2;
                    if (object2 != null) break block7;
                    reentrantLock.unlock();
                    return;
                }
            }
            ((MH0$a)object2).c((p60_0)object);
            boolean bl2 = ((MH0$a)object2).b();
            if (bl2) {
                object = this.a;
                object.removeWindowLayoutInfoListener((Consumer)object2);
            }
            object = Unit.a;
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Activity object, jl1_0 object2, gg3_0 gg3_02) {
        Throwable throwable2;
        block6: {
            LinkedHashMap linkedHashMap;
            Object object3;
            LinkedHashMap linkedHashMap2;
            block5: {
                block4: {
                    Intrinsics.checkNotNullParameter(object, "activity");
                    Intrinsics.checkNotNullParameter(object2, "executor");
                    Intrinsics.checkNotNullParameter(gg3_02, "callback");
                    object2 = this.b;
                    ((ReentrantLock)object2).lock();
                    linkedHashMap2 = this.c;
                    try {
                        object3 = linkedHashMap2.get(object);
                        object3 = (MH0$a)object3;
                        linkedHashMap = this.d;
                        if (object3 != null) break block4;
                        object3 = null;
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                ((MH0$a)object3).a(gg3_02);
                linkedHashMap.put(gg3_02, object);
                object3 = Unit.a;
            }
            if (object3 == null) {
                object3 = new MH0$a((Activity)object);
                linkedHashMap2.put(object, object3);
                linkedHashMap.put(gg3_02, object);
                ((MH0$a)object3).a(gg3_02);
                gg3_02 = this.a;
                gg3_02.addWindowLayoutInfoListener((Activity)object, (Consumer)object3);
            }
            object = Unit.a;
            ((ReentrantLock)object2).unlock();
            return;
        }
        ((ReentrantLock)object2).unlock();
        throw throwable2;
    }
}

