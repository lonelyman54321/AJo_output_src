/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jw2
 */
public final class jw2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidViewHolder c;

    public jw2_0(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (MotionEvent)object;
        int n3 = object.getActionMasked();
        AndroidViewHolder androidViewHolder = this.c;
        switch (n3) {
            default: {
                bl2 = androidViewHolder.dispatchGenericMotionEvent((MotionEvent)object);
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                bl2 = androidViewHolder.dispatchTouchEvent((MotionEvent)object);
            }
        }
        return bl2;
    }
}

