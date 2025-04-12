/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.GiftCardRepo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from w7
 */
public final class w7_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ x7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ HashMap d;

    public w7_0(x7 x72, boolean bl2, HashMap hashMap, f80_0 f80_02) {
        this.b = x72;
        this.c = bl2;
        this.d = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.c;
        HashMap hashMap = this.d;
        x7 x72 = this.b;
        object = new w7_0(x72, bl2, hashMap, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (w7_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((w7_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((x7)object).a;
            boolean bl2 = this.c;
            Object object3 = this.d;
            object2 = ((GiftCardRepo)object2).fetchGiftCardData(bl2, (HashMap)object3);
            w7$a w7$a = new w7$a((x7)object, null);
            object3 = new at0_1((es0_2)object2, w7$a);
            object2 = new w7$b((x7)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

