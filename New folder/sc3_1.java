/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
import android.util.SparseArray;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from SC3
 */
public final class sc3_1
extends Lambda
implements Function0 {
    public final /* synthetic */ ViewFactoryHolder c;

    public sc3_1(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(0);
    }

    public final Object invoke() {
        SparseArray sparseArray = new SparseArray();
        this.c.x.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}

