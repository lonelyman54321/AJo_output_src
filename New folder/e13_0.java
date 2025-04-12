/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e13
 */
public final class e13_0 {
    public e13_0 a;
    public final ad3_0 b;
    public final ArrayList c;
    public final yz2_0 d;

    public e13_0(e13_0 object, ad3_0 object2) {
        this.a = object;
        this.b = object2;
        object = ((ad3_0)object2).e;
        int n3 = yx_2.o((Iterable)object, 10);
        object2 = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ad3_0 ad3_02 = (ad3_0)object.next();
            e13_0 e13_02 = new e13_0(this, ad3_02);
            ((ArrayList)object2).add(e13_02);
        }
        this.c = object = CollectionsKt.m0(object2);
        object = new e13$a_0(this, null);
        Intrinsics.checkNotNullParameter(object, "block");
        this.d = object2 = new yz2_0((Function2)object);
    }

    public final e13_0 a() {
        e13_0 e13_02 = this.a;
        if (e13_02 == null) {
            e13_02 = this;
        } else {
            Intrinsics.checkNotNull(e13_02);
            e13_02 = e13_02.a();
        }
        return e13_02;
    }

    public final ad3_0 b() {
        ad3_0 ad3_02;
        ad3_0 ad3_03 = this.b;
        String string2 = ad3_03.a;
        Object object = this.c;
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<ad3_0> arrayList = new ArrayList<ad3_0>(n3);
        object = ((ArrayList)object).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ad3_0 ad3_04 = ((e13_0)object.next()).b();
            arrayList.add(ad3_04);
        }
        Object object2 = object = ad3_03.f;
        object2 = (Fp1)object;
        n3 = ad3_03.b;
        Vi1 vi1 = ad3_03.c;
        L93 l93 = ad3_03.d;
        object = ad3_02;
        ad3_02 = new ad3_0(string2, n3, vi1, l93, arrayList, (Fp1)object2);
        return ad3_02;
    }
}

