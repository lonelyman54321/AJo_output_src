/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wk1
 */
public final class wk1_0
extends x0_0 {
    public final int b;
    public final int c;
    public final List d;

    public wk1_0(ArrayList arrayList, int n3, int n4) {
        Intrinsics.checkNotNullParameter(arrayList, "items");
        this.b = n3;
        this.c = n4;
        this.d = arrayList;
    }

    public final int a() {
        int n3 = this.d.size();
        int n4 = this.b;
        n3 += n4;
        n4 = this.c;
        return n3 + n4;
    }

    public final Object get(int n3) {
        int n4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        block4: {
            block2: {
                List list;
                block3: {
                    indexOutOfBoundsException = null;
                    n4 = this.b;
                    if (n3 >= 0 && n3 < n4) break block2;
                    list = this.d;
                    int n7 = list.size() + n4;
                    if (n3 >= n7 || n4 > n3) break block3;
                    indexOutOfBoundsException = (IndexOutOfBoundsException)list.get(n3 -= n4);
                    break block2;
                }
                int n8 = list.size() + n4;
                n4 = this.a();
                if (n3 >= n4 || n8 > n3) break block4;
            }
            return indexOutOfBoundsException;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        n4 = this.a();
        charSequence.append(n4);
        charSequence = charSequence.toString();
        indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }
}

