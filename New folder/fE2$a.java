/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import kotlin.Unit;

public final class fE2$a
implements fs0_2 {
    public final /* synthetic */ gE2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UploadImageAttributes c;

    public fE2$a(gE2 gE22, int n3, UploadImageAttributes uploadImageAttributes) {
        this.a = gE22;
        this.b = n3;
        this.c = uploadImageAttributes;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        object2 = this.a.f;
        int n3 = this.b;
        Integer n4 = new Integer(n3);
        String string2 = this.c.getId();
        xs3_0 xs3_02 = new xs3_0(n4, string2, object);
        ((LiveData)object2).k(xs3_02);
        return Unit.a;
    }
}

