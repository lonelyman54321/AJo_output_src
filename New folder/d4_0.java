/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from D4
 */
public final class d4_0
extends qg3_2
implements Function2 {
    public ArrayList a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ g4_0 d;

    public d4_0(List list, g4_0 g4_02, f80_0 f80_02) {
        this.c = list;
        this.d = g4_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        List list = this.c;
        g4_0 g4_02 = this.d;
        object = new d4_0(list, g4_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d4_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d4_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            object4 = this.a;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = new ArrayList();
            object3 = this.c;
            g4_0 g4_02 = this.d;
            object2 = new D4$a((List)object3, (ArrayList)object, g4_02, null);
            this.a = object;
            this.b = n4;
            object2 = be_1.c((Function2)object2, this);
            if (object2 == object4) {
                return object4;
            }
            object4 = object;
        }
        object = object4.iterator();
        boolean bl2 = false;
        object4 = null;
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (dl2_2)object.next();
            object3 = ((dl2_2)object2).a;
            boolean bl3 = ((cl2_2)object3).d();
            if (bl3 && (object2 = ((dl2_2)object2).b) != null) continue;
            bl2 = true;
        }
        if (bl2) {
            object = "Some of the product selected couldn't be added to bag";
            hv3_0.o0(n4, (String)object, null);
        }
        return Unit.a;
    }
}

