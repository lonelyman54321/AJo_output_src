/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ka3
 */
public final class ka3_0
implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ ka3_0(String string2, String string3, String string4, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$imageId");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$text");
        int n3 = Me3.b(this.d | 1);
        object2 = (String)object2;
        String string3 = (String)this.c;
        la3_1.a((String)object2, string2, string3, (b30_0)object, n3);
        return Unit.a;
    }
}

