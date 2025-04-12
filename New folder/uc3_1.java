/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/*
 * Renamed from UC3
 */
public final class uc3_1
implements Iterator,
KMutableIterator {
    public int a;
    public final /* synthetic */ ViewGroup b;

    public uc3_1(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        ViewGroup viewGroup = this.b;
        int n4 = viewGroup.getChildCount();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final Object next() {
        int n3;
        int n4 = this.a;
        this.a = n3 = n4 + 1;
        ViewGroup viewGroup = this.b;
        Object object = viewGroup.getChildAt(n4);
        if (object != null) {
            return object;
        }
        object = new IndexOutOfBoundsException();
        throw object;
    }

    public final void remove() {
        int n3;
        this.a = n3 = this.a + -1;
        this.b.removeViewAt(n3);
    }
}

