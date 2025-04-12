/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonExtensionKt$showAlignBottom$$inlined$balloon$1;
import com.skydoves.balloon.BalloonExtensionKt$showAlignTop$$inlined$balloon$1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from s32
 */
public final class s32_0
implements Runnable {
    public final /* synthetic */ t32_0 a;
    public final /* synthetic */ Balloon b;

    public /* synthetic */ s32_0(t32_0 t32_02, Balloon balloon2) {
        this.a = t32_02;
        this.b = balloon2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$balloon");
        object.getClass();
        Object[] objectArray = null;
        try {
            TextView textView = ((t32_0)object).f;
            String string2 = "balloon";
            String string3 = "<this>";
            if (textView != null) {
                Intrinsics.checkNotNullParameter(textView, string3);
                Intrinsics.checkNotNullParameter(object2, string2);
                BalloonExtensionKt$showAlignTop$$inlined$balloon$1 balloonExtensionKt$showAlignTop$$inlined$balloon$1 = new BalloonExtensionKt$showAlignTop$$inlined$balloon$1((Balloon)object2, (View)textView, 0, 0);
                textView.post((Runnable)balloonExtensionKt$showAlignTop$$inlined$balloon$1);
            }
            if ((object = ((t32_0)object).f) == null) return;
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object2, string2);
            BalloonExtensionKt$showAlignBottom$$inlined$balloon$1 balloonExtensionKt$showAlignBottom$$inlined$balloon$1 = new BalloonExtensionKt$showAlignBottom$$inlined$balloon$1((Balloon)object2, (View)object, 0, 0);
            object.post((Runnable)balloonExtensionKt$showAlignBottom$$inlined$balloon$1);
            return;
        }
        catch (NullPointerException nullPointerException) {
            object = yn3_0.a;
            object2 = "Exception while displaying balloon popup";
            objectArray = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray);
        }
    }
}

