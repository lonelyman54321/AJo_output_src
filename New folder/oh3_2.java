/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.R$id;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from oH3
 */
public final class oh3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ FF2 b;
    public final /* synthetic */ View c;

    public oh3_2(FF2 fF2, View view, f80_0 f80_02) {
        this.b = fF2;
        this.c = view;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        FF2 fF2 = this.b;
        View view = this.c;
        object = new oh3_2(fF2, view, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oh3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oh3_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        View view;
        FF2 fF2;
        Object object2;
        block10: {
            block9: {
                block11: {
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    int n3 = this.a;
                    int n4 = 1;
                    fF2 = this.b;
                    view = this.c;
                    if (n3 != 0) {
                        if (n3 != n4) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        try {
                            vl2_2.b(object);
                            break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    vl2_2.b(object);
                    {
                        this.a = n4;
                        object = fF2.r;
                        n4 = 2;
                        HF2 hF2 = new qg3_2(n4, null);
                        object = ms0_1.k((es0_2)object, hF2, this);
                        if (object == object2) break block11;
                    }
                    {
                        object = Unit.a;
                    }
                }
                if (object == object2) {
                    return object2;
                }
            }
            object = uh3_0.b(view);
            if (object == fF2) {
                int n7 = R$id.androidx_compose_ui_view_composition_context;
                view.setTag(n7, null);
            }
            return Unit.a;
        }
        object2 = uh3_0.b(view);
        if (object2 == fF2) {
            int n8 = R$id.androidx_compose_ui_view_composition_context;
            view.setTag(n8, null);
        }
        throw throwable2;
    }
}

