/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aq$b
 */
public final class aq$b_0 {
    public final char a;
    public final List b;
    public final List c;

    public aq$b_0(char n3, List aq$b_0Array, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(aq$b_0Array, "exact");
        Intrinsics.checkNotNullParameter(arrayList, "children");
        this.a = n3;
        this.b = aq$b_0Array;
        this.c = arrayList;
        n3 = 256;
        aq$b_0Array = new aq$b_0[n3];
        arrayList = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object var6_6;
            block4: {
                boolean bl2;
                Iterator iterator = ((Iterable)this.c).iterator();
                var6_6 = null;
                Object var7_7 = null;
                boolean bl3 = false;
                while (bl2 = iterator.hasNext()) {
                    Object t3;
                    Object object = t3 = iterator.next();
                    object = (aq$b_0)t3;
                    char c2 = ((aq$b_0)object).a;
                    if (c2 != i3) continue;
                    if (!bl3) {
                        bl3 = true;
                        var7_7 = t3;
                        continue;
                    }
                    break block4;
                }
                if (bl3) {
                    var6_6 = var7_7;
                }
            }
            aq$b_0Array[i3] = var6_6;
        }
    }
}

