/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

/*
 * Renamed from db1
 */
public final class db1_2
implements na1_0 {
    public final eu3_0 a;
    public pa1_0 b;
    public final p41_0 c;
    public Object d;
    public i e;
    public final e40_0 f;

    public db1_2() {
        Object object = new eu3_0(0);
        this.a = object;
        this.b = object = pa1_0.b;
        this.c = object = new p41_0(0);
        this.d = object = gz0_2.a;
        this.e = object = be_1.a();
        this.f = object = new e40_0();
    }

    public final void a(at3_0 object) {
        e40_0 e40_02 = this.f;
        if (object != null) {
            xq_2 xq_22 = qj2_1.a;
            e40_02.d(xq_22, object);
        } else {
            object = qj2_1.a;
            e40_02.b((xq_2)object);
        }
    }

    public final void b(db1_2 iterator) {
        boolean bl2;
        Object object = "builder";
        Intrinsics.checkNotNullParameter(iterator, (String)object);
        Object object2 = ((db1_2)((Object)iterator)).e;
        this.e = object2;
        Intrinsics.checkNotNullParameter(iterator, (String)object);
        this.b = object = ((db1_2)((Object)iterator)).b;
        this.d = object = ((db1_2)((Object)iterator)).d;
        object = qj2_1.a;
        object2 = ((db1_2)((Object)iterator)).f;
        object = (at3_0)((e40_0)object2).a((xq_2)object);
        this.a((at3_0)object);
        object = ((db1_2)((Object)iterator)).a;
        Object object3 = this.a;
        ku3_0.c((eu3_0)object3, (eu3_0)object);
        object = ((eu3_0)object3).h;
        Object object4 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        ((eu3_0)object3).h = object;
        object = this.c;
        iterator = ((db1_2)((Object)iterator)).c;
        ze3_2.a((ve3_2)object, (ve3_2)((Object)iterator));
        object = this.f;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "other");
        iterator = ((Iterable)((e40_0)object2).e()).iterator();
        while (bl2 = iterator.hasNext()) {
            object3 = (xq_2)iterator.next();
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            object4 = ((e40_0)object2).g((xq_2)object3);
            ((e40_0)object).d((xq_2)object3, object4);
        }
    }

    public final p41_0 getHeaders() {
        return this.c;
    }
}

