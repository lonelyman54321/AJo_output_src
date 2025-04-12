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
 * Renamed from FH3
 */
public final class fh3_0
implements fs0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ BH3 b;
    public final /* synthetic */ DataCallback c;

    public fh3_0(String string2, BH3 bH3, DataCallback dataCallback) {
        this.a = string2;
        this.b = bH3;
        this.c = dataCallback;
    }

    public final Object emit(Object object, f80_0 object2) {
        ((Boolean)object).getClass();
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        object2 = "wishlist_state_enable";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = ih3_1.b;
            object2 = this.a;
            ((HashSet)object).remove(object2);
        }
        object = this.b.f;
        object2 = this.c;
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

