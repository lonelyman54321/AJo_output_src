/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import java.util.HashSet;
import kotlin.Unit;

/*
 * Renamed from DH3
 */
public final class dh3_1
implements fs0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ BH3 b;
    public final /* synthetic */ DataCallback c;

    public dh3_1(String string2, BH3 bH3, DataCallback dataCallback) {
        this.a = string2;
        this.b = bH3;
        this.c = dataCallback;
    }

    public final Object emit(Object object, f80_0 object2) {
        ((Boolean)object).getClass();
        object = yn3_0.a;
        object2 = new Object[]{};
        String string2 = "add to db success";
        ((yn3$a)object).a(string2, object2);
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        object2 = "wishlist_state_enable";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = ih3_1.b;
            object2 = this.a;
            ((HashSet)object).add(object2);
        }
        object = this.b.e;
        object2 = this.c;
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

