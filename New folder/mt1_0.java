/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from MT1
 */
public final class mt1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Map c;
    public final /* synthetic */ A20 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ tr1_0 i;

    public mt1_0(Map map2, A20 a20, Function1 function1, Function1 function12, Function1 function13, ib3_0 ib3_02, tr1_0 tr1_02) {
        this.c = map2;
        this.d = a20;
        this.e = function1;
        this.f = function12;
        this.g = function13;
        this.h = ib3_02;
        this.i = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (gk_0)object;
        Object object2 = (List)this.h.getValue();
        Object object3 = object.b();
        boolean bl2 = object2.contains(object3);
        float f5 = 0.0f;
        object3 = null;
        if (bl2) {
            Object object4;
            object2 = ((d)object.b()).f;
            Object object5 = this.c;
            if ((object2 = (Float)object5.get(object2)) != null) {
                f5 = ((Float)object2).floatValue();
            } else {
                object2 = ((d)object.b()).f;
                object4 = Float.valueOf(0.0f);
                object5.put(object2, object4);
            }
            object2 = ((d)object.a()).f;
            object4 = ((d)object.b()).f;
            bl2 = Intrinsics.areEqual(object2, object4);
            if (!bl2) {
                object2 = (Boolean)this.d.c.getValue();
                bl2 = (Boolean)object2;
                float f6 = 1.0f;
                f5 = !bl2 && !(bl2 = aU1.c((tr1_0)(object2 = this.i))) ? (f5 += f6) : (f5 -= f6);
            }
            object2 = Float.valueOf(f5);
            object4 = ((d)object.a()).f;
            object5.put(object4, object2);
            object5 = (yA0)this.e.invoke(object);
            object4 = (JE0)this.f.invoke(object);
            Function1 function1 = this.g;
            object = (W63)function1.invoke(object);
            object2 = new j70_0((yA0)object5, (JE0)object4, f5, (W63)object);
        } else {
            object = yA0.a;
            object2 = JE0.a;
            boolean bl3 = true;
            bk_0 bk_02 = bk_0.c;
            X63 x63 = new X63(bl3, bk_02);
            j70_0 j70_02 = new j70_0((yA0)object, (JE0)object2, 0.0f, x63);
            object2 = j70_02;
        }
        return object2;
    }
}

