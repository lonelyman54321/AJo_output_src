/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f01$a
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;

    public f01$a(List list) {
        this.c = list;
        super(1);
    }

    public final Object invoke(Object object) {
        List list = this.c;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Function1 function1 = (Function1)list.get(i3);
            function1.invoke(object);
        }
        return Unit.a;
    }
}

