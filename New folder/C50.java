/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public final class C50
extends y50_0 {
    public C50$b b;
    public int c = 0;
    public final ArrayList d;

    public C50() {
        super(null);
        ArrayList arrayList;
        this.d = arrayList = new ArrayList();
    }

    public static LP1 c(LP1 lP1, t50 t502, Function1 function1) {
        C50$a c50$a = new C50$a(t502, function1);
        return lP1.then(c50$a);
    }

    public final t50 d() {
        int n3;
        ArrayList arrayList = this.d;
        int n4 = this.c;
        this.c = n3 = n4 + 1;
        t50 t502 = (t50)CollectionsKt.N(n4, arrayList);
        if (t502 == null) {
            n3 = this.c;
            Integer n7 = n3;
            t502 = new t50(n7);
            arrayList.add(t502);
        }
        return t502;
    }

    public final C50$b e() {
        C50$b c50$b = this.b;
        if (c50$b == null) {
            this.b = c50$b = new C50$b(this);
        }
        return c50$b;
    }

    public final void f() {
        this.a.e.clear();
        this.c = 0;
    }
}

