/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from AM
 */
public final class am_2
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ am_2(Ref$ObjectRef ref$ObjectRef, String string2, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$ObjectRef;
        this.b = string2;
        this.c = ref$ObjectRef2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (dl2_2)object;
        object2 = (dl2_2)object2;
        Ref$ObjectRef ref$ObjectRef = this.a;
        String string2 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.c;
        return CartApiRepo.b(ref$ObjectRef, string2, ref$ObjectRef2, (dl2_2)object, (dl2_2)object2);
    }
}

