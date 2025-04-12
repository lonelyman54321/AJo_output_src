/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Yu0
 */
public final class yu0_0 {
    public final Re a;
    public Vo0 b;

    public yu0_0(zu0_0 zu0_02, Function1 function1) {
        Re re;
        Qs3 qs3 = Tu0.d;
        yu0$a_0 yu0$a_0 = new yu0$a_0(this);
        Yu0$b yu0$b = new Yu0$b(this);
        this.a = re = new Re((Object)zu0_02, yu0$a_0, yu0$b, qs3, function1);
    }

    public static final Vo0 a(yu0_0 object) {
        Object object2 = ((yu0_0)object).b;
        if (object2 != null) {
            return object2;
        }
        object2 = new StringBuilder("The density on DrawerState (");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(") was not set. Did you use DrawerState with the Drawer composable?");
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

