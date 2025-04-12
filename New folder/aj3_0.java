/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import androidx.work.c;
import androidx.work.impl.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aJ3
 */
public final class aj3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ WI3 b;
    public final /* synthetic */ c c;
    public final /* synthetic */ CV0 d;

    public aj3_0(WI3 wI3, c c2, fi3_0 fi3_02, f80_0 f80_02) {
        this.b = wI3;
        this.c = c2;
        this.d = fi3_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        WI3 wI3 = this.b;
        fi3_0 fi3_02 = (fi3_0)this.d;
        c c2 = this.c;
        object = new aj3_0(wI3, c2, fi3_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (aj3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((aj3_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            Object object2;
            int n3;
            int n4;
            Object object3;
            j90_0 j90_02;
            block9: {
                int n7;
                int n8;
                block5: {
                    block6: {
                        block7: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n8 = this.a;
                            object3 = this.b;
                            n4 = 2;
                            n7 = 1;
                            if (n8 == 0) break block5;
                            if (n8 == n7) break block6;
                            if (n8 != n4) break block7;
                            vl2_2.b(object);
                            break block8;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block9;
                }
                vl2_2.b(object);
                Context context = ((WI3)object3).b;
                this.a = n7;
                n3 = di3_0.a;
                EI3 eI3 = ((WI3)object3).a;
                n3 = (int)(eI3.q ? 1 : 0);
                if (n3 != 0 && (n3 = Build.VERSION.SDK_INT) < (n8 = 31)) {
                    object = ((WI3)object3).e.a();
                    Intrinsics.checkNotNullExpressionValue(object, "taskExecutor.mainThreadExecutor");
                    object = h83.a((Executor)object);
                    Object object4 = this.d;
                    CV0 cV0 = object4;
                    cV0 = (fi3_0)object4;
                    c c2 = this.c;
                    object4 = object2;
                    object2 = new ci3_0(c2, eI3, (fi3_0)cV0, context, null);
                    object = Ae3.g(this, (CoroutineContext)object, (Function2)object2);
                    if (object != j90_02) {
                        object = Unit.a;
                    }
                } else {
                    object = Unit.a;
                }
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = androidx.work.impl.a.a;
            object = qx1.a();
            object2 = ((WI3)object3).a.c;
            object.getClass();
            object = this.c;
            object2 = ((c)object).startWork();
            object3 = "worker.startWork()";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            this.a = n4;
            object = androidx.work.impl.a.a((ListenableFuture)object2, (c)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return object;
    }
}

