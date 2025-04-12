/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.compose.ui.platform.j;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from nJ3
 */
public final class nj3_0 {
    public static final ViewGroup.LayoutParams a;

    static {
        ViewGroup.LayoutParams layoutParams;
        int n3 = -2;
        a = layoutParams = new ViewGroup.LayoutParams(n3, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final j a(AbstractComposeView object, A30 a30, u10 object2) {
        CoroutineContext coroutineContext;
        void var1_1;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        int n4;
        Object object6;
        block9: {
            int n7;
            block8: {
                block7: {
                    object6 = i01.a;
                    n4 = 0;
                    object5 = null;
                    n3 = 1;
                    n7 = ((AtomicBoolean)object6).compareAndSet(false, n3 != 0);
                    object4 = null;
                    if (n7 != 0) {
                        n7 = 6;
                        object6 = sr_2.a(n3, n7, null);
                        object3 = d.a((CoroutineContext)AndroidUiDispatcher.l.getValue());
                        Object object7 = new g01_0((le_2)object6, null);
                        int n8 = 3;
                        Ae3.d((i90_0)object3, null, null, (Function2)object7, n8);
                        object3 = new h01_0((le_2)object6);
                        object6 = A83.c;
                        synchronized (object6) {
                            object7 = A83.i;
                            object7 = (Collection)object7;
                            A83.i = object3 = CollectionsKt.X((Collection)object7, object3);
                            object3 = Unit.a;
                        }
                        A83.a();
                    }
                    if ((n7 = object.getChildCount()) <= 0) break block7;
                    object6 = object.getChildAt(0);
                    n4 = object6 instanceof AndroidComposeView;
                    if (n4 == 0) break block8;
                    object6 = (AndroidComposeView)object6;
                    break block9;
                }
                object.removeAllViews();
            }
            n7 = 0;
            object6 = null;
        }
        if (object6 == null) {
            object5 = object.getContext();
            object3 = var1_1.i();
            object6 = new AndroidComposeView((Context)object5, (CoroutineContext)object3);
            object5 = ((AndroidComposeView)object6).getView();
            object3 = a;
            ((AbstractComposeView)((Object)object)).addView((View)object5, (ViewGroup.LayoutParams)object3);
        }
        object = ji1.a;
        object5 = ((AndroidComposeView)object6).getRoot();
        object = new ru3(object5);
        object5 = new F30((A30)var1_1, (ru3)object);
        object = ((AndroidComposeView)object6).getView();
        n3 = R$id.wrapped_composition_tag;
        if ((n3 = (object = object.getTag(n3)) instanceof j) != 0) {
            object4 = object;
            object4 = (j)object;
        }
        if (object4 == null) {
            object4 = new j((AndroidComposeView)object6, (z30_0)object5);
            object = ((AndroidComposeView)object6).getView();
            n4 = R$id.wrapped_composition_tag;
            object.setTag(n4, object4);
        }
        ((j)object4).e((Function2)((Object)coroutineContext));
        object = ((AndroidComposeView)object6).getCoroutineContext();
        coroutineContext = var1_1.i();
        boolean bl2 = Intrinsics.areEqual(object, coroutineContext);
        if (!bl2) {
            object = var1_1.i();
            ((AndroidComposeView)object6).setCoroutineContext((CoroutineContext)object);
        }
        return object4;
    }
}

