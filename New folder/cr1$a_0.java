/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cR1$a
 */
public final class cr1$a_0 {
    public final ff_2 a;
    public jn1_0 b;
    public final ArrayList c;

    public cr1$a_0() {
        ArrayList arrayList = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(arrayList, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(arrayList, "boundary");
        arrayList = ff$a_0.c((String)((Object)arrayList));
        this.a = arrayList;
        arrayList = cr1_2.e;
        this.b = arrayList;
        this.c = arrayList = new ArrayList();
    }

    public final cr1_2 a() {
        Object object = this.c;
        boolean bl2 = ((ArrayList)object).isEmpty() ^ true;
        if (bl2) {
            ff_2 ff_22 = this.a;
            jn1_0 jn1_02 = this.b;
            object = ez3.x((List)object);
            cr1_2 cr1_22 = new cr1_2(ff_22, jn1_02, (List)object);
            return cr1_22;
        }
        String string2 = "Multipart body must have at least one part.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void b(jn1_0 object) {
        Intrinsics.checkNotNullParameter(object, "type");
        Object object2 = ((jn1_0)object).b;
        String string2 = "multipart";
        boolean bl2 = Intrinsics.areEqual(object2, string2);
        if (bl2) {
            this.b = object;
            return;
        }
        object2 = new StringBuilder("multipart != ");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

