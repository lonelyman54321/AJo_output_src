/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class DV0$a {
    public final Charset a = null;
    public final ArrayList b;
    public final ArrayList c;

    public DV0$a(int n3) {
        ArrayList arrayList;
        this.b = arrayList = new ArrayList();
        this.c = arrayList = new ArrayList();
    }

    public final void a(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "name");
        Intrinsics.checkNotNullParameter(string2, "value");
        Object object2 = this.b;
        Charset charset = this.a;
        object = Ob1$b.a((String)object, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, charset, 91);
        ((ArrayList)object2).add(object);
        object = this.c;
        Charset charset2 = this.a;
        object2 = string2;
        string2 = Ob1$b.a(string2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, charset2, 91);
        ((ArrayList)object).add(string2);
    }
}

