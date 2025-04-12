/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.Unit;
import kotlin.text.b;

public final class zX1$c
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;

    public zX1$c(wx1_1 wx1_12) {
        this.a = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (String)object;
        int n3 = ((String)object).length();
        Object object3 = this.a;
        if (n3 > 0) {
            ((wx1_1)object3).f((String)object);
        }
        ((wx1_1)object3).j1 = false;
        object = CartRepo.INSTANCE;
        boolean bl2 = ((CartRepo)object).isOOSimilarEnabled();
        if (bl2) {
            object = ((wx1_1)object3).T0.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                boolean bl3;
                String string2;
                object2 = ((CartEntry)object.next()).getSourceStoreId();
                n3 = (int)(b.i((String)object2, string2 = "luxe", bl3 = true) ? 1 : 0);
                if (n3 == 0) continue;
                ((wx1_1)object3).j1 = bl3;
                break;
            }
        }
        object = ((wx1_1)object3).x0;
        object2 = DataCallback.Companion;
        object3 = Boolean.TRUE;
        object2 = ((DataCallback$Companion)object2).onSuccess(object3);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

