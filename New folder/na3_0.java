/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/*
 * Renamed from nA3
 */
public final class na3_0
implements Sequence {
    public final ArrayList a;

    public na3_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void b(Object object, String string2) {
        ArrayList arrayList = this.a;
        mA3 mA32 = new mA3(string2, object);
        arrayList.add(mA32);
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}

