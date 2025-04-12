/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KZ0
 */
public final class kz0_1
implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ kz0_1(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$productName");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        CharSequence charSequence = new StringBuilder("Product at pos ");
        String string3 = this.a;
        String string4 = " ";
        charSequence = ko_0.a(charSequence, string3, string4, string2, string4);
        RY2.e((UY2)object, (String)charSequence);
        return Unit.a;
    }
}

