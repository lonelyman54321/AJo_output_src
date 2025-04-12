/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.i;

public final class rH3$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ FF2 d;
    public final /* synthetic */ mu1_1 e;
    public final /* synthetic */ rh3_1 f;
    public final /* synthetic */ View g;

    public rH3$b(Ref$ObjectRef ref$ObjectRef, FF2 fF2, mu1_1 mu1_12, rh3_1 rh3_12, View view, f80_0 f80_02) {
        this.c = ref$ObjectRef;
        this.d = fF2;
        this.e = mu1_12;
        this.f = rh3_12;
        this.g = view;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rh3_1 rh3_12 = this.f;
        View view = this.g;
        Ref$ObjectRef ref$ObjectRef = this.c;
        FF2 fF2 = this.d;
        mu1_1 mu1_12 = this.e;
        rH3$b rH3$b = new rH3$b(ref$ObjectRef, fF2, mu1_12, rh3_12, view, f80_02);
        rH3$b.b = object;
        return rH3$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rH3$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rH3$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        mu1_1 mu1_12;
        rh3_1 rh3_12;
        Object object2;
        block15: {
            Throwable throwable4;
            block14: {
                Object object3;
                block18: {
                    Object object4;
                    Object object5;
                    int n3;
                    block17: {
                        block16: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            int n4 = this.a;
                            rh3_12 = this.f;
                            mu1_12 = this.e;
                            n3 = 1;
                            if (n4 != 0) {
                                if (n4 != n3) {
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                object2 = (i)this.b;
                                try {
                                    vl2_2.b(object);
                                    break block14;
                                }
                                catch (Throwable throwable2) {
                                    break block15;
                                }
                            }
                            vl2_2.b(object);
                            object = (i90_0)this.b;
                            try {
                                object3 = this.c;
                                object3 = ((Ref$ObjectRef)object3).element;
                                object3 = (hq1_0)object3;
                                if (object3 == null) break block16;
                                object5 = this.g;
                                object5 = object5.getContext();
                                object5 = object5.getApplicationContext();
                                object5 = uh3_0.a((Context)object5);
                                object4 = object5.getValue();
                                object4 = (Number)object4;
                                float f5 = ((Number)object4).floatValue();
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((hq1_0)object3).a;
                                parcelableSnapshotMutableFloatState.k(f5);
                                object4 = new rH3$b$a((jb3_2)object5, (hq1_0)object3, null);
                                n4 = 3;
                                object = Ae3.d((i90_0)object, null, null, (Function2)object4, n4);
                                break block17;
                            }
                            catch (Throwable throwable3) {
                                object2 = null;
                                break block15;
                            }
                        }
                        object = null;
                    }
                    try {
                        object3 = this.d;
                        this.b = object;
                        this.a = n3;
                        object3.getClass();
                        LF2 lF2 = new LF2((FF2)object3, null);
                        object5 = this.getContext();
                        object5 = aQ1.a((CoroutineContext)object5);
                        object4 = new KF2((FF2)object3, lF2, (yp1_2)object5, null);
                        object3 = ((FF2)object3).a;
                        object3 = Ae3.g(this, (CoroutineContext)object3, (Function2)object4);
                        if (object3 != object2) {
                            object3 = Unit.a;
                        }
                        if (object3 == object2) break block18;
                        object3 = Unit.a;
                    }
                    catch (Throwable throwable4) {}
                }
                if (object3 == object2) {
                    return object2;
                }
                object2 = object;
            }
            if (object2 != null) {
                object2.d(null);
            }
            mu1_12.getLifecycle().c(rh3_12);
            return Unit.a;
            Throwable throwable5 = throwable4;
            object2 = object;
            object = throwable5;
        }
        if (object2 != null) {
            object2.d(null);
        }
        mu1_12.getLifecycle().c(rh3_12);
        throw object;
    }
}

