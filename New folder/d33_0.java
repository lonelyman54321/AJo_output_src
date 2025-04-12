/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.stl.fragment.ShopTheLookFragment;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from D33
 */
public final class d33_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ShopTheLookFragment b;

    public d33_0(ShopTheLookFragment shopTheLookFragment, f80_0 f80_02) {
        this.b = shopTheLookFragment;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ShopTheLookFragment shopTheLookFragment = this.b;
        object = new d33_0(shopTheLookFragment, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = this.b;
            ee2_2 ee2_22 = ((ShopTheLookFragment)object).Ra().f;
            d33$a_0 d33$a_0 = new d33$a_0((ShopTheLookFragment)object);
            this.a = n4;
            object = ee2_22.a.collect(d33$a_0, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

