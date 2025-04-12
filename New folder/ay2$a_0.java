/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from aY2$a
 */
public final class ay2$a_0
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sQ1 d;
    public final /* synthetic */ KV e;
    public final /* synthetic */ Sj3 f;

    public ay2$a_0(sQ1 sQ12, KV kV, Sj3 sj3, f80_0 f80_02) {
        this.d = sQ12;
        this.e = kV;
        this.f = sj3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        KV kV = this.e;
        Sj3 sj3 = this.f;
        sQ1 sQ12 = this.d;
        ay2$a_0 ay2$a_0 = new ay2$a_0(sQ12, kV, sj3, f80_02);
        ay2$a_0.c = object;
        return ay2$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (ay2$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ay2$a_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        int n3;
        int n4;
        j90_0 j90_02;
        block8: {
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n7 = this.b;
            n4 = 3;
            n3 = 2;
            int n8 = 1;
            if (n7 != 0) {
                if (n7 != n8) {
                    if (n7 != n3 && n7 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    return Unit.a;
                }
                object2 = (ru_0)this.c;
                vl2_2.b(object);
            } else {
                vl2_2.b(object);
                object2 = object = this.c;
                this.c = object2 = (ru_0)object;
                this.b = n8;
                object = eY2.a((ru_0)object2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (mv2_0)object;
            int n10 = eY2.d((mv2_0)object);
            if (n10 != 0 && (n10 = ((mv2_0)object).c & 0x21) != 0) {
                List list = ((mv2_0)object).a;
                int n14 = list.size();
                for (int i3 = 0; i3 < n14; ++i3) {
                    aw2_0 aw2_02 = (aw2_0)list.get(i3);
                    int n15 = aw2_02.b() ^ n8;
                    if (n15 != 0) {
                        continue;
                    }
                    break block8;
                }
                this.c = null;
                this.b = n3;
                sQ1 sQ12 = this.d;
                KV kV = this.e;
                if ((object = eY2.b((ru_0)object2, sQ12, kV, (mv2_0)object, this)) != j90_02) return Unit.a;
                return j90_02;
            }
        }
        if ((n3 = (int)(eY2.d((mv2_0)object) ? 1 : 0)) != 0) return Unit.a;
        this.c = null;
        this.b = n4;
        Sj3 sj3 = this.f;
        if ((object = eY2.c((ru_0)object2, sj3, (mv2_0)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

