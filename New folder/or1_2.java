/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oR1
 */
public final class or1_2
extends Wd0 {
    public /* synthetic */ or1_2(int n3) {
        Wd0$a wd0$a = Wd0$a.b;
        this(wd0$a);
    }

    public or1_2(Wd0 object) {
        Intrinsics.checkNotNullParameter(object, "initialExtras");
        LinkedHashMap linkedHashMap = this.a;
        object = ((Wd0)object).a;
        linkedHashMap.putAll(object);
    }

    public final Object a(Wd0$b wd0$b) {
        Intrinsics.checkNotNullParameter(wd0$b, "key");
        return this.a.get(wd0$b);
    }

    public final void b(Wd0$b wd0$b, Object object) {
        Intrinsics.checkNotNullParameter(wd0$b, "key");
        this.a.put(wd0$b, object);
    }
}

