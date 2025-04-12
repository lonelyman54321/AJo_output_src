/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class iL0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ jl0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;

    public iL0$a(jl0_1 jl0_12, String string2, xl0_2 xl0_22, f80_0 f80_02) {
        this.a = jl0_12;
        this.b = string2;
        this.c = xl0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jl0_1 jl0_12 = this.a;
        xl0_2 xl0_22 = (xl0_2)this.c;
        String string2 = this.b;
        object = new iL0$a(jl0_12, string2, xl0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iL0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iL0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.a;
        object.getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "cacheKey");
        Iterator iterator = ((ol0_1)object).f;
        Object object3 = ie0_0.IMAGE;
        iterator = (List)iterator.get(object3);
        if (iterator != null) {
            boolean bl2;
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                object3 = (mn1_0)iterator.next();
                boolean bl3 = object3 instanceof jf1_1;
                Object object4 = bl3 ? ie0_0.IMAGE : ((bl3 = object3 instanceof Hf1) ? ie0_0.GIF : ((bl3 = object3 instanceof fl0_1) ? ie0_0.FILES : ""));
                Object object5 = ((mn1_0)object3).a((String)object2);
                String string2 = " was present in ";
                String string3 = "FileDownload";
                yc1_2 yc1_22 = ((ol0_1)object).a;
                if (object5 != null && yc1_22 != null) {
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object2);
                    ((StringBuilder)object5).append(string2);
                    ((StringBuilder)object5).append(object4);
                    String string4 = " in-memory cache is successfully removed";
                    ((StringBuilder)object5).append(string4);
                    object5 = ((StringBuilder)object5).toString();
                    yc1_22.b(string3, (String)object5);
                }
                if (!(bl2 = ((mn1_0)object3).b((String)object2)) || yc1_22 == null) continue;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(object4);
                object4 = " disk-memory cache is successfully removed";
                ((StringBuilder)object3).append((String)object4);
                object3 = ((StringBuilder)object3).toString();
                yc1_22.b(string3, (String)object3);
            }
        }
        this.c.invoke(object2);
        return Unit.a;
    }
}

