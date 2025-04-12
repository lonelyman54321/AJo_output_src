/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 */
import android.content.Context;
import android.graphics.Canvas;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.navigation.NavigationView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iU1
 */
public final class iu1_1
implements CanvasCompat$CanvasOperation,
yg3$c {
    public final /* synthetic */ Object a;

    public /* synthetic */ iu1_1(Object object) {
        this.a = object;
    }

    public yg3_1 a(yg3$b object) {
        Object object2 = "configuration";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Context context = (Context)this.a;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(context, (String)object3);
        Intrinsics.checkNotNullParameter(context, (String)object3);
        object3 = "callback";
        yg3$a yg3$a = ((yg3$b)object).c;
        Intrinsics.checkNotNullParameter(yg3$a, (String)object3);
        if (yg3$a != null) {
            int n3;
            object = ((yg3$b)object).b;
            if (object != null && (n3 = ((String)object).length()) != 0) {
                yg3$b yg3$b;
                boolean bl2 = true;
                object3 = yg3$b;
                yg3$b = new yg3$b(context, (String)object, yg3$a, bl2, bl2);
                Intrinsics.checkNotNullParameter(yg3$b, (String)object2);
                object3 = object2;
                object2 = new fx0_0(context, (String)object, yg3$a, bl2, bl2);
                return object2;
            }
            object2 = "Must set a non-null database name to a configuration that uses the no backup directory.".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "Must set a callback to create the configuration.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public void run(Canvas canvas) {
        NavigationView.a((NavigationView)this.a, canvas);
    }
}

