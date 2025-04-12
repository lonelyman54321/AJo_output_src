/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rS
 */
public final class rs_1 {
    public static Ke1 a;

    public static final Ke1 a() {
        Object object = a;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            return object;
        }
        Object object2 = object;
        object = new Ke1$a("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        object2 = DA3.a;
        long l2 = OX.b;
        object2 = new i93_0(l2);
        ArrayList<qn2$f> arrayList = new ArrayList<qn2$f>(32);
        float f5 = 9.0f;
        qn2 qn22 = new qn2$f(f5, 16.17f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$e(4.83f, 12.0f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$m(-1.42f, 1.41f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$e(f5, 19.0f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$e(21.0f, 7.0f);
        arrayList.add((qn2$f)qn22);
        float f6 = -1.41f;
        qn22 = new qn2$m(f6, f6);
        arrayList.add((qn2$f)qn22);
        qn22 = qn2$b.c;
        arrayList.add((qn2$f)qn22);
        Ke1$a.a((Ke1$a)object, arrayList, (i93_0)object2);
        a = object = ((Ke1$a)object).b();
        Intrinsics.checkNotNull(object);
        return object;
    }
}

