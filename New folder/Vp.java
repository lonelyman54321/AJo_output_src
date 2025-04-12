/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Vp {
    public static Ke1 a;

    public static final Ke1 a() {
        Object object = a;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            return object;
        }
        Object object2 = object;
        object = new Ke1$a("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        object2 = DA3.a;
        long l2 = OX.b;
        object2 = new i93_0(l2);
        ArrayList<qn2$f> arrayList = new ArrayList<qn2$f>(32);
        float f5 = 20.0f;
        qn2 qn22 = new qn2$f(f5, 11.0f);
        arrayList.add((qn2$f)qn22);
        float f6 = 7.83f;
        qn22 = new qn2$d(f6);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$m(5.59f, -5.59f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$e(12.0f, 4.0f);
        arrayList.add((qn2$f)qn22);
        float f7 = 8.0f;
        qn22 = new qn2$m(-8.0f, f7);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$m(f7, f7);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$m(1.41f, -1.41f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$e(f6, 13.0f);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$d(f5);
        arrayList.add((qn2$f)qn22);
        qn22 = new qn2$r(-2.0f);
        arrayList.add((qn2$f)qn22);
        qn22 = qn2$b.c;
        arrayList.add((qn2$f)qn22);
        Ke1$a.a((Ke1$a)object, arrayList, (i93_0)object2);
        a = object = ((Ke1$a)object).b();
        Intrinsics.checkNotNull(object);
        return object;
    }
}

