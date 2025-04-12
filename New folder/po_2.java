/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartRepo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from PO
 */
public final class po_2
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ po_2(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2) {
        float f5 = ((Float)object).floatValue();
        object2 = (String)object2;
        return CartRepo.a(this.a, f5, (String)object2);
    }
}

