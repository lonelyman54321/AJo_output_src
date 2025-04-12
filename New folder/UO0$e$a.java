/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.sis.StoreMetaData;
import kotlin.Unit;

public final class UO0$e$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public UO0$e$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = ((DataCallback)(object = (DataCallback)object)).getStatus();
        if (n3 == 0) {
            object = (StoreMetaData)((DataCallback)object).getData();
            object2 = this.a;
            object2.getClass();
            if (object != null && (object2 = ((StoreMetaData)object).getData()) != null) {
                hu1_2.a = object = ((StoreMetaData)object).getData();
            }
        }
        return Unit.a;
    }
}

