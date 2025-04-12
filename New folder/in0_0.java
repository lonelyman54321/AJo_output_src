/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.core.view.ViewCompat$c;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from in0
 */
public final class in0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ Collection c;

    public in0_0(Collection collection) {
        this.c = collection;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        Iterable iterable = this.c;
        object = (View)object.getValue();
        object = ViewCompat$c.g((View)object);
        return CollectionsKt.F(iterable, object);
    }
}

