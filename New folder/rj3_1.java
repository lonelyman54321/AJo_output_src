/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 */
import android.widget.SeekBar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from RJ3
 */
public final class rj3_1
implements F62 {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ rj3_1(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final void onChanged(Object object) {
        object = (Integer)object;
        Ref$ObjectRef ref$ObjectRef = this.a;
        String string2 = "$seekbar";
        Intrinsics.checkNotNullParameter(ref$ObjectRef, string2);
        ref$ObjectRef = (SeekBar)ref$ObjectRef.element;
        if (ref$ObjectRef != null) {
            int n3 = (Integer)object;
            ref$ObjectRef.setProgress(n3);
        }
    }
}

