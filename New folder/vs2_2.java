/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.PickFromStoreRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from vs2
 */
public final class vs2_2
implements Function1 {
    public final /* synthetic */ PickFromStoreRepo a;
    public final /* synthetic */ String b;

    public /* synthetic */ vs2_2(PickFromStoreRepo pickFromStoreRepo, String string2) {
        this.a = pickFromStoreRepo;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        String string2 = this.b;
        object = (dl2_2)object;
        return PickFromStoreRepo.b(this.a, string2, (dl2_2)object);
    }
}

