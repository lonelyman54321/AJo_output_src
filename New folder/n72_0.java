/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N72
 */
public final class n72_0
implements l41_0 {
    public final /* synthetic */ m41_0 c;

    public n72_0(m41_0 m41_02) {
        this.c = m41_02;
    }

    public final void a(Function2 function2) {
        function2 = (we3_2)function2;
        Intrinsics.checkNotNullParameter(function2, "body");
        ue3$a.a(this, function2);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        boolean bl2;
        Object object = "Content-Encoding";
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.d((String)object);
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final List d(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        Object object2 = object = this.c.h((String)object);
        object2 = (Collection)object;
        boolean bl2 = object2.isEmpty() ^ true;
        if (!bl2) {
            object = null;
        }
        return object;
    }

    public final Set entries() {
        return this.c.f().entrySet();
    }

    public final String get(String object) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.d((String)object);
        object = object != null ? (String)CollectionsKt.firstOrNull((List)object) : null;
        return object;
    }
}

