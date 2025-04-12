/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Jo3
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    public /* synthetic */ Jo3(String string2, int n3) {
        this.a = string2;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.b | 1);
        Ko3.a(this.a, (b30_0)object, n3);
        return Unit.a;
    }
}

