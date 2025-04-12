/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Yl3$g
extends Lambda
implements Function2 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Object[] d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public Yl3$g(Yl3 yl3, Object[] objectArray, Function1 function1, int n3) {
        this.c = yl3;
        this.d = objectArray;
        this.e = function1;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object objectArray) {
        object = (b30_0)object;
        ((Number)objectArray).intValue();
        objectArray = this.d;
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        n3 = Me3.b(this.f | 1);
        Yl3 yl3 = this.c;
        Function1 function1 = this.e;
        yl3.b(objectArray, function1, (b30_0)object, n3);
        return Unit.a;
    }
}

