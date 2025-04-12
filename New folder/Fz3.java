/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class Fz3
implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ Fz3(Function1 function1, Function1 function12, Function1 function13) {
        this.a = function1;
        this.b = function12;
        this.c = function13;
    }

    public final Object invoke(Object object) {
        block11: {
            block8: {
                block10: {
                    boolean bl2;
                    block9: {
                        block7: {
                            bl2 = (object = (pq$a_0)object) instanceof pq$a$c;
                            if (!bl2) break block7;
                            Function1 function1 = this.a;
                            if (function1 != null) {
                                function1.invoke(object);
                            }
                            break block8;
                        }
                        bl2 = object instanceof pq$a$d;
                        if (!bl2) break block9;
                        Function1 function1 = this.b;
                        if (function1 != null) {
                            function1.invoke(object);
                        }
                        break block8;
                    }
                    bl2 = object instanceof pq$a$b;
                    if (!bl2) break block10;
                    Function1 function1 = this.c;
                    if (function1 != null) {
                        function1.invoke(object);
                    }
                    break block8;
                }
                boolean bl3 = object instanceof pq$a$a;
                if (!bl3) break block11;
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

