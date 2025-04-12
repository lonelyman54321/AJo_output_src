/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 */
import android.widget.SeekBar;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

public final class x33
implements Runnable {
    public final /* synthetic */ b33_0 a;

    public /* synthetic */ x33(b33_0 b33_02) {
        this.a = b33_02;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((b33_0)object).v;
        SeekBar seekBar = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            object2 = null;
        }
        int n3 = 4;
        object2.setVisibility(n3);
        object2 = ((b33_0)object).w;
        if (object2 == null) {
            object2 = "imgVolume";
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            seekBar = object2;
        }
        seekBar.setVisibility(n3);
        ((b33_0)object).l.setVisibility(n3);
        ((b33_0)object).A(true);
        object = ((b33_0)object).d.g;
        object2 = Boolean.TRUE;
        ((LiveData)object).k(object2);
    }
}

