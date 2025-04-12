/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class wX1$a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wx1_1 c;
    public final /* synthetic */ ProductsList d;

    public wX1$a$a(wx1_1 wx1_12, ProductsList productsList, f80_0 f80_02) {
        this.c = wx1_12;
        this.d = productsList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.c;
        ProductsList productsList = this.d;
        wX1$a$a wX1$a$a = new wX1$a$a(wx1_12, productsList, f80_02);
        wX1$a$a.b = object;
        return wX1$a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (wX1$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wX1$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (fs0_2)this.b;
        Serializable serializable = this.c.a1.getProduct();
        if (serializable != null) {
            boolean bl2;
            Object object2;
            Object object3 = this.d;
            if (object3 != null) {
                object2 = ((ProductsList)object3).getProducts();
            } else {
                bl2 = false;
                object2 = null;
            }
            object2 = (Collection)object2;
            if (object2 != null && !(bl2 = object2.isEmpty())) {
                object3 = object3 != null ? ((ProductsList)object3).getProducts() : null;
                Intrinsics.checkNotNull(object3);
                object3 = object3.iterator();
                while (bl2 = object3.hasNext()) {
                    String string2;
                    int n7;
                    object2 = (Product)object3.next();
                    String string3 = ((Product)object2).getCode();
                    if (string3 != null && (string3 = ((Object)StringsKt.m0(string3)).toString()) != null && (n7 = string3.equalsIgnoreCase(string2 = (string2 = ((Product)serializable).getBaseProduct()) != null ? ((Object)StringsKt.m0(string2)).toString() : null)) == n4) {
                        ((Product)object2).setAddedToCart(false);
                        break;
                    }
                    string3 = ((Product)object2).getBaseProduct();
                    if (string3 != null && (string3 = ((Object)StringsKt.m0(string3)).toString()) != null && (n7 = (int)(string3.equalsIgnoreCase(string2 = (string2 = ((Product)serializable).getCode()) != null ? ((Object)StringsKt.m0(string2)).toString() : null) ? 1 : 0)) == n4) {
                        ((Product)object2).setAddedToCart(false);
                        break;
                    }
                    string3 = ((Product)object2).getCode();
                    if (string3 != null && (string3 = ((Object)StringsKt.m0(string3)).toString()) != null && (n7 = (int)(string3.equalsIgnoreCase(string2 = (string2 = ((Product)serializable).getCode()) != null ? ((Object)StringsKt.m0(string2)).toString() : null) ? 1 : 0)) == n4) {
                        ((Product)object2).setAddedToCart(false);
                        break;
                    }
                    string3 = ((Product)object2).getBaseProduct();
                    if (string3 == null || (string3 = ((Object)StringsKt.m0(string3)).toString()) == null || (n7 = (int)(string3.equalsIgnoreCase(string2 = (string2 = ((Product)serializable).getBaseProduct()) != null ? ((Object)StringsKt.m0(string2)).toString() : null) ? 1 : 0)) != n4) continue;
                    ((Product)object2).setAddedToCart(false);
                    break;
                }
            }
        }
        serializable = Boolean.TRUE;
        this.a = n4;
        if ((object = object.emit(serializable, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

