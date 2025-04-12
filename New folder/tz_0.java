/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Closet.ClosetComponentModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TZ
 */
public final class tz_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.b;
                object = (dl2_2)object;
                return UserRepo.f(string2, (dl2_2)object);
            }
            case 1: {
                object = (List)object;
                Object object2 = "this$0";
                Object object3 = (w23_0)this.b;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                n3 = (int)(object.isEmpty() ? 1 : 0);
                if (n3 != 0) {
                    object = new DataError();
                    object2 = new ArrayList();
                    DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
                    String string3 = "Unable to delete.";
                    dataError$ErrorMessage.setMessage(string3);
                    ((ArrayList)object2).add(dataError$ErrorMessage);
                    ((DataError)object).errors = object2;
                    object2 = ((w23_0)object3).j;
                    object3 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object3).onFailed((DataError)object);
                    ((LiveData)object2).i(object);
                } else {
                    object2 = ((w23_0)object3).j;
                    object3 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object3).onSuccess(object);
                    ((LiveData)object2).i(object);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        e00 e002 = (e00)this.b;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        Object object4 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (bl2 && (bl2 = w61_0.b((String)(object4 = e002.g)))) {
            object4 = e002.w;
            object = (ClosetComponentModel)((DataCallback)object).getData();
            e002.c((ArrayList)object4, (ClosetComponentModel)object);
        }
        return Unit.a;
    }
}

