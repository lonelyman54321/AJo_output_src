/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from Ei
 */
public final class ei_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PopupLayout c;

    public ei_0(PopupLayout popupLayout, f80_0 f80_02) {
        this.c = popupLayout;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PopupLayout popupLayout = this.c;
        ei_0 ei_02 = new ei_0(popupLayout, f80_02);
        ei_02.b = object;
        return ei_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ei_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ei_0)object).invokeSuspend(object2);
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
                var5_5 = (i90_0)this.b;
                vl2_2.b(var1_1);
                ** GOTO lbl30
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var5_5 = var1_1 = (i90_0)this.b;
        while (var6_6 = d.d((i90_0)var5_5)) {
            this.b = var5_5;
            this.a = var4_4;
            var1_1 = this.getContext();
            var7_7 /* !! */  = (int[])Rg1$a.a;
            var1_1 = (rg1_1)var1_1.get((CoroutineContext$a)var7_7 /* !! */ );
            var7_7 /* !! */  = (int[])Ei$a.c;
            if (var1_1 == null) {
                var1_1 = aQ1.a(this.getContext()).R((Function1)var7_7 /* !! */ , this);
            } else {
                var9_9 = 0;
                var8_8 = new sg1_0((Function1)var7_7 /* !! */ , null);
                var1_1 = var1_1.v0();
            }
            if (var1_1 == var2_2) {
                return var2_2;
            }
lbl30:
            // 3 sources

            var1_1 = this.c;
            var7_7 /* !! */  = var1_1.A;
            var8_8 = null;
            var9_9 = var7_7 /* !! */ [0];
            var10_10 = var7_7 /* !! */ [var4_4];
            var11_11 = var1_1.l;
            var11_11.getLocationOnScreen(var7_7 /* !! */ );
            var12_12 = var7_7 /* !! */ [0];
            if (var9_9 == var12_12 && var10_10 == (var13_13 = var7_7 /* !! */ [var4_4])) continue;
            var1_1.j();
        }
        return Unit.a;
    }
}

