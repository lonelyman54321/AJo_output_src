/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.G$a;
import androidx.datastore.preferences.protobuf.G$f;
import java.util.Iterator;

public final class G$b
extends G$f {
    public final /* synthetic */ G b;

    public G$b(G g3) {
        this.b = g3;
        super(g3);
    }

    public final Iterator iterator() {
        G g3 = this.b;
        G$a g$a = new G$a(g3);
        return g$a;
    }
}

