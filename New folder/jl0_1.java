/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from jL0
 */
public final class jl0_1 {
    public final ol0_1 a;
    public final ke0_0 b;
    public final ArrayList c;

    public jl0_1(ol0_1 arrayList) {
        ke0_0 ke0_02;
        Intrinsics.checkNotNullParameter(arrayList, "fileResourceProvider");
        Intrinsics.checkNotNullParameter(ke0_02, "dispatchers");
        this.a = arrayList;
        this.b = ke0_02;
        this.c = arrayList = new ArrayList();
    }

    public final void a(ArrayList object, xl0_2 xl0_22) {
        Intrinsics.checkNotNullParameter(object, "urls");
        Intrinsics.checkNotNullParameter(xl0_22, "successBlock");
        c80 c802 = d.a(this.b.a());
        il0_2 il0_22 = new il0_2((ArrayList)object, this, xl0_22, null);
        object = Ae3.d(c802, null, null, il0_22, 3);
        this.c.add(object);
    }
}

