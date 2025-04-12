/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from CB1$a
 */
public final class cb1$a_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ OB1 b;
    public final /* synthetic */ i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ fb1_0 f;

    public cb1$a_0(OB1 oB1, i i3, int n3, int n4, fb1_0 fb1_02, f80_0 f80_02) {
        this.b = oB1;
        this.c = i3;
        this.d = n3;
        this.e = n4;
        this.f = fb1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.e;
        fb1_0 fb1_02 = this.f;
        OB1 oB1 = this.b;
        i i3 = this.c;
        int n4 = this.d;
        object = new cb1$a_0(oB1, i3, n4, n3, fb1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cb1$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cb1$a_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block4: {
            block5: {
                var2_2 = j90_0.COROUTINE_SUSPENDED;
                var3_3 = this.a;
                var4_4 = 1;
                if (var3_3 == 0) break block4;
                if (var3_3 != var4_4) break block5;
                vl2_2.b(var1_1);
                ** GOTO lbl34
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        do {
            var1_1 = CB1$a$a.$EnumSwitchMapping$0;
            var5_5 = this.b;
            var3_3 = var5_5.ordinal();
            var6_6 = var1_1[var3_3];
            var3_3 = this.d;
            if (var6_6 == var4_4 && (var6_6 = (var1_1 = this.c).isActive()) == 0) {
                var3_3 = this.e;
            }
            this.a = var4_4;
            var1_1 = this.f;
            var1_1.getClass();
            var7_7 = -1 >>> 1;
            if (var3_3 == var7_7) {
                var8_8 /* !! */  = new db1_0((fb1_0)var1_1, var3_3);
                var1_1 = Tg1.a(var8_8 /* !! */ , this);
            } else {
                var8_8 /* !! */  = new eb1_1((fb1_0)var1_1, var3_3);
                var1_1 = aQ1.a(this.getContext()).R(var8_8 /* !! */ , this);
            }
            if (var1_1 != var2_2) continue;
            return var2_2;
lbl34:
            // 2 sources

        } while ((var6_6 = (var1_1 = (Boolean)var1_1).booleanValue()) != false);
        return Unit.a;
    }
}

