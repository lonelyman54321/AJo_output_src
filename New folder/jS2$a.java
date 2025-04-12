/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

public final class jS2$a
implements iS2$a {
    public final /* synthetic */ jS2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public jS2$a(jS2 jS22, String string2, Function0 function0) {
        this.a = jS22;
        this.b = string2;
        this.c = function0;
    }

    public final void unregister() {
        Object object;
        Object object2 = this.a;
        Object object3 = ((jS2)object2).c;
        String string2 = this.b;
        if ((object3 = (List)object3.remove(string2)) != null) {
            object = this.c;
            object3.remove(object);
        }
        if (object3 != null) {
            object = object3;
            object = (Collection)object3;
            boolean bl2 = object.isEmpty() ^ true;
            if (bl2) {
                object2 = ((jS2)object2).c;
                object2.put(string2, object3);
            }
        }
    }
}

