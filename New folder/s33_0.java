/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from S33
 */
public final class s33_0
extends qg3_2
implements Function2 {
    public Pair[] a;
    public i23_0 b;
    public Pair[] c;
    public String d;
    public int e;
    public final /* synthetic */ e43_0 f;
    public final /* synthetic */ String g;

    public s33_0(e43_0 e43_02, String string2, f80_0 f80_02) {
        this.f = e43_02;
        this.g = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.f;
        String string2 = this.g;
        object = new s33_0(e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (s33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((s33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            Pair[] pairArray;
            i23_0 i23_02;
            Pair[] pairArray2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                Pair[] pairArray3;
                int n7;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.e;
                            n7 = 1;
                            n3 = 2;
                            if (n4 == 0) break block2;
                            if (n4 == n7) break block3;
                            if (n4 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    pairArray2 = this.d;
                    pairArray3 = this.c;
                    i23_02 = this.b;
                    pairArray = this.a;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = this.f;
                i23_02 = ((e43_0)object).e;
                pairArray2 = new Pair[n7];
                this.a = pairArray2;
                this.b = i23_02;
                this.c = pairArray2;
                this.d = pairArray = "";
                this.e = n7;
                object2 = this.g;
                object = ((e43_0)object).e((String)object2, n7 != 0, this);
                if (object == j90_02) {
                    return j90_02;
                }
                pairArray3 = pairArray2;
                pairArray2 = pairArray;
                pairArray = pairArray3;
            }
            object = ((dl2_2)object).b;
            Intrinsics.checkNotNull(object);
            object = ((RecentlyViewedProducts)object).getProducts();
            pairArray3[0] = object2 = new Pair(pairArray2, object);
            object = fh1_2.h(pairArray);
            n4 = 0;
            pairArray2 = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = n3;
            object = i23_02.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

