/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Iq3
 */
public final class iq3_0
extends E$c {
    public final long a;

    public /* synthetic */ iq3_0() {
        this(0L);
    }

    public iq3_0(long l2) {
        this.a = l2;
    }

    public final jD3 create(Class object) {
        Intrinsics.checkNotNullParameter(object, "modelClass");
        Object object2 = Hq3.class;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            long l2 = this.a;
            object = new Hq3(l2);
            return object;
        }
        object = Intrinsics.stringPlus("Cannot create ", object);
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

