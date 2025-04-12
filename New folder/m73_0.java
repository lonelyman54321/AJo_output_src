/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from M73
 */
public final class m73_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ D73 b;
    public final /* synthetic */ P1 c;

    public m73_0(D73 d73, P1 p1, f80_0 f80_02) {
        this.b = d73;
        this.c = p1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        D73 d73 = this.b;
        P1 p1 = this.c;
        object = new m73_0(d73, p1, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (m73_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((m73_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        D73 d73 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            long l2;
            vl2_2.b(object);
            if (d73 == null) return Unit.a;
            object = d73.getDuration();
            String string2 = d73.a();
            if (string2 != null) {
                boolean bl2 = true;
            } else {
                boolean bl3 = false;
                string2 = null;
            }
            int[] nArray = O73$a.$EnumSwitchMapping$0;
            int n7 = ((Enum)object).ordinal();
            n7 = nArray[n7];
            if (n7 != n4) {
                int n8 = 2;
                if (n7 != n8) {
                    n8 = 3;
                    if (n7 != n8) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    l2 = 4000L;
                } else {
                    l2 = 10000L;
                }
            } else {
                l2 = Long.MAX_VALUE;
            }
            object = this.c;
            if (object != null) {
                void var3_6;
                l2 = object.a(l2, (boolean)var3_6);
            }
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        d73.dismiss();
        return Unit.a;
    }
}

