/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yR2
 */
public final class yr2_2
extends h80_0
implements fs0_2 {
    public final fs0_2 a;
    public final CoroutineContext b;
    public final int c;
    public CoroutineContext d;
    public f80_0 e;

    public yr2_2(fs0_2 object, CoroutineContext coroutineContext) {
        int n3;
        Object object2 = l32_0.a;
        f f5 = f.a;
        super((f80_0)object2, f5);
        this.a = object;
        this.b = coroutineContext;
        object = 0;
        object2 = new Object();
        this.c = n3 = ((Number)coroutineContext.fold(object, (Function2)object2)).intValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object c(f80_0 object, Object object2) {
        Object object3 = object.getContext();
        mm0.c((CoroutineContext)object3);
        Object object4 = this.d;
        if (object4 != object3) {
            int n3 = object4 instanceof ws0_1;
            if (n3 != 0) {
                object4 = (ws0_1)object4;
                object3 = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                object4 = ((ws0_1)object4).b;
                ((StringBuilder)object3).append(object4);
                ((StringBuilder)object3).append(", but then emission attempt of value '");
                ((StringBuilder)object3).append(object2);
                ((StringBuilder)object3).append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                object2 = ee3_2.b(((StringBuilder)object3).toString()).toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object4 = 0;
            int n4 = 1;
            td2_0 td2_02 = new td2_0(n4, this);
            int n7 = ((Number)(object4 = (Number)object3.fold(object4, td2_02))).intValue();
            if (n7 != (n3 = this.c)) {
                object2 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                object4 = this.b;
                ((StringBuilder)object2).append(object4);
                ((StringBuilder)object2).append(",\n\t\tbut emission happened in ");
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                object2 = ((StringBuilder)object2).toString().toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            this.d = object3;
        }
        this.e = object;
        object = zr2_2.a;
        object4 = this.a;
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        object3 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>";
        Intrinsics.checkNotNull(this, (String)object3);
        object = object.invoke(object4, object2, this);
        object2 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2) {
            bl2 = false;
            object2 = null;
            this.e = null;
        }
        return object;
    }

    public final Object emit(Object object, f80_0 object2) {
        j90_0 j90_02;
        block3: {
            String string2;
            try {
                object = this.c((f80_0)object2, object);
                j90_02 = j90_0.COROUTINE_SUSPENDED;
                if (object != j90_02) break block3;
                string2 = "frame";
            }
            catch (Throwable throwable) {
                object2 = object2.getContext();
                ws0_1 ws0_12 = new ws0_1((CoroutineContext)object2, throwable);
                this.d = ws0_12;
                throw throwable;
            }
            Intrinsics.checkNotNullParameter(object2, string2);
        }
        if (object == j90_02) {
            return object;
        }
        return Unit.a;
    }

    public final k90_0 getCallerFrame() {
        Object object = this.e;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext == null) {
            coroutineContext = f.a;
        }
        return coroutineContext;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = tl2_2.a(object);
        if (object2 != null) {
            CoroutineContext coroutineContext = this.getContext();
            ws0_1 ws0_12 = new ws0_1(coroutineContext, (Throwable)object2);
            this.d = ws0_12;
        }
        if ((object2 = this.e) != null) {
            object2.resumeWith(object);
        }
        return j90_0.COROUTINE_SUSPENDED;
    }
}

