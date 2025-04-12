/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import com.ril.ajio.data.repo.ImpsRepo;
import com.ril.ajio.launch.AdidIntentService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j5
 */
public final class j5_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j5_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return ImpsRepo.a((dl2_2)object);
            }
            case 0: 
        }
        object = (Boolean)object;
        Object[] objectArray = AdidIntentService.Companion;
        Intrinsics.checkNotNullParameter(object, "response");
        boolean bl2 = (Boolean)object;
        n3 = 0;
        objectArray = null;
        String string2 = "AdIdWorker";
        if (bl2) {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            string2 = "Ad Id successful";
            objectArray = new Object[]{};
            ((yn3$a)object).a(string2, objectArray);
            object = new c$a$c();
        } else {
            object = yn3_0.a;
            ((yn3$a)object).l(string2);
            string2 = "Ad Id failed : response is false";
            objectArray = new Object[]{};
            ((yn3$a)object).d(string2, objectArray);
            object = new c$a$a();
        }
        return object;
    }
}

