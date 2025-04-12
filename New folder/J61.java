/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.view.View
 */
import android.util.Pair;
import android.view.View;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;
import in.juspay.hypersdk.core.JsInterface;
import kotlin.jvm.internal.Intrinsics;

public final class J61
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ J61(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                je je2 = ((l$a)this.b).b.h;
                Object object = (Pair)this.c;
                int n4 = (Integer)object.first;
                object = (j$b)object.second;
                je2.l0(n4, (j$b)object);
                return;
            }
            case 1: {
                JsInterface jsInterface = (JsInterface)this.b;
                String string2 = (String)this.c;
                JsInterface.a(jsInterface, string2);
                return;
            }
            case 0: 
        }
        Object object = (dr0_0)this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        int n7 = 0;
        ((dr0_0)object).B0 = false;
        object = ((dr0_0)object).C0;
        Boolean bl2 = Boolean.FALSE;
        ((h83_0)object).setValue(bl2);
        object = (View)this.c;
        if (object != null) {
            n7 = 8;
            object.setVisibility(n7);
        }
    }
}

