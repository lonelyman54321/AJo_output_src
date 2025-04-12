/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class N50 {
    public final Si3 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public N50(Context object, Si3 si3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(si3, "taskExecutor");
        this.a = si3;
        object = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "context.applicationContext");
        this.b = object;
        this.c = object;
        super();
        this.d = object;
    }

    public abstract Object a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object) {
        Object object2 = this.c;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Object object3;
                block4: {
                    try {
                        boolean bl2;
                        object3 = this.e;
                        if (object3 == null || !(bl2 = Intrinsics.areEqual(object3, object))) break block4;
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                this.e = object;
                object = this.d;
                object = CollectionsKt.k0((Iterable)object);
                object3 = this.a;
                object3 = object3.a();
                M50 m50 = new M50(0, object, this);
                ((qI3$a)object3).execute(m50);
                object = Unit.a;
                break block5;
                return;
            }
            throw throwable2;
        }
    }

    public abstract void c();

    public abstract void d();
}

