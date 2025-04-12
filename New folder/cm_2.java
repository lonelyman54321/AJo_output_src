/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CartApiRepo;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from CM
 */
public final class cm_2
implements bx0_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ cm_2(Ref$ObjectRef ref$ObjectRef, String string2, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$ObjectRef;
        this.b = string2;
        this.c = ref$ObjectRef2;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        Ref$ObjectRef ref$ObjectRef = this.a;
        String string2 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.c;
        return CartApiRepo.a(ref$ObjectRef, string2, ref$ObjectRef2, (Throwable)object);
    }
}

