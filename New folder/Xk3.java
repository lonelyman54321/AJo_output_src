/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Xk3
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ Xk3(int n3, Object object, Object object2) {
        this.c = n3;
        this.d = object;
        this.e = object2;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.d;
                WorkDatabase workDatabase = (WorkDatabase)this.e;
                return function1.invoke(workDatabase);
            }
            case 0: 
        }
        ((Sk3)this.e).o();
        P70$a$a p70$a$a = P70$a$a.a;
        ((P70)this.d).a.setValue(p70$a$a);
        return Unit.a;
    }
}

